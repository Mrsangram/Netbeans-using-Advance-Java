/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcconnetion;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author sangram
 */
public class RandomInsertDta {
    public static void main(String[] args) {
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog",
                    "root","");
            
            PreparedStatement ps =(PreparedStatement) con.prepareStatement("insert into "
                    + "table1(tname,tcity) values(?,?)");
            
            
            ps.setString(1,"Mohamad Dhyan Chandr Yadav");
            
            ps.setString(2,"New Downtown New York");
            
            
            
            
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        
    }
    
}
