/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testrun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Shivang
 */
public class connect 
{
     private static Connection con;
     private static Statement st;
    
    
    public static Statement connection()
    {
         try
         {
             Class.forName("org.sqlite.JDBC");
             String url="jdbc:sqlite:CABS.db";
             con=DriverManager.getConnection(url);
             st=con.createStatement();
             System.out.println("Connection Successful");
         }catch(Exception ex)
         {
             System.out.println("Connection failed");
         }
         return st;
    }
}
