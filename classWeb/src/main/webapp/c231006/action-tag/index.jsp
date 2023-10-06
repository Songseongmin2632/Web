<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="temp" class="c231006.StudentBean" scope="page"></jsp:useBean>
<jsp:setProperty name="temp" property="name" value="이민규" />
<%--<jsp:setProperty name="temp" property="name" value='<%=request.getParameter("name")%>' />--%>
<%--<jsp:setProperty name="temp" property="name" param="name" />
<jsp:setProperty name="temp" property="num" param="num" />--%>
<jsp:setProperty name="temp" property="*" />
<%
	// StudentBean temp = new StudentBean();
	// temp.setName("박정완");
	//temp.setName(request.getParameter("name"));
%>

<%-- action tag --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../errorpage1.jsp" />
	<jsp:include page="../../test-jsp/table.jsp">
		<jsp:param value="한상윤" name="name"/>
	</jsp:include>
	<%--
	<jsp:forward page="../../test-jsp/table.jsp">
		<jsp:param value="한상윤" name="name"/>
	</jsp:forward>
	--%>
	
	<%-- <div><%=temp.getName() %></div> --%>
	<div><jsp:getProperty name="temp" property="name" /></div>
	<div><jsp:getProperty name="temp" property="num" /></div>
</body>
</html>