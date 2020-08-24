package com.germanv73.app;

public class Book {
	
	private String title;
	private Author author;
	private Publisher publisher;
	private int numberOfPages;

	public Book(String title) {
		this.title = title;
	}

	public Book(String title, Author author, Publisher publisher, int numberOfPages) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.numberOfPages = numberOfPages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", numberOfPages="
				+ numberOfPages + "]";
	}

}
