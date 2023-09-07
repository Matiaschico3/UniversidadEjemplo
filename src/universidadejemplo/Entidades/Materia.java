package universidadejemplo.Entidades;

public class Materia {

    private int idMateria;

    private String nombre;

    private int anioM;

    private boolean activo;

    public Materia(int idMateria, String nombre, int anioM, boolean activo) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anioM = anioM;
        this.activo = activo;
    }

    public Materia(String nombre, int anioM, boolean activo) {
        this.nombre = nombre;
        this.anioM = anioM;
        this.activo = activo;
    }

    public Materia() {
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioM() {
        return anioM;
    }

    public void setAnioM(int anioM) {
        this.anioM = anioM;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Materia{" + "idMateria=" + idMateria + ", nombre=" + nombre + ", anioM=" + anioM + ", activo=" + activo + '}';
    }

  
}
