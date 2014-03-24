/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wildc.ucumari.client.base.component;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.lang.reflect.Field;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author P018906
 */
public class UTable<T> extends javax.swing.JPanel {

    /**
     * Creates new form UPanelTable
     */
    public UTable(){
        initComponents();
    }

    public List<T> getListObject() {
        return listObject;
    }

    public void setListObject(List<T> listObject) {
        this.listObject = listObject;
        
        if(listObject != null && listObject.size()>0){
            if(listObject.size()%filasPorPagina == 0){
                ultimaPagina = listObject.size()/filasPorPagina;
            }else{
                ultimaPagina = listObject.size()/filasPorPagina + 1;
            }            
        }
        
        primero();
        
        
    }
    
    private void cargaPagina(){
        if(listObject != null && listObject.size()>0){
            int cont = paginaActual * filasPorPagina - filasPorPagina;
            int maxFilas = paginaActual * filasPorPagina < listObject.size()?paginaActual * filasPorPagina:listObject.size();
            System.out.println("maxFilas "+ maxFilas);
            System.out.println("paginaActual "+ paginaActual);
            //if(maxFilas>paginaActual * filasPorPagina){
            if(maxFilas%filasPorPagina!=0){
                 System.out.println("maxFilas%filasPorPagina "+ maxFilas%filasPorPagina);
                contenidoActual = new Object[maxFilas%filasPorPagina][listContenido.size()];
            }else{
                contenidoActual = new Object[filasPorPagina][listContenido.size()];
            }
            System.out.println("nro filas "+ contenidoActual.length);
            int continterno =0;
            while(cont < maxFilas){
                for(int i=0; i<listContenido.size(); i++){
                    try{                        
                        Field field = domainClass.getDeclaredField(listContenido.get(i));
                        field.setAccessible(true);                        
                        contenidoActual[continterno][i] = field.get(listObject.get(cont))==null?"":field.get(listObject.get(cont)).toString();
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
                continterno++;
                cont++;                        
            }
        }else{
            contenidoActual = new Object [][] {};
        }
        
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            contenidoActual,
            listHead.toArray()
        ));
        
        
    }
    
    private void primero(){
        
        paginaActual = 1;
        cargaPagina();
        
    }
    private void ultimo(){
        
        paginaActual = ultimaPagina;
        cargaPagina();
    }
    
    private void siguiente(){
        if(paginaActual < ultimaPagina){
            paginaActual = paginaActual + 1;
            cargaPagina();
        }
    }
    
    private void anterior(){
       
        if(paginaActual>1){
            paginaActual = paginaActual - 1;
            cargaPagina();
        }        
    }

    public List<String> getListHead() {
        return listHead;
    }

    public void setListHead(List<String> listHead) {
        this.listHead = listHead;
    }

    public List<String> getListContenido() {
        return listContenido;
    }

    public void setListContenido(List<String> listContenido) {
        this.listContenido = listContenido;
    }
    
   
    public int getFilasPorPagina() {
        return filasPorPagina;
    }

    public void setFilasPorPagina(int filasPorPagina) {
        this.filasPorPagina = filasPorPagina;
    }

    public Class<T> getDomainClass() {
        return domainClass;
    }

    public void setDomainClass(Class<T> domainClass) {
        this.domainClass = domainClass;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        pnlBotonera = new javax.swing.JPanel();
        btnPrimero = new com.wildc.ucumari.client.base.component.UToolBarButton();
        btnAtras = new com.wildc.ucumari.client.base.component.UToolBarButton();
        btnAdelante = new com.wildc.ucumari.client.base.component.UToolBarButton();
        btnUltimo = new com.wildc.ucumari.client.base.component.UToolBarButton();

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        ((DefaultTableCellRenderer)jTable.getDefaultRenderer(Object.class)).setOpaque(false);
        jTable.setOpaque(false);
        jScrollPane1.setViewportView(jTable);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jTable.getTableHeader().setOpaque(false);

        jTable.setSelectionBackground(Color.red);
        jTable.getTableHeader().setBackground(new Color(205,209,235));
        jTable.setDefaultRenderer(Object.class, new TableCellRenderer(){
            private DefaultTableCellRenderer DEFAULT_RENDERER =  new DefaultTableCellRenderer();
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (!isSelected) {
                    if (row%2 == 0){
                        //c.setBackground(Color.WHITE);
                        c.setBackground(new Color(100,100,50,100));

                    }
                    else {
                        c.setBackground(new Color(100,120,70,100));
                    }
                }
                return c;
            }

        });

