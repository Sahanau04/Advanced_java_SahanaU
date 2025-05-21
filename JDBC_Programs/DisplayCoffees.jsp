<%@ page import="java.sql.*" %>
<html>
<head>
    <title>All Coffee Products</title>
</head>
<body>
    <h2>List of Coffee Products</h2>
    <table border="1" cellpadding="8">
        <tr>
            <th>ID</th>
            <th>Coffee Name</th>
            <th>Price</th>
        </tr>
        <%
            String url = "jdbc:mysql://localhost:3306/coffee";
            String user = "root"; // Your DB username
            String pass = "";     // Your DB password

            Connection conn = null;
            Statement stmt = null;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, user, pass);
                stmt = conn.createStatement();

                ResultSet rs = stmt.executeQuery("SELECT * FROM coffee");

                while (rs.next()) {
        %>
        <tr>
            <td><%= rs.getInt("id") %></td>
            <td><%= rs.getString("coffee_name") %></td>
            <td><%= rs.getDouble("price") %></td>
        </tr>
        <%
                }
            } catch (Exception e) {
                out.println("<tr><td colspan='3'>Error: " + e.getMessage() + "</td></tr>");
            } finally {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            }
        %>
    </table>
    <br>
    <a href="coffee_form.html">Add Another Coffee</a>
</body>
</html>
