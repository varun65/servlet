<%@page import="com.tps.chat.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		List<User> searchedUsers = (List<User>) request
				.getAttribute("users");
	%>

	<%
		if (searchedUsers.isEmpty()) {
               String msg = "match not found";
		
	%>
		<%= msg%>
	<% 	}
		else {
           for(User user:searchedUsers)
           {
     %>
     <%=user.getName() %>
     <%   	   
           }
		}
	 %>
</body>
</html>