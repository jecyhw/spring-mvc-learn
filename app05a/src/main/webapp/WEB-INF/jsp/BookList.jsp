<%--
  Created by IntelliJ IDEA.
  User: jecyhw
  Date: 2016/6/12
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>BookList</title>
    <style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>
<div id="globel">
    <h1>Book List</h1>
    <a href="<c:url value="/book_input"/> ">Add Book</a>
    <table>
        <tr>
            <th>Category</th>
            <th>Title</th>
            <th>ISBN</th>
            <th>Author</th>
            <th>&nbsp;</th>
        </tr>
        <c:forEach items="${books}" var="book">
            <tr>
                <td>${book.category.name}</td>
                <td>${book.isbn}</td>
                <td>${book.isbn}</td>
                <td>${book.author}</td>
                <td><a href="<c:url value="/book_edit/${book.id}"/> ">Edit</a> </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
