<%@ include file="DBConnection.jsp" %>
<%
    String sql = "SELECT * FROM Emp";
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery(sql);

    double grandTotal = 0;
%>

<h2>Salary Report</h2>
<pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
    while (rs.next()) {
        int empNo = rs.getInt("Emp_No");
        String empName = rs.getString("Emp_Name");
        double basic = rs.getDouble("BasicSalary");

        grandTotal += basic;
%>
Emp_No    : <%= empNo %>
Emp_Name  : <%= empName %>
Basic     : <%= basic %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
    }
%>
Grand Salary : <%= grandTotal %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
</pre>
<a href="index.html">Add More Employees</a>
<%
    conn.close();
%>
