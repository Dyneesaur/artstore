<%-- 
    Document   : SignUp
    Created on : Nov 13, 2016, 9:03:31 PM
    Author     : Dynee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="includes/header.jsp"%>


<h1 id="center"> Signup for Artstore </h1>
    

<div class="signupForm">
    
    <div class="input-group input-group-lg">
        
        <form action="/Artstore/ArtstoreController" method="post">
            
            <input class="form-control" id="margBottom" type="text" placeholder="first name" name="first_name" /> <br />
            
            <input class="form-control" id="margBottom" type="text" placeholder="last name" name="last_name" /> <br />
            
            <input class="form-control" id="margBottom" type="email" placeholder="email adress" name="email" /> <br />
            
            <input class="form-control" id="margBottom" type="password" placeholder="password" name="password" /> <br/>
            
            <input class="btn btn-success" id="margBottom" type="submit" placeholder="submit" name="submit" value="Sign up"> <br />
        
            <a href="index.jsp">Back</a>
            
        </form>
        
    </div>
    
</div>



        

        
