/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.base;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Cristian
 */
public class DesktopUcumari extends JDesktopPane{
    private Image imagenFondo=null;
    private JPanel logPane = null;
    private JLabel logLabel = null;
    
    public DesktopUcumari(){
        super();
        imagenFondo=new ImageIcon(getClass().getResource("/com/wildc/ucumari/resources/fondo9.jpg")).getImage();
        setLayout(null);
        logPane = new javax.swing.JPanel();
        logPane.setBackground(new Color(0,true));
        logPane.setPreferredSize(new java.awt.Dimension(1, 0));
        logPane.setLayout(new java.awt.BorderLayout());
        
        logLabel = new JLabel();
        logLabel.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        logLabel.setForeground(new java.awt.Color(200, 180, 100));
        logLabel.setText("<html> holaa holaa holaa holaa holaaholaa holaa holaa holaa holaaholaa holaa holaa holaa holaaholaa holaa holaa holaa holaa<br> holaaholaaholaaholaaholaa<br> holaaholaaholaaholaa<br> </html>");
        logLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        logLabel.setAutoscrolls(true);
        logLabel.setOpaque(false);
        logLabel.setPreferredSize(new java.awt.Dimension(1, 0));
        logLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        logPane.add(logLabel, java.awt.BorderLayout.CENTER);
        
        logLabel.getAccessibleContext().setAccessibleName("");        
        
        add(logPane);
    }

    public void paintChildren(Graphics g){
        //System.out.println("with " + getWidth() + "heigt " + getHeight());
        logPane.setBounds(0, 0, getWidth(), getHeight());
        g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
        super.paintChildren(g);
    }
}
