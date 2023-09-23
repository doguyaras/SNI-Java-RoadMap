<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Response Page</title>
</head>
<body>
<pre>
    <%= request.getAttribute("htmlResponse") %>
</pre>
</body>
</html>