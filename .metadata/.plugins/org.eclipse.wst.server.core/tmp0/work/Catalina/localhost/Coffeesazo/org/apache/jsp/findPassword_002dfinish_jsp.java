/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.40
 * Generated at: 2020-12-21 13:54:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class findPassword_002dfinish_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <!--favicon-->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"https://p7.hiclipart.com/preview/988/211/651/white-coffee-tea-cafe-computer-icons-cup-of-coffee-icon.jpg\">\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>COFFEESAZO</title>\r\n");
      out.write("    <link rel=“stylesheet” href=“./css/bootstrap.min.css” type=“text/css”> \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/index copy.css\" type=\"text/css\">\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.js\"\r\n");
      out.write("        integrity=\"sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <link href=\"./css/findPassword-finish.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <header class=\"header\">\r\n");
      out.write("        <div class=\"header-align\">\r\n");
      out.write("            <div class=\"header-logo\">\r\n");
      out.write("                <a href=\"#\"><img src=\"./img/logo_white.png\" class=\"logo\"></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"btns-signin-signup\">\r\n");
      out.write("                <span><a href=\"#\">로그인</a></span>\r\n");
      out.write("                <span><a href=\"#\">회원가입</a></span>\r\n");
      out.write("                <span><a href=\"#\">고객센터</a></span>\r\n");
      out.write("                <span><a href=\"#\"><img src=\"./img/shoppingcart_white.png\" id=\"shoppingcart\"></a></span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"shopping\">\r\n");
      out.write("            <span id=\"wholebean\"><a href=\"#\">원두</a></span>\r\n");
      out.write("            <!-- onmouseover 써볼지? (javascript)-->\r\n");
      out.write("            <span id=\"stickcoffee\"><a href=\"#\">스틱커피</a></span>\r\n");
      out.write("            <span id=\"capsulecoffee\"><a href=\"#\">캡슐커피</a></span>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"main-body\">\r\n");
      out.write("    <form>\r\n");
      out.write("        <div class=\"wrapper\">\r\n");
      out.write("            <p class=\"main-title\">비밀번호 재설정</p>\r\n");
      out.write("            <p>　</p>\r\n");
      out.write("            <p class=\"sub-title\">비밀번호가 정상적으로<br>변경 되었습니다.</p>\r\n");
      out.write("            <p>　</p>\r\n");
      out.write("            \r\n");
      out.write("            <p><input class=\"findid-button\" type=\"button\" value=\"로그인 하러 가기\"\r\n");
      out.write("                onclick=\"location.href='login2.html'\">\r\n");
      out.write("            </p>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </section>\r\n");
      out.write("    <footer>\r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("            <ul class=\"footer-list-box\">\r\n");
      out.write("                <li>COFFEESAZO | 대표자: 이지현 | 사업자등록번호 123-45-67890</li>\r\n");
      out.write("                <li>서울특별시 영등포구 선유도2로 57 이레빌딩(구관) 19F</li>\r\n");
      out.write("                <li>책임자: 제윤지 | 개인정보관리책임자: 김은규</li>\r\n");
      out.write("                <li>고객센터 02-1234-5678 | E-mail: customer@coffeesazo.com</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
