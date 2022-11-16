<%@page import="database.Utilities"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css"
    integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g=="
    crossorigin="anonymous" referrerpolicy="no-referrer" />
    <title>Insert</title>
            <style>
            div {
                margin-bottom: 10px;
            }
            label {
                display: inline-block;
                width: 150px;
                text-align: right;
                color: red;
            }
        </style>
     
    </head>
     <%@include file="memu.jsp" %>
    <body>
        <%
            String check = request.getParameter("check");
            boolean ispostback;
            if (check == null) {
                ispostback = false;
            } else {
                ispostback = true;
            }
            String serialno = "", task = "", description = "", status = "", taskdate="",Result = "";
            System.out.println(ispostback);

            if (ispostback) {
                try {
                    
                    task = request.getParameter("task");
                    description = request.getParameter("description");
                    status = request.getParameter("status");
                    taskdate = request.getParameter("taskdate");
                    PreparedStatement ps =database.DbConnect.connect().prepareStatement("insert into todo values (todoseq.nextval ,?,?,?,to_date(?,'yyyy-mm-dd'))");
                    ps.setString(1, serialno);
                    ps.setString(1, task);
                    ps.setString(2, description);
                    ps.setString(3,status);
                    ps.setString(4,taskdate);
                    int n = ps.executeUpdate();
                    Result = "Inserted " + " records";
                } catch (Exception ex) {
                    System.out.println(ex);
                    Result = ex.getMessage();
                }
            }

        %>


        <h1>Todo</h1>
        <form method="post">
            <h3><%=Result%></h3>
            <input type="hidden"  name="check" value="1"><br>
            <br>
            <label>Task</label>
            <input name="task" autocomplete="off" value="<%=task%>" type="text"><br>
            <label>Description</label>
            <textarea name="description" type="text"><%=description%></textarea><br>
            <label>Status</label>
            <input name="status" autocomplete="off" value="<%=status%>" type="text"><br>
             <label>Task Date</label>
            <input name="taskdate" autocomplete="off" value="<%=taskdate%>" type="date"><br>
            <br>
            <label></label>
            <input type="submit">
            <input name="option" type="submit" value="clear">
            <br>           
            <%=Utilities.getTodoList()%>
            </body>
        </form>
        </html>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
    <%@include file="footer.jsp" %>
