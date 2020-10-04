
<%@page import="com.oreilly.servlet.*,test.*"%>
<%@page import="test.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="pojo" class="test.Category_Pojo"></jsp:useBean>
        <jsp:useBean id="dao" class="test.Admin_Dao"></jsp:useBean>
       <%   
           MultipartRequest m = new MultipartRequest(request,"E://NetbeansProject/Fyndall/web/admin/img");
            String name = m.getParameter("txtcatname");
            String filename = m.getFilesystemName("txtcatimg");
            if(dao.Category_Registration(name,filename)>0){
                out.print("<script type='text/javascript'>alert('Category added');window.location.href='category.jsp';</script>");
            }
            else{
                out.print("<script type='text/javascript'>alert('Category not added');window.location.href='index.jsp';</script>");
            }
                %>
    </body>
</html>

