/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import static ventanas.Trabajador.Trabajadores;


/**
 *
 * @author Niko
 */
public class Resultado1 extends javax.swing.JFrame {

    /**
     * Creates new form Resultado1
     */
    //public static String [] columnas={};
    public static ArrayList <String> columnas=new ArrayList<String>();
    public static ArrayList <Integer> indices=new ArrayList<Integer>(); //arreglo para guardar los indices del combobox
    public static ArrayList <String> fila;
    public static ArrayList <String> horarioc=new ArrayList<String>();
    public static ArrayList <Integer> Referentes=new ArrayList <Integer>();
    public static int buscar=0;
    public static int mprom=0;
    public static String mrut;
    public static ArrayList <Trabajador> Ttablas=new ArrayList <Trabajador>();
    
    private JFileChooser FileChooser = new JFileChooser();
    private Vector columna = new Vector();
    private Vector filas = new Vector();
    private static int tabla_ancho = 0;
    private static int tabla_alto = 0;
//private ArrayList<T> lista= new ArrayList<T>()
    public static void obtenert(ArrayList fila, Trabajador T)
    {
        fila.add(T.getRut());
                        fila.add( T.getApellido()); 
                        fila.add(T.getNombre());
                        fila.add(T.getCargo());
                        fila.add(T.getTripulacion());
                        fila.add(T.getHorario());
                        fila.add(T.getTipo());
                        fila.add(T.getUnegocio());
                        fila.add(Integer.toString(T.getEnero2013()));
                        fila.add(Integer.toString(T.getFebrero2013()));
                        fila.add(Integer.toString(T.getMarzo2013()));
                        fila.add(Integer.toString(T.getAbril2013()));
                        fila.add(Integer.toString(T.getMayo2013()));
                        fila.add(Integer.toString(T.getJunio2013()));
                        fila.add(Integer.toString(T.getJulio2013()));
                        fila.add(Integer.toString(T.getAgosto2013()));
                        fila.add(Integer.toString(T.getSeptiembre2013()));
                        fila.add(Integer.toString(T.getOctubre2013()));
                        fila.add(Integer.toString(T.getNoviembre2013()));
                        fila.add(Integer.toString(T.getDiciembre2013()));
                        fila.add(Integer.toString(T.getEnero2014()));
                        fila.add(Integer.toString(T.getFebrero2014()));
                        fila.add(Integer.toString(T.getMarzo2014()));
                        fila.add(Integer.toString(T.getAbril2014()));
                        fila.add(Integer.toString(T.getMayo2014()));
                        fila.add(Integer.toString(T.getJunio2014()));
                        fila.add(Integer.toString(T.getJulio2014()));
                        fila.add(Integer.toString(T.getAgosto2014()));
                        fila.add(Integer.toString(T.getSeptiembre2014()));
                        fila.add(Integer.toString(T.getOctubre2014()));
                        fila.add(Integer.toString(T.getNoviembre2014()));
                        fila.add(Integer.toString(T.getDiciembre2014()));
                        fila.add(Integer.toString(T.getEnero2015()));
                        fila.add(Integer.toString(T.getFebrero2015()));
                        fila.add(Integer.toString(T.getMarzo2015()));
                        fila.add(Integer.toString(T.getAbril2015()));
                        fila.add(Integer.toString(T.getMayo2015()));
                        fila.add(Integer.toString(T.getJunio2015()));
                        fila.add(Integer.toString(T.getJulio2015()));
                        fila.add(Integer.toString(T.getAgosto2015()));
                        fila.add(Integer.toString(T.getSeptiembre2015()));
                        fila.add(Integer.toString(T.getOctubre2015()));
                        fila.add(Integer.toString(T.getNoviembre2015()));
                        fila.add(Integer.toString(T.getDiciembre2015()));
                        fila.add(Integer.toString(T.getEnero2016()));
                        fila.add(Integer.toString(T.getFebrero2016()));
                        fila.add(Integer.toString(T.getMarzo2016()));
                        fila.add(Integer.toString(T.getAbril2016()));
                        fila.add(Integer.toString(T.getMayo2016()));
                        fila.add(Integer.toString(T.getJunio2016()));
                        fila.add(Integer.toString(T.getJulio2016()));
                        fila.add(Integer.toString(T.getAgosto2016()));
                        fila.add(Integer.toString(T.getSeptiembre2016()));
                        fila.add(Integer.toString(T.getOctubre2016()));
                        fila.add(Integer.toString(T.getNoviembre2016()));
                        fila.add(Integer.toString(T.getDiciembre2016())); 
                        fila.add(Integer.toString(T.getPromedio()));
                        fila.add(Integer.toString(T.getIndicador()));

    }
        
