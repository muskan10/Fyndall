<%@page import="test.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <%

            String email=request.getParameter("uemail");
            out.print("Welcome User :"+email);
            
            session.setAttribute("uemail", email);
            
        
        %> 
        <%
             Admin_Dao dao=new Admin_Dao();
            if(dao.checkUser(request.getParameter("uemail"),request.getParameter("upass"))>0)
            {
               response.sendRedirect("udash.jsp");
               
            }
            else
            {
                out.println("<script type='text/javascript'>alert('Invalid Id and password');window.location.href='signup.jsp';</script>");
            }
            %>
    </body>
</html>