<%--
  Created by IntelliJ IDEA.
  User: jecyhw
  Date: 2016/6/13
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Employee Form</title>
</head>
<body>
<form:form commandName="employee" action="${pageContext.request.contextPath}/employee_save" method="post">
    <fieldset>
        <legend>Add an Employee</legend>
        <p>
            <label for="firstName">First Name:</label>
            <form:input path="firstName"/>
        </p>
        <p>
            <label for="lastName">Last Name:</label>
            <form:input path="lastName"/>
        </p>
        <p>
            <form:errors path="birthDate" cssClass="error"/>
        </p>
        <p>
            <label for="birthDate">Date of Birth:</label>
            <form:input path="birthDate"/>
        </p>
        <p>
            <input type="reset" value="reset">
            <input type="submit" value="Add Employee">
        </p>
    </fieldset>
</form:form>
</body>
</html>


