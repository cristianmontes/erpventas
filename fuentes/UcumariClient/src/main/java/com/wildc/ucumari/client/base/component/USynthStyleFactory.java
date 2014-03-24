/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.base.component;

import javax.swing.JComponent;
import javax.swing.plaf.synth.Region;
import javax.swing.plaf.synth.SynthStyle;
import javax.swing.plaf.synth.SynthStyleFactory;

/**
 *
 * @author Cristian
 */
public class USynthStyleFactory extends SynthStyleFactory {
    private SynthStyleFactory wrappedFactory;
    public USynthStyleFactory(SynthStyleFactory factory) {
        this.wrappedFactory = factory;
    }
    @Override 
    public SynthStyle getStyle(JComponent c, Region id) {
        SynthStyle s = wrappedFactory.getStyle(c, id);
        //if(id==Region.INTERNAL_FRAME_TITLE_PANE||id==Region.INTERNAL_FRAME) {
        if(id==Region.INTERNAL_FRAME) {
            s = new UTranslucentSynthSytle(s);
        }
        return s;
    }
}
