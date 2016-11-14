/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Artstore.Business;

/**
 *
 * @author Dynee
 */
public class ArtworkItem {
    
    private int artistId;
    private int itemId;
    private String type;
    private double price;
    
    public ArtworkItem(int artistId, int itemId, String type, double price) {
        this.artistId = artistId;
        this.itemId = itemId;
        this.type = type;
        this.price = price;
    }
    
    public void setArtistId(int id) {
        this.artistId = id;
    }
    
    public int getArtistId() {
        return artistId;
    }
    
    public void setItemId(int id) {
        this.itemId = id;
    }
    
    public int getItemId() {
        return itemId;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }
    
}
