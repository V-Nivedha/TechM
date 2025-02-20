package servletpack;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter("/WelcomeServlet") // Optional if using web.xml
public class MyFilter implements Filter {
    private FilterConfig filterConfig;

    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get parameter from filterConfig object
        String appUser = filterConfig.getInitParameter("appUser");

        if ("jai".equals(appUser)) {
            chain.doFilter(request, response);
        } else {
            out.print("Invalid application user.");
        }
    }

    public void destroy() {
        // Cleanup code if needed
    }
}
