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
        <jsp:useBean id="pojo" class="test.SubCategory_Pojo"></jsp:useBean>
        <jsp:useBean id="dao" class="test.Admin_Dao"></jsp:useBean>
       <%
            if(dao.SubCategory_Registration(request.getParameter("txtsubname"),request.getParameter("txtcatid"))>0){
                out.print("<script type='text/javascript'>alert('SubCategory added');window.location.href='subcategory.jsp';</script>");
            }
            else{
                out.print("<script type='text/javascript'>alert('SubCategory not added');window.location.href='index.jsp';</script>");
            }
                %>
    </body>
</html>

