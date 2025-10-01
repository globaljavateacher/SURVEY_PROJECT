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
			<h1>Survey File Form</h1>
		</div>
		<div>
			<form enctype="multipart/form-data" action="<c:url value="/survey/file/upload"/>" method="post">
				<input type="file" name="uploadFile"><br>
				<br>
				<input type="file" name="uploadFile"><br>
				<br>
				<input type="file" name="uploadFile"><br>
				<br>
				<input type="submit" value="업로드"><br>
			</form>
		</div>
	</body>
</html>