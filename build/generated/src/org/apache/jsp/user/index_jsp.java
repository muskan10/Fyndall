package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import test.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>FYNDALL</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"><!-- bootstrap-CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap-select.css\"><!-- bootstrap-select-CSS -->\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" /><!-- style.css -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" /><!-- flexslider-CSS -->\n");
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
      out.write("</head>\n");
      out.write("<body>\t\n");
      out.write("\t\t<!-- Navigation -->\n");
      out.write("\t\t        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "nav.jsp", out, false);
      out.write("\n");
      out.write("\t<!-- //header -->\n");
      out.write("\t<!-- Slider -->\n");
      out.write("\t\t<div class=\"slider\">\n");
      out.write("\t\t\t<ul class=\"rslides\" id=\"slider\">\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div class=\"w3ls-slide-text\">\n");
      out.write("\t\t\t\t\t\t<h3>Find anything at the Nth time</h3>\n");
      out.write("\t\t\t\t\t\t<a href=\"categoryslider.jsp\" class=\"w3layouts-explore-all\">Browse all Categories</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div class=\"w3ls-slide-text\">\n");
      out.write("\t\t\t\t\t\t<h3>Find the Best Deals Here</h3>\n");
      out.write("\t\t\t\t\t\t<a href=\"categoryslider.jsp\" class=\"w3layouts-explore\">Explore</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div class=\"w3ls-slide-text\">\n");
      out.write("\t\t\t\t\t\t<h3>Find the Best House Appliances</h3>\n");
      out.write("\t\t\t\t\t\t<a href=\"categoryslider.jsp\" class=\"w3layouts-explore\">Explore</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div class=\"w3ls-slide-text\">\n");
      out.write("\t\t\t\t\t\t<h3>Find your dream ride</h3>\n");
      out.write("\t\t\t\t\t\t<a href=\"categoryslider.jsp\" class=\"w3layouts-explore\">Explore</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"main-content\">\n");
      out.write("\t\t\t<div class=\"w3-categories\">\n");
      out.write("\t\t\t\t<h3>Browse Categories</h3>\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t  ");

                  Admin_Dao dao=new Admin_Dao();
                  java.util.ArrayList<Category_Pojo> data=dao.FetchCat();
                  for(Category_Pojo pojo:data)
                  {
                  
      out.write("\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"col-md-3\">\n");
      out.write("                                        <div class=\"focus-grid w3layouts-boder1\" >\n");
      out.write("                                                    <a class=\"btn-8\" href=\"categories.jsp?cid=");
      out.print(pojo.getCid());
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"focus-border\">\n");
      out.write("                                                                    <div class=\"focus-layout\" style=\"background-color: lightcoral\">\n");
      out.write("                                                                          \n");
      out.write("                                                                            <div class=\"focus-image\"><img src=\"../admin/img/");
      out.print(pojo.getCimage());
      out.write("\" style=\"width:150px;height:110px;border-radius:50px\"/></div>\n");
      out.write("                                                                            <h4 class=\"clrchg\"><b>");
      out.print(pojo.getCname());
      out.write("</b></h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                                                        ");
 }
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        <!--footer section end-->\n");
      out.write("\t\t<!-- Navigation-Js-->\n");
      out.write("\t\t\t<script type=\"text/javascript\" src=\"js/main.js\"></script>\n");
      out.write("\t\t\t<script type=\"text/javascript\" src=\"js/classie.js\"></script>\n");
      out.write("\t\t<!-- //Navigation-Js-->\n");
      out.write("\t\t<!-- js -->\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("\t\t<!-- js -->\n");
      out.write("\t\t<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("\t\t<script src=\"js/bootstrap.js\"></script>\n");
      out.write("\t\t<script src=\"js/bootstrap-select.js\"></script>\n");
      out.write("\t\t<script>\n");
      out.write("\t\t  $(document).ready(function () {\n");
      out.write("\t\t\tvar mySelect = $('#first-disabled2');\n");
      out.write("\n");
      out.write("\t\t\t$('#special').on('click', function () {\n");
      out.write("\t\t\t  mySelect.find('option:selected').prop('disabled', true);\n");
      out.write("\t\t\t  mySelect.selectpicker('refresh');\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t$('#special2').on('click', function () {\n");
      out.write("\t\t\t  mySelect.find('option:disabled').prop('disabled', false);\n");
      out.write("\t\t\t  mySelect.selectpicker('refresh');\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t$('#basic2').selectpicker({\n");
      out.write("\t\t\t  liveSearch: true,\n");
      out.write("\t\t\t  maxOptions: 1\n");
      out.write("\t\t\t});\n");
      out.write("\t\t  });\n");
      out.write("\t\t</script>\n");
      out.write("\t\t<!-- language-select -->\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery.leanModal.min.js\"></script>\n");
      out.write("\t\t<link href=\"css/jquery.uls.css\" rel=\"stylesheet\"/>\n");
      out.write("\t\t<link href=\"css/jquery.uls.grid.css\" rel=\"stylesheet\"/>\n");
      out.write("\t\t<link href=\"css/jquery.uls.lcd.css\" rel=\"stylesheet\"/>\n");
      out.write("\t\t<!-- Source -->\n");
      out.write("\t\t<script src=\"js/jquery.uls.data.js\"></script>\n");
      out.write("\t\t<script src=\"js/jquery.uls.data.utils.js\"></script>\n");
      out.write("\t\t<script src=\"js/jquery.uls.lcd.js\"></script>\n");
      out.write("\t\t<script src=\"js/jquery.uls.languagefilter.js\"></script>\n");
      out.write("\t\t<script src=\"js/jquery.uls.regionfilter.js\"></script>\n");
      out.write("\t\t<script src=\"js/jquery.uls.core.js\"></script>\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\t\t\t$( document ).ready( function() {\n");
      out.write("\t\t\t\t\t\t$( '.uls-trigger' ).uls( {\n");
      out.write("\t\t\t\t\t\t\tonSelect : function( language ) {\n");
      out.write("\t\t\t\t\t\t\t\tvar languageName = $.uls.data.getAutonym( language );\n");
      out.write("\t\t\t\t\t\t\t\t$( '.uls-trigger' ).text( languageName );\n");
      out.write("\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\tquickList: ['en', 'hi', 'he', 'ml', 'ta', 'fr'] //FIXME\n");
      out.write("\t\t\t\t\t\t} );\n");
      out.write("\t\t\t\t\t} );\n");
      out.write("\t\t\t\t</script>\n");
      out.write("\t\t<!-- //language-select -->\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery.flexisel.js\"></script><!-- flexisel-js -->\t\n");
      out.write("\t\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t\t $(window).load(function() {\n");
      out.write("\t\t\t\t\t\t\t$(\"#flexiselDemo3\").flexisel({\n");
      out.write("\t\t\t\t\t\t\t\tvisibleItems:1,\n");
      out.write("\t\t\t\t\t\t\t\tanimationSpeed: 1000,\n");
      out.write("\t\t\t\t\t\t\t\tautoPlay: true,\n");
      out.write("\t\t\t\t\t\t\t\tautoPlaySpeed: 5000,    \t\t\n");
      out.write("\t\t\t\t\t\t\t\tpauseOnHover: true,\n");
      out.write("\t\t\t\t\t\t\t\tenableResponsiveBreakpoints: true,\n");
      out.write("\t\t\t\t\t\t\t\tresponsiveBreakpoints: { \n");
      out.write("\t\t\t\t\t\t\t\t\tportrait: { \n");
      out.write("\t\t\t\t\t\t\t\t\t\tchangePoint:480,\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvisibleItems:1\n");
      out.write("\t\t\t\t\t\t\t\t\t}, \n");
      out.write("\t\t\t\t\t\t\t\t\tlandscape: { \n");
      out.write("\t\t\t\t\t\t\t\t\t\tchangePoint:640,\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvisibleItems:1\n");
      out.write("\t\t\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\t\t\ttablet: { \n");
      out.write("\t\t\t\t\t\t\t\t\t\tchangePoint:768,\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvisibleItems:1\n");
      out.write("\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t   </script>\n");
      out.write("\t\t<!-- Slider-JavaScript -->\n");
      out.write("\t\t\t<script src=\"js/responsiveslides.min.js\"></script>\t\n");
      out.write("\t\t\t <script>\n");
      out.write("\t\t\t$(function () {\t\n");
      out.write("\t\t\t  $(\"#slider\").responsiveSlides({\n");
      out.write("\t\t\t\tauto: true,\n");
      out.write("\t\t\t\tpager: false,\n");
      out.write("\t\t\t\tnav: true,\n");
      out.write("\t\t\t\tspeed: 500,\n");
      out.write("\t\t\t\tmaxwidth: 800,\n");
      out.write("\t\t\t\tnamespace: \"large-btns\"\n");
      out.write("\t\t\t  });\n");
      out.write("\n");
      out.write("\t\t\t});\n");
      out.write("\t\t  </script>\n");
      out.write("\t\t<!-- //Slider-JavaScript -->\n");
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
      out.write("</body>\t\t\n");
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
