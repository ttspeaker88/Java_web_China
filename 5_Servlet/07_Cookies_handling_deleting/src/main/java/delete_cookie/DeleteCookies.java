package delete_cookie;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteCookies
 */
@WebServlet("/DeleteCookies")
public class DeleteCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public DeleteCookies() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/*    Cookie firstName = new Cookie("first_name", "John");
		Cookie lastName = new Cookie("last_name", "Player");

		// Set cookies to expire in 24 hours
		firstName.setMaxAge(60 * 60 * 24);
		lastName.setMaxAge(60 * 60 * 24);

		// Add cookies to response
		response.addCookie(firstName);
		response.addCookie(lastName);  */
		
		
		
		Cookie cookie = null;
		Cookie[] cookies = null;

		// Get an array of Cookies associated with this domain
		cookies = request.getCookies();

		// Set response content type
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		String title = "Delete Cookies Example";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

		out.println(docType + "<html>\n" + "<head><title>" + title + "</title></head>\n"
				+ "<body bgcolor = \"#f0f0f0\">\n");

		if (cookies != null) {
			out.println("<h2> Cookies Name and Value</h2>");

			for (int i = 0; i < cookies.length; i++) {
				cookie = cookies[i];

				if ((cookie.getName()).compareTo("first_name") == 0) {
					cookie.setMaxAge(0);
					response.addCookie(cookie);
					out.print("Deleted cookie : " + cookie.getName() + "<br/>");
				}
				out.print("Name : " + cookie.getName() + ",  ");
				out.print("Value: " + cookie.getValue() + " <br/>");
			}
		} else {
			out.println("<h2>No cookies founds</h2>");
		}
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
