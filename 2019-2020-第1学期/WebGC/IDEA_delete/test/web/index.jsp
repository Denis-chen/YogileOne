<%@ page language="java" contentType="text/html; charset=GB18030"
         pageEncoding="GB18030"%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=GB18030">
  <title>ǩд������Ϣ</title>
  <script language="javascript">
      function checkNull(form){
          for(i=0;i<form.length;i++){
              if(form.elements[i].value === ""){         //form������elements������eҪСд
                  alert("�ܱ�Ǹ��"+form.elements[i].title + "����Ϊ��!");
                  form.elements[i].focus();			//��ǰԪ�ػ�ȡ����
                  return false;
              }
          }
      }
  </script>
</head>
<body>
<%
    if(session.isNew()) {
        session.setAttribute("number_person",0);
    }
    int i;

    if(session.getAttribute("number_person")!=null) {
        int num = Integer.parseInt(session.getAttribute("number_person").toString());
        String[] massage_index = (String[])session.getAttribute("message");
        for (i=0; i<num; i++) {
            out.println(massage_index[i]);
        }
    }
%>
<br><hr></hr>
<form name="form1" method="post" action="deal.jsp" onSubmit="return checkNull(form1)">
  �����ˣ�&nbsp;&nbsp;
  <input name="author" type="text" id="author" size="30" title="������"><br>
  �������ݣ�
  <textarea name="content" cols="70" rows="10" title="��������" id="content"></textarea><br>
  <input name="Submit" type="submit" value="ǩд����">
  <input name="Submit2" type="reset" value="����">

</form>
</body>
</html>