<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>You have visited <a href="localhost:8080/your_server">http://your_sever</a>   ${count }  Times</p>
	<a href="/your_server">Test another visit?</a>
	<a href="/reset">Reset</a>
	
</body>
</html>