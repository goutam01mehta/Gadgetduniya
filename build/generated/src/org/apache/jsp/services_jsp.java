package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class services_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("        a{\n");
      out.write("          text-decoration:none;  \n");
      out.write("          color: darkblue;\n");
      out.write("          font-weight: bold;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body background=\"background.jpg\">\n");
      out.write("        <form>   \n");
      out.write("            <input type=\"text\" placeholder=\" Search....\" name=\"search\" style='margin-left:810px;'>   \n");
      out.write("            <button type=\"submit\">Search</button>   \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <div style=\"width:47%;height:20px;margin-left:650px;margin-top:78px;background-color:white;margin-left: 800px\">\n");
      out.write("            <table width= \"100%\" height=\"100%\" border=\"0\" style='margin-top:-80px;background-color: white;margin-left: 0px'>\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"home.jsp\">Home</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"services.jsp\">Services</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"products.jsp\">Products</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"askit.jsp\">Ask it</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"offers.jsp\">Offers</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"feeds.jsp\">Feeds</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"login.jsp\">Login</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"microphone.jsp\"><img src='microphone.jpg' width='30px' height='30px'> </a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"home.jsp\"><img src='cart.jpg' width='52px' height='52px'></a></td>\n");
      out.write("                    <td><select style=\"width: 80px; height: 30px;margin-right: 60px\">\n");
      out.write("                        <option><a href=\"home.jsp\">More</a></option>\n");
      out.write("                        <option><a href=\"aboutus.jsp\">About Us</a></option>\n");
      out.write("                        <option><a href=\"expertiseprofiles.jsp\">Expertise Profiles</a></option>\n");
      out.write("                        <option><a href=\"location.jsp\">Location</a></option>\n");
      out.write("                        <option><a href=\"reviews.jsp\">Reviews</a></option>\n");
      out.write("                        <option><a href=\"complaints.jsp\">Complaints</a></option>\n");
      out.write("                        <option><a href=\"contactus.jsp\">Contact Us</a></option>\n");
      out.write("                </tr>\n");
      out.write("           </table>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"width:40%;height:80px;margin-left:20px;margin-top:-45px;background-color:white;\">\n");
      out.write("            <table width=\"100%\" border=\"0\" style='margin-left: 11%; font-size: 40px;font-weight: bold;'>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        GADGET DUNIYA\n");
      out.write("                        <img src=\"logo.jpg\" style=\"width: 80px; height: 75px; margin-left: -435px; margin-bottom:-25px;\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div style=\"width:30%;height:65%;margin-top:115px;background-color:white;\">\n");
      out.write("            <a href=\"cust.jsp\"><img src=\"book.jpg\" height=\"125px\" width=\"250px\" opacity=\"1\" style=\"margin-top: 340px; margin-left: 100px;opacity: 1;\"></a>\n");
      out.write("            <img src=\"Customization.jpg\" height=\"270px\" width=\"100%\" opacity=\"1\" style=\"margin-top: -465px; margin-left: 0px;opacity: 1;\">\n");
      out.write("            <table width=\"100%\" border=\"0\" style='margin-top: -170px; font-size: 40px;font-weight: bold;text-align: center;text-decoration: underline;'>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    Customize\n");
      out.write("                    </td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("            <table width=\"9%\" height=\"5%\" border=\"1\" style=\"background-color: lightblue; font-weight: bold; color: darkblue; font-size: 20px;\">\n");
      out.write("                <tr style=\"margin-top: 100px;\">\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"custreq.jsp\">\n");
      out.write("                            Your Requests\n");
      out.write("                        </a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        \n");
      out.write("        <div style=\"width:30%;height:65%;margin-left:35%;margin-top: -517px;background-color:white;\">\n");
      out.write("            <a href=\"rep.jsp\"><img src=\"book.jpg\" height=\"125px\" width=\"250px\" opacity=\"1\" style=\"margin-top: 340px; margin-left: 100px;opacity: 1;\"></a>\n");
      out.write("            <img src=\"Repair.jpg\" height=\"270px\" width=\"100%\" opacity=\"1\" style=\"margin-top: -465px; margin-left: 0px;opacity: 1;\">\n");
      out.write("            <table width=\"100%\" border=\"0\" style='margin-top: -170px; font-size: 40px;font-weight: bold;text-align: center;text-decoration: underline;'>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    Repair\n");
      out.write("                    </td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <table width=\"9%\" height=\"5%\" border=\"1\" style=\"background-color: lightblue; font-weight: bold; color: darkblue; font-size: 20px; margin-left: 35%\">\n");
      out.write("                <tr style=\"\">\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"repreq.jsp\">\n");
      out.write("                            Your Requests\n");
      out.write("                        </a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        \n");
      out.write("        <div style=\"width: 30%; height: 65%; background-color: white; margin-top: -517px; margin-left: 70%;background-color:white;\">\n");
      out.write("            <a href=\"cl.jsp\"><img src=\"book.jpg\" height=\"125px\" width=\"250px\" opacity=\"1\" style=\"margin-top: 340px; margin-left: 100px;opacity: 1;\"></a>\n");
      out.write("            <img src=\"Cleaning.jpg\" height=\"270px\" width=\"100%\" opacity=\"1\" style=\"margin-top: -465px; margin-left: 0px;opacity: 1;\">\n");
      out.write("            <table width=\"100%\" border=\"0\" style='margin-top: -170px; font-size: 40px;font-weight: bold; text-decoration: underline; text-align: center;'>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    Clean\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <table width=\"9%\" height=\"5%\" border=\"1\" style=\"background-color: lightblue; font-weight: bold; color: darkblue; font-size: 20px; margin-left: 70%;  \">\n");
      out.write("                <tr style=\"margin-top: 100px;\">\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"clreq.jsp\">\n");
      out.write("                            Your Requests\n");
      out.write("                        </a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>   \n");
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
