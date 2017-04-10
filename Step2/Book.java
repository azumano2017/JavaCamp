package library;

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






	protected String getBookId() {
		return bookId;
	}
	protected void setBookId(String value) {
		bookId = value;
	}
	protected String getTitle() {
		return title;
	}
	protected void setTitle(String value) {
		this.title = value;
	}
	protected String getAuthor() {
		return author;
	}
	protected void setAuthor(String value) {
		author = value;
	}
	protected String getTranslator() {
	return translator;
	}
	protected void setTranslator(String value) {
		translator = value;
	}
	protected String getPublisher() {
		return publisher;
	}
	protected void setPublisher(String value) {
		publisher = value;
	}
	protected String getPublicationDate() {
		return publicationDate;
	}
	protected void setPublicationDate(String value) {
		publicationDate = value;
	}
	protected String getCode() {
		return code;
	}
	protected void setCode(String value) {
		code = value;
	}
	protected String getStatus() {
		return status;
	}
	protected void setStatus(String value) {
		status = value;
	}
	protected String getKeyword() {
		return keyword;
	}
	protected void setKeyword(String value) {
		keyword = value;
	}
	protected String getMemo() {
		return memo;
	}
	protected void setMemo(String value) {
		memo = value;
	}
	protected String getDataCreator() {
		return detaCreator;
	}
	protected void setDataCreator(String value) {
		detaCreator = value;
	}
	protected String getDataCreatedDate() {
		return dataCreatedData;
	}
	protected void setDataCreatedDate(String dataCreatedDate) {
		this.dataCreatedData = dataCreatedDate;
	}
}
