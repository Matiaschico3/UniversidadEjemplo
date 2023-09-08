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

    public void guardarInscripcion(Inscripcion ins, Materia mat, Alumno alu) { // nose si esto esta bien, preguntar profe
        
        String sql="INSERT INTO inscripcion(nota, idAlumno, idMateria) VALUES (?,?,?);";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setDouble(1, ins.getNota());
            ps.setInt(2, alu.getIdAlumno());
            ps.setInt(3, mat.getIdMateria() );
            
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
                
                inscripcion.setNota(rs.getDouble("nota"));  //nose como traer los idalumno e idmateria, consultar profe
                
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(inscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return insc;
    }
    
    
    

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idInscripcion) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Materia> obtenerMateriasCursadas(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Materia> obtenerMateriasNOCursadas(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
    }

    public List<Alumno> obtenerAlumnosXMaterias(int idMaterias) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
