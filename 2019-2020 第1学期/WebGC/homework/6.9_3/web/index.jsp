<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: yaowei
  Date: 2019/9/6
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <script language="JavaScript">
        function ifNull(form_Msg){
            var userName = form_Msg.userName.value;
            var userPassword = form_Msg.userPassword.value;
            if (userName === "") {
                alert("用户名不能为空");
                form_Msg.userName.focus();
                return false;
            }
            if (userPassword === "") {
                alert("密码不能为空");
                form_Msg.userPassword.focus();
                return false;
            }
        }
    </script>
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

    if (request.getParameter("register_dC") != null) {
        int register_ind = Integer.parseInt(request.getParameter("register_dC"));
        if (register_ind==100) {
            request.setAttribute("register_dC",111);
            out.print("alert(\"注册用户名已存在，请重新输入\")");
        }
    }

%>
<form action="deal_register.jsp" name="form_Check" id="form_Check" method="post" onSubmit="return ifNull(form_Check)">
    <span>用户注册</span><br>
    用户名：<input type="text" name="userName" id="userName" title="用户名">
    密&nbsp;&nbsp;码:<input type="text" name="userPassword" id="userPassword" title="用户名">
    <input type="submit" name="Submit" value="注册">
    <input type="reset" name="Reset" value="重置">
</form>
<%
    Enumeration<String> session_all = session.getAttributeNames();
    while (session_all.hasMoreElements()) {
        String app_name_old = session_all.nextElement();
        //String app_name_old_value = session_all.ge(app_name_old);
        out.println(app_name_old + "<br>");
        //out.println(app_name_old_value + "<br><br><br>");
    }
%>
</body>
</html>
