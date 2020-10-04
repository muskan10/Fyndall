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
            if(dao.User_Registration(request.getParameter("uid"),request.getParameter("uname"),request.getParameter("uemail"),request.getParameter("ucontact"),request.getParameter("upass"))>0){
               response.sendRedirect("signin.jsp");
            }
            else
            {
                out.println("<script type='text/javascript'>alert('Invalid Id and password');window.location.href='signup.jsp';</script>");
            }
            %>
    </body>
</html>
