/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.base.component;

import com.wildc.ucumari.client.base.util.Constantes;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFormattedTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author cmontes
 */
public class UFormattedTextField extends JFormattedTextField {
    
    private boolean required = false;
    private int arcw=10; 
    private int arch=10; 
    
    public UFormattedTextField(){
        super();
        setBackground(Constantes.BACKGROUND_TEXT_FIELD);
        setForeground(Color.WHITE);
        setMargin(new java.awt.Insets(-5, 1, -5, 1));
    }
    @Override 
    protected void paintBorder(Graphics g) {
         if(required){
            g.setColor(Color.red);
         }else{
            g.setColor(getForeground());
             //g.setColor(Color.WHITE);
         }         
         g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, arcw, arch);
         
    }
    
    @Override 
    protected void paintComponent(Graphics g) {
         g.setColor(getBackground());
         g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, arcw, arch);
         super.paintComponent(g);        
    }
    
    public int getArcw() { 
        return arcw; 
    } 

    public void setArcw(int arcw) { 
        this.arcw = arcw; 
    } 
}
