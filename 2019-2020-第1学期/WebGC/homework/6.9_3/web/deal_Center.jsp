<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: yaowei
  Date: 2019/9/7
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String userName_dC = request.getParameter("userName");
    String userPassword_dC = request.getParameter("userPassword");
    String app_name_old;
    String app_name_old_value;

    Enumeration<String> application_all = application.getAttributeNames();
    while (application_all.hasMoreElements()) {
        app_name_old = application_all.nextElement();
        app_name_old_value = application.getInitParameter(app_name_old);
        if (userName_dC.equals(app_name_old_value)) {
            request.setAttribute("register_dC", 100);
            response.sendRedirect("index.jsp");
        }
    }
    application.setAttribute("userName",userName_dC);
    application.setAttribute("userPassword",userPassword_dC);
    response.sendRedirect("deal_success.jsp");
%>