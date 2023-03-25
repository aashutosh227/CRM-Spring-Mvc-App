<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CRM</title>
</head>
<body>
    <h1 style="width:100%; padding:30px 0px; background-color: #32CD32; color: white; ">&nbsp;&nbsp; <b>CRM - Customer Relationship Manager</b></h1>

<br><br>
    <form action="${pageContext.request.contextPath}/saveCustomer" style="margin-top: 50 px">
        <table>
            <tr>
                <td>First Name: </td>
                <td><input type="text"/></td>
            </tr>
            <tr>
                 <td>Last Name: </td>
                 <td><input type="text"/></td>
            </tr>
            <tr>
               <td>E-mail: </td>
               <td><input type="email"/></td>
            </tr>
        </table>
        <input type="submit" value="Save" style="background: silver; padding: 10 px"/>
    </form>
</body>
</html>