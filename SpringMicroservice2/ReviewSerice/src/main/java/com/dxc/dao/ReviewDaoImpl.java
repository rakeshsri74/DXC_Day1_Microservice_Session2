package com.dxc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dxc.model.Review;

@Repository
public class ReviewDaoImpl implements ReviewDao {

	private static List<Review> review = new ArrayList<>();
	
	static {
		review.add(new Review("DDLG is good romantic movie"));
		review.add(new Review("The Kerala Story is controversial movie"));
	}
	@Override
	public List<Review> getReview() {
		// TODO Auto-generated method stub
		return review;
	}

}
