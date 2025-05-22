<%@ page import="java.sql.*" %>
<%
    String idStr = request.getParameter("id");

    Connection con = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Coffee", "root", "");

        // Delete the record if ID is provided
        if (idStr != null) {
            int id = Integer.parseInt(idStr);
            String deleteQuery = "DELETE FROM coffee WHERE id = ?";
            pstmt = con.prepareStatement(deleteQuery);
            pstmt.setInt(1, id);
            int rowsDeleted = pstmt.executeUpdate();

            if (rowsDeleted > 0) {
                out.println("<p>Record with ID " + id + " deleted successfully.</p>");
            } else {
                out.println("<p style='color:red;'>No record found with ID " + id + ".</p>");
            }
        }

        // Display all existing records
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM coffee");

        out.println("<h2>Remaining Coffee Products:</h2>");
        out.println("<table border='1'><tr><th>ID</th><th>Coffee Name</th><th>Price</th></tr>");

        while (rs.next()) {
            out.println("<tr>");
            out.println("<td>" + rs.getInt("id") + "</td>");
            out.println("<td>" + rs.getString("coffee_name") + "</td>");
            out.println("<td>" + rs.getDouble("price") + "</td>");
            out.println("</tr>");
        }

        out.println("</table>");

    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception e) {}
        try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
        try { if (stmt != null) stmt.close(); } catch (Exception e) {}
        try { if (con != null) con.close(); } catch (Exception e) {}
    }
%>
