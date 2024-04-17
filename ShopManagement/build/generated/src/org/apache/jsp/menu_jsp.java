package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div class=\"container\">\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg bg-light \">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"purchase.jsp\">Shop Management</a>\r\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\r\n");
      out.write("      <ul class=\"navbar-nav\">\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Home</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        \r\n");
      out.write("        <li class=\"nav-item dropdown\">\r\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("            Shop Management List\r\n");
      out.write("          </a>\r\n");
      out.write("          <ul class=\"dropdown-menu\">\r\n");
      out.write("              \r\n");
      out.write("              <li><a class=\"dropdown-item\" href=\"product.jsp\">Product</a></li>\r\n");
      out.write("              <li><a class=\"dropdown-item\" href=\"purchase.jsp\">Purchase</a></li>\r\n");
      out.write("              <li><a class=\"dropdown-item\" href=\"AllProducts.jsp\">All Products</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>       \r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("</nav>\r\n");
      out.write("</div> \r\n");
      out.write("    <div>\r\n");
      out.write("       <!-- <h1 style=\"text-align: center; background-color: lightblue;\">TODO</h1>-->\r\n");
      out.write("    </div>\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-dark bg-dark\">\r\n");
      out.write("  <!-- Navbar content -->\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-dark bg-primary\">\r\n");
      out.write("  <!-- Navbar content -->\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-light\" style=\"background-color: #e3f2fd;\">\r\n");
      out.write("  <!-- Navbar content -->\r\n");
      out.write("</nav>");
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
