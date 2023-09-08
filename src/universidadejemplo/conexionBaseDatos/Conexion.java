/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadejemplo.conexionBaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres Chico
 */
public class Conexion {
  
private static Conexion conexion=null;
        
        private Conexion(){
    // CARGAR DRIVER DE CONEXION
        try {
        Class.forName("org.mariadb.jdbc.Driver");
    
         }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Debe agregar los drivers al proyecto");
        
         }     
}
public static Connection getConexion(){
    Connection con = null;
    if(conexion  == null){
        conexion = new Conexion();
    }
    try{
    //CONEXION A LA BASE DE DATOS
         con = DriverManager.getConnection("jdbc:mariadb://localhost/universidadulpg","root",""); //cambie el nombre de la tabla a la que creamos para este grupo
    }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error de conexion con la base de datos"+ex.getMessage());    
      
}
    return con;
}
}
