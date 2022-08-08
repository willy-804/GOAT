<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../../../resources/CSS/managerCSS.css">
</head>
<body>

	<div class="container">
		<%@ include file="../header/header.jsp"%>

		<div class="header">
			<h1 class="title">회원 관리 페이지</h1>
		</div>
		<div class="body">
			<table class="writetable">
				<tr>
					<td class="allmem">전체 사용자: 1 명</td>
				</tr>
				<tr class="memlist">
					<td class="write2">회원번호</td>
					<td class="write2">아이디</td>
					<td class="write2">닉네임</td>
					<td class="write2">가입일</td>
					<td class="write3">글/댓글</td>
					<td class="write1">관리</td>
				</tr>
				<tr class="writelist">
					<td>7</td>
					<td>abcd1234</td>
					<td>홍길동</td>
					<td>2022-08-05</td>
					<td><a href="">5/1</a></td>
					<td><a href=""><input type="button" value="상세"
							class="modifybtn"></a></td>
				</tr>
			</table>
		</div>
		<div class="footer">
			<table class="btntable">
				<tr>
					<td><a href=""><input class="backbtn" type="button"
							value="이전"></a> <a href=""><input class="backbtn"
							type="button" value="다음"></a></td>
				</tr>
			</table>
		</div>
	</div>

</body>
</html>