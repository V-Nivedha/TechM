package jspPack;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet { 
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, 
		      HttpServletResponse response) throws ServletException, IOException 
		  {
		    // reading the user input
		    String color= request.getParameter("color");    
		    PrintWriter out = response.getWriter();
		    out.println("<html> \n" +		    	    
		    	        "<body style=\"background-color:"+color+";> \n" +
		    	          "<font size=\"16px\">" +
"Hello World from JSP page!" +
		    	          "</font> \n" +
		    	        "</body> \n" +
		    	      "</html>" 
		    	    );  
		    	  }  
		    	}