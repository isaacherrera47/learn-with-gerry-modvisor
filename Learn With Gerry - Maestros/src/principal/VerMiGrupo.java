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

        javax.swing.GroupLayout pnlDerechoLayout = new javax.swing.GroupLayout(pnlDerecho);
        pnlDerecho.setLayout(pnlDerechoLayout);
        pnlDerechoLayout.setHorizontalGroup(
            pnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 911, Short.MAX_VALUE)
        );
        pnlDerechoLayout.setVerticalGroup(
            pnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        scrollDerecho.setViewportView(pnlDerecho);

        split.setRightComponent(scrollDerecho);

        getContentPane().add(split, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JList lstNombres;
    private javax.swing.JPanel pnlDerecho;
    private javax.swing.JPanel pnlIzquierdo;
    private javax.swing.JScrollPane scrollDerecho;
    private javax.swing.JScrollPane scrollLista;
    private javax.swing.JSplitPane split;
    // End of variables declaration//GEN-END:variables
}
