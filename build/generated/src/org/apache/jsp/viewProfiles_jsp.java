package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import bean.ProfileBean;

public final class viewProfiles_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>View Profiles</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            body{\n");
      out.write("               font-family:Arial;\n");
      out.write("               background:#ffe6f2;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .container{\n");
      out.write("               width:90%;\n");
      out.write("               margin:50px auto;\n");
      out.write("               background:white;\n");
      out.write("               padding:20px;\n");
      out.write("               border-radius:10px;\n");
      out.write("               box-shadow:0px 0px 10px gray;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            h2{\n");
      out.write("               text-align:center;\n");
      out.write("               color:#cc0066;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            table{\n");
      out.write("               width:100%;\n");
      out.write("               border-collapse:collapse;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            th,td{\n");
      out.write("               border:1px solid #ddd;\n");
      out.write("               padding:10px;\n");
      out.write("               text-align:left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th{\n");
      out.write("               background:#cc0066;\n");
      out.write("               color:white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("   <body>\n");
      out.write("       <div class=\"container\">\n");
      out.write("           <h2>All Profile</h2>\n");
      out.write("           \n");
      out.write("           <table>\n");
      out.write("               <tr>\n");
      out.write("                   <th>Student ID</th>\n");
      out.write("                   <th>Name</th>\n");
      out.write("                   <th>Programme</th>\n");
      out.write("                   <th>Email</th>\n");
      out.write("                   <th>Hobbies</th>\n");
      out.write("                   <th>Introduction</th>\n");
      out.write("                   <th>Edit</th>\n");
      out.write("                   <th>Delete</th>\n");
      out.write("               </tr>\n");
      out.write("               \n");
      out.write("               ");

                   List<ProfileBean> list = (List<ProfileBean>) request.getAttribute("list");
                   
                   for(ProfileBean p : list){
                
      out.write("\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( p.getStudentID());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( p.getName());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( p.getProgramme());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( p.getEmail());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( p.getHobbies());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( p.getIntroduction());
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"EditServlet?studentID=");
      out.print(p.getStudentID());
      out.write("\">\n");
      out.write("                        Edit\n");
      out.write("                        </a>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"DeleteServlet?studentID=");
      out.print(p.getStudentID());
      out.write("\" onclick=\"return confirm('Delete this profile?')\">\n");
      out.write("                        Delete\n");
      out.write("                        </a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                   }
               
      out.write("\n");
      out.write("           </table>\n");
      out.write("           <a href=\"profile.html\">Add New Profile</a>\n");
      out.write("       </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
