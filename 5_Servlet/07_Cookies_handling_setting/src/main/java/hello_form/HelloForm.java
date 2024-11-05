package hello_form;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloForm
 */
@WebServlet("/HelloForm")
public class HelloForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public HelloForm() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Create cookies for first and last names.
		Cookie firstName = new Cookie("first_name", request.getParameter("first_name"));
		Cookie lastName = new Cookie("last_name", request.getParameter("last_name"));

		// Set expiry date after 24 Hrs for both the cookies.
		firstName.setMaxAge(60 * 60 * 24);
		lastName.setMaxAge(60 * 60 * 24);

		// Add both the cookies in the response header.
		response.addCookie(firstName);
		response.addCookie(lastName);

		// Set response content type
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		String title = "Setting Cookies Example";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";

		out.println(docType + "<html>\n" + "<head><title>" + title + "</title></head>\n"
				+ "<body bgcolor = \"#f0f0f0\">\n" + "<h1 align = \"center\">" + title + "</h1>\n" + "<ul>\n"
				+ "  <li><b>First Name</b>: " + request.getParameter("first_name") + "\n" + "  <li><b>Last Name</b>: "
				+ request.getParameter("last_name") + "\n" + "</ul>\n" + "</body>\n" + "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
