<%@page import="test.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%
            Admin_Dao dao = new Admin_Dao();
            if(dao.Delete_SubCat(Integer.parseInt(request.getParameter("sid")))>0){
                out.print("<script type='text/javascript'>alert('Product deleted');window.location.href='subcatrep.jsp';</script>");
            }
            else{
                out.print("<script type='text/javascript'>alert('Product not deleted');window.location.href='subcatrep.jsp';</script>");
            
            }
            %>
    </body>
</html>
