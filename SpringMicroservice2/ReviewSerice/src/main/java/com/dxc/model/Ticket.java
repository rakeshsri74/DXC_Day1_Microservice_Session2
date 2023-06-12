package com.dxc.model;

public class Ticket {

	private String customerId;
	private String showTime;
	private String title;
	private int noOfSeat;
	private int price;
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(String customerId, String showTime, String title, int noOfSeat, int price) {
		super();
		this.customerId = customerId;
		this.showTime = showTime;
		this.title = title;
		this.noOfSeat = noOfSeat;
		this.price = price;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNoOfSeat() {
		return noOfSeat;
	}
	public void setNoOfSeat(int noOfSeat) {
		this.noOfSeat = noOfSeat;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Ticket [customerId=" + customerId + ", showTime=" + showTime + ", title=" + title + ", noOfSeat="
				+ noOfSeat + ", price=" + price + "]";
	}
	
	
}
