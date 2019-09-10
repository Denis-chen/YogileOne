<%--
  Created by IntelliJ IDEA.
  User: yaowei
  Date: 2019/8/9
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>

$END$

<%

        int a=100;
        request.setAttribute("name_jsp",a);

%>
<jsp:forward page="3.9_1.jsp">123</jsp:forward>

</body>
</html>
