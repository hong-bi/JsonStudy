
<%@page import="java.io.BufferedReader"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<%
	//Test04_ok.jsp
	
	StringBuffer sb = new StringBuffer();
	BufferedReader reader = request.getReader();
	String line;
	while((line=reader.readLine()) != null)
	{
		sb.append(line);
		
	}
%>
<%=sb.toString() %>