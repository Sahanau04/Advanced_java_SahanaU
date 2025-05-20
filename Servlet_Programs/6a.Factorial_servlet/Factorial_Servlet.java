package program6a;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FactorialServlet")
public class Factorial_Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int number = Integer.parseInt(request.getParameter("number"));
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        out.println("<html><body>");
        out.println("<h2>Factorial Result</h2>");
        out.println("<p>The factorial of " + number + " is: <strong>" + factorial + "</strong></p>");
        out.println("</body></html>");
    }
}
