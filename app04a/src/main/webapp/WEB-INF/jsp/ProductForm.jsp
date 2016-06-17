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
    <style type="text/css">@import url(/css/main.css);</style>
</head>
<body>
    <div id="global">
        <form action="/product_save" method="post">
            <fieldset>
                <legend>Add a product</legend>
                <label for="name">Product Name:</label>
                <input type="text" id="name" name="name">
                <label for="description">Product Description:</label>
                <input type="text" id="description" name="description">
                <label for="price">Product Price:</label>
                <input type="text" id="price" name="price">
                <div id="buttons">
                    <input id="reset" type="reset">
                    <input id="submit" type="submit" value="Add Product">
                </div>
            </fieldset>
        </form>
    </div>
</body>
</html>
