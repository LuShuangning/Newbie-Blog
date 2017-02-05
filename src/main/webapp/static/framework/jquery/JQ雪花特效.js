
$(function(){
  var d="<div class='snow'>❅<div>"
  var snowSpeed = 100;//设置下雪的速度，越大雪花越多，下的越快
	setInterval(function(){
		var f=$(document).width();
		var e=Math.random()*f-100;
		var o=0.3+Math.random();
		var fon=10+Math.random()*30;
		var l = e - 100 + 200 * Math.random();
		var k=2000 + 5000 * Math.random();
		$(d).clone().appendTo(".snowbg").css({
			left:e+"px",
			opacity:o,
			"font-size":fon,
		}).animate({
		  top:"400px",
			left:l+"px",
			opacity:0.1,
		},k,"linear",function(){$(this).remove()})
	},snowSpeed)
});

/* 效果CSS开始 */
body {
	background: #000;
	background: url(../images/background.jpg) no-repeat center top;
	background-size: 100% auto;
	width: 100%;
}
.snowbg {
	width: 1000px;
	height: 600px;
	clear: both;
	margin: 0 auto;
	position: relative;
	overflow: hidden;
}
.snow {
	position: absolute;
	top: 0;
	color: #fff;
}
/* 效果CSS结束 */


将<div class="snowbg"></div>放在合适的地方即可