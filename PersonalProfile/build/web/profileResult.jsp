<%-- 
    Document   : profileResult
    Created on : May 21, 2026, 2:46:53 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Profile Result</title>
        
        <style>
            body{
                font-family: Arial;
                background-color: #ffe6f2;
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
                margin: 0;
            }
            
            .card{
                width: 500px;
                background: white;
                padding: 25px;
                border-radius: 10px;
                box-shadow: 0px 0px 10px gray;
            }
            
            h2{
                text-align: center;
                color: #cc0066;
            }
            
            p{
                font-size: 16px;
            }
            
            .label{
                font-weight: bold;
                color: #cc0066;
            }
            
            a{
                display: block;
                text-align: center;
                background-color: #cc0066;
                color: white;
                padding: 10px;
                text-decoration: none;
                border-radius: 8px;
                margin-top: 20px;
            }
        </style>
        
    </head>
    <body>
        <div class="card">
            
            <h2>My Personal Profile</h2>
            
            <p><span class="label">Name:</span>${name}</p>
            <p><span class="label">Student ID:</span>${studentID}</p>
            <p><span class="label">Program:</span>${programme}</p>
            <p><span class="label">Email:</span>${email}</p>
            <p><span class="label">Hobbies:</span>${hobbies}</p>
            <p><span class="label">Self Introduction:</span>${introduction}</p>
 
            <a href="profile.html">Back To Form</a>
            <a href="ViewProfilesServlet">View All Profiles</a>
            <a href="profile.html">Add New Profile</a>

        </div>
    </body>
</html>
