package com.Collection;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public class Employee {
	
	private String name;
	private List<String> mo_no;
	private Set<String> address;
	private SortedMap<String, String> courses;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, List<String> mo_no, Set<String> address, SortedMap<String, String> courses) {
		super();
		this.name = name;
		this.mo_no = mo_no;
		this.address = address;
		this.courses = courses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getMo_no() {
		return mo_no;
	}
	public void setMo_no(List<String> mo_no) {
		this.mo_no = mo_no;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public SortedMap<String, String> getCourses() {
		return courses;
	}
	public void setCourses(SortedMap<String, String> courses) {
		this.courses = courses;
	}
	
	

}
