<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%
    request.setCharacterEncoding("utf-8");
    String userName_deal=request.getParameter("upload_UserName");
    String userMsg_deal=request.getParameter("upload_UserMsg");
    String message_add="["+userName_deal+"]说："+userMsg_deal+"<br>";

    int i;
    int num = Integer.parseInt(session.getAttribute("number_person").toString());
    int num_add = num+1;
    String[] message_old = (String[])session.getAttribute("message");
    String[] message_new = new String[num_add+1];
    if(session.getAttribute("number_person")!=null){
        if (num > 0) {
            for (i=0; i<num; i++) {
                message_new[i] = message_old[i];
            }
        }
        message_new[num_add-1] = message_add;
    }
    session.setAttribute("number_person",num_add);
    session.setAttribute("massage",message_new);
    response.sendRedirect("index.jsp");
%>
