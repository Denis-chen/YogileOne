<%--
  Created by IntelliJ IDEA.
  User: yaowei
  Date: 2019/9/2
  Time: 17:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="word_type.css" type="text/css">
<html>
  <head>
    <title>用户登陆，错误30秒自动返回</title>
  </head>
  <body>
    <p class="center_type">
        <form action="result.jsp" id="userUp" name="userUp" method="post">
            用户登录界面<br>
            账号：<input type="text" name="userName"  title="输入用户账号"/><br>
            密码：<input type="text" name="userPassword"  title="输入用户账号"/><br>
            <input type="submit" id="userLogin" value="登录">
        </form>
    </p>
  </body>
</html>
