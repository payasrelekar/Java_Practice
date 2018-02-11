<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="https://github.com/bhagvatbhosle/Java_Practice"
		method="post">
		<%
			out.print("Hello ");
		%>
		<%
			String name = request.getParameter("uname");
			out.print("username is :" + name);
		%>
		<input type="submit" name="Go" value="Go">
	</form>
</body>
</html>