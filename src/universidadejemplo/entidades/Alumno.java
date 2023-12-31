

package universidadejemplo.entidades;


import java.time.LocalDate;


public class Alumno {
    private int idAlumno;
    private int dni;
    private String apellido;
    private String nombre;
    private LocalDate fechaN;
    private boolean activo;

    public Alumno(int idAlumno, int dni, String apellido, String nombre, LocalDate fechaN, boolean activo) {
        this.idAlumno = idAlumno;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.activo = activo;
    }

    public Alumno() {
    }

    public Alumno(int dni, String apellido, String nombre, LocalDate fechaN, boolean activo) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.activo = activo;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaN() {
        return fechaN;
    }

    public void setFechaN(LocalDate fechaN) {
        this.fechaN = fechaN;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return idAlumno+") - " + dni + " - " + apellido + ", " + nombre;
    }
        
}