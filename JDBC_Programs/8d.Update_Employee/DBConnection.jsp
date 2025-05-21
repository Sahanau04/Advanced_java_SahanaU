<%@ page import="java.sql.*" %>
<%
    Connection conn = null;
    String url = "jdbc:mysql://localhost:3306/Employee";
    String user = "root";
    String pass = "";  // ← replace with your actual MySQL password

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, pass);
    } catch (Exception e) {
        out.println("Database connection failed: " + e.getMessage());
    }
%>
