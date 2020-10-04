package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class postad_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!--\n");
      out.write("Author: W3layouts\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Fyndall| Post Ad</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"><!-- bootstrap-CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap-select.css\"><!-- bootstrap-select-CSS -->\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" /><!-- style.css -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" /><!-- fontawesome-CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/menu_sideslide.css\" type=\"text/css\" media=\"all\"><!-- Navigation-CSS -->\n");
      out.write("<!-- meta tags -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Resale Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- //meta tags -->\n");
      out.write("<!--fonts-->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Ubuntu+Condensed' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>\n");
      out.write("<!--//fonts-->\t\n");
      out.write("<!-- js -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("<!-- js -->\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<script src=\"js/bootstrap.js\"></script>\n");
      out.write("<script src=\"js/bootstrap-select.js\"></script>\n");
      out.write("<script>\n");
      out.write("  $(document).ready(function () {\n");
      out.write("    var mySelect = $('#first-disabled2');\n");
      out.write("\n");
      out.write("    $('#special').on('click', function () {\n");
      out.write("      mySelect.find('option:selected').prop('disabled', true);\n");
      out.write("      mySelect.selectpicker('refresh');\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    $('#special2').on('click', function () {\n");
      out.write("      mySelect.find('option:disabled').prop('disabled', false);\n");
      out.write("      mySelect.selectpicker('refresh');\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    $('#basic2').selectpicker({\n");
      out.write("      liveSearch: true,\n");
      out.write("      maxOptions: 1\n");
      out.write("    });\n");
      out.write("  });\n");
      out.write("</script>\n");
      out.write("<!-- language-select -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.leanModal.min.js\"></script>\n");
      out.write("<link href=\"css/jquery.uls.css\" rel=\"stylesheet\"/>\n");
      out.write("<link href=\"css/jquery.uls.grid.css\" rel=\"stylesheet\"/>\n");
      out.write("<link href=\"css/jquery.uls.lcd.css\" rel=\"stylesheet\"/>\n");
      out.write("<!-- Source -->\n");
      out.write("<script src=\"js/jquery.uls.data.js\"></script>\n");
      out.write("<script src=\"js/jquery.uls.data.utils.js\"></script>\n");
      out.write("<script src=\"js/jquery.uls.lcd.js\"></script>\n");
      out.write("<script src=\"js/jquery.uls.languagefilter.js\"></script>\n");
      out.write("<script src=\"js/jquery.uls.regionfilter.js\"></script>\n");
      out.write("<script src=\"js/jquery.uls.core.js\"></script>\n");
      out.write("<script>\n");
      out.write("\t\t\t$( document ).ready( function() {\n");
      out.write("\t\t\t\t$( '.uls-trigger' ).uls( {\n");
      out.write("\t\t\t\t\tonSelect : function( language ) {\n");
      out.write("\t\t\t\t\t\tvar languageName = $.uls.data.getAutonym( language );\n");
      out.write("\t\t\t\t\t\t$( '.uls-trigger' ).text( languageName );\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tquickList: ['en', 'hi', 'he', 'ml', 'ta', 'fr'] //FIXME\n");
      out.write("\t\t\t\t} );\n");
      out.write("\t\t\t} );\n");
      out.write("\t\t</script>\n");
      out.write("<!-- //language-select -->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!-- Navigation -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "nav.jsp", out, false);
      out.write("\t\n");
      out.write("        <!-- //header -->\n");
      out.write("\t<!-- breadcrumbs -->\n");
      out.write("\t<div class=\"w3layouts-breadcrumbs text-center\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<span class=\"agile-breadcrumbs\"><a href=\"index.jsp\"><i class=\"fa fa-home home_1\"></i></a> / <span>Post your Ad</span></span>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- //breadcrumbs -->\n");
      out.write("\t<!-- Submit Ad -->\n");
      out.write("\t<div class=\"submit-ad main-grid-border\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h2 class=\"w3-head\">Post an Ad</h2>\n");
      out.write("\t\t\t<div class=\"post-ad-form\">\n");
      out.write("\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t<label>Select Category <span>*</span></label>\n");
      out.write("\t\t\t\t\t<select class=\"\">\n");
      out.write("\t\t\t\t\t  <option>Select Category</option>\n");
      out.write("\t\t\t\t\t  <option>Mobiles</option>\n");
      out.write("\t\t\t\t\t  <option>Electronics and Appliances</option>\n");
      out.write("\t\t\t\t\t  <option>Cars</option>\n");
      out.write("\t\t\t\t\t  <option>Bikes</option>\n");
      out.write("\t\t\t\t\t  <option>Furniture</option>\n");
      out.write("\t\t\t\t\t  <option>Pets</option>\n");
      out.write("\t\t\t\t\t  <option>Books, Sports and hobbies</option>\n");
      out.write("\t\t\t\t\t  <option>Fashion</option>\n");
      out.write("\t\t\t\t\t  <option>Kids</option>\n");
      out.write("\t\t\t\t\t  <option>Services</option>\n");
      out.write("\t\t\t\t\t  <option>Real, Estate</option>\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t<label>Add Title <span>*</span></label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"phone\" placeholder=\"\">\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t<label>Add Description <span>*</span></label>\n");
      out.write("\t\t\t\t\t<textarea class=\"mess\" placeholder=\"Few lines about your Product\"></textarea>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t<div class=\"upload-ad-photos\">\n");
      out.write("\t\t\t\t<label>Photos for your ad :</label>\t\n");
      out.write("\t\t\t\t\t<div class=\"photos-upload-view\">\n");
      out.write("\t\t\t\t\t\t<form id=\"upload\" action=\"index.html\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" id=\"MAX_FILE_SIZE\" name=\"MAX_FILE_SIZE\" value=\"300000\" />\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"file\" id=\"fileselect\" name=\"fileselect[]\" multiple=\"multiple\" />\n");
      out.write("\t\t\t\t\t\t\t<div id=\"filedrag\">or drop files here</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div id=\"submitbutton\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\">Upload Files</button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div id=\"messages\">\n");
      out.write("\t\t\t\t\t\t<p>Status Messages</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t<script src=\"js/filedrag.js\"></script>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"personal-details\">\n");
      out.write("\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t<label>Your Name <span>*</span></label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"name\" placeholder=\"\">\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t<label>Your Mobile No <span>*</span></label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"phone\" placeholder=\"\">\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t<label>Your Email Address<span>*</span></label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"email\" placeholder=\"\">\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t<p class=\"post-terms\">By clicking <strong>post Button</strong> you accept our <a href=\"terms.html\" target=\"_blank\">Terms of Use </a> and <a href=\"privacy.html\" target=\"_blank\">Privacy Policy</a></p>\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"Post\"> <a href=\"save.jsp?page=1\">View Category</a>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\n");
      out.write("\t</div>\n");
      out.write("\t<!-- // Submit Ad -->\n");
      out.write("\t<!--footer section start-->\t\t\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        <!--footer section end-->\n");
      out.write("</body>\n");
      out.write("\t\t<!-- Navigation-JavaScript -->\n");
      out.write("\t\t\t<script src=\"js/classie.js\"></script>\n");
      out.write("\t\t\t<script src=\"js/main.js\"></script>\n");
      out.write("\t\t<!-- //Navigation-JavaScript -->\n");
      out.write("\t\t<!-- here stars scrolling icon -->\n");
      out.write("\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t$(document).ready(function() {\n");
      out.write("\t\t\t\t\t/*\n");
      out.write("\t\t\t\t\t\tvar defaults = {\n");
      out.write("\t\t\t\t\t\tcontainerID: 'toTop', // fading element id\n");
      out.write("\t\t\t\t\t\tcontainerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("\t\t\t\t\t\tscrollSpeed: 1200,\n");
      out.write("\t\t\t\t\t\teasingType: 'linear' \n");
      out.write("\t\t\t\t\t\t};\n");
      out.write("\t\t\t\t\t*/\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t$().UItoTop({ easingType: 'easeOutQuart' });\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t</script>\n");
      out.write("\t\t\t<!-- start-smoth-scrolling -->\n");
      out.write("\t\t\t<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("\t\t\t<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\tjQuery(document).ready(function($) {\n");
      out.write("\t\t\t\t\t$(\".scroll\").click(function(event){\t\t\n");
      out.write("\t\t\t\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t</script>\n");
      out.write("\t\t\t<!-- start-smoth-scrolling -->\n");
      out.write("\t\t<!-- //here ends scrolling icon -->\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
