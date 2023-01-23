<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><html lang="en">

        </html>

        <head>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.1/jquery.min.js"
            integrity="sha512-aVKKRRi/Q/YV+4mjoKBsE4x3H+BkegoM/em46NNlCqNTmUYADjBbeNefNxYV7giUp0VxICtqdrbqU7iVaeZNXA=="
            crossorigin="anonymous" referrerpolicy="no-referrer"></script>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
            <link href="<c:url value=" /resources/css/index.css" />" rel="stylesheet">
        </head>

        <body>
            <div id="top">
                <p id="status"></p> People's Hospital
                <h3 id="name">Hi,${uname1} <a href="/">Logout</a></h3>

            </div>
            <div id="contain1">
                <h1>MAKE APPOIMENT
                    <hr>
                </h1>

                <br>
                <form action="/makeapp2" method="post">
            
                    <!-- <input id="ipt1"  type="text" placeholder="Appiment Id" name="a_id" ><br> -->
                    <input id="ipt1"  type="text" name="p_id" required value=${pid} ><br>
                    <input id="ipt1" type="date"  name="date" required><br>
                    <input id="ipt1" type="text" placeholder="Hopital Id" name="h_id" required><br>
                    <input id="ipt1" type="text" placeholder="Doctor_Id" name="d_id" required><br>
                    <input id="btn1" type="submit" value="Make Appoiment">
                </form>

            </div>
        </body>

        </html>