package com.dxc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.dao.ReviewDao;
import com.dxc.model.Review;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	private ReviewDao dao;
	
	@Override
	public List<Review> getReview() {
		// TODO Auto-generated method stub
		return dao.getReview();
	}

}
