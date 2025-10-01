<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="func" uri="jakarta.tags.functions"%>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt"%>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
    <style>
        .gallery {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-around;
        }
        .gallery img {
            width: 200px;
            height: 200px;
            margin: 10px;
            object-fit: cover;
        }
    </style>
  </head>
  <body>
  	<div class="gallery">
  		<c:forEach var="file" items="${applicationScope.fileList }">
	        <img src="<c:url value="/resources/images/${file }.png"/>" alt="${file }">
      	</c:forEach>
    </div>
  </body>
</html>