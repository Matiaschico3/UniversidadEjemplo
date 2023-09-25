package universidadejemplo.Vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.conexionBaseDatos.alumnoData;
import universidadejemplo.conexionBaseDatos.inscripcionData;
import universidadejemplo.entidades.Alumno;
import universidadejemplo.entidades.Inscripcion;
import universidadejemplo.entidades.Materia;

public class Notas extends javax.swing.JInternalFrame {

    //Declaro variables 
    FondoPanel fondo = new FondoPanel();

    inscripcionData ID = new inscripcionData();

    DefaultTableModel model = new DefaultTableModel() {

        public boolean isCellEditable(int f, int c) {
            return c == 2;
        }
    };

    public Notas() {
        this.setContentPane(fondo);
        initComponents();
        armarCabecera();
        cargarCombo();
       

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new FondoPanel();
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
        jlTitulo.setText("Carga de Notas");

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jlDoc.setBackground(new java.awt.Color(255, 255, 255));
        jlDoc.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jlDoc.setText("Seleccione un alumno");

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
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
       //Version final
        //Creamos aS con el ID
        Alumno aS = (Alumno) jComboBox1.getSelectedItem();
        //Verifico que ID no sea nulo, que no se halla cargado el combo
        if (aS != null) {
            //Genero una lista de inscripciones con el ID del alumno
            List<Inscripcion> inscripciones = ID.obtenerInscripcionesPorAlumno(aS.getIdAlumno());

            int nroFila = 0; // Variable para controlar la fila

            for (Inscripcion inscripcion : inscripciones) {
                //cambiamos la nota de String a double
                String notaStr = model.getValueAt(nroFila, 2).toString();
                double nota = Double.parseDouble(notaStr);
                // Verificamos que nota este en el rango de 0-10
                if (nota >= 0 && nota <= 10) {
                    if (nota != inscripcion.getNota()) {
                        double notaAnterior = inscripcion.getNota(); // Guardo nota anterior
                        inscripcion.setNota(nota);
                        // Genero un String con los datos guardados y nuevos
                        String mensaje = "Cambios para " + inscripcion.getMateria().getNombre() + ":\n";
                        mensaje += "Nota anterior: " + notaAnterior + "\n";
                        mensaje += "Nueva nota: " + nota;

                        int respuesta = JOptionPane.showConfirmDialog(this, mensaje + "\n\n¿Estás seguro que deseas guardar los cambios?", "Confirmar Guardar", JOptionPane.YES_NO_OPTION);

                        if (respuesta == JOptionPane.YES_OPTION) {
                            ID.actualizarNota(aS.getIdAlumno(), inscripcion.getMateria().getIdMateria(), nota); // Guardo el cambio
                        } else {
                            model.setValueAt(notaAnterior, nroFila, 2); // Restablecer la nota anterior.
                            model.fireTableDataChanged(); // Refresco la tabla
                            ///JOptionPane.showMessageDialog(this, "Cambios no guardados.");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Error: La nota debe estar en el rango de 0 a 10");
                    model.setValueAt(inscripcion.getNota(), nroFila, 2); // Restablecer la nota anterior.
                }
                nroFila++;
            }
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked


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

    public void habilitarBotones() {

        jbGuardar.setEnabled(true);

    }

    public void desHabilitarBotones() {

        jbGuardar.setEnabled(false);

    }

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/images/fondochico.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }

    }

}
