package com.manish.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manish.binding.Passanger;
import com.manish.binding.Ticket;
import com.manish.service.TicketService;

@RestController
public class TicketController {

	@Autowired
	private TicketService service;
	
	@PostMapping("/ticket")
	public  ResponseEntity<Ticket> bookTicket(@RequestBody Passanger p) {
		Ticket bookTicket = service.bookTicket(p);
		return new ResponseEntity<Ticket>(bookTicket, HttpStatus.CREATED);
	}
	
	@GetMapping("/get")
	public ResponseEntity<Collection<Ticket>> getAllTicket(){
		Collection<Ticket> allTicket = service.getAllTicket();
		return new ResponseEntity<Collection<Ticket>>(allTicket, HttpStatus.OK);
	}
	

}
