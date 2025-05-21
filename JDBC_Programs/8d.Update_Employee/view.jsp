<%@ include file="DBConnection.jsp" %>
<%
    String sql = "SELECT * FROM Emp";
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
%>

<h2>Employee Records</h2>
<table border="1" cellpadding="8">
    <tr>
        <th>Emp_No</th>
        <th>Emp_Name</th>
        <th>Basic Salary</th>
    </tr>
<%
    while (rs.next()) {
%>
    <tr>
        <td><%= rs.getInt("Emp_No") %></td>
        <td><%= rs.getString("Emp_Name") %></td>
        <td><%= rs.getDouble("BasicSalary") %></td>
    </tr>
<%
    }
    conn.close();
%>
</table>
<br>
<a href="update.html">Update Another Record</a>
