<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>网站头部</title>
    <style>
        header {
            color: red;
        }

        header span {
            margin-left: 500px;
        }
    </style>
</head>
<body>
<header>
    <a href="/note/list">首页</a>
    <a href="#">添加日记</a>
    <a href="/noteType/list">类型管理</a>
    <a href="/report">报表模块</a>

    <#--显示用户昵称-->
    <span>
            欢迎：${Session["user"].nick}
            <a href="#">退出</a>
        </span>

</header>
</body>
</html>