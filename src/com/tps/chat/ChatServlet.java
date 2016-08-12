package com.tps.chat;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChatServlet
 */
@WebServlet({"/Search","/addUser"})
public class ChatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ChatService chatService = null; 
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChatServlet() {
        super();
        chatService = new ChatServiceImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
         processRequest(request,response);		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		doGet(request, response);
	}

	private void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getRequestURI().endsWith("Search"))
		{
			String user = request.getParameter("user");
			System.out.println("Searching for user" + user);
	        List<User> searchedUsers = chatService.getUserByName(user);
	        
	         request.setAttribute("users", searchedUsers);
	         RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
	         rd.forward(request, response);
		}
		else
			if(request.getRequestURI().endsWith("addUser"))
			{
				System.out.println("Add new user");
				String name = request.getParameter("name");
				String location = request.getParameter("location");

				User user1 = new User();
				user1.setName(name);
				user1.setLocation(location);
				
				chatService.addUser(user1);
			}
	}
}
