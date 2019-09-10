<%--
  Created by IntelliJ IDEA.
  User: yaowei
  Date: 2019/8/11
  Time: 13:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>composition</title>
    <link rel="stylesheet" href="middle.css" type="text/css">
</head>
<body>
<%
    char star = '*';
    StringBuilder stars = new StringBuilder();
    for (int i=0; i<5; i++) {
        stars.append(star);
        %>
        <a class="text_middle"><%= stars%><br></a>
<%
    }
%>
</body>
</html>
