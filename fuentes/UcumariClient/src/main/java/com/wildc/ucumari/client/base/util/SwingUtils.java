package com.wildc.ucumari.client.base.util;

import com.wildc.ucumari.client.base.UDialogBackPanel;
import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLayer;
import javax.swing.KeyStroke;
import javax.swing.Timer;
import javax.swing.plaf.LayerUI;

/** 
 * @author Cristian
 */
public class SwingUtils {
    
        public static void createLoginDialog(JDialog dialog, int width, int height){
            UDialogBackPanel newContentPane = new UDialogBackPanel(dialog);
            dialog.setContentPane(newContentPane);
            dialog.setSize(width, height);
            dialog.setLocation((dialog.getToolkit().getScreenSize().width-dialog.getWidth())/2, (dialog.getToolkit().getScreenSize().height-dialog.getHeight())/2);
        }
	/**
	 * Centers the dialog over the given parent component. Also, creates a
	 * semi-transparent panel behind the dialog to mask the parent content.
	 * The title of the dialog is displayed in a custom fashion over the dialog
	 * panel, and a rectangular shadow is placed behind the dialog.
	 */
	public static void createDialogBackPanel(JDialog dialog, Component parent) {
		UDialogBackPanel newContentPane = new UDialogBackPanel(dialog);
		dialog.setContentPane(newContentPane);		
                if(parent.isShowing()){
                    dialog.setSize(parent.getSize());
                    dialog.setLocation(parent.getLocationOnScreen());
                }else{
                    JComponent cmp = (JComponent) dialog.getContentPane();
                    //dialog.setSize(dialog.getToolkit().getScreenSize().width, dialog.getToolkit().getScreenSize().height);
                    dialog.setSize(cmp.getPreferredSize().width + 8, cmp.getPreferredSize().height);
                    dialog.setLocation((dialog.getToolkit().getScreenSize().width-dialog.getWidth())/2, (dialog.getToolkit().getScreenSize().height-dialog.getHeight())/2);
                }
	}

	/**
	 * Adds a glass layer to the dialog to intercept all key events. If the
	 * espace key is pressed, the dialog is disposed (either with a fadeout
	 * animation, or directly).
	 */
	public static void addEscapeToCloseSupport(final JDialog dialog, final boolean fadeOnClose) {
		LayerUI<Container> layerUI = new LayerUI<Container>() {
			private boolean closing = false;

			@Override
			public void installUI(JComponent c) {
				super.installUI(c);
				((JLayer) c).setLayerEventMask(AWTEvent.KEY_EVENT_MASK);
			}

			@Override
			public void uninstallUI(JComponent c) {
				super.uninstallUI(c);
				((JLayer) c).setLayerEventMask(0);
			}

			@Override
			public void eventDispatched(AWTEvent e, JLayer<? extends Container> l) {
				if (e instanceof KeyEvent && ((KeyEvent) e).getKeyCode() == KeyEvent.VK_ESCAPE) {
					if (closing) return;
					closing = true;
					if (fadeOnClose) fadeOut(dialog);
					else dialog.dispose();
				}
			}
		};

		JLayer<Container> layer = new JLayer<Container>(dialog.getContentPane(), layerUI);
                //JLayer layer = new JLayer(dialog.getContentPane(), layerUI);
		dialog.setContentPane(layer);
	}

	/**
	 * Creates an animation to fade the dialog opacity from 0 to 1.
	 */
        /*
	public static void fadeIn(final JDialog dialog) {
		final Timer timer = new Timer(10, null);
		timer.setRepeats(true);
		timer.addActionListener(new ActionListener() {
			private float opacity = 0;
			@Override public void actionPerformed(ActionEvent e) {
				opacity += 0.15f;
				dialog.setOpacity(Math.min(opacity, 1));
				//if (opacity >= 0.5) timer.stop();
                                if (opacity >= 0.6) timer.stop();
			}
		});

		dialog.setOpacity(0);
		timer.start();
		dialog.setVisible(true);
	}*/

        public static void fadeIn(final JDialog dialog) {
		final Timer timer = new Timer(10, null);
		timer.setRepeats(true);
		timer.addActionListener(new ActionListener() {
			private float opacity = 0;
			@Override public void actionPerformed(ActionEvent e) {
				opacity += 0.15f;
				dialog.setOpacity(Math.min(opacity, 1));
				if (opacity >= 1) timer.stop();
			}
		});

		dialog.setOpacity(0);
		timer.start();
		dialog.setVisible(true);
	}
        public static void fadeInFast(final JDialog dialog) {
		
		dialog.setOpacity(1);		
		dialog.setVisible(true);
	}
        
	/**
	 * Creates an animation to fade the dialog opacity from 1 to 0.
	 */
        /*
	public static void fadeOut(final JDialog dialog) {
		final Timer timer = new Timer(10, null);
		timer.setRepeats(true);
		timer.addActionListener(new ActionListener() {
			private float opacity = 0.6f;
			@Override public void actionPerformed(ActionEvent e) {
				opacity -= 0.15f;
				dialog.setOpacity(Math.max(opacity, 0));
				if (opacity <= 0) {
					timer.stop();
					dialog.dispose();
				}
			}
		});

		//dialog.setOpacity(0);
		timer.start();
	}*/
        
