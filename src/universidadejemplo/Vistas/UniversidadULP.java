package universidadejemplo.Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class UniversidadULP extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();

    public UniversidadULP() {
        this.setContentPane(fondo);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        JPanel = new FondoPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        formA = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        fm = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        fi = new javax.swing.JMenuItem();
        mn = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        porMateria = new javax.swing.JMenuItem();
        salirMenu1 = new javax.swing.JMenu();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Universidad de La Punta");

        JPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JPanel.setPreferredSize(new java.awt.Dimension(1280, 1024));

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 804, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(null);
        jMenuBar1.setOpaque(false);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(400, 40));

        jMenu1.setText("Alumnos");
        jMenu1.setFont(new java.awt.Font("Garamond", 0, 24)); // NOI18N

        formA.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        formA.setText("Formulario de Alumno");
        formA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formAActionPerformed(evt);
            }
        });
        jMenu1.add(formA);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materias");
        jMenu2.setFont(new java.awt.Font("Garamond", 0, 24)); // NOI18N

        fm.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        fm.setText("Formulario de materias");
        fm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmActionPerformed(evt);
            }
        });
        jMenu2.add(fm);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Administracion");
        jMenu3.setFont(new java.awt.Font("Garamond", 0, 24)); // NOI18N

        fi.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        fi.setText("Formulario de inscripcion");
        fi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiActionPerformed(evt);
            }
        });
        jMenu3.add(fi);

        mn.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        mn.setText("Manipulacion de notas");
        mn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnActionPerformed(evt);
            }
        });
        jMenu3.add(mn);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultas");
        jMenu4.setFont(new java.awt.Font("Garamond", 0, 24)); // NOI18N

        porMateria.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        porMateria.setText("Alumnos por materia");
        porMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porMateriaActionPerformed(evt);
            }
        });
        jMenu4.add(porMateria);

        jMenuBar1.add(jMenu4);

        salirMenu1.setText("Salir");
        salirMenu1.setFont(new java.awt.Font("Garamond", 0, 24)); // NOI18N
        salirMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(salirMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formAActionPerformed
        JPanel.removeAll();
        JPanel.repaint();
        Alumnos fa = new Alumnos();
        fa.setVisible(true);
        JPanel.add(fa);
        JPanel.setComponentZOrder(fa,0);
    }//GEN-LAST:event_formAActionPerformed

    private void fiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiActionPerformed
        JPanel.removeAll();
        JPanel.repaint();
        Inscripciones ins = new Inscripciones();
        ins.setVisible(true);
        JPanel.add(ins);
        JPanel.setComponentZOrder(ins,0);
    }//GEN-LAST:event_fiActionPerformed

    private void fmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmActionPerformed
        JPanel.removeAll();
        JPanel.repaint();
        Materias m = new Materias();
        m.setVisible(true);
        JPanel.add(m);
//        JPanel.moveToFront(m);
      JPanel.setComponentZOrder(m,0);

    }//GEN-LAST:event_fmActionPerformed

    private void mnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnActionPerformed
        JPanel.removeAll();
        JPanel.repaint();
        Notas mn = new Notas();
        mn.setVisible(true);
        JPanel.add(mn);
//        JPanel.moveToFront(mn);
      JPanel.setComponentZOrder(mn,0);
    }//GEN-LAST:event_mnActionPerformed

    private void porMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porMateriaActionPerformed
        JPanel.removeAll();
        JPanel.repaint();
        porMateria pm = new porMateria();
        pm.setVisible(true);
        JPanel.add(pm);
//        JPanel.moveToFront(pm);
      JPanel.setComponentZOrder(pm,0);
    }//GEN-LAST:event_porMateriaActionPerformed

    private void salirMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMenu1MouseClicked
             int respuesta = JOptionPane.showConfirmDialog(this, "Estás seguro que quieres salir?", "Cerrar Ventana", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {

            this.dispose();//cierro la ventana
        }   // TODO add your handling code here:
    }//GEN-LAST:event_salirMenu1MouseClicked

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(UniversidadULP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(UniversidadULP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(UniversidadULP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(UniversidadULP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new UniversidadULP().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel;
    private javax.swing.JMenuItem fi;
    private javax.swing.JMenuItem fm;
    private javax.swing.JMenuItem formA;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem mn;
    private javax.swing.JMenuItem porMateria;
    private javax.swing.JMenu salirMenu1;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/images/fondo.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }

    }
}
