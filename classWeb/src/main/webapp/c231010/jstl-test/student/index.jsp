<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="c231006.StudentBean, c231010.HobbyBean"
    isELIgnored="false"%>

    
<jsp:useBean id="students" class="java.util.ArrayList" />


<jsp:useBean id="hobbys" class="java.util.ArrayList" />

<%
	students.add(new StudentBean("권원준", 1));
	students.add(new StudentBean("김남균", 2));
	students.add(new StudentBean("김동선", 3));
	students.add(new StudentBean("이민규", 4));
	request.setAttribute("list", students);
	
	hobbys.add(new HobbyBean("달리기", 1));
	hobbys.add(new HobbyBean("독서", 2));
	hobbys.add(new HobbyBean("음악감상", 3));
	hobbys.add(new HobbyBean("영화감상", 4));
	request.setAttribute("list", hobbys);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:forward page="students.jsp" />
</body>
</html>