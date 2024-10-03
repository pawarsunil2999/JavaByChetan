<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>This is product.html</h1>
	<% 
		List<String> list = (List<String>)session.getAttribute("names");
		for( String name : list ) {
			out.println(name);
		}
	%>
</body>
</html>