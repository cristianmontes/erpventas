/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.base.component;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;

/**
 *
 * @author Cristian
 */
public class USplashScreen extends JWindow implements Runnable{
    
    private static final long serialVersionUID = 1L;
    public static final String VERSION = "v1.0";
    private long minRemainingTime;
    private ImageIcon pic;
    private Component progressComponent;
    private Thread thread;
    private boolean interrupted;
    private Dimension scrSize;

    public USplashScreen(long remainAtLeast, ImageIcon pic){
        this(remainAtLeast, pic, null);
    }

    public USplashScreen(long remainAtLeast, ImageIcon pic, Component progressComp){
        this.thread = new Thread(this);

        this.interrupted = false;

        this.scrSize = Toolkit.getDefaultToolkit().getScreenSize();

        this.minRemainingTime = remainAtLeast;
        this.pic = pic;
        this.progressComponent = progressComp;

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(this.pic.getIconWidth(), this.pic.getIconHeight()));

        JLabel picLabel = new JLabel(this.pic);
        picLabel.setBounds(0, 0, this.pic.getIconWidth(), this.pic.getIconHeight());
        layeredPane.add(picLabel, new Integer(0));

        if (this.progressComponent != null)
        layeredPane.add(this.progressComponent, new Integer(1));
        getContentPane().add(layeredPane, "Center");
        pack();

        setLocation(this.scrSize.width / 2 - (getWidth() / 2), this.scrSize.height / 2 - (
        getHeight() / 2));
        setAlwaysOnTop(true);
        setVisible(true);

        this.thread.setDaemon(true);
        this.thread.setName("Splash screen display thread");
        this.thread.start();
    }

    public void run(){
        long start = System.currentTimeMillis();
        boolean leave = false;
        do{
          try{
            Thread.sleep(50L);
          }catch (InterruptedException localInterruptedException){
          }
          
          if ((System.currentTimeMillis() - start < this.minRemainingTime) || 
            (!(this.interrupted))) continue;
          leave = true;
        }while (!(leave));
        
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
              USplashScreen.this.dispose();
            }
        });
    }

    public Component getProgressComponent(){
      return this.progressComponent;
    }

    public void killSplashScreen(){
      if (!(this.thread.isAlive()))
        return;
      this.thread.interrupt();
      this.interrupted = true;
    }

    public void killSplashScreen(final Window firstWnd){
        if (this.thread.isAlive()){            
            SwingUtilities.invokeLater(new Runnable(){
                @Override
                public void run(){
                    firstWnd.toFront();
                    USplashScreen.this.toFront();
                }
            });
            // interrupt splash screen as soon as possible
            this.killSplashScreen();
        }
    }

    /*
  public static void main(String[] args)
    throws InterruptedException
  {
    long start = System.currentTimeMillis(); long length = 2000L;
    ImageIcon pic = new ImageIcon(USplashScreen.class.getResource("/com/wildc/ucumari/resources/splash1.jpg"));

    JProgressBar prog = new JProgressBar();
    prog.setSize(pic.getIconWidth() - 2, 14);
    prog.setStringPainted(true);
    prog.setBounds(1, pic.getIconHeight() - prog.getHeight() - 1, prog.getWidth(), prog.getHeight());

    USplashScreen splash = new USplashScreen(3000L, pic, prog);
    do
    {
      Thread.sleep(10L);

      prog.setString(((System.currentTimeMillis() - start) * 100L / length) + 
        "% loaded...");
      ((JProgressBar)splash.getProgressComponent()).setValue((int)((System.currentTimeMillis() - start) * 100L / length)); }
    while (System.currentTimeMillis() - start < length);

    JFrame frame = createMainFrame(splash);
    frame.setVisible(true);
  }

  private static JFrame createMainFrame(final USplashScreen splash)
  {
    final Dimension resol = Toolkit.getDefaultToolkit().getScreenSize();
    final Dimension dim = new Dimension(800, 600);
    final JFrame frame = new JFrame("Example test frame");
    frame.setPreferredSize(dim);
    frame.setMinimumSize(dim);
    frame.setLocation((resol.width - dim.width) / 2, (resol.height - dim.height) / 2);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.addWindowListener(new WindowAdapter()
    {
        @Override
        public void windowOpened(WindowEvent e)
        {
            // every computing done, so send termination signal to splash
            // screen
            splash.killSplashScreen(frame);
        }
    });
    return frame;
  }*/
    
}
