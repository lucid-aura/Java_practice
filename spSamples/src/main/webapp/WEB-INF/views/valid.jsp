<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <%

	int result = (int)request.getAttribute("result");
	if (result == 1){
		response.sendRedirect("login.do");	
	}
	else {
		response.sendRedirect("register.do");
	}
	
%>