/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_diegomatamoros;

import java.util.EmptyStackException;
import javax.swing.JOptionPane;

/**
 *
 * @author Family
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Puntaje = new javax.swing.JLabel();
        Copias = new javax.swing.JLabel();
        Genero = new javax.swing.JLabel();
        Valor = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Autos = new javax.swing.JLabel();
        Año = new javax.swing.JLabel();
        jt_titulo = new javax.swing.JTextField();
        jt_descripcion = new javax.swing.JTextField();
        jt_puntaje = new javax.swing.JTextField();
        jt_copias = new javax.swing.JTextField();
        jt_genero = new javax.swing.JTextField();
        jt_valor = new javax.swing.JTextField();
        jt_edicion = new javax.swing.JTextField();
        jt_autos = new javax.swing.JTextField();
        jt_añoPubli = new javax.swing.JTextField();
        jb_añadir = new javax.swing.JButton();
        BackGround = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Añadir Libros");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Titulo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 50, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Descripcion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        Puntaje.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Puntaje.setForeground(new java.awt.Color(0, 255, 255));
        Puntaje.setText("Puntaje");
        jPanel1.add(Puntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        Copias.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Copias.setForeground(new java.awt.Color(0, 255, 255));
        Copias.setText("CopiasDisponibles");
        jPanel1.add(Copias, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        Genero.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Genero.setForeground(new java.awt.Color(0, 255, 255));
        Genero.setText("Genero");
        jPanel1.add(Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 70, -1));

        Valor.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Valor.setForeground(new java.awt.Color(0, 204, 204));
        Valor.setText("Valor");
        jPanel1.add(Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Edicion");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        Autos.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Autos.setForeground(new java.awt.Color(0, 204, 204));
        Autos.setText("Autos");
        jPanel1.add(Autos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        Año.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Año.setForeground(new java.awt.Color(0, 255, 255));
        Año.setText("AñoPublicacion");
        jPanel1.add(Año, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));
        jPanel1.add(jt_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 90, -1));
        jPanel1.add(jt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 100, 50));
        jPanel1.add(jt_puntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 100, -1));
        jPanel1.add(jt_copias, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 40, -1));
        jPanel1.add(jt_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 80, -1));
        jPanel1.add(jt_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 80, -1));
        jPanel1.add(jt_edicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 80, -1));
        jPanel1.add(jt_autos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 100, -1));
        jPanel1.add(jt_añoPubli, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 70, -1));

        jb_añadir.setText("AÑADIR");
        jb_añadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_añadirMouseClicked(evt);
            }
        });
        jb_añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_añadirActionPerformed(evt);
            }
        });
        jPanel1.add(jb_añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examen1_diegomatamoros/biblioteca_libros_prohibidos.jpg"))); // NOI18N
        jPanel1.add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 410));

        jTabbedPane1.addTab("Añadir Libros", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Añadir Amigos", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Mostrar Libros", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_añadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_añadirActionPerformed

    private void jb_añadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_añadirMouseClicked
        Usuarios u = new Usuarios();
        AñadirUsuario a = new AñadirUsuario();
        Login l = new Login();
        try {
            String titulo, descripcion, genero, autor;
            int copias, puntaje, añoPublicacion, valor, edicion;
            titulo = jt_titulo.getText();
            descripcion = jt_descripcion.getText();
            genero = jt_genero.getText();
            if (genero.toLowerCase().equals("fantasia")) {
                genero = "fantasia";
            }
            if (genero.toLowerCase().equals("romance")) {
                genero = "romance";
            }
            if (genero.toLowerCase().equals("accion")) {
                genero = "accion";
            }
            if (genero.toLowerCase().equals("historia")) {
                genero = "historia";
            }
            if (!genero.toLowerCase().equals("fantasia") && !genero.toLowerCase().equals("romance") && !genero.toLowerCase().equals("accion") && !genero.toLowerCase().equals("historia")) {
                throw new EmptyStackException();
            }
            autor = this.jt_autos.getText();
            copias = Integer.parseInt(this.jt_copias.getText());
            puntaje = Integer.parseInt(this.jt_puntaje.getText());
            añoPublicacion = Integer.parseInt(this.jt_añoPubli.getText());
            valor = Integer.parseInt(this.jt_valor.getText());
            edicion = Integer.parseInt(this.jt_edicion.getText());
            u.libros.add(new Libros(titulo, descripcion, genero, autor,
                    copias, puntaje, añoPublicacion, valor, edicion));
            jt_autos.setText("");
            jt_titulo.setText("");
            jt_descripcion.setText("");
            jt_genero.setText("");
            jt_copias.setText("");
            jt_puntaje.setText("");
            jt_añoPubli.setText("");
            jt_valor.setText("");
            jt_edicion.setText("");
            JOptionPane.showMessageDialog(this, "se ha añadido exitosamente");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ha introducido mal algo");
        }
        

    }//GEN-LAST:event_jb_añadirMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Autos;
    private javax.swing.JLabel Año;
    private javax.swing.JLabel BackGround;
    private javax.swing.JLabel Copias;
    private javax.swing.JLabel Genero;
    private javax.swing.JLabel Puntaje;
    private javax.swing.JLabel Valor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jb_añadir;
    private javax.swing.JTextField jt_autos;
    private javax.swing.JTextField jt_añoPubli;
    private javax.swing.JTextField jt_copias;
    private javax.swing.JTextField jt_descripcion;
    private javax.swing.JTextField jt_edicion;
    private javax.swing.JTextField jt_genero;
    private javax.swing.JTextField jt_puntaje;
    private javax.swing.JTextField jt_titulo;
    private javax.swing.JTextField jt_valor;
    // End of variables declaration//GEN-END:variables
}
