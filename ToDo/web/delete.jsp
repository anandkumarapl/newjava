<%@page import="java.sql.ResultSet"%>
<%@page import="database.DbConnect"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search and Delete</title>
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
//out.println(ispostback);
            String option = "", serialno = "", task = "", description = "", taskstatus = "",result="";
            if(!ispostback)
            {
                serialno = request.getParameter("sno");
                    PreparedStatement ps = DbConnect.connect().prepareStatement("select * from todo where serialno=?");
                    ps.setString(1, serialno);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        task = "" + rs.getObject("task");
                        description = "" + rs.getObject("description");
                        taskstatus = "" + rs.getObject("taskstatus");
                    }
            }
            if (ispostback) {
                option = request.getParameter("option");
                // out.println(option);
         
                if (option.equals("Delete")) {
                    out.println("Delete Code");
                    
                    serialno = request.getParameter("serialno");
                    PreparedStatement ps = DbConnect.connect().prepareStatement("delete from todo where serialno=?");
                    ps.setString(1, serialno);
                    int n=ps.executeUpdate();
                     result="Deleted " + n + " records";
                   
            }
            }
        %>
    <center>
        <%=result%>
        <h1> Todo List Search and Delete </h1>

        <form method="post">
            <input type="hidden" name="check"/>
            <br>
            <br>
            <input value="<%=serialno%>" autocomplete="off" name="serialno" type="hidden">
            <br>
            task<input value="<%=task%>"  name="task" type="text">
            <br>
            description<textarea   name="description" ><%=description%></textarea>
            <br>
            taskstatus<input value="<%=taskstatus%>"  name="taskstatus" type="text">
            <br>
            <br>
 

            <input type="submit" name="option" value="Delete"/>
        </form>
    </center>
</body>
</html>
            <%@include  file="footer.jsp" %>