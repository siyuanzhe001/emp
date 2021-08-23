<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px">
    <tr>
        <td>Emp No</td>
        <td>Emp Name</td>
        <td>Job</td>
        <td>MGR</td>
        <td>Hire Date</td>
        <td>Salary</td>
        <td>Comm</td>
        <td>Delete</td>
    </tr>
    <c:forEach var="e" items="${emp}">
        <tr>
            <td>${e.empNo}</td>
            <td>${e.eName}</td>
            <td>${e.job}</td>
            <td>${e.mgr}</td>
            <td>${e.hireDate}</td>
            <td>${e.sal}</td>
            <td>${e.comm}</td>
            <td><a href="del?empNo=${e.empNo}">Delete</a></td>
            <td><a href="find?empNo=${e.empNo}">Update</a></td>
        </tr>
    </c:forEach>
</table>
<a href="add.jsp">Add Employee</a>
</body>
</html>
