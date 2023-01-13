package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("        .tdtheme\n");
      out.write("        {\n");
      out.write("            width:13%;\n");
      out.write("            background-color: white;\n");
      out.write("            height:10px;\n");
      out.write("            font-size:15px;\n");
      out.write("            font-family: arial;\n");
      out.write("        }\n");
      out.write("        .tdtheme:hover\n");
      out.write("        {\n");
      out.write("            background-color:#8FC1E3;\n");
      out.write("        }\n");
      out.write("        body\n");
      out.write("        {\n");
      out.write("            background-repeat:no-repeat;\n");
      out.write("            background-position:center bottom;\n");
      out.write("        }\n");
      out.write("        a{\n");
      out.write("          text-decoration:none;  \n");
      out.write("          color: black;\n");
      out.write("          font-weight: bold;         \n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <form>   \n");
      out.write("                <input type=\"text\" placeholder=\" Search....\"name=\"Search\" style='margin-left:810px;'>   \n");
      out.write("               <button type=\"submit\">Search</button>   \n");
      out.write("        </form> \n");
      out.write("        \n");
      out.write("       <div style=\"width:47%;height:20px;margin-left:650px;margin-top:78px;background-color:white;margin-left: 800px;\">\n");
      out.write("            <table width= \"100%\" height=\"100%\" border=\"0\" style='margin-top:-80px;background-color: white;margin-left: 0px'>\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"home.jsp\">Home</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"products.jsp\">Products</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"feeds.jsp\">Feeds</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"login.jsp\">Login</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"home.jsp\"><img src='Images/cart.jpg' width='52px' height='52px'></a></td>\n");
      out.write("                    <td><select style=\"width: 80px; height: 30px;margin-right: 60px\" onchange=\" location= this.value\">\n");
      out.write("                            <option value=\"\">More</option>\n");
      out.write("                        <option value=\"aboutus.jsp\">About Us</option>\n");
      out.write("                        <option value=\"expertiseprofiles.jsp\">Expertise Profiles</option>\n");
      out.write("                        <option value=\"location.jsp\">Location</a></option>\n");
      out.write("                        <option value=\"reviews.jsp\">Reviews</option>\n");
      out.write("                        <option value=\"complaints.jsp\">Complaints</option>\n");
      out.write("                        <option value=\"contactus.jsp\">Contact Us</option>\n");
      out.write("                </tr>\n");
      out.write("           </table>\n");
      out.write("        </div>\n");
      out.write("                <div style=\"width:40%;height:80px;margin-left:20px;margin-top:-45px;background-color:white;\">\n");
      out.write("            <table width=\"100%\" border=\"0\" style='margin-left: 11%; font-size: 40px;font-weight: bold;'>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        GADGET DUNIYA\n");
      out.write("                        <img src=\"Images/logo.jpg\" style=\"width: 80px; height: 75px; margin-left: -435px; margin-bottom:-25px;\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <img width=\"99.9%\" height=\"89.5%\" src=\"Images/background.jpg\" >\n");
      out.write("                <div style=\"width:40%;height: 65%;margin-left:85px;margin-top:-565px;background-color:white;opacity: 0.6;\">         \n");
      out.write("        </div>\n");
      out.write("           <div style=\"width:20%;height:35%;margin-left:225px;margin-top:-365px;background-color:white;opacity: 0.6;\">\n");
      out.write("            <table width=\"100%\" border=\"0\" style='padding-top: 80px; font-size: 30px;opacity: 1;color: goldenrod;text-align: center;font-weight: bold;'>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        GADGET DUNIYA\n");
      out.write("                        <hr>\n");
      out.write("                        We Can Fix That\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div style=\"width: 40% ;height: 65%; background-color: white; margin-top: -373px; margin-left: 54%;opacity: 0.9\">\n");
      out.write("            <table width=\"100%\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th style=\"font-size: 40px;text-decoration: underline;margin-right: 200px;\">About Us</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
