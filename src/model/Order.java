/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

/**
 *
 * @author Student
 */
public class Order {
     int orderId;
     String orderOwner;
     String restaurant;
     String[] orderItems;
     int orderTotal;
     Calendar orderDate;
     
     int previousId = 0;
     
//     constructor for Order object using fields order owner, order items and restaurant
     public Order(String orderOwner, String restaurant, String[] orderItems){
         this.orderId = ++previousId;
         this.orderOwner = orderOwner;
         this.orderItems = orderItems;
         this.restaurant = restaurant;
         this.orderDate = getNow();
     }
     
     public Order (String orderOwner, String restaurant, String[] orderItems, int orderTotal){
         this.orderId = ++previousId;
         this.orderOwner = orderOwner;
         this.orderItems = orderItems;
         this.restaurant = restaurant;
         this.orderTotal = orderTotal;
         this.orderDate = getNow();
     }
     
     public int getOrderId(){
         return this.orderId;
     }
     
     public String getOrderOwner(){
         return this.orderOwner;
     }
     
     public void setOrderOwner(String orderOwner){
         this.orderOwner = orderOwner;
     }
     
     public String[] getOrderItems(){
         return this.orderItems;
     }
     
     public String getRestaurant(){
         return this.restaurant;
     }
     
     private Calendar getNow() {
        /*GETINSTANCE() is a Calendar class static method which 
        gets a calendar right now using the default time zone and locale*/
        Calendar now = Calendar.getInstance();  
        return now;
    } 
    
     public static String formatOrderDate(Calendar calendar) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//creates a new date format object to parse a date object into a string
        //Calendar now = Calendar.getInstance();  

        //getTime() is a Calendar class method that returns a Date object representing this Calendar's time value        
        return dateFormat.format(calendar.getTime()); //uses the DateFormat class method format(Date date) to change a date object to a string
    }   
     
     
    public boolean equals(Order orderToCheck) {
        
        return ((this.orderId == orderToCheck.orderId) && (orderToCheck != null) && (this.getClass() == orderToCheck.getClass()));
    }
    
     @Override
    public String toString() {
        return "\nOrder: " + this.orderId + " - Made by: " + this.orderOwner +            
                " - From: " + this.restaurant + " - Order Items: " + Arrays.toString(this.orderItems) +
                " - Made On: " + formatOrderDate(this.orderDate) + " - Your Total: ₦" + this.orderTotal;
    }
}
