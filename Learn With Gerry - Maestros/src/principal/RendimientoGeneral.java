package principal;

import clases.Perfil;
import extras.PerfilR;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import util.UtilPerfil;

/**
 *
 * @author Isaac
 */
public class RendimientoGeneral extends javax.swing.JDialog {

    ArrayList<Perfil> listaTodos;

    public RendimientoGeneral(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        listaTodos = new ArrayList<>();
        llenarPanel("");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        txtBuscar = new org.jdesktop.swingx.JXTextField();
        scroll = new javax.swing.JScrollPane();
        pnlPerfiles = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(41, 128, 185));
        pnlPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblTitulo.setFont(new java.awt.Font("Stark", 0, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Rendimiento General");

        txtBuscar.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscar.setFont(new java.awt.Font("Stark", 0, 14)); // NOI18N
        txtBuscar.setPrompt("Buscar...");

        pnlPerfiles.setBackground(new java.awt.Color(41, 128, 185));
        com.xzq.osc.JocGridLayout jocGridLayout1 = new com.xzq.osc.JocGridLayout();
        jocGridLayout1.setColumns(3);
        jocGridLayout1.setHgap(5);
        jocGridLayout1.setVgap(5);
        jocGridLayout1.setRows(6);
        pnlPerfiles.setLayout(jocGridLayout1);
        scroll.setViewportView(pnlPerfiles);

        btnBuscar.setFont(new java.awt.Font("Stark", 0, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Stark", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("X");
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setFocusPainted(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                        .addComponent(btnSalir)))
                .addContainerGap())
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pnlPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (txtBuscar.getText().trim().length() >=4) {
            vaciarPaneles();
            llenarPanel(txtBuscar.getText());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void llenarPanel(String filtro) {
        UtilPerfil.llenarRankingTodos(listaTodos, filtro);
        PerfilR pr;
        for (int i = 0; i < listaTodos.size(); i++) {
            pr = new PerfilR();
            String nombre = listaTodos.get(i).getNombre() + " " + listaTodos.get(i).getApPat() + " " + listaTodos.get(i).getApMat();
            pr.lblNombre.setText(nombre);
            pr.btnAlias.setText(listaTodos.get(i).getAlias());
            pr.lblGrado.setText(listaTodos.get(i).getGrado());
            pr.lblNick.setText(listaTodos.get(i).getUser());
            pr.lblNivel.setText(String.valueOf(listaTodos.get(i).getNivel()));
            pr.avatar.setIcon(new ImageIcon(getClass().getResource("/recursos/kid/" + listaTodos.get(i).getCodAvatar() + ".png")));
            pr.setBackground(listaTodos.get(i).getColor());
            pnlPerfiles.add(pr);
        }
    }

    private void vaciarPaneles() {
        pnlPerfiles.removeAll();
        listaTodos.clear();
        repaint();
        pnlPerfiles.repaint();
        pnlPerfiles.updateUI();
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
            java.util.logging.Logger.getLogger(RendimientoGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RendimientoGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RendimientoGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RendimientoGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RendimientoGeneral dialog = new RendimientoGeneral(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlPerfiles;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JScrollPane scroll;
    private org.jdesktop.swingx.JXTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
