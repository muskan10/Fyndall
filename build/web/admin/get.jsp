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
        <%
            Admin_Dao dao=new Admin_Dao();
            if(dao.CheckAdmin(request.getParameter("txtname"),request.getParameter("txtpass"))>0){
               response.sendRedirect("index.jsp");
            }
            else
            {
                out.println("<script type='text/javascript'>alert('Invalid Id and password');window.location.href='login.html';</script>");
            }
            %>
    </body>
</html>
