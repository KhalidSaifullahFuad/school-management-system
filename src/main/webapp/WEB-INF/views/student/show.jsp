<%--<jsp:useBean id="student" scope="request" type="com.cordial.model.Student"/>--%>
<%--
  Created by IntelliJ IDEA.
  User: Fuad
  Date: 17-May-22
  Time: 07:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Students</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
</head>
<body>
    Name: ${student.getStudentName()} <br/>
    Class: ${student.getStudentClass()} <br/>
    Section: ${student.getStudentSection()} <br/>
</body>
</html>
