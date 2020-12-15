package org.corona.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.corona.dao.TripDAO;

@WebServlet("/delete.do")
public class Delete extends HttpServlet{
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String noStr = req.getParameter("no");
      int no = Integer.parseInt(noStr);
      
      int result = TripDAO.delete(no);
      if(result == 1) {
         System.out.println("삭제완료");
      }
      resp.sendRedirect("/index.jsp");
   }
}