    public Resultado1() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        jLabel3.setVisible(false);
        jRut.setVisible(false);
        jButton4.setVisible(true);
        jComboBox3.setVisible(false);
        jLabel3.setVisible(false);
        jLabelHorario.setVisible(false);
        jComboBox4.setVisible(false);
        
        
        jComboBox1.addItem("Horario");
        jComboBox1.addItem("Busqueda por Rut - Horario");
        jComboBox1.addItem("Busqueda por Rut - Producciones");
        
        jComboBox4.addItem("Norte");
        jComboBox4.addItem("Centro");
        jComboBox4.addItem("Sur");

        
        for(int i=0;i<Trabajadores.size();i=i+1) //llenando el combobox3 para seleccionar el horario sin que se repitan los terminos
        {
                //System.out.println(Trabajadores.get(i).getHorario());
                if(horarioc.size()==0)
                {
                    horarioc.add(Trabajadores.get(i).getHorario().toString());                
                }
                else
                {
                    int j=0;
                    while(j<horarioc.size())
                    {    
                        if(Trabajadores.get(i).getHorario().toString().compareTo(horarioc.get(j).toString())==0)//si son diferentes
                        {   
                            
                            j=horarioc.size()+1;
                        }
                        else
                        {
                            j=j+1;
                        }
                    }
                    if(j==horarioc.size())
                    {
                        //System.out.println("entra ");
                        horarioc.add(Trabajadores.get(i).getHorario().toString());
                    }
                }
        }
        
        for(int i=0;i<horarioc.size();i=i+1) //se carga la lista con los horarios en el combobox
        {
            jComboBox3.addItem(horarioc.get(i));
        }
 
        int cont=0;//contador para saber a que correpsonde cada indice
        
        for(int i=0;i<8;i=i+1)
        {
            columnas.add(Lista.campos[i]); //agregando columnas a la tabla
            indices.add(i);
            
        }
        
