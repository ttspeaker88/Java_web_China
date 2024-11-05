package filters;


import java.util.Date;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet implementation class LogFilter
 */

public class LogFilter implements Filter {
	
	public void init(FilterConfig config) throws ServletException {
		// Get init parameter
		String testParam = config.getInitParameter("test-param");

		// Print the init parameter
		System.out.println("Test Param: " + testParam);
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws java.io.IOException, ServletException {

		// Get the IP address of client machine.
		String ipAddress = request.getRemoteAddr();

		// Log the IP address and current timestamp.
		System.out.println("IP " + ipAddress + ", Time " + new Date().toString());

		// Pass request back down the filter chain
		chain.doFilter(request, response);
	}

	public void destroy() {
		/*
		 * Called before the Filter instance is removed from service by the web
		 * container
		 */
	}

}