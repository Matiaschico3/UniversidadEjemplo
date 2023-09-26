package universidadejemplo.conexionBaseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadejemplo.entidades.Materia;

public class materiaData {

    private Connection con = null; //inicializar en null

    //constructor
    public materiaData() {

        con = Conexion.getConexion(); //establezco conexion con la BD

    }

    //metodos
    public void guardarMateria(Materia materia) {

        String sql = "INSERT INTO materia (nombre, año, activa) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            int exito = ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia guardada exitosamente");
            }
            //Cierro la Conexion
            ps.close();
           

        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
           
        }

    }

    public Materia buscarMateria(int idMateria, boolean activa) {

        String sql = "SELECT idmateria, nombre, año, activa FROM materia WHERE idMateria = ? AND activa = ?";

        Materia materia = null;
        try {
           
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria); //idmateria viene por parametro de funcion
            ps.setBoolean(2, activa);
         
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
           
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(rs.getBoolean("activa"));
            }
            //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia " + ex);
        }
        return materia;
    }

    public void modificarMateria(Materia materia) {

        String sql = "UPDATE materia SET nombre=?, año=?, activa=? WHERE idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo()); // si es boolean se debe poner .isactivo();
            ps.setInt(4, materia.getIdMateria());// viene del where
            int exito = ps.executeUpdate();

           if (exito == 1) {//para avisar de que funciono correctamente.
                JOptionPane.showMessageDialog(null, "Materia modificada exitosamente");
            }
            //Cierro la Conexion
            ps.close();
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
            
        }

    }

    public void eliminarMateria(int idMateria) {
        //borrado logico
        String sql = "UPDATE materia SET activa=0 WHERE idMateria= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);

            int exito = ps.executeUpdate();

           if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia eliminada exitosamente");
            }
            //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }

    }

    public List<Materia> listarMaterias() {
        String sql = "SELECT idMateria, nombre, año, activa FROM materia"; // WHERE activa=1";
        ArrayList<Materia> materias = new ArrayList();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(rs.getBoolean("activa"));
                materias.add(materia);
            }
            //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia ");
        }
        return materias;
    }
}
