/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.Conexion;
import Clases.Registros;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;



/**
 *
 * @author CB07
 */
public class Menu extends javax.swing.JFrame {
String usuario;
String contra;
    /**
     * Creates new form M
     */
    public Menu() {
        initComponents();
        jlbUsuario.setText(Registros.getUsuario());   
        Contraprueba.setText(Registros.getContra());
        usuario=Registros.getUsuario();
        contra=Registros.getContra();
        consultar();
        idprueba.setText(prueba);
        Contraprueba.setVisible(false);
        idprueba.setVisible(false);
        setLocation(250, 250);
    }
    



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnMenu = new javax.swing.JPanel();
        jlbNombreMascota = new javax.swing.JLabel();
        jlbRaza = new javax.swing.JLabel();
        jlbEdad = new javax.swing.JLabel();
        jlbPeso = new javax.swing.JLabel();
        jtfNombreMascota = new javax.swing.JTextField();
        jcbTipoMascota = new javax.swing.JComboBox<>();
        jlbTipoMascota = new javax.swing.JLabel();
        jtfPeso = new javax.swing.JTextField();
        jcbRaza = new javax.swing.JComboBox<>();
        jcbEdad = new javax.swing.JComboBox<>();
        jbtEnviar = new javax.swing.JButton();
        jbtSalir = new javax.swing.JButton();
        jlbUsuario = new javax.swing.JLabel();
        jlbLogoproyecto = new javax.swing.JLabel();
        Contraprueba = new javax.swing.JLabel();
        idprueba = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnMenu.setBackground(new java.awt.Color(255, 255, 255));
        jpnMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbNombreMascota.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbNombreMascota.setText("Nombre de la mascota:");
        jpnMenu.add(jlbNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 119, 182, 38));

        jlbRaza.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbRaza.setText("Raza:");
        jpnMenu.add(jlbRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 226, 182, 38));

        jlbEdad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbEdad.setText("Edad:");
        jpnMenu.add(jlbEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 283, 182, 38));

        jlbPeso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbPeso.setText("Peso:");
        jpnMenu.add(jlbPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 341, 182, 38));

        jtfNombreMascota.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jpnMenu.add(jtfNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 121, 230, 38));

        jcbTipoMascota.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcbTipoMascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Perro", "Gato", "Conejo", "Roedor" }));
        jcbTipoMascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbTipoMascotaMouseClicked(evt);
            }
        });
        jpnMenu.add(jcbTipoMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 171, 230, 38));

        jlbTipoMascota.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbTipoMascota.setText("Tipo de Mascota");
        jpnMenu.add(jlbTipoMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 170, 182, 38));

        jtfPeso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jpnMenu.add(jtfPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 340, 230, 44));

        jcbRaza.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcbRaza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-" }));
        jcbRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbRazaActionPerformed(evt);
            }
        });
        jpnMenu.add(jcbRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 227, 230, 38));

        jcbEdad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcbEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "- de 6 meses", "+ de 6 meses", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+10" }));
        jcbEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEdadActionPerformed(evt);
            }
        });
        jpnMenu.add(jcbEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 284, 230, 38));

        jbtEnviar.setText("Registrar");
        jbtEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEnviarActionPerformed(evt);
            }
        });
        jpnMenu.add(jbtEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 112, 30));

        jbtSalir.setText("Salir");
        jbtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalirActionPerformed(evt);
            }
        });
        jpnMenu.add(jbtSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 110, 30));

        jlbUsuario.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jpnMenu.add(jlbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 190, 40));

        jlbLogoproyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo Proyecto icono.png"))); // NOI18N
        jpnMenu.add(jlbLogoproyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 130));

        Contraprueba.setText("jLabel1");
        jpnMenu.add(Contraprueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        idprueba.setText("jLabel1");
        jpnMenu.add(idprueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Bienvenido");
        jpnMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 290, 40));

        jButton1.setText("Consultar");
        jpnMenu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 110, 30));

        jButton2.setText("Modificar");
        jpnMenu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 110, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Inserte los datos de la mascota ");
        jpnMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 210, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbTipoMascotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbTipoMascotaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoMascotaMouseClicked

    private void jbtEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEnviarActionPerformed
        // TODO add your handling code here:
        String mascota=jtfNombreMascota.getText();
        String tipo=String.valueOf(jcbTipoMascota.getSelectedItem());
        String raza=String.valueOf(jcbRaza.getSelectedItem());
        String edad=String.valueOf(jcbEdad.getSelectedItem());
        String peso=jtfPeso.getText();
        if(jtfNombreMascota.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Inserte nombre");
        }else if(jcbTipoMascota.getSelectedItem().equals("-Seleccione-")){
            JOptionPane.showMessageDialog(null, "Seleccione tipo");
        }else if(jcbRaza.getSelectedItem().equals("-Seleccione-")){
            JOptionPane.showMessageDialog(null, "Seleccione raza");
        }else if(jcbEdad.getSelectedItem().equals("-Seleccione-")){
            JOptionPane.showMessageDialog(null, "Seleccione edad");
        }else if(jtfPeso.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Inserte peso");
        }else{
            
        }
        
    }//GEN-LAST:event_jbtEnviarActionPerformed

    private void jbtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalirActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jbtSalirActionPerformed

    private void jcbEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEdadActionPerformed

    private void jcbRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbRazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbRazaActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contraprueba;
    private javax.swing.JLabel idprueba;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtEnviar;
    private javax.swing.JButton jbtSalir;
    private javax.swing.JComboBox<String> jcbEdad;
    private javax.swing.JComboBox<String> jcbRaza;
    private javax.swing.JComboBox<String> jcbTipoMascota;
    private javax.swing.JLabel jlbEdad;
    private javax.swing.JLabel jlbLogoproyecto;
    private javax.swing.JLabel jlbNombreMascota;
    private javax.swing.JLabel jlbPeso;
    private javax.swing.JLabel jlbRaza;
    private javax.swing.JLabel jlbTipoMascota;
    private javax.swing.JLabel jlbUsuario;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JTextField jtfNombreMascota;
    private javax.swing.JTextField jtfPeso;
    // End of variables declaration//GEN-END:variables

    String prueba;
    private void consultar() {
        try{
            Conexion obj= new Conexion();
            Statement sentencia=obj.getCon().createStatement();
            String sql="select id_usuario from usuario where usuario='"+usuario+"' and password='"+contra+"';";
            ResultSet registro=sentencia.executeQuery(sql);
            while(registro.next()){
                prueba=registro.getString(1);
            }
        }catch(Exception a){
            a.printStackTrace();
        }
    } 


}

