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

@WebServlet("/update.bmj")
public class Update extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String place = req.getParameter("place");
		String address = req.getParameter("address");
		String city = req.getParameter("city");
		String gu = req.getParameter("gu");
		System.out.println(place + " / " + address + " / " + city + " / " + gu);
		//double
		String latitudeStr = req.getParameter("latitude");
		String longititudeStr = req.getParameter("longititude");
		double latitude = Double.parseDouble(latitudeStr);
		double longititude = Double.parseDouble(longititudeStr);
		System.out.println(latitude + " / " + longititude);
		//char
		String maskStr = req.getParameter("mask");
		char mask = maskStr.charAt(0);
		System.out.println(""+mask);
		//int
		String numStr = req.getParameter("num");
		String noStr = req.getParameter("no");
		int num = Integer.parseInt(numStr);
		int no = Integer.parseInt(noStr);
		System.out.println(num);
		//Date
		String startYearStr = req.getParameter("startYear");
		String startMonthStr = req.getParameter("startMonth");
		String startDateStr = req.getParameter("startDay");
		Date startDate = Date.valueOf(startYearStr+"-"+startMonthStr+"-"+startDateStr);
		
		String endYearStr = req.getParameter("endYear");
		String endMonthStr = req.getParameter("endMonth");
		String endDateStr = req.getParameter("endDay");
		System.out.println(startDate);
		Date endDate = Date.valueOf(endYearStr+"-"+endMonthStr+"-"+endDateStr);
		System.out.println(endDate);
		
		Trip trip = new Trip(no,num, place, city, gu, startDate, endDate, latitude, longititude, mask,address);
		
		int result = TripDAO.update(trip);
		System.out.println(result+"개 변경 되었습니다.");
		resp.sendRedirect("/index.jsp");
	}
}
