/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcconnetion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author sangram
 */
public class JDBCConnetion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog","root","");
            System.out.println("Successful");
            System.out.println(con);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
