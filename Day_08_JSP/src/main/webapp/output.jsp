<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		List<String> cardData = (List<String>)session.getAttribute("userCard");
	
		for( String data : cardData ) {
			out.println(data );
		}
	%>

</body>
</html>