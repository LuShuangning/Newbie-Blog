$(document).ready(function(){
	$(".title").html("Newbie's Real Stuff");
	$(".viceTitle").html("NEWBIE的干货铺");
	$(".signature").html("生活残忍，待之以温柔&nbsp;&nbsp;: )");

	$("#module-index").attr("href","http://www.sunnylu.me/articles/brief/学习记录");

	var header = $(".main-header").height();
	var nav = $(".main-navigation").height();
	var footer = $(".bottom").height();
	var lsn_height = $(document).height() - header - nav - footer - 38;
	$(".lsn-center").css("min-height",lsn_height);

	function repeat(){
		var list_view=$('<div class="list-view"><div class="panel panel-default"><div class="panel-body"><div class="piece"></div></div></div></div>');
		var piece_title=$('<div class="piece-title"><h2 id="article-title"></h2></div>');
		var piece_info=$('<div class="piece-info"><span class="piece-author">作者：<span id="article-author"></span>&nbsp;</span><time class="piece-time">•&nbsp;<span id="create-time"></span></time></div>');
		var piece_content=$('<div class="piece-conten" id="article-brief"></div>');
		var piece_btn=$('<div class="piece-btn"><a href="" id="article-id" class="btn btn-primary" role="button">全文阅读</a></div>');
		$(".list").append(list_view);
		$(".list .list-view:last-child .piece").append(piece_title,piece_info,piece_content,piece_btn);
	};

	$.ajax({
        type : 'GET',
        url : 'http://www.jacksonlu.me/articles/brief/学习记录/1/3',
        beforeSend: loadFunction,
        dataType: 'json',
        success : succFunction,
        error: errorFunction
    });

    var hasNextPage = true;

	$(window).scroll(function() {
	//$(document).scrollTop() 获取垂直滚动的距离:最小值为0，最大值：文档高度-可视化窗口高度
	//$(document).scrollLeft() 这是获取水平滚动条的距离
		var page = 1;
		
		// 滚动条到底
		if ($(document).scrollTop() >= $(document).height() - $(window).height()) {
			if(hasNextPage == true){
				page = page + 1;
				$.ajax({
			        type : 'GET',
			        url : 'http://www.jacksonlu.me/articles/brief/学习记录/' + page + '/' + 3,
			        dataType: 'json',
			        beforeSend: loadFunction,
			        success : succFunction,
			        error: errorFunction
			    });
			}else{
				alert("没有更多了");
				$(window).unbind ('scroll');
			}
			
		}
	});
    
    // 加载过程中
    function loadFunction(){
    	var more=$('<div class="more"><h4>更多文章加载中</h4></div>');
        $(".list .list-view:last-child").append(more);
    };

    // 加载成功
    function succFunction(data){
        $(".list .list-view:last-child .more").remove();
        // console.log(data);
        hasNextPage = data.hasNextPage;
        $.each(data.list,function(index,item){
			repeat();
			$(".list .list-view:last-child #article-title").append(item.articleTitle);
			$(".list .list-view:last-child #article-author").append(item.articleAuthor);
			$(".list .list-view:last-child #article-brief").append(item.articleBrief);
			$(".list .list-view:last-child #create-time").append(item.createTime);
			$(".list .list-view:last-child #article-id").attr('href','../detail/'+item.articleId);
		});
    };

    // 加载失败
    function errorFunction(jqXHR){
        alert("发生错误：" + jqXHR.status);
    };

});