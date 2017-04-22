<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>用户登录</title>
	<link rel="stylesheet" type="text/css" href="http://www.sunnylu.me/static/css/public/bootstrap-3.3.7/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="http://www.sunnylu.me/static/css/public/Font-Awesome-3.2.1/css/font-awesome.min.css">
	<link rel="icon" href="http://www.syninglu.space/static/img/easyicon.ico" type="image/x-ico" />
</head>
<body>
	<form role="form" action="http://www.sunnylu.me/login" method="post">
		<div class="form-group">
			<label for="loginUser">用户名</label>
			<input type="text" name="userName" class="form-control" id="loginUser" placeholder="Enter count">
		</div>
		<div class="form-group">
			<label for="loginPass">密码</label>
			<input type="password" name="password" class="form-control" id="loginPass" placeholder="Password">
		</div>

		<button type="submit" class="btn btn-default" id="loginBtn">登录</button>
	</form>

	<script src="http://www.sunnylu.me/static/js/front-end/login.js"></script>
</body>
</html>