<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
<%-- webapp/c231010/student2/index.jsp --%>
<%--
	List students = (ArrayList) request.getAttribute("students");
--%>
<%--<jsp:useBean id="studentsMap" class="java.util.HashMap" scope="page" /> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${studentsMap.students[0].name }<br />
	${studentsMap.students[1].name }<br />
	${sessionScope.studentsMap.students[0].name }<br />
	page => request => session => application(Context, ServletContext)<br />
	<%=request.getContextPath() %><br />
	${pageContext.request.contextPath }<br />
	${requestScope.error }<br />
	<%-- pageScope, requestScope, sessionScope, applicationScope --%>
	<% for(int i = 0;i < 2; ++i){ %>
		<%=i %><br />
	<% } %>
</body>
</html>