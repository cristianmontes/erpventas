/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.base.util;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JLabel;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.positioners.BalloonTipPositioner;
import net.java.balloontip.positioners.RightBelowPositioner;
import net.java.balloontip.styles.BalloonTipStyle;
import net.java.balloontip.styles.EdgedBalloonStyle;
import net.java.balloontip.styles.MinimalBalloonStyle;
import net.java.balloontip.utils.ToolTipUtils;

/**
 *
 * @author Cristian
 */
public class BallonUtils {
    
    private BalloonTip errBalloon = null;

    /**
     * Set a tooltip
     * @param comp		sets a tooltip for this component
     * @param text		the contents of the tooltip (you may use html)
     */
    private BallonUtils(){
    };
    
    
    public static void setToolTip(final JComponent comp, final String text) {
            BalloonTipStyle style = new MinimalBalloonStyle(new Color(169, 205, 221, 220), 5);
            final BalloonTip balloon = new BalloonTip(comp, new JLabel(text), style, 
                    BalloonTip.Orientation.LEFT_ABOVE, 
                    BalloonTip.AttachLocation.EAST, 15, 10, false);
            balloon.addDefaultMouseListener(false);
            ToolTipUtils.balloonToToolTip(balloon, 500, 3000);                
    }

    /**
     * Display an error balloon tip
     * @param comp	attach the balloon tip to this component
     * @param text	error message
     */
    public static BalloonTip showErrorMessage(JComponent comp, String text, BalloonTip balloonTip) {
        
        if (balloonTip!=null) {
                balloonTip.closeBalloon();
        }
        BalloonTipStyle style = new MinimalBalloonStyle(new Color(246, 197, 192, 220), 5);
        balloonTip = new BalloonTip(comp, new JLabel("<html><font color=\"#6f150d\">" + text + "</font></html>"),
                        style, BalloonTip.Orientation.LEFT_ABOVE, BalloonTip.AttachLocation.EAST, 15, 10, false);
        
        
        return balloonTip;
        //balloonTip.addDefaultMouseListener(false);
        //TimingUtils.showTimedBalloon(balloonTip, 3000);
    }

    public static BalloonTip showToolTipStandard(JComponent comp, String text, BalloonTip balloonTip) {
        if (balloonTip!=null) {
                balloonTip.closeBalloon();
        }
        BalloonTipStyle style = createBalloonTipStyle();
        
        balloonTip = new BalloonTip(comp, new JLabel(text),
                        style, BalloonTip.Orientation.LEFT_ABOVE, BalloonTip.AttachLocation.EAST, 
                        15, 10, false);
        /*
        balloonTip = new BalloonTip(comp, new JLabel(text),
				style,
				BallonUtils.createBalloonTipPositioner(), 
				null);*/
        //balloonTip.addDefaultMouseListener(false);
        //TimingUtils.showTimedBalloon(balloonTip, 3000);
        return balloonTip;
    }
    
    public static void closeBallon(BalloonTip balloonTip){
        if (balloonTip!=null) {
                balloonTip.closeBalloon();
        }
    }

    /**
     * Retrieve an instance of the balloon tip style to be used throughout the application
     * @return	the balloon tip style
     */
    public static BalloonTipStyle createBalloonTipStyle() {
            return new EdgedBalloonStyle(new Color(255,253,245), new Color(64,64,64));
    }

    /**
     * Retrieve an instance of the balloon tip positioner to be used throughout the application
     * @return	the balloon tip positioner
     */
    public static BalloonTipPositioner createBalloonTipPositioner() {
            //return new LeftAbovePositioner(15, 10);
        return new RightBelowPositioner(10,10);
    }

    /**
     * Wraps a string in a monospace font tag (for use in a HTML-formatted label) 
     * @param str		the string
     * @return			the formatted string
     */
    public static String monospace(String str) {
            return "<font face=\"monospace\">" + str + "</font>"; 
    }

    
}
