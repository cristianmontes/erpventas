/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.base.component;

import com.sun.awt.AWTUtilities;
import com.wildc.ucumari.client.base.util.SwingUtils;






import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Cristian
 */
public class UMessage extends javax.swing.JDialog {

    /**
     * Creates new form UMessage
     */
    private UMessage(JFrame parent, int typeWindow, String mensaje) {
        super(parent, true);
        this.mensaje = mensaje;
        setUndecorated(true);
        AWTUtilities.setWindowOpaque(this, false);	
        //AWTUtilities.setWindowOpacity(this, 0.01f);

        

        JLabel texto = new JLabel("<html>"+mensaje+"</html>", JLabel.CENTER);
        //label.setForeground(Color.WHITE);
        texto.setForeground(Color.BLACK);
        //texto.setFont(new Font(texto.getFont().getFontName(), Font.PLAIN, 16));
        texto.setFont(new java.awt.Font("Tahoma", 1, 11));
        texto.setHorizontalAlignment(JLabel.CENTER);
        texto.setVerticalAlignment(JLabel.CENTER);

        
        ImageIcon image = null;
        if(typeWindow == MESSAGE_ALERTA){
            setTitle("Alerta");
            image = new ImageIcon(getClass().getResource("/com/wildc/ucumari/resources/alerta.png"));
        }else if(typeWindow == MESSAGE_ERROR){
            setTitle("Error");
            image = new ImageIcon(getClass().getResource("/com/wildc/ucumari/resources/error.png"));
        }else if(typeWindow == MESSAGE_INFORMACION){
            setTitle("Informacion");
            image = new ImageIcon(getClass().getResource("/com/wildc/ucumari/resources/informacion.png"));
        }else{
            setTitle("Alerta");
            image = new ImageIcon(getClass().getResource("/com/wildc/ucumari/resources/alerta.png"));
        }
        image.setImage(image.getImage().getScaledInstance(60,60, Image.SCALE_DEFAULT));
        JLabel lblImage = new javax.swing.JLabel(image, JLabel.CENTER);
        
        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setBackground(new java.awt.Color(255, 255, 255));//Blanco
        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnAceptar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    closeDialog(evt);
                }
            });
            
        JPanel panel = new JPanel();
        //panel.setBackground(new Color(0xAA05579));
        //panel.setBackground(new Color(176,196,222));
        panel.setBackground(new Color(100,50,50,200));        
        //panel.setBackground(Color.GREEN);
        panel.setLayout(null);
        //panel.setOpaque(false);
                      
        panel.add(lblImage);
        lblImage.setBounds(15, 45, 60, 60);
        
        panel.add(texto);
        texto.setBounds(80, 45, 205, 60);
        
        panel.add(btnAceptar);
        btnAceptar.setBounds(100, 120, 100, 30);
        
        panel.setPreferredSize(new Dimension(300, 160));
        
        //setBackground(Color.RED);


        // the following two lines are only needed because there is no
        // focusable component in here, and the "hit espace to close" requires
        // the focus to be in the dialog. If you have a button, a textfield,
        // or any focusable stuff, you don't need these lines.
        panel.setFocusable(true);
        panel.requestFocusInWindow();

        getContentPane().add(panel);

        SwingUtils.createDialogBackPanel(this, parent.getContentPane());
        SwingUtils.addEscapeToCloseSupport(this, true);
        SwingUtils.fadeInFast(this);
    }
    
    private static UMessage dialog;
    private String mensaje;
    
    public static int MESSAGE_ALERTA = 1;
    public static int MESSAGE_ERROR = 2;
    public static int MESSAGE_INFORMACION = 3;
    
    public static void showMessageError(JFrame parent, String mensaje){
        dialog = new UMessage(parent, MESSAGE_ERROR, mensaje);
    }
    
    public static void showMessageInfo(JFrame parent, String mensaje){
        dialog = new UMessage(parent, MESSAGE_INFORMACION, mensaje);
    }
    
    public static void showMessageAlert(JFrame parent, String mensaje){
        dialog = new UMessage(parent, MESSAGE_ALERTA, mensaje);
    }
    
    
    private void closeDialog(java.awt.event.ActionEvent evt) {
        SwingUtils.fadeOutFast(this);
        this.dispose();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("dialogo");
        getContentPane().setLayout(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
