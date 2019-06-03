/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.40
 * Generated at: 2019-06-03 01:29:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Test01_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Test01.jsp</title>\r\n");
      out.write("\r\n");
      out.write("<!-- json.js 라이브러리 사용 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/json.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\tvar xmlHttp;\r\n");
      out.write("\t\r\n");
      out.write("\tfunction createXMLHttpRequest()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar xmlReq = false;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(window.XMLHttpRequest)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\txmlReq = new XMLHttpRequest();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse if(window.ActiveXObject)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\ttry\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\txmlReq = new ActiveXObject(\"Msxml2.XMLHTTP\");\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tcatch(e)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\ttry\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\txmlReq = new ActiveObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tcatch(e)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t// XMLHttpRequest 객체를 생성할 수 없는 상태.\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\treturn xmlReq;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction startRequest()\r\n");
      out.write("\t{\r\n");
      out.write("\t\txmlHttp = createXMLHttpRequest();\r\n");
      out.write("\t\t// xmlHttp.onreadystatechange = handleStateChange(); -- (X)\r\n");
      out.write("\t\txmlHttp.onreadystatechange = handleStateChange;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar queryString = \"\";\r\n");
      out.write("\t\tvar name = document.getElementById(\"name\").value;\r\n");
      out.write("\t\tvar age = document.getElementById(\"age\").value;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tqueryString = \"Test01_ok.jsp?name=\"+name+\"&age=\"+age;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\txmlHttp.open(\"GET\", queryString, true);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// ※ GET 방식이 아닌 POST 방식인 경우\r\n");
      out.write("\t\t//\t  xmlHttp.setRequestHeader() 함수를 추가한다.\r\n");
      out.write("\t\t//\t  이는, 서버가 텍스트를 통해 보낸 것이 일반 HTML 폼에서 전송된 것 처럼\r\n");
      out.write("\t\t// \t  알 수 있도록 처리하기 위함이다.\r\n");
      out.write("\t\t//\t  ex) xmlHttp.setRequestHeader\r\n");
      out.write("\t\t//\t\t  \t(\"Content-Type\", \"application/x-www-form-urlencoded; charset=UTF-8\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\txmlHttp.send(\"\");\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction handleStateChange()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif(xmlHttp.readyState == 4)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tif(xmlHttp.status == 200)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tprintData();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\tfunction printData()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar resValue = xmlHttp.responseText;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// json.js 라이브러리를 사용하는 경우\r\n");
      out.write("\t\tvar func = new Function(\"return\" + resValue);\r\n");
      out.write("\t\tvar result = func();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar output = document.getElementById(\"results\");\r\n");
      out.write("\t\tvar outHtml = \"\";\r\n");
      out.write("\t\toutput.innerHTML = \"\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tdocument.getElementById(\"results\").style.display = \"\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\toutHtml = \"이름 : \" + result.name + \"<br>\";\r\n");
      out.write("\t\toutHtml += \"나이 : \" + result.age + \"<br>\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\toutput.innerHTML = outHtml;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>이름 : </th>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"name\" maxlength=\"20\" style=\"width: 100px;\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>나이 : </th>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"age\" maxlength=\"10\" style=\"width: 100px;\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"결과\" style=\"width: 100px;\"\r\n");
      out.write("\t\t\t\tonclick=\"startRequest()\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t<br><br>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"results\" style=\"display: none;\"></div>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
