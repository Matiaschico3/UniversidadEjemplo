package universidadejemplo.conexionBaseDatos;

import java.sql.Connection;
import java.util.List;
import universidadejemplo.entidades.Alumno;

public class alumnoData {

    private Connection con;

    public alumnoData() {
    }

    public void guardarAlumno(Alumno alumno) {
    }

    public Alumno buscarAlumno(int idAlumno) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Alumno buscarAlumnoPorDni(int dni) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Alumno> listarAlumnos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void modificarAlumno(Alumno alumno) {
    }

    public void eliminarAlumno(int idAlumno) {
    }
}
