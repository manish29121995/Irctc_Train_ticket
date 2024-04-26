package com.manish.service;

import java.util.Collection;

import com.manish.binding.Passanger;
import com.manish.binding.Ticket;

public interface TicketService {

	public Ticket bookTicket(Passanger passanger);
	
	public Collection<Ticket> getAllTicket();
	
}
