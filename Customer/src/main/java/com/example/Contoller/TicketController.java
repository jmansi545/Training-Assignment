package com.example.Contoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Ticket;
import com.example.Services.TicketService;

@RestController
@RequestMapping(path = "/api")

public class TicketController {

	@Autowired
	private TicketService service;

	@GetMapping(path = "/customerTicket")
	public List<Ticket> getAll() {
		return this.service.getAll();
	}

	@GetMapping(path = "/customerTicket/{userid}")
	public List<Ticket> getById(@PathVariable("userid") Long id) {
		return service.getById(id);
	}

	@PostMapping(path = "/ticket/{userid}")
	public Ticket addTicket(@RequestBody Ticket ticket, @PathVariable("userid") Long userid) {
		return this.service.addTicket(ticket,userid);
}
	

}
