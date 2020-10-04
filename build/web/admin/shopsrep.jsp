
<!DOCTYPE html>
<%@page import="test.*" %>
<html lang="en">
<head>
<title>Matrix Admin</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="css/uniform.css" />
<link rel="stylesheet" href="css/select2.css" />
<link rel="stylesheet" href="css/matrix-style.css" />
<link rel="stylesheet" href="css/matrix-media.css" />
<link href="font-awesome/css/font-awesome.css" rel="stylesheet" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
</head>
<body>

<!--Header-part-->
<div id="header">
  <h1><a href="dashboard.html">Matrix Admin</a></h1>
</div>
<!--close-Header-part--> 

<!--top-Header-menu-->

<!--start-top-serch-->
<div id="search">
  <input type="text" placeholder="Search here..."/>
  <button type="submit" class="tip-bottom" title="Search"><i class="icon-search icon-white"></i></button>
</div>
<!--close-top-serch--> 

<!--sidebar-menu-->
<jsp:include page="nav.jsp"></jsp:include>
<div id="content">
  <div id="content-header">
    <h1>Shop Report</h1>
  </div>
  <div class="container-fluid">
    <hr>
    <div class="row-fluid">
      <div class="span12">
        
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"><i class="icon-th"></i></span>
            <h5>Data table</h5>
          </div>
          <div class="widget-content nopadding">
            <table class="table table-bordered data-table">
              <thead>
                <tr>
                  <th>Shop Id</th>
                  <th>Shop Name</th>
                  <th>Shop Category</th>
                  <th>Shop Address</th>
                  <th>Shop Profile</th>
                  <th>Shop Landmark</th>
                  <th>Shop Vendor ID</th>
                  <th>Edit</th>
                  <th>Remove</th>
                </tr>
              </thead>
              <tbody>
                  <%
                  Admin_Dao dao=new Admin_Dao();
                  java.util.ArrayList<shop_Pojo> data=dao.FetchShop();
                  for(shop_Pojo pojo:data)
                  {
                  %>
                <tr class="gradeX">
                   <td><%=pojo.getShopid()%></td>
                  <td><%=pojo.getShop_name()%></td>
                  <td><%=pojo.getShop_cat()%></td>
                  <td><%=pojo.getShop_add()%></td>
                  <td><img src="../admin/img/<%=pojo.getShop_profile()%>" width="100px" height="100px" alt="Resource Not Found"/></td>
                  <td><%=pojo.getLandmark()%></td>
                  <td><%=pojo.getVid()%></td>
                  <td><a href="editshop.jsp?shopid=<%=pojo.getShopid()%>"><img src="image/edit.png" width="30px" height="30px"/></a></td>
                  <td><a href="deleteshop.jsp?shopid=<%=pojo.getShopid()%>"><img src="image/delete.png" width="30px" height="30px"/></a></td>

                </tr>
                <% } %>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<!--Footer-part-->
<div class="row-fluid">
  <div id="footer" class="span12"> 2013 &copy; Matrix Admin. Brought to you by <a href="http://themedesigner.in">Themedesigner.in</a> </div>
</div>
<!--end-Footer-part-->
<script src="js/jquery.min.js"></script> 
<script src="js/jquery.ui.custom.js"></script> 
<script src="js/bootstrap.min.js"></script> 
<script src="js/jquery.uniform.js"></script> 
<script src="js/select2.min.js"></script> 
<script src="js/jquery.dataTables.min.js"></script> 
<script src="js/matrix.js"></script> 
<script src="js/matrix.tables.js"></script>
</body>
</html>
