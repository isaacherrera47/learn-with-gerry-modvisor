package principal;

import bd.ConexionBD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import util.ColorFondo;
import util.UtilBD;
import util.UtilPerfil;

/**
 *
 * @author Isaac
 */
public class IniciarSesion extends javax.swing.JFrame {

    UtilBD herrBD;

    public IniciarSesion() {
        initComponents();
        herrBD = new UtilBD();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgRegistro = new javax.swing.JDialog();
        pnlRegistro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new org.jdesktop.swingx.JXTextField();
        txtApPat = new org.jdesktop.swingx.JXTextField();
        txtRespuesta2 = new org.jdesktop.swingx.JXTextField();
        cbxPregunta1 = new javax.swing.JComboBox();
        cbxPregunta2 = new javax.swing.JComboBox();
        txtNombreU = new org.jdesktop.swingx.JXTextField();
        txtPass1 = new org.edisoncor.gui.passwordField.PasswordFieldRectBackground();
        txtPass = new org.edisoncor.gui.passwordField.PasswordFieldRectBackground();
        txtApMat = new org.jdesktop.swingx.JXTextField();
        txtRespuesta1 = new org.jdesktop.swingx.JXTextField();
        btnSalirRegistro = new javax.swing.JButton();
        btnAceptarRegistro = new javax.swing.JButton();
        btnCancelarRegistro = new javax.swing.JButton();
        cbxGrado = new javax.swing.JComboBox();
        dlgRecuperaCuenta = new javax.swing.JDialog();
        pnlRecuperar = new javax.swing.JPanel();
        lblTituloRec = new javax.swing.JLabel();
        txtUsRec = new org.jdesktop.swingx.JXTextField();
        txtRespRec = new org.jdesktop.swingx.JXTextField();
        cbxPreguntaRec = new javax.swing.JComboBox();
        btnVerRec = new javax.swing.JButton();
        lblResultadoRec = new org.jdesktop.swingx.JXLabel();
        btnSalirRec = new javax.swing.JButton();
        notif = new javax.swing.JLabel();
        pnlPrincipal = new javax.swing.JPanel();
        txtContraseña = new org.edisoncor.gui.passwordField.PasswordFieldRectBackground();
        txtNombreUsuario = new org.edisoncor.gui.textField.TextFieldRectBackground();
        btnIniciarSesion = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnRecuperarCuenta = new javax.swing.JButton();
        btnNuevoUsuario = new javax.swing.JButton();

        dlgRegistro.setLocationByPlatform(true);
        dlgRegistro.setMinimumSize(new java.awt.Dimension(620, 540));
        dlgRegistro.setModal(true);
        dlgRegistro.setUndecorated(true);
        dlgRegistro.setResizable(false);

        pnlRegistro.setBackground(new java.awt.Color(41, 128, 185));
        pnlRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pnlRegistro.setMinimumSize(new java.awt.Dimension(500, 500));
        pnlRegistro.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Stark", 0, 100)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro");
        pnlRegistro.add(jLabel1);
        jLabel1.setBounds(10, 11, 369, 128);

        txtNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtNombre.setCaretColor(new java.awt.Color(102, 102, 102));
        txtNombre.setFont(new java.awt.Font("Stark", 0, 14)); // NOI18N
        txtNombre.setPrompt("Nombre");
        txtNombre.setPromptForeground(new java.awt.Color(204, 204, 204));
        pnlRegistro.add(txtNombre);
        txtNombre.setBounds(10, 157, 270, 40);

        txtApPat.setForeground(new java.awt.Color(102, 102, 102));
        txtApPat.setCaretColor(new java.awt.Color(102, 102, 102));
        txtApPat.setFont(new java.awt.Font("Stark", 0, 14)); // NOI18N
        txtApPat.setPrompt("Apellido Paterno");
        txtApPat.setPromptForeground(new java.awt.Color(204, 204, 204));
        pnlRegistro.add(txtApPat);
        txtApPat.setBounds(10, 210, 270, 40);

        txtRespuesta2.setForeground(new java.awt.Color(102, 102, 102));
        txtRespuesta2.setCaretColor(new java.awt.Color(102, 102, 102));
        txtRespuesta2.setFont(new java.awt.Font("Stark", 0, 14)); // NOI18N
        txtRespuesta2.setPrompt("Respuesta 2");
        txtRespuesta2.setPromptForeground(new java.awt.Color(204, 204, 204));
        pnlRegistro.add(txtRespuesta2);
        txtRespuesta2.setBounds(300, 380, 270, 50);

