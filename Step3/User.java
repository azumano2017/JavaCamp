package model;

import java.io.Serializable;

public class User implements Serializable{

	protected String userId;
	protected String name;
	protected String furigana;
	protected String zipCode;
	protected String address;
	protected String tel;
	protected String mobilePhone;
	protected String email;
	protected String dateOfBirth;
	protected String gender;
	protected String pass;
	protected String dataCreatedDate;


	public User(){}

	public String getUserId() {
		return userId;
	}


	public String getName() {
		return name;
	}


	public String getFurigana() {
		return furigana;
	}


	public String getZipCode() {
		return zipCode;
	}


	public String getAddress() {
		return address;
	}


	public String getTel() {
		return tel;
	}


	public String getMobilePhone() {
		return mobilePhone;
	}


	public String getEmail() {
		return email;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public String getGender() {
		return gender;
	}


	public String getPass() {
		return pass;
	}


	public String getDataCreatedDate() {
		return dataCreatedDate;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setFurigana(String furigana) {
		this.furigana = furigana;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public void setDataCreatedDate(String dataCreatedDate) {
		this.dataCreatedDate = dataCreatedDate;
	}


}
