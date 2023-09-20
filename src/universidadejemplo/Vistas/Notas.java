package universidadejemplo.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.conexionBaseDatos.alumnoData;
import universidadejemplo.conexionBaseDatos.inscripcionData;
import universidadejemplo.entidades.Alumno;
import universidadejemplo.entidades.Inscripcion;
import universidadejemplo.entidades.Materia;

public class Notas extends javax.swing.JInternalFrame {
inscripcionData ID = new inscripcionData();
    DefaultTableModel model = new DefaultTableModel() {

        public boolean isCellEditable(int f, int c) {
            if (c == 2) {
                return true;
            }
            return false;
        }
    };

    public Notas() {
        initComponents();
        armarCabecera();
        cargarCombo();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jlTitulo = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jlDoc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);

        jPanel3.setForeground(new java.awt.Color(204, 204, 204));

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jlTitulo.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jlTitulo.setText("Carga de Notas");

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jlDoc.setBackground(new java.awt.Color(255, 255, 255));
        jlDoc.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jlDoc.setForeground(new java.awt.Color(0, 0, 0));
        jlDoc.setText("Seleccione un alumno");

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Nota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jlDoc)
                        .addGap(33, 33, 33)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jlTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jlTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDoc)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // Obtener la fila seleccionada en la tabla
//    int filaSeleccionada = jTable1.getSelectedRow();
//
//    if (filaSeleccionada >= 0) {
//        Object valorCelda = jTable1.getValueAt(filaSeleccionada, 2);
//        double nuevaNota;
//
//        if (valorCelda instanceof Double) {
//            nuevaNota = (double) valorCelda;
//        } else if (valorCelda instanceof String) {
//            // Intentar convertir la cadena en un valor decimal
//            try {
//                nuevaNota = Double.parseDouble((String) valorCelda);
//            } catch (NumberFormatException ex) {
//                // Manejar el caso en que la conversión falle
//                JOptionPane.showMessageDialog(this, "La nota ingresada no es válida.", "Error", JOptionPane.ERROR_MESSAGE);
//                return; // Salir del método sin realizar la actualización
//            }
//        } else {
//            // Manejar otros tipos de datos si es necesario
//            JOptionPane.showMessageDialog(this, "La nota ingresada no es válida.", "Error", JOptionPane.ERROR_MESSAGE);
//            return; // Salir del método sin realizar la actualización
//        }
//
//        // Obtener el alumno seleccionado del combo box
//        Alumno alumnoSeleccionado = (Alumno) jComboBox1.getSelectedItem();
//
//        if (alumnoSeleccionado != null) {
//            // Actualizar la nota en el modelo de la tabla
//            model.setValueAt(nuevaNota, filaSeleccionada, 2);
//
//            // Obtener la inscripción correspondiente a la fila seleccionada
//            Inscripcion inscripcion = obtenerInscripcionPorFila(filaSeleccionada);
//
//            if (inscripcion != null) {
//                // Actualizar la nota en la base de datos utilizando el método de inscripcionData
//                ID.actualizarNota(alumnoSeleccionado.getIdAlumno(), inscripcion.getMateria().getIdMateria(), nuevaNota);
//            }
//        }
//    }

