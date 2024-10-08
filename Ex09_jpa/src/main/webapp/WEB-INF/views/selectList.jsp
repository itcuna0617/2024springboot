<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	총 글의 개수 : ${totalElements}<br>
	총 페이지 : ${totalPages}<br>
	size : ${size}<br>
	pageNumber : ${pageNumber}<br>
	number of elements : ${numberOfElements}<br>
	<c:forEach var="member" items="${members}">
		id : ${member.id} / name : ${member.name} / email : ${member.email}
		<hr>
	</c:forEach>
</body>
</html>