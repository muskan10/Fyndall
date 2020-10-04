<%@page import="com.oreilly.servlet.*,test.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
       <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    </head>
    <body>
        
   <jsp:useBean id="pojo" class="test.Category_Pojo"></jsp:useBean>
        <jsp:useBean id="dao" class="test.Admin_Dao"></jsp:useBean>
       <%   MultipartRequest m = new MultipartRequest(request,"E://NetbeansProject/Fyndall/web/admin/img");
            
            if(dao.Updatecat(m.getParameter("hf"),m.getParameter("txtcatname"),m.getFilesystemName("txtcatimg"))>0){
                out.print("<script type='text/javascript'>alert('Category added');window.location.href='catrep.jsp';</script>");
            }
            else{
                out.print("<script type='text/javascript'>alert('Category not added');window.location.href='catrep.jsp';</script>");
            }
                %>
    </body>
</html>
