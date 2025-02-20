package servletpack;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class OnServletContext
 */

public class OnServletContext extends HttpServlet  
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {

    	
PrintWriter pw=res.getWriter();
        res.setContentType("text/html");

        ServletContext context=getServletContext();  

        String s1=context.getInitParameter("n1");
        String s2=context.getInitParameter("n2");

        pw.println("n1 value is " +s1+ " and n2 is " +s2);

       pw.close();        }}