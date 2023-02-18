/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_connection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author sangram
 */
public class Table_creation {
    
    public static void main(String[] args) {
        try {
            
            //locad Driver 
            Class.forName("com.mysql.jdbc.Driver");
            
            
            //Create a connection
            
            Connection con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog","root","");
            
            //Create a teble in query from my sql
            
            String  q= "create table table3(tid int(20) primary key auto_increment,tname varchar(200) not null,tcity varchar(400))";
            
            Statement  st = con.createStatement();
            
            st.executeUpdate(q);
            System.out.println("table is Created by Juery...");
            
            con.close();
            
            
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
