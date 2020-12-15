package org.corona.servlet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.corona.dao.TripDAO;
import org.corona.vo.Trip;

@WebServlet("/write.bmj")
public class Insert extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String place = req.getParameter("place");
		String address = req.getParameter("address");
		String city = req.getParameter("city");
		String gu = req.getParameter("gu");
		
		//double
		String latitudeStr = req.getParameter("latitude");
		System.out.println(latitudeStr);
		String longititudeStr = req.getParameter("longititude");
		double latitude = Double.parseDouble(latitudeStr);
		double longititude = Double.parseDouble(longititudeStr);
		
		//char
		String maskStr = req.getParameter("mask");
		char mask = maskStr.charAt(0);
		
		//int
		String numStr = req.getParameter("num");
		int num = Integer.parseInt(numStr);
		
		//Date
		String startYearStr = req.getParameter("startYear");
		String startMonthStr = req.getParameter("startMonth");
		String startDateStr = req.getParameter("startDay");
		int startYear = Integer.parseInt(startYearStr);
		int startMonth = Integer.parseInt(startMonthStr);
		int startDay = Integer.parseInt(startDateStr);
		Date startDate = Date.valueOf(startYear+"-"+startMonth+"-"+startDay);
		
		String endYearStr = req.getParameter("endYear");
		String endMonthStr = req.getParameter("endMonth");
		String endDateStr = req.getParameter("endDay");
		int endYear = Integer.parseInt(endYearStr);
		int endMonth = Integer.parseInt(endMonthStr);
		int endDay = Integer.parseInt(endDateStr);
		Date endDate = Date.valueOf(endYear+"-"+endMonth+"-"+endDay);
		
		Trip trip = new Trip(num, place, city, gu, startDate, endDate, latitude, longititude, mask,address);
		
		int result = TripDAO.insert(trip);
		System.out.println(result+"개 추가 되었습니다.");
		resp.sendRedirect("/index.jsp");
	}
}
