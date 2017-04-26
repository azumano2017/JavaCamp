package model;

import java.io.Serializable;

public class Rental implements Serializable{

	protected String id;
	protected String bookId;
	protected String userId;
	protected String rentalDate;
	protected String returnPlan;
	protected String returnDate;
	protected String situation;
	protected String memo;
	protected String title;


	public Rental(){}

	public String getId() {
		return id;
	}


	public String getBookId() {
		return bookId;
	}


	public String getUserId() {
		return userId;
	}


	public String getRentalDate() {
		return rentalDate;
	}

	public String getReturnPlan() {
		return returnPlan;
	}


	public String getReturnDate() {
		return returnDate;
	}


	public String getSituation() {
		return situation;
	}


	public String getMemo() {
		return memo;
	}

	public String getTitle() {
		return title;
	}


	public void setId(String id) {
		this.id = id;
	}

	public void setBookId(String value) {
		this.bookId = value;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}


	public void setRentalDate(String rentalDate) {
		this.rentalDate = rentalDate;
	}


	public void setReturnPlan(String returnPlan) {
		this.returnPlan = returnPlan;
	}


	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}


	public void setSituation(String situation) {
		this.situation = situation;
	}


	public void setMemo(String memo) {
		this.memo = memo;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
