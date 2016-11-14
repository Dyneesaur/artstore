<%-- 
    Document   : Login
    Created on : Nov 14, 2016, 3:00:56 PM
    Author     : Dynee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="includes/header.jsp"%>

<h1 id="center"> Log in to Artstore </h1>
    

<div class="signupForm">
    
    <div class="input-group input-group-lg">
        
        <form action="/Artstore/ArtstoreController" method="post">
            
            <input class="form-control" id="margBottom" type="email" placeholder="email adress" name="email" /> <br />
            
            <input class="form-control" id="margBottom" type="password" placeholder="password" name="password" /> <br/>
            
            <input class="btn btn-success" id="margBottom" type="submit" placeholder="submit" name="submit" value="Login"> <br />
        
            <a href="index.jsp">Back</a>
            
        </form>
        
    </div>
    
</div>