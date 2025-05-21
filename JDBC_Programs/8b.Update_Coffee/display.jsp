<%@ include file="DBConnection.jsp" %>
<%
  String sql = "SELECT * FROM coffee";
  Statement stmt = conn.createStatement();
  ResultSet rs = stmt.executeQuery(sql);
%>

<h2>All Coffee Records</h2>
<table border="1" cellpadding="8">
  <tr>
    <th>ID</th>
    <th>Coffee Name</th>
    <th>Price</th>
  </tr>
  <%
    while(rs.next()) {
  %>
  <tr>
    <td><%= rs.getInt("id") %></td>
    <td><%= rs.getString("coffee_name") %></td>
    <td><%= rs.getDouble("price") %></td>
  </tr>
  <%
    }
    conn.close();
  %>
</table>

<br><a href="index.html">Back to Update Form</a>
