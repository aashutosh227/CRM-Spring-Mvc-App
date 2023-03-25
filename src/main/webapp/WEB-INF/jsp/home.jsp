<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CRM</title>
</head>
<body>
    <h1 style="width:100%; padding:30px 0px; background-color: #32CD32; color: white; ">&nbsp;&nbsp; <b>CRM - Customer Relationship Manager</b></h1>

    <form action="${pageContext.request.contextPath}/AddCustomer" style="margin-top: 50 px">
        <input type="submit" value="Add Customer" style="background: silver; padding: 10 px"/>
    </form>
    <h2>${pageContext.request.contextPath}</h2>
    <h2>${msg}</h2>
</body>
</html>