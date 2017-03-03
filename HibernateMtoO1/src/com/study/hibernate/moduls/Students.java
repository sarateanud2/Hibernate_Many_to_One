package com.study.hibernate.moduls;

public class Students {
	
	private int id;
	private String name;
	private String lname;
	private int mark;
	private Address address;
	
	public Students() {
		super();
	}

	public Students(String name, String lname, int mark, Address address) {
		super();
		this.name = name;
		this.lname = lname;
		this.mark = mark;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
