$(document).ready(function(){
	$(".title").html("SyningLu's Brief Introduction");
	$(".viceTitle").html("个人简介");
	$(".signature").html("有事写程序没事打游戏&nbsp;&nbsp;: )");
	
    // ajax请求异步加载
	$.ajax({
        type : 'GET',
        url : 'http://localhost:8080/syninglu/me/article.action',
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