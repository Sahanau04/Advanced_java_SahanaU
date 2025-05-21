<%@ page import="java.sql.*" %>
<%
    Connection conn = null;
    String url = "jdbc:mysql://localhost:3306/Employee";
    String user = "root";
    String pass = "";  // change this

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, pass);
    } catch (Exception e) {
        out.println("Database connection error: " + e.getMessage());
    }
%>
