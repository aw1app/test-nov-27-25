package com.sl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestClient;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sl.entity.Todo;

@Controller
@RequestMapping("todos")
public class TodoController {

	@Autowired
	RestClient restClientTodos;

	@GetMapping("/list")
	public String listTodos(Model model) {

		List<Todo> todos = restClientTodos.get().uri("/todos").retrieve()
				.body(new ParameterizedTypeReference<List<Todo>>() {} );

		model.addAttribute("todos", todos);

		return "list"; // WEB-INF/views/list.jsp
	}

	// Task -24 : Implement fetching and displaying a single todo

	// Task -25 : Implement deleting a single todo
	// Delete method
	@GetMapping("/delete-todo/{id}")
	public String deleteTodo(@PathVariable int id, RedirectAttributes redirectAttributes) {
		restClientTodos.delete().uri("/todos/{id}", id).retrieve().toBodilessEntity();

		// Add a flash message for the user
		redirectAttributes.addFlashAttribute("message", "Todo #" + id + " deleted successfully (simulated)!");

		// return to the list page
		return "redirect:/todos/list";
	}

}
