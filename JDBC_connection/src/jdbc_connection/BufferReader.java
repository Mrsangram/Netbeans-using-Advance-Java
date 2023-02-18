/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_connection;

import com.mysql.jdbc.PreparedStatement;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author sangram
 */
public class BufferReader {
    public static void main(String[] args) {

        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog","root","");
            
            String q = "insert into table2(tname,tcity) values(?,?)";
            
            
            BufferedReader Br  = new BufferedReader(new  InputStreamReader(System.in));
            
            System.out.println("Enter your Name");
            
            String name = Br.readLine();
            
            System.out.println("Enter your City Name :");
            String city  = Br.readLine();
            
            
            
            PreparedStatement ps  =(PreparedStatement) con.prepareStatement(q);
            
             ps.setString(1,name);
             ps.setString(2, city);
            
            
            
            
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        
    }
}
