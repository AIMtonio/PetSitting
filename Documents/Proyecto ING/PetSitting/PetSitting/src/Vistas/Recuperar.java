/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.Email;
import javax.swing.JOptionPane;
/**
 *
 * @author lario
 */
public class Recuperar extends javax.swing.JFrame {

    /**
     * Creates new form Email
     */
    public Recuperar() {
        initComponents();
        this.setSize(856, 559);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLocation(250, 150);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplIndex = new javax.swing.JPanel();
        jbtRecuperar = new javax.swing.JButton();
        jtfCorreo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jplIndex.setBackground(new java.awt.Color(255, 255, 255));
        jplIndex.setLayout(null);

        jbtRecuperar.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jbtRecuperar.setText("Recuperar");
        jbtRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRecuperarActionPerformed(evt);
            }
        });
        jplIndex.add(jbtRecuperar);
        jbtRecuperar.setBounds(430, 360, 190, 50);

        jtfCorreo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jplIndex.add(jtfCorreo);
        jtfCorreo.setBounds(610, 240, 220, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PanelLogin.png"))); // NOI18N
        jplIndex.add(jLabel3);
        jLabel3.setBounds(0, 0, 420, 560);

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jLabel4.setText("Ingrese correo");
        jplIndex.add(jLabel4);
        jLabel4.setBounds(430, 250, 170, 40);

        jButton1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jButton1.setText("CANCELAR");
        jplIndex.add(jButton1);
        jButton1.setBounds(630, 360, 200, 50);

        getContentPane().add(jplIndex);
        jplIndex.setBounds(0, 0, 860, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRecuperarActionPerformed
        Email e=new Email(jtfCorreo.getText());
        if(e.consultar()){
            if(e.enviado){
                JOptionPane.showMessageDialog(null, "Se a enviado un correo con su contraseña, favor de revisar su buzon.");
                this.setVisible(false);
                Index b=new Index();
                b.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "No se envió el correo, favor de revisar su conexión.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se encontro el correo, favor de revisar el correo.");
        }
        
    }//GEN-LAST:event_jbtRecuperarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbtRecuperar;
    private javax.swing.JPanel jplIndex;
    private javax.swing.JTextField jtfCorreo;
    // End of variables declaration//GEN-END:variables
}
