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
			<h1>Survey Form</h1>
		</div>
		<div>
			<form id="frm1" onsubmit="checkSubmit()">
				<script>
					function checkSubmit(){
						if ( confirm("제출하시겠습니까?") ) {
							let frm1 = document.querySelector("#frm1");
							frm1.action = '<c:url value="/survey/submit"/>';
							frm1.method = 'post';
							frm1.submit();
						}
					}
				</script>
				<span>1.당신이 거주하는 지역을 적어주세요.</span><br>
				<input type="text" name="address" placeholder="서울시 영등포구" maxlength="20"><br>
				<br>
				<span>2.당신이 사용하는 통신사를 선택해주세요.</span><br>
				<select name="telecom">
					<option value="KT">KT</option>
					<option value="SK">SK</option>
					<option value="LGU+">LGU+</option>
				</select><br>
				<br>
				<span>3.당신의 국적을 선택해주세요.</span><br>
				<input type="radio" name="nation" value="local" checked>내국인
				<input type="radio" name="nation" value="foreigner">외국인
				<input type="radio" name="nation" value="dual">이중국적
				<input type="radio" name="nation" value="alien">외계인<br>
				<br>
				<span>4.당신의 취미를 선택해주세요.</span><br>
				<input type="checkbox" id="software" name="hobby" value="software">
				<label for="software">소프트웨어</label>
				<input type="checkbox" id="hardware" name="hobby" value="hardware">
				<label for="hardware">하드웨어</label>
				<input type="checkbox" id="security" name="hobby" value="security">
				<label for="security">보안</label>
				<input type="checkbox" id="early" name="hobby" value="early">
				<label for="early">얼리어답터</label><br>
				<br>
				<span>5.일본 IT 회사에 바라는 점이 있으면 적어주세요.</span><br>
				<textarea name="hope" maxlength="30"></textarea><br>
				<br>
				<input type="submit" value="제출">
			</form>
		</div>
	</body>
	
	
	
	
	
	
	
	
</html>