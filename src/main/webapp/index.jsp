<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="func" uri="jakarta.tags.functions"%>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div>
			<h1>Survey Project</h1>
		</div>
		<ul>
			<li><a href="<c:url value="/survey/form"/>">Survey Form</a></li>
			<li><a href="<c:url value="/survey/list"/>">Survey List</a></li>
			<li><a href="<c:url value="/survey/file/form"/>">Survey File Form</a></li>
			<li><a href="<c:url value="/survey/file/list"/>">Survey File List</a></li>
		</ul>
	</body>
</html>