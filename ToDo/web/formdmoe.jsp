<%@include file="header.jsp"%>
<title>Demo Page</title>

</head>
<body>
    <%@include  file="memu.jsp" %>
    <div class="container">
        <div class="row">
            <div class="col-md-3"></div>
            <div class="col-md-6">

                <div class="form-floating mb-3">
                    <input type="task" class="form-control" id="floatingInput" placeholder="name@example.com">
                    <label for="floatingInput">Task</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="Description" class="form-control" id="floatingInput" placeholder="name@example.com">
                    <label for="floatingInput">Description</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="Status" class="form-control" id="floatingInput" placeholder="name@example.com">
                    <label for="floatingInput">Status</label>
                </div>
                <div class="form-floating mb-3">
                    <input name="taskdate" type="date" class="form-control" id="floatingInput" placeholder="name@example.com">
                    <label for="floatingInput">taskdate</label>
                </div>

                <div class="form-floating mb-3 " style="padding-top: 10px;">
                    
                                    <input class="btn btn-primary " type="submit" value="Submit">

                </div>
                

            
            <div class="col-md-3"></div>
        </div>
    </div>


    <%@include  file="footer.jsp" %>