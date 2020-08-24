package com.germanv73.app;

public class Publisher {
	
	private String publisherName;
	private String state;

	public Publisher(String publisherName, String state) {
		this.publisherName = publisherName;
		this.state = state;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Publisher createPublisher(String publisherName, String state) {
		return new Publisher(publisherName, state);
	}

	@Override
	public String toString() {
		return "Publisher [publisherName=" + publisherName + ", state=" + state + "]";
	}

}
