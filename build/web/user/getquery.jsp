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
        <jsp:useBean id="pojo" class="test.Query_Pojo"></jsp:useBean>
        <jsp:useBean id="dao" class="test.Admin_Dao"></jsp:useBean>
       <%
            if(dao.QueryRegistration(request.getParameter("uid"),request.getParameter("sc_name"),request.getParameter("query_des"),request.getParameter("hf"))>0){
                out.print("<script type='text/javascript'>alert('Query Posted');window.location.href='udash.jsp';</script>");
            }
            else{
                out.print("<script type='text/javascript'>alert('Sign up first');window.location.href='signup.jsp';</script>");
            }
                %>
    </body>
</html>

