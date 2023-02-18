/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_connection;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;

/**
 *
 * @author sangram
 */
class PreparedStatements {
    
    public static void main(String[] args) {
        
        try {
            
            
            //locad Driver 
            Class.forName("com.mysql.jdbc.Driver");
            
            
            try ( //Create a connection
                          Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog","root","")) {
                PreparedStatement pstm = (PreparedStatement) con.prepareStatement("insert into table1(tname,tcity) values (?,?)");
          
                pstm.setString(1,"Sangram");
                pstm.setString(2,"Delhi");
            }
          
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

}
