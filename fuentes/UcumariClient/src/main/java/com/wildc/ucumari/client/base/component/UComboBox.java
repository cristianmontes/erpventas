/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.base.component;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Cristian
 */
public class UComboBox extends JComboBox{
    
    public UComboBox(){
        super();
        //setOpaque(false);
        //setContentAreaFilled(false);
        //setBorderPainted(false);
        setOpaque(false);
        setBackground(new Color(100,50,50,100));
        ((JTextField)getEditor().getEditorComponent()).setOpaque(false);
        ((JTextField)getEditor().getEditorComponent()).setBackground(new Color(100,50,50,100));
        //set
        setRenderer(new UComboBoxCellRenderer());
        setUI(new UBasicComboBoxUI());
    }
    
    
}
