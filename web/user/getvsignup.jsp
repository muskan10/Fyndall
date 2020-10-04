<%@page import="com.oreilly.servlet.*,test.*"%>
<%@page import="test.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <%
            MultipartRequest m = new MultipartRequest(request,"E://NetbeansProject/Fyndall/web/admin/img");
            
            String vname = m.getParameter("vname");
           
            String email = m.getParameter("email");
            String password = m.getParameter("v_pwd");
            String contact = m.getParameter("contact");
           
            String vendor_profile = m.getFilesystemName("txtimage");
            String category = m.getParameter("category");
           
            //out.print(vname+ email + contact);
                    
           
            Admin_Dao dao=new Admin_Dao();
            if(dao.Vendor_Registration(vname,email,password,contact,vendor_profile,category)>0)
            {
               response.sendRedirect("vsignin.jsp");
            }
            else
            {
                out.println("<script type='text/javascript'>alert('Invalid Id and password');window.location.href='vsignup.jsp';</script>");
            }
            

            %>
    </body>
</html>