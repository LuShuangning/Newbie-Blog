$(document).ready(function(){
	$(".title").html("SunnyLu's Homepage");
	$(".viceTitle").html("双儿的个人主页");
	$(".signature").html("生活残忍，待之以温柔&nbsp;&nbsp;: )");


	// $.ajax({
	// 	type : 'GET',
	// 	url : 'index',
	// 	dataType:'json',
	// 	beforeSend: loadFunction,
	// 	success : succFunction,
	// 	error: erryFunction
	// });

	// // 加载过程中
	// function loadFunction(){
	    
	// };

	// // 加载成功
	// function succFunction(data){
	   
	// };

	// // 加载失败
	// function erryFunction(jqXHR){
	    
	// };

	/*
	*JQuery雪花下落函数，非原创
	*/
	$(function(){
	  var d="<div class='snow'>❅<div>"
	  // var d="<div class='snow'>☸<div>"
	  var snowSpeed = 150;//设置下雪的速度，越小雪花越多，下的越快
		setInterval(function(){
			var f=$(document).width();
			// var h=$(document).height();	//获取当前页面高度====双儿加
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
			  	top:"700px",
				left:l+"px",
				opacity:0.1,
			},k,"linear",function(){$(this).remove()})
		},snowSpeed)
	});
});