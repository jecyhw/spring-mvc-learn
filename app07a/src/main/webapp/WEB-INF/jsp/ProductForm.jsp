<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: jecyhw
  Date: 2016/6/12
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Add Product Form</title>
</head>
<body>
    <div id="global">
        <form:form commandName="product" action="${pageContext.request.contextPath}/product/save" method="post">
            <fieldset>
                <legend>Add a product</legend>
                <p>
                    <form:errors path="name"/>
                </p>
                <p>
                    <label for="name">*Product Name:</label>
                    <form:input path="name"/>
                </p>
                <p>
                    <label for="description">Product Description:</label>
                    <form:input path="description"/>
                </p>
                <p>
                    <form:errors path="price"/>
                </p>
                <p>
                    <label for="price">*Product Price:</label>
                    <form:input path="price"/>
                </p>
                <p>
                    <form:errors path="productionDate"/>
                </p>
                <p>
                    <label for="price">*Product Date:</label>
                    <form:input path="productionDate"/>
                </p>
                <p>
                    <input id="reset" type="reset">
                    <input id="submit" type="submit" value="Add Product">
                </p>
            </fieldset>
        </form:form>
    </div>
</body>
</html>
