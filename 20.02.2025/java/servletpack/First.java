package servletpack;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class First
 */
@WebServlet("/First")
public class First extends HttpServlet {

	  protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        
		//getting value submitted in form from HTML file
	        String user = request.getParameter("user");
	//creating a new hidden form field
	        out.println("<form action='Second'>");
	        out.println("<input type='hidden' name='user' value='"+user+"'>");
	        out.println("<input type='submit' value='submit' >");
	        out.println("</form>");    }}
