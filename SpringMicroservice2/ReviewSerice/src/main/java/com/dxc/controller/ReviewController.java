package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dxc.model.Review;
import com.dxc.model.Ticket;
import com.dxc.service.ReviewService;

@RestController
public class ReviewController {

	@Autowired
	private ReviewService service;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/review")
	public List<Review> getReview() {
		return service.getReview();
	}
	
	@GetMapping("/review/ticket")
	public List<Ticket> getTicketService(){
		List<Ticket> ticket = null;
		
		String url = "http://localhost:8090/ticket";
		
		try {
			ticket = restTemplate.getForObject(url,List.class);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return ticket;
	}
}
