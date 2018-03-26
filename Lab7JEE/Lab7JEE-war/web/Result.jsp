<%-- 
    Document   : Result
    Created on : 25-Mar-2018, 4:50:31 PM
    Author     : dhruvinparikh.byethost24.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>Your uploaded file <%=request.getAttribute("filename")%> size is: <%=request.getAttribute("filesize")%> bytes.</p>
    </body>
</html>
