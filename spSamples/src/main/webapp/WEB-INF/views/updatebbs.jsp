<%@page import="mul.camp.a.dto.BbsDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
BbsDto bbs = (BbsDto)request.getAttribute("bbs");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>글수정</h1>

<div align="center">
<form action="updatebbsAf.do" method="post">
<input type="hidden" name="seq" value="<%=bbs.getSeq()%>">
<table style="width: 1000px" border="1">
<tr>
	<th>아이디</th>
	<td>
		<input type="text" name="id" size="70px" value="<%=bbs.getId() %>" readonly>
	</td>
</tr>
<tr>
	<th>제목</th>
	<td>
		<input type="text" name="title" size="70px" value="<%=bbs.getTitle() %>">
	</td>
</tr>
<tr>
	<th>내용</th>
	<td>
		<textarea rows="20" cols="80" name="content" ><%=bbs.getContent() %></textarea>
	</td>
</tr>
<tr>
	<td colspan="2">
		<input type="submit" value="수정하기">
	</td>
</tr>
</table>

</form>

</div>

</body>
</html>