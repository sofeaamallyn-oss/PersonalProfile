<%-- 
    Document   : searchResult
    Created on : Jun 18, 2026, 1:44:18 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <title>Search Result</title>
         
         <style>
             body{
                font-family:Arial;
                background:#ffe6f2;
            }

             .card{
                width:500px;
                background:white;
                margin:60px auto;
                padding:25px;
                border-radius:10px;
                box-shadow:0px 0px 10px gray;
            }

              h2{

                text-align:center;
                color:#cc0066;
            }

            .label{
                font-weight:bold;
                color:#cc0066;
            }

             a{
                display:block;
                text-align:center;
                background:#cc0066;
                color:white;
                padding:10px;
                text-decoration:none;
                margin-top:20px;
                border-radius:8px;
             }

         </style>
    </head>
    <body>
        <div class="card">
            <h2>Search Result</h2>
            <p><span class="label">Student ID</span>${studentID}</p>
            <p><span class="label">Name</span>${name}</p>
            <p><span class="label">Programme</span>${programme}</p>
            <p><span class="label">Email</span>${email}</p>
            <p><span class="label">Hobbies</span>${hobbies}</p>
            <p><span class="label">Introduction</span>${introduction}</p>
            
            <a href="searchProfile.html">Search Again</a>
        </div>
    </body>
</html>
