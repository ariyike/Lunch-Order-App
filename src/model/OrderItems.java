/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;

/**
 *
 * @author Student
 */
public class OrderItems {
     String itemId;
     String restaurant;
     String menuItem;
     int quantity;
     int pricePerUnit;
     int total;
     
//     constructor for OrderItems object using fields
     public OrderItems(String itemId, String restaurant, String menuItem, int quantity, int pricePerUnit){
         this.itemId = itemId;
         this.menuItem = menuItem;
         this.quantity = quantity;
         this.restaurant = restaurant;
         this.pricePerUnit = pricePerUnit;
         
         int orderItemstotal = quantity * pricePerUnit;
         this.total = orderItemstotal;
     }
     
     public OrderItems(String itemId, String restaurant, String menuItem, int quantity, int pricePerUnit, int total){
         this.itemId = itemId;
         this.menuItem = menuItem;
         this.quantity = quantity;
         this.restaurant = restaurant;
         this.pricePerUnit = pricePerUnit;
         this.total = total;
     }
     
     public String getItemId(){
         return this.itemId;
     }
     
     public String getMenuItem(){
         return this.menuItem;
     }
     
     public int getQuantity(){
         return this.quantity;
     }
     
     public int getPricePerUnit(){
         return this.pricePerUnit;
     }
     public int getTotal(){
         return this.total;
     }
    
     public String getRestaurant(){
         return this.restaurant;
     } 
      
    public boolean equals(OrderItems itemToCheck) {
        
        return ((this.itemId.equals(itemToCheck.itemId)) && (itemToCheck != null) && (this.getClass() == itemToCheck.getClass()));
    }
    
     @Override
    public String toString() {
        return "\n Menu Item: " + this.itemId + " - For: " + this.menuItem+            
                " - From: " + this.restaurant + " - Number of Items: " + this.quantity +
                " - at Price per Unit: " + this.pricePerUnit + " - Your Total: ₦" + this.total;
    }
    
}
