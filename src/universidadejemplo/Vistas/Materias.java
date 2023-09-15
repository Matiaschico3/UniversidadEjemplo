
package universidadejemplo.Vistas;

import javax.swing.JOptionPane;
import universidadejemplo.conexionBaseDatos.materiaData;
import universidadejemplo.entidades.Materia;


public class Materias extends javax.swing.JInternalFrame {

    materiaData md = new materiaData();
    public Materias() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jlCod = new javax.swing.JLabel();
        jlAp = new javax.swing.JLabel();
        jlNom = new javax.swing.JLabel();
        jlEst = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jtCodigo = new javax.swing.JTextField();
        jrbEstado = new javax.swing.JRadioButton();
        jtNombre = new javax.swing.JTextField();
        jtAnio = new javax.swing.JTextField();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setName(""); // NOI18N

        jlTitulo.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jlTitulo.setText("Materia");

        jlCod.setBackground(new java.awt.Color(255, 255, 255));
        jlCod.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jlCod.setForeground(new java.awt.Color(0, 0, 0));
        jlCod.setText("Código :");

        jlAp.setBackground(new java.awt.Color(255, 255, 255));
        jlAp.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jlAp.setForeground(new java.awt.Color(0, 0, 0));
        jlAp.setText("Nombre :");

        jlNom.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jlNom.setForeground(new java.awt.Color(0, 0, 0));
        jlNom.setText("Año :");

        jlEst.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jlEst.setForeground(new java.awt.Color(0, 0, 0));
        jlEst.setText("Estado");

        jbBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Buscar.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCod)
                            .addComponent(jlAp)
                            .addComponent(jlNom)
                            .addComponent(jlEst))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jrbEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlTitulo)
                .addGap(151, 151, 151))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jlTitulo)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCod)
                            .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jbBuscar)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAp))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNom))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlEst)
                    .addComponent(jrbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbEliminar)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
    
  try {
            int dni = Integer.parseInt(jtDocumento.getText());

            Alumno ae = ad.buscarAlumnoPorDni(dni);
            if (ae != null) {
                jtApellido.setText(ae.getApellido());
                jtNombre.setText(ae.getNombre());
                jdFecha.setDate(java.sql.Date.valueOf(ae.getFechaN()));
                jrbEstado.setSelected(ae.isActivo());
            
            }
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "Solo se admiten numeros y no debe estar vacio");
        }
       
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
            int idMateria = Integer.parseInt(jtCodigo.getText());
            md.eliminarMateria(idMateria);
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
      try {
            if (!jtNombre.getText().isEmpty() && !jtAnio.getText().isEmpty() && jrbEstado.isSelected()==true) { 
                
                String nom = jtNombre.getText();
                boolean est = jrbEstado.isSelected();
                int anio= Integer.parseInt(jtAnio.getText());
                Materia nuevo = new Materia(nom, anio, est);
                md.guardarMateria(nuevo);
//            }else if (jtCodigo.getText().isEmpty()){  //|| jtApellido.getText().isEmpty() || jtNombre.getText().isEmpty() || jdFecha.getDate() == null 
//                JOptionPane.showMessageDialog(this, "No debe dejar el código vacio");
            }else if (jtNombre.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "No debe dejar el campo nombre vacio");
            }else if (jtAnio.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "No debe dejar el campo año vacio");
            }else if (jrbEstado.isSelected() == false){
               JOptionPane.showMessageDialog(this, "Debe dejar activado el campo estado"); 
            }
            
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No debe dejar campos vacios");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
            int respuesta = JOptionPane.showConfirmDialog(this, "Estás seguro que quieres salir?", "Cerrar Ventana", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {

            this.dispose();//cierro la ventana
    }//GEN-LAST:event_jbSalirActionPerformed
    }
    
    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        jtCodigo.setText("");
        jtNombre.setText("");
        jtAnio.setText("");
        jrbEstado.setSelected(true);
    }//GEN-LAST:event_jbNuevoActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlAp;
    private javax.swing.JLabel jlCod;
    private javax.swing.JLabel jlEst;
    private javax.swing.JLabel jlNom;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtAnio;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables


}
