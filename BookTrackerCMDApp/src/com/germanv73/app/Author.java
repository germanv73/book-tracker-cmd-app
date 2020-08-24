package com.germanv73.app;

public class Author {
	
	private String firstName;
	private String lastName;

	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Author(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Author createAuthor(String lastName) {
		return new Author(lastName);
	}

	public Author createAuthor(String firstName, String lastName) {
		return new Author(firstName, lastName);
	}

	@Override
	public String toString() {
		return "Author [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
