package universidadejemplo.conexionBaseDatos;

import java.sql.Connection;

import java.util.List;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import universidadejemplo.entidades.Alumno;

public class alumnoData {

    private Connection con = null;

    public alumnoData() {
        con = Conexion.getConexion();
    }

    public void guardarAlumno(Alumno alumno) {
        String sql = "INSERT INTO alumno(dni, apellido, nombre, fechaNacimiento, activo)" + "VALUES ( ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaN()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno guardado correctamente");
            }
            ps.close();
            
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
          
        }
  
    }
    
     public void modificarAlumno(Alumno alumno) {
         String sql = "UPDATE alumno SET dni = ?, apellido = ?, nombre = ?, fechaNacimiento = ?" + "WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaN()));
            ps.setInt(5, alumno.getIdAlumno());
            int exito = ps.executeUpdate();
             if(exito == 1){
                 JOptionPane.showMessageDialog(null, "Alumno modificado");
             }
            
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al modificar la tabla alumno");
        }
    }
    public void eliminarAlumno(int idAlumno) {
         String sql = "UPDATE alumno SET activo = 0 WHERE idAlumno = ?";
          try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
             int exito = ps.executeUpdate();
             if(exito == 1){
                 JOptionPane.showMessageDialog(null, "Alumno eliminado");
             }
    }   catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al eliminar alumno");
        }
     
    }  
    
    public Alumno buscarAlumno(int idAlumno){
        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ?  AND activo = 1";
        Alumno alumno = null;
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                alumno=new Alumno();
                alumno.setIdAlumno(idAlumno);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaN(rs.getDate("fechaNacimiento").toLocalDate());       
                alumno.setEstado(true);
            }else{
                 JOptionPane.showMessageDialog(null, "No existe un alumno con ese ID");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return alumno;   
    }

    public Alumno buscarAlumnoPorDni(int dni) {
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni = ?  AND activo = 1";
        Alumno alumno = null;
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                alumno=new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaN(rs.getDate("fechaNacimiento").toLocalDate());       
                alumno.setEstado(true);
            }else{
                 JOptionPane.showMessageDialog(null, "No existe un alumno con ese DNI");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return alumno;   
    }

    public List<Alumno> listarAlumnos() {
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE activo = 1";
        ArrayList<Alumno> alumnos = new ArrayList<>();
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
           
            while(rs.next()){
                Alumno alumno=new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaN(rs.getDate("fechaNacimiento").toLocalDate());       
                alumno.setEstado(true);
                alumnos.add(alumno);
            }
            ps.close();
    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");

}
        return alumnos;
}
}
