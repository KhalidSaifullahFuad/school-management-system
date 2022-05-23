<%--
  Created by IntelliJ IDEA.
  User: Fuad
  Date: 08-May-22
  Time: 07:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>${title}</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.css">
</head>
<body>
    <%--@elvariable id="student" type="com.cordial.model.Student"--%>
    <form:form action="${pageContext.request.contextPath}/student/store" method="post" modelAttribute="student">
        <h2>Create Student</h2>

        Name:
        <form:input path="studentName"/>
        <br/>

        Class:
        <form:select path="studentClass" id="student_class" cssClass="form-control">
            <form:option selected="true" value="Select Class" disabled="true"/>
            <form:options items="${classList}" />
        </form:select>
        <br/>

        Section:
        <form:input path="studentSection" id="student_section" cssClass="form-control"/>
        <br/>

        <button type="submit">Create</button>
    </form:form>
</body>
</html>
