package com.germanv73.app;

import java.util.ArrayList;

public class BookTracker {
	
	private String readersName;
	private ArrayList<Book> bookList;

	public BookTracker(String readersName) {

		this.readersName = readersName;
		this.bookList = new ArrayList<Book>();
	}

	public String getReadersName() {
		return readersName;
	}

	public void setReadersName(String readersName) {
		this.readersName = readersName;
	}

	public ArrayList<Book> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return "BookTracker [readersName=" + readersName + ", bookList=" + bookList + "]";
	}

	public void addBook(String title) {
		Book newBook = new Book(title);
		bookList.add(newBook);
	}

	public void addBook(String title, Author author, Publisher publisher, int pages) {
		 Book newBook = new Book(title, author, publisher, pages);
		 bookList.add(newBook);
	}

	public void printBookTitles() {
		if (bookList.size()>0) {
			for (int i=0; i<bookList.size(); i++) {
				System.out.printf("%d. %s%n", (i+1), bookList.get(i).getTitle());
			}
		} else
			System.out.println("There are no saved books.");
		System.out.println();
	}
	
	public boolean findBook(String bookName) {
		boolean result = false;
		for (int i=0; i<bookList.size(); i++) {
			if (bookList.get(i).getTitle().equals(bookName)) {
				result = true;
			}
		}
		return result;
	}
//	public boolean queryBook(int number) {
//		if (bookList.get(number - 1).getTitle() != null) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}

}
