$(document).ready(function(){
	$(".title").html("SyningLu's Brief Introduction");
	$(".viceTitle").html("个人简介");
	$(".signature").html("还会遇到很多人，经历很多事&nbsp;&nbsp;: )");
	
    // ajax请求异步加载
	$.ajax({
        type : 'GET',
        url : 'http://www.syninglu.space:8080/me/article.do',
        dataType:'json',
        beforeSend: loadFunction,
        success : succFunction,
        error: erryFunction
    });

    // 加载过程中
    function loadFunction(){
        $(".post-content h4:first-child").html("文章正在加载中...");
    };

    // 加载成功
    function succFunction(data){
        $(".post-content h4:first-child").remove();

        var json = eval(data);
        // 循环取数据
        $.each(json.articles,function(index,item){
            var content = item.content;
            $(".post-content").append('<h4>'+ content +'</h4>');
        });
    };

    // 加载失败
    function erryFunction(jqXHR){
        alert("发生错误：" + jqXHR.status);
    };
});