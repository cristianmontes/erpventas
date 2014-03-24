/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.base.component;

import com.wildc.ucumari.client.base.util.BallonUtils;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import net.java.balloontip.BalloonTip;

/**
 *
 * @author Cristian
 */
public class UTextField extends JTextField implements FocusListener{
    
    private int arcw=10; 
    private int arch=10; 
    private Image image=null; 
    private Icon icon;
    private String hint = "";
    private boolean required = false;
    private String uToolTip = "";
    
    private Shape shape;
     
    Font gainFont = new Font("Tahoma", Font.PLAIN, 11);  
    Font lostFont = new Font("Tahoma", Font.ITALIC, 11);
    
    BalloonTip balloonTip = null;
    
    
    public UTextField() {
        super();
        setOpaque(false);
    }
    
    @Override
    public void focusGained(FocusEvent e) {
        if(!this.hint.isEmpty()){
            setFont(gainFont);  
            setForeground(Color.BLACK);        
            if(getText().equals(hint)){
                setText("");            
            }else{
                setText(getText());
            }
        }
        //balloonTip = new BalloonTip(this, new JLabel("<html>I'm a " + BallonUtils.monospace("BalloonTip") + ".</html>"),
        /*
        balloonTip = new BalloonTip(this, new JLabel(uToolTip),
				BallonUtils.createBalloonTipStyle(),
				BallonUtils.createBalloonTipPositioner(), 
				null);*/
        //BallonUtils.showErrorMessage(this, "Error de miercoles");
        if(!this.uToolTip.isEmpty()){
            balloonTip = BallonUtils.showToolTipStandard(this, this.uToolTip, balloonTip);
        }
       
    }
    @Override
    public void focusLost(FocusEvent e) {
        if(!this.hint.isEmpty()){
            if(getText().isEmpty() || getText().equals(hint)) {
                setText(hint);
                setFont(lostFont);
                setForeground(Color.GRAY);
            }else{
                setText(getText());
                setFont(gainFont);
                setForeground(Color.BLACK);
            }
        }
        if(!this.uToolTip.isEmpty()){
            BallonUtils.closeBallon(balloonTip);
        }
        //ToolTipUtils.balloonToToolTip(balloonTip, 200, 500);
    }
    
    @Override
    public String getText() {
        String typed = super.getText();
        return typed.equals(hint) ? "" : typed;
    }
    
    @Override 
    protected void paintComponent(Graphics g) {
         g.setColor(getBackground());
         g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, arcw, arch);
         super.paintComponent(g);
         try {
            if(getImage()!=null){                
                //g.drawImage(getImage(), getWidth()-11, 2, 10, 10, this);
                g.drawImage(getImage(), 2, 2, getHeight()-2, getHeight()-2, this);
                //setBorder(new EmptyBorder(0,4,0,(int)(getHeight()-2)/2+2));
                setBorder(new EmptyBorder(2,getHeight()+2,2,2));
            }
         }catch(Exception ignore) {
            System.out.println("error");
            ignore.printStackTrace();
         }
    }
    
    @Override 
    protected void paintBorder(Graphics g) {
         if(required){
            g.setColor(Color.red);
         }else{
             g.setColor(getForeground());
         }         
         g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, arcw, arch);
         
    }
    public boolean contains(int x, int y) {
         if (shape == null || !shape.getBounds().equals(getBounds())) {
             shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, arcw, arch);
         }
         return shape.contains(x, y);
    }

    

    public int getArcw() { 
        return arcw; 
    } 

    public void setArcw(int arcw) { 
        this.arcw = arcw; 
    } 

    public int getArch() { 
        return arch; 
    } 

    public void setArch(int arch) { 
        this.arch = arch; 
    } 

    public Image getImage() { 
        return image; 
    } 

    public void setImage(Image image) { 
        this.image = image; 
    } 

    public Icon getIcon() { 
        return icon; 
    } 

    public void setIcon(Icon icon){ 
        this.icon=icon; 
        setImage(((ImageIcon)icon).getImage()); 
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
        if(!this.hint.isEmpty()){
            gainFont = this.getFont();
            super.addFocusListener(this);
        }
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
        
    }

    public String getuToolTip() {
        return uToolTip;
    }

    public void setuToolTip(String uToolTip) {
        this.uToolTip = uToolTip;
        if(!this.uToolTip.isEmpty()){
            gainFont = this.getFont();
            super.addFocusListener(this);
        }
    }
  
}
