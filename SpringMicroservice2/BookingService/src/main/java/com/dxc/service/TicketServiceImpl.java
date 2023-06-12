package com.dxc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.dao.TicketDao;
import com.dxc.model.Ticket;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketDao dao;
	
	@Override
	public List<Ticket> showTicket() {
		// TODO Auto-generated method stub
		return dao.showTicket();
	}

}
