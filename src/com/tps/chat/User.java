package com.tps.chat;

public class User {

	private long userId;
	private String name;
	String location;
	
	public User()
	{
		
	}
	
	public User(long userId , String name , String location)
	{
		super();
		this.userId = userId;
		this.name= name;
		this.location = location;
	}
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}
