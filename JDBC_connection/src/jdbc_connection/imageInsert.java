/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_connection;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.FileInputStream;
import java.sql.DriverManager;

/**
 *
 * @author sangram
 */
public class imageInsert {
    
    public static void main(String[] args) {
        
        
        try {
            
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            String q = "insert into images(pic) values(?)";
            PreparedStatement pstm = (PreparedStatement) con.prepareStatement(q);
            
            
            FileInputStream fis = new FileInputStream("C:\\Users\\sangram\\Downloads\\image.jpg");
            
            pstm.setBinaryStream(1, fis, fis.available());
            pstm.executeUpdate();
            System.out.println("Done ...");
            
            
            
            
            
            
            
            
        } catch (Exception e) {
        }
    }
    
}
