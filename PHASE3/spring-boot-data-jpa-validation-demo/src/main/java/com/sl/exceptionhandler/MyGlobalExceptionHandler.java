package com.sl.exceptionhandler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


// Exception Handler for entire project
@ControllerAdvice
public class MyGlobalExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public String handleException(Exception ex, Model model) {
		System.out.println("INSIDE handleException of MyGlobalExceptionHandler class");
		
		model.addAttribute("errorMessage", ex.getMessage());
		
		return "error-page";
	}
	
	// handle specific one
	@ExceptionHandler(RuntimeException.class)
	public String handleRTException(Exception ex, Model model) {
		System.out.println("INSIDE handleRTException of MyGlobalExceptionHandler class ");
		
		model.addAttribute("errorMessage", ex.getMessage());
		
		return "error-page";
	}

}
