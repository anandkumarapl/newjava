<%@page import="java.sql.PreparedStatement"%>
<%@page import="database.DbConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            PreparedStatement ps = DbConnect.connect().prepareStatement("");
            ResultSet rsmd=
        %>
        <h1>Hello World!</h1>
    </body>
</html>
