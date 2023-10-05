<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="java.util.*"
    pageEncoding="UTF-8"%>

<%
	// List list = (ArrayList) request.getAttribute("list");
	String name1 = (String) request.getAttribute("name");
	Integer num1 = (Integer) request.getAttribute("num");
	String hobby1 = (String) request.getAttribute("hobby");
%>

<table>
	<tr>
		<th>번호</th>
		<th>이름</th>
		<th>취미</th>
	</tr>
	<%--
		for(int i = 0; i < list.size(); ++i){
	--%>
	<tr>
		<td><%=num1 %></td>
		<td><%=name1 %></td>
		<td><%=hobby1 %></td>
	</tr>
	<%--
		}
	--%>
</table>