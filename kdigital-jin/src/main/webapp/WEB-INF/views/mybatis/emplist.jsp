<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items ="${ emplist }" var="empvo" >
	
	<h3> 사번  : ${empvo.employee_id } 이름 : ${empvo.last_name }, ${empvo.first_name } </h3>
</c:forEach>

</body>
</html>