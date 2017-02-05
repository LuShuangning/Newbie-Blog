$(document).ready(function(){
	$(".title").html("SyningLu's Real Stuff");
	$(".viceTitle").html("双儿的干货集中营");
	$(".signature").html("生活以残忍，待之以温柔&nbsp;&nbsp;: )");

	var header = $(".main-header").height();
	var nav = $(".main-navigation").height();
	var footer = $(".bottom").height();
	var lsn_height = $(document).height() - header - nav - footer - 38;
	$(".lsn-center").css("min-height",lsn_height);


	function repeat(){
		var list_view=$('<div class="list-view"><div class="panel panel-default"><div class="panel-body"></div></div></div>');
		var piece_title=$('<div class="piece-title"><h2 id="essay-title"></h2></div>');
		var piece_info=$('<div class="piece-info"><span class="piece-author">作者：<span id="essay-author"></span>&nbsp;</span><time class="piece-time">•&nbsp;<span id="create-time"></span></time></div>');
		var piece_content=$('<div class="piece-conten" id="essay-brief"></div>');
		var piece_btn=$('<div class="piece-btn"><a href="" id="essay-id" class="btn btn-primary" role="button">全文阅读</a></div>');

		$(".lsn-center").append(list_view);
		$(".lsn-center .list-view:last-child .panel-body").append(piece_title,piece_info,piece_content,piece_btn);
	};

	$.ajax({
	        type : 'GET',
	        url : '../essays/brief/干货数据库.do',
	        dataType:'json',
	        success : succFunction,
	        error: erryFunction
	});

	// 加载过程中
	function loadFunction(){
		$("#content").html("文章正在加载中...");
	};

	 // 加载成功
	function succFunction(data){
		var json = eval(data);
		// 循环取数据
		$.each(json,function(index,item){
		    repeat();
		    $(".lsn-center .list-view:last-child #essay-title").append(item.essayTitle);
		    $(".lsn-center .list-view:last-child #essay-author").append(item.essayAuthor);
		    $(".lsn-center .list-view:last-child #essay-brief").append(item.essayBrief);
		    $(".lsn-center .list-view:last-child #create-time").append(item.createTime);
		    $(".lsn-center .list-view:last-child #essay-id").attr('href','../essays/article/'+item.essayId+'.do');
		    // $(".lsn-center .list-view:last-child #essay-id").attr('href','www.syninglu.space:8080/');
		});
	};

	// 加载失败
	function erryFunction(jqXHR){
		alert("发生错误：" + jqXHR.status);
	};
});