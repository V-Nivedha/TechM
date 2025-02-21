package jspPack;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Counter
 */
@WebServlet("/count")
public class Counter extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int accesses = 0;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
         throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        accesses++;
        out.print("Number of times this servlet has been accessed:" + accesses);
    }
}
