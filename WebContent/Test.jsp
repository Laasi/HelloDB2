<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.hello.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>hello world  OSI NAgeswar SSE</title>
</head>
<body>
<%Test obj = new Test();     
Employee emp = obj.getEmployee(); 
out.println("user is"+emp.getUser());
out.println("pwd is"+emp.getPwd());
%>
</body>
</html>