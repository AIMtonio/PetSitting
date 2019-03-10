
package Vistas;
import Clases.Registros;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(1005, 609);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRegistrar = new javax.swing.JPanel();
        jlbNombre = new javax.swing.JLabel();
        jlbApepat = new javax.swing.JLabel();
        jlbApemat = new javax.swing.JLabel();
        jlbUsuario = new javax.swing.JLabel();
        jlbPassword = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfApepat = new javax.swing.JTextField();
        jtfApemat = new javax.swing.JTextField();
        jtfUsuario = new javax.swing.JTextField();
        jpfPassword = new javax.swing.JPasswordField();
        jlbPasswordrepetible = new javax.swing.JLabel();
        jpfPasswordRepetible = new javax.swing.JPasswordField();
        jbtAgregar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jlbNumeroTelefono = new javax.swing.JLabel();
        jtfNumeroTelefono = new javax.swing.JTextField();
        jblUsuario = new javax.swing.JLabel();
        PanelIMG2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jpnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        jpnRegistrar.setLayout(null);

        jlbNombre.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jlbNombre.setText("Nombre:");
        jpnRegistrar.add(jlbNombre);
        jlbNombre.setBounds(530, 90, 130, 30);

        jlbApepat.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jlbApepat.setText("Apellido Paterno:");
        jpnRegistrar.add(jlbApepat);
        jlbApepat.setBounds(460, 130, 270, 40);

        jlbApemat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbApemat.setText("Apellido Materno:");
        jpnRegistrar.add(jlbApemat);
        jlbApemat.setBounds(510, 190, 184, 30);

        jlbUsuario.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jlbUsuario.setText("Usuario");
        jpnRegistrar.add(jlbUsuario);
        jlbUsuario.setBounds(520, 240, 140, 27);

        jlbPassword.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jlbPassword.setText("Nueva Contraseña:");
        jpnRegistrar.add(jlbPassword);
        jlbPassword.setBounds(440, 290, 280, 40);

        jtfNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreKeyTyped(evt);
            }
        });
        jpnRegistrar.add(jtfNombre);
        jtfNombre.setBounds(730, 90, 230, 41);

        jtfApepat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfApepat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfApepatActionPerformed(evt);
            }
        });
        jtfApepat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfApepatKeyTyped(evt);
            }
        });
        jpnRegistrar.add(jtfApepat);
        jtfApepat.setBounds(730, 140, 230, 34);

        jtfApemat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfApemat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfApematKeyTyped(evt);
            }
        });
        jpnRegistrar.add(jtfApemat);
        jtfApemat.setBounds(730, 190, 230, 34);

        jtfUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfUsuarioKeyTyped(evt);
            }
        });
        jpnRegistrar.add(jtfUsuario);
        jtfUsuario.setBounds(730, 240, 230, 34);

        jpfPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpfPasswordKeyTyped(evt);
            }
        });
        jpnRegistrar.add(jpfPassword);
        jpfPassword.setBounds(730, 290, 230, 34);

        jlbPasswordrepetible.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jlbPasswordrepetible.setText("Repite Contraseña:");
        jpnRegistrar.add(jlbPasswordrepetible);
        jlbPasswordrepetible.setBounds(440, 340, 290, 40);

        jpfPasswordRepetible.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpfPasswordRepetibleKeyTyped(evt);
            }
        });
        jpnRegistrar.add(jpfPasswordRepetible);
        jpfPasswordRepetible.setBounds(730, 340, 230, 34);

        jbtAgregar.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jbtAgregar.setText("Registrar");
        jbtAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAgregarActionPerformed(evt);
            }
        });
        jpnRegistrar.add(jbtAgregar);
        jbtAgregar.setBounds(460, 480, 210, 50);

        jButton1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpnRegistrar.add(jButton1);
        jButton1.setBounds(700, 480, 190, 50);

        jlbNumeroTelefono.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jlbNumeroTelefono.setText("Número de Teléfono:");
        jpnRegistrar.add(jlbNumeroTelefono);
        jlbNumeroTelefono.setBounds(430, 390, 310, 40);

        jtfNumeroTelefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfNumeroTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNumeroTelefonoKeyTyped(evt);
            }
        });
        jpnRegistrar.add(jtfNumeroTelefono);
        jtfNumeroTelefono.setBounds(730, 390, 230, 34);

        jblUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jblUsuario.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 36)); // NOI18N
        jblUsuario.setText("REGISTRO");
        jpnRegistrar.add(jblUsuario);
        jblUsuario.setBounds(610, 20, 230, 50);

        PanelIMG2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PanelLogin.png"))); // NOI18N
        jpnRegistrar.add(PanelIMG2);
        PanelIMG2.setBounds(0, 0, 860, 610);

        getContentPane().add(jpnRegistrar);
        jpnRegistrar.setBounds(0, 0, 1010, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAgregarActionPerformed
        String nom=jtfNombre.getText();
        String apepa=jtfApepat.getText();
        String apema=jtfApemat.getText();
        String usu=jtfUsuario.getText();
        String con=jpfPassword.getText();
        String cel=jtfNumeroTelefono.getText();
        String con2=jpfPasswordRepetible.getText();
          if(con.equalsIgnoreCase(con2)){
            if(cel.length()>10){
            JOptionPane.showMessageDialog(null, "Formato invalido");
            }else{
        Registros a=new Registros(nom,apepa,apema,usu,con,cel);
        a.registrar();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
            abrirIndex();
         }
            }else{
    JOptionPane.showMessageDialog(null, "Contraseña incorrecta repita acción");

        }
        
        
        
    }//GEN-LAST:event_jbtAgregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        abrirIndex();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyTyped
        // TODO add your handling code here:
        char car=evt.getKeyChar();
        if(Character.isDigit(car)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null, "Solo letras","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jtfNombreKeyTyped

    private void jtfApepatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApepatKeyTyped
        // TODO add your handling code here:
        char car=evt.getKeyChar();
        if(Character.isDigit(car)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null, "Solo letras","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
        
        char esp=evt.getKeyChar();
        if(Character.isSpace(car)){
        jtfApepat.setText(null);
        evt.consume();
        JOptionPane.showMessageDialog(null, "No se aceptan espacios","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jtfApepatKeyTyped

    private void jtfApematKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApematKeyTyped
        // TODO add your handling code here:
        char car=evt.getKeyChar();
        if(Character.isDigit(car)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(null, "Solo letras","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jtfApematKeyTyped

    private void jtfNumeroTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNumeroTelefonoKeyTyped
        // TODO add your handling code here:
        char car=evt.getKeyChar();
        if(Character.isLetter(car)){
       getToolkit().beep();;
       evt.consume();
       JOptionPane.showMessageDialog(null, "Solo numeros","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
        char esp=evt.getKeyChar();
        if(Character.isSpace(car)){
        jtfApepat.setText(null);
        evt.consume();
        JOptionPane.showMessageDialog(null, "No se aceptan espacios","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jtfNumeroTelefonoKeyTyped

    private void jtfApepatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfApepatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfApepatActionPerformed

    private void jtfUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfUsuarioKeyTyped
        // TODO add your handling code here:
        char esp=evt.getKeyChar();
        if(Character.isSpace(esp)){
        jtfUsuario.setText(null);
        evt.consume();
        JOptionPane.showMessageDialog(null, "No se aceptan espacios","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jtfUsuarioKeyTyped

    private void jpfPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpfPasswordKeyTyped
        // TODO add your handling code here:
        char esp=evt.getKeyChar();
        if(Character.isSpace(esp)){
        jtfApepat.setText(null);
        evt.consume();
        JOptionPane.showMessageDialog(null, "No se aceptan espacios","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jpfPasswordKeyTyped

    private void jpfPasswordRepetibleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpfPasswordRepetibleKeyTyped
        // TODO add your handling code here:
        char esp=evt.getKeyChar();
        if(Character.isSpace(esp)){
        jtfApepat.setText(null);
        evt.consume();
        JOptionPane.showMessageDialog(null, "No se aceptan espacios","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jpfPasswordRepetibleKeyTyped

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PanelIMG2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jblUsuario;
    private javax.swing.JButton jbtAgregar;
    private javax.swing.JLabel jlbApemat;
    private javax.swing.JLabel jlbApepat;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel jlbNumeroTelefono;
    private javax.swing.JLabel jlbPassword;
    private javax.swing.JLabel jlbPasswordrepetible;
    private javax.swing.JLabel jlbUsuario;
    private javax.swing.JPasswordField jpfPassword;
    private javax.swing.JPasswordField jpfPasswordRepetible;
    private javax.swing.JPanel jpnRegistrar;
    private javax.swing.JTextField jtfApemat;
    private javax.swing.JTextField jtfApepat;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfNumeroTelefono;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables

    private void abrirIndex() {
            this.setVisible(false);
            Index b=new Index();
            b.setVisible(true);
    }
}
