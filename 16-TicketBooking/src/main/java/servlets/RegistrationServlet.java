package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entity.User;
import utility.Hibernate_Utility;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = new User();
		resp.setContentType("text/html");
		String username = req.getParameter("username");
		user.setUsername(username);
		String password = req.getParameter("password");
		user.setPassword(password);
		String email = req.getParameter("email");
		user.setEmail(email);

		Hibernate_Utility.entityTransaction.begin();
		Hibernate_Utility.entityManager.persist(user);
		Hibernate_Utility.entityTransaction.commit();

		PrintWriter writer = resp.getWriter();
		writer.print("<html><body>");
		writer.print("<h1 style='color:green'>Registration Successful</h1>");
		writer.print("</body></html>");

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("Registration.html");
		requestDispatcher.include(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "GET method is not supported for this endpoint.");
	}
}
