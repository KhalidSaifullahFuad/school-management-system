<%--
  Created by IntelliJ IDEA.
  User: Fuad
  Date: 17-May-22
  Time: 08:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student</title>
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.css">
</head>
<body>

    <table class="table table-bordered">
        <thead class="thead">
            <tr>
            <th class="th">Id</th>
            <th class="th">Name</th>
            <th class="th">Class</th>
            <th class="th">Section</th>
            </tr>
        </thead>
        <tbody class="tbody">
            <c:forEach var="student" items="${studentList}">
                <tr>
                <td class="td">${student.getId()}</td>
                <td class="td">${student.getStudentName()}</td>
                <td class="td">${student.getStudentClass()}</td>
                <td class="td">${student.getStudentSection()}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

</body>
</html>
