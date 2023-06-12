package com.dxc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dxc.model.Ticket;

@Repository
public class TicketDaoImpl  implements TicketDao{

	private static List<Ticket> ticket = new ArrayList<>();
	
	static {
		ticket.add(new Ticket("a001","9to12","DDLG",2,1000));
		ticket.add(new Ticket("a002","12to3","The Kerala Story",3,1500));
	}
	
	@Override
	public List<Ticket> showTicket() {
		// TODO Auto-generated method stub
		return ticket;
	}

}
