
package universidadejemplo;

import java.time.LocalDate;
import java.time.Month;
import universidadejemplo.conexionBaseDatos.alumnoData;
import universidadejemplo.conexionBaseDatos.inscripcionData;
import universidadejemplo.conexionBaseDatos.materiaData;
import universidadejemplo.entidades.Alumno;
import universidadejemplo.entidades.Inscripcion;
import universidadejemplo.entidades.Materia;



public class UniversidadEjemplo {

    public static void main(String[] args) {
        
      Alumno a1=new Alumno(2,2222222,"Perez","Maria",LocalDate.of(1990, Month.MARCH, 05),true);
      Alumno a2=new Alumno(3,333333,"Lopez","Matias",LocalDate.of(1995, Month.AUGUST, 30),true);
      Alumno a3=new Alumno(4444444,"Gonzales","Fernando",LocalDate.of(1987, Month.FEBRUARY, 22),true);
      Alumno a4=new Alumno(5555555,"Irigoyen","Helena",LocalDate.of(1988, Month.SEPTEMBER, 12),true);
      
      
      
     // alumnoData alu=new alumnoData();
      //alu.guardarAlumno(a1);
     // alu.guardarAlumno(a2);
     // alu.guardarAlumno(a3);
     // alu.guardarAlumno(a4);
     //alu.modificarAlumno(a1);
     //alu.eliminarAlumno(2);
     /*Alumno AE=alu.buscarAlumno(4);
        System.out.println("Dni "+AE.getDni());*/
     /*Alumno AED=alu.buscarAlumnoPorDni(333333);
        System.out.println("Apellido "+ AED.getApellido());
        System.out.println("Nombre "+AED.getNombre());
        System.out.println("Fecha de Nacimiento "+ AED.getFechaN());*/
     
     /*   for (Alumno alumno : alu.listarAlumnos()) {
            System.out.println(alumno.getDni());
            System.out.println(alumno.getApellido());
            System.out.println(alumno.getNombre());
            System.out.println(alumno.getFechaN());
            System.out.println("------------------------");*/
     
     
     //chequeo de MateriaData
     
     Materia m1=new Materia(1,"Prueba3",1,true);
     Materia m2=new Materia("Programacion 2", 2, true);
     Materia m3=new Materia("Matematica 1", 1, true);
     Materia m4=new Materia("Ingles Tecnico", 1, true);
     
   //  materiaData MD=new materiaData();
     
     //MD.guardarMateria(m1);
     //MD.guardarMateria(m2);
    // MD.guardarMateria(m3);
    // MD.guardarMateria(m4);
    //MD.modificarMateria(m1);
    //MD.eliminarMateria(10);
    
   /* Materia ME=MD.buscarMateria(9);
        System.out.println(ME.toString());*/
   
      /*  for (Materia materias : MD.listarMaterias()) {
            System.out.println(materias.toString());
            System.out.println("-----------------");*/
      
      
      //Chequeo InscripcionData
      
      
      
      Inscripcion i1=new Inscripcion(a1,m1,8);
      //Inscripcion i5=new Inscripcion(a1,m4,5);
     // Inscripcion i2=new Inscripcion(a2,m2,8);
     // Inscripcion i6=new Inscripcion(a2,m3,6);
      //Inscripcion i3=new Inscripcion(a3,m3,10);
      //Inscripcion i7=new Inscripcion(a3,m1,5);
      //Inscripcion i4=new Inscripcion(a4,m4,2);
      //Inscripcion i8=new Inscripcion(a4,m2,8);
      
      inscripcionData ID=new inscripcionData();
      
      //ID.guardarInscripcion(i1);
      //ID.guardarInscripcion(i2);
      //ID.guardarInscripcion(i3);
     // ID.guardarInscripcion(i4);
     // ID.guardarInscripcion(i5);
     // ID.guardarInscripcion(i6);
     // ID.guardarInscripcion(i7);
    //  ID.guardarInscripcion(i8);
    
  
       /* for (Inscripcion ins:ID.obtenerInscripciones() ) {
            System.out.println(ins.toString());
        }*/
      
        for (Inscripcion ins : ID.obtenerInscripcionesPorAlumno(1)) {
            System.out.println(ins.toString());
            
        }
      
 }
     
}
   
    
 
