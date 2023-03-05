package componentes;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Tablero extends JFrame {
    private JButton btnCrear;
    private JButton btnBorrar;
    private JLabel lbFila;
    private JLabel lbColumna;
    private JPanel plDatos;
    private JPanel plTablero;
    private JTextField txFila;
    private JTextField txColumna;
    
    private int columna = 0;
    private int fila = 0;
    private static final int tableroFila = 500;
    private static final int tableroColumna = 500;
    
    //Matriz de check
    JTextField[][] checks;
    
   
    public Tablero() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    private void initComponents() {

        plDatos = new JPanel();
        lbFila = new JLabel();
        txFila = new JTextField();
        lbColumna = new JLabel();
        txColumna = new JTextField();
        btnBorrar = new JButton();
        btnCrear = new JButton();
        plTablero = new JPanel();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Componentes Dinamicos");
        setName("Tablero"); 
        setPreferredSize(null);
        setResizable(false);
        setSize(500,500);

        lbFila.setText("Renglones:");
        txFila.setPreferredSize(new Dimension(50,20));

        lbColumna.setText("Columnas:");
        txColumna.setPreferredSize(new Dimension(50,20));      

        btnBorrar.setText("Destruir");
        btnBorrar.setToolTipText("");
        btnBorrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                borrar(evt);
            }
        });

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                crear(evt);
            }
        });


        GroupLayout plDatosLayout = new GroupLayout(plDatos);
        
        plDatos.setLayout(plDatosLayout);
        plDatosLayout.setHorizontalGroup(
            plDatosLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(plDatosLayout.createSequentialGroup()
                .addComponent(lbFila)
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addComponent(txFila, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbColumna)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txColumna, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrear)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBorrar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        plDatosLayout.setVerticalGroup(
            plDatosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, plDatosLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(plDatosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(plDatosLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lbFila)
                        .addComponent(txFila, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbColumna)
                        .addComponent(txColumna, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCrear)
                        .addComponent(btnBorrar))))
        );

        plTablero.setBackground(new Color(204, 204, 204));
        plTablero.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        plTablero.setToolTipText("");

        GroupLayout plTableroLayout = new GroupLayout(plTablero);
        plTablero.setLayout(plTableroLayout);
        plTableroLayout.setHorizontalGroup(
            plTableroLayout.createParallelGroup(Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        plTableroLayout.setVerticalGroup(
            plTableroLayout.createParallelGroup(Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(plTablero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(plDatos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plDatos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(plTablero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

   

    private void crear(ActionEvent evt) {
    	
        //valida el rango de filas y columnas
        if(validarTamano())
        {
            //Se coloca el tamaño de la matriz de checks
            checks = new JTextField[fila][columna];
            //Se coloca el tamaño de gridLayout del panel del tablero
            plTablero.setLayout(new GridLayout(fila,columna));
           
            //Se declaran los contadores a utilizar
            int contFila, contColumna;

            for (contFila = 0; contFila < fila; contFila++)
            {
                //Se recorre la dimension Y desde 0 hasta DimensionY
                for (contColumna = 0; contColumna <columna; contColumna++)
                {
                    //Se crea un Check
                    final JTextField checkNuevo = new JTextField();
                    
                    //Se asigna toolTip con la posicion 
                    checkNuevo.setToolTipText(Integer.toString(contFila+1) + "," + Integer.toString(contColumna+1));
                    
                    //Se agrega a la matriz 
                    checks[contFila][contColumna] = checkNuevo;
                    
                    //Se agrega un nuevo evento 
                    checks[contFila][contColumna].addActionListener(new ActionListener() 
                    { 
                        public void actionPerformed(ActionEvent e) { 
                            Click(checkNuevo);
                        } 
                    });
                    //Se agrega al panel 
                    plTablero.add(checks[contFila][contColumna]);
                    
                    //se vuelve a dibujar el panel para que incluya los componentes creados dinamicamente
                    repaintTablero();
                }//for columna
            }//for fila
        }//if
        else
        {
            JOptionPane.showMessageDialog(this, "El rango permitido es de 1 entre 50");
        }//fin if
    }

    /**
     * Metodo vuleve a dibujar el Panel
     */
    private void repaintTablero()
    {
        //Se valida los componentes del panel
    	plTablero.validate();
        
        //Se redibuja panel con sus componentes
        plTablero.repaint();
    }
    
    private void borrar(ActionEvent evt) {
    	
        if(plTablero!=null && plTablero.getComponentCount()>0 && checks!=null)
        {
            //Se recorre la matriz de componente y se elimina cada elemento de la matríz
            for (int f= 0; f < fila; f++)
            {
                for (int c = 0; c < columna;c++)
                {
                    checks[f][c] = null;
                }//for columna
            }//for fila
            
            //Se remueven todos los elementos hijos del JPanel plTablero
            plTablero.removeAll();
            
            repaintTablero();
        }//if 
        
    }
    
     
    /**
     * muestra la posicion del componente de acuerdo a columnas y renglon al seleccionarlo 
     */
    private void Click(JTextField checkNuevo)
    {
        JOptionPane.showMessageDialog(this, "check: " + checkNuevo.getToolTipText());
    }

  
    
    /**
     * valida que no exceda las columnas y renglones esten entre 1 a 50
    */
    private boolean validarTamano()
    {
        boolean valido = false;

        
        fila = Integer.parseInt(txFila.getText());
        columna = Integer.parseInt(txColumna.getText());
        
        if ( fila>=1 && fila<=50 && columna>=1 && columna<=50){
            return true;
        }
           
        return valido;
    }
    
 
    
}
