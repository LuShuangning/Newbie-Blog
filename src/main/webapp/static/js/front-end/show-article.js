$(document).ready(function(){
	$(".title").html("SunnyLu's Real Stuff");
	$(".viceTitle").html("双儿的干货铺");
	$(".signature").html("生活残忍，待之以温柔&nbsp;&nbsp;: )");

	$("#module-index").attr("href","http://www.sunnylu.me/essays/brief/干货数据库");

	var header = $(".main-header").height();
	var nav = $(".main-navigation").height();
	var footer = $(".bottom").height();
	var lsn_height = $(document).height() - header - nav - footer - 38;
	$(".lsn-center").css("min-height",lsn_height);

	function repeat(){
		var list_view=$('<div class="list-view"><div class="panel panel-default"><div class="panel-body"><div class="piece"></div></div></div></div>');
		var piece_title=$('<div class="piece-title"><h2 id="essay-title"></h2></div>');
		var piece_info=$('<div class="piece-info"><span class="piece-author">作者：<span id="essay-author"></span>&nbsp;</span><time class="piece-time">•&nbsp;<span id="create-time"></span></time></div>');
		var piece_content=$('<div class="piece-conten" id="essay-brief"></div>');
		var piece_btn=$('<div class="piece-btn"><a href="" id="essay-id" class="btn btn-primary" role="button">全文阅读</a></div>');

		$(".list").append(list_view);
		$(".list .list-view:last-child .piece").append(piece_title,piece_info,piece_content,piece_btn);
	};

	$.each(listMap,function(index,item){
		repeat();
		$(".list .list-view:last-child #essay-title").append(item.essayTitle);
		$(".list .list-view:last-child #essay-author").append(item.essayAuthor);
		$(".list .list-view:last-child #essay-brief").append(item.essayBrief);
		$(".list .list-view:last-child #create-time").append(item.createTime);
		$(".list .list-view:last-child #essay-id").attr('href','../detail/'+item.essayId);
	});
});