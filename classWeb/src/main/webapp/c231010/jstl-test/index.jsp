<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- webapp/c231010/jstl-test/index.jsp --%>

<%-- https://tomcat.apache.org/download-taglibs.cgi --%>
<%-- 받을 파일은 WEB-INF/lib 에서 확인 --%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:useBean id="list" class="java.util.ArrayList" />
<%
list.add("김동선");
list.add("임현규");
%>

<c:set var="name" value="권원준" />
<c:set var="name" value="송성민" />
<c:set var="className" value="${\"java\"}" />

<c:remove var="className" />

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Custom Tags</title>
</head>
<body>
	커스텀 태그 : JSP에서 자바를 더 쓰기 싫어서 만들어짐<br />
	JSTL : JSP Standard Tag Library<br />
	${name }<br />
	<%--=name --%>
	${className }<br />
	조건문 / if, else, else if, switch, case, default<br />
	<c:if test="${3 > 1 }">
		크다!<br />
	</c:if>
	<c:if test="${3 < 1 }">
		크다!!!<br />
	</c:if>
	<hr />
	<c:choose>
		<c:when test="${3 < 1 }">크다!<br /></c:when>
		<c:when test="${3 > 54 }">크다!!!<br /></c:when>
		<c:otherwise>전부 거짓이야, default<br /></c:otherwise>
	</c:choose>
	<hr />
	<hr />
	반복문 / for, while, forEach<br />
	for(int i = 0; i <= 10; ++i){}<br />
	<c:forEach var="i" begin="0" end="10" step="2" varStatus="loop">
		${i } : ${loop.count }<br />
	</c:forEach>
	<c:forEach var="item" items="${list }" varStatus="loop">
		번호 ${loop.count} : ${item }<br />
	</c:forEach>
	<hr />
	<c:out value="<div>테스트중</div>" escapeXml="false" />
	<c:out value="&lt" escapeXml="false" />
	<c:out value="&gt" escapeXml="false" />
	<hr />
	<c:url var="urlTest" value="../student">
		<c:param name="name" value="테스터~" />
	</c:url>
	<a class="asdf" href="${urlTest }" >테스트로 보내자</a>
	<%--
	<c:redirect url="../student">
		<c:param name="name" value="테스터~" />
	</c:redirect>
	--%>
</body>
</html>