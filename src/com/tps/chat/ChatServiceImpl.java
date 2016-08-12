package com.tps.chat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChatServiceImpl implements ChatService{

	private List<User> users =  new ArrayList<User>();
	
	public ChatServiceImpl()
	{
		User user1 = new User(1, "Varun", "bng");
		User user2 = new User(2,"XYZ", "LKO");
		User user3 = new User(3,"sdf" , "delhi");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
	}

	@Override
	public List<User> getUserByName(String name) {

		List<User> resultList  = new ArrayList<User>();
		
		Iterator<User> itrUser = users.iterator();
		
		while (itrUser.hasNext()) {
			User user = (User) itrUser.next();
			
			if(user.getName().equalsIgnoreCase(name))
			{
				resultList.add(user);
			}
		}
		
		return resultList;
	}

	@Override
	public void addUser(User user1) {

		users.add(user1);
		
	}
	
}
