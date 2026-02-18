package com.sl.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Configuration
public class AppConfig {

//	@Bean
//	public UrlBasedViewResolver resolver() {
//		UrlBasedViewResolver r = new UrlBasedViewResolver();
//		r.setViewClass(JstlView.class);
//		r.setPrefix("/WEB-INF/views/");
//		r.setSuffix(".jsp");
//		return r;
//	}

	@Bean
	public InternalResourceViewResolver jspResolver() {
		return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
	}

	// JSON view
	@Bean
	public MappingJackson2JsonView jsonView() {
		return new MappingJackson2JsonView();
	}

	// Content negotiating resolver
	@Bean
	public ContentNegotiatingViewResolver resolver() {

		ContentNegotiatingViewResolver r = new ContentNegotiatingViewResolver();

		r.setDefaultViews(List.of(jsonView()));

		return r;
	}
}
