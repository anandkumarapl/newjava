<%@page import="java.sql.ResultSet"%>
<%@page import="database.DbConnect"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <center><title>update</title>
    </head>
    <body>
            <%@include  file="memu.jsp" %>

        <%
            String check = request.getParameter("check");
            boolean ispostback;
            if (check == null) {
                ispostback = false;
            } else {
                ispostback = true;
            }
            String serialno = "", task = "", description = "", taskstatus = "", result = "";
            if(!ispostback)
            {
                 serialno = request.getParameter("sno");
                    task = request.getParameter("Task");
                    description = request.getParameter("Description");
                    taskstatus = request.getParameter("taskstatus");
                    PreparedStatement ps =DbConnect.connect().prepareStatement("select * from todo where serialno=?");
                     ps.setString(1, serialno);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        task = "" + rs.getObject("task");
                        description = "" + rs.getObject("description");
                        taskstatus = "" + rs.getObject("taskstatus");
                    }
            }
            System.out.println(ispostback);

            if (ispostback) {
                try {
                    serialno = request.getParameter("serialno");
                    task = request.getParameter("task");
                    description = request.getParameter("description");
                    taskstatus = request.getParameter("status");
                    PreparedStatement ps =DbConnect.connect().prepareStatement("UPDATE  todo SET task=?,description=?,taskstatus=? where serialno=?");
                    
                    ps.setString(1, task);
                    ps.setString(2, description);
                    ps.setString(3, taskstatus);
                     ps.setString(4, serialno);
                    int n = ps.executeUpdate();
                    result = "Update" + n + " records";
                } catch (Exception ex) {
                    System.out.println(ex);
                    result = ex.getMessage();
                }
            }

        %>


        <h1>Update ToDo</h1>
        <form method="post">
            <h3><%=result%></h3>
            <input type="hidden"  name="check" value="1">
            <input value="<%=serialno%>" autocomplete="off" name="serialno" type="hidden">
            Task<input name="task" autocomplete="off" value="<%=task%>" type="text">
            Description<textarea name="description" autocomplete="off"><%=description%></textarea>
            taskstatus<input name="status" autocomplete="off" value="<%=taskstatus%>" type="text">
            <br>
            <br>
            <input type="submit">
            </body>
        </form>
        </html>
            <%@include  file="footer.jsp" %>