<%-- 
    Document   : editProfile
    Created on : Jun 18, 2026, 11:55:27 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="bean.ProfileBean"%>
        <%
        ProfileBean p = (ProfileBean)request.getAttribute("profile");
        %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Profile</title>
        
        <style>
            
            body{
                font-family: Arial;
                background: #ffe6f2;
            }
            
            .container{
                width: 500px;
                margin: 50px auto;
                background: white;
                padding: 25px;
                border-radius: 10px;
                box-shadow: 0px 0px 10px gray;
            }
            
            input,textarea{
                width: 100%;
                padding: 10px;
                margin-top: 5px;
                margin-bottom: 15px;
                box-sizing: border-box;
            }
            
            button{
                width: 100%;
                padding: 12px;
                background: #cc0066;
                color: white;
                border: none;
            }
            
            h2{
                text-align: center;
                color: #cc0066;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h2>Edit Profile</h2>
            
            <form action="UpdateServlet" method="post">
                
                Student ID:
                <input type="text" name="studentID" value="<%=p.getStudentID()%>" readonly>
                
                Name:
                <input type="text" name="name" value="<%=p.getName()%>">
                
                Programme:
                <input type="text" name="programme" value="<%=p.getProgramme()%>">
                
                Email:
                <input type="email" name="email" value="<%=p.getEmail()%>">
                
                Hobbies:
                <input type="text" name="hobbies" value="<%=p.getHobbies()%>">
                
                Introduction:
                <textarea name="introduction"><%=p.getIntroduction()%></textarea>
                
                <button type="submit">
                    Update Profile
                </button>
            </form>
                <a href="ViewProfilesServlet">Back to Profile List</a>
        </div>
    </body>
</html>
