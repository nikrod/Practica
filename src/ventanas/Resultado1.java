/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.List;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.input.KeyCode.T;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
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
    public static ArrayList <String> filafinal=new ArrayList<String>();
//private ArrayList<T> lista= new ArrayList<T>()
    public static void obtenert(ArrayList fila, ArrayList Trabajadores,int i )
    {
                       
                        fila.add(Trabajador.Trabajadores.get(i).getRut());
                        fila.add( Trabajador.Trabajadores.get(i).getApellido()); 
                        fila.add(Trabajador.Trabajadores.get(i).getNombre());
                        fila.add(Trabajador.Trabajadores.get(i).getCargo());
                        fila.add(Trabajador.Trabajadores.get(i).getTripulacion());
                        fila.add(Trabajador.Trabajadores.get(i).getHorario());
                        fila.add(Trabajador.Trabajadores.get(i).getTipo());
                        fila.add(Trabajador.Trabajadores.get(i).getServicio());
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getEnero2013()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getFebrero2013()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getMarzo2013()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getAbril2013()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getMayo2013()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getJunio2013()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getJulio2013()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getAgosto2013()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getSeptiembre2013()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getOctubre2013()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getNoviembre2013()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getDiciembre2013()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getEnero2014()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getFebrero2014()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getMarzo2014()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getAbril2014()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getMayo2014()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getJunio2014()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getJulio2014()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getAgosto2014()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getSeptiembre2014()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getOctubre2014()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getNoviembre2014()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getDiciembre2014()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getEnero2015()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getFebrero2015()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getMarzo2015()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getAbril2015()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getMayo2015()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getJunio2015()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getJulio2015()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getAgosto2015()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getSeptiembre2015()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getOctubre2015()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getNoviembre2015()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getDiciembre2015()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getEnero2016()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getFebrero2016()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getMarzo2016()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getAbril2016()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getMayo2016()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getJunio2016()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getJulio2016()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getAgosto2016()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getSeptiembre2016()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getOctubre2016()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getNoviembre2016()));
                        fila.add(Integer.toString(Trabajador.Trabajadores.get(i).getDiciembre2016()));       
    }
    
    public static int mpromedio(ArrayList fila, ArrayList Trabajadores)
    {
        ArrayList fila2=new ArrayList ();
        int promedio=0;
        int aux=0;
        int mpromedio=0;
        
        for(int i=0;i<Trabajadores.size();i=i+1)
        {
            obtenert(fila2,Trabajadores,i);
            for(int j=8;j<indices.size();j=j+1)
            {
                promedio=Integer.parseInt((String) fila2.get(indices.get(j)))+promedio;
                aux=aux+1;
            }
            
            if(aux!=0)
            {
                promedio=promedio/aux;
            }
            else
            {
                aux=0;
            }
            
            if(promedio>=mpromedio)
            {
                mpromedio=promedio;
            }
        }
        
    return mpromedio;
    }
    
    
    public Resultado1() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        jLabelRut.setVisible(false);
        jRut.setVisible(false);
        jButton4.setVisible(true);
        jComboBox3.setVisible(false);
        jLabelRut.setVisible(false);
        jLabelHorario.setVisible(false);
        
        jComboBox1.addItem("Horario");
        jComboBox1.addItem("Busqueda por Rut - Horario");
        jComboBox1.addItem("Busqueda por Rut - Producciones");
        jComboBox3.addItem("1");
        jComboBox3.addItem("2");
        
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jRut = new javax.swing.JTextField();
        jLabelRut = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelHorario = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Filtrar Información");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Filtro Personalizado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Atras");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRutActionPerformed(evt);
            }
        });

        jLabelRut.setText("Rut:");

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("  ");

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jList1);

        jLabel4.setText("Ingrese Meses a Evaluar:");

        jButton5.setText("Agregar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Eliminar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel2.setText("  ");

        jLabelHorario.setText("Horario:");

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel6.setText("  ");

        jLabel7.setText("  ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(406, 406, 406)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabelRut))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelHorario)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRut, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabelRut))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton5)
                                            .addComponent(jLabelHorario))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton6)
                                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Filtrar abrir=new Filtrar();
        this.setVisible(false);
        abrir.setVisible(true);  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Csv abrir=new Csv();
        this.setVisible(false);
        abrir.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        if(jComboBox1.getSelectedItem()=="Busqueda por Rut - Horario" || jComboBox1.getSelectedItem()=="Busqueda por Rut - Producciones")
        {
            jLabelRut.setVisible(true);
            jRut.setVisible(true);
        }
         else
        {
            jLabelRut.setVisible(false);
            jRut.setVisible(false);
        }
        
        if(jComboBox1.getSelectedItem()=="Horario")
        {
            jComboBox3.setVisible(true);
            jLabelHorario.setVisible(true);
        }
        else
        {
            jLabelHorario.setVisible(false);
            jComboBox3.setVisible(false);
            //jButton4.setVisible(false);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo=new DefaultTableModel();//se crea el modelo que se cargara en la tabla
        int h=0;//cantidad de filas
        int acum=0;//acumulador para promedio
        int macum=0;//mejor promedio
        //int aux3=0;//
        int cantm=0;//cntidad de meses
        //Class<? extends Trabajador> objeto=Trabajador.Trabajadores.get(0).getClass();
        
        if(jComboBox1.getSelectedItem()=="Busqueda por Rut - Horario")
        {    
            
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
                modelo.addColumn(columnas.get(i));
            }
            modelo.addColumn("Promedio");
            modelo.addColumn("Mejor Promedio");
                        
            for(int i=0;i<Trabajador.Trabajadores.size();i=i+1)
            {
                //System.out.println("Horario trabajador "+ Trabajador.Trabajadores.get(i).getHorario()+ "horario Combobox "+ jComboBox3.getSelectedItem());
                int aux;
                int aux2;
                
                if(Trabajador.Trabajadores.get(i).getHorario().compareTo("")==0) //si el horario esta vaio remplazar por 0
                {
                   aux=0;  
                }
                else
                {
                    aux=Integer.parseInt(Trabajador.Trabajadores.get(i).getHorario());
                }
                
                aux2=Integer.parseInt(jComboBox3.getSelectedItem().toString()); //variable aux2 para poder comparar el horario
                
                if(aux==aux2) //si son iguales el horario del trabajador y el buscado
                {
                        cantm=0;
                        fila=new ArrayList();
                        obtenert(fila,Trabajador.Trabajadores,i);
                        macum=mpromedio(fila,Trabajador.Trabajadores);
                        Object[] obj=new Object[indices.size()+1];//cantidad de indices
                        modelo.addRow(obj);
                        
                        for(int j=0;j<indices.size();j=j+1)
                        {
                            modelo.setValueAt(fila.get(indices.get(j)),h,j);
                            if(j>=8)
                            {
                                acum=acum+Integer.parseInt(fila.get(indices.get(j)));
                                cantm=cantm+1;
                                System.out.println("cantidad de meses "+cantm);
                            }    
                        }

                        if(acum!=0) //en caso de que el promedio sea 0
                        {    
                            acum=acum/cantm;
                        }
                        else
                        {
                            acum=0;
                        }
                        
                        modelo.setValueAt((acum),h,(cantm+8));
                        modelo.setValueAt((macum),h,(cantm+9));
                        h=h+1;//agrega una nueva fila 
                        
                        if(acum>=macum)
                        {
                            macum=acum;
                        }
                }
            }          
        }
       
        jTable1.setModel(modelo);//se crea el modelo con los datos
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed
    
    DefaultListModel modelo = new DefaultListModel(); 
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling co,de here:
        columnas.add(jComboBox2.getSelectedItem().toString());
        indices.add(jComboBox2.getSelectedIndex()+8);
        modelo.addElement(jComboBox2.getSelectedItem());
        jList1.setModel(modelo);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        for(int i=0;i<columnas.size();i=i+1)
        {
            if(columnas.get(i)==jList1.getSelectedValue())
            {
                columnas.remove(i);//se elimina el campo seleccionado
                indices.remove(i);
            }
            
        }
        modelo.remove(jList1.getSelectedIndex());//se borra el elemento del jlist
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRutActionPerformed

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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelHorario;
    private javax.swing.JLabel jLabelRut;
    private javax.swing.JList<String> jList1;
    private javax.swing.JTextField jRut;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
