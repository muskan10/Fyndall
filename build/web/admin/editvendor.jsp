<%@page import="test.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Matrix Admin</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
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
    <h1>Edit Vendor Registration</h1>
  </div>
  <div class="container-fluid"><hr>
    <div class="row-fluid">
      <div class="span12">
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-pencil"></i> </span>
            <h5>Form</h5>
          </div>
          <div class="widget-content nopadding">
            <form id="form-wizard" class="form-horizontal" method="post" action="updatevendor.jsp">
              <div id="form-wizard-1" class="step">
                             <%
                    int vid=Integer.parseInt(request.getParameter("vid"));
                    Admin_Dao dao = new Admin_Dao();
                    java.util.ArrayList<vendor_Pojo> data = dao.Editvendor(vid);
                    for(vendor_Pojo obj:data)
                    
                    {
                        %>
                        
       
                  <div class="control-group">
                  <label class="control-label">Vendor Name</label>
                  <div class="controls">
                      <input type="text" name="vname" value="<%=obj.getVname()%>" />
                  </div>
                </div>
                   <input type="hidden" value="<%=obj.getVid()%>" name="hf"/>
                  <div class="control-group">
                  <label class="control-label">Vendor Email</label>
                  <div class="controls">
                    <input type="email" name="vemail" value="<%=obj.getEmail()%>"/>
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label">Confirm Password</label>
                  <div class="controls">
                    <input type="password" name="vpass" value="<%=obj.getV_pwd()%>"/>
                  </div>
                </div>
                  <div class="control-group">
                  <label class="control-label">Vendor Contact </label>
                  <div class="controls">
                    <input type="text" name="vcontact" value="<%=obj.getContact()%>"/>
                  </div>
                </div>
                  <div class="control-group">
                  <label class="control-label">Vendor Profile</label>
                  <div class="controls">
                    <input type="text" name="vprofile" value="<%=obj.getVendor_profile()%>"/>
                  </div>
                </div>
              </div>
              
              <div class="form-actions">
                  <input type="submit" value="Submit" class="btn btn-success" />
                <div id="status"></div>
              </div>
              <div id="submitted"></div>
              <% } %>
            </form>
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
<script src="js/jquery.validate.js"></script> 
<script src="js/jquery.wizard.js"></script> 
<script src="js/matrix.js"></script> 
<script src="js/matrix.wizard.js"></script>
</body>
</html>
