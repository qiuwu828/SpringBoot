<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>默认登录</title>
</head>
<body>
<h3>登录页面</h3>
<span style="color: red">${error!""}</span>
<form action="/user/login" method="post">
    用户名：<input type="text" name="uname"><br>
    密&nbsp;&nbsp;码：<input type="text" name="upwd"><br>
    <input type="submit" value="登录">
    <input type="reset" value="重置">
</form>
</body>
</html>