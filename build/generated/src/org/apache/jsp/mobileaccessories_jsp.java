package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public final class mobileaccessories_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
          ArrayList list1=new ArrayList();
                ArrayList list2=new ArrayList();
                ArrayList list3=new ArrayList();
                ArrayList list4=new ArrayList();
                
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gadget","root","root");
                PreparedStatement st=con.prepareStatement("select * from mobileaccessories ");
                ResultSet rs=st.executeQuery();

                while(rs.next())
                {
                    list1.add(rs.getString(1));
                    list2.add(rs.getString(2));
                    list3.add(rs.getString(3));
                    list4.add(rs.getString(4));                   
                }

      out.write("\n");
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
      out.write("        a\n");
      out.write("        {\n");
      out.write("          text-decoration:none;  \n");
      out.write("          color: black;\n");
      out.write("          font-weight: bold;         \n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("    <body background=\"background.jpg\">\n");
      out.write("        <form>   \n");
      out.write("                <input type=\"text\" placeholder=\" Search....\"name=\"Search\" style='margin-left:810px;'>   \n");
      out.write("               <button type=\"submit\">Search</button>   \n");
      out.write("        </form> \n");
      out.write("        \n");
      out.write("        <div style=\"width:47%;height:20px;margin-left:650px;margin-top:78px;background-color:white;margin-left: 800px;\">\n");
      out.write("            <table width= \"100%\" height=\"100%\" border=\"0\" style='margin-top:-80px;background-color: white;margin-left: 0px'>\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"home.jsp\">Home</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"products.jsp\">Products</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"feeds.jsp\">Feeds</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"login.jsp\">Login</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"microphone.jsp\"><img src='microphone.jpg' width='30px' height='30px'></a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"home.jsp\"><img src='cart.jpg' width='52px' height='52px'></a></td>\n");
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
      out.write("        <div style=\"width: 80%; height: 70%; background-color: lightblue;margin-left: 10%; margin-top: 5%;\">\n");
      out.write("            <table width=\"100%\" height=\"8%\" border=\"2\" style=\"background-color: lightblue; color: darkblue;\">\n");
      out.write("                <tr align=\"center\" bgcolor=\"lightblue\" style=\"width: 100%; height: 8%;\">\n");
      out.write("                <th>ACCESSORY</th>\n");
      out.write("                <th>COLOR</th>\n");
      out.write("                <th>PRICE</th>\n");
      out.write("                <th>AVAILABILITY</th>\n");
      out.write("            </tr>\n");
      out.write("             ");

                for(int i=0;i<list1.size();i++)
                {
            
      out.write("\n");
      out.write("            <tr align='center' bgcolor='lightblue'>\n");
      out.write("                <td>");
      out.print(list1.get(i));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(list2.get(i));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(list3.get(i));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(list4.get(i));
      out.write("</td>\n");
      out.write("               \n");
      out.write("            </tr>\n");
      out.write("    ");
}
      out.write("\n");
      out.write("     </table>\n");
      out.write("            \n");
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
