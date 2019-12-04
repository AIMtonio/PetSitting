package Vistas;

import Clases.Conexion;
import Clases.Registros;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import panamahitek.Arduino.PanamaHitek_Arduino;

public class Menu extends javax.swing.JFrame {

    PanamaHitek_Arduino Arduino = new PanamaHitek_Arduino();
    Controls c = new Controls();

    String usuario;
    String contra;

    public Menu() {
        initComponents();
        jlbUsuario.setText(Registros.getUsuario());
        Contraprueba.setText(Registros.getContra());
        usuario = Registros.getUsuario();
        contra = Registros.getContra();
        consultar();
        idprueba.setText(prueba);
        Contraprueba.setVisible(false);
        idprueba.setVisible(false);
        setLocation(250, 150);
        //getPorts();
        //Pendiente verificacion del codigo.
    }

    public void getPorts() {
        jComboBoxPorts.removeAllItems();
        if (Arduino.getPortsAvailable() > 0) {
            List lst = Arduino.getSerialPorts();
            for (int i = 0; i < lst.size(); i++) {
                jComboBoxPorts.addItem(lst.get(i));
            }
            //Arduino.getSerialPorts().forEach(i -> jComboBoxPorts.addItem(i));
            jButtonConectar.setEnabled(true);
            jButtonConectar.setBackground(new Color(255, 255, 255));
        } else {
            jButtonConectar.setEnabled(false);
            jButtonConectar.setBackground(new Color(204, 204, 204));
        }

    }

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
        jlbUsuario = new javax.swing.JLabel();
        Contraprueba = new javax.swing.JLabel();
        idprueba = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcenfermedad = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcbActividad = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxPorts = new javax.swing.JComboBox();
        jButtonRefresh = new javax.swing.JButton();
        jButtonConectar = new javax.swing.JButton();
        jButtonEncender = new javax.swing.JButton();
        jButtonApagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnMenu.setBackground(new java.awt.Color(255, 255, 255));
        jpnMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbNombreMascota.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jlbNombreMascota.setText("Nombre de la mascota:");
        jpnMenu.add(jlbNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 280, 40));

        jlbRaza.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jlbRaza.setText("Raza:");
        jpnMenu.add(jlbRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 70, 30));

        jlbEdad.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jlbEdad.setText("Edad:");
        jpnMenu.add(jlbEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 60, 40));

        jlbPeso.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jlbPeso.setText("Peso:");
        jpnMenu.add(jlbPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 70, 40));

        jtfNombreMascota.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfNombreMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreMascotaActionPerformed(evt);
            }
        });
        jtfNombreMascota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfNombreMascotaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreMascotaKeyTyped(evt);
            }
        });
        jpnMenu.add(jtfNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 230, 38));

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
        jpnMenu.add(jcbTipoMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 230, 38));

        jlbTipoMascota.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jlbTipoMascota.setText("Tipo de Mascota:");
        jpnMenu.add(jlbTipoMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 210, 40));

        jtfPeso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPesoKeyTyped(evt);
            }
        });
        jpnMenu.add(jtfPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, 230, 44));

        jcbRaza.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcbRaza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-" }));
        jcbRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbRazaActionPerformed(evt);
            }
        });
        jpnMenu.add(jcbRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 230, 38));

        jcbEdad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcbEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "menos de 6 meses", "de 6 a 11 meses", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jcbEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEdadActionPerformed(evt);
            }
        });
        jpnMenu.add(jcbEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 230, 38));

        jbtEnviar.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jbtEnviar.setText("Registrar");
        jbtEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEnviarActionPerformed(evt);
            }
        });
        jpnMenu.add(jbtEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 170, 40));

        jlbUsuario.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 36)); // NOI18N
        jlbUsuario.setForeground(new java.awt.Color(0, 153, 204));
        jpnMenu.add(jlbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 190, 40));
        jpnMenu.add(Contraprueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jpnMenu.add(idprueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("Bienvenido");
        jpnMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 290, 40));

        jButton1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpnMenu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, -1, 40));

        jButton2.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jpnMenu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 460, 190, 40));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        jLabel2.setText("Inserte los datos de la mascota ");
        jpnMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 430, 30));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel3.setText("Padece alguna efermedad?");
        jpnMenu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 310, 30));

        jcenfermedad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcenfermedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Ninguna", "Obesidad", "Desnutrición" }));
        jcenfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcenfermedadActionPerformed(evt);
            }
        });
        jpnMenu.add(jcenfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, 230, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Safe_Out_64.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jpnMenu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, -1, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PanelLogin.png"))); // NOI18N
        jpnMenu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        jcbActividad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcbActividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Alta", "Normal", "Baja" }));
        jpnMenu.add(jcbActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 230, 40));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel6.setText("Actividad de la Mascota");
        jpnMenu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 280, 40));

        jComboBoxPorts.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jpnMenu.add(jComboBoxPorts, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, 120, 30));

        jButtonRefresh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refreshicon.png"))); // NOI18N
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });
        jpnMenu.add(jButtonRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 50, 30));

        jButtonConectar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonConectar.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        jButtonConectar.setForeground(new java.awt.Color(0, 153, 204));
        jButtonConectar.setText("Conectar");
        jButtonConectar.setEnabled(false);
        jButtonConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConectarActionPerformed(evt);
            }
        });
        jpnMenu.add(jButtonConectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, -1, -1));

        jButtonEncender.setBackground(new java.awt.Color(204, 204, 204));
        jButtonEncender.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonEncender.setForeground(new java.awt.Color(255, 102, 0));
        jButtonEncender.setText("Mandar Dato");
        jButtonEncender.setEnabled(false);
        jButtonEncender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEncenderActionPerformed(evt);
            }
        });
        jpnMenu.add(jButtonEncender, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 520, -1, -1));

        jButtonApagar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonApagar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonApagar.setForeground(new java.awt.Color(255, 102, 0));
        jButtonApagar.setText("Apagar");
        jButtonApagar.setEnabled(false);
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });
        jpnMenu.add(jButtonApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbTipoMascotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbTipoMascotaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoMascotaMouseClicked

    private void jbtEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEnviarActionPerformed
        // TODO add your handling code here:
        String codigo = null;
        int validarSiExisteCodigo = 0;
        Conexion con = new Conexion();
        Registros c = new Registros();
        int idCliente = 0;
        int statusPro = 0;
        // Validacion campos llenos 
        if (jtfNombreMascota.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Inserte nombre");
        } else if (jcbTipoMascota.getSelectedItem().equals("-Seleccione-")) {
            JOptionPane.showMessageDialog(null, "Seleccione tipo");
        } else if (jcbRaza.getSelectedItem().equals("-Seleccione-")) {
            JOptionPane.showMessageDialog(null, "Seleccione raza");
        } else if (jcbEdad.getSelectedItem().equals("-Seleccione-")) {
            JOptionPane.showMessageDialog(null, "Seleccione edad");
        } else if (jtfPeso.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Inserte peso");
        } else if (jcenfermedad.getSelectedItem().equals("-Seleccione-")) {
            JOptionPane.showMessageDialog(null, "Seleccione enfermendad");
        } else if (jcbActividad.getSelectedItem().equals("-Seleccione-")) {
            JOptionPane.showMessageDialog(null, "Seleccione Actividad");
        } else {
            c.consultarIDmascota();
            String ver = c.p;
            if (ver == null) {
                procesoregistro();
                double pesoReal = Double.parseDouble(jtfPeso.getText());
                double pesoConvertido = pesoReal * 1000;
                double porcentaje = 0.025;
                double pesoCalculado = pesoConvertido * porcentaje;
                JOptionPane.showMessageDialog(null, "Tu mascota requiere: "
                        + pesoCalculado + "g. Esta cantidad estará dividida en 2 porciones durante el día\n"
                        + "conecta tu dispositivo para configurarlo.\n"
                        + "Conectalo a tu equipo y selecciona en el bóton conectar y posteriormente"
                        + "manda el valor correspondiente");
                limpiarframe();
            } else {
                int x = JOptionPane.showConfirmDialog(null, "Solo se permite una mascota por dispositivo."
                        + "¿Cuentas con un nuevo dispositivo?");
                if (x == 0) {
                    codigo = JOptionPane.showInputDialog(null, "Ingresa el código de tu producto:");
                    try {
                        final String sql = "{call validarCodigoProducto(?)}";
                        CallableStatement cs = con.getCon().prepareCall(sql);
                        cs.setString(1, codigo);
                        ResultSet rs = cs.executeQuery();
                        while (rs.next()) {
                            validarSiExisteCodigo = rs.getInt(1);
                            statusPro = rs.getInt(2);
                        }
                    } catch (Exception e) {
                    }
                    try {
                        final String sql = "{call obtenerIdCliente(?)}";
                        CallableStatement cs = con.getCon().prepareCall(sql);
                        cs.setString(1, usuario);
                        ResultSet rs = cs.executeQuery();
                        while (rs.next()) {
                            idCliente = rs.getInt(1);
                        }
                    } catch (Exception e) {
                    }
                    if (validarSiExisteCodigo != 0) {//si si existe el codigo.
                        if (statusPro != 0) {
                            JOptionPane.showMessageDialog(null, "Este ya ha sido activado");
                        } else {
                            try {
                                final String sql = "{call cambiarEstadoProducto(?,?)}";
                                CallableStatement cs = con.getCon().prepareCall(sql);
                                cs.setString(1, codigo);
                                cs.setInt(2, idCliente);
                                cs.executeUpdate();
                            } catch (Exception e) {
                            }

                            /*
                       Aqui mete lo del registro por fa.
                       Si puedes con validaciones.
                             */
                            procesoregistro();
                            double pesoReal = Double.parseDouble(jtfPeso.getText());
                            double pesoConvertido = pesoReal * 1000;
                            double porcentaje = 0.025;
                            double pesoCalculado = pesoConvertido * porcentaje;
                            JOptionPane.showMessageDialog(null, "Tu mascota requiere: "
                                    + pesoCalculado + "g. Esta cantidad estará dividida en 2 porciones durante el día\n"
                                    + "conecta tu dispositivo para configurarlo.\n"
                                    + "Conectalo a tu equipo y selecciona en el bóton conectar y posteriormente "
                                    + "manda el valor correspondiente");
                            limpiarframe();
                        }
                    } else {//si no existe
                        JOptionPane.showMessageDialog(null, " Este producto no existe");
                    }
                }

            }

        }

    }//GEN-LAST:event_jbtEnviarActionPerformed

    private void jcbEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEdadActionPerformed

    private void jcbRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbRazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbRazaActionPerformed

    private void jcbTipoMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoMascotaActionPerformed
        ObtenerRazas(String.valueOf(jcbTipoMascota.getSelectedItem()));
    }//GEN-LAST:event_jcbTipoMascotaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        limpiarframe();
        Registros q = new Registros();
        q.consultarMascota();
        if(q.getNomM()== null){
            JOptionPane.showMessageDialog(null, "Nombre invalido");
            limpiarframe();
        }else{
            
        jtfNombreMascota.setText(q.getNomM());
        jcbTipoMascota.setSelectedItem(q.getTipo());
        jcbRaza.setSelectedItem(q.getRaza());
        double edad = q.getEdad();
        System.out.println(edad);
        if (edad == 0.3) {
            jcbEdad.setSelectedItem("menos de 6 meses");
        } else if (edad == 0.8) {
            jcbEdad.setSelectedItem("de 6 a 11 meses");
        } else if (edad == 1.0) {
            jcbEdad.setSelectedItem("1");
        } else if (edad == 2.0) {
            jcbEdad.setSelectedItem("2");
        } else if (edad == 3.0) {
            jcbEdad.setSelectedItem("3");
        } else if (edad == 4.0) {
            jcbEdad.setSelectedItem("4");
        } else if (edad == 5.0) {
            jcbEdad.setSelectedItem("5");
        } else if (edad == 6.0) {
            jcbEdad.setSelectedItem("6");
        } else if (edad == 7.0) {
            jcbEdad.setSelectedItem("7");
        } else if (edad == 8.0) {
            jcbEdad.setSelectedItem("8");
        } else if (edad == 9.0) {
            jcbEdad.setSelectedItem("9");
        } else if (edad == 10.0) {
            jcbEdad.setSelectedItem("10");
        }
        jtfPeso.setText(String.valueOf(q.getPeso()));
        jcenfermedad.setSelectedItem(q.getEnfermedad());
        jcbActividad.setSelectedItem(q.getActividad());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Registros q = new Registros();
        if (jButton2.getText().equalsIgnoreCase("Modificar")) {
            q.consultarMascota();
             if(q.getNomM()== null){
            JOptionPane.showMessageDialog(null, "Nombre invalido");
            limpiarframe();
            }else{
            jtfNombreMascota.setText(q.getNomM());
            jcbTipoMascota.setSelectedItem(q.getTipo());
            jcbRaza.setSelectedItem(q.getRaza());
            double edad = q.getEdad();
            System.out.println(edad);
            if (edad == 0.3) {
                jcbEdad.setSelectedItem("menos de 6 meses");
            } else if (edad == 0.8) {
                jcbEdad.setSelectedItem("de 6 a 11 meses");
            } else if (edad == 1.0) {
                jcbEdad.setSelectedItem("1");
            } else if (edad == 2.0) {
                jcbEdad.setSelectedItem("2");
            } else if (edad == 3.0) {
                jcbEdad.setSelectedItem("3");
            } else if (edad == 4.0) {
                jcbEdad.setSelectedItem("4");
            } else if (edad == 5.0) {
                jcbEdad.setSelectedItem("5");
            } else if (edad == 6.0) {
                jcbEdad.setSelectedItem("6");
            } else if (edad == 7.0) {
                jcbEdad.setSelectedItem("7");
            } else if (edad == 8.0) {
                jcbEdad.setSelectedItem("8");
            } else if (edad == 9.0) {
                jcbEdad.setSelectedItem("9");
            } else if (edad == 10.0) {
                jcbEdad.setSelectedItem("10");
            }
            jtfPeso.setText(String.valueOf(q.getPeso()));
            jcenfermedad.setSelectedItem(q.getEnfermedad());
            jcbActividad.setSelectedItem(q.getActividad());
             }
            if (jtfNombreMascota.getText().equals("")) {
                jButton2.setText("Modificar");
            } else {
                jButton2.setText("Confirmar");
            }

        } else {
             if (jtfNombreMascota.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Inserte nombre");
            } else if (jcbTipoMascota.getSelectedItem().equals("-Seleccione-")) {
                JOptionPane.showMessageDialog(null, "Seleccione tipo");
            } else if (jcbRaza.getSelectedItem().equals("-Seleccione-")) {
                JOptionPane.showMessageDialog(null, "Seleccione raza");
            } else if (jcbEdad.getSelectedItem().equals("-Seleccione-")) {
                JOptionPane.showMessageDialog(null, "Seleccione edad");
            } else if (jtfPeso.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Inserte peso");
            } else if (jcenfermedad.getSelectedItem().equals("-Seleccione-")) {
                JOptionPane.showMessageDialog(null, "Inserte enfermendad");
            } else {
            String mascota = jtfNombreMascota.getText();
            String tipo = String.valueOf(jcbTipoMascota.getSelectedItem());
            String raza = String.valueOf(jcbRaza.getSelectedItem());
            String edadTemportal = null;
            double edad = 0;
            edadTemportal = (String.valueOf(jcbEdad.getSelectedItem()));
            if (edadTemportal.equalsIgnoreCase("menos de 6 meses")) {
                edad = 0.3;
            } else if (edadTemportal.equalsIgnoreCase("de 6 a 11 meses")) {
                edad = 0.8;
            } else {
                edad = Double.parseDouble(edadTemportal);
            }
            Double peso = Double.parseDouble(jtfPeso.getText());
            String enfermedad = String.valueOf(jcenfermedad.getSelectedItem());
           
                Registros r = new Registros(mascota, tipo, raza, edad, peso, enfermedad, String.valueOf(jcbActividad.getSelectedItem()));
                r.consultarIDmascota();
                r.modificarMascota();
                jButton2.setText("Modificar");
                limpiarframe();
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jcenfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcenfermedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcenfermedadActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        Index b = new Index();
        b.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        getPorts();
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void jButtonConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConectarActionPerformed

        if (jButtonConectar.getText().equals("Desconectar")) {
            try {
                Arduino.killArduinoConnection();
                jButtonConectar.setText("Conectar");
                c.disableButton(jButtonApagar);
                c.disableButton(jButtonEncender);
                c.enableConnectionPanel(jButtonRefresh, jComboBoxPorts);
            } catch (Exception ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            try {
                Arduino.arduinoTX(jComboBoxPorts.getSelectedItem().toString(), 9600);
                jButtonConectar.setText("Desconectar");
                c.enableButton(jButtonEncender);
                c.disableButton(jButtonApagar);
                c.disableConnectionPanel(jButtonRefresh, jComboBoxPorts);
            } catch (Exception ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonConectarActionPerformed

    private void jButtonEncenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEncenderActionPerformed

        //Se modifica la interface gráfica del botón precionado
        c.enableButton(jButtonApagar);
        c.disableButton(jButtonEncender);
        //Se envían un -1- para encender el LED
        try {
            Arduino.sendData("1");
        } catch (Exception ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonEncenderActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
        JOptionPane.showMessageDialog(null, "Dispositivo Configurado, puedes desconectarlo del pc");
        //Se modifica la interface gráfica del botón precionado
        c.enableButton(jButtonEncender);
        c.disableButton(jButtonApagar);
        //Se envía un -0- para apagar el LED
        try {
            Arduino.sendData("0");
        } catch (Exception ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonApagarActionPerformed

    private void jtfNombreMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreMascotaActionPerformed

    private void jtfNombreMascotaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreMascotaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreMascotaKeyPressed

    private void jtfNombreMascotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreMascotaKeyTyped
        // TODO add your handling code here:
        char esp = evt.getKeyChar();
        if (Character.isSpace(esp)) {
            jtfNombreMascota.setText(null);
            evt.consume();
            JOptionPane.showMessageDialog(null, "No se aceptan espacios", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jtfNombreMascotaKeyTyped

    private void jtfPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesoKeyTyped
        // TODO add your handling code here:
         char car = evt.getKeyChar();
        if (Character.isLetter(car)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo numeros", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
         char esp = evt.getKeyChar();
        if (Character.isSpace(car)) {
            jtfPeso.setText(null);
            evt.consume();
            JOptionPane.showMessageDialog(null, "No se aceptan espacios", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jtfPesoKeyTyped

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contraprueba;
    private javax.swing.JLabel idprueba;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonConectar;
    private javax.swing.JButton jButtonEncender;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JComboBox jComboBoxPorts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbtEnviar;
    private javax.swing.JComboBox<String> jcbActividad;
    private javax.swing.JComboBox<String> jcbEdad;
    private javax.swing.JComboBox<String> jcbRaza;
    private javax.swing.JComboBox<String> jcbTipoMascota;
    private javax.swing.JComboBox<String> jcenfermedad;
    private javax.swing.JLabel jlbEdad;
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
        try {
            Conexion obj = new Conexion();
            Statement sentencia = obj.getCon().createStatement();
            String sql = "select id_usuario from usuario where usuario='" + usuario + "' and password='" + contra + "';";
            ResultSet registro = sentencia.executeQuery(sql);
            while (registro.next()) {
                prueba = registro.getString(1);
            }
        } catch (Exception a) {
            a.printStackTrace();
        }
    }

    private void ObtenerRazas(String tipo) {
        jcbRaza.removeAllItems();
        jcbRaza.addItem("-Seleccione-");
        try {
            Conexion obj = new Conexion();
            Statement sentencia = obj.getCon().createStatement();
            String sql = "SELECT raza FROM tipo WHERE tipo_mascota='" + tipo + "' ORDER BY raza;";
            ResultSet registro = sentencia.executeQuery(sql);
            while (registro.next()) {
                jcbRaza.addItem(registro.getString(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showInputDialog(null, "No se recupero la consulta", "Peticion de datos", JOptionPane.QUESTION_MESSAGE);
        }
    }

    private void limpiarframe() {
        jtfNombreMascota.setText("");
        jcbTipoMascota.setSelectedItem("-Seleccione-");
        jcbRaza.setSelectedItem("-Seleccione-");
        jcbEdad.setSelectedItem("-Seleccione-");
        jtfPeso.setText("");
        jcbActividad.setSelectedItem("-Seleccione-");
        jcenfermedad.setSelectedItem("-Seleccione-");
    }

    private void procesoregistro() {
        String edadTemportal = null;
        String mascota = jtfNombreMascota.getText();
        String tipo = String.valueOf(jcbTipoMascota.getSelectedItem());
        String raza = String.valueOf(jcbRaza.getSelectedItem());
        String enfermedad = String.valueOf(jcenfermedad.getSelectedItem());
        double edad = 0;
        edadTemportal = (String.valueOf(jcbEdad.getSelectedItem()));
        if (edadTemportal.equalsIgnoreCase("menos de 6 meses")) {
            edad = 0.3;
        } else if (edadTemportal.equalsIgnoreCase("de 6 a 11 meses")) {
            edad = 0.8;
        } else {
            edad = Double.parseDouble(edadTemportal);
        }
        Double peso = Double.parseDouble(jtfPeso.getText());
        Registros r = new Registros(mascota, tipo, raza, edad, peso,
                    enfermedad, String.valueOf(jcbActividad.getSelectedItem()));
            r.registrarMascota();

        
    }
}
