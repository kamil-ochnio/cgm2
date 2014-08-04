package it.pkg.performance;

import com.jamonapi.MonitorFactory;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by IntelliJ IDEA.
 * User: rdobrzynski
 * Date: 21.07.14
 * Time: 08:22
 */
public class PerformanceHttpRequestHandler implements HttpRequestHandler {

    private boolean enabled = true;

    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {

        if (!enabled) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        if (request.getMethod().equals("POST")) {

            MonitorFactory.reset();
            response.sendRedirect(request.getRequestURI());

        } else {

            response.setContentType("text/html");
            PrintWriter writer = response.getWriter();
            writer.print("<html>");
            writer.print("<body><form action='' method='post'> <input type='submit' value='Reset JAMon'> </form>");
            writer.print(MonitorFactory.getRootMonitor().getReport(3, "desc"));
            writer.print("</body></html>");

        }
    }

    public void setEnabled(boolean productionMode) {
        this.enabled = productionMode;
    }
}
