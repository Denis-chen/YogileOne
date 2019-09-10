<%--
  Created by IntelliJ IDEA.
  User: yaowei
  Date: 2019/8/11
  Time: 13:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="answer.css" type="text/css">
    <title>factorial_5</title>
</head>
<body>
<%
    int ele = 1;
    for(int i=5; i>0; i--) {
        ele *= i;
    }
%>
5! = <span class="answer"><%= ele%></span>
</body>
</html>
