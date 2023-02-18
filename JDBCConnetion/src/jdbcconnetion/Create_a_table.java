/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcconnetion;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.DriverManager;

/**
 *
 * @author sangram
 */
public class Create_a_table {


    public static void main(String[] args) {
         
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
    /// insert data in Mysql
    
       String query = "insert into Emp(name,city) values(?,?)"; 
       
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(query);
             
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Please Enter Your Name :");
            String name =br.readLine();
            
            System.out.println("Please Ente your City :");
            String city = br.readLine();
             ps.setString(1, name);
    
             ps.setString(2, city);
             
             
             ps.executeUpdate();
             System.out.println("Successfull...");
             con.close();
             
             
    



   //Create a Table in Xammp Server 
            
         
//            String q  = "create table Emp(name varchar(20),city varchar(100))";
//            
//            PreparedStatement ps =(PreparedStatement) con.prepareStatement(q);
//            ps.executeUpdate();
//            
//            System.out.println("SuccsesFull...");
//            
            
            
            
            
//             if (con.isClosed()) {
//                 System.out.println("Not Connected your  interface...");
//                
//            }
//             else{System.out.println("Connected...");}
//            
//            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
