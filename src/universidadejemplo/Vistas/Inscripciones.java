
package universidadejemplo.Vistas;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.conexionBaseDatos.alumnoData;
import universidadejemplo.conexionBaseDatos.inscripcionData;
import universidadejemplo.conexionBaseDatos.materiaData;
import universidadejemplo.entidades.Alumno;
import universidadejemplo.entidades.Inscripcion;
import universidadejemplo.entidades.Materia;


public class Inscripciones extends javax.swing.JInternalFrame {
    
    DefaultTableModel model = new DefaultTableModel(){
        public boolean isCellEditable (int f, int c){
            return false;
        }
    };

    public Inscripciones() {
        initComponents();
        armarCabecera();
        cargarCombo();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jlDoc = new javax.swing.JLabel();
        jlNom = new javax.swing.JLabel();
        jlFecha = new javax.swing.JLabel();
        jlEst = new javax.swing.JLabel();
        jrbInscriptas = new javax.swing.JRadioButton();
        jbInscribir = new javax.swing.JButton();
        jbAnularInsc = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jrbNOinscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();

        setClosable(true);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setName(""); // NOI18N

        jlTitulo.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jlTitulo.setText("Formulario de Inscripción");

        jlDoc.setBackground(new java.awt.Color(255, 255, 255));
        jlDoc.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jlDoc.setForeground(new java.awt.Color(0, 0, 0));
        jlDoc.setText("Seleccione un alumno");

        jlNom.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jlNom.setForeground(new java.awt.Color(0, 0, 0));
        jlNom.setText("Listado de Materias");

        jlFecha.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jlFecha.setForeground(new java.awt.Color(0, 0, 0));
        jlFecha.setText("Materias no inscriptas");

        jlEst.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jlEst.setForeground(new java.awt.Color(0, 0, 0));
        jlEst.setText("Materia inscriptas");

        jrbInscriptas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbInscriptasMouseClicked(evt);
            }
        });
        jrbInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInscriptasActionPerformed(evt);
            }
        });

        jbInscribir.setText("Inscribir");

        jbAnularInsc.setText("Anular inscripción");

        jbSalir.setText("Salir");

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTabla);

        jComboBox1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrbInscriptas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlEst)
                .addGap(57, 57, 57)
                .addComponent(jrbNOinscriptas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlFecha)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jbInscribir)
                .addGap(18, 18, 18)
                .addComponent(jbAnularInsc, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlTitulo)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlNom)
                        .addGap(147, 147, 147))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlDoc)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlTitulo)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDoc)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jlNom)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlEst)
                    .addComponent(jlFecha)
                    .addComponent(jrbNOinscriptas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbInscriptas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir)
                    .addComponent(jbSalir)
                    .addComponent(jbAnularInsc))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInscriptasActionPerformed
    
    }//GEN-LAST:event_jrbInscriptasActionPerformed

    private void jrbInscriptasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbInscriptasMouseClicked
 
    }//GEN-LAST:event_jrbInscriptasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    private javax.swing.JButton jbAnularInsc;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlDoc;
    private javax.swing.JLabel jlEst;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlNom;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JRadioButton jrbInscriptas;
    private javax.swing.JRadioButton jrbNOinscriptas;
    // End of variables declaration//GEN-END:variables

    public void armarCabecera(){
     model.addColumn("ID");
     model.addColumn("Nombre");   
     model.addColumn("Año"); 
     jTabla.setModel(model);
    }
    
    public void borrarFilas(){
     int f = model.getRowCount()-1;
     for(;f>=0;f--){
         model.removeRow(f);
     }
    }
    
    public void cargarCombo(){
    jComboBox1.removeAllItems();
    alumnoData ad= new alumnoData();
        ArrayList<Alumno> alumnos= new ArrayList<>();
        
        for (Alumno alu :ad.listarAlumnos()) {
            if(jComboBox1.getItemCount() == 0){
                jComboBox1.addItem(alu); 
            }
            alumnos.add(alu);
            jComboBox1.addItem(alu);
        }
    }
    
    public void cargarTabla (){
        borrarFilas();
        inscripcionData m=new inscripcionData();
        ArrayList<Inscripcion> materia = new ArrayList<>();

        for(Materia mat : m.obtenerMateriasCursadas(jComboBox1.getSelectedIndex())){
        
        if (jrbInscriptas.isSelected()==true){
            model.addRow(new Object[]{
            mat.getIdMateria(),
            mat.getNombre(),
            mat.getAnioMateria()
            });
    }
        }

}
}