/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;



import java.io.IOException;
import com.csvreader.CsvReader;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Niko
 */
public class Csv extends javax.swing.JFrame {

    /**
     * Creates new form Csv
     */
    public Csv() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Cargar Csv");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 140, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 690, 480));

        jList1.setBackground(new java.awt.Color(51, 51, 255));
        jList1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 510, 340));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Cargar Datos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 160, 30));

        jButton2.setText("Aceptar");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, 140, 40));

        jLabel2.setText(" ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, 20, -1));

        jLabel3.setText("  ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 580, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try 
        {        
            CsvReader products = new CsvReader("C:/Users/Niko/Desktop/Camino2.csv");            
            products.readHeaders();  
           
              DefaultTableModel modelo=new DefaultTableModel();
              for(int i=0;i<5;i=i+1)
              {
                modelo.addColumn(Lista.campos[i]);
              }
              jTable1.setModel(modelo);
           int con=1;
            while (products.readRecord())
            {  
                con=con+1;
                String Rut = products.get("Rut");
                String Apellido = products.get("Apellido");
                String Nombre = products.get("Nombre");
                String Cargo= products.get("Cargo");
                String Tripulacion=products.get("Tripulacion");
                String Horario=products.get("Horario");
                String Tipo=products.get("Tipo");
                String Servicio=products.get("Servicio");
                
                //System.out.println("año 2013");
                //System.out.println("fila "+con);
                int enero2013=Integer.parseInt(products.get("201301"));
                //System.out.println(products.get("201301"));
                int febrero2013=Integer.parseInt(products.get("201302"));
               // System.out.println(products.get("201302"));
                int marzo2013=Integer.parseInt(products.get("201303"));
                //System.out.println(products.get("201303"));
                int abril2013=Integer.parseInt(products.get("201304"));
                 //System.out.println(products.get("201304"));
                int mayo2013=Integer.parseInt(products.get("201305"));
                 //System.out.println(products.get("201305"));
                int junio2013=Integer.parseInt(products.get("201306"));
                 //System.out.println(products.get("201306"));
                int julio2013=Integer.parseInt(products.get("201307"));
                 //System.out.println(products.get("201307"));
                int agosto2013=Integer.parseInt(products.get("201308"));
                 //System.out.println(products.get("201308"));
                int septiembre2013=Integer.parseInt(products.get("201309"));
                 //.out.println(products.get("201309"));
                int octubre2013=Integer.parseInt(products.get("201310"));
                 //System.out.println(products.get("201310"));
                int noviembre2013=Integer.parseInt(products.get("201311"));
                 //System.out.println(products.get("201311"));
                int diciembre2013=Integer.parseInt(products.get("201312"));
                 //System.out.println(products.get("201312"));
                
                 //System.out.println("año 2014");
                 int enero2014=Integer.parseInt(products.get("201401"));
                 //System.out.println(products.get("201401"));
                int febrero2014=Integer.parseInt(products.get("201402"));
                 //System.out.println(products.get("201402"));
                int marzo2014=Integer.parseInt(products.get("201403"));
                 //System.out.println(products.get("201403"));
                int abril2014=Integer.parseInt(products.get("201404"));
                 //System.out.println(products.get("201404"));
                int mayo2014=Integer.parseInt(products.get("201405"));
                 //System.out.println(products.get("201405"));
                int junio2014=Integer.parseInt(products.get("201406"));
                 //System.out.println(products.get("201406"));
                int julio2014=Integer.parseInt(products.get("201407"));
                 //System.out.println(products.get("201407"));
                int agosto2014=Integer.parseInt(products.get("201408"));
                 //System.out.println(products.get("201408"));
                int septiembre2014=Integer.parseInt(products.get("201409"));
                 //System.out.println(products.get("201409"));
                int octubre2014=Integer.parseInt(products.get("201410"));
                 //System.out.println(products.get("201410"));
                int noviembre2014=Integer.parseInt(products.get("201411"));
                 //System.out.println(products.get("201411"));
                int diciembre2014=Integer.parseInt(products.get("201412"));
                 //System.out.println(products.get("201412"));
                
                //System.out.println("año 2015");
                 int enero2015=Integer.parseInt(products.get("201501"));
                 //System.out.println(products.get("201501"));
                int febrero2015=Integer.parseInt(products.get("201502"));
                 //System.out.println(products.get("201502"));
                int marzo2015=Integer.parseInt(products.get("201503"));
                 //System.out.println(products.get("201503"));
                int abril2015=Integer.parseInt(products.get("201504"));
                 //System.out.println(products.get("201504"));
                int mayo2015=Integer.parseInt(products.get("201505"));
                 //System.out.println(products.get("201505"));
                int junio2015=Integer.parseInt(products.get("201506"));
                 //System.out.println(products.get("201506"));
                int julio2015=Integer.parseInt(products.get("201507"));
                 //System.out.println(products.get("201507"));
                int agosto2015=Integer.parseInt(products.get("201508"));
                 //System.out.println(products.get("201508"));
                int septiembre2015=Integer.parseInt(products.get("201509"));
                 //System.out.println(products.get("201509"));
                int octubre2015=Integer.parseInt(products.get("201510"));
                 //System.out.println(products.get("201510"));
                int noviembre2015=Integer.parseInt(products.get("201511"));
                 //System.out.println(products.get("201511"));
                int diciembre2015=Integer.parseInt(products.get("201512"));
                 //System.out.println(products.get("201512"));
                
                //System.out.println("año 2016");
                 int enero2016=Integer.parseInt(products.get("201601"));
                 //System.out.println(products.get("201601"));
                int febrero2016=Integer.parseInt(products.get("201602"));
                 //System.out.println(products.get("201602"));
                int marzo2016=Integer.parseInt(products.get("201603"));
                 //System.out.println(products.get("201603"));
                int abril2016=Integer.parseInt(products.get("201604"));
                 //System.out.println(products.get("201604"));
                int mayo2016=Integer.parseInt(products.get("201605"));
                 //System.out.println(products.get("201605"));
                int junio2016=Integer.parseInt(products.get("201606"));
                 //System.out.println(products.get("201606"));
                int julio2016=Integer.parseInt(products.get("201607"));
                 //System.out.println(products.get("201607"));
                int agosto2016=Integer.parseInt(products.get("201608"));
                 //System.out.println(products.get("201608"));
                int septiembre2016=Integer.parseInt(products.get("201609"));
                 //System.out.println(products.get("201609"));
                int octubre2016=Integer.parseInt(products.get("201610"));
                 //System.out.println(products.get("201610"));
                int noviembre2016=Integer.parseInt(products.get("201611"));
                 //System.out.println(products.get("201611"));
                int diciembre2016=Integer.parseInt(products.get("201612"));
                 //System.out.println(products.get("201612"));
                
                Trabajador nuevo=new Trabajador(Rut,Apellido,Nombre,Cargo,Tripulacion,Horario,Tipo,Servicio,enero2013,febrero2013,marzo2013,abril2013,mayo2013,junio2013,julio2013,agosto2013,septiembre2013,octubre2013,noviembre2013,diciembre2013,enero2014,febrero2014,marzo2014,abril2014,mayo2014,junio2014,julio2014,agosto2014,septiembre2014,octubre2014,noviembre2014,diciembre2014,enero2015,febrero2015,marzo2015,abril2015,mayo2015,junio2015,julio2015,agosto2015,septiembre2015,octubre2015,noviembre2015,diciembre2015,enero2016,febrero2016,marzo2016,abril2016,mayo2016,junio2016,julio2016,agosto2016,septiembre2016,octubre2016,noviembre2016,diciembre2016);
                Trabajador.Trabajadores.add(nuevo);
                
                modelo.addRow(new Object[]{nuevo.getRut(),nuevo.getApellido(),nuevo.getNombre(),nuevo.getCargo(),nuevo.getTripulacion()});                

            }
           

            products.close();
            //System.out.println(Datos.datos);
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(Csv.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        catch (IOException ex) 
        {
            Logger.getLogger(Csv.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            Resultado1 abrir=new Resultado1();
            this.setVisible(false);
            abrir.setVisible(true);       
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
            java.util.logging.Logger.getLogger(Csv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Csv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Csv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Csv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Csv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}