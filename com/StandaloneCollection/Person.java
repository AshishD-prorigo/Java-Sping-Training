package com.StandaloneCollection;

import java.util.List;
import java.util.Map;

public class Person {
	
	private List<String> friends;
	private Map<String, Integer> course;

	public Map<String, Integer> getCourse() {
		return course;
	}

	public void setCourse(Map<String, Integer> course) {
		this.course = course;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", course=" + course + "]";
	}

//	@Override
//	public String toString() {
//		return "Person [friends=" + friends + "]";
//	}
	
	

}
