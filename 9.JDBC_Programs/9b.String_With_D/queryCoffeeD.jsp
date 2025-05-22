<%@ page import="java.sql.*" %>
<%
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Coffee", "root", "");

        // Query coffee names starting with 'D'
        String query = "SELECT * FROM coffee WHERE coffee_name LIKE 'D%'";
        pstmt = con.prepareStatement(query);
        rs = pstmt.executeQuery();

        out.println("<h2>Coffee Products Starting with 'D'</h2>");
        out.println("<table border='1'><tr><th>ID</th><th>Name</th><th>Price</th></tr>");

        boolean found = false;
        while (rs.next()) {
            found = true;
            out.println("<tr>");
            out.println("<td>" + rs.getInt("id") + "</td>");
            out.println("<td>" + rs.getString("coffee_name") + "</td>");
            out.println("<td>" + rs.getDouble("price") + "</td>");
            out.println("</tr>");
        }

        if (!found) {
            out.println("<tr><td colspan='3'>No coffee names found starting with 'D'</td></tr>");
        }

        out.println("</table>");

    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception e) {}
        try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
        try { if (con != null) con.close(); } catch (Exception e) {}
    }
%>
