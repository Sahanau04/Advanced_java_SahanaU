<%@ page import="java.sql.*" %>
<%
    String idStr = request.getParameter("id");
    String name = request.getParameter("coffee_name");
    String priceStr = request.getParameter("price");

    Connection con = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Coffee", "root", "");

        // Update the coffee product if form is submitted
        if (idStr != null && name != null && priceStr != null) {
            int id = Integer.parseInt(idStr);
            double price = Double.parseDouble(priceStr);

            String updateQuery = "UPDATE coffee SET coffee_name = ?, price = ? WHERE id = ?";
            pstmt = con.prepareStatement(updateQuery);
            pstmt.setString(1, name);
            pstmt.setDouble(2, price);
            pstmt.setInt(3, id);

            int rowsUpdated = pstmt.executeUpdate();
            out.println("<p>" + rowsUpdated + " record(s) updated.</p>");
        }

        // Display all coffee records
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM coffee");

        out.println("<h2>Coffee Products:</h2>");
        out.println("<table border='1'><tr><th>ID</th><th>Name</th><th>Price</th></tr>");

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
