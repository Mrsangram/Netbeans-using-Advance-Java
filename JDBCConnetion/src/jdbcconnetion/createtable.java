/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcconnetion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author sangram
 */
public class createtable {
    public static void main(String args[]){
        try {
             
            
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog","root","");
            String s = "create table user(id integer primery key,name text NOT NULL,capacity real);";
            
            Statement st = con.createStatement();
            st.execute(s);
            System.out.println("Successfully create data");
            
            
                    
            
            
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
    
}