        cbxPregunta1.setFont(new java.awt.Font("Stark", 0, 14)); // NOI18N
        cbxPregunta1.setForeground(new java.awt.Color(102, 102, 102));
        cbxPregunta1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pregunta secreta 1", "¿Cuál es tu héroe favorito?", "¿Cúal es el nombre de tu mascota?", "¿Cuál es tu color favorito?", "¿Cuál es tu apodo de la infancia?", "¿Cuál es tu comida favorita?" }));
        cbxPregunta1.setBorder(null);
        pnlRegistro.add(cbxPregunta1);
        cbxPregunta1.setBounds(10, 320, 270, 50);

        cbxPregunta2.setFont(new java.awt.Font("Stark", 0, 14)); // NOI18N
        cbxPregunta2.setForeground(new java.awt.Color(102, 102, 102));
        cbxPregunta2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pregunta secreta 2", "¿Cuál es tu héroe favorito?", "¿Cúal es el nombre de tu mascota?", "¿Cuál es tu color favorito?", "¿Cuál es tu apodo de la infancia?", "¿Cuál es tu comida favorita?" }));
        cbxPregunta2.setBorder(null);
        pnlRegistro.add(cbxPregunta2);
        cbxPregunta2.setBounds(10, 380, 270, 50);

        txtNombreU.setForeground(new java.awt.Color(102, 102, 102));
        txtNombreU.setCaretColor(new java.awt.Color(102, 102, 102));
        txtNombreU.setFont(new java.awt.Font("Stark", 0, 14)); // NOI18N
        txtNombreU.setPrompt("Nombre Usuario");
        txtNombreU.setPromptForeground(new java.awt.Color(204, 204, 204));
        txtNombreU.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreUFocusLost(evt);
            }
        });
        pnlRegistro.add(txtNombreU);
        txtNombreU.setBounds(300, 160, 270, 40);

        txtPass1.setForeground(new java.awt.Color(102, 102, 102));
        txtPass1.setCaretColor(new java.awt.Color(153, 153, 153));
        txtPass1.setColorDeBorde(new java.awt.Color(255, 255, 255));
        txtPass1.setColorDeTextoBackground(new java.awt.Color(204, 204, 204));
        txtPass1.setDescripcion("Confirma Contraseña");
        txtPass1.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtPass1.setEchoChar('*');
        txtPass1.setFont(new java.awt.Font("Stark", 0, 14)); // NOI18N
        pnlRegistro.add(txtPass1);
        txtPass1.setBounds(300, 260, 270, 40);

        txtPass.setForeground(new java.awt.Color(102, 102, 102));
        txtPass.setCaretColor(new java.awt.Color(153, 153, 153));
        txtPass.setColorDeBorde(new java.awt.Color(255, 255, 255));
        txtPass.setColorDeTextoBackground(new java.awt.Color(204, 204, 204));
        txtPass.setDescripcion("Contraseña");
        txtPass.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtPass.setEchoChar('*');
        txtPass.setFont(new java.awt.Font("Stark", 0, 14)); // NOI18N
        pnlRegistro.add(txtPass);
        txtPass.setBounds(300, 210, 270, 40);

        txtApMat.setForeground(new java.awt.Color(102, 102, 102));
        txtApMat.setCaretColor(new java.awt.Color(102, 102, 102));
        txtApMat.setFont(new java.awt.Font("Stark", 0, 14)); // NOI18N
        txtApMat.setPrompt("Apellido Materno");
        txtApMat.setPromptForeground(new java.awt.Color(204, 204, 204));
        pnlRegistro.add(txtApMat);
        txtApMat.setBounds(10, 260, 270, 40);

        txtRespuesta1.setForeground(new java.awt.Color(102, 102, 102));
        txtRespuesta1.setCaretColor(new java.awt.Color(102, 102, 102));
        txtRespuesta1.setFont(new java.awt.Font("Stark", 0, 14)); // NOI18N
        txtRespuesta1.setPrompt("Respuesta 1");
        txtRespuesta1.setPromptForeground(new java.awt.Color(204, 204, 204));
        pnlRegistro.add(txtRespuesta1);
        txtRespuesta1.setBounds(300, 320, 270, 50);

        btnSalirRegistro.setFont(new java.awt.Font("Stark", 0, 18)); // NOI18N
        btnSalirRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirRegistro.setText("X");
        btnSalirRegistro.setBorderPainted(false);
        btnSalirRegistro.setContentAreaFilled(false);
        btnSalirRegistro.setFocusPainted(false);
        btnSalirRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirRegistroActionPerformed(evt);
            }
        });
        pnlRegistro.add(btnSalirRegistro);
        btnSalirRegistro.setBounds(560, 10, 50, 40);

        btnAceptarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/agregar.png"))); // NOI18N
        btnAceptarRegistro.setBorderPainted(false);
        btnAceptarRegistro.setContentAreaFilled(false);
        btnAceptarRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptarRegistro.setFocusPainted(false);
        btnAceptarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarRegistroActionPerformed(evt);
            }
        });
        pnlRegistro.add(btnAceptarRegistro);
        btnAceptarRegistro.setBounds(490, 450, 60, 60);

        btnCancelarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cancelar.png"))); // NOI18N
        btnCancelarRegistro.setBorderPainted(false);
        btnCancelarRegistro.setContentAreaFilled(false);
        btnCancelarRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarRegistro.setFocusPainted(false);
        btnCancelarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRegistroActionPerformed(evt);
            }
        });
        pnlRegistro.add(btnCancelarRegistro);
        btnCancelarRegistro.setBounds(420, 450, 60, 60);

        cbxGrado.setFont(new java.awt.Font("Stark", 0, 14)); // NOI18N
        cbxGrado.setForeground(new java.awt.Color(102, 102, 102));
        cbxGrado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Soy visor de...", "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto" }));
        cbxGrado.setBorder(null);
        pnlRegistro.add(cbxGrado);
        cbxGrado.setBounds(10, 440, 270, 50);

        dlgRegistro.getContentPane().add(pnlRegistro, java.awt.BorderLayout.CENTER);

        dlgRecuperaCuenta.setLocationByPlatform(true);
        dlgRecuperaCuenta.setMinimumSize(new java.awt.Dimension(800, 415));
        dlgRecuperaCuenta.setModal(true);
        dlgRecuperaCuenta.setUndecorated(true);
        dlgRecuperaCuenta.setResizable(false);

        pnlRecuperar.setBackground(new java.awt.Color(41, 128, 185));
        pnlRecuperar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblTituloRec.setFont(new java.awt.Font("Stark", 0, 80)); // NOI18N
        lblTituloRec.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloRec.setText("Recuperar cuenta");

        txtUsRec.setForeground(new java.awt.Color(102, 102, 102));
        txtUsRec.setFont(new java.awt.Font("Stark", 0, 14)); // NOI18N
        txtUsRec.setPrompt("Nombre de usuario");
        txtUsRec.setPromptForeground(new java.awt.Color(153, 153, 153));

        txtRespRec.setForeground(new java.awt.Color(102, 102, 102));
        txtRespRec.setFont(new java.awt.Font("Stark", 0, 14)); // NOI18N
        txtRespRec.setPrompt("Respuesta secreta");
        txtRespRec.setPromptForeground(new java.awt.Color(153, 153, 153));

        cbxPreguntaRec.setFont(new java.awt.Font("Stark", 0, 14)); // NOI18N
        cbxPreguntaRec.setForeground(new java.awt.Color(102, 102, 102));
        cbxPreguntaRec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona una", "¿Cuál es tu héroe favorito?", "¿Cúal es el nombre de tu mascota?", "¿Cuál es tu color favorito?", "¿Cuál es tu apodo de la infancia?", "¿Cuál es tu comida favorita?" }));
        cbxPreguntaRec.setBorder(null);

        btnVerRec.setFont(new java.awt.Font("Stark", 0, 14)); // NOI18N
        btnVerRec.setForeground(new java.awt.Color(255, 255, 255));
        btnVerRec.setText("Verificar");
        btnVerRec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnVerRec.setContentAreaFilled(false);
        btnVerRec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerRecActionPerformed(evt);
            }
        });

        lblResultadoRec.setForeground(new java.awt.Color(255, 255, 255));
        lblResultadoRec.setFont(new java.awt.Font("Stark", 0, 30)); // NOI18N
        lblResultadoRec.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblResultadoRec.setLineWrap(true);

        btnSalirRec.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalirRec.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirRec.setText("X");
        btnSalirRec.setBorderPainted(false);
        btnSalirRec.setContentAreaFilled(false);
        btnSalirRec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalirRec.setFocusPainted(false);
        btnSalirRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirRecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRecuperarLayout = new javax.swing.GroupLayout(pnlRecuperar);
        pnlRecuperar.setLayout(pnlRecuperarLayout);
        pnlRecuperarLayout.setHorizontalGroup(
            pnlRecuperarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRecuperarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRecuperarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRecuperarLayout.createSequentialGroup()
                        .addComponent(lblTituloRec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalirRec)
                        .addContainerGap())
                    .addGroup(pnlRecuperarLayout.createSequentialGroup()
                        .addComponent(cbxPreguntaRec, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRespRec, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btnVerRec, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 63, Short.MAX_VALUE))))
            .addGroup(pnlRecuperarLayout.createSequentialGroup()
                .addGroup(pnlRecuperarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRecuperarLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(txtUsRec, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRecuperarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblResultadoRec, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlRecuperarLayout.setVerticalGroup(
            pnlRecuperarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRecuperarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRecuperarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloRec, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalirRec))
                .addGap(29, 29, 29)
                .addComponent(txtUsRec, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlRecuperarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRespRec, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerRec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxPreguntaRec, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(lblResultadoRec, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        dlgRecuperaCuenta.getContentPane().add(pnlRecuperar, java.awt.BorderLayout.CENTER);

        notif.setFont(new java.awt.Font("Stark", 0, 12)); // NOI18N
        notif.setForeground(new java.awt.Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar sesión - Modulo Tutor");
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(41, 128, 185));

        txtContraseña.setForeground(new java.awt.Color(102, 102, 102));
        txtContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContraseña.setColorDeBorde(new java.awt.Color(255, 255, 255));
        txtContraseña.setDescripcion("●●●●●●●●●");
        txtContraseña.setEchoChar('●');
        txtContraseña.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        txtNombreUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtNombreUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreUsuario.setCaretColor(new java.awt.Color(102, 102, 102));
        txtNombreUsuario.setColorDeBorde(new java.awt.Color(255, 255, 255));
        txtNombreUsuario.setDescripcion("Nombre de usuario");
        txtNombreUsuario.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtNombreUsuario.setFont(new java.awt.Font("Stark", 1, 14)); // NOI18N

        btnIniciarSesion.setBackground(new java.awt.Color(0, 153, 153));
        btnIniciarSesion.setFont(new java.awt.Font("Odin Rounded", 0, 18)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("Iniciar");
        btnIniciarSesion.setContentAreaFilled(false);
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.setFocusPainted(false);
        btnIniciarSesion.setOpaque(true);
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Stark", 0, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/home.png"))); // NOI18N
        lblTitulo.setText("Inicia sesión para acceder a tu cuenta");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTitulo.setIconTextGap(40);
        lblTitulo.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        btnRecuperarCuenta.setFont(new java.awt.Font("Stark", 0, 14)); // NOI18N
        btnRecuperarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnRecuperarCuenta.setText("Olvidé mi contraseña");
        btnRecuperarCuenta.setBorderPainted(false);
        btnRecuperarCuenta.setContentAreaFilled(false);
        btnRecuperarCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecuperarCuenta.setFocusPainted(false);
        btnRecuperarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarCuentaActionPerformed(evt);
            }
        });

        btnNuevoUsuario.setFont(new java.awt.Font("Stark", 0, 14)); // NOI18N
        btnNuevoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoUsuario.setText("Crear una cuenta nueva");
        btnNuevoUsuario.setBorderPainted(false);
        btnNuevoUsuario.setContentAreaFilled(false);
        btnNuevoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoUsuario.setFocusPainted(false);
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
                        .addGap(270, 270, 270))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))))
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(btnRecuperarCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(btnNuevoUsuario)
                .addGap(195, 195, 195))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRecuperarCuenta)
                    .addComponent(btnNuevoUsuario))
                .addGap(100, 100, 100))
        );

        getContentPane().add(pnlPrincipal, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirRegistroActionPerformed
        dlgRegistro.setVisible(false);
    }//GEN-LAST:event_btnSalirRegistroActionPerformed

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed
        dlgRegistro.setVisible(true);
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    private void btnAceptarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarRegistroActionPerformed
        if (comprobarCampos()) {
            if (herrBD.llenarPerfil(txtNombreU.getText(), String.valueOf(txtPass.getPassword()), cbxGrado.getSelectedIndex() *10, txtNombre.getText(), txtApPat.getText(), txtApMat.getText()) == 1) {
                herrBD.llenarPreguntasUsuario(txtNombreU.getText(), cbxPregunta1.getSelectedIndex(), txtRespuesta1.getText());
                herrBD.llenarPreguntasUsuario(txtNombreU.getText(), cbxPregunta2.getSelectedIndex(), txtRespuesta2.getText());
                borrarCampos();
                dlgRegistro.setVisible(false);
                notif.setText("Registro exitoso");
                UtilPerfil.mandarNotificacion(ColorFondo.MENSAJE_BIEN, btnIniciarSesion, notif);
            }
        } else {
            notif.setText("Hubo un error, revisa tus datos");
            UtilPerfil.mandarNotificacion(ColorFondo.MENSAJE_ERROR, btnCancelarRegistro, notif);
        }
    }//GEN-LAST:event_btnAceptarRegistroActionPerformed

    private void btnCancelarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRegistroActionPerformed
        borrarCampos();
    }//GEN-LAST:event_btnCancelarRegistroActionPerformed

    private void txtNombreUFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreUFocusLost
        if (herrBD.consultaExisteUsuario(txtNombreU.getText())) {
            notif.setText("Nombre de usuario no disponible");
            UtilPerfil.mandarNotificacion(ColorFondo.MENSAJE_ERROR, txtNombreU, notif);
        } else {
            notif.setText("Nombre de usuario disponible");
            UtilPerfil.mandarNotificacion(ColorFondo.MENSAJE_BIEN, txtNombreU, notif);
        }
    }//GEN-LAST:event_txtNombreUFocusLost

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        if (herrBD.cargarPerfil(txtNombreUsuario.getText(), String.valueOf(txtContraseña.getPassword()))) {
            this.dispose();
            new MenuPrincipal().setVisible(true);
        } else{
            notif.setText("Hubo un error en el inicio, revisa tus datos");
            UtilPerfil.mandarNotificacion(ColorFondo.MENSAJE_ERROR, txtNombreUsuario, notif);
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnVerRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRecActionPerformed
        preguntaUsuario();
    }//GEN-LAST:event_btnVerRecActionPerformed

    private void btnSalirRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirRecActionPerformed
        dlgRecuperaCuenta.setVisible(false);
        borraCamposRec();
    }//GEN-LAST:event_btnSalirRecActionPerformed

    private void btnRecuperarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarCuentaActionPerformed
        dlgRecuperaCuenta.setVisible(true);
    }//GEN-LAST:event_btnRecuperarCuentaActionPerformed

    private boolean comprobarCampos() {
        if (txtNombre.getText().trim().length() == 0) {
            txtNombre.grabFocus();
            return false;
        }
        if (txtApPat.getText().trim().length() == 0) {
            txtApPat.grabFocus();
            return false;
        }
        if (txtApMat.getText().trim().length() == 0) {
            txtApMat.grabFocus();
            return false;
        }
        if (txtNombreU.getText().trim().length() == 0) {
            txtNombreU.grabFocus();
            return false;
        }
        if (txtPass.getPassword().length == 0) {
            txtPass.grabFocus();
            return false;
        }
        if (txtPass.getPassword().length != txtPass1.getPassword().length) {
            txtPass.grabFocus();
            return false;
        }
        if (!Arrays.equals(txtPass.getPassword(), txtPass1.getPassword())) {
            txtPass.grabFocus();
            return false;
        }
        if (cbxPregunta1.getSelectedIndex() == 0) {
            cbxPregunta1.grabFocus();
            return false;
        }
        if (cbxPregunta2.getSelectedIndex() == 0) {
            cbxPregunta2.grabFocus();
            return false;
        }
        if (txtRespuesta1.getText().trim().length() == 0) {
            txtRespuesta1.grabFocus();
            return false;
        }
        if (txtRespuesta2.getText().trim().length() == 0) {
            txtRespuesta2.grabFocus();
            return false;
        }
        if (cbxGrado.getSelectedIndex() == 0) {
            cbxGrado.grabFocus();
            return false;
        }
        if (cbxPregunta1.getSelectedIndex() == cbxPregunta2.getSelectedIndex()) {
            cbxPregunta1.grabFocus();
            return false;
        }
        return true;
    }

    private void borrarCampos() {
        txtNombre.setText(null);
        txtApMat.setText(null);
        txtApPat.setText(null);
        txtNombreU.setText(null);
        txtPass.setText(null);
        txtPass1.setText(null);
        cbxPregunta1.setSelectedIndex(0);
        cbxPregunta2.setSelectedIndex(0);
        txtRespuesta1.setText(null);
        txtRespuesta2.setText(null);
        cbxGrado.setSelectedIndex(0);
        notif.setText("Formulario reseteado");
        UtilPerfil.mandarNotificacion(ColorFondo.MENSAJE_BIEN, btnCancelarRegistro, notif);
    }

    private void preguntaUsuario() {
        try {
            ConexionBD.abrirConexion();
            CallableStatement ps = ConexionBD.con.prepareCall("CALL buscapreguntausuario(?,?,?)");
            ps.setString(1, txtUsRec.getText());
            ps.setInt(2, cbxPreguntaRec.getSelectedIndex());
            ps.setString(3, txtRespRec.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.first()) {
                lblResultadoRec.setText("Te encontré :-) \n"
                        + "Usuario: " + rs.getString("iduser") + " \n"
                        + "Contraseña: " + rs.getString("password") + " \n"
                        + "Este dialogo se cerrará automáticamente...");
                        temporizarVentana();
                txtNombreUsuario.setText(rs.getString("iduser"));
                txtContraseña.setText(rs.getString("password"));
            } else {
                lblResultadoRec.setText(":-( No encontré nada...");
            }
        } catch (SQLException ex) {
            Logger.getLogger(IniciarSesion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void borraCamposRec() {
        lblResultadoRec.setText(null);
        txtUsRec.setText(null);
        cbxPreguntaRec.setSelectedIndex(0);
        txtRespRec.setText(null);
    }
    
    private void temporizarVentana(){
       Timer t = new Timer(3000, new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
              dlgRecuperaCuenta.setVisible(false);
              borraCamposRec();              
           }
       });
       t.setRepeats(false);
       t.start();
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
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(IniciarSesion.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarRegistro;
    private javax.swing.JButton btnCancelarRegistro;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JButton btnRecuperarCuenta;
    private javax.swing.JButton btnSalirRec;
    private javax.swing.JButton btnSalirRegistro;
    private javax.swing.JButton btnVerRec;
    private javax.swing.JComboBox cbxGrado;
    private javax.swing.JComboBox cbxPregunta1;
    private javax.swing.JComboBox cbxPregunta2;
    private javax.swing.JComboBox cbxPreguntaRec;
    private javax.swing.JDialog dlgRecuperaCuenta;
    private javax.swing.JDialog dlgRegistro;
    private javax.swing.JLabel jLabel1;
    private org.jdesktop.swingx.JXLabel lblResultadoRec;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloRec;
    private javax.swing.JLabel notif;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlRecuperar;
    private javax.swing.JPanel pnlRegistro;
    private org.jdesktop.swingx.JXTextField txtApMat;
    private org.jdesktop.swingx.JXTextField txtApPat;
    private org.edisoncor.gui.passwordField.PasswordFieldRectBackground txtContraseña;
    private org.jdesktop.swingx.JXTextField txtNombre;
    private org.jdesktop.swingx.JXTextField txtNombreU;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtNombreUsuario;
    private org.edisoncor.gui.passwordField.PasswordFieldRectBackground txtPass;
    private org.edisoncor.gui.passwordField.PasswordFieldRectBackground txtPass1;
    private org.jdesktop.swingx.JXTextField txtRespRec;
    private org.jdesktop.swingx.JXTextField txtRespuesta1;
    private org.jdesktop.swingx.JXTextField txtRespuesta2;
    private org.jdesktop.swingx.JXTextField txtUsRec;
    // End of variables declaration//GEN-END:variables

}
