/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author diego
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        BotonSalir = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        Pila = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        botonCola = new javax.swing.JMenuItem();
        botonColaCircular = new javax.swing.JMenuItem();
        Listas = new javax.swing.JMenu();
        botonListaOrdenada = new javax.swing.JMenuItem();
        botonListaDoblementeLigada = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        botonArbol = new javax.swing.JMenuItem();
        botonArbolB = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        botonInsercionDirecta = new javax.swing.JMenuItem();
        insercionBinaria = new javax.swing.JMenuItem();
        SeleccionDirecta = new javax.swing.JMenuItem();
        burbuja = new javax.swing.JMenuItem();
        sacudida = new javax.swing.JMenuItem();
        shell = new javax.swing.JMenuItem();
        Quicksort = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        merguedort = new javax.swing.JMenuItem();
        naturalmix = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Estructura de datos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\proyecto\\imagenes\\logomacletras.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(780, 20, 290, 174);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 153, 0));
        jLabel3.setText("Pérez García Víctor Kevin");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 250, 196, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Proyecto Final Grupo 1351");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(270, 120, 220, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 153, 0));
        jLabel6.setText("Islas López Estefanny");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 280, 171, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 153, 0));
        jLabel7.setText("López Servin Mauricio");
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(100, 310, 171, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 153, 0));
        jLabel8.setText("Jiménez González Diego");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 220, 190, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 153, 0));
        jLabel9.setText("Integrantes del equipo:");
        jLabel9.setToolTipText("");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 190, 184, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 0));
        jLabel10.setText("Tutorial de Estructuras de datos");
        jLabel10.setToolTipText("");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 40, 690, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\proyecto\\imagenes\\gif.gif")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(430, 190, 550, 310);

        fondo.setIcon(new javax.swing.ImageIcon("C:\\proyecto\\imagenes\\fonfo.jpg")); // NOI18N
        fondo.setText("jLabel2");
        jPanel1.add(fondo);
        fondo.setBounds(10, 10, 1280, 920);

        jMenu1.setText("Archivo");

        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        jMenu1.add(BotonSalir);

        jMenuBar1.add(jMenu1);

        jMenu10.setText("Estructuras de datos");

        jMenu3.setText("Estructuras de datos lineales");

        Pila.setText("Pila");
        Pila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PilaActionPerformed(evt);
            }
        });
        jMenu3.add(Pila);

        jMenu5.setText("Cola");

        botonCola.setText("Cola");
        botonCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonColaActionPerformed(evt);
            }
        });
        jMenu5.add(botonCola);

        botonColaCircular.setText("Cola circular");
        botonColaCircular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonColaCircularActionPerformed(evt);
            }
        });
        jMenu5.add(botonColaCircular);

        jMenu3.add(jMenu5);

        Listas.setText("Listas");

        botonListaOrdenada.setText("Lista ordenada");
        botonListaOrdenada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListaOrdenadaActionPerformed(evt);
            }
        });
        Listas.add(botonListaOrdenada);

        botonListaDoblementeLigada.setText("Lista doblemente ligada");
        botonListaDoblementeLigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListaDoblementeLigadaActionPerformed(evt);
            }
        });
        Listas.add(botonListaDoblementeLigada);

        jMenu3.add(Listas);

        jMenu10.add(jMenu3);

        jMenu4.setText("Estructuras de datos no lineales");

        botonArbol.setText("Árboles ");
        botonArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArbolActionPerformed(evt);
            }
        });
        jMenu4.add(botonArbol);

        botonArbolB.setText("Árboles multicamino");
        botonArbolB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArbolBActionPerformed(evt);
            }
        });
        jMenu4.add(botonArbolB);

        jMenu10.add(jMenu4);

        jMenuBar1.add(jMenu10);

        jMenu8.setText("Álgoritmos de ordenación");

        jMenu2.setText("Ordenación por vector");

        botonInsercionDirecta.setText("Insercion directa");
        botonInsercionDirecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsercionDirectaActionPerformed(evt);
            }
        });
        jMenu2.add(botonInsercionDirecta);

        insercionBinaria.setText("Inserción Binaria");
        insercionBinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insercionBinariaActionPerformed(evt);
            }
        });
        jMenu2.add(insercionBinaria);

        SeleccionDirecta.setText("Selección directa");
        SeleccionDirecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionDirectaActionPerformed(evt);
            }
        });
        jMenu2.add(SeleccionDirecta);

        burbuja.setText("Intercambio directo (burbuja)");
        burbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burbujaActionPerformed(evt);
            }
        });
        jMenu2.add(burbuja);

        sacudida.setText("Sacudida");
        sacudida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacudidaActionPerformed(evt);
            }
        });
        jMenu2.add(sacudida);

        shell.setText("Shell");
        shell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shellActionPerformed(evt);
            }
        });
        jMenu2.add(shell);

        Quicksort.setText(" Ordenación por partición (Quicksort)");
        Quicksort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuicksortActionPerformed(evt);
            }
        });
        jMenu2.add(Quicksort);

        jMenu8.add(jMenu2);

        jMenu6.setText("Ordenación por archivos ");

        merguedort.setText("Mezcla directa (mergue sort)");
        merguedort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                merguedortActionPerformed(evt);
            }
        });
        jMenu6.add(merguedort);

        naturalmix.setText("Mezcla natural ");
        naturalmix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naturalmixActionPerformed(evt);
            }
        });
        jMenu6.add(naturalmix);

        jMenu8.add(jMenu6);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1085, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void PilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PilaActionPerformed
        // TODO add your handling code here:
        Ejecutor ventana = new Ejecutor("pila","pila.jpg");
            ventana.setVisible(true);
    }//GEN-LAST:event_PilaActionPerformed

    private void botonColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonColaActionPerformed
        // TODO add your handling code here:
        Ejecutor ventana = new Ejecutor("cola","cola.jpg");
            ventana.setVisible(true);
    }//GEN-LAST:event_botonColaActionPerformed

    private void botonArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArbolActionPerformed
        EjecutorUnico ventana = new EjecutorUnico("arbol","arbol.jpg");
            ventana.setVisible(true);
    }//GEN-LAST:event_botonArbolActionPerformed

    private void botonColaCircularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonColaCircularActionPerformed
        // TODO add your handling code here:
        Ejecutor ventana = new Ejecutor("colaCircular","cola.jpg");
            ventana.setVisible(true);
    }//GEN-LAST:event_botonColaCircularActionPerformed

    private void botonListaDoblementeLigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListaDoblementeLigadaActionPerformed
        // TODO add your handling code here:
        Ejecutor ventana = new Ejecutor("listaDoblementeLigada","lista.jpg");
            ventana.setVisible(true);
    }//GEN-LAST:event_botonListaDoblementeLigadaActionPerformed

    private void botonListaOrdenadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListaOrdenadaActionPerformed
        // TODO add your handling code here:
        Ejecutor ventana = new Ejecutor("listaOrdenada","lista.jpg");
            ventana.setVisible(true);
    }//GEN-LAST:event_botonListaOrdenadaActionPerformed

    private void botonArbolBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArbolBActionPerformed
        // TODO add your handling code here:
         EjecutorUnico ventana = new EjecutorUnico("arbolB","arbolB.jpg");
           ventana.setVisible(true);
    }//GEN-LAST:event_botonArbolBActionPerformed

    private void QuicksortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuicksortActionPerformed
        // TODO add your handling code here:
        EjecutorUnico ventana = new EjecutorUnico("quicksort","ordenacion.jpg");
        ventana.setVisible(true);
    }//GEN-LAST:event_QuicksortActionPerformed

    private void burbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burbujaActionPerformed
        // TODO add your handling code here:
        EjecutorUnico ventana = new EjecutorUnico("burbuja","ordenacion.jpg");
        ventana.setVisible(true);
    }//GEN-LAST:event_burbujaActionPerformed

    private void botonInsercionDirectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsercionDirectaActionPerformed
        EjecutorUnico ventana = new EjecutorUnico("insercionDirecta","ordenacion.jpg");
        ventana.setVisible(true);
    }//GEN-LAST:event_botonInsercionDirectaActionPerformed

    private void insercionBinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insercionBinariaActionPerformed
        // TODO add your handling code here:
        EjecutorUnico ventana = new EjecutorUnico("insercionBinaria","ordenacion.jpg");
        ventana.setVisible(true);
    }//GEN-LAST:event_insercionBinariaActionPerformed

    private void sacudidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacudidaActionPerformed
        // TODO add your handling code here:
        EjecutorUnico ventana = new EjecutorUnico("sacudida","ordenacion.jpg");
        ventana.setVisible(true);
    }//GEN-LAST:event_sacudidaActionPerformed

    private void SeleccionDirectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionDirectaActionPerformed
        // TODO add your handling code here:
        EjecutorUnico ventana = new EjecutorUnico("seleccion","ordenacion.jpg");
        ventana.setVisible(true);
    }//GEN-LAST:event_SeleccionDirectaActionPerformed

    private void shellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shellActionPerformed
        // TODO add your handling code here:
        EjecutorUnico ventana = new EjecutorUnico("shell","ordenacion.jpg");
        ventana.setVisible(true);
    }//GEN-LAST:event_shellActionPerformed

    private void merguedortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_merguedortActionPerformed
        // TODO add your handling code here:
        EjecutorUnico ventana = new EjecutorUnico("merguesort","ordenacion.jpg");
        ventana.setVisible(true);
    }//GEN-LAST:event_merguedortActionPerformed

    private void naturalmixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naturalmixActionPerformed
        // TODO add your handling code here:
        EjecutorUnico ventana = new EjecutorUnico("natural","ordenacion.jpg");
        ventana.setVisible(true);
    }//GEN-LAST:event_naturalmixActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BotonSalir;
    private javax.swing.JMenu Listas;
    private javax.swing.JMenuItem Pila;
    private javax.swing.JMenuItem Quicksort;
    private javax.swing.JMenuItem SeleccionDirecta;
    private javax.swing.JMenuItem botonArbol;
    private javax.swing.JMenuItem botonArbolB;
    private javax.swing.JMenuItem botonCola;
    private javax.swing.JMenuItem botonColaCircular;
    private javax.swing.JMenuItem botonInsercionDirecta;
    private javax.swing.JMenuItem botonListaDoblementeLigada;
    private javax.swing.JMenuItem botonListaOrdenada;
    private javax.swing.JMenuItem burbuja;
    private javax.swing.JLabel fondo;
    private javax.swing.JMenuItem insercionBinaria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem merguedort;
    private javax.swing.JMenuItem naturalmix;
    private javax.swing.JMenuItem sacudida;
    private javax.swing.JMenuItem shell;
    // End of variables declaration//GEN-END:variables
}
