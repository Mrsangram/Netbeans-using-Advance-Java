/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_connection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author sangram
 */
public class JDBC_connection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        try {
            
           
            
            //Load Driver  packeage 
            
            Class.forName("com.mysql.jdbc.Driver");
            
            //Creating a connection 
            
            Connection con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog","root","");
            
            
            
            
            if(con.isClosed()){
                System.out.println("Connection is Closed");
            }
            else{
                System.out.println("Connected ...");
            }
            
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
}
