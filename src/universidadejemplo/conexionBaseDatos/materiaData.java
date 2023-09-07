package universidadejemplo.conexionBaseDatos;

import java.sql.Connection;
import java.util.List;
import universidadejemplo.entidades.Materia;

public class materiaData {

    private Connection con;

    public materiaData() {
    }

    public void guardarMateria(Materia materia) {
    }

    public Materia buscarMateria(int idMateria) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void modificarMateria(Materia materia) {
    }

    public void eliminarMateria(int idMateria) {
    }

    public List<Materia> listarMaterias() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
