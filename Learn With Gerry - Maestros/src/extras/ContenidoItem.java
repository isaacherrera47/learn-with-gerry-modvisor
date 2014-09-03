

package extras;

import bd.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Isaac
 */
public class ContenidoItem extends javax.swing.JPanel {

    /**
     * Creates new form ContenidoItem
     */
    int idPersona;
    ItemGrupo parent;
    String nombre;
    public ContenidoItem(int idPersona, ItemGrupo parent) {
        initComponents();
        this.idPersona = idPersona;
        this.parent = parent;        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAlias = new javax.swing.JButton();
        lblPass = new javax.swing.JLabel();
        lblGrado = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        avatar = new jcMousePanel.jcMousePanel();
        txtApPat = new javax.swing.JTextField();
        txtApMat = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblNick = new javax.swing.JLabel();
        btnEditar = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(102, 102, 153));
        setMinimumSize(new java.awt.Dimension(800, 420));
        setLayout(null);

        btnAlias.setFont(new java.awt.Font("Patrick Hand SC", 0, 24)); // NOI18N
        btnAlias.setForeground(new java.awt.Color(255, 255, 255));
        btnAlias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/packman.png"))); // NOI18N
        btnAlias.setText("Pantera");
        btnAlias.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Alias", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Patrick Hand SC", 0, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        btnAlias.setContentAreaFilled(false);
        btnAlias.setFocusPainted(false);
        btnAlias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(btnAlias);
        btnAlias.setBounds(100, 130, 150, 101);

        lblPass.setFont(new java.awt.Font("Are You Freakin' Serious ", 1, 18)); // NOI18N
        lblPass.setForeground(new java.awt.Color(255, 255, 255));
        lblPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/kid/unlocked.png"))); // NOI18N
        lblPass.setText("Perro");
        lblPass.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPass.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(lblPass);
        lblPass.setBounds(230, 30, 130, 90);

        lblGrado.setFont(new java.awt.Font("Are You Freakin' Serious ", 1, 18)); // NOI18N
        lblGrado.setForeground(new java.awt.Color(255, 255, 255));
        lblGrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bookshelf.png"))); // NOI18N
        lblGrado.setText("Primero");
        lblGrado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblGrado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(lblGrado);
        lblGrado.setBounds(10, 30, 127, 94);

        lblTitulo.setFont(new java.awt.Font("Fairview Small Caps", 0, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Ver mi grupo");
        add(lblTitulo);
        lblTitulo.setBounds(470, 10, 174, 42);

        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/kid/0.png"))); // NOI18N
        avatar.setVisibleLogo(false);

        javax.swing.GroupLayout avatarLayout = new javax.swing.GroupLayout(avatar);
        avatar.setLayout(avatarLayout);
        avatarLayout.setHorizontalGroup(
            avatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        avatarLayout.setVerticalGroup(
            avatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        add(avatar);
        avatar.setBounds(400, 60, 310, 280);

        txtApPat.setEditable(false);
        txtApPat.setFont(new java.awt.Font("Odin Rounded", 0, 14)); // NOI18N
        txtApPat.setForeground(new java.awt.Color(102, 102, 102));
        txtApPat.setText("Herrera");
        txtApPat.setCaretColor(new java.awt.Color(153, 153, 153));
        add(txtApPat);
        txtApPat.setBounds(100, 290, 210, 30);

        txtApMat.setEditable(false);
        txtApMat.setFont(new java.awt.Font("Odin Rounded", 0, 14)); // NOI18N
        txtApMat.setForeground(new java.awt.Color(102, 102, 102));
        txtApMat.setText("Salcedo");
        txtApMat.setCaretColor(new java.awt.Color(153, 153, 153));
        add(txtApMat);
        txtApMat.setBounds(100, 330, 210, 30);

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Odin Rounded", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtNombre.setText("Isaac Edmundo");
        txtNombre.setCaretColor(new java.awt.Color(153, 153, 153));
        add(txtNombre);
        txtNombre.setBounds(100, 250, 210, 30);

        lblNick.setFont(new java.awt.Font("Are You Freakin' Serious ", 1, 18)); // NOI18N
        lblNick.setForeground(new java.awt.Color(255, 255, 255));
        lblNick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/a.png"))); // NOI18N
        lblNick.setText("iPendejo");
        lblNick.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNick.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(lblNick);
        lblNick.setBounds(120, 30, 120, 90);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/pencil.png"))); // NOI18N
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        add(btnEditar);
        btnEditar.setBounds(720, 10, 70, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(btnEditar.isSelected()){
            btnEditar.setIcon(new ImageIcon(getClass().getResource("/recursos/menu.png")));
            estadoComponentes(true);
        } else {
            estadoComponentes(false);
            btnEditar.setIcon(new ImageIcon(getClass().getResource("/recursos/pencil.png")));
            editarPersona();
            parent.lblNombre.setText(nombre);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void editarPersona(){
        try {
            ConexionBD.abrirConexion();
            String sql;
            sql="UPDATE persona set nombre=? , appaterno = ? , apmaterno = ? where id = ?;";
            PreparedStatement ps= ConexionBD.con.prepareStatement(sql);
            ps.setString(1, txtNombre.getText());
            ps.setString(2, txtApPat.getText());
            ps.setString(3, txtApMat.getText());
            ps.setInt(4, idPersona);
            ps.executeUpdate();
            nombre= txtNombre.getText()+" "+txtApPat.getText()+" "+txtApMat.getText();
        } catch (SQLException ex) {
            Logger.getLogger(ContenidoItem.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexionBD.cerrarConexion();
        }
    }
    
    private void estadoComponentes(boolean estado){
        txtApMat.setEditable(estado);
        txtApPat.setEditable(estado);
        txtNombre.setEditable(estado);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public jcMousePanel.jcMousePanel avatar;
    public javax.swing.JButton btnAlias;
    private javax.swing.JToggleButton btnEditar;
    public javax.swing.JLabel lblGrado;
    public javax.swing.JLabel lblNick;
    public javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblTitulo;
    public javax.swing.JTextField txtApMat;
    public javax.swing.JTextField txtApPat;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
