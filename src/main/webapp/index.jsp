<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh-cmn-Hans">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=0">
    <title>WeUI</title>
    <link rel="stylesheet" href="./style/weui.css"/>
    <link rel="stylesheet" href="./style/example.css"/>
    <script src="./js/zepto.min.js"></script>
    <script type="text/javascript" src="https://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>
    <script src="./js/example.js"></script>
</head>
<body ontouchstart>

<div class="weui-toptips weui-toptips_warn js_tooltips">错误提示</div>

<div class="container" id="container"></div>

<script type="text/html" id="tpl_home">
    <div class="page">
        <div class="page__hd">
            <h1>
                浙江工业大学
            </h1>
            <p class="page__desc">请选择寝室楼一键拨打电话</p>
        </div>
        <div class="page__bd page__bd_spacing">
            <ul>
                <li>
                    <div class="weui-flex js_category">
                        <p class="weui-flex__item">寝室楼</p>
                        <img src="./images/icon_nav_form.png" alt="">
                    </div>
                    <div class="page__category js_categoryInner">
                        <div class="weui-cells page__category-content">
                            <a class="weui-cell weui-cell_access js_item" data-id="button" href="javascript:;">
                                <div class="weui-cell__bd">
                                    <p>Button</p>
                                </div>
                                <div class="weui-cell__ft"></div>
                            </a>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
    </div>
    <script type="text/javascript">
        $(function(){
            var winH = $(window).height();
            var categorySpace = 10;

            $('.js_item').on('click', function(){
                var id = $(this).data('id');
                window.pageManager.go(id);
            });
            $('.js_category').on('click', function(){
                var $this = $(this),
                        $inner = $this.next('.js_categoryInner'),
                        $page = $this.parents('.page'),
                        $parent = $(this).parent('li');
                var innerH = $inner.data('height');
                bear = $page;

                if(!innerH){
                    $inner.css('height', 'auto');
                    innerH = $inner.height();
                    $inner.removeAttr('style');
                    $inner.data('height', innerH);
                }

                if($parent.hasClass('js_show')){
                    $parent.removeClass('js_show');
                }else{
                    $parent.siblings().removeClass('js_show');

                    $parent.addClass('js_show');
                    if(this.offsetTop + this.offsetHeight + innerH > $page.scrollTop() + winH){
                        var scrollTop = this.offsetTop + this.offsetHeight + innerH - winH + categorySpace;

                        if(scrollTop > this.offsetTop){
                            scrollTop = this.offsetTop - categorySpace;
                        }

                        $page.scrollTop(scrollTop);
                    }
                }
            });
        });
    </script>
</script>

<script type="text/html" id="tpl_button">
    <div class="page">
        <div class="page__hd">
            <h1 class="page__title">尚1</h1>
            <p class="page__desc">按钮</p>
        </div>
        <div class="page__bd page__bd_spacing">

            <div class="button-sp-area">
                <a href="javascript:;" class="weui-btn weui-btn_plain-primary">拨 打 电 话</a>
            </div>
        </div>
        <div class="page__ft">
            <a href="javascript:home()"><img src="./images/icon_footer_link.png" /></a>
        </div>
    </div>
</script>
</body>
</html>