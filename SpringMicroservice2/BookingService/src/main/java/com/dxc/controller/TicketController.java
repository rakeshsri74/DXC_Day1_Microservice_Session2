package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.model.Ticket;
import com.dxc.service.TicketService;

@RestController
public class TicketController {

	@Autowired
	private TicketService service;
	
	@GetMapping("/ticket")
	public List<Ticket> getTicket() {
		return service.showTicket();
	}
}
