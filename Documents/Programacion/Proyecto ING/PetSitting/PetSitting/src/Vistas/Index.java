
package Vistas;

import Clases.Registros;
import Vistas.Registro;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class Index extends javax.swing.JFrame {

    public Index() {
        initComponents();
        this.setSize(856, 559);
        setResizable(false);
        setLocationRelativeTo(null);
        setLocation(250, 150);
        validarUsuarios();
    }

    /* @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Recursos/1.png"));


        return retValue;
    }//Metodo que añade imagen como icono*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplIndex = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbtRegistrar = new javax.swing.JButton();
        jbtIniciar = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jtfUsuario = new javax.swing.JTextField();
        jblUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jplIndex.setBackground(new java.awt.Color(255, 255, 255));
        jplIndex.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconUser_64.png"))); // NOI18N
        jplIndex.add(jLabel1);
        jLabel1.setBounds(520, 160, 60, 60);

        jbtRegistrar.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jbtRegistrar.setText("Registrar");
        jbtRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRegistrarActionPerformed(evt);
            }
        });
        jplIndex.add(jbtRegistrar);
        jbtRegistrar.setBounds(650, 370, 190, 60);

        jbtIniciar.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jbtIniciar.setText("Iniciar");
        jbtIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtIniciarActionPerformed(evt);
            }
        });
        jplIndex.add(jbtIniciar);
        jbtIniciar.setBounds(480, 370, 160, 60);

        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyTyped(evt);
            }
        });
        jplIndex.add(jPasswordField1);
        jPasswordField1.setBounds(590, 240, 200, 50);

        jtfUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jplIndex.add(jtfUsuario);
        jtfUsuario.setBounds(590, 170, 200, 50);

        jblUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jblUsuario.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 36)); // NOI18N
        jblUsuario.setText("INICIO DE SESIÓN ");
        jplIndex.add(jblUsuario);
        jblUsuario.setBounds(440, 80, 410, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconPassword_64.png"))); // NOI18N
        jplIndex.add(jLabel2);
        jLabel2.setBounds(510, 240, 60, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PanelLogin.png"))); // NOI18N
        jplIndex.add(jLabel3);
        jLabel3.setBounds(0, 0, 860, 560);

        Email.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        Email.setForeground(new java.awt.Color(0, 153, 204));
        Email.setText("¿Olvidaste tu contraseña?");
        Email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmailMouseClicked(evt);
            }
        });
        jplIndex.add(Email);
        Email.setBounds(590, 300, 200, 40);

        getContentPane().add(jplIndex);
        jplIndex.setBounds(0, 0, 860, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRegistrarActionPerformed
        Registros c=new Registros();
        c.consultarIDusuario();
        String ver=c.pruebar;
        System.out.println(ver);
        if(ver==null){
            this.setVisible(false);
            Registro b=new Registro();
            b.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Solo se permite un registro");
//            String codigo=JOptionPane.showInputDialog(null,"h");
//            JOptionPane.showMessageDialog(null, "Texto " + codigo);
        }
    }//GEN-LAST:event_jbtRegistrarActionPerformed

    private void jbtIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtIniciarActionPerformed
        // TODO add your handling code here:
        String usua=jtfUsuario.getText();
        String con=jPasswordField1.getText();
        Registros a= new Registros(usua, con);
        a.iniciarS();
        if (a.iniciarS()=="no") {
            JOptionPane.showMessageDialog(null, "Datos erroneos");
        }if(a.iniciarS()=="si"){
            Registros c=new Registros(usua,con);
            this.setVisible(false);
            Menu b=new Menu();
            b.setVisible(true);
        }
    }//GEN-LAST:event_jbtIniciarActionPerformed

    private void EmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailMouseClicked
            this.setVisible(false);
            Recuperar b=new Recuperar();
            b.setVisible(true);
    }//GEN-LAST:event_EmailMouseClicked

    private void jPasswordField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyTyped
        
    }//GEN-LAST:event_jPasswordField1KeyTyped

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel jblUsuario;
    private javax.swing.JButton jbtIniciar;
    private javax.swing.JButton jbtRegistrar;
    private javax.swing.JPanel jplIndex;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables

    private void acceder() {
        
    }

    private void validarUsuarios() {
        Registros a= new Registros();
        
    }
}
