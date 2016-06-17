<%--
  Created by IntelliJ IDEA.
  User: jecyhw
  Date: 2016/6/12
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Add Book Form</title>
    <style type="text/css">@import url("<c:url value="/css/main.css"/> ");</style>
</head>
<body>
    <div id="global">
        <form:form commandName="book" action="${pageContext.request.contextPath}/book_save" method="post">
            <fieldset>
                <legend>Add a book</legend>
                <p>
                    <label form="category">Category</label>
                    <form:select id="category" path="category.id"
                                 items="${categories}" itemLabel="name" itemValue="id"/>
                </p>
                <p>
                    <label for="title">Title:</label>
                    <form:input path="title" id="title"/>
                </p>
                <p>
                    <label for="author">Author:</label>
                    <form:input path="author" id="author"/>
                </p>
                <p>
                    <label for="isbn">ISBN:</label>
                    <form:input path="isbn" id="isbn"/>
                </p>
                <p>
                    <input id="reset" type="reset" value="reset">
                    <input id="submit" type="submit" value="Add Book">
                </p>
            </fieldset>
        </form:form>
    </div>
</body>
</html>
