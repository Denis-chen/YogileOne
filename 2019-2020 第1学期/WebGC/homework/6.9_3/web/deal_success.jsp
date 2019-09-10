<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: yaowei
  Date: 2019/9/6
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Enumeration<String> application_all = application.getAttributeNames();
    while (application_all.hasMoreElements()) {
        String app_name_old = application_all.nextElement();
        String app_name_old_value = application.getInitParameter(app_name_old);
        out.println(app_name_old + "<br>");
        out.println(app_name_old_value + "<br><br><br>");
    }
%>

<span>您已成功注册。</span>

<br><br>
返回注册界面：
<form action="index.jsp" name="back_index_Form" id="back_index_Form" method="post" >
    <input name="back_index_Submit" type="submit" value="返回注册界面">
</form>

<%
    Enumeration<String> session_all = session.getAttributeNames();
    while (session_all.hasMoreElements()) {
        String app_name_old = session_all.nextElement();
        String app_name_old_value = (String) session.getAttribute(app_name_old);
        out.println(app_name_old + "<br>");
        out.println(app_name_old_value + "<br><br><br>");
    }
%>
</body>
</html>
