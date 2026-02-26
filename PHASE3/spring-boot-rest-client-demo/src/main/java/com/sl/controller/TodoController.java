package com.sl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestClient;

import com.sl.entity.Todo;


@Controller
@RequestMapping("todos")
public class TodoController {
	
	@Autowired
	RestClient restClientTodos;
	
	@GetMapping("/list")	
	public String listTodos(Model model) {
		
		List<Todo> todos = restClientTodos
		.get()
		.uri("/todos")
		.retrieve()
		.body(new ParameterizedTypeReference<List<Todo>>() {});
		
		model.addAttribute("todos", todos);
		
		return "list"; // WEB-INF/views/list.jsp
	}

}
