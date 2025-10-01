<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="func" uri="jakarta.tags.functions"%>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style>
		  table, th, td {
		    border: 1px solid black;
		    border-collapse: collapse;
		  }
		</style>
	</head>
	<body>
		<div>
			<h1>Survey List</h1>
		</div>
		<div>
			<table>
				<tr>
					<th>번호</th>
					<th>지역</th>
					<th>통신사</th>
					<th>국적</th>
					<th>취미</th>
					<th>바라는점</th>
				</tr>
				<c:forEach var="survey" items="${applicationScope.surveyList }" varStatus="i" >
					<tr>
						<td>${i.count}</td>
						<td>${survey.address}</td>
						<td>${survey.telecom}</td>
						<td>${survey.nation}</td>
						<td>${survey.hobby}</td>
						<td>${survey.hope}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</body>
	
	
	
	
	
	
	
	
</html>