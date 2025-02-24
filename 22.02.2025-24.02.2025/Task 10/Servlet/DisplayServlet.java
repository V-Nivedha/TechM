import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/displayHtml")
public class HtmlDisplayServlet extends HttpServlet {
    private static final String HTML_FILE_PATH = "/index.html";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

    
        ServletContext context = getServletContext();
        InputStream is = context.getResourceAsStream(HTML_FILE_PATH);
        if (is == null) {
            out.println("<h1>File Not Found!</h1>");
            return;
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String line;
        while ((line = reader.readLine()) != null) {
            out.println(line);
        }
        reader.close();
    }
}