        for(int i=8;i<(Lista.campos.length);i=i+1) //cargando campos a combobox que lista todos los campos a elegir
        {
            jComboBox2.addItem(Lista.campos[i]);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jRut = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelHorario = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Exportar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 360, 190, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Unidad de Negocio:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, -1, -1));

        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 150, -1));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 40, 233, 27));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setEditingColumn(0);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 1120, 196));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filtrar Información");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 243, -1));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 480, 192, 38));

        jRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRutActionPerformed(evt);
            }
        });
        getContentPane().add(jRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 201, -1));

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 310, 192, 40));

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 140, -1));

        jScrollPane2.setViewportView(jList1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 122, 151));

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese Meses a Evaluar:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jButton5.setText("Agregar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 102, -1));

        jButton6.setText("Eliminar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 102, -1));

        jLabel2.setText("  ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(916, 487, 102, -1));

        jLabelHorario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelHorario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHorario.setText("Horario:");
        getContentPane().add(jLabelHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 146, -1));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/turbus_1.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 58));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Rut:");
        jLabel3.setName("Rut"); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, -1, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 100, 30, 10));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        jLabel7.setText("jLabel4");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        if(jComboBox1.getSelectedItem()=="Busqueda por Rut - Horario" || jComboBox1.getSelectedItem()=="Busqueda por Rut - Producciones")
        {
            jLabel3.setVisible(true);
            jRut.setVisible(true);
        }
         else
        {
            jLabel3.setVisible(false);
            jRut.setVisible(false);
        }
        
        if(jComboBox1.getSelectedItem()=="Horario")
        {
            jComboBox3.setVisible(true);
            jLabelHorario.setVisible(true);
            jComboBox4.setVisible(true);
            jLabel8.setVisible(true);
        }
        else
        {
            jLabelHorario.setVisible(false);
            jComboBox3.setVisible(false);
            jComboBox4.setVisible(false);
            jLabel8.setVisible(false);
            //jButton4.setVisible(false);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here: 
        DefaultTableModel modelo=new DefaultTableModel();//se crea el modelo que se cargara en la tabla
        int acum=0;
        int cantm=0;
        mprom=0;
        Ttablas=new ArrayList();
        
        //Referentes=new ArrayList ();        
        if(jComboBox1.getSelectedItem()=="Busqueda por Rut - Horario")
        {    
            String rut=jRut.getText();
            mrut=jRut.getText();
            int mprom2=0;
                  

            
            for(int i=0;i<columnas.size();i=i+1)
            {
                modelo.addColumn(columnas.get(i));//se gregan las columnas al modelo
                //System.out.println(columnas.get(i));
            }
            modelo.addColumn("Promedio");
            modelo.addColumn("Indicador");
            modelo.addColumn("Mejor Promedio");
                    
            if(buscar==0)
            {
                fila=new ArrayList();
                obtenert(fila,Trabajador.Trabajadores.get(0));
                indices.add((fila.size()-2));//agrego el numero de indice de promedio
                indices.add((fila.size()-1));//agrego numero de indice de indicador                        
                buscar=1;
            }
            int indice=0;
            for(int i=0;i<Trabajador.Trabajadores.size();i=i+1) //se busca al trabajador con el rut ingresado
            {
                if(Trabajador.Trabajadores.get(i).getRut().compareTo(rut)==0)
                {
                    indice=i;
                }
            }
            
            for(int j=0;j<Trabajador.Trabajadores.size();j=j+1)
            {
                if(Trabajador.Trabajadores.get(indice).getHorario().compareTo(Trabajador.Trabajadores.get(j).getHorario())==0)
                {
                    fila=new ArrayList();
                    obtenert(fila,Trabajador.Trabajadores.get(j));
                    Object[] obj=new Object[indices.size()+1];//cantidad de indices
                    modelo.addRow(obj);        
                    acum=0;
                    cantm=0;
                    
                    for(int i=8;i<indices.size()-2;i=i+1)
                    {
                        cantm=cantm+1;
                        //System.out.println("cantidad acumulado "+fila.get(j+1) + " Trabajador "+i);  
                        acum=acum+Integer.parseInt(fila.get(indices.get(i)));
                    }
                        
                    if(cantm!=0)
                    {
                        acum=acum/cantm;
                        System.out.println("promedio "+acum);
                    }
                    else
                    {
                        acum=0;
                    }
                        
                    if(acum>mprom)
                    {
                        mprom=acum;
                    }
                    //System.out.println("el promedio es "+acum);
                    Trabajador.Trabajadores.get(j).setPromedio(acum);
                    Ttablas.add(Trabajador.Trabajadores.get(j)); 
                    //System.out.println(j);
                }
            }
                    
            for(int j=0;j<Ttablas.size();j=j+1)
            {
                Ttablas.get(j).setIndicador(mprom-(Ttablas.get(j).getPromedio()));
                //System.out.println(Ttablas.get(i).getPromedio());
                fila=new ArrayList();
                obtenert(fila,Ttablas.get(j));
                //System.out.println("indicador = "+ fila.get(8));
                int aux3=0;
                while(aux3<indices.size())
                {
                    //System.out.println(fila.get(indices.get(j)));
                    modelo.setValueAt(fila.get(indices.get(aux3)),j,aux3);//se modifica el campo promedio por el valor obtenido
                    aux3=aux3+1;
                }
                modelo.setValueAt(mprom,j,aux3);
               
            }
        
        TableCellRendererColor1 color=new TableCellRendererColor1();
        jTable1.setDefaultRenderer(Object.class,color); 
        jTable1.setModel(modelo);//se crea el modelo con los datos
            
            
            //modelo.addRow(new Object[]{nuevo.getRut(),nuevo.getApellido(),nuevo.getNombre(),nuevo.getCargo(),nuevo.getTripulacion()});  
        }
        else if(jComboBox1.getSelectedItem()=="Busqueda por Rut - Producciones")
        {          
            //modelo.addRow(new Object[]{nuevo.getRut(),nuevo.getApellido(),nuevo.getNombre(),nuevo.getCargo(),nuevo.getTripulacion()});       
        }        
        else if(jComboBox1.getSelectedItem()=="Horario")
        {
            for(int i=0;i<columnas.size();i=i+1)
            {
                modelo.addColumn(columnas.get(i));//se gregan las columnas al modelo
                //System.out.println(columnas.get(i));
            }
            modelo.addColumn("Promedio");
            modelo.addColumn("Indicador");
            modelo.addColumn("Mejor Promedio");
            
            if(buscar==0)
            {
                fila=new ArrayList();
                obtenert(fila,Trabajador.Trabajadores.get(0));
                indices.add((fila.size()-2));//agrego el numero de indice de promedio
                indices.add((fila.size()-1));//agrego numero de indice de indicador                        
                buscar=1;
            }
            
            for(int i=0;i<Trabajador.Trabajadores.size();i=i+1)
            {
                String aux;//variable para guardar el horario del trabajador
                String aux2;//variable para guardar el horario a buscar
                if(Trabajador.Trabajadores.get(i).getHorario().compareTo("")==0) //si el horario esta vaio remplazar por 0
                {
                    aux="0";  
                }
                else
                {
                    aux=Trabajador.Trabajadores.get(i).getHorario().toString();
                    //se guarda el horario del trabajador
                }
                aux2=jComboBox3.getSelectedItem().toString(); //variable aux2 para poder comparar el horario
                if(aux.compareTo(aux2)==0) //si son iguales el horario del trabajador y el buscado
                {
                        //if()
                        fila=new ArrayList();
                        obtenert(fila,Trabajador.Trabajadores.get(i));
                        Object[] obj=new Object[indices.size()+1];//cantidad de indices
                        modelo.addRow(obj);        
                        acum=0;
                        cantm=0;
                      
                        for(int j=8;j<indices.size()-2;j=j+1)
                        {
                            cantm=cantm+1;
                            //System.out.println("cantidad acumulado "+fila.get(j+1) + " Trabajador "+i);  
                            acum=acum+Integer.parseInt(fila.get(indices.get(j)));
                        }
                        
                        if(cantm!=0)
                        {
                            acum=acum/cantm;
                            //System.out.println("promedio "+acum);
                        }
                        else
                        {
                            acum=0;
                        }
                        
                        if(acum>mprom)
                        {
                            mprom=acum;
                        }
                        
                        //System.out.println("el promedio es "+acum);
                        Trabajador.Trabajadores.get(i).setPromedio(acum);
                        Ttablas.add(Trabajador.Trabajadores.get(i));      
                        
                }
            }
            //System.out.println("el mejor promedio es: "+mprom);
            
            for(int i=0;i<Ttablas.size();i=i+1)
            {
                Ttablas.get(i).setIndicador(mprom-(Ttablas.get(i).getPromedio()));
                //System.out.println(Ttablas.get(i).getPromedio());
                fila=new ArrayList();
                obtenert(fila,Ttablas.get(i));
                //System.out.println("indicador = "+ fila.get(8));
                int aux3=0;
                while(aux3<indices.size())
                {
                    //System.out.println(fila.get(indices.get(j)));
                    modelo.setValueAt(fila.get(indices.get(aux3)),i,aux3);//se modifica el campo promedio por el valor obtenido
                    aux3=aux3+1;
                }
                modelo.setValueAt(mprom,i,aux3);
               
                //jTable1.setDefaultRenderer(Object.class, TableCellRendererColor());
            } 
            jTable1.setModel(modelo);//se crea el modelo con los datos
            TableCellRendererColor color=new TableCellRendererColor();
            jTable1.setDefaultRenderer(Object.class,color);   
         }
       
        //jTable1.setDefaultRenderer(Object.class, new TableCellRendererColor());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed
    DefaultListModel modelo = new DefaultListModel(); 
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling co,de here:
            if(buscar>0)//condicion para saber si ya se ejecuto el buscar
            {
                fila=new ArrayList();
                int aux=indices.size();
                obtenert(fila,Trabajador.Trabajadores.get(0));
                indices.remove(aux-1);//se elimina la columna del promedio y del indicador
                indices.remove(aux-2);
            }
            columnas.add(jComboBox2.getSelectedItem().toString());
            indices.add(jComboBox2.getSelectedIndex()+8);
            modelo.addElement(jComboBox2.getSelectedItem());
            jList1.setModel(modelo);
            buscar=0;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(buscar>0)
            {
                fila=new ArrayList();
                int aux=indices.size();
                obtenert(fila,Trabajador.Trabajadores.get(0));
                indices.remove(aux-1);
                indices.remove(aux-2);
            }
        
        for(int i=0;i<columnas.size();i=i+1)
        {
            
            if(columnas.get(i)==jList1.getSelectedValue())
            {
                columnas.remove(i);//se elimina el campo seleccionado
                indices.remove(i);
            }
            buscar=0;
        }
        modelo.remove(jList1.getSelectedIndex());//se borra el elemento del jlist
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRutActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            JFileChooser dialog = new JFileChooser();
            int opcion = dialog.showSaveDialog(Resultado1.this);

        if (opcion == JFileChooser.APPROVE_OPTION) {

                java.io.File dir = dialog.getSelectedFile();

            try {
                ArrayList<JTable> tb = new ArrayList<JTable>();
                tb.add(jTable1);
                //------------------
               
                export_excel excelExporter = new export_excel(tb, new File(dir.getAbsoluteFile()+".xls"));
                if (excelExporter.export()) 
                {
                    JOptionPane.showMessageDialog(null, "TABLAS EXPORTADOS CON EXITOS!");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Resultado1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resultado1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resultado1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resultado1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultado1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelHorario;
    private javax.swing.JList<String> jList1;
    private javax.swing.JTextField jRut;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    // End of variables declaration//GEN-END:variables
}
