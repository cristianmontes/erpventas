/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.base.component;

import org.jdesktop.swingx.JXDatePicker;

/**
 *
 * @author cmontes
 */
public class UDatePicker extends JXDatePicker{
    public UDatePicker() {
        super();
        this.setEditor(new UFormattedTextField());
        this.getEditor().setEditable(false);
    }
    /*
    @Override
    public JFormattedTextField getEditor() {
        return super.getEditor();
    }

    
    @Override
    public void setEditor(JFormattedTextField editor) {
        super.setEditor(editor);
    }*/
}
