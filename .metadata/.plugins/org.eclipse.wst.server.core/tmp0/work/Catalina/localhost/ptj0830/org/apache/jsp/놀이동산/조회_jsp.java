/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.79
 * Generated at: 2023-08-30 07:50:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.놀이동산;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class 조회_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("* {\r\n");
      out.write("	padding: 0px;\r\n");
      out.write("	margin: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("margin: 0 auto;\r\n");
      out.write("	width: 1890px;\r\n");
      out.write("	border: 5px solid skyblue;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	margin: 0 auto;\r\n");
      out.write("	width: 285px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("section div {\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul {\r\n");
      out.write("	list-style: none;\r\n");
      out.write("	width: 500px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul>li {\r\n");
      out.write("	padding: 10px;\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".b {\r\n");
      out.write("	width: 60%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table {\r\n");
      out.write("	margin: 0 auto;\r\n");
      out.write("	width: 350px;\r\n");
      out.write("	height: 150px;\r\n");
      out.write("	border: 1px solid skyblue;\r\n");
      out.write("	margin-bottom: 300px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	border: 1px solid skyblue;\r\n");
      out.write("}\r\n");
      out.write("a{\r\n");
      out.write("	color: black;\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("a:hover{\r\n");
      out.write("	color: skyblue;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write(" <script>\r\n");
      out.write(" \r\n");
      out.write("  function a(){\r\n");
      out.write("	   \r\n");
      out.write("	  let  userid  = document.querySelector(\"#userid\").value;	  \r\n");
      out.write("	  window.location.href=\"a_action.jsp?userid=\"+ userid;\r\n");
      out.write("	  \r\n");
      out.write("  }\r\n");
      out.write(" </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<header>\r\n");
      out.write("		<img alt=\"\" src=\"./img/로고.png\">\r\n");
      out.write("		<h2>🔵매표소 : 표 정보🔵</h2>\r\n");
      out.write("	</header>\r\n");
      out.write("	<nav>\r\n");
      out.write("		<hr>\r\n");
      out.write("		<ul>\r\n");
      out.write("			<li><a href=\"register.jsp\">회원가입</a></li>\r\n");
      out.write("			<li><a href=\"결제하기.jsp\">결제하기</a></li>\r\n");
      out.write("			<li><a href=\"조회.jsp\">사용자조회</a></li>\r\n");
      out.write("			<li><a href=\"manager_list.jsp\">관리자조회</a></li>\r\n");
      out.write("			<li><a href=\"index.jsp\">홈으로</a></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("		<hr>\r\n");
      out.write("	</nav>\r\n");
      out.write("	<section>\r\n");
      out.write("		<div>\r\n");
      out.write("			<img alt=\"\" src=\"./img/l마스코드.png\">\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"b\">\r\n");
      out.write("			<form name=\"frm\" action=\"조회_action.jsp\" method=\"post\"\r\n");
      out.write("				onsubmit=\"return check()\">\r\n");
      out.write("				<table>\r\n");
      out.write("\r\n");
      out.write("					<caption>\r\n");
      out.write("						<h1>🧿&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp🧿</h1>\r\n");
      out.write("					</caption>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>아이디 입력</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td><input type=\"text\"   id=\"userid\"></td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td><button><a href=\"javascript:a()\">입력완료</a></button></td>\r\n");
      out.write("					</tr>\r\n");
      out.write("\r\n");
      out.write("				</table>\r\n");
      out.write("			</form>\r\n");
      out.write("			\r\n");
      out.write("		</div>\r\n");
      out.write("		<div>\r\n");
      out.write("			<img alt=\"\" src=\"./img/r마스코드.png\">\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	<footer> </footer>\r\n");
      out.write("</body>\r\n");
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
