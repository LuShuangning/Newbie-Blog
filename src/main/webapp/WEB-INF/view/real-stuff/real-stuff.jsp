<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>图书馆</title>

	<link rel="stylesheet" type="text/css" href="/static/framework/bootstrap-3.3.7/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="/static/css/public/public.css">
	<link rel="stylesheet" type="text/css" href="/static/css/real-stuff/real-stuff.css">
	<link rel='icon' href="/static/img/easyicon.ico' type=‘image/x-ico" />
</head>
<body>
	<%@ include file="/static/html/public/header.html" %>
	<div>
		<div class="list-view">
			<div class="panel panel-default">
				<div class="panel-body">
					<div class="left-img">
						<img src="/static/img/library/img1.jpg" alt="" class="img-thumbnail">
					</div>

					<div class="right-content">
						<div class="title">
							{{describe.title}}
						</div>

						<div class="brief-intro">
							{{describe.intro}}
						</div>
						
					</div>
				</div>
			</div>

		</div>
		<%@ include file="/static/html/public/footer.html" %>
		
	</div>	
</body>
</html>