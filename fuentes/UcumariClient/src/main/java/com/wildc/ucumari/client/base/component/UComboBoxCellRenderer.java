/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.base.component;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Cristian
 */
public class UComboBoxCellRenderer extends JLabel implements ListCellRenderer<Object>{
    public UComboBoxCellRenderer() {
         //setOpaque(true);
        setOpaque(false);
     }

    @Override
    public Component getListCellRendererComponent(JList<?> list,
                                                   Object value,
                                                   int index,
                                                   boolean isSelected,
                                                   boolean cellHasFocus) {

        if(value != null){
         setText(value.toString());
        }

         Color background;
         Color foreground;

         // check if this cell represents the current DnD drop location
         list.setBackground(new Color(100,120,70,100));
         list.setOpaque(false);
         JList.DropLocation dropLocation = list.getDropLocation();         
         if (dropLocation != null
                 && !dropLocation.isInsert()
                 && dropLocation.getIndex() == index) {

             background = Color.BLUE;
             foreground = Color.WHITE;

         // check if this cell is selected
         } else if (isSelected) {
             background = Color.RED;
             foreground = Color.WHITE;

         // unselected, and not the DnD drop location
         } else {
             //background = Color.WHITE;
             background = new Color(100,120,70,100);
             foreground = Color.BLACK;
         }

         setBackground(background);
         setForeground(foreground);

         return this;
     }
}
