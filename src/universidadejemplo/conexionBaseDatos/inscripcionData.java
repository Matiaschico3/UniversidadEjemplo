package universidadejemplo.conexionBaseDatos;

import java.sql.Connection;
import java.util.List;
import universidadejemplo.entidades.Alumno;
import universidadejemplo.entidades.Inscripcion;
import universidadejemplo.entidades.Materia;

public class inscripcionData {

    private Connection con;

    private materiaData matData;

    private alumnoData aluData;

    public inscripcionData() {
    }

    public void guardarInscripcion(Inscripcion insc) {
    }

    public List<Inscripcion> obtenerInscripciones() {
        throw new UnsupportedOperationException("Not supported yet.");
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
