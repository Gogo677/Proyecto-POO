/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.Document;

/**
 *
 * @author diego
 */
public class Ejecutor extends javax.swing.JFrame {

    /**
     * Creates new form Ejecutor
     * @param teoria
     * @param imagen
     * @param ejecutable
     */
    private final Archivo a;
    private String texto;
    private final String teoria;
    private final String imagen;
    private final String codigo;
    
    public Ejecutor(String ArchivoTeoria,String ArchivoCodigo, String imagen) {
        a=new Archivo();
        this.teoria=ArchivoTeoria;
        this.imagen=imagen;
        this.codigo=ArchivoCodigo;      
        initComponents();
        actualizaTexto(teoria);        
    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoTipoDato = new javax.swing.ButtonGroup();
        grupotextio = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonTeoria = new javax.swing.JRadioButton();
        botonCodigo = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CuadroTexto = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ejecutor");
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(1254, 618));
        jPanel1.setMinimumSize(new java.awt.Dimension(1254, 618));
        jPanel1.setLayout(null);

        jButton2.setText("Cerrar ventana");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(900, 490, 170, 23);

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/"+imagen)));
        jLabel1.setMaximumSize(new java.awt.Dimension(400, 400));
        jLabel1.setMinimumSize(new java.awt.Dimension(400, 400));
        jLabel1.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(780, 50, 400, 400);

        botonTeoria.setBackground(new java.awt.Color(0, 0, 0));
        grupotextio.add(botonTeoria);
        botonTeoria.setForeground(new java.awt.Color(255, 255, 255));
        botonTeoria.setSelected(true);
        botonTeoria.setText("teoría");
        botonTeoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTeoriaActionPerformed(evt);
            }
        });
        jPanel1.add(botonTeoria);
        botonTeoria.setBounds(380, 550, 57, 23);

        botonCodigo.setBackground(new java.awt.Color(0, 0, 0));
        grupotextio.add(botonCodigo);
        botonCodigo.setForeground(new java.awt.Color(255, 255, 255));
        botonCodigo.setText("código ejemplo");
        botonCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(botonCodigo);
        botonCodigo.setBounds(360, 580, 250, 23);

        CuadroTexto.setEditable(false);
        CuadroTexto.setColumns(20);
        CuadroTexto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        CuadroTexto.setRows(5);
        CuadroTexto.setText(texto);
        CuadroTexto.setAutoscrolls(false);
        CuadroTexto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        CuadroTexto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CuadroTexto.setMaximumSize(new java.awt.Dimension(222, 77));
        CuadroTexto.setMinimumSize(new java.awt.Dimension(222, 77));
        CuadroTexto.setSelectionColor(new java.awt.Color(0, 102, 204));
        jScrollPane2.setViewportView(CuadroTexto);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(30, 50, 693, 472);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Selección de texto:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(360, 530, 210, 14);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoEjecutor.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 1250, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonTeoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTeoriaActionPerformed
        actualizaTexto(teoria);
    }//GEN-LAST:event_botonTeoriaActionPerformed

    private void botonCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCodigoActionPerformed
        actualizaTexto(codigo);
    }//GEN-LAST:event_botonCodigoActionPerformed
    
    private void actualizaTexto(String actualiza){
     try {
            texto=a.leer(new URI(getClass().getProtectionDomain().getCodeSource().getLocation().toString()+"teoriaYcodigos/"+actualiza));
        } catch (URISyntaxException ex) {
            Logger.getLogger(Ejecutor.class.getName()).log(Level.SEVERE, null, ex);
        }
        CuadroTexto.setText(texto);
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CuadroTexto;
    private javax.swing.JRadioButton botonCodigo;
    private javax.swing.JRadioButton botonTeoria;
    private javax.swing.ButtonGroup grupoTipoDato;
    private javax.swing.ButtonGroup grupotextio;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
