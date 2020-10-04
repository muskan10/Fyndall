<%-- 
    Document   : getLogin
    Created on : Jan 14, 2020, 1:10:00 PM
    Author     : muskan verma
--%>
<%@page import="test.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="pojo" class="test.query_response_Pojo"></jsp:useBean>
        <jsp:useBean id="dao" class="test.Admin_Dao"></jsp:useBean>
       <%
            if(dao.Query_response_Dao_Reg(request.getParameter("qid"),request.getParameter("uid"),request.getParameter("vid"),request.getParameter("res_text"),request.getParameter("hf"),request.getParameter("vcontact"))>0){
                out.print("<script type='text/javascript'>alert('Query Response sent');window.location.href='vendordash.jsp';</script>");
            }
            else{
                out.print("<script type='text/javascript'>alert('Error');window.location.href='queryresponded.jsp';</script>");
            }
                %>
    </body>
</html>

