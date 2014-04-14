package com.wildc.ucumari.client;

import com.wildc.ucumari.client.base.UFrameBase;
import com.wildc.ucumari.client.base.component.USynthStyleFactory;
import com.wildc.ucumari.client.base.util.Conexion;
import com.wildc.ucumari.party.client.ListaEmpleados;
import com.wildc.ucumari.security.model.UserLogin;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;
import javax.swing.plaf.synth.SynthLookAndFeel;





public class MdiPrincipal extends UFrameBase implements ActionListener {
    static java.util.TreeMap tree = new java.util.TreeMap();    
    
    private UserLogin usuario = null;
    
    /*private List<Menuview> listaMenu = null;*/
    

    public MdiPrincipal() {
        Conexion.getInstance();
        validarUsuario();
        //inicializaTreeMap();
       
        validarPerfil();
        initComponents();
        setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.WAIT_CURSOR));
        /*
        try{
            //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            for(UIManager.LookAndFeelInfo laf: UIManager.getInstalledLookAndFeels()) {
                System.out.println("lookand feel: "  + laf.getName() + " clase: " +laf.getClassName());
                if("Nimbus".equals(laf.getName())) {
                //if("Metal".equals(laf.getName())) {
                    UIManager.setLookAndFeel(laf.getClassName());
                    SynthLookAndFeel.setStyleFactory(
                        new USynthStyleFactory(SynthLookAndFeel.getStyleFactory()));
                    break;
                }
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        */
        
        
        //poblarMenu();
        //fondoPantalla();
        setIconImage((new ImageIcon(getClass().getResource("/com/wildc/ucumari/resources/logo.png"))).getImage());
        
       
        setSize(getToolkit().getScreenSize().width, getToolkit().getScreenSize().height);
        //inicializaVariables();
        setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.DEFAULT_CURSOR));
        
        //maximiza el mdi
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH); 
        
        //Alt + Enter y aparece la lista de ventanas
        btnVtaCon.setMnemonic(KeyEvent.VK_ENTER);    
        
        /*String titulo = "Sistema ERP - Ucumari, " + getUsuario().getCodUsuario().toUpperCase();
        setTitle(titulo);*/
        //setUndecorated( true );
        getRootPane().setWindowDecorationStyle( JRootPane. COLOR_CHOOSER_DIALOG );
        
        //Dimension dimension = new Dimension(WIDTH, WIDTH)
        
        //logPane.setBounds(0, 0, scrollDesktop.getBounds().width, scrollDesktop.getBounds().height);
        //logLabel.setBounds(0, 0, scrollDesktop.getBounds().width, scrollDesktop.getBounds().height);
        
        
        
        try{
            //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            for(UIManager.LookAndFeelInfo laf: UIManager.getInstalledLookAndFeels()) {
                System.out.println("lookand feel: "  + laf.getName() + " clase: " +laf.getClassName());
                if("Nimbus".equals(laf.getName())) {
                //if("Metal".equals(laf.getName())) {
                    UIManager.setLookAndFeel(laf.getClassName());
                    SynthLookAndFeel.setStyleFactory(
                        new USynthStyleFactory(SynthLookAndFeel.getStyleFactory()));
                    break;
                }
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        UIManager.getLookAndFeelDefaults().put("Button.background", Color.WHITE);
        /*
        UIManager.getLookAndFeelDefaults().put("Button.textForeground", Color.BLUE);
       */
        
}
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBar = new javax.swing.JToolBar();
        btnVtaCon = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        scrollArbol = new javax.swing.JScrollPane();
        scrollDesktop = new javax.swing.JScrollPane();
        desktop = new com.wildc.ucumari.client.base.DesktopUcumari();
        mnuBar = new javax.swing.JMenuBar();
        mHelp = new javax.swing.JMenu();
        mAbout = new javax.swing.JMenuItem();

        setTitle("Sistema de Ventas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        toolBar.setFloatable(false);

        btnVtaCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wildc/ucumari/resources/bt_buscar_up.gif"))); // NOI18N
        btnVtaCon.setToolTipText("Ventanas Abiertas");
        btnVtaCon.setMaximumSize(new java.awt.Dimension(30, 30));
        btnVtaCon.setMinimumSize(new java.awt.Dimension(30, 30));
        btnVtaCon.setPreferredSize(new java.awt.Dimension(30, 30));
        btnVtaCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVtaConActionPerformed(evt);
            }
        });
        toolBar.add(btnVtaCon);

        btnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wildc/ucumari/resources/bt_imprimir_up.gif"))); // NOI18N
        btnReporte.setToolTipText("Imprimir");
        btnReporte.setMaximumSize(new java.awt.Dimension(30, 30));
        btnReporte.setMinimumSize(new java.awt.Dimension(30, 30));
        btnReporte.setPreferredSize(new java.awt.Dimension(30, 30));
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        toolBar.add(btnReporte);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wildc/ucumari/resources/bt_salir_up.gif"))); // NOI18N
        btnSalir.setToolTipText("Salir");
        btnSalir.setMaximumSize(new java.awt.Dimension(30, 30));
        btnSalir.setMinimumSize(new java.awt.Dimension(30, 30));
        btnSalir.setPreferredSize(new java.awt.Dimension(30, 30));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        toolBar.add(btnSalir);

        getContentPane().add(toolBar, java.awt.BorderLayout.NORTH);

        jSplitPane1.setBorder(null);
        jSplitPane1.setDividerSize(6);
        jSplitPane1.setAutoscrolls(true);
        jSplitPane1.setOneTouchExpandable(true);

        scrollArbol.setBackground(new java.awt.Color(204, 204, 204));
        scrollArbol.setMinimumSize(new java.awt.Dimension(120, 100));
        scrollArbol.setPreferredSize(new java.awt.Dimension(150, 120));
        jSplitPane1.setLeftComponent(scrollArbol);

        desktop.setBackground(new java.awt.Color(204, 204, 204));
        desktop.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        scrollDesktop.setViewportView(desktop);

        jSplitPane1.setRightComponent(scrollDesktop);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        mHelp.setText("Ayuda");

        mAbout.setText("Acerca de..");
        mAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAboutActionPerformed(evt);
            }
        });
        mHelp.add(mAbout);

        mnuBar.add(mHelp);

        setJMenuBar(mnuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        JTable t = null;         
        /*
        if(desktop.getSelectedFrame() instanceof ItfConsulta){
            ItfConsulta i = (ItfConsulta)desktop.getSelectedFrame();  
            
            if(i!=null){               
               t = i.getTabla();
            }
            
            if(t==null)
                JOptionPane.showMessageDialog(this,"La ventana seleccionada no tiene un reporte definido.");
            else{            
                try{        
                    ReporteConvertido report = new ReporteConvertido(t,i.getTitle(),this);
                }
                catch(Exception e){System.out.println(e);}
            }
                                   
        }        */
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        try{           
            System.exit(0);
        }catch(Exception e){System.out.println(""+e);}
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVtaConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVtaConActionPerformed
       /*DlgRelVentanas dlgRelVen = new DlgRelVentanas(this,true,desktop);
       dlgRelVen.setVisible(true);*/
       //dlgRelVen.show();
    }//GEN-LAST:event_btnVtaConActionPerformed
    
    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        try{
           
            System.exit(0);
        }catch(Exception e){System.out.println(""+e);}
    }//GEN-LAST:event_exitForm

    private void mAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAboutActionPerformed
        /*UAboutDialog uAboutDialog = new UAboutDialog(this, true);        
        
        uAboutDialog.dispose();*/
      ListaEmpleados frame4 = new ListaEmpleados(this);
        frame4.setSize(660, 400);
        desktop.add(frame4);        
        //frame3.setVisible(true);
        desktop.getDesktopManager().activateFrame(frame4);
    }//GEN-LAST:event_mAboutActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
               

        /*
        try{
            //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            for(UIManager.LookAndFeelInfo laf: UIManager.getInstalledLookAndFeels()) {
                System.out.println("lookand feel: "  + laf.getName() + " clase: " +laf.getClassName());
                if("Nimbus".equals(laf.getName())) {
                //if("Metal".equals(laf.getName())) {
                    UIManager.setLookAndFeel(laf.getClassName());
                    SynthLookAndFeel.setStyleFactory(
                        new USynthStyleFactory(SynthLookAndFeel.getStyleFactory()));
                    
                    
                    break;
                }
            }
        }catch(Exception e) {
            e.printStackTrace();
        }*/
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        UIManager.getLookAndFeelDefaults().put("Button.background", Color.WHITE);
        //UIManager.getLookAndFeelDefaults().put("Button.textForeground", Color.BLUE);
        //UIManager.getLookAndFeelDefaults().put("ToolBar.background", Color.BLACK);
        
        try{            
            new MdiPrincipal().setVisible(true);
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
    /*
     private void poblarMenu(Menuview menu, JMenu menuswing, String grupo){
        if(menu.getListSubMenu()!=null){
           for(int i=0; i<menu.getListSubMenu().size();i++){
               
               if(menu.getListSubMenu().get(i).getListSubMenu()==null){                  
                   JMenuItem mnuNivel3 = menuswing.add(new JMenuItem(menu.getListSubMenu().get(i).getMenu().getNombre(), new Integer(menu.getListSubMenu().get(i).getMenu().getNemonico().toCharArray()[0])));
                   mnuNivel3.addActionListener(this);
                   mnuNivel3.setToolTipText(menu.getListSubMenu().get(i).getMenu().getDescripcion());
               }else{
                   javax.swing.JMenu mnuNivel2 = new javax.swing.JMenu(menu.getListSubMenu().get(i).getMenu().getNombre());               
                   String grupoant = null;
                   if(i>0)
                       grupoant = menu.getListSubMenu().get(i-1).getMenu().getGrupo();
                   poblarMenu(menu.getListSubMenu().get(i), mnuNivel2, grupoant);

                   if(!menu.getMenu().getGrupo().equals(grupo) && grupo != null)
                       menuswing.addSeparator();
                   menuswing.add(mnuNivel2);
               }
           }
        }else{
            if(!menu.getMenu().getGrupo().equals(grupo) && grupo != null)
                menuswing.addSeparator();
            //menuswing.addActionListener(this);
            //menuswing.setToolTipText(menu.getMenu().getDescripcion());
            //menuswing.setMnemonic(new Integer(menu.getMenu().getNemonico().toCharArray()[0]));
            JMenuItem mnuNivel3 = menuswing.add(new JMenuItem(menu.getMenu().getNombre(), new Integer(menu.getMenu().getNemonico().toCharArray()[0])));
            mnuNivel3.addActionListener(this);
            mnuNivel3.setToolTipText(menu.getMenu().getDescripcion());

            //if (menu.getNu_key_code()>0 || menu.getNu_modifiers()>0)
            //    mnuNivel3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(menu.getNu_key_code(), menu.getNu_modifiers()));
        }        
    }
     
    private void poblarArbol(Menuview menu, DefaultTreeModel nodobase, DefaultMutableTreeNode nodopadre){
        if(menu.getListSubMenu()!=null){
           for(int i=0; i<menu.getListSubMenu().size();i++){               
               if(menu.getListSubMenu().get(i).getListSubMenu()==null){
                   DefaultMutableTreeNode nodoNivel3 = new DefaultMutableTreeNode(menu.getListSubMenu().get(i).getMenu().getNombre());
                   nodobase.insertNodeInto(nodoNivel3, nodopadre, i);
               }else{
                   DefaultMutableTreeNode nodoNivel2 = new DefaultMutableTreeNode(menu.getListSubMenu().get(i).getMenu().getNombre());
                   nodobase.insertNodeInto(nodoNivel2, nodopadre, i);
                   poblarArbol(menu.getListSubMenu().get(i), nodobase, nodoNivel2);
               }           
           }
        }else{
            DefaultMutableTreeNode nodoNivel3 = new DefaultMutableTreeNode(menu.getMenu().getNombre());            
            nodobase.insertNodeInto(nodoNivel3,nodopadre, 0);
        }
    }
        
    private void poblarMenu(){
        BResult result = Conexion.getAdministracionDelegate().obtenerAccesoByIdEmpresaIdUsuario(usuario);
        if(result.getCodigo().equals("1")){
            listaMenu = (List<Menuview>)result.getValue();
            DefaultMutableTreeNode base = new DefaultMutableTreeNode("Menu");
            DefaultTreeModel mbase = new DefaultTreeModel(base);
            
            System.out.println(listaMenu.size());
            for(int i=0; i<listaMenu.size(); i++){
                //javax.swing.JMenu mnuNivel1 = mnuBar.add(new javax.swing.JMenu(listaMenu.get(i).getSt_nombre()));
                //poblarMenu(listaMenu.get(i),mnuNivel1,null);
                javax.swing.JMenu mnuNivel1 = mnuBar.add(new javax.swing.JMenu(listaMenu.get(i).getMenu().getNombre()));
                
                DefaultMutableTreeNode nodo1 = new DefaultMutableTreeNode(listaMenu.get(i).getMenu().getNombre());               
                
                mbase.insertNodeInto(nodo1, base, i);
                poblarMenu(listaMenu.get(i),mnuNivel1,null);
                poblarArbol(listaMenu.get(i), mbase, nodo1);
                //arbolOpciones.ad                
            }
            //arbolOpciones = new JTree(mbase);
            arbolOpciones.setModel(mbase);
            arbolOpciones.setEditable(false);
            //scrollArbol = new JScrollPane(arbolOpciones);
        }
    }*/
  
    private void fondoPantalla(){
        
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                if (g instanceof Graphics2D) {
                    final int R = 240;
                    final int G = 240;
                    final int B = 240;

                    Paint p =
                        new GradientPaint(0.0f, 0.0f, new Color(R, G, B, 0),
                            0.0f, getHeight(), new Color(R, G, B, 255), true);
                    Graphics2D g2d = (Graphics2D)g;
                    g2d.setPaint(p);
                    g2d.fillRect(0, 0, getWidth(), getHeight());
                }
            }
        };
        desktop.setBackground(new Color(0,0,0,0));
        desktop.add(panel);
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    /*
    public MenuTO getMenuForName(String name){
        return Conexion.getAdministracionDelegate().getMenuByNombre(name);
    }*/
    
    public void actionPerformed(ActionEvent e){
        String nombreAction = e.getActionCommand();
        System.out.println(e.getSource());
        System.out.println(nombreAction);
                
        if(nombreAction.compareTo("Salir")==0){
            try{
                
                System.exit(0);
            }catch(Exception ex){System.out.println(""+ex);}
        }
        
        else if(nombreAction.compareTo("Imprimir")==0)
            btnReporte.doClick();
        else if(nombreAction.compareTo("Cerrar Sesi�n")==0){
            this.dispose();
            new MdiPrincipal().setVisible(true);
        }
        //else
            /*
            if(!esOpcionAbierta(nombreAction)){
                
                ItfConsulta f = new ItfConsulta(desktop);

                desktop.add(f);
                try{
                    f.setIcon(false);
                    f.setSelected(true);
                }
                catch(Exception z){
                    addMessage(z.getMessage());
                    //JOptionPane.showMessageDialog(this,z.getMessage());
                                       
                    z.printStackTrace();
                }                
               
                f.inicializaItf(nombreAction, getMenuForName(nombreAction));
                //cascada
                //f.setLocation(liX*30+liNv*30, liY*30);
                f.setLocation(0,0);                
            }*/
    }

    private boolean esOpcionAbierta(String esTitulo){
        //Verifica que una opci�n no esta abierta, si ya est� abierta la pone visible
        JInternalFrame[] laItf = desktop.getAllFrames();
        
        for(int i=0; i<laItf.length; i++)
            if(esTitulo.compareTo(laItf[i].getTitle())==0){
                // La opci�n ya esta abierta, la hago visible
                try{
                    laItf[i].setIcon(false);
                    laItf[i].setSelected(true);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(this,e.getMessage());
                    e.printStackTrace();
                }
                return true;
            }
        return false;
    }

    public UserLogin getUsuario() {
        return usuario;
    }

    public void setUsuario(UserLogin usuario) {
        this.usuario = usuario;
    }

    
    
    private void validarUsuario(){        
        UDialogLogin dlgLogin = new UDialogLogin(this, true);        
        
        dlgLogin.dispose();
       
        if (Conexion.getUserSession()== null)
            System.exit(0);
    }
    
    private void validarPerfil(){
        //Conexion.getAdministracionDelegate().l
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVtaCon;
    private com.wildc.ucumari.client.base.DesktopUcumari desktop;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JMenuItem mAbout;
    private javax.swing.JMenu mHelp;
    private javax.swing.JMenuBar mnuBar;
    private javax.swing.JScrollPane scrollArbol;
    private javax.swing.JScrollPane scrollDesktop;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables

    
   
}


