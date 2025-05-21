<%@ page import="java.sql.*" %>
<%
    int id = Integer.parseInt(request.getParameter("id"));
    String name = request.getParameter("coffee_name");
    double price = Double.parseDouble(request.getParameter("price"));

    String url = "jdbc:mysql://localhost:3306/coffee";
    String user = "root"; // Your DB username
    String pass = "";     // Your DB password

    Connection conn = null;
    PreparedStatement ps = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, pass);

        String query = "INSERT INTO coffee (id, coffee_name, price) VALUES (?, ?, ?)";
        ps = conn.prepareStatement(query);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setDouble(3, price);
        ps.executeUpdate();

        out.println("<h3>Coffee product added successfully!</h3>");
    } catch (Exception e) {
        out.println("<h3>Error: " + e.getMessage() + "</h3>");
    } finally {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    }
%>
<br>
<a href="DisplayCoffees.jsp">View All Coffee Products</a>
