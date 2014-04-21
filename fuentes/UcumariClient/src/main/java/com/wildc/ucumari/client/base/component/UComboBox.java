/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.base.component;

import com.wildc.ucumari.client.base.util.Constantes;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Cristian
 */
public class UComboBox extends JComboBox{
   
    private boolean required = false;
    private int arcw=10; 
    private int arch=10;
    private String fieldview = "";
    private Class clazz;
            
    public UComboBox(){
        super();
        //setOpaque(false);
        //setContentAreaFilled(false);
        //setBorderPainted(false);
        /*
        //setOpaque(false);
        setBackground(new Color(100,50,50,100));
        //((JTextField)getEditor().getEditorComponent()).setOpaque(false);
        ((JTextField)getEditor().getEditorComponent()).setBackground(new Color(100,50,50,100));
        */
        
        //setBackground(Color.white);        
        setBackground(Constantes.BACKGROUND_TEXT_FIELD);
        //((JTextField)getEditor().getEditorComponent()).setOpaque(false);
        ((JTextField)getEditor().getEditorComponent()).setForeground(Color.WHITE);
        ((JTextField)getEditor().getEditorComponent()).setBackground(Constantes.BACKGROUND_TEXT_FIELD);
        super.setRenderer(new UComboBoxCellRenderer());
        //componentUI = new UBasicComboBoxUI();                
        //super.setUI(componentUI);
        
    }
    
    @Override 
    protected void paintComponent(Graphics g) {
         g.setColor(getBackground());
         g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, arcw, arch);
         super.paintComponent(g);        
    }
    
    @Override 
    protected void paintBorder(Graphics g) {
         if(required){
            g.setColor(Color.BLUE);
         }else{
            //g.setColor(getForeground());
            g.setColor(Color.WHITE);
         }
         g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, arcw, arch);
         
    }

    /**
     * @return the required
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * @param required the required to set
     */
    public void setRequired(boolean required) {
        this.required = required;
    }

    public String getFieldview() {
        return fieldview;
    }

    public void setFieldview(String fieldview) {
        this.fieldview = fieldview;
        super.setRenderer(new UComboBoxCellRenderer(clazz,fieldview));
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }
    
    
   
    
    
}
