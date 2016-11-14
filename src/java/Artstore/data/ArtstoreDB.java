/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Artstore.data;

import Artstore.Business.Artist;
import ArtstoreSQL.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Dynee
 */
public class ArtstoreDB {
    
    // code for INSERT, UPDATE, AND DELETE ARTIST'S
    
    public int addArtist(Artist artist) throws SQLException {
        
        // create connection to the database
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement myStmt = null;
        
        try {
            
            String query = "INSERT INTO ARTIST"
                    + "(first_name, last_name, email, password)"
                    + "VALUES (?, ?, ?, ?)";
            
            myStmt = connection.prepareStatement(query);
            
            myStmt.setString(1, artist.getFirstName());
            myStmt.setString(2, artist.getLastName());
            myStmt.setString(3, artist.getEmail());
            myStmt.setString(4, artist.getPassword());
            
            return myStmt.executeUpdate();
            
        }
        
        finally {
            
            // close connections
            
            myStmt.close();
            connection.close();
        }
        
        
    }
    
    public int updateArtist(Artist artist) {
        
        
        
        return 0;
    }
    
    
    public void deleteArtist(Artist artist) {
        
    }
    
    // code for INSERT, UPDATE AND DELETE ARTWORK_ITEM'S
    
}
