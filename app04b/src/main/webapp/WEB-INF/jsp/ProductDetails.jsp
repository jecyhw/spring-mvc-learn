<%--
  Created by IntelliJ IDEA.
  User: jecyhw
  Date: 2016/6/12
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Save Product</title>
    <style type="text/css">@import url(/css/main.css);</style>
</head>
<body>
<div id="global">
    <h4>${meaasge}</h4>
    <p>
    <h5>Details:</h5>
    Product Name: ${product.name} <br/>
    Description: ${product.description} <br/>
    Price: ${product.price} <br/>
    </p>
</div>
</body>
</html>
