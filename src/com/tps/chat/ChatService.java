package com.tps.chat;
import java.util.List;


public interface ChatService {

	public List<User> getUserByName(String name);

	public void addUser(User user1);
	
}
