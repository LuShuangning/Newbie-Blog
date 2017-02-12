$(document).ready(function(){
	$(".title").html("SyningLu's Storage Room");
	$(".viceTitle").html("闻道先后，术业专攻");
	$(".signature").html("分享，是程序员对待朋友的基本友谊&nbsp;&nbsp;: )");

	var header = $(".main-header").height();
	var footer = $(".bottom").height();
	var nav = $(".main-navigation").height();
	var lsn_height = $(document).height() - header - nav - footer - 39;
	$(".lsn-center").css("min-height",lsn_height);

	$("#module-index").attr("href","http://www.syninglu.space/store/show#/book");
	$("#blog-index").mouseenter(function(){
	    $("#blog-index img").attr("src","http://www.syninglu.space/static/img/nav/主页-pressed.svg");
	});
	$("#blog-index").mouseleave(function(){
	    $("#blog-index img").attr("src","http://www.syninglu.space/static/img/nav/主页.svg");
	});
});