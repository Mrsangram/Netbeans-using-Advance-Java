<%-- 
    Document   : second.jsp
    Created on : Mar 28, 2022, 4:53:10 AM
    Author     : sangram
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            out.print("Please Wait");
            response.sendRedirect("https://www.google.com/");

        %>
        <h1>Welcome to Page2</h1>

    </body>
</html>
