package com.manish.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.manish.binding.Passanger;
import com.manish.binding.Ticket;
@Service
public class TicketServiceImpl implements TicketService{
  
	Map<Integer, Ticket> map = new HashMap<>();
	
	@Override
	public Ticket bookTicket(Passanger passanger) {
		Ticket ticket = new Ticket();
		Random random = new Random();
		int id = random.nextInt(20);
		ticket.setTicketNum(id);
		
		BeanUtils.copyProperties(passanger, ticket);
		ticket.setStatus("Confirmed");
		map.put(id, ticket);
		
		return ticket;
	}

	@Override
	public Collection<Ticket> getAllTicket() {
		
		return map.values();
	}



}
