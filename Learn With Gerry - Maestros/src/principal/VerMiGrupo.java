package principal;

import bd.ConexionBD;
import clases.Perfil;
import clases.PerfilCarga;
import extras.ContenidoItem;
import extras.ItemGrupo;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import util.UtilPerfil;

/**
 *
 * @author Isaac
 */
public class VerMiGrupo extends javax.swing.JDialog {

    ArrayList<Perfil> lista;
    public VerMiGrupo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lista = new ArrayList<>();
        cargarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        split = new javax.swing.JSplitPane();
        scrollDerecho = new javax.swing.JScrollPane();
        pnlDerecho = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        scrollIzq = new javax.swing.JScrollPane();
        pnlIzquierdo = new javax.swing.JPanel();
        pnlTop = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ver mi grupo");
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setModal(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 600));
        setResizable(false);

        split.setBorder(null);
        split.setDividerLocation(260);
        split.setDividerSize(10);
        split.setContinuousLayout(true);

        pnlDerecho.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Stark", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Seleccione un elemento de la barra izquierda para comenzar");

        javax.swing.GroupLayout pnlDerechoLayout = new javax.swing.GroupLayout(pnlDerecho);
        pnlDerecho.setLayout(pnlDerechoLayout);
        pnlDerechoLayout.setHorizontalGroup(
            pnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDerechoLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(528, Short.MAX_VALUE))
        );
        pnlDerechoLayout.setVerticalGroup(
            pnlDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDerechoLayout.createSequentialGroup()
                .addContainerGap(271, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244))
        );

        scrollDerecho.setViewportView(pnlDerecho);

        split.setRightComponent(scrollDerecho);

        pnlIzquierdo.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.VerticalLayout verticalLayout1 = new org.jdesktop.swingx.VerticalLayout();
        verticalLayout1.setGap(10);
        pnlIzquierdo.setLayout(verticalLayout1);
        scrollIzq.setViewportView(pnlIzquierdo);

        split.setLeftComponent(scrollIzq);

        getContentPane().add(split, java.awt.BorderLayout.CENTER);

        pnlTop.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Stark", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(102, 102, 102));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Informe detallado");

        btnCerrar.setFont(new java.awt.Font("Odin Rounded", 0, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(102, 102, 102));
        btnCerrar.setText("X");
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 451, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addContainerGap())
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(pnlTop, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

 
    private void cargarDatos(){
        UtilPerfil.llenarRankingGrado(lista,convertirRol(PerfilCarga.getGrado()));
        ItemGrupo ig;
        for (int i = 0; i < lista.size(); i++) {
            ig = new ItemGrupo(scrollDerecho, lista.get(i).getIdPersona());
            String nombre;
            nombre= lista.get(i).getNombre()+" "+lista.get(i).getApPat()+" "+lista.get(i).getApMat();
            ig.lblNombre.setText(nombre);
            ig.pnlDerecho.btnAlias.setText(lista.get(i).getAlias());
            ig.pnlDerecho.lblGrado.setText(lista.get(i).getGrado());
            ig.pnlDerecho.lblNick.setText(lista.get(i).getUser());
            ig.pnlDerecho.lblPass.setText(lista.get(i).getPassword());
            ig.pnlDerecho.txtNombre.setText(lista.get(i).getNombre());
            ig.pnlDerecho.txtApPat.setText(lista.get(i).getApPat());
            ig.pnlDerecho.txtApMat.setText(lista.get(i).getApMat());
            ig.pnlDerecho.setBackground(lista.get(i).getColor());
            ig.pnlDerecho.avatar.setIcon(new ImageIcon(getClass().getResource("/recursos/kid/"+lista.get(i).getCodAvatar()+".png")));
            ig.setBackground(lista.get(i).getColor());
            pnlIzquierdo.add(ig);
        }
        pnlIzquierdo.repaint();
        repaint();
        pnlIzquierdo.updateUI();
    }
    
    private String convertirRol(String rol){
       if(rol.contains("primero")){
           System.out.println("1");
           return "Primero";
       }
       if(rol.contains("segundo")){
           return "Segundo";
       }
       if(rol.contains("tercero")){
           return "Tercero";
       }
       if(rol.contains("cuarto")){
           return "Cuarto";
       }
       if(rol.contains("quinto")){
           return "Quinto";
       }
       if(rol.contains("sexto")){
           return "Sexto";
       }
       return null;
    }
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
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlDerecho;
    private javax.swing.JPanel pnlIzquierdo;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JScrollPane scrollDerecho;
    private javax.swing.JScrollPane scrollIzq;
    private javax.swing.JSplitPane split;
    // End of variables declaration//GEN-END:variables
}
