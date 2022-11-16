<%@page import="java.sql.PreparedStatement"%>
<%@page import="database.Utilities"%>
<%@page import="database.Utilities"%>
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
                    PreparedStatement ps =database.DbConnect.connect().prepareStatement("insert into todo values (todoseq.nextval ,?,?,?,sysdate)");
                    ps.setString(1, serialno);
                    ps.setString(1, task);
                    ps.setString(2, description);
                    ps.setString(3,status);
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
            <br>
            <label></label>
            <input type="submit">
            <input name="option" type="submit" value="clear">
            <br>           
            <%=Utilities.getTodoList()%>
            </body>
        </form>
        </html>