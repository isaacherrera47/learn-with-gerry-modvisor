package principal;

import clases.PerfilCarga;
import javax.swing.JButton;
import util.ColorFondo;
import util.UtilPerfil;

/**
 *
 * @author Isaac
 */
public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgOpciones = new javax.swing.JDialog();
        pnlConfiguracion = new javax.swing.JPanel();
        btnColor1 = new javax.swing.JButton();
        btnColor3 = new javax.swing.JButton();
        btnColor5 = new javax.swing.JButton();
        btnColor6 = new javax.swing.JButton();
        btnColor4 = new javax.swing.JButton();
        btnColor2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSalirOpciones = new javax.swing.JButton();
        pnlPrincipal = new javax.swing.JPanel();
        btnVerGrupo = new javax.swing.JButton();
        btnRendimiento = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnOpciones = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        dlgOpciones.setMinimumSize(new java.awt.Dimension(840, 370));
        dlgOpciones.setModal(true);
        dlgOpciones.setUndecorated(true);
        dlgOpciones.setResizable(false);
        dlgOpciones.setLocationRelativeTo(null);

        pnlConfiguracion.setBackground(new java.awt.Color(53, 53, 227));

        btnColor1.setBackground(new java.awt.Color(204, 51, 51));
        btnColor1.setContentAreaFilled(false);
        btnColor1.setFocusPainted(false);
        btnColor1.setOpaque(true);
        btnColor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColor1ActionPerformed(evt);
            }
        });

        btnColor3.setBackground(new java.awt.Color(0, 153, 153));
        btnColor3.setContentAreaFilled(false);
        btnColor3.setFocusPainted(false);
        btnColor3.setOpaque(true);
        btnColor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColor3ActionPerformed(evt);
            }
        });

        btnColor5.setBackground(new java.awt.Color(102, 102, 153));
        btnColor5.setContentAreaFilled(false);
        btnColor5.setFocusPainted(false);
        btnColor5.setOpaque(true);
        btnColor5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColor5ActionPerformed(evt);
            }
        });

        btnColor6.setBackground(new java.awt.Color(41, 128, 185));
        btnColor6.setContentAreaFilled(false);
        btnColor6.setFocusPainted(false);
        btnColor6.setOpaque(true);
        btnColor6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColor6ActionPerformed(evt);
            }
        });

        btnColor4.setBackground(new java.awt.Color(51, 153, 51));
        btnColor4.setContentAreaFilled(false);
        btnColor4.setFocusPainted(false);
        btnColor4.setOpaque(true);
        btnColor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColor4ActionPerformed(evt);
            }
        });

        btnColor2.setBackground(new java.awt.Color(255, 102, 102));
        btnColor2.setContentAreaFilled(false);
        btnColor2.setFocusPainted(false);
        btnColor2.setOpaque(true);
        btnColor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColor2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Stark", 0, 90)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("COLOR");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        btnSalirOpciones.setFont(new java.awt.Font("Stark", 0, 14)); // NOI18N
        btnSalirOpciones.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirOpciones.setText("X");
        btnSalirOpciones.setBorderPainted(false);
        btnSalirOpciones.setContentAreaFilled(false);
        btnSalirOpciones.setFocusPainted(false);
        btnSalirOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirOpcionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConfiguracionLayout = new javax.swing.GroupLayout(pnlConfiguracion);
        pnlConfiguracion.setLayout(pnlConfiguracionLayout);
        pnlConfiguracionLayout.setHorizontalGroup(
            pnlConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfiguracionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConfiguracionLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(223, 223, 223)
                        .addComponent(btnSalirOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlConfiguracionLayout.createSequentialGroup()
                        .addGroup(pnlConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnColor2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(pnlConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnColor3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnColor4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(pnlConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnColor5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnColor6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        pnlConfiguracionLayout.setVerticalGroup(
            pnlConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfiguracionLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(pnlConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConfiguracionLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSalirOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnlConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConfiguracionLayout.createSequentialGroup()
                        .addComponent(btnColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnColor2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlConfiguracionLayout.createSequentialGroup()
                        .addComponent(btnColor3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnColor4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlConfiguracionLayout.createSequentialGroup()
                        .addComponent(btnColor5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnColor6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        dlgOpciones.getContentPane().add(pnlConfiguracion, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Learn with Gerry - Superusuario");
        setMinimumSize(new java.awt.Dimension(800, 350));
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(41, 128, 185));

        btnVerGrupo.setFont(new java.awt.Font("Fairview Small Caps", 0, 24)); // NOI18N
        btnVerGrupo.setForeground(new java.awt.Color(255, 255, 255));
        btnVerGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/booklet.png"))); // NOI18N
        btnVerGrupo.setText("Ver mi grupo");
        btnVerGrupo.setContentAreaFilled(false);
        btnVerGrupo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerGrupo.setFocusPainted(false);
        btnVerGrupo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVerGrupo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnVerGrupo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVerGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerGrupoActionPerformed(evt);
            }
        });

        btnRendimiento.setFont(new java.awt.Font("Fairview Small Caps", 0, 24)); // NOI18N
        btnRendimiento.setForeground(new java.awt.Color(255, 255, 255));
        btnRendimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/pie-chart.png"))); // NOI18N
        btnRendimiento.setText("Rendimiento General");
        btnRendimiento.setContentAreaFilled(false);
        btnRendimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRendimiento.setFocusPainted(false);
        btnRendimiento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRendimiento.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRendimiento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRendimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRendimientoActionPerformed(evt);
            }
        });

        btnPerfil.setFont(new java.awt.Font("Fairview Small Caps", 0, 24)); // NOI18N
        btnPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/profle.png"))); // NOI18N
        btnPerfil.setText("Perfil");
        btnPerfil.setContentAreaFilled(false);
        btnPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPerfil.setFocusPainted(false);
        btnPerfil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPerfil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        btnOpciones.setFont(new java.awt.Font("Fairview Small Caps", 0, 24)); // NOI18N
        btnOpciones.setForeground(new java.awt.Color(255, 255, 255));
        btnOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/tools.png"))); // NOI18N
        btnOpciones.setText("Opciones");
        btnOpciones.setContentAreaFilled(false);
        btnOpciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpciones.setFocusPainted(false);
        btnOpciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnOpciones.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnOpciones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionesActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Poetsen One", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/power2.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setFocusPainted(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRendimiento, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerGrupo, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPerfil)
                    .addComponent(btnOpciones))
                .addGap(57, 57, 57)
                .addComponent(btnSalir)
                .addContainerGap())
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerGrupo)
                    .addComponent(btnOpciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(btnPerfil)
                        .addGap(33, 33, 33))
                    .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                            .addComponent(btnRendimiento)
                            .addGap(33, 33, 33))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                            .addComponent(btnSalir)
                            .addContainerGap()))))
        );

        getContentPane().add(pnlPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionesActionPerformed
       dlgOpciones.setVisible(true);
    }//GEN-LAST:event_btnOpcionesActionPerformed

    private void btnColor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColor4ActionPerformed
        cambiarColorFondo(btnColor4);
    }//GEN-LAST:event_btnColor4ActionPerformed

    private void btnColor5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColor5ActionPerformed
        cambiarColorFondo(btnColor5);
    }//GEN-LAST:event_btnColor5ActionPerformed

    private void btnColor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColor1ActionPerformed
        cambiarColorFondo(btnColor1);
    }//GEN-LAST:event_btnColor1ActionPerformed

    private void btnColor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColor2ActionPerformed
        cambiarColorFondo(btnColor2);
    }//GEN-LAST:event_btnColor2ActionPerformed

    private void btnColor6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColor6ActionPerformed
        cambiarColorFondo(btnColor6);
    }//GEN-LAST:event_btnColor6ActionPerformed

    private void btnColor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColor3ActionPerformed
        cambiarColorFondo(btnColor3);
    }//GEN-LAST:event_btnColor3ActionPerformed

    private void btnSalirOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirOpcionesActionPerformed
       dlgOpciones.setVisible(false);
    }//GEN-LAST:event_btnSalirOpcionesActionPerformed

    private void btnRendimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRendimientoActionPerformed
        new RendimientoGeneral(this, true).setVisible(true);
    }//GEN-LAST:event_btnRendimientoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        new IniciarSesion().setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        new DatosJugador(this, true).setVisible(true);
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnVerGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerGrupoActionPerformed
        new VerMiGrupo(this, true).setVisible(true);
    }//GEN-LAST:event_btnVerGrupoActionPerformed

    private void cambiarColorFondo(JButton boton){
        dlgOpciones.setVisible(false);
        pnlPrincipal.setBackground(boton.getBackground());
        UtilPerfil.almacenarColorPerfil(PerfilCarga.getNick(), ColorFondo.obtenerIdPorColor(boton.getBackground()));
    }
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnColor1;
    private javax.swing.JButton btnColor2;
    private javax.swing.JButton btnColor3;
    private javax.swing.JButton btnColor4;
    private javax.swing.JButton btnColor5;
    private javax.swing.JButton btnColor6;
    private javax.swing.JButton btnOpciones;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnRendimiento;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalirOpciones;
    private javax.swing.JButton btnVerGrupo;
    private javax.swing.JDialog dlgOpciones;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnlConfiguracion;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
