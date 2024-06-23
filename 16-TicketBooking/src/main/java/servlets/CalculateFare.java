package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

@WebServlet("/fareCalculator")
public class CalculateFare extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String from = req.getParameter("from");
		String to = req.getParameter("to");
		String journeyType = req.getParameter("journeyType");

		// Your fare calculation logic here
		double fare = calculateFare(from, to, journeyType);
		req.setAttribute("from", from);
		req.setAttribute("to", to);
		req.setAttribute("journeyType", journeyType);
		req.setAttribute("fare", fare);

		RequestDispatcher rd = req.getRequestDispatcher("PrintTicket.jsp");
		rd.forward(req, resp);
	}

	private double calculateFare(String from, String to, String journeyType) {

		double baseFare = 30.00;
		if ("return".equals(journeyType)) {
			return baseFare * 2;
		}
		return baseFare;
	}

}
