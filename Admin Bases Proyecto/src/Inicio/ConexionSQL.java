/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David
 */
public class ConexionSQL {
    
    static Connection contacto=null;
    
    public static Connection getConnexion(){
        String connectionURL="jdbc:sqlserver://DESKTOP-AO9T1PL\\DAVID:1433;databaseName=Proyecto1b ADBBD";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
          
            System.out.println("Nos Conectamos");
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }  try{
        contacto=DriverManager.getConnection(connectionURL,"cristhian","12345");
        }catch (SQLException ex){
     System.out.println(ex.getMessage());
    }
        
        return contacto;

    }


public static ResultSet Consulta(String consulta){
Connection con= getConnexion();
Statement declara;
    try{
        declara=con.createStatement();
       ResultSet respuesta =declara.executeQuery(consulta);
        return respuesta;
    }
    catch (SQLException ex){
     System.out.println(ex.getMessage());
    }
    return null;
  
}


public static Integer EliminarDato(String consulta){
Connection con= getConnexion();
Statement declara;
    try{
        declara=con.createStatement();
       int respuesta =declara.executeUpdate(consulta);
        System.out.println("clase conexion: "+consulta);
        return respuesta;
    }
    catch (SQLException ex){
     System.out.println(ex.getMessage());
    }
    return null;
  
}


}//fin clase
