package org.corona.filter;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebFilter({
		"/increase.jsp",
		"/updateForm.jsp",
		"/registerForm.jsp",
		"/register.bmj",
		"/update.bmj",
		"/delete.bmj",
		"/index.jsp"
}
)
public class LoginCheck implements Filter{
	
	@Override
	public void destroy() {
		
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		// HttpServletRequest 객체로 강제 형변환 부모에서 자식으로
		HttpServletRequest req = (HttpServletRequest) request;
		
		// 세션 얻기
		HttpSession session = req.getSession();
		
		Object loginMember = session.getAttribute("loginMember");
		HttpServletResponse resp = (HttpServletResponse)response;
		
		if(loginMember == null) {
			session.setAttribute("msg", "로그인을 해주세요");
			resp.sendRedirect("/login.jsp");
		}else {
			chain.doFilter(request, response);
		}//if~else end
		
	}
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}
}
