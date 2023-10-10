<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
<%-- webapp/c231010/el-test/index.jsp --%>
<%-- Expression Language --%>
<%-- 
<jsp:useBean id="student" class="c231006.StudentBean" />
<jsp:setProperty name="student" property="*" />
--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
	<%=student.getName() %><br />
	<jsp:getProperty property="name" name="student"/><br />
 --%>
	<%=1+3 %><br />
	${1+3 }<br />
	${4 / 2 }<br />
	${4 div 2 }<br />
	${4 % 3 }<br />
	${4 mod 3 }<br />
	${2 == 2 }<br />
	${2 eq 2 }<br />
	${2 != 2 }<br />
	${2 ne 2 }<br />
	${3 > 2 }<br />
	${3 gt 2 }<br /> <%-- greater than --%>
	${3 < 2 }<br />
	${3 lt 2 }<br /> <%-- little than --%>
	&gt &lt<br />
	${3 >= 2 }<br />
	${3 ge 2 }<br />
	${3 <= 2 }<br />
	${3 le 2 }<br />
	<hr />
	${true && false }<br />
	${true and false }<br />
	${true || false }<br />
	${true or false }<br />
	${!true }<br />
	${not true }<br />
	${empty null }<br />
	${empty "" }<br />
</body>
</html>