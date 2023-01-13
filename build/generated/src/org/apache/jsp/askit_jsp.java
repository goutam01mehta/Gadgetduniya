package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

public final class askit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

    String button=request.getParameter("submit");
    if(button!=null)
    {
    String fullName=request.getParameter("fullN");
    String id=request.getParameter("email");
    String contactN=request.getParameter("contact");
    String req=request.getParameter("request");
    String date=request.getParameter("deadline");
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gadget","root","root");
    PreparedStatement st=con.prepareStatement("insert into askit values(?,?,?,?,?)");
    st.setString(1, fullName);
    st.setString(2, id);
    st.setString(3, contactN);
    st.setString(4, req);
    st.setString(5, date);
    st.executeUpdate();
    response.sendRedirect("request.jsp");
    }

      out.write("                     \n");
      out.write("\n");
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
      out.write("        .ask\n");
      out.write("        {\n");
      out.write("            font-size: 20px;\n");
      out.write("            font-family: arial;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        a{\n");
      out.write("          text-decoration:none;  \n");
      out.write("          color: black;\n");
      out.write("          font-weight: bold;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("    <body background=\"background.jpg\">\n");
      out.write("        <form>   \n");
      out.write("            <input type=\"text\" placeholder=\" Search....\" name=\"search\" style='margin-left:810px;'>   \n");
      out.write("            <button type=\"submit\">Search</button>   \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <div style=\"width:47%;height:20px;margin-left:650px;margin-top:78px;background-color:white;margin-left: 800px\">\n");
      out.write("            <table width= \"100%\" height=\"100%\" border=\"0\" style='margin-top:-80px;background-color: white;margin-left: 0px'>\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"userhome.jsp\">Home</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"services.jsp\">Services</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"userproducts.jsp\">Products</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"askit.jsp\">Ask it</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"userfeeds.jsp\">Feeds</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"sessiondestroy.jsp\">Logout</a></td>\n");
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
      out.write("\n");
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
      out.write("        \n");
      out.write("        <div align=\"center\" style=\"width: 14%; height: 5%; background-color: white; margin-left: 45%; margin-top: 1%; font-size: 25px; color: Black; font-weight: bold; padding-top: 10px\">\n");
      out.write("            REQUEST NOW\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <div style=\"width: 40%; height: 50%; background-color: white; margin-left: 45%; margin-top: 4%; margin-left: 30%;\">\n");
      out.write("             <form action=\"\">\n");
      out.write("            <table width=\"100%\" height=\"100%\" border=\"1\" cellspacing=\"2\" style=\"background-color: lightblue; color: darkblue; font-weight: bold;\">\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td colspan=\"2\" style=\"font-size: 20px; color: darkblue; font-weight: bold; text-decoration: underline;\">\n");
      out.write("                        ENTER THE DETAILS\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr align=\"center\" >\n");
      out.write("                    <td class=\"ask\" style=\" padding-right       : 250px;\">Full Name</td>\n");
      out.write("                    <td><input type=\"text\" placeholder=\"Enter full name...\" name=\"fullN\" style=\"width: 80%\"</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td class=\"ask\" style=\" padding-right: 250px;\">E-mail ID</td>\n");
      out.write("                    <td><input type=\"text\" placeholder=\"Enter e-mail id...\" name=\"email\"</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td class=\"ask\" style=\" padding-right: 190px;\">Contact Number</td>\n");
      out.write("                    <td><input type=\"text\" placeholder=\"Enter contact number...\" name=\"contact\"</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td class=\"ask\" style=\" padding-right: 260px;\">Request</td>\n");
      out.write("                    <td> <textarea input type=\"text\" placeholder=\"Enter your request...\" name=\"request\"></textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td class=\"ask\" style=\" padding-right: 250px;\">Deadline</td>\n");
      out.write("                    <td><input type=\"date\" placeholder=\"date\" name=\"deadline\"</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div style=\"width: 20%; height: 50%; background-color: white; margin-top: -370px;border-radius: 50px;\">\n");
      out.write("            <img src=\"askit1.jpg\" height=\"100%\" width=\"100%\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div style=\"width: 20%; height: 50%; background-color: white; margin-top: -370px; margin-left:1220px; border-radius: 50px;\">\n");
      out.write("            <img src=\"askit2.jpg\" height=\"100%\" width=\"100%\" style=\"border-radius: 50px;\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div style=\"width: 12%; height: 5%; background-color: lightblue;margin-left: 455px; margin-top: 0.5%\">\n");
      out.write("            <table width=\"100%\" height=\"100%\" border=\"2\" style=\"color: darkblue; font-weight: bold;font-size: 20px;\">\n");
      out.write("                <tr>\n");
      out.write("                    <td><a href=\"request.jsp\">\n");
      out.write("                        Your Requests\n");
      out.write("                    </a></td>\n");
      out.write("                </tr>\n");
      out.write("            </table> \n");
      out.write("        </div>\n");
      out.write("         \n");
      out.write("            <button name=\"submit\" type=\"submit\" style=\"height: 30px; width: 70px; margin-left: 995px; margin-top: -40px\">Submit</button>   \n");
      out.write("        </form>\n");
      out.write("        \n");
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
