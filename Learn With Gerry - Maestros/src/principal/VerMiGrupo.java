package principal;

/**
 *
 * @author Isaac
 */
public class VerMiGrupo extends javax.swing.JDialog {

    public VerMiGrupo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        split = new javax.swing.JSplitPane();
        pnlIzquierdo = new javax.swing.JPanel();
        scrollLista = new javax.swing.JScrollPane();
        lstNombres = new javax.swing.JList();
        scrollDerecho = new javax.swing.JScrollPane();
        pnlDerecho = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblNick = new javax.swing.JLabel();
        lblGrado = new javax.swing.JLabel();
        lblLogros = new javax.swing.JLabel();
        btnAlias = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setPreferredSize(new java.awt.Dimension(1200, 600));

        split.setBorder(null);
        split.setDividerLocation(260);
        split.setDividerSize(10);
        split.setContinuousLayout(true);

        pnlIzquierdo.setBackground(new java.awt.Color(41, 128, 185));
        pnlIzquierdo.setLayout(new java.awt.BorderLayout());

        lstNombres.setBackground(new java.awt.Color(41, 128, 185));
        lstNombres.setFont(new java.awt.Font("Stark", 0, 18)); // NOI18N
        lstNombres.setForeground(new java.awt.Color(255, 255, 255));
        lstNombres.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Isaac Herrera Salcedo", "Patricia Hernández Ruiz", "Gerardo Osorio ", "Mario Garrido García" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstNombres.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstNombres.setSelectionBackground(new java.awt.Color(255, 255, 255));
        lstNombres.setSelectionForeground(new java.awt.Color(102, 102, 102));
        scrollLista.setViewportView(lstNombres);

        pnlIzquierdo.add(scrollLista, java.awt.BorderLayout.CENTER);

        split.setLeftComponent(pnlIzquierdo);

        pnlDerecho.setBackground(new java.awt.Color(204, 51, 51));
        pnlDerecho.setMinimumSize(new java.awt.Dimension(800, 800));

        lblTitulo.setFont(new java.awt.Font("Fairview Small Caps", 0, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Ver mi grupo");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/kid/0.png"))); // NOI18N

        lblNick.setFont(new java.awt.Font("Aaargh", 1, 18)); // NOI18N
        lblNick.setForeground(new java.awt.Color(255, 255, 255));
        lblNick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/a.png"))); // NOI18N
        lblNick.setText("iPendejo");
        lblNick.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNick.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblGrado.setFont(new java.awt.Font("Aaargh", 1, 18)); // NOI18N
        lblGrado.setForeground(new java.awt.Color(255, 255, 255));
        lblGrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bookshelf.png"))); // NOI18N
        lblGrado.setText("Primero");
        lblGrado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblGrado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblLogros.setFont(new java.awt.Font("Patrick Hand SC", 0, 24)); // NOI18N
        lblLogros.setForeground(new java.awt.Color(255, 255, 255));
        lblLogros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/chalkboard.png"))); // NOI18N
        lblLogros.setText("80");
        lblLogros.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Logros", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Patrick Hand SC", 0, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        lblLogros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblLogros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnAlias.setFont(new java.awt.Font("Patrick Hand SC", 0, 24)); // NOI18N
        btnAlias.setForeground(new java.awt.Color(255, 255, 255));
        btnAlias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/packman.png"))); // NOI18N
        btnAlias.setText("Pantera");
        btnAlias.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Alias", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Patrick Hand SC", 0, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        btnAlias.setContentAreaFilled(false);
        btnAlias.setFocusPainted(false);
        btnAlias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAlias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAliasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDerechoLayout = new javax.swing.GroupLayout(pnlDerecho);
        pnlDerecho.setLayout(pnlDerechoLayout);
        pnlDerechoLayout.setHorizontalGroup(
            pnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDerechoLayout.createSequentialGroup()
                .addGroup(pnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDerechoLayout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDerechoLayout.createSequentialGroup()
                        .addGroup(pnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDerechoLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(lblGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNick, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDerechoLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lblLogros, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlias, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        pnlDerechoLayout.setVerticalGroup(
            pnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDerechoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDerechoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDerechoLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(pnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNick, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(pnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogros, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAlias))))
                .addContainerGap(455, Short.MAX_VALUE))
        );

        scrollDerecho.setViewportView(pnlDerecho);

        split.setRightComponent(scrollDerecho);

        getContentPane().add(split, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAliasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAliasActionPerformed

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
            java.util.logging.Logger.getLogger(VerMiGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerMiGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerMiGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerMiGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VerMiGrupo dialog = new VerMiGrupo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAlias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblGrado;
    private javax.swing.JLabel lblLogros;
    private javax.swing.JLabel lblNick;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList lstNombres;
    private javax.swing.JPanel pnlDerecho;
    private javax.swing.JPanel pnlIzquierdo;
    private javax.swing.JScrollPane scrollDerecho;
    private javax.swing.JScrollPane scrollLista;
    private javax.swing.JSplitPane split;
    // End of variables declaration//GEN-END:variables
}
