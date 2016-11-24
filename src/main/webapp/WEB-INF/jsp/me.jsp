<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
import="java.util.StringTokenizer"
%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html ng-app="me" ng-controller="articleController"> 
<head>     
	<meta charset="utf-8">
	<title>关于我</title>
	<link rel="stylesheet" type="text/css" href="static/css/bootstrap-3.3.7/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="static/css/me/me.css">
	<link rel="stylesheet" type="text/css" href="static/css/public/public.css">
	<link rel='icon' href='static/img/easyicon.ico' type=‘image/x-ico’ />
</head>
<body>

	<jsp:include page="/static/html/public/header.html" flush="true"></jsp:include>
	<nav class="main-navigation">
		<div class="container">
			<div class="row">
				<div class="col-sm-12">
					<div class="nav-header">
						<ul class="menu">
							<li>
								<a href="">
									<img src="static/img/me/back_to_index_normal.png" alt="">首页
								</a>
							</li>
								
							<li>
								<a href="http://localhost:8080/syninglu/index.action">博客首页</a>
							</li>
						</ul>

					</div>
				</div>
			</div>

		</div>
	</nav>

	<main class="container">
		<div class="row">
			<div class="col-md-12">
				<article class="post format">
					<div class="post-head">
						<div class="post-title">
							<h3>{{postTitle}}</h3>
						</div>
						<div class="post-meta">
							<h4>作者：<a href="http://localhost:8080/syninglu/index.action">双</a>&nbsp;&nbsp;•&nbsp;2016.10.29</h4>
						</div>
					</div>

					<div class="post-content">
						
						<!-- <h4>
							那天麻将打到半夜，猴子来了条短信：想师傅了。我牌性正酣，拿起手机看了一眼，转身接着凑我的大三元。
						</h4>

						<h4>
							牌局散场时已经是早上五点，从麻将室回家的路上遇到红孩儿。他起了个大早往狗市赶，说是有一家弄到了西域纯种的虎狮狼杂交斗犬，要去看个热闹，还问我去不去。红孩儿武艺是高，可眼里没水,偏偏还就喜欢那些个稀奇古怪的玩意儿，字画玉石鹦鹉斗犬，什么难辨就喜欢什么，狗市的孙子们都当他是个财神。我说去了也是扔钱，少则两三千，多则上万。白花花的银子换些劳什子，再说我还哪有钱。昨晚就输了个底儿朝天。
						</h4>

						<h4>
							一听我没钱，红孩儿一溜烟跑远了，一声回声都没说。要是牛魔王活着，知道那帮市井之徒拿自己儿子当傻子耍，非一把火烧了狗市不可。
						</h4>

						<h4>
							到家时已经七点，看时间还早便给秀兰带了屉包子。进屋没敢看她的脸，倒头便睡。一觉醒来她早已上班去了。
						</h4>

						<h4>
							洗脸刷牙打开电视，总觉着忘了什么重要的事情，寻思半天才想起猴子那条短信，掏出手机又看了一遍，四个字绞的胃里生疼。
						</h4>

						<h4>
							猴子总是跟我说，几百年里只有带着紧箍才能睡个安生觉。我一般不接他话茬，猴子说话就这样，有来无回，冷不丁一句让你不知道怎么应。其实理由都听腻了，杀生太多，喝水一股血腥味，闭眼黑暗中全是冤死的厉鬼。
						</h4>

						<h4>
							说真的，我理解不了。
						</h4>

						<h4>
							跟师傅之前我做过不少坏事，打家劫舍奸淫掳掠，没想过要赎罪，更没想过取个经就能善终。关于我的恶性，坊间传言我仇恨天庭，师傅批我因六根不净，佛说皆为泱泱因果。我思考了很久，想来也只是因为手痒。
						</h4>

						<h4>
							猴子和我不一样，他从石头缝里蹦出来，做什么都无因无果。宰第一只兔子，杀第一头山妖，他一样一样记在心里，每每喝酒就跟我说，棒子砸烂脑袋的感触就跟用手去抓屎，恶心。
						</h4>

						<h4>
							回忆猴子的时间单位都是以百年记，我想即使数千年过去了，猴子还是那个刚从石头缝里蹦出来的猴子，白纸一张。要说谁拿笔在这白纸上点了点墨，也只有师傅。
						</h4>

						<h4>
							我把电话打了过去，说猴哥，最经生意太忙，过两天抽空去找你喝酒。电话里静悄悄的，猴子叹了口气，寒暄了几句，突然提起师傅。我没接话，知道这一讲又是半天，于是把电话扬声器打开放在一边，自己窝在沙发里，听猴子絮絮叨叨地重复早已无甚可说的陈年往事。
						</h4>

						<h4>
							想当年一路西行，有惊无险，哪有妖怪奈何得了这只猴子。我只当重新做人，悟净常年不发一言，只有这只猴子爱上蹿下跳，开些不合时宜的玩笑，故意气的师傅盘膝念经来紧他头上的金箍。
						</h4> -->

					</div>
					
				</article>
			</div>
		</div>
	</main>
	<jsp:include page="/static/html/public/footer.html" flush="true"></jsp:include>
	
    <script type="text/javascript" src="static/js/angularjs/angular.js" ></script>
    <script type="text/javascript" src="static/js/me/me.js"></script>

</body>
</html>