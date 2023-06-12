package com.dxc.model;

public class Review {

	private String review;

	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Review(String review) {
		super();
		this.review = review;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "Review [review=" + review + "]";
	}
	
	
}
