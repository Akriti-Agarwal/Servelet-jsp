<%--
  Created by IntelliJ IDEA.
  User: akrit
  Date: 29-07-2025
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
isErrorPage="true" %>
<html>
<head>
    <title>Error</title>
</head>
<body>
<h2>Error Page</h2>
<p><b>Exception:</b> <%= exception.getClass().getName() %></p>
<p><b>Message:</b> <%= exception.getMessage() %></p>
<%--error--%>
<%--<%=exception.getMessage()%>--%>
</body>
</html>
