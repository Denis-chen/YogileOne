<%@ page language="java" contentType="text/html; charset=GB18030"
         pageEncoding="GB18030"%>
<%
    request.setCharacterEncoding("GB18030");
    String author=request.getParameter("author");	//��ȡ������
    String content=request.getParameter("content");	//��ȡ��������
    String message_add="["+author+"]˵��"+content+"<br>";	//���������Ϣ


    int i;
    int num = Integer.parseInt(session.getAttribute("number_person").toString());
    int num_add = num+1;
    String[] massage_deal = (String[])session.getAttribute("message");
    String[] massage_temp = new String[num_add+1];
    if(session.getAttribute("number_person")!=null){
        if (num > 0) {
            for (i=0; i<num; i++) {
                massage_temp[i] = massage_deal[i];
            }
        }
        massage_temp[num_add-1] = message_add;
    }
    session.setAttribute("number_person",num_add);
    session.setAttribute("message",massage_temp);	//��������Ϣ���浽session��
    response.sendRedirect("index.jsp");
%>
