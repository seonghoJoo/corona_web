<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
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
	.msg{
		color:#FF1744;
	}
	.msg.ok{
		color : #2979FF; 
	}
	.check{
		display : none;
	}
</style>
</head>
<body>
	<div id="intro">
		<div id="loginBox">
			<h1><i class="fas fa-sign-in-alt"></i> <span>ADMIN 회원가입</span></h1>
			<form method="post" action="/join.bmj">
				<fieldset>
					<legend class="screen_out">회원가입 폼</legend>
					<label for="id" class="screen_out">아이디</label>
					<input type="text" autofocus name="id" id="id" placeholder="아이디" title="아이디를 입력해주세요."/>
					<p class="msg" id="msgId">4~8자까지 영어 및 숫자로 입력해주세요.</p>
					<label for="nickname" class="screen_out">닉네임</label>
					<input type="text" name="nickname" id="nickname" placeholder="닉네임(2~6글자)" title="닉네임을 입력해주세요."/>
					<p class="msg" id="msgNickname">2~6자까지 한글로 입력해주세요.</p>
					<label for="pwd" class="screen_out">비밀번호</label>
					<input type="password" name="password" id="pwd" placeholder="비밀번호" title="비밀번호를 입력해주세요."/>
					<label for="pwdcheck" class="screen_out">비밀번호 재확인</label>
					<input type="password" name="passwordcheck" id="pwdCheck" placeholder="비밀번호 확인" title="비밀번호를 똑같이 입력해주세요."/>
					<p class="msg" id="msgPwd">4~8자까지 영어 및 숫자로 입력해주세요.</p>
					<button id="loginBtn" title="로그인 버튼"><i class="fas fa-sign-in-alt"></i> 회원가입</button>
				</fieldset>
			</form>
			<a id="joinLink" href="/login.jsp"><i class="fas fa-arrow-left"></i> 뒤로가기</a>
		</div>
		<div id="videoContainer">
			<video muted autoplay loop id="video">
				<source src="video/loop.mp4"/>
			</video>
		</div>
	</div>
	<script>
		const $id = $('#id');
		const $msg = $('.msg');
		const $msgId = $('#msgId');
		const $msgPwd = $('#msgPwd');
		const $msgNickname = $('#msgNickname');
		const $nickname = $('#nickname');
		
		$msgId.css('display','none');
		$msgPwd.css('display','none');
		$msgNickname.css('display','none');
		
		const $pwd = $('#pwd');
		const $pwdCheck = $('#pwdCheck');
		$id.val('').focus();

		// id 정규표현식 객체
		const idExp = /^[a-zA-Z]{1}[a-zA-z|\d]{3,7}$/;
		const nicknameExp = /^[가-힣]{2,6}$/;
		
		
		$id.keyup(function(){
			const val = $id.val();
			$msgId.css('display','block');
			
			if(idExp.test(val)){
				$msgId.addClass("ok").text("아주 좋은 닉네임이에요");
			}else{
				$msgId.removeClass("ok").text("4~8자까지 영어 및 숫자로 입력해주세요.");
			}// if ~ else end
		});//$id keyup() end
		
		$nickname.keyup(function(){
			const val = $nickname.val();
			$msgNickname.css('display','block');
			
			if(nicknameExp.test(val)){
				$msgNickname.addClass("ok").text("아주 좋은 닉네임이에요");
			}else{
				$msgNickname.removeClass("ok").text("2~6자까지 한글로 입력해주세요.");
			}// if ~ else end
		});//$nickname keyup() end
		
		
		
		$pwdCheck.keyup(function(){
			const valPwd = $pwd.val();
			const valPwdCheck = $pwdCheck.val();
			$msgPwd.css('display','block');
			if(valPwd == valPwdCheck){
				$msgPwd.addClass("ok").text("비밀번호와 일치해요");
			}else{
				$msgPwd.removeClass("ok").text("비밀번호 불일치해요");
			}//if~else end
		});//$pwdCheck keyup() end
		
		
	</script>
</body>
</html>

