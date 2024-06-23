package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import entity.User;
import utility.Hibernate_Utility;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		// Retrieving user from the database based on username
		User user = Hibernate_Utility.entityManager
				.createQuery("SELECT u FROM User u WHERE u.username = :username", User.class)
				.setParameter("username", username).getResultList().stream().findFirst().orElse(null);

		if (user != null && user.getPassword().equals(password)) {
			HttpSession session = req.getSession();
			session.setAttribute("username", username);
			PrintWriter out = resp.getWriter();
			out.println("<html><body>");
			out.println("<h1>Login Successful</h1>");
			out.println("<p>Welcome, " + username + "!</p>");
			out.println("</body></html>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("Journey.html");
			requestDispatcher.forward(req, resp);
		} else {
			PrintWriter out = resp.getWriter();
			out.println("<html><body>");
			out.println("<h1>Login Failed</h1>");
			out.println("<b style=color:red>Invalid username or password. Please try again.</b>");
			out.println("</body></html>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("Login.html");
			requestDispatcher.include(req, resp);
		}

	}
}
