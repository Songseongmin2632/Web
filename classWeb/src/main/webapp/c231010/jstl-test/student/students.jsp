<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 명부</title>
<style>
	table{
		border-collapse: collapse;
	}
	
	th, td{
		border: 1px solid black;
		padding: 0.5rem 1rem;
		text-align: center;
	}
	
	tr:nth-child(2n) td{
		background-color: #eee;
	}
</style>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>입력 순서</th>
				<th>이름</th>
				<th>번호</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${list }" varStatus="loop">
				<tr>
					<td>${loop.count }</td>
					<td>${item.name }</td>
					<td>${item.num }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>