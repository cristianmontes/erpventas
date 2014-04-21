/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.base.component;

import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author cmontes
 */
public class UComboBoxModel<E> extends DefaultComboBoxModel<E>{
    
    public UComboBoxModel(){
        super();
    }
    
    public UComboBoxModel(final E items[]) {
        super(items);
    }
    
    public UComboBoxModel(Vector<E> vector) {
        super(vector);
    }
    /*
    @Override
    public Object getSelectedItem() {
        return "DATOS";//super.getSelectedItem().ge;
    }*/
    
    public void addElements(List<E> list){
        if(list != null){
            for(int i=0; i<list.size(); i++){
                addElement(list.get(i));
            }
        }
    }
    
}
