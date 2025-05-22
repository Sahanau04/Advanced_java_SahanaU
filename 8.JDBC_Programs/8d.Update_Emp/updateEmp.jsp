<%@ page import="java.sql.*" %>
<%
    String empNoStr = request.getParameter("empno");
    String empName = request.getParameter("empname");
    String basicSalaryStr = request.getParameter("basicsalary");

    Connection con = null;
    PreparedStatement updateStmt = null;
    Statement selectStmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");

        if (empNoStr != null && empName != null && basicSalaryStr != null) {
            int empNo = Integer.parseInt(empNoStr);
            double basicSalary = Double.parseDouble(basicSalaryStr);

            String updateSQL = "UPDATE Emp SET Emp_Name = ?, BasicSalary = ? WHERE Emp_No = ?";
            updateStmt = con.prepareStatement(updateSQL);
            updateStmt.setString(1, empName);
            updateStmt.setDouble(2, basicSalary);
            updateStmt.setInt(3, empNo);

            int rowsAffected = updateStmt.executeUpdate();

            if (rowsAffected > 0) {
                out.println("<p style='color:green;'>Employee record updated successfully!</p>");
            } else {
                out.println("<p style='color:red;'>No employee found with Emp_No: " + empNo + "</p>");
            }
        }

        // Display all current records
        selectStmt = con.createStatement();
        rs = selectStmt.executeQuery("SELECT * FROM Emp");

        out.println("<h2>Current Employee Records</h2>");
        out.println("<table border='1'><tr><th>Emp_No</th><th>Emp_Name</th><th>Basic Salary</th></tr>");

        while (rs.next()) {
            out.println("<tr>");
            out.println("<td>" + rs.getInt("Emp_No") + "</td>");
            out.println("<td>" + rs.getString("Emp_Name") + "</td>");
            out.println("<td>" + rs.getDouble("BasicSalary") + "</td>");
            out.println("</tr>");
        }

        out.println("</table>");

    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception e) {}
        try { if (updateStmt != null) updateStmt.close(); } catch (Exception e) {}
        try { if (selectStmt != null) selectStmt.close(); } catch (Exception e) {}
        try { if (con != null) con.close(); } catch (Exception e) {}
    }
%>
