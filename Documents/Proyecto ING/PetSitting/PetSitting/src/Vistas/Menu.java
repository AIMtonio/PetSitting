/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.Conexion;
import Clases.Registros;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        setLocation(250, 150);
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
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnMenu.setBackground(new java.awt.Color(255, 255, 255));
        jpnMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbNombreMascota.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jlbNombreMascota.setText("Nombre de la mascota:");
        jpnMenu.add(jlbNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 300, 40));

        jlbRaza.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jlbRaza.setText("Raza:");
        jpnMenu.add(jlbRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 70, 30));

        jlbEdad.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jlbEdad.setText("Edad:");
        jpnMenu.add(jlbEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 60, 40));

        jlbPeso.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jlbPeso.setText("Peso:");
        jpnMenu.add(jlbPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 70, 40));

        jtfNombreMascota.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jpnMenu.add(jtfNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 230, 38));

        jcbTipoMascota.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcbTipoMascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Perro", "Gato", "Conejo", "Roedor" }));
        jcbTipoMascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbTipoMascotaMouseClicked(evt);
            }
        });
        jcbTipoMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoMascotaActionPerformed(evt);
            }
        });
        jpnMenu.add(jcbTipoMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 230, 38));

        jlbTipoMascota.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jlbTipoMascota.setText("Tipo de Mascota");
        jpnMenu.add(jlbTipoMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 190, 40));

        jtfPeso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jpnMenu.add(jtfPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 230, 44));

        jcbRaza.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcbRaza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-" }));
        jcbRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbRazaActionPerformed(evt);
            }
        });
        jpnMenu.add(jcbRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 230, 38));

        jcbEdad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcbEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "menos de 6 meses", "de 6 a 11 meses", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+10" }));
        jcbEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEdadActionPerformed(evt);
            }
        });
        jpnMenu.add(jcbEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 230, 38));

        jbtEnviar.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jbtEnviar.setText("Registrar");
        jbtEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEnviarActionPerformed(evt);
            }
        });
        jpnMenu.add(jbtEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 180, 60));

        jbtSalir.setText("Cerar Sesion");
        jbtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalirActionPerformed(evt);
            }
        });
        jpnMenu.add(jbtSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 110, 30));

        jlbUsuario.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 36)); // NOI18N
        jpnMenu.add(jlbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 190, 40));

        jlbLogoproyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo Proyecto icono.png"))); // NOI18N
        jpnMenu.add(jlbLogoproyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 130));
        jpnMenu.add(Contraprueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jpnMenu.add(idprueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 36)); // NOI18N
        jLabel1.setText("Bienvenido");
        jpnMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 290, 40));

        jButton1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpnMenu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 200, 60));

        jButton2.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jpnMenu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 190, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Inserte los datos de la mascota ");
        jpnMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 210, 30));

        jButton3.setText("Prueba");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jpnMenu.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbTipoMascotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbTipoMascotaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoMascotaMouseClicked

    private void jbtEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEnviarActionPerformed
        // TODO add your handling code here:
        Registros c=new Registros();
        c.consultarm();
        String ver=c.p;
        System.out.println(ver);
        if(ver==null){
            String mascota=jtfNombreMascota.getText();
            String tipo=String.valueOf(jcbTipoMascota.getSelectedItem());
            String raza=String.valueOf(jcbRaza.getSelectedItem());
            //Agregar validacion
            String edadTemportal=null;
            edadTemportal=(String.valueOf(jcbEdad.getSelectedItem()));
            if(edadTemportal.equalsIgnoreCase("menos de 6 meses")){
         
            double edad=0.3;
            }else if(edadTemportal.equalsIgnoreCase("de 6 a 11 meses")){
            double edad=0.8;
            // int edad=Integer.parseInt(String.valueOf(jcbEdad.getSelectedItem()));
            Double peso=Double.parseDouble(jtfPeso.getText());
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
            Registros r=new Registros(mascota,tipo,raza,edad,peso);
            r.registrarmascota();
            }   
        }else{
            JOptionPane.showMessageDialog(null, "Solo se permite un registro de mascota");
        }
        }
    }//GEN-LAST:event_jbtEnviarActionPerformed

    private void jbtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalirActionPerformed
        // TODO add your handling code here:
            this.setVisible(false);
            Index b=new Index();
            b.setVisible(true);
        
    }//GEN-LAST:event_jbtSalirActionPerformed

    private void jcbEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEdadActionPerformed

    private void jcbRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbRazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbRazaActionPerformed

    private void jcbTipoMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoMascotaActionPerformed
        // TODO add your handling code here:
        Registros w=new Registros();
        String tipo=String.valueOf(jcbTipoMascota.getSelectedItem());
        switch(tipo){
            case "Perro": 
                limpiar();
                ObtenerP();
            break;
            case "Gato": 
                limpiar();
                ObtenerG();
            break;
            case "Conejo": 
                limpiar();
                ObtenerC();
            break;
            case "Roedor": 
                limpiar();
                ObtenerR();
            break;
        }
        
    }//GEN-LAST:event_jcbTipoMascotaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        limpiarframe();
        Registros q=new Registros();
        q.consultarMascota();
        jtfNombreMascota.setText(q.getNomM());
        jcbTipoMascota.setSelectedItem(q.getTipo());
        jcbRaza.setSelectedItem(q.getRaza());
        jcbEdad.setSelectedItem(String.valueOf(q.getEdad()));
        jtfPeso.setText(String.valueOf(q.getPeso()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Registros q=new Registros();
        if(jButton2.getText().equalsIgnoreCase("Modificar")){
            limpiarframe();
            q.consultarMascota();
            jtfNombreMascota.setText(q.getNomM());
            jcbTipoMascota.setSelectedItem(q.getTipo());
            jcbRaza.setSelectedItem(q.getRaza());
            jcbEdad.setSelectedItem(String.valueOf(q.getEdad()));
            jtfPeso.setText(String.valueOf(q.getPeso()));
            if(jtfNombreMascota.getText().equals("")){
                jButton2.setText("Modificar");
            }else{jButton2.setText("Confirmar");}
            
        }else{
            String mascota=jtfNombreMascota.getText();
            String tipo=String.valueOf(jcbTipoMascota.getSelectedItem());
            String raza=String.valueOf(jcbRaza.getSelectedItem());
            int edad=Integer.parseInt(String.valueOf(jcbEdad.getSelectedItem()));
            Double peso=Double.parseDouble(jtfPeso.getText());
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
            Registros r=new Registros(mascota,tipo,raza,edad,peso);
            r.modificarmascota();
            jButton2.setText("Modificar");
            limpiarframe();
        }
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String edadTemportal=null;
            edadTemportal=(String.valueOf(jcbEdad.getSelectedItem()));
            if(edadTemportal.equalsIgnoreCase("de 6 meses")){
                JOptionPane.showMessageDialog(null, "es igual");
            }else{
                JOptionPane.showMessageDialog(null, "es diferente");
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contraprueba;
    private javax.swing.JLabel idprueba;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private void ObtenerP(){
        jcbRaza.addItem("-Seleccione-");
        try{
            Conexion obj= new Conexion();
            Statement sentencia=obj.getCon().createStatement();
            String sql="select raza from tipo where tipo_mascota='Perro';";
            ResultSet registro=sentencia.executeQuery(sql);
            while(registro.next()){
               jcbRaza.addItem(registro.getString(1));
            }
        }catch (SQLException ex) {
            JOptionPane.showInputDialog(null, "No se recupero la consulta", "Peticion de datos",JOptionPane.QUESTION_MESSAGE);
        }
    
    }
    private void ObtenerG(){
        jcbRaza.addItem("-Seleccione-");
        try{
            Conexion obj= new Conexion();
            Statement sentencia=obj.getCon().createStatement();
            String sql="select raza from tipo where tipo_mascota='Gato';";
            ResultSet registro=sentencia.executeQuery(sql);
            while(registro.next()){
               jcbRaza.addItem(registro.getString(1));
            }
        }catch (SQLException ex) {
            JOptionPane.showInputDialog(null, "No se recupero la consulta", "Peticion de datos",JOptionPane.QUESTION_MESSAGE);
        }
    }
    private void ObtenerC(){
        jcbRaza.addItem("-Seleccione-");
        try{
            Conexion obj= new Conexion();
            Statement sentencia=obj.getCon().createStatement();
            String sql="select raza from tipo where tipo_mascota='Conejo';";
            ResultSet registro=sentencia.executeQuery(sql);
            while(registro.next()){
               jcbRaza.addItem(registro.getString(1));
            }
        }catch (SQLException ex) {
            JOptionPane.showInputDialog(null, "No se recupero la consulta", "Peticion de datos",JOptionPane.QUESTION_MESSAGE);
        }
    }
    private void ObtenerR(){
        jcbRaza.addItem("-Seleccione-");
        try{
            Conexion obj= new Conexion();
            Statement sentencia=obj.getCon().createStatement();
            String sql="select raza from tipo where tipo_mascota='Roedor';";
            ResultSet registro=sentencia.executeQuery(sql);
            while(registro.next()){
               jcbRaza.addItem(registro.getString(1));
            }
        }catch (SQLException ex) {
            JOptionPane.showInputDialog(null, "No se recupero la consulta", "Peticion de datos",JOptionPane.QUESTION_MESSAGE);
        }
    }
    
    private void limpiar(){
        jcbRaza.removeAllItems();
    }
    
    private void limpiarframe(){
        jtfNombreMascota.setText("");
        jcbTipoMascota.setSelectedItem("-Seleccione-");
        jcbRaza.setSelectedItem("-Seleccione-");
        jcbEdad.setSelectedItem("-Seleccione-");
        jtfPeso.setText("");
    }
}

