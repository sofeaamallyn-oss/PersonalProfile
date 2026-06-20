<%-- 
    Document   : viewProfiles
    Created on : Jun 18, 2026, 2:14:18 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="bean.ProfileBean"%>
<!DOCTYPE html>
<html>
    <head>
        <title>View Profiles</title>
        
        <style>
            
            body{
               font-family:Arial;
               background:#ffe6f2;
            }
            
            .container{
               width:90%;
               margin:50px auto;
               background:white;
               padding:20px;
               border-radius:10px;
               box-shadow:0px 0px 10px gray;
            }
            
            h2{
               text-align:center;
               color:#cc0066;
            }
            
            table{
               width:100%;
               border-collapse:collapse;
            }
            
            th,td{
               border:1px solid #ddd;
               padding:10px;
               text-align:left;
            }

            th{
               background:#cc0066;
               color:white;
            }
            
            .btn{
                display: block;
                width: 200px;
                text-align: center;
                background-color: #cc0066;
                color: white;
                padding: 10px 20px;
                text-decoration: none;
                border-radius: 8px;
                margin: 10px;
            }
            
            .btn:hover{
                background-color: #b30059;
            }

        </style>
        
    </head>
   <body>
       <div class="container">
           <h2>All Profile</h2>
           
           <a href="searchProfile.html" class="btn">Search Profile</a>
           
           
           <table>
               <tr>
                   <th>Student ID</th>
                   <th>Name</th>
                   <th>Programme</th>
                   <th>Email</th>
                   <th>Hobbies</th>
                   <th>Introduction</th>
                   <th>Edit</th>
                   <th>Delete</th>
               </tr>
               
               <%
                   List<ProfileBean> list = (List<ProfileBean>) request.getAttribute("list");
                   
                   for(ProfileBean p : list){
                %>
                
                
                <tr>
                    <td><%= p.getStudentID()%></td>
                    <td><%= p.getName()%></td>
                    <td><%= p.getProgramme()%></td>
                    <td><%= p.getEmail()%></td>
                    <td><%= p.getHobbies()%></td>
                    <td><%= p.getIntroduction()%></td>
                    
                    
                    <td>
                        <a href="EditServlet?studentID=<%=p.getStudentID()%>">
                        Edit
                        </a>
                    </td>
                    <td>
                        <a href="DeleteServlet?studentID=<%=p.getStudentID()%>" onclick="return confirm('Delete this profile?')">
                        Delete
                        </a>
                    </td>
                </tr>
                <%
                   }
               %>
           </table>
           <br>
           <a href="profile.html" class="btn">Add New Profile</a>
       </div>
    </body>
</html>
