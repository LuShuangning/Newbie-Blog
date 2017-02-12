$(document).ready(function(){
	$(".title").html("SyningLu's Real Stuff");
	$(".viceTitle").html("双儿的干货集中营");
	$(".signature").html("文章详情页&nbsp;&nbsp;: )");
	$("#module-index").attr("href","http://www.syninglu.space/essays/brief/干货数据库");
	$("#blog-index").mouseenter(function(){
	    $("#blog-index img").attr("src","http://www.syninglu.space/static/img/nav/主页-pressed.svg");
	});
	$("#blog-index").mouseleave(function(){
	    $("#blog-index img").attr("src","http://www.syninglu.space/static/img/nav/主页.svg");
	});

	var header = $(".main-header").height();
	var nav = $(".main-navigation").height();
	var footer = $(".bottom").height();
	var lsn_height = $(document).height() - header - nav - footer - 38;
	$(".lsn-center").css("min-height",lsn_height);

});