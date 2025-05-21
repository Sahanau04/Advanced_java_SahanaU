<%@ page import="java.sql.*" %>
<%
  Connection conn = null;
  String url = "jdbc:mysql://localhost:3306/Coffee";
  String user = "root";
  String pass = ""; // Change this to your MySQL password

  try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn = DriverManager.getConnection(url, user, pass);
  } catch (Exception e) {
    out.println("Database connection error: " + e.getMessage());
  }
%>
