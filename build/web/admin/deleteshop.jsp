<%@page import="test.*,java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%
            Admin_Dao dao = new Admin_Dao();
            if(dao.Delete_Shop(Integer.parseInt(request.getParameter("shopid")))>0){
                out.print("<script type='text/javascript'>alert('Product deleted');window.location.href='shopsrep.jsp';</script>");
            }
            else{
                out.print("<script type='text/javascript'>alert('Product not deleted');window.location.href='shopsrep.jsp';</script>");
            
            }
            %>
    </body>
</html>
