package universidadejemplo.conexionBaseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadejemplo.entidades.Alumno;
import universidadejemplo.entidades.Inscripcion;
import universidadejemplo.entidades.Materia;

public class inscripcionData {

    private Connection con;

    private materiaData matData;

    private alumnoData aluData;
    
    
    //constructor

    public inscripcionData() {
    }
    
    //funciones

    public void guardarInscripcion(Inscripcion ins) { // nose si esto esta bien, preguntar profe
        
        String sql="INSERT INTO inscripcion(nota, idAlumno, idMateria) VALUES (?,?,?);";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setDouble(1, ins.getNota());
            ps.setInt(2, ins.getAlumno().getIdAlumno());
            ps.setInt(3, ins.getMateria().getIdMateria());
            
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            
            //cartel para ver si fue hecho exitosamente la inscripcion
            
            if(rs.next()){
                
                ins.setIdInscripcion((rs.getInt(1)));
                JOptionPane.showMessageDialog(null, "Inscripcion realizada exitosamente");
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Inscripcion");
        }
        
    }

    public List<Inscripcion> obtenerInscripciones() {
        String sql="SELECT idInscripto, nota, idAlumno, idMateria FROM `inscripcion` WHERE idInscripto";
        
        ArrayList<Inscripcion> insc=new ArrayList();
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                Inscripcion inscripcion=new Inscripcion();
                Alumno alu=new Alumno();
              alu.setIdAlumno(rs.getInt("idAlumno")); // paso el id de la tabla a la variable creada
               Materia mat=new Materia();
                mat.setIdMateria(rs.getInt("idMateria"));
                
                //-----------
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                inscripcion.setNota(rs.getDouble("nota"));  //nose como traer los idalumno e idmateria, consultar profe
                inscripcion.setAlumno(alu); // y la paso por aca a la tabla inscripcion
                inscripcion.setMateria(mat);
                insc.add(inscripcion);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(inscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return insc;
    }
    
    
    

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idInscripcion) {
        String sql="SELECT inscripcion.idInscripto, inscripcion.nota, alumno.idalumno, alumno.dni, alumno.apellido, alumno.nombre, alumno.fechanacimiento,"
                + " inscripcion.idmateria FROM inscripcion JOIN alumno ON(inscripcion.idalumno = alumno.idalumno) WHERE alumno.idalumno = 1";
        
        ArrayList<Inscripcion> insc2=new ArrayList();
        
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                Inscripcion inscripcion=new Inscripcion();
                Alumno alu=new Alumno();
              alu.setIdAlumno(rs.getInt("idAlumno")); // paso el id de la tabla a la variable creada
               Materia mat=new Materia();
                mat.setIdMateria(rs.getInt("idMateria"));
                
                //-----------
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                inscripcion.setNota(rs.getDouble("nota"));  //nose como traer los idalumno e idmateria, consultar profe
                inscripcion.setAlumno(alu); // y la paso por aca a la tabla inscripcion
                inscripcion.setMateria(mat);
                insc2.add(inscripcion);
            }
            
              ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(inscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return insc2;
    }

    public List<Materia> obtenerMateriasCursadas(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Materia> obtenerMateriasNOCursadas(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        
        String sql="DELETE FROM inscripcion WHERE idAlumno=? AND idMateria=? ";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno );
            ps.setInt(2, idMateria);
            
            ps.executeUpdate();
            
             ResultSet rs=ps.getGeneratedKeys();
            
            //cartel para ver si fue hecho exitosamente la inscripcion
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Inscripcion realizada exitosamente");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a tabla Inscripcion");
        }
        
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        
        String sql="UPDATE inscripcion SET nota=4 WHERE idAlumno=? AND idMateria=? ";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            
            //cartel para ver si fue hecho exitosamente la inscripcion
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Inscripcion realizada exitosamente");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a tabla Inscripcion");
        }
        
    }

    public List<Alumno> obtenerAlumnosXMaterias(int idMaterias) {
        String sql="SELECT * FROM inscripcion JOIN alumno ON(inscripcion.idAlumno=alumno.idAlumno) WHERE idMateria=1;";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idMaterias);
            
            ps.executeQuery();
            ResultSet rs=ps.getGeneratedKeys();
            
           while(rs.next()){
                 System.out.println("ID "+ rs.getInt("idAlumno"));
              System.out.println("DNI "+ rs.getInt("dni"));
              System.out.println("APELLIDO "+rs.getString("apellido"));
              System.out.println("NOMBRE "+rs.getString("nombre"));
              System.out.println("F.NAC "+ rs.getDate("fechaNacimiento"));
              System.out.println("ESTADO "+ rs.getBoolean("activo"));
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(inscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
