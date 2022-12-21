<%@page import="utilities.utilities"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="databasepackage.DbConnect"%>
<%@include file="header.jsp" %>
<body>
    <!--Content-->
    <%@include file="menu.jsp" %>
    
    <%
        boolean ispostback = false;
        if (request.getParameter("check") != null) {
            ispostback = true;
        }
        String otp = "", mobile = "", result = "";
        if (ispostback) {
            try {
                mobile = request.getParameter("mobile");
                mobile = request.getParameter("number");
                otp = utilities.otp(5);
                PreparedStatement ps = DbConnect.connect().prepareStatement("insert into booking values(?,?) ");
               ps.setString(1, mobile);
               ps.setString(2, otp);
                ps.executeUpdate();
                result = "Inserted";
            } catch (Exception ex) {
                System.out.println("ex");
                result = "" + ex;
            }
        }
    %>
<center>
    <h1>Booking App</h1>
    <form method="post">
        <h3><%=result%></h3>
        <input type="hidden" name="check" value="1"><br>          
        <div class="container col-md-3">
            <div class="row">
                <div class="col-md-3"></div
                <div class="col-md-6"></div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">Enter mobile number</label>
                    <input name="number" type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter mobile number" value="<%=mobile%>">
                </div>
                <div class="col-md-3">
                    <input  type="submit" class="form-control btn btn-danger" id="exampleFormControlInput1" value="Get Otp">
                </div>
                <div class="col">
                    <label for="exampleFormControlInput1" class="form-label">OTP</label>
                    <input name="submit" name="text" readonly type="number" class="form-control" id="exampleFormControlInput1" placeholder="Enter OTP"value="<%=otp%>">
                </div>
                <br>
                <div class="col-md-3">
                    <input type="submit"class="form-control btn btn-primary">
                </div>
                <br>
                </form>
                </center>
                <%@include  file="footer.jsp" %>