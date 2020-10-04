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
        <jsp:useBean id="pojo" class="test.vendor_Pojo"></jsp:useBean>
        <jsp:useBean id="dao" class="test.Admin_Dao"></jsp:useBean>
       <%
            if(dao.Vendor_Registration(request.getParameter("vname"),request.getParameter("vemail"),request.getParameter("vpass"),request.getParameter("vcontact"),request.getParameter("vprofile"))>0){
                out.print("<script type='text/javascript'>alert('Vendor added');window.location.href='index.jsp';</script>");
            }
            else{
                out.print("<script type='text/javascript'>alert('Shop not added');window.location.href='shops.jsp';</script>");
            }
                %>
    </body>
</html>

