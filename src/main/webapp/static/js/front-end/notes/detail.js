$(document).ready(function(){
	$(".title").html("SyningLu's Notes");
	$(".viceTitle").html("双儿的印象、笔记");
	$(".signature").html("印象详情页&nbsp;&nbsp;: )");
	$("#module-index").attr("href","http://www.syninglu.space//notes/show");
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


	function repeat(){
		var box = $('<div class="detail-box"><div class="pic"><a><img id="cover_page" src=""></a></div></div>');
		$(".main").append(box);
	};

	$.each(album,function(index,item){
		repeat();
		$(".main .detail-box:last-child #cover_page").attr("src","http://www.syninglu.space/static/img/album/" + item.belongTo + "/" + item.name);
	});

});