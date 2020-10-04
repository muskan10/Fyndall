<%-- 
    Document   : getLogin
    Created on : Jan 14, 2020, 1:10:00 PM
    Author     : muskan verma
--%>
<%@page import="com.oreilly.servlet.*,test.*"%>
<%@page import="test.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="pojo" class="test.shop_Pojo"></jsp:useBean>
        <jsp:useBean id="dao" class="test.Admin_Dao"></jsp:useBean>
       <%    MultipartRequest m = new MultipartRequest(request,"E://NetbeansProject/Fyndall/web/admin/img");
          
            if(dao.Shop_Registration(m.getParameter("shopname"),m.getParameter("shopcat"),m.getParameter("shopadd"),m.getFilesystemName("shopprofile"),m.getParameter("shopland"),m.getParameter("shopvid"))>0){
                out.print("<script type='text/javascript'>alert('Shop added');window.location.href='index.jsp';</script>");
            }
            else{
                out.print("<script type='text/javascript'>alert('Shop not added');window.location.href='shops.jsp';</script>");
            }
                %>
    </body>
</html>

