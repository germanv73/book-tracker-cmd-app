package com.germanv73.app;

import java.util.Scanner;

public class BookTrackerApp {
	
	private static Scanner scanner = new Scanner(System.in);
	private static BookTracker bookTracker;

	public static void main(String[] args) {

		System.out.print("Welcome to the Book Tracker app.\n" +
							"Please enter your first name for a more personal experience: ");
		String userName = scanner.nextLine();
		bookTracker = new BookTracker(userName);
		System.out.println();

		System.out.printf("Welcome, %s!%n%n", bookTracker.getReadersName());

		boolean appOn = true;

		while(appOn) {
			System.out.print("Please enter an option or 9 to list all options: ");
			int userInput = scanner.nextInt();
			scanner.nextLine();
			System.out.println();

			switch (userInput) {
				case 1:
					bookTracker.printBookTitles();
					break;
				case 2:
					enterBook();
					break;
				case 3:
					editBook();
					break;
				case 4:
					removeBook();
					break;
				case 5:
					bookTracker.printBookTitles();
					break;
				case 9:
					printOptions();
					break;
				case 0:
					System.out.println("\nGoodbye, " + bookTracker.getReadersName());
					appOn = false;
					break;
			}
		}

		System.out.println("Application shutting down...");

	}

	private static void printBookAndPages() {
		System.out.println("Books and pages.");

	}

	private static void removeBook() {
		System.out.println("Removed book.");

	}

	private static void editBook() {
//		bookTracker.printBookTitles();
//		System.out.print("Enter book number you want to edit: ");
//		int bookToEdit = scanner.nextInt();
//		scanner.nextLine();
//
//		if (bookTracker.queryBook(bookToEdit)) {
//			System.out.println("book exists");
//		}
//		else {
//			System.out.println("book doesn't exist");
//		}

	}

	private static void enterBook() {
		System.out.println("1. Enter book title only\n" +
						   "2. Enter book title, author, publisher, pages\n");
		System.out.print("Choose an option: ");
		int userInput = scanner.nextInt();
		scanner.nextLine();

		if (userInput == 1) {
			System.out.print("Enter book title: ");
			String bookName = scanner.nextLine();

			bookTracker.addBook(bookName);

			System.out.println("\n" + bookName + " has been added.\n");
		} else if (userInput == 2) {
			System.out.print("Enter book title: ");
			String bookName = scanner.nextLine();

			System.out.print("Enter author's first name: ");
			String authFirstName = scanner.nextLine();

			System.out.print("Enter author's last name: ");
			String authLastName = scanner.nextLine();

			Author author = new Author(authFirstName, authLastName);

			System.out.print("Enter publisher: ");
			String publisherName = scanner.nextLine();

			System.out.print("Enter publisher's two letter state (ex: TX, CA, etc.): ");
			String publisherState = scanner.nextLine();

			Publisher publisher = new Publisher(publisherName, publisherState);

			System.out.print("Enter total pages: ");
			int pages = scanner.nextInt();
			scanner.nextLine();

			bookTracker.addBook(bookName, author, publisher, pages);

			System.out.println("\n" + bookName + " has been added.\n");
		} else
			System.out.println("Invalid option entered...");
	}

	private static void printOptions() {
		System.out.println("1. Print list of books\n" +
						   "2. Enter a new book\n" +
						   "3. Edit a book\n" +
						   "4. Remove a book\n" +
						   "5. Print list of books and total number of pages\n" +
						   "0. Exit application\n");

	}


}
