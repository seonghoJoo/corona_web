
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	Object msg = session.getAttribute("msg");
	if(msg!=null){
		session.removeAttribute("msg");
	}//if end
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
<%@ include file="/WEB-INF/template/link.jsp" %>
<link href="/css/login.css" rel="stylesheet"/>
<style>
	#msgBox{
	    margin : 10px;
	    position: relative;
	    text-align: center;
	    color: #fff;
	    font-size: 21px;
	    font-weight: 900;
	}
	#msg{
		color:#FF1744;
	}
	#msg.ok{
		color : #2979FF; 
	}
</style>
</head>
<body>
	<div id="intro">
		<div id="loginBox">
			<h1><span><i class="fas fa-sign-in-alt"></i> ADMIN 로그인</span></h1>
			<form method="post" action="/login.bmj">
				<fieldset>
					<legend class="screen_out">로그인 폼</legend>
					<label for="id" class="screen_out">아이디</label>
					<input type="text" autofocus name="id" id="id" placeholder="아이디" title="아이디를 입력해주세요."/>
					<p id="msg">4~8자까지 영어 및 숫자로 입력해주세요.</p>
					<label for="pwd" class="screen_out">비밀번호</label>
					<input type="password" name="password" id="pwd" placeholder="비밀번호" title="비밀번호를 입력해주세요."/>
					<button id="loginBtn" title="로그인 버튼"><i class="fas fa-sign-in-alt"></i> 로그인</button>
				</fieldset>
			</form>
			<%if(msg!=null){ %>
			<div id="msgBox"><%=msg %></div>
			<%} %>
			<a id="joinLink" href="/register.jsp"><i class="fas fa-user-plus"></i> 회원가입</a>
		</div>
		<div id="videoContainer">
			<video muted autoplay loop id="video">
				<source src="/video/loop.mp4"/>
			</video>
		</div>
	</div>
	<script>
		const $id = $('#id');
		
		const $msg = $('#msg');
		$msg.css('display','none');
		
		$id.val('').focus();

		// 이름 정규표현식 객체
		const idExp = /^[a-zA-Z]{1}[a-zA-z|\d]{3,7}$/;
		
		$id.keyup(function(){
			const val = $id.val();
			$msg.css('display','block');
			if(idExp.test(val)){
				$msg.addClass("ok").text("아주 좋은 닉네임이에요");
			}else{
				$msg.removeClass("ok").text("4~8자까지 영어 및 숫자로 입력해주세요.");
			}// if ~ else end
		});//keyup() end
		
	</script>
</body>
</html>
