<%--1. 지시자 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>첫번째 JSP</title>
</head>
<body>
<%--2. comment tag --%>
<%--3. 선언부 --%>
<%! private static final String DEFAULT_NAME="Guest"; %>
<%--4. Scriptlet tag 스크립틀릿 --%>
<%
	// 자바 코드를 그대로 작성
	String name = request.getParameter("name"); 
	if(name==null)name = DEFAULT_NAME;
	//out.println("<h1>Hello, " + name + "</h1>");
%>
	<%-- 5. 표현식 --%>
	<h1>Hello,<%=name %></h1>
</body>
</html>