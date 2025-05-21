<%@ include file="DBConnection.jsp" %>
<%
  int id = Integer.parseInt(request.getParameter("id"));
  String coffee_name = request.getParameter("coffee_name");
  double price = Double.parseDouble(request.getParameter("price"));

  String sql = "UPDATE coffee SET coffee_name=?, price=? WHERE id=?";
  PreparedStatement pst = conn.prepareStatement(sql);
  pst.setString(1, coffee_name);
  pst.setDouble(2, price);
  pst.setInt(3, id);

  int rows = pst.executeUpdate();

  if (rows > 0) {
    out.println("<p style='color:green;'>Record updated successfully!</p>");
  } else {
    out.println("<p style='color:red;'>Coffee with ID " + id + " not found.</p>");
  }

  conn.close();
%>
<br>
<a href="display.jsp">View All Coffees</a>
