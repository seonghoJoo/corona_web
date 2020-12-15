<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="/WEB-INF/template/link.jsp" %>
<link rel="stylesheet" href="/css/form.css" />
</head>
<body>
	<%@ include file="/WEB-INF/template/header.jsp" %>
	<h2><i class="fas fa-pencil-alt"></i> 확진자 추가하기</h2>
	<form method="post" action="/write.bmj">
		<fildset>
			<legend class="screen_out">글쓰기 폼</legend>
			<div>
				<label class="title" for="place">장소 이름</label>
				<input type="text" class="input1" name="place"
				 placeholder="장소이름을 입력"/>
			</div>
			<div>
				<label class="title" for="address">주소</label>
				<input type="text" class="input1" name="address"
				 placeholder="주소를 입력"/>
			</div>
			<div>
				<label class="title" for="city">시</label>
				<input type="text" class="input2" name="city"
				 placeholder="시를 입력"/>
				<label class="title" for="gu">구</label>
				<input type="text" class="input2" name="gu"
				 placeholder="구를 입력"/>
			</div>
			
			<div>
				<label class="title" for="latitude">위도</label>
				<input type="text" class="input2" name="latitude"
				 placeholder="위도를 입력"/>
				<label class="title" for="longititude">경도</label>
				<input type="text" class="input2" name="longititude"
				 placeholder="경도를 입력"/>
			</div>
			
			<div>
				<label class="title" for="mask">마스크여부</label>
				<input type="text" class="input2" name="mask"
				 placeholder="M:착용 N:미착용"/>
				<label class="title" for="num">확진 순서</label>
				<input type="text" class="input2" name="num"
				 placeholder="순서를 입력"/>
			</div>
			<div>
				<span class="title">시작시각</span>
				<select class="input3 year" name="startYear"></select><span class="title-input3">년</span>
				<select class="input3 month" name="startMonth"></select><span class="title-input3">월</span>
				<select class="input3 date_d" name="startDay"></select><span class="title-input3">일</span>
		    </div>
		      
			<div>
				<span class="title">종료시각</span>
				<select class="input3 year" name="endYear"></select><span class="title-input3">년</span>
				<select class="input3 month" name="endMonth"></select><span class="title-input3">월</span>
				<select class="input3 date_d" name="endDay"></select><span class="title-input3">일</span>
		    </div>

			<div class="btn_box">
				<button class="btn" type="reset"><i class="fas fa-retweet"></i> 리 셋</button>
				<button class="btn" type="submit"><i class="fas fa-pencil-alt"></i> 글쓰기</button>
				<a class="btn" href="/index.jsp"><i class="fa fa-arrow-left "></i> 게시판으로</a>
			</div>
		</fildset>
	</form>
	<%@ include file="WEB-INF/template/footer.jsp" %>
	<script src="/js/create-date.js"></script>
</body>
</html>