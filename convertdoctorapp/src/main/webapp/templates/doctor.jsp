</html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <html lang="en">

        <head>



            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
            <link href="<c:url value="/resources/css/index.css" />" rel="stylesheet">

            <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.1/jquery.min.js"
                integrity="sha512-aVKKRRi/Q/YV+4mjoKBsE4x3H+BkegoM/em46NNlCqNTmUYADjBbeNefNxYV7giUp0VxICtqdrbqU7iVaeZNXA=="
                crossorigin="anonymous" referrerpolicy="no-referrer"></script>


            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" />
            <script src="https://code.jquery.com/jquery-3.6.0.min.js ">
            </script>
        </head>

        <body>

            <input type="hidden" id="stflag" value=${statusflag}>
            <div id="doctor2">
                <input type="hidden" id="hv" value=${company}>
                <div id="top">
                    <p id="status"></p> People's Hospital

                    <h3 id="name">
                        <font color="white"> Hi,${uname1}</font> <a href="/">Logout</a>
                    </h3>
                </div>

                <div id="button">
                    <a href="../viewaooiment" id="atag">View All Appoiment</a>
                    <a href="../viewdoctorappo" id="atag">your Appoiments</a>
                    <a href="#" id="atag">Nothing</a>
                  
                </div>
            </div>

            <div id="patient">
                <input type="hidden" id="hv" value=${company}>
                <div id="top">
                    <p id="status"><button onclick="status()">status</button></p> People's Hospital

                    <h3 id="name">Hi,${uname1} <a href="/">Logout</a></h3>
                </div>

                <div id="button">
                    <a href="../app" id="atag">Make Appoiment</a>
                    <button onclick="showdoct()" id="atag">View All Doctors</button>
                    <a href="../datecheck" id="atag">check Appoiment Date</a>

                </div>
            </div>
            <div id="statusdiv">
                <table id="statustbl" border="1px"></table>
            </div>






            <!-- 
           <div id="maindiv">
            <div id="slide1">sathya</div>
           <div id="slide1">ramesh</div>
           <div id="slide1">dom</div>
        </div> -->
            <!-- <button onclick="sendEmail()">mybutton</button> -->
           
            <script src="<c:url value=" /resources/js/doctor.js" />"></script>
            // <script src="<c:url value=" https://smtpjs.com/v3/smtp.js" />
            // </script> 
        </body>

        </html>