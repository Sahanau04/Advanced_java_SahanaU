<%@ include file="DBConnection.jsp" %>
<%
    int empno = Integer.parseInt(request.getParameter("empno"));
    String empname = request.getParameter("empname");
    double salary = Double.parseDouble(request.getParameter("salary"));

    String sql = "INSERT INTO Emp (Emp_No, Emp_Name, BasicSalary) VALUES (?, ?, ?)";
    try {
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, empno);
        pst.setString(2, empname);
        pst.setDouble(3, salary);

        int rows = pst.executeUpdate();

        if (rows > 0) {
            out.println("<p style='color:green;'>Employee added successfully!</p>");
        } else {
            out.println("<p style='color:red;'>Insertion failed.</p>");
        }
    } catch (SQLException e) {
        out.println("Error: " + e.getMessage());
    }

    conn.close();
%>
<br>
<a href="index.html">Add More</a> | 
<a href="report.jsp">View Report</a>
