package org.corona.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.corona.dao.MembersDAO;
import org.corona.vo.Member;

@WebServlet("/login.bmj")
public class Login extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");
		String pwd = req.getParameter("password");
		
		System.out.println("id: " + id + "pwd : "+ pwd);
		Member member = new Member(id,pwd);
		
		Member loginMember = MembersDAO.selectLogin(member);
		
		HttpSession session = req.getSession();
		if(loginMember == null) {
			session.setAttribute("msg", "아이디가 틀렸습니다.");
			
			resp.sendRedirect("/login.jsp");
		}else{
			session.setAttribute("loginMember", loginMember);
			resp.sendRedirect("/index.jsp");
		}
	}
}


