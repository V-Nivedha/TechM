package example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class ServletEx extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // response.setContentType("text/html");
        //response.getWriter().println("<h1>Hello, Servlet!</h1>");
        response.setContentType("text/html");      
	       PrintWriter pwriter = response.getWriter();    
	       pwriter.println("<html><body>");
	       pwriter.println("<h2>Html file from Servlet!</h2>");
	       pwriter.println("</body></html>");
    }
}
