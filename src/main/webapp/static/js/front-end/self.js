$(document).ready(function(){
    $(".title").html("Newbie's Personal profile");
    $(".viceTitle").html("个人简介");
    $(".signature").html("还会遇到很多人，经历很多事&nbsp;&nbsp;: )");
    $("#module-index").attr("href","http://www.sunnylu.me/articles/introduction");
    // $("#blog-index").mouseenter(function(){
    //     $("#blog-index img").attr("src","http://www.sunnylu.me/static/img/nav/主页-pressed.svg");
    // });
    // $("#blog-index").mouseleave(function(){
    //     $("#blog-index img").attr("src","http://www.sunnylu.me/static/img/nav/主页.svg");
    // });

	
    // JQuery的ajax请求异步加载
    $.ajax({
        type : 'GET',
        url : 'self/关于我',
        dataType:'json',
        beforeSend: loadFunction,
        success : succFunction,
        error: errorFunction
    });

    // 加载过程中
    function loadFunction(){
        $(".post-content h4:first-child").html("文章正在加载中...");
    };

    // 加载成功
    function succFunction(data){
        $(".post-content h4:first-child").remove();

        var json = eval(data);
        $(".post-title").append('<h3>' + json.articleTitle + '</h3>');
        $("#post-author").append(json.articleAuthor);
        $("#post-date").append(json.createTime);
        $(".post-content").append(json.articleContent);
        $(".ds-thread").attr("data-thread-key",json.articleId);
        $(".ds-thread").attr("data-title",json.articleTitle);
        $(".ds-thread").attr("data-url",window.location.href);
    };

    // 加载失败
    function errorFunction(jqXHR){
        alert("发生错误：" + jqXHR.status);
    };
});