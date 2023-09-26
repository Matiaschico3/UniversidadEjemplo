package universidadejemplo.Vistas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import universidadejemplo.conexionBaseDatos.materiaData;
import universidadejemplo.entidades.Materia;

public class Materias extends javax.swing.JInternalFrame {

    //declaro variables varias
    FondoPanel fondo = new FondoPanel();
    int matS = -1;
    materiaData md = new materiaData();

    public Materias() {
        this.setContentPane(fondo);
        initComponents();
        cargarCombo();
        desHabilitarBotones();
    

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        jlTitulo = new javax.swing.JLabel();
        jlCod = new javax.swing.JLabel();
        jlAp = new javax.swing.JLabel();
        jlNom = new javax.swing.JLabel();
        jlEst = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jrbEstado = new javax.swing.JRadioButton();
        jtNombre = new javax.swing.JTextField();
        jtAnio = new javax.swing.JTextField();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jlEstDescrip = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setClosable(true);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setName(""); // NOI18N

        jlTitulo.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jlTitulo.setText("Materia");

        jlCod.setBackground(new java.awt.Color(255, 255, 255));
        jlCod.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jlCod.setText("Busqueda de Materia");

        jlAp.setBackground(new java.awt.Color(255, 255, 255));
        jlAp.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jlAp.setText("Nombre :");

        jlNom.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jlNom.setText("Año :");

        jlEst.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jlEst.setText("Estado");

        jbBuscar.setBackground(new java.awt.Color(255, 153, 102));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Buscar.png"))); // NOI18N
        jbBuscar.setBorder(null);
        jbBuscar.setBorderPainted(false);
        jbBuscar.setOpaque(false);
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jrbEstado.setSelected(true);
        jrbEstado.setBorder(null);
        jrbEstado.setOpaque(false);
        jrbEstado.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jrbEstadoStateChanged(evt);
            }
        });

        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNombreKeyReleased(evt);
            }
        });

        jtAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtAnioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtAnioKeyTyped(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jlEstDescrip.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jlEstDescrip.setText("Activa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbEliminar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCod)
                            .addComponent(jlAp)
                            .addComponent(jlNom)
                            .addComponent(jlEst))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jrbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jlEstDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(267, 267, 267))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(jlTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlCod)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAp))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNom))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlEst)
                    .addComponent(jrbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEstDescrip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbEliminar)
                    .addComponent(jbSalir)
                    .addComponent(jbModificar))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        try {

            //int idMateria = Integer.parseInt(jtCodigo.getText());
            //
            Materia materiaSeleccionada = (Materia) jComboBox1.getSelectedItem();
            boolean activa = jrbEstado.isSelected();
            Materia m = md.buscarMateria(materiaSeleccionada.getIdMateria(), activa);

            if (m != null) {
                jtNombre.setText(m.getNombre());
                jtAnio.setText(Integer.toString(m.getAnioMateria()));
                jrbEstado.setSelected(m.isActivo());
                matS = m.getIdMateria();
                //Habilito botones si esta todo OK!
                habilitarBusquedaBotones();

            } else {

                //Controlo el estado de la respuesta de la consulta y respondo 
                //segun parametros obtenidos
                if (activa == true) {
                    JOptionPane.showMessageDialog(this, "No existe una Materia Activa con ese ID");
                } else if (activa == false) {
                    JOptionPane.showMessageDialog(this, "No existe una Materia Inactiva con ese ID");
                } else {
                    JOptionPane.showMessageDialog(this, "No existe una Materia con ese ID");
                }

            }
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "Solo se admiten numeros y no debe estar vacio");
        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        Materia materiaSeleccionada = (Materia) jComboBox1.getSelectedItem();
        md.eliminarMateria(materiaSeleccionada.getIdMateria());
        cargarCombo();
        jtNombre.setText("");
        jtAnio.setText("");
        //Deshabilito botones luego de ejecutar acccion!
        desHabilitarBotones();
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

        if (matS != -1) { // Verifica que se haya seleccionado una Materia
            modificar();// Llama al método modificar solo si se ha seleccionado una materia
            //Cintia: Limpio campos     
            jtNombre.setText("");
            jtAnio.setText("");
            //Deshabilito botones luego de ejecutar acccion!
            desHabilitarBotones();
            cargarCombo();
        } else {
            JOptionPane.showMessageDialog(this, "Debes seleccionar una materia antes de guardar.");
        }

    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "Estás seguro que quieres salir?", "Cerrar Ventana", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            this.dispose();//cierro la ventana
    }//GEN-LAST:event_jbSalirActionPerformed
    }

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        try {
            if (!jtNombre.getText().isEmpty() && !jtAnio.getText().isEmpty() && jrbEstado.isSelected() == true) {

                String nom = jtNombre.getText();
                boolean est = jrbEstado.isSelected();
                int anio = Integer.parseInt(jtAnio.getText());
                Materia nuevo = new Materia(nom, anio, est);
                md.guardarMateria(nuevo);
                //Cintia: Limpio campos
                jtNombre.setText("");
                jtAnio.setText("");
                desHabilitarBotones();
            } else if (jtNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No debe dejar el campo nombre vacio");
            } else if (jtAnio.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No debe dejar el campo año vacio");
            } else if (jrbEstado.isSelected() == false) {
                JOptionPane.showMessageDialog(this, "Debe dejar activado el campo estado");

            }
            cargarCombo();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No debe dejar campos vacios");
        }
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyReleased
        if (!jtNombre.getText().isEmpty() && !jtAnio.getText().isEmpty()) {
            habilitarBotones();
        } else {
            desHabilitarBotones();
        }
    }//GEN-LAST:event_jtNombreKeyReleased

    private void jtAnioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtAnioKeyReleased
        if (!jtNombre.getText().isEmpty() && !jtAnio.getText().isEmpty()) {
            habilitarBotones();
        } else {
            desHabilitarBotones();
        }
    }//GEN-LAST:event_jtAnioKeyReleased

    private void jrbEstadoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jrbEstadoStateChanged
        //Verifico el estado de radioButton y modifico segun el estado la etiqueta mostrando su valor
        if (jrbEstado.isSelected() == true) {
            jlEstDescrip.setText("Activa");
        } else {
            jlEstDescrip.setText("Inactiva");
        }
    }//GEN-LAST:event_jrbEstadoStateChanged

    private void jtAnioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtAnioKeyTyped
        //Solo dejo introducir numeros 
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <= 57;

        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_jtAnioKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Materia> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlAp;
    private javax.swing.JLabel jlCod;
    private javax.swing.JLabel jlEst;
    private javax.swing.JLabel jlEstDescrip;
    private javax.swing.JLabel jlNom;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtAnio;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables

    public void habilitarBotones() {
        // jbEliminar.setEnabled(true);
        // jbModificar.setEnabled(true);
        jbNuevo.setEnabled(true);

    }

    public void habilitarBusquedaBotones() {
        jbEliminar.setEnabled(true);
        jbModificar.setEnabled(true);
        jbNuevo.setEnabled(false);

    }

    public void desHabilitarBotones() {
        jbEliminar.setEnabled(false);
        jbModificar.setEnabled(false);
        jbNuevo.setEnabled(false);

    }

    public void modificar() {
        try {
            Materia materiaSeleccionada = (Materia) jComboBox1.getSelectedItem();
            String nom = jtNombre.getText();
            int año = Integer.parseInt(jtAnio.getText());
            boolean est = jrbEstado.isSelected();
            Materia nuevaM = new Materia(materiaSeleccionada.getIdMateria(), nom, año, est);
            md.modificarMateria(nuevaM);
            cargarCombo();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No se puede dejar espacios vacios");
        }
    }
    
    private void cargarCombo() {
        jComboBox1.removeAllItems();

        materiaData mat = new materiaData();
        List<Materia> materias = mat.listarMaterias();

        jComboBox1.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

                if (value instanceof Materia) {
                    Materia materia = (Materia) value;

                    if (materia.isActivo()== false) {
                        setForeground(Color.RED); // Cambia el color del texto a rojo si el estado es 0
                    } else {
                        setForeground(Color.BLACK); // Restablece el color del texto a negro
                    }
                }

                return this;
            }
        });

        for (Materia materia : materias) {
    
            jComboBox1.addItem(materia);
        }
    }

    //Personalizamos componentes
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
