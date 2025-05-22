package program6b;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VisitServlet")
public class Create_Cookie extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        int visitCount = 1; // default visit
        Cookie[] cookies = request.getCookies();

        boolean foundVisit = false;

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitCount")) {
                    visitCount = Integer.parseInt(c.getValue()) + 1;
                    foundVisit = true;
                }
            }
        }

        // Create/Update cookies
        Cookie nameCookie = new Cookie("userName", name);
        Cookie visitCookie = new Cookie("visitCount", String.valueOf(visitCount));

        // Set expiry (e.g., 1 minute = 60 seconds)
        nameCookie.setMaxAge(60);
        visitCookie.setMaxAge(60);

        response.addCookie(nameCookie);
        response.addCookie(visitCookie);

        out.println("<html><body>");
        out.println("<h2>Welcome back, " + name + "!</h2>");
        out.println("<p>You have visited this page <strong>" + visitCount + "</strong> times.</p>");
        out.println("<p>(Note: Cookie will expire in 60 seconds)</p>");
        out.println("</body></html>");
    }
}
