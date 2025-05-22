<%@ page import="java.sql.*" %>
<%
    String prefix = request.getParameter("namePrefix");

    Connection con = null;
    PreparedStatement deleteStmt = null;
    Statement selectStmt = null;
    ResultSet rs = null;
    double grandSalary = 0;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");

        if (prefix != null && !prefix.trim().isEmpty()) {
            String deleteSQL = "DELETE FROM Emp WHERE Emp_Name LIKE ?";
            deleteStmt = con.prepareStatement(deleteSQL);
            deleteStmt.setString(1, prefix + "%");
            int rowsDeleted = deleteStmt.executeUpdate();

            out.println("<p style='color:green;'>Deleted " + rowsDeleted + " employee(s) whose names start with '" + prefix + "'</p>");
        }

        // Display remaining records
        out.println("<h2>Salary Report</h2>");
        out.println("<pre>");
        out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        selectStmt = con.createStatement();
        rs = selectStmt.executeQuery("SELECT * FROM Emp");

        while (rs.next()) {
            int empNo = rs.getInt("Emp_No");
            String empName = rs.getString("Emp_Name");
            double salary = rs.getDouble("BasicSalary");

            grandSalary += salary;

            out.println("Emp_No   : " + empNo);
            out.println("Emp_Name : " + empName);
            out.println("Basic    : " + salary);
            out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }

        out.println("Grand Salary : " + grandSalary);
        out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        out.println("</pre>");

    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception e) {}
        try { if (deleteStmt != null) deleteStmt.close(); } catch (Exception e) {}
        try { if (selectStmt != null) selectStmt.close(); } catch (Exception e) {}
        try { if (con != null) con.close(); } catch (Exception e) {}
    }
%>
