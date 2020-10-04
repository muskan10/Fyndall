<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<%@page import="test.*" %>
<html lang="en">
<head>
<title>Fyndall | Vendor Sign up</title>
<link rel="stylesheet" href="css/bootstrap.min.css"><!-- bootstrap-CSS -->
<link rel="stylesheet" href="css/bootstrap-select.css"><!-- bootstrap-select-CSS -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" /><!-- style.css -->
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
<!-- js -->
<script type="text/javascript" src="js/jquery.min.js"></script>
<!-- js -->
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/bootstrap.js"></script>
<script src="js/bootstrap-select.js"></script>
<script>
  $(document).ready(function () {
    var mySelect = $('#first-disabled2');

    $('#special').on('click', function () {
      mySelect.find('option:selected').prop('disabled', true);
      mySelect.selectpicker('refresh');
    });

    $('#special2').on('click', function () {
      mySelect.find('option:disabled').prop('disabled', false);
      mySelect.selectpicker('refresh');
    });

    $('#basic2').selectpicker({
      liveSearch: true,
      maxOptions: 1
    });
  });
</script>
<!-- language-select -->
<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>
<link href="css/jquery.uls.css" rel="stylesheet"/>
<link href="css/jquery.uls.grid.css" rel="stylesheet"/>
<link href="css/jquery.uls.lcd.css" rel="stylesheet"/>
<!-- Source -->
<script src="js/jquery.uls.data.js"></script>
<script src="js/jquery.uls.data.utils.js"></script>
<script src="js/jquery.uls.lcd.js"></script>
<script src="js/jquery.uls.languagefilter.js"></script>
<script src="js/jquery.uls.regionfilter.js"></script>
<script src="js/jquery.uls.core.js"></script>
<script>
			$( document ).ready( function() {
				$( '.uls-trigger' ).uls( {
					onSelect : function( language ) {
						var languageName = $.uls.data.getAutonym( language );
						$( '.uls-trigger' ).text( languageName );
					},
					quickList: ['en', 'hi', 'he', 'ml', 'ta', 'fr'] //FIXME
				} );
			} );
		</script>
<!-- //language-select -->
</head>
<body>
	<!-- Navigation -->
        <jsp:include page="nav.jsp"></jsp:include>	
        
        <!-- //Navigation -->
	<!-- header -->
	<!-- //header -->
	 <!-- sign up form -->
	 <section>
		<div id="agileits-sign-in-page" class="sign-in-wrapper">
			<div class="agileinfo_signin">
			<h3>Vendor Sign Up</h3>

                        <% try { %>
                        
                        <form action="getvsignup.jsp" method="post"  enctype="multipart/form-data">
                                    
                <script type="text/javascript">
                 function ajaxTest()
                    {
                        var email1=document.getElementById("email");
                        var ajaxRequest=null;
                        try{
                            ajaxRequest=new XMLHttpRequest();
                        }
                        catch(exception){
                            alert("Browser not Supported...");
                        }
                        ajaxRequest.onreadystatechange=function(){
                            if(ajaxRequest.readyState===4){
                                var n = ajaxRequest.responseText;
                                if(n==1){
                                    alert("Email already exist...");
                                    email1.value="";
                                }
                            }
                        }
                                var email=document.getElementById("email").value;
                                var url="getdata.jsp?email="+email;
                         
                        ajaxRequest.open("GET",url,true);
                        ajaxRequest.send(null);
                    }
                </script>
                                    
                                    <input type="text" name="vname" placeholder="Enter Your Name" required=""> 
					<input type="email" name="email" placeholder="Enter Your Email" id="email" onchange="AjaxTest()" required=""> 
                                        <input type="text" name="contact" placeholder="Contact Number" required="">
                                    
					<input type="password" name="v_pwd" placeholder="Enter Password" required=""> 
                                        <br>
                                        <p style="font-family: sans-serif;font-size: 17px"><b>Select Category:</b>
                                            <select required="" name="category" style="font-size: 15px">
                                                      <%
                  Admin_Dao dao=new Admin_Dao();
                  java.util.ArrayList<Category_Pojo> data=dao.FetchCat();
                  for(Category_Pojo pojo:data)
                  {
                  %>
                  
							<option><%=pojo.getCname()%></option>
                                                        <% } %>
                                            </select></p>
                                                <br>
                                             
                                        <label> Upload your Image </label>
                                        <input type="file" name="txtimage" required="">
                                        
                                        <br>
                                        
					<div class="signin-rit">
						<span class="agree-checkbox">
							<label class="checkbox"><input type="checkbox" name="checkbox">I agree to the <a class="w3layouts-t" href="terms.html" target="_blank">Terms of Use</a> and <a class="w3layouts-t" href="privacy.html" target="_blank">Privacy Policy</a></label>
						</span>
					</div>
					<input type="submit" value="Sign Up">
				</form>
                        <% }
                        catch(Exception e){
                           out.println("Exception");
                        }
                        
                        %>
                        
			</div>
		</div>
	</section>
	<!-- //sign up form -->
	<!--footer section start-->		
		 <jsp:include page="footer.jsp"></jsp:include>
        <!--footer section end-->
</body>

			
			<!-- start-smoth-scrolling -->
		<!-- //here ends scrolling icon -->
</html>