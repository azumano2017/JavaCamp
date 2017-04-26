package model;

import java.io.Serializable;

public class Book implements Serializable{

	protected String bookId;
	protected String title;
	protected String author;
	protected String translator;
	protected String publisher;
	protected String publicationDate;
	protected String code;
	protected String status;
	protected String keyword;
	protected String memo;
	protected String detaCreator;
	protected String dataCreatedData;



	public Book(){}


	public String getBookId() {
		return bookId;
	}
	public void setBookId(String value) {
		bookId = value;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String value) {
		this.title = value;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String value) {
		author = value;
	}
	public String getTranslator() {
	return translator;
	}
	public void setTranslator(String value) {
		translator = value;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String value) {
		publisher = value;
	}
	public String getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(String value) {
		publicationDate = value;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String value) {
		code = value;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String value) {
		status = value;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String value) {
		keyword = value;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String value) {
		memo = value;
	}
	public String getDataCreator() {
		return detaCreator;
	}
	public void setDataCreator(String value) {
		detaCreator = value;
	}
	public String getDataCreatedDate() {
		return dataCreatedData;
	}
	public void setDataCreatedDate(String dataCreatedDate) {
		this.dataCreatedData = dataCreatedDate;
	}
}
