<%@page import="com.oreilly.servlet.*,test.*"%>
<%@page import="test.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
       <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    </head>
    <body>
        <%
            Admin_Dao dao = new Admin_Dao();
            MultipartRequest m = new MultipartRequest(request,"E://NetbeansProject/Fyndall/web/admin/img");
            
            if(dao.Updateshop(m.getParameter("hf"),m.getParameter("shopname"),m.getParameter("shopcat"),m.getParameter("shopadd"),m.getParameter("shopprofile"),m.getParameter("shopland"),m.getParameter("shopvid"))>0){
                out.print("<script type='text/javascript'>alert('Shop Updated');window.location.href='shopsrep.jsp';</script>");
            }
            else{
               out.print("<script type='text/javascript'>alert('Shop not Updated');window.location.href='shopsrep.jsp';</script>");
            }
            %>
    </body>
</html>
