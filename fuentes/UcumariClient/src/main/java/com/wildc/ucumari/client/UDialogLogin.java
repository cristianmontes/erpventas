/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client;

import com.sun.awt.AWTUtilities;
import com.wildc.ucumari.client.base.component.USplashScreen;
import com.wildc.ucumari.client.base.util.Conexion;
import com.wildc.ucumari.client.base.util.Constantes;
import com.wildc.ucumari.client.base.util.SwingUtils;
import com.wildc.ucumari.security.model.UserLogin;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

/**
 *
 * @author Cristian
 */
public class UDialogLogin extends javax.swing.JDialog {

    private USplashScreen splash;
    
    private String usuarioLogueado = "";
    private String empresaLogueada = "";
    private UserLogin usuarioSession = null;
    
    /**
     * Creates new form UDialogBase
     */
    public UDialogLogin(JFrame parent, boolean modal) {
        super(parent, modal);
        
        //createSplashScreen();                
        
        //setUndecorated(true);
        //AWTUtilities.setWindowOpaque(this, false);	
        
        initComponents();
        
        txtEmpresa.requestFocus();
        
        SwingUtils.enterPressesWhenFocused(btnAceptar);
        SwingUtils.enterPressesWhenFocused(btnCancelar);
        
        setVisible(true);
        
        /*this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowOpened(WindowEvent e){                
                splash.killSplashScreen();
            }}
        );*/
        /*
        
        container = new javax.swing.JPanel(){
        @Override
        public void paintComponent(Graphics g) {
            g.setColor(Constantes.BACKGROUND_LOGIN);
            g.fillRect(0,0,getWidth(), getHeight());
        }};
        

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        

        container.setPreferredSize(getPreferredSize());
        container.setLayout(new java.awt.BorderLayout());

        

        //container.setBackground(new Color(100,50,50,200));
        container.setBackground(Constantes.BACKGROUND_LOGIN);
        container.setPreferredSize(new Dimension(400,220));
        container.setFocusable(true);
        container.requestFocusInWindow();

        getContentPane().add(container);
        //container.setBounds(0, 0, 400, 300);
        
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowOpened(WindowEvent e){                
                splash.killSplashScreen();
            }
        });
        
        SwingUtils.createLoginDialog(this, 408, 270);
        //SwingUtils.addEscapeToCloseSupport(this, true);
        SwingUtils.fadeInFast(this);*/
    }

    private void createSplashScreen(){
        long start = System.currentTimeMillis(); long length = 2000L;
        ImageIcon pic = new ImageIcon(USplashScreen.class.getResource("/com/wildc/ucumari/resources/splash2.jpg"));

        JProgressBar prog = new JProgressBar();
        prog.setSize(pic.getIconWidth() - 2, 14);
        prog.setStringPainted(true);
        prog.setBounds(1, pic.getIconHeight() - prog.getHeight() - 1, prog.getWidth(), prog.getHeight());

        splash = new USplashScreen(1000L, pic, prog);
        try{
            do{
              Thread.sleep(10L);

              prog.setString(((System.currentTimeMillis() - start) * 100L / length) + 
                "% Cargando...");
              ((JProgressBar)splash.getProgressComponent()).setValue((int)((System.currentTimeMillis() - start) * 100L / length)); }
            while (System.currentTimeMillis() - start < length);
        }catch(Exception e){
        }        
    }
    
    public void setUsuarioSession(UserLogin userLogin){
        this.usuarioSession = userLogin;
    }
    
