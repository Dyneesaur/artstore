<%-- 
    Document   : SignUp
    Created on : Nov 13, 2016, 9:03:31 PM
    Author     : Dynee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign up</title>
    </head>
    <body>
        <form action="/Artstore/ArtstoreController" method="post">
            
            First Name:
            <input type="text" placeholder="first name" name="first_name" /> <br />
            Last Name:
            <input type="text" placeholder="last name" name="last_name" /> <br />
            Email:
            <input type="email" placeholder="email adress" name="email" /> <br />
            Password:
            <input type="password" placeholder="password" name="password" /> <br/>
            
            <input type="submit" placeholder="submit" name="submit">
        </form>
        <a href="index.html">Back</a>
    </body>
</html>
