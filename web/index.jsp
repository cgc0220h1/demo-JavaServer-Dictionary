<%--
  Created by IntelliJ IDEA.
  User: Duc
  Date: 5/13/2020
  Time: 8:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<head>
    <title>Simple Dictionary</title>
    <style>
        * {
            font-family: "Roboto Light", serif;
            font-style: italic;
        }
    </style>
</head>
<body>
<h2>Vietnamese Dictionary</h2>
<form method="get" action="${pageContext.request.contextPath}/translate">
    <input type="text" name="input" placeholder="Enter your word: "/>
    <input type="submit" id="submit" value="Search"/>
</form>
</body>
</html>