        jTable.getTableHeader().setDefaultRenderer(new TableCellRenderer(){
            private DefaultTableCellRenderer DEFAULT_RENDERER =  new DefaultTableCellRenderer();
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                c.setForeground(new Color(100,120,70));
                c.setBackground(new Color(100,120,70,100));

                return c;
            }
        });

        //jTable1.getTableHeader().setBackground(Color.white);
        //jTable1.getTableHeader().setBackground(new Color(50,0,0,0.5f));
        //jTable1.getTableHeader().setForeground(Color.white);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pnlBotonera.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        pnlBotonera.setMaximumSize(new java.awt.Dimension(32767, 33));
        pnlBotonera.setOpaque(false);
        pnlBotonera.setPreferredSize(new java.awt.Dimension(143, 35));

        btnPrimero.setBackground(new java.awt.Color(0, 51, 153));
        btnPrimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wildc/ucumari/resources/primero.png"))); // NOI18N
        btnPrimero.setToolTipText("");
        btnPrimero.setMaximumSize(new java.awt.Dimension(30, 30));
        btnPrimero.setMinimumSize(new java.awt.Dimension(30, 30));
        btnPrimero.setPreferredSize(new java.awt.Dimension(30, 30));
        btnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroActionPerformed(evt);
            }
        });
        pnlBotonera.add(btnPrimero);

        btnAtras.setBackground(new java.awt.Color(255, 255, 255));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wildc/ucumari/resources/atras.png"))); // NOI18N
        btnAtras.setToolTipText("");
        btnAtras.setMaximumSize(new java.awt.Dimension(30, 30));
        btnAtras.setMinimumSize(new java.awt.Dimension(30, 30));
        btnAtras.setPreferredSize(new java.awt.Dimension(30, 30));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        pnlBotonera.add(btnAtras);

        btnAdelante.setBackground(new java.awt.Color(255, 255, 255));
        btnAdelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wildc/ucumari/resources/adelante.png"))); // NOI18N
        btnAdelante.setToolTipText("");
        btnAdelante.setMargin(new java.awt.Insets(2, 20, 2, 20));
        btnAdelante.setMaximumSize(new java.awt.Dimension(30, 30));
        btnAdelante.setMinimumSize(new java.awt.Dimension(30, 30));
        btnAdelante.setPreferredSize(new java.awt.Dimension(30, 30));
        btnAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdelanteActionPerformed(evt);
            }
        });
        pnlBotonera.add(btnAdelante);

        btnUltimo.setBackground(new java.awt.Color(255, 255, 255));
        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wildc/ucumari/resources/ultimo.png"))); // NOI18N
        btnUltimo.setToolTipText("");
        btnUltimo.setMaximumSize(new java.awt.Dimension(30, 30));
        btnUltimo.setMinimumSize(new java.awt.Dimension(30, 30));
        btnUltimo.setPreferredSize(new java.awt.Dimension(30, 30));
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });
        pnlBotonera.add(btnUltimo);

        add(pnlBotonera, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        primero();
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        anterior();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdelanteActionPerformed
        siguiente();
    }//GEN-LAST:event_btnAdelanteActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        ultimo();
    }//GEN-LAST:event_btnUltimoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wildc.ucumari.client.base.component.UToolBarButton btnAdelante;
    private com.wildc.ucumari.client.base.component.UToolBarButton btnAtras;
    private com.wildc.ucumari.client.base.component.UToolBarButton btnPrimero;
    private com.wildc.ucumari.client.base.component.UToolBarButton btnUltimo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JPanel pnlBotonera;
    // End of variables declaration//GEN-END:variables
    //private T object;
    protected Class<T> domainClass;
    private List<T> listObject;
    private List<String> listHead;
    private List<String> listContenido;
    private int filasPorPagina = 10;
    private int paginaActual = 1;
    private Object[][] contenidoActual;
    private int ultimaPagina;
}