        public static void fadeOut(final JDialog dialog) {
		final Timer timer = new Timer(10, null);
		timer.setRepeats(true);
		timer.addActionListener(new ActionListener() {
			private float opacity = 1;
			@Override public void actionPerformed(ActionEvent e) {
				opacity -= 0.15f;
				dialog.setOpacity(Math.max(opacity, 0));
				if (opacity <= 0) {
					timer.stop();
					dialog.dispose();
				}
			}
		});

		dialog.setOpacity(1);
		timer.start();
	}
        
        public static void fadeOutFast(final JDialog dialog) {		

		dialog.setOpacity(0);
		dialog.dispose();
	}

	// -------------------------------------------------------------------------
	// Helpers
	// -------------------------------------------------------------------------
/*
	private static class UDialogBackPanel extends JPanel {
		//private static final Paint fill = new Color(0xAAFFFFFF, true);
                //private static final Paint fill = new Color(0xAAff0000, true);
                private static final Paint fill = new Color(100,50,50,100);
		//private static final ImageIcon shadowImage = new ImageIcon(SwingUtils.class.getResource("dialogShadow.png"));
		private final JComponent cmp;
		private final JLabel title = new JLabel();
		//private final JLabel info = new JLabel("Presione 'ESC' para cerrar la ventana");
                private final JLabel info = new JLabel();
                private final JPanel headPanel = new JPanel();
                private final JDialog dialog;

		public UDialogBackPanel(final JDialog dialog) {
                        this.dialog = dialog;
			this.cmp = (JComponent) dialog.getContentPane();
                        
                        
                        ImageIcon image = null;
                        image = new ImageIcon(getClass().getResource("/com/wildc/ucumari/resources/close.png"));
                        image.setImage(image.getImage().getScaledInstance(18,18, Image.SCALE_DEFAULT));
                        info.setHorizontalAlignment(JLabel.CENTER);
                        info.setVerticalAlignment(JLabel.CENTER);
                        info.setIcon(image);
                        info.addMouseListener(new MouseAdapter() {
                            public void mouseClicked(MouseEvent e) {
                                fadeOut(dialog);
                            }
                        });
                        //info = new javax.swing.JLabel(image, JLabel.CENTER);
                        
                        //headPanel = new JPanel();
                        //headPanel.setSize(new Dimension(dialog.getWidth(), 30));
                        headPanel.setSize(new Dimension(308, 30));
                        //headPanel.setSize(cmp.getPreferredSize());
                        //headPanel.setBackground(Color.WHITE);
                        headPanel.setBackground(new Color(119,136,153));
                        
                        //headPanel.setOpaque(false);
                        //setBackground(new Color(100,50,50,100));
			setOpaque(false);
                        //setBackground(Color.yellow);
			setLayout(null);
			add(cmp);
			add(title);
			add(info);
                        add(headPanel);

			//cmp.setBorder(BorderFactory.createLineBorder(Color.WHITE, 4));
                        cmp.setBorder(BorderFactory.createLineBorder(new Color(119,136,153),4));
                        
			title.setFont(new Font("Tahoma", Font.BOLD, 14));
			title.setForeground(Color.BLACK);
			info.setForeground(Color.BLACK);

			title.setText(dialog.getTitle());
			title.setSize(title.getPreferredSize());
			info.setSize(info.getPreferredSize());
			cmp.setSize(cmp.getPreferredSize());
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
                        
			int w = getWidth();
			int h = getHeight();
                        
			//int shadowX = w/2 - (cmp.getWidth()+100)/2;
			//int shadowY = h/2 - (cmp.getHeight()+100)/2;
			cmp.setLocation(w/2-cmp.getWidth()/2, h/2-cmp.getHeight()/2);
			title.setLocation(w/2-cmp.getWidth()/2+4, h/2-cmp.getHeight()/2-title.getHeight());
			info.setLocation(w/2+cmp.getWidth()/2-info.getWidth()-4, h/2-cmp.getHeight()/2-info.getHeight());
                        headPanel.setLocation(w/2-cmp.getWidth()/2, h/2-cmp.getHeight()/2-info.getHeight()-6);
                        
			Graphics2D gg = (Graphics2D) g.create();
			gg.setPaint(fill);
			gg.fillRect(0, 0, w, h);
			//gg.drawImage(shadowImage.getImage(), shadowX, shadowY, cmp.getWidth()+100, cmp.getHeight()+100, null);
			gg.dispose();
		}
	}*/
        
    public static void enterPressesWhenFocused(JComponent componente){
        componente.registerKeyboardAction(
            componente.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)), 
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), 
                JComponent.WHEN_FOCUSED);

        componente.registerKeyboardAction(
            componente.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)), 
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), 
                JComponent.WHEN_FOCUSED);
    }

}
