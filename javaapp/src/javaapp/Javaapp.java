
package javaapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Javaapp {

    public static void main(String[] args) {
        
        
       
try {
    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/prueba","root","masterdev69");
    Statement s = conexion.createStatement();
    ResultSet rs = s.executeQuery("SELECT * FROM persona");
    
    while(rs.next())
        System.out.println( rs.getInt(1) + " " + rs.getString(2) + "\n");
    }
       

catch (SQLException ex) {
    Logger.getLogger(Javaapp.class.getName()).log(Level.SEVERE, null, ex);
    System.out.println("no conectado");
}
   
    
}}