    public UserLogin getUsuarioSession(){
        return this.usuarioSession;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel(){
            @Override
            public void paintComponent(Graphics g) {
                g.setColor(Constantes.BACKGROUND_LOGIN);
                g.fillRect(0,0,getWidth(), getHeight());
            }};
            pnlLogo = new javax.swing.JPanel(){
                @Override
                public void paintComponent(Graphics g) {
                    g.setColor(Constantes.BACKGROUND_LOGIN);
                    g.fillRect(0,0,getWidth(), getHeight());
                }};
                lblLogo = new javax.swing.JLabel();
                pnlDatos = new javax.swing.JPanel(){
                    @Override
                    public void paintComponent(Graphics g) {
                        g.setColor(Constantes.BACKGROUND_LOGIN);
                        g.fillRect(0,0,getWidth(), getHeight());
                    }};
                    lblEmpresa = new javax.swing.JLabel();
                    txtEmpresa = new com.wildc.ucumari.client.base.component.UTextField();
                    lblUsuario = new javax.swing.JLabel();
                    txtUsuario = new com.wildc.ucumari.client.base.component.UTextField();
                    txtPassword = new com.wildc.ucumari.client.base.component.UPasswordField();
                    lblPassword = new javax.swing.JLabel();
                    btnAceptar = new com.wildc.ucumari.client.base.component.UToolBarButton();
                    btnCancelar = new com.wildc.ucumari.client.base.component.UToolBarButton();

                    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                    java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/wildc/ucumari/resources/properties/applicationResources"); // NOI18N
                    setTitle(bundle.getString("login.title")); // NOI18N

                    container.setBackground(Constantes.BACKGROUND_LOGIN);
                    container.setPreferredSize(getPreferredSize());
                    container.setLayout(new java.awt.BorderLayout());

                    pnlLogo.setLayout(new java.awt.BorderLayout());

                    lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wildc/ucumari/resources/logo.png"))); // NOI18N
                    pnlLogo.add(lblLogo, java.awt.BorderLayout.CENTER);

                    container.add(pnlLogo, java.awt.BorderLayout.WEST);

                    pnlDatos.setLayout(null);

                    lblEmpresa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                    lblEmpresa.setText(bundle.getString("login.label.empresa")); // NOI18N
                    pnlDatos.add(lblEmpresa);
                    lblEmpresa.setBounds(10, 20, 70, 20);

                    txtEmpresa.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            txtEmpresaActionPerformed(evt);
                        }
                    });
                    txtEmpresa.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                            txtEmpresaFocusGained(evt);
                        }
                    });
                    pnlDatos.add(txtEmpresa);
                    txtEmpresa.setBounds(80, 20, 100, 20);

                    lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                    lblUsuario.setText(bundle.getString("login.label.usuario")); // NOI18N
                    pnlDatos.add(lblUsuario);
                    lblUsuario.setBounds(10, 60, 70, 20);

                    txtUsuario.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            txtUsuarioActionPerformed(evt);
                        }
                    });
                    txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                            txtUsuarioFocusGained(evt);
                        }
                    });
                    pnlDatos.add(txtUsuario);
                    txtUsuario.setBounds(80, 60, 100, 20);

                    txtPassword.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            txtPasswordActionPerformed(evt);
                        }
                    });
                    txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                            txtPasswordFocusGained(evt);
                        }
                    });
                    pnlDatos.add(txtPassword);
                    txtPassword.setBounds(80, 100, 100, 20);

                    lblPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                    lblPassword.setText(bundle.getString("login.label.clave")); // NOI18N
                    pnlDatos.add(lblPassword);
                    lblPassword.setBounds(10, 100, 70, 20);

                    btnAceptar.setBackground(Constantes.BACKGROUND_BUTTON_WINDOW);
                    btnAceptar.setMnemonic('A');
                    btnAceptar.setText(bundle.getString("general.btnAceptar")); // NOI18N
                    btnAceptar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            btnAceptarActionPerformed(evt);
                        }
                    });
                    pnlDatos.add(btnAceptar);
                    btnAceptar.setBounds(10, 170, 80, 28);

                    btnCancelar.setBackground(Constantes.BACKGROUND_BUTTON_WINDOW);
                    btnCancelar.setMnemonic('C');
                    btnCancelar.setText(bundle.getString("general.btnCancelar")); // NOI18N
                    btnCancelar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            btnCancelarActionPerformed(evt);
                        }
                    });
                    pnlDatos.add(btnCancelar);
                    btnCancelar.setBounds(95, 170, 80, 28);

                    container.add(pnlDatos, java.awt.BorderLayout.CENTER);

                    container.setPreferredSize(new Dimension(400,220));
                    container.setFocusable(true);
                    container.requestFocusInWindow();

                    getContentPane().add(container, java.awt.BorderLayout.CENTER);
                    //container.setBounds(0, 0, getWidth(), getHeight());

                    //SwingUtils.createLoginDialog(this, 408, 270);
                    //SwingUtils.addEscapeToCloseSupport(this, true);
                    //SwingUtils.fadeInFast(this);
                    this.setSize(408, 270);
                    this.setLocation((this.getToolkit().getScreenSize().width-this.getWidth())/2, (this.getToolkit().getScreenSize().height-this.getHeight())/2);

                    pack();
                }// </editor-fold>//GEN-END:initComponents

    private void txtEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpresaActionPerformed

    private void txtEmpresaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmpresaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpresaFocusGained

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        btnAceptar.doClick();
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        txtUsuario.selectAll();
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        btnAceptar.doClick();
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        txtPassword.selectAll();
    }//GEN-LAST:event_txtPasswordFocusGained

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.WAIT_CURSOR));

        try {
            
            usuarioLogueado = txtUsuario.getText().trim();
            empresaLogueada = txtEmpresa.getText().trim();
            String lsPwd = new String(txtPassword.getPassword());
            //System.out.println("texto del password: " + txtPassword.getText() + " pass: "+ txtPassword.getPassword());
            System.out.println("texto del password1: " + new String(txtPassword.getPassword()) + " pass: "+ txtPassword.getPassword());
            if(empresaLogueada.equals("")||empresaLogueada.equals("")||lsPwd.trim().equals("")){
                //addMessage(AppBundle.getInstance().get(Constantes.LOGIN_MESSAGE_ERROR_ACCESO));
                txtEmpresa.requestFocus();
            }else{
               
                UserLogin userLogin = new UserLogin();
                userLogin.setUserLoginId(usuarioLogueado);
                userLogin.setCurrentPassword(lsPwd);                
                userLogin.setPartyCompanyId(empresaLogueada);
                userLogin = Conexion.getSecurityDelegate().login(userLogin);
                if(userLogin != null){
                    setUsuarioSession(userLogin);
                    //System.out.println("usuario..." + usuarioSession.getCodUsuario());
                    //System.out.println("empresa..." + usuario.getEmpresa().getNombre());
                    setVisible(false);
                }else{
                    //addMessage(AppBundle.getInstance().get(Constante.TXT_MSG_USUARIO_INVALIDO));
                    System.out.println("usuario invalido");
                }
            }

        }
        catch (Exception e) {
            System.out.println("No puede validar el Usuario.");
            e.printStackTrace();
        }
        finally {
            setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //SwingUtils.fadeOutFast(this);
        this.setVisible(false);
        //this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wildc.ucumari.client.base.component.UToolBarButton btnAceptar;
    private com.wildc.ucumari.client.base.component.UToolBarButton btnCancelar;
    private javax.swing.JPanel container;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlLogo;
    private com.wildc.ucumari.client.base.component.UTextField txtEmpresa;
    private com.wildc.ucumari.client.base.component.UPasswordField txtPassword;
    private com.wildc.ucumari.client.base.component.UTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
