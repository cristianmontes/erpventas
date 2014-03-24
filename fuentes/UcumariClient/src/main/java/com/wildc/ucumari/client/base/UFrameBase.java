/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wildc.ucumari.client.base;

import java.awt.Frame;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian
 */
public class UFrameBase extends javax.swing.JFrame {
    
    /** Creates new form FrameBase */
    public UFrameBase() {
        //initComponents();
    }
    protected void addMessage(String message){
        JOptionPane.showMessageDialog(this, message);
    }
    
    protected void addMessage(Frame frame, String message){
        JOptionPane.showMessageDialog(frame, message);
    }
    
    protected void addMessage(Frame frame, String message, String title, int type){
        JOptionPane.showMessageDialog(frame, message,title, type);
    }
}
