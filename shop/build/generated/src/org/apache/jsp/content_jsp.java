package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/menu.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <title>Content Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("<div>\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg bg-light\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">Navbar</a>\r\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\r\n");
      out.write("      <ul class=\"navbar-nav\">\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link active\" aria-current=\"page\" href=\"index.jsp\">Home</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item dropdown\">\r\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("          Sales\r\n");
      out.write("          </a>\r\n");
      out.write("          <ul class=\"dropdown-menu\">\r\n");
      out.write("               <li><a class=\"dropdown-item\" href=\"https://www.flipkart.com/\">big billion days</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item dropdown\">\r\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("          Pricing\r\n");
      out.write("          </a>\r\n");
      out.write("          <ul class=\"dropdown-menu\">\r\n");
      out.write("               <li><a class=\"dropdown-item\" href=\"https://www.amazon.in/\">indian great festival</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        \r\n");
      out.write("        <li class=\"nav-item dropdown\">\r\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("            Shop Management\r\n");
      out.write("          </a>\r\n");
      out.write("          <ul class=\"dropdown-menu\">\r\n");
      out.write("              \r\n");
      out.write("              <li><a class=\"dropdown-item\" href=\"productmaster.jsp\">Products Master</a></li>\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"productmasterstocks.jsp\">Product master Stock</a></li>\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"productselects.jsp\">product selects</a></li>\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"purchaseitem.jsp\">Purchase item</a></li>\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"sales2.jsp\">salse2</a></li>\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"\"></a></li> \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        \r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("    <div>\r\n");
      out.write("        <h1 style=\"text-align: center; background-color: lightblue;\">ABC Shop</h1>\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            Content\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("    <style>\r\n");
      out.write(".footer {\r\n");
      out.write("  position: fixed;\r\n");
      out.write("  left: 0;\r\n");
      out.write("  bottom: 0;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  background-color: orchid;\r\n");
      out.write("  color: white;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write(" \r\n");
      out.write("<div class=\" \">\r\n");
      out.write("  <p>Footer </p>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write('\r');
      out.write('\n');
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
