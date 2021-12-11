package com.example.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Ticket;
import com.example.Entity.User;
import com.example.Services.TicketService;
import com.example.Services.UserService;

@RestController
@RequestMapping(path = "/api")

public class UserController {
	
	@Autowired
	private UserService service;
	
	
	@PostMapping(path = "/Register")
	public User addUser(@RequestBody User user) {
		return this.service.addUser(user);
	}
	
	@GetMapping(path = "/user")
	public List<User> getAll() {
		return this.service.getAll();
	}

	@GetMapping(path = "/user/{id}")
	public User getById(@PathVariable("id") Long id) {
		return this.service.getById(id);
	}


}
