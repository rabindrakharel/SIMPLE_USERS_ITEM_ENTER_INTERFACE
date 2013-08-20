/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {
    private Connection connection;
    private ResultSet rs;
    
    public Connector(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
   // connection=DriverManager.getConnection("jdbc:mysql://mysql6.000webhost.com:3306/a4309023_kd","a4309023_kd","asdf123456789");
   connection=DriverManager.getConnection("jdbc:mysql://mysql6.000webhost.com:3306/a4309023_retail","a4309023_retMic","a4309023_retMicrabin");
    
    }
    catch(Exception ex)
    {
    System.out.print(ex);
    } }

    public Statement returnStatement() throws SQLException
    {
        Statement st=connection.createStatement();
        return st;
        // comments here
        
    }
    
    public static void main(String args[])
    {
    Connector c1=new Connector();
    System.out.print("successful");
    }
    
}
