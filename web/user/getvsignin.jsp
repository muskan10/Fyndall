<%@page import="test.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <%

            String email=request.getParameter("email");
            out.print("Welcome Vendor :"+email);
            

            session.setAttribute("email", email);
            
        
        %> 
        
        <%
            
            
            Admin_Dao dao=new Admin_Dao();
            if(dao.checkVendor(request.getParameter("email"),request.getParameter("v_pwd"))>0)
            {
               response.sendRedirect("vendordash.jsp");
            }
            else
            {
                out.println("<script type='text/javascript'>alert('Invalid Id and password');window.location.href='vsignin.jsp';</script>");
            }
            %>
    </body>
</html>