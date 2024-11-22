package checkbox;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Checkbox
 */
@WebServlet("/Checkbox")
public class Checkbox extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Checkbox() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Set response content type
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		String title = "Reading Checkbox Data";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

		out.println(
				docType + "<html>\n" + "<head><title>" + title + "</title></head>\n" + "<body bgcolor = \"#f0f0f0\">\n"
						+ "<h1 align = \"center\">" + title + "</h1>\n" + "<ul>\n" + "  <li><b>Maths Flag : </b>: "
						+ request.getParameter("maths") + "\n" + "  <li><b>Physics Flag: </b>: "
						+ request.getParameter("physics") + "\n" + "  <li><b>Chemistry Flag: </b>: "
						+ request.getParameter("chemistry") + "\n" + "</ul>\n" + "</body>" + "</html>");
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
