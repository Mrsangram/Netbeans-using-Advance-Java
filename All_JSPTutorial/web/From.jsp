<%-- 
    Document   : From
    Created on : Mar 21, 2022, 1:40:56 AM
    Author     : sangram
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>



        <form action="Register" method="get">
            <h2>From submission</h2>
            <table>        
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="userName" placeholder="Enter the UserName"></td>
                </tr>
                <tr>
                    <td>Password :</td>
                    <td><input type="password" name="userPass" placeholder="Enter the Password"></td>
                </tr>
                <tr>
                    <td> Email:</td>
                    <td><input type="email" name="userEmail" placeholder="Enter the Email..."></td>
                </tr>
                
                <tr>
                    <td>Courses:</td>
                    <td><select name="userCourses">
                            <option value="java">JAVA</option>
                            <option value="python">Python</option>
                            <option value="web Design">Web Design</option>
                            <option value="android">Android</option>
                            <option value="iOS Design">iOS Design</option>
                        </select></td>
                        
                </tr>
                
                <tr>
                    <td>Gender:</td>
                    <td>Male<input type="radio" name="Gender" value="male" > &nbsp;Female<input type="radio" name="Gender" value="female"></td>
                </tr>
                
                <tr>
                    <td><button type="submit">submit</button></td>
                    <td><button type="reset">reset</button></td>
                </tr>
            </table>
        </form>

    </body>
</html>
