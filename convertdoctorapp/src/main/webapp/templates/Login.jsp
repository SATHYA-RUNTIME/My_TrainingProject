<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>LOGIN_HOME</title>
            <!-- <link href="<core:url value="css/commoncss.css"/>" rel="stylesheet" type="text/css" media="all"> -->
            <link href="<c:url value="/resources/css/commoncss.css" />" rel="stylesheet">            
            <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.1/jquery.min.js"
                integrity="sha512-aVKKRRi/Q/YV+4mjoKBsE4x3H+BkegoM/em46NNlCqNTmUYADjBbeNefNxYV7giUp0VxICtqdrbqU7iVaeZNXA=="
                crossorigin="anonymous" referrerpolicy="no-referrer"></script>
        </head>

        <body id="login">
            <h1 id="lr">Log-In/Register</h1><br>
            <div id="mycontain">
                <div id="subdiv">
                    <p>Login</p>
                    <center><form action="/log_in" method="post" id="logform">
                        <input id="ipbox" type="text" placeholder="patient_name" name="u_name" required><br>
                        <input id="ipbox" type="password" placeholder="Password" name="passwd" required><br>
                        <input id="btn" type="submit" value="Login">
                    </form></center>
                </div>
                
            </div>

        </body>

        </html>