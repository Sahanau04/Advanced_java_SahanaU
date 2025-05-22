<%@ page import="java.sql.*" %>
<%
    String empNoStr = request.getParameter("empno");
    String empName = request.getParameter("empname");
    String basicSalaryStr = request.getParameter("basicsalary");

    Connection con = null;
    PreparedStatement insertStmt = null;
    Statement selectStmt = null;
    ResultSet rs = null;

    double grandTotal = 0;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");

        if (empNoStr != null && empName != null && basicSalaryStr != null) {
            int empNo = Integer.parseInt(empNoStr);
            double basicSalary = Double.parseDouble(basicSalaryStr);

            String insertSQL = "INSERT INTO Emp (Emp_No, Emp_Name, BasicSalary) VALUES (?, ?, ?)";
            insertStmt = con.prepareStatement(insertSQL);
            insertStmt.setInt(1, empNo);
            insertStmt.setString(2, empName);
            insertStmt.setDouble(3, basicSalary);
            insertStmt.executeUpdate();
        }

        // Generate report
        selectStmt = con.createStatement();
        rs = selectStmt.executeQuery("SELECT * FROM Emp");

        out.println("<h2>Salary Report</h2>");
        out.println("<pre>");
        out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        while (rs.next()) {
            int no = rs.getInt("Emp_No");
            String name = rs.getString("Emp_Name");
            double basic = rs.getDouble("BasicSalary");

            grandTotal += basic;

            out.println("Emp_No   : " + no);
            out.println("Emp_Name : " + name);
            out.println("Basic    : " + basic);
            out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }

        out.println("Grand Salary : " + grandTotal);
        out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        out.println("</pre>");

    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception e) {}
        try { if (insertStmt != null) insertStmt.close(); } catch (Exception e) {}
        try { if (selectStmt != null) selectStmt.close(); } catch (Exception e) {}
        try { if (con != null) con.close(); } catch (Exception e) {}
    }
%>
