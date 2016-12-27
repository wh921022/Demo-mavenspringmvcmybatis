<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/bots.css">
<title>Maven</title>
</head>
<body>
<table class="table table-bordered table-hover">
<c:forEach var="s" items="${list }">

<tr><td>${s.id }</td><td>${s.name } </td><td>${s.sex } </td></tr>
</c:forEach>
</table>
</body>
</html>