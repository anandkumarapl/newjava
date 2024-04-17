package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import components.Utilities;
import java.sql.PreparedStatement;
import database.DbConnect;

public final class productmaster_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    \r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("<title>Content Page</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");
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
      out.write("\r\n");
      out.write("    <div>\r\n");
      out.write("        <center>\r\n");
      out.write("            <h1>Products</h1>\r\n");
      out.write("            ");


                String check = request.getParameter("check");
                String option = "";
                boolean ispostback;
                if (check == null) {
                    ispostback = false;
                } else {
                    ispostback = true;
                }

                String productid = "", productname = "", price = "", description = "", discount = "", measurement = "", productcategory = "", result = "";
                System.out.println(ispostback);

                if (ispostback) {
                    try {
                        option = request.getParameter("option");
                        if (option.equals("Submit")) {
                            productid = request.getParameter("productid");
                            productname = request.getParameter("productname");
                            price = request.getParameter("price");
                            description = request.getParameter("description");
                            discount = request.getParameter("discount");
                            measurement = request.getParameter("measurement");
                            productcategory = request.getParameter("productcategory");

                            PreparedStatement ps = DbConnect.connect().prepareStatement("insert into products values(productseq.nextval,?,?,?,?,?,?)");

                            ps.setString(1, productname);
                            ps.setString(2, price);
                            ps.setString(3, description);
                            ps.setString(4, discount);
                            ps.setString(5, measurement);
                            ps.setString(6, productcategory);

                            int n = ps.executeUpdate();
                            result = "Inserted " + n + " records";
                        }
                    } catch (Exception ex) {
                        System.out.println(ex);
                        result = ex.getMessage();
                    }
                }

            
      out.write("\r\n");
      out.write("            ");
      out.print(result);
      out.write("\r\n");
      out.write("            <!--***********************************************-->\r\n");
      out.write("            <div class=\"container text-center\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-3\"></div>\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <form method=\"post\">\r\n");
      out.write("                            <input type=\"hidden\" name=\"check\" value=\"1\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            productname<input class=\"form-control\" name=\"productname\" value=\"");
      out.print(productname);
      out.write("\" type=\"text\">\r\n");
      out.write("\r\n");
      out.write("                            price<input class=\"form-control\" name=\"price\" value=\"");
      out.print(price);
      out.write("\" type=\"number\">\r\n");
      out.write("                            description<input class=\"form-control\" name=\"description\" value=\"");
      out.print(description);
      out.write("\" type=\"text\">\r\n");
      out.write("\r\n");
      out.write("                            discount<input class=\"form-control\" name=\"discount\"value=\"");
      out.print(discount);
      out.write("\" type=\"number\">\r\n");
      out.write("\r\n");
      out.write("                            Measurement<input class=\"form-control\" name=\"measurement\" value=\"");
      out.print(measurement);
      out.write("\" type=\"text\">\r\n");
      out.write("                            Product Category<input class=\"form-control\" name=\"productcategory\" value=\"");
      out.print(productcategory);
      out.write("\" type=\"text\">\r\n");
      out.write("                            <input name=\"option\" type=\"submit\">\r\n");
      out.write("\r\n");
      out.write("                            <input name=\"option\" type=\"submit\" value=\"Clear\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-3\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--***********************************************-->\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-md-2\"></div>         \r\n");
      out.write("            <div class=\"col-md-8\">\r\n");
      out.write("            ");
      out.print(Utilities.getProductList());
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("             <div class=\"col-md-2\"></div>\r\n");
      out.write("            \r\n");
      out.write("                        </div>\r\n");
      out.write("                            \r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        </center>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write(" <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  \r\n");
      out.write(" <nav class=\"navbar navbar-dark bg-dark\">\r\n");
      out.write("  <!-- Navbar content -->\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-dark bg-primary\">\r\n");
      out.write("  <!-- Navbar content -->\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-light\" style=\"background-color: #e3f2fd;\">\r\n");
      out.write("  <!-- Navbar content -->\r\n");
      out.write("</nav>\r\n");
      out.write(" </body>\r\n");
      out.write("  </head>\r\n");
      out.write("</html>");
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
