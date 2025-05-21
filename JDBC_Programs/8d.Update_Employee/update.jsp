<%@ include file="DBConnection.jsp" %>
<%
    int empno = Integer.parseInt(request.getParameter("empno"));
    String empname = request.getParameter("empname");
    double salary = Double.parseDouble(request.getParameter("salary"));

    String sql = "UPDATE Emp SET Emp_Name=?, BasicSalary=? WHERE Emp_No=?";
    try {
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, empname);
        pst.setDouble(2, salary);
        pst.setInt(3, empno);

        int updated = pst.executeUpdate();
        if (updated > 0) {
            out.println("<p style='color:green;'>Employee record updated successfully!</p>");
        } else {
            out.println("<p style='color:red;'>No employee found with Emp_No = " + empno + "</p>");
        }
    } catch (SQLException e) {
        out.println("Error: " + e.getMessage());
    }

    conn.close();
%>
<br>
<a href="view.jsp">View All Employees</a> | 
<a href="update.html">Update Another</a>