//cintia:
 //recorremos la lista
        inscripcionData a1 = new inscripcionData();
        Alumno aS = (Alumno) jComboBox1.getSelectedItem(); // Obtener el alumno seleccionado
   
       try{
            if (aS != null) {
            List<Inscripcion> inscripciones = a1.obtenerInscripcionesPorAlumno(aS.getIdAlumno());
           
            int contador = 0;
            for (Inscripcion inscripcion : inscripciones) {
               
                if (!model.getValueAt(contador, 2).equals(inscripcion.getNota())) {
                    System.out.println("llego aca?");
                    a1.actualizarNota(aS.getIdAlumno(), inscripcion.getMateria().getIdMateria(), Double.parseDouble(model.getValueAt(contador, 2).toString()));
                   
                }else {
                    System.out.println("no se modifico nada");
                } 
                contador++;
            }
        }
       }catch (Exception e){
           JOptionPane.showMessageDialog(this, "Error "+ e.getMessage());
       }


    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        cargarTabla();


    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "Estás seguro que quieres salir?", "Cerrar Ventana", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {

            this.dispose();//cierro la ventana
        }
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> jComboBox1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlDoc;
    private javax.swing.JLabel jlTitulo;
    // End of variables declaration//GEN-END:variables

    public void armarCabecera() {
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("notas");
        jTable1.setModel(model);
        jTable1.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
    }

    public void borrarFilas() {
        int f = model.getRowCount() - 1;
        for (; f >= 0; f--) {
            model.removeRow(f);
        }
    }

    public void cargarCombo() {
        jComboBox1.removeAllItems();
        alumnoData ad = new alumnoData();
        ArrayList<Alumno> alumnos = new ArrayList<>();

        for (Alumno alu : ad.listarAlumnos()) {
            alumnos.add(alu);
            jComboBox1.addItem(alu);
        }

    }

    public void cargarTabla() {
        borrarFilas();
        inscripcionData a1 = new inscripcionData();
        Alumno alumnoSeleccionado = (Alumno) jComboBox1.getSelectedItem(); // Obtener el alumno seleccionado

        if (alumnoSeleccionado != null) {
            List<Inscripcion> inscripciones = a1.obtenerInscripcionesPorAlumno(alumnoSeleccionado.getIdAlumno()); // Suponiendo que existe un método para obtener inscripciones de un alumno

            for (Inscripcion inscripcion : inscripciones) {
                Materia materia = inscripcion.getMateria();
                model.addRow(new Object[]{
                    materia.getIdMateria(),
                    materia.getNombre(),
                    inscripcion.getNota() // Obtener la nota de la inscripción
                });
            }
        }

    }
    
// private Inscripcion obtenerInscripcionPorFila(int fila) {
//    if (fila >= 0) {
//        // Obtener los valores de la fila seleccionada en la tabla
//        int idMateria = (int) jTable1.getValueAt(fila, 0); // Suponiendo que la columna 0 contiene el idMateria
//        String nombreMateria = (String) jTable1.getValueAt(fila, 1); // Suponiendo que la columna 1 contiene el nombre de la materia
//        double nota = (double) jTable1.getValueAt(fila, 2); // Suponiendo que la columna 2 contiene la nota
//
//        // Obtener el alumno seleccionado del combo box
//        Alumno alumnoSeleccionado = (Alumno) jComboBox1.getSelectedItem();
//
//        if (alumnoSeleccionado != null) {
//            // Obtener la lista de materias cursadas por el alumno
//            List <Materia> materiasCursadas = ID.obtenerMateriasCursadas(alumnoSeleccionado.getIdAlumno());
//
//            // Buscar la materia correspondiente en la lista de materias cursadas
//            for (Materia materia : materiasCursadas) {
//                if (materia.getIdMateria() == idMateria && materia.getNombre().equals(nombreMateria)) {
//                    // Aquí puedes crear la inscripción utilizando los datos de la materia y la nota
//                    Inscripcion inscripcion = new Inscripcion();
//                    inscripcion.setAlumno(alumnoSeleccionado);
//                    inscripcion.setMateria(materia);
//                    inscripcion.setNota(nota);
//                    return inscripcion;
//                }
//            }
//        }
//    }
//
//    return null; // Si no se encuentra la inscripción, retornar null
//}
//    
//    
//   public void actualizarNota(Alumno alumno, double nuevaNota) {
//    // Obtener la fila seleccionada en la tabla
//    int filaSeleccionada = jTable1.getSelectedRow();
//    
//    if (filaSeleccionada >= 0) {
//        // Actualizar la nota en el modelo de la tabla
//        model.setValueAt(nuevaNota, filaSeleccionada, 2);
//        
//        // Obtener la inscripción correspondiente a la fila seleccionada
//        Inscripcion inscripcion = obtenerInscripcionPorFila(filaSeleccionada);
//        
//        if (inscripcion != null) {
//            // Actualizar la nota en la base de datos utilizando el método de inscripcionData
//            ID.actualizarNota(alumno.getIdAlumno(), inscripcion.getMateria().getIdMateria(), nuevaNota);
//        }
//    }
//}

}
