
<%@page import="test.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
       <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    </head>
    <body>
        <%
            Admin_Dao dao = new Admin_Dao();
            if(dao.Updatesubcat(request.getParameter("hf"),request.getParameter("txtsubname"),request.getParameter("txtcatid"))>0){
                out.print("<script type='text/javascript'>alert('Product Updated');window.location.href='index.jsp';</script>");
            }
            else{
               out.print("<script type='text/javascript'>alert('Product not Updated');window.location.href='index.jsp';</script>");
            }
            %>
    </body>
</html>