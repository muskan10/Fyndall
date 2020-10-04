<%@page import="test.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  String email=request.getParameter("email");
  Admin_Dao dao = new Admin_Dao();
  if(dao.checkEmail(email)>0){
      out.println("1");
  }
  else
  {
      out.print("0");
  }
%>