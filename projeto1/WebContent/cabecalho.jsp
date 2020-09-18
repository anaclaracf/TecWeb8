<%@ page language="java" contentType="text/html"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page import="java.util.*, br.edu.insper.*" %>
<html>
<head>
<meta charset="UTF-8">
<title>Lista Pessoas</title>
</head>
<body>
<table border="1">
<tr><td><b>#</b></td>
<td><b>nome</b></td>
<td><b>altura</b></td>
</tr>
<c:forEach var="pessoa" items="${pessoas}" varStatus="id">
<tr bgcolor="#${id.count%2 == 0 ? 'bbffcc' : 'ffffbb' }" >
<td>${id.count}</td>
<td>${pessoa.nome}</td>
<td>${pessoa.altura}</td>
</tr>
</c:forEach>
</table>
</body>
</html>