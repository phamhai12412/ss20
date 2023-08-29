<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 8/17/2023
  Time: 8:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h2>Add new employee </h2>
    <form action="/addEmployee" method="post">
        <label for="id">ID</label>
        <input type="text" id="id" name="id"><br/>
        <label for="name">Name</label>
        <input type="text" id="name" name="name"><br/>
        <label for="phone">Phone</label>
        <input type="text" id="phone" name="phone"><br/>
        <input type="submit" value="Add">
    </form>
</center>
</body>
</html>
