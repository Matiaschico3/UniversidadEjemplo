package universidadejemplo.conexionBaseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadejemplo.entidades.Alumno;
import universidadejemplo.entidades.Inscripcion;
import universidadejemplo.entidades.Materia;

public class inscripcionData {

    private Connection con=null;

    private materiaData matData;

    private alumnoData aluData;
    
    
    //constructor

    public inscripcionData() {
        con=Conexion.getConexion(); // no olvidar!!
    }
    
    //funciones

    public void guardarInscripcion(Inscripcion ins) { 
        
        String sql="INSERT INTO inscripcion(nota, idAlumno, idMateria) VALUES (?,?,?)";
       
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, ins.getNota());
            ps.setInt(2, ins.getAlumno().getIdAlumno());
            ps.setInt(3, ins.getMateria().getIdMateria());
            
            
            
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            
            //cartel para ver si fue hecho exitosamente la inscripcion
            
            if(rs.next()){
                
                ins.setIdInscripcion((rs.getInt(1)));
                JOptionPane.showMessageDialog(null, "Inscripcion realizada exitosamente");
            }else{
                System.out.println("Error");
            }
                
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Inscripcion"+ ex.getMessage());
        }
        
    }

    public List<Inscripcion> obtenerInscripciones() {
        String sql="SELECT * FROM inscripcion JOIN alumno a ON(inscripcion.idAlumno=a.idAlumno) WHERE a.activo=1";
        
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
                inscripcion.setIdInscripcion(rs.getInt("idInscripto"));
                inscripcion.setNota(rs.getDouble("nota"));  
                inscripcion.setAlumno(alu); // y la paso por aca a la tabla inscripcion
                inscripcion.setMateria(mat);
                insc.add(inscripcion);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener las inscripciones "+ ex.getMessage());
        }
        
        return insc;
    }
    
    
    

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno) {
        String sql="SELECT * FROM inscripcion JOIN alumno ON(inscripcion.idAlumno = alumno.idAlumno) WHERE alumno.idAlumno = ?";
        
        ArrayList<Inscripcion> insc2=new ArrayList();
        
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                Inscripcion inscripcion=new Inscripcion();
               Alumno alu = new Alumno();
              alu.setIdAlumno(rs.getInt("idAlumno")); // paso el id de la tabla a la variable creada
               Materia mat=new Materia();
                mat.setIdMateria(rs.getInt("idMateria"));
                
                //-----------
                inscripcion.setIdInscripcion(rs.getInt("idInscripto"));
                inscripcion.setNota(rs.getDouble("nota"));  //nose como traer los idalumno e idmateria, consultar profe
                inscripcion.setAlumno(alu); // y la paso por aca a la tabla inscripcion
                inscripcion.setMateria(mat);
                insc2.add(inscripcion);
            }
            
              ps.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al obtener las inscripciones"+ ex.getMessage());
        }
        
        return insc2;
    }

    public List<Materia> obtenerMateriasCursadas(int idAlumno) {
        List <Materia>materias= new ArrayList<Materia>();
        
        String sql="SELECT m.idMateria,m.nombre,m.año FROM inscripcion i JOIN materia m ON(i.idMateria=m.idMateria) WHERE i.idAlumno=? AND m.activa=1;";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs=ps.executeQuery();
            Materia mat;
            while(rs.next()){
                mat=new Materia();
                mat.setIdMateria(rs.getInt("idMateria"));
                mat.setNombre(rs.getString("nombre"));
                mat.setAnioMateria(rs.getInt("año"));
                materias.add(mat);
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener las materias"+ ex.getMessage());
        }
        
        
      return materias;  
    }

    public List<Materia> obtenerMateriasNOCursadas(int idAlumno) {
           List <Materia>materias= new ArrayList<Materia>();
        
        String sql="SELECT * FROM materia m WHERE m.activa=1 AND idMateria NOT IN (SELECT idMateria FROM inscripcion WHERE idAlumno=1 )";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs=ps.executeQuery();
            Materia mat;
            while(rs.next()){
                mat=new Materia();
                mat.setIdMateria(rs.getInt("idMateria"));
                mat.setNombre(rs.getString("nombre"));
                mat.setAnioMateria(rs.getInt("año"));
                materias.add(mat);
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener las materias"+ ex.getMessage());
        }
        
        
      return materias;
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        //borrado fisico
        
        String sql="DELETE FROM inscripcion WHERE idAlumno=? AND idMateria=? ";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno );
            ps.setInt(2, idMateria);
            
            int filas= ps.executeUpdate();
            
             
            
            //cartel para ver si fue hecho exitosamente la inscripcion
            
            if(filas>0){
                JOptionPane.showMessageDialog(null, "Inscripcion borrada exitosamente");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a tabla Inscripcion");
        }
        
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        
        String sql="UPDATE inscripcion SET nota=? WHERE idAlumno=? AND idMateria=? ";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            
           int filas= ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            
            //cartel para ver si fue hecho exitosamente la inscripcion
            
            if(filas >0){
                JOptionPane.showMessageDialog(null, "Nota Actualizada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a tabla Inscripcion");
        }
        
    }

    public List<Alumno> obtenerAlumnosXMaterias(int idMaterias) {
        String sql="SELECT * FROM inscripcion JOIN alumno ON(inscripcion.idAlumno=alumno.idAlumno) WHERE idMateria=1;";
        ArrayList<Alumno> alu=new ArrayList();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            Alumno i1;
            while(rs.next()){
                i1=new Alumno();
                i1.setIdAlumno(rs.getInt("idAlumno"));
                i1.setDni(rs.getInt("dni"));
                i1.setApellido(rs.getString("apellido"));
                i1.setNombre(rs.getString("nombre"));
                alu.add(i1);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar tabla alumno");
        }
        
        
      
       return alu; 
    }
}
