<%@page import="test.*" %>
<html lang="en">
<head>
<title>FYNDALL</title>
<link rel="stylesheet" href="css/bootstrap.min.css"><!-- bootstrap-CSS -->
<link rel="stylesheet" href="css/bootstrap-select.css"><!-- bootstrap-select-CSS -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" /><!-- style.css -->
<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" /><!-- flexslider-CSS -->
<link rel="stylesheet" href="css/font-awesome.min.css" /><!-- fontawesome-CSS -->
<link rel="stylesheet" href="css/menu_sideslide.css" type="text/css" media="all"><!-- Navigation-CSS -->
<!-- meta tags -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Resale Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //meta tags -->
<!--fonts-->
<link href='//fonts.googleapis.com/css?family=Ubuntu+Condensed' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<!--//fonts-->	
</head>
    <body>
    <div class="agiletopbar">
			<div class="wthreenavigation">
				<div class="menu-wrap">
				<nav class="menu">
					<div class="icon-list">
						<a href="mobiles.html"><i class="fa fa-fw fa-mobile"></i><span>Mobiles</span></a>
						<a href="electronics-appliances.html"><i class="fa fa-fw fa-laptop"></i><span>Electronics and appliances</span></a>
						<a href="cars.html"><i class="fa fa-fw fa-car"></i><span>Cars</span></a>
						<a href="bikes.html"><i class="fa fa-fw fa-motorcycle"></i><span>Bikes</span></a>
						<a href="furnitures.html"><i class="fa fa-fw fa-wheelchair"></i><span>Furnitures</span></a>
						<a href="pets.html"><i class="fa fa-fw fa-paw"></i><span>Pets</span></a>
						<a href="books-sports-hobbies.html"><i class="fa fa-fw fa-book"></i><span>Books, Sports & Hobbies</span></a>
						<a href="fashion.html"><i class="fa fa-fw fa-asterisk"></i><span>Fashion</span></a>
						<a href="kids.html"><i class="fa fa-fw fa-asterisk"></i><span>Kids</span></a>
						<a href="services.html"><i class="fa fa-fw fa-shield"></i><span>Services</span></a>
						<a href="jobs.html"><i class="fa fa-fw fa-at"></i><span>Jobs</span></a>
						<a href="real-estate.html"><i class="fa fa-fw fa-home"></i><span>Real Estate</span></a>
					</div>
				</nav>
				<button class="close-button" id="close-button">Close Menu</button>
			</div>
			<button class="menu-button" id="open-button"> </button>
			</div>
			<div class="clearfix"></div>
		</div>
		<!-- //Navigation -->
	<!-- header -->
	<header>
            <div class="w3ls-header"><!--header-one--> 
			<div class="w3ls-header-left">
			</div>
	
			<div class="w3ls-header-right">
				<ul>
					
					<li class="dropdown head-dpdn">
						<a href="help.jsp"><i class="fa fa-question-circle" aria-hidden="true"></i> Help</a>
					</li>
					<li class="dropdown head-dpdn">
						<a href="#"><span class="active uls-trigger"><i class="fa fa-language" aria-hidden="true"></i>languages</span></a>
					</li>
					<li class="dropdown head-dpdn">
						<div class="header-right">			
	<!-- Large modal -->
			<div class="agile-its-selectregion">
				<button class="btn btn-primary" data-toggle="modal" data-target="#myModal">
				<i class="fa fa-globe" aria-hidden="true"></i>Select City</button>
					<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
					aria-hidden="true">
						<div class="modal-dialog modal-lg">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
										&times;</button>
									<h4 class="modal-title" id="myModalLabel">
										Please Choose Your Location</h4>
								</div>
								<div class="modal-body">
									 <form class="form-horizontal" action="#" method="get">
										<div class="form-group">
											<select id="basic2" class="show-tick form-control" multiple>
												<optgroup label="Popular Cities">
													<option selected style="display:none;color:#eee;">Select City</option>
													<option>Bhopal</option>
													<option>Indore</option>
													<option>Ujjain</option>
													<option>Jabalpur</option>
													<option>Mumbai</option>
													<option>Delhi</option>
													<option>Bengaluru</option>
													<option>Pune</option>
													<option>Chennai</option>
													<option>Lucknow</option>
													<option>Hyderabad</option>
						
												</optgroup>
															</select>
										</div>
									  </form>    
								</div>
							</div>
						</div>
					</div>
			</div>
		</div>
					</li>
				</ul>
			</div>
			
			<div class="clearfix"> </div> 
	

        
		<div class="container">
			<div class="agile-its-header">
				<div class="logo">
					<h1><a href="index.jsp">FYNDALL </a></h1>
				</div>
				<div class="agileits_search">
					<form action="#" method="post">
						<input name="Search" type="text" placeholder="Search" required="" />
						<select id="agileinfo_search" name="agileinfo_search" required="">
							<option value="">All Categories</option>
							<option value="Mobiles">Mobiles</option>
							<option value="Electronics & Appliances">Electronics & Appliances</option>
							<option value="Cars">Cars</option>
							<option value="Bikes">Bikes</option>
							<option value="Furnitures">Furnitures</option>
							<option value="Books, Sports & Hobbies">Books, Sports & Hobbies</option>
							<option value="Fashion">Fashion</option>
							<option value="Kids">Kids</option>
                                                        <option value="Services">Services</option>
							<option value="Real Estates">Real Estates</option>
						</select>
						<button type="submit" class="btn btn-default" aria-label="Left Align">
							<i class="fa fa-search" aria-hidden="true"> </i>
						</button>
					</form>
				
				</div>	
				<div class="clearfix"></div>
			</div>
		</div>
	</header>



<!dashboard-->

	<div class="w3layouts-breadcrumbs text-center">
		<div class="container">
			<span class="agile-breadcrumbs"><a href="index.jsp"><i class="fa fa-home home_1"></i></a> / <span>User Dashboard</span>
                            <i class="fa fa-user" style="margin-left: 300px;"></i> <span> <a>  
                           <%   
  
String email=(String)session.getAttribute("uemail");
out.print("Welcome User: "+email);  
  
%> 
                
                                </a></span>
                            <a href="index.jsp"><i class=" fa fa-sign-out" style="margin-left:250px;"></i>Sign Out</a></span>
                        
               
                
                </div>
	</div>
                            <br>
    <!--content-->                        
		<div class="col-md-5 page_1" style="margin-left: 50px">
			<div class="list-group list-group-alternate" style="margin-left: 50px"> 
				<a href="uinbox.jsp" class="list-group-item"><span class="badge"></span> <i class="ti ti-email"></i> Inbox </a> 
                                <br>
				<a href="userqueryresponse.jsp" class="list-group-item"><span class="badge badge-primary"></span> <i class="ti ti-eye"></i> Your Query's Response </a> 
                                <br>
                     
                                 
                                <a href="queryform.jsp" class="list-group-item"><span class="badge badge-danger"></span> <i class="ti ti-bell"></i> Post A new Query </a> 
                                <br>
                        </div>
	   </div>


	   <div class="clearfix"> </div>
	   
     
   
    
<jsp:include page="footer.jsp"></jsp:include>