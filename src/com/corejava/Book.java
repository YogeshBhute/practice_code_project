package com.corejava;

public class Book {

	private String bookName;
	private int bookId;
	private String bookAuther;

	public Book() {
		super();
	}

	public Book(String bookName, int bookId, String bookAuther) {
		this.bookName = bookName;
		this.bookId = bookId;
		this.bookAuther = bookAuther;
	}

	@Override
	public String toString() {
		return "Book [Book Name=" + bookName + ", Book Id=" + bookId + ", Book Auther=" + bookAuther + "]";
	}

	protected String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookAuther() {
		return bookAuther;
	}

	public void setBookAuther(String bookAuther) {
		this.bookAuther = bookAuther;
	}

}
