/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.59
 * Generated at: 2020-12-14 12:02:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/template/link.jsp", Long.valueOf(1607824747012L));
  }

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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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
      out.write("\r\n");
 
	Object msg = session.getAttribute("msg");
	if(msg!=null){
		session.removeAttribute("msg");
	}//if end
	

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>로그인 페이지</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/reset.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/all.min.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/notosanskr.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/default.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/paginate.css\" />\r\n");
      out.write("<link rel=\"icon\" href=\"/favicon.png\"/>\r\n");
      out.write("<script src=\"/js/jquery.js\"></script>\r\n");
      out.write("<script src=\"/js/moment-with-locales.js\"></script>");
      out.write("\r\n");
      out.write("<link href=\"/css/login.css\" rel=\"stylesheet\"/>\r\n");
      out.write("<style>\r\n");
      out.write("\t#msgBox{\r\n");
      out.write("\t    margin : 10px;\r\n");
      out.write("\t    position: relative;\r\n");
      out.write("\t    text-align: center;\r\n");
      out.write("\t    color: #fff;\r\n");
      out.write("\t    font-size: 21px;\r\n");
      out.write("\t    font-weight: 900;\r\n");
      out.write("\t}\r\n");
      out.write("\t#msg{\r\n");
      out.write("\t\tcolor:#FF1744;\r\n");
      out.write("\t}\r\n");
      out.write("\t#msg.ok{\r\n");
      out.write("\t\tcolor : #2979FF; \r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"intro\">\r\n");
      out.write("\t\t<div id=\"loginBox\">\r\n");
      out.write("\t\t\t<h1><span><i class=\"fas fa-sign-in-alt\"></i> ADMIN 로그인</span></h1>\r\n");
      out.write("\t\t\t<form method=\"post\" action=\"/login.bmj\">\r\n");
      out.write("\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t<legend class=\"screen_out\">로그인 폼</legend>\r\n");
      out.write("\t\t\t\t\t<label for=\"id\" class=\"screen_out\">아이디</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" autofocus name=\"id\" id=\"id\" placeholder=\"아이디\" title=\"아이디를 입력해주세요.\"/>\r\n");
      out.write("\t\t\t\t\t<p id=\"msg\">4~8자까지 영어 및 숫자로 입력해주세요.</p>\r\n");
      out.write("\t\t\t\t\t<label for=\"pwd\" class=\"screen_out\">비밀번호</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"password\" id=\"pwd\" placeholder=\"비밀번호\" title=\"비밀번호를 입력해주세요.\"/>\r\n");
      out.write("\t\t\t\t\t<button id=\"loginBtn\" title=\"로그인 버튼\"><i class=\"fas fa-sign-in-alt\"></i> 로그인</button>\r\n");
      out.write("\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t");
if(msg!=null){ 
      out.write("\r\n");
      out.write("\t\t\t<div id=\"msgBox\">");
      out.print(msg );
      out.write("</div>\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t<a id=\"joinLink\" href=\"/register.jsp\"><i class=\"fas fa-user-plus\"></i> 회원가입</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"videoContainer\">\r\n");
      out.write("\t\t\t<video muted autoplay loop id=\"video\">\r\n");
      out.write("\t\t\t\t<source src=\"/video/loop.mp4\"/>\r\n");
      out.write("\t\t\t</video>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tconst $id = $('#id');\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tconst $msg = $('#msg');\r\n");
      out.write("\t\t$msg.css('display','none');\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$id.val('').focus();\r\n");
      out.write("\r\n");
      out.write("\t\t// 이름 정규표현식 객체\r\n");
      out.write("\t\tconst idExp = /^[a-zA-Z]{1}[a-zA-z|\\d]{3,7}$/;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$id.keyup(function(){\r\n");
      out.write("\t\t\tconst val = $id.val();\r\n");
      out.write("\t\t\t$msg.css('display','block');\r\n");
      out.write("\t\t\tif(idExp.test(val)){\r\n");
      out.write("\t\t\t\t$msg.addClass(\"ok\").text(\"아주 좋은 닉네임이에요\");\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$msg.removeClass(\"ok\").text(\"4~8자까지 영어 및 숫자로 입력해주세요.\");\r\n");
      out.write("\t\t\t}// if ~ else end\r\n");
      out.write("\t\t});//keyup() end\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
