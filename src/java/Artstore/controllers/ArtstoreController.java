/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Artstore.controllers;

import Artstore.Business.Artist;
import Artstore.data.ArtstoreDB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dynee
 */
@WebServlet("/ArtstoreController")
public class ArtstoreController extends HttpServlet {
    
   
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        addArtist(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        addArtist(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

    private String addArtist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        String email = request.getParameter("email");
        
        // this will get hashed eventually 
        String password = request.getParameter("password");
        
        Artist artist = new Artist();
        artist.setFirstName(firstName);
        artist.setLastName(lastName);
        artist.setEmail(email);
        artist.setPassword(password);
        
        request.setAttribute("artist", artist);
        request.getRequestDispatcher("thanks.jsp").forward(request, response);
        
        try {
            ArtstoreDB db = new ArtstoreDB();
            db.addArtist(artist);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
        // create HTTPSESSION here for user login ect...
        
        return "thanks.jsp";
        
    }

}
