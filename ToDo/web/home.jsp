<%@include file="header.jsp"%>
<title>Demo Page</title>
</head>
<body>
    <%@include  file="memu.jsp" %>
    <div class="container">
        
        <style>
            .anand
            {
                height:10%;
                width:400px;
            }
            body{
                background-color: window; 
            }
            h1 {
                color: black;
            }
        </style>
        <div class="container">
        <center>
            <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="images/1.jpg" class="anand" alt="..."width="500px">
                    </div>
                    <div class="carousel-item">
                        <img src="images/2.jpg" class="anand" alt="..."width="500px">
                    </div>
                    <div class="carousel-item">
                        <img src="images/3.jpg" class="anand" alt="..."width="500px">
                    </div>
                    </center>
    
                
                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Next</span>
                </button>
            </div>
            <br>
            <br>
            <center>
                <h1>This Is My Todo App</h1>
                <h6>The todo app is a personal task management tool which provides
                    the following facilities.<br>
                    1.Task Insert
                    (You Can Store Our Task From Here)
                    <br>
                    2.Task Update
                    (Update The Task From Previous Existing Task)
                    <br>
                    3.Task Delete
                    (Delete The Task From The Table
                   <br>
                    </h6>

            <hr class="featurette-divider">

            <div class="row featurette">
                <div class="col-md-7">
                    <h2 class="featurette-heading">MY NAME IS-<span class="text-muted">ANAND KUMAR PAL</span></h2>
                    <h2 class="featurette-heading">Address-<span class="text-muted">Varanasi</span></h2>
                    <h2 class="featurette-heading">I am a fresher-<span class="text-muted">Looking For A Job</span></h2>
                    <h2 class="featurette-heading">Education-<span class="text-muted">(Pursuing) In Mca 3rd Sem</span></h2>
                    <h2 class="featurette-heading">Email Id-<span class="text-muted">anandkumarpal121@gmail.com</span></h2>
                    <p class="lead"></p>
                </div>
                <div class="col-md-5">
                    <img src="images/4.jpg" width="300" height="300">
                </div>
            </div>

            <hr class="featurette-divider">

            <div class="row featurette">
                <div class="col-md-7 order-md-2">
                    <h2 class="featurette-heading">ToDo <span class="featurette-heading">Insert Data</span></h2>
                    <p class="lead">First We Needed To Create The table In Database</p>
                    <p class="lead">Then We Needed To Create The Jsp Page</p>
                    <p class="lead">After Jsp Page We Need To Connect The Jsp Page With Database</p>
                </div>
                <div class="col-md-5 order-md-1">
                    <img src="images/5.png" width="500" height="400">
                </div>
            </div>

            <hr class="featurette-divider">

            <div class="row featurette">
                <div class="col-md-7">
                    <h2 class="featurette-heading">ToDo<span class="featurette-heading"> Update Data</span></h2>
                    <p class="lead">Updating The Records In Todo App By Serialno</p>
                    <p class="lead">Because We Make Serialno  Primary Key</p>
                    <p class="lead">First We Retrive Data From Database After Confermation</p>
                    <p class="lead">Delete The Data From Database</p>

                </div>
                <div class="col-md-5">
                    <img src="images/6.jpg" width="400" height="400">
                </div>
            </div>

            <hr class="featurette-divider">
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            </div>


            <%@include  file="footer.jsp" %>