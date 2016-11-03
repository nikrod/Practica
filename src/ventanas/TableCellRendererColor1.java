/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import static ventanas.Resultado1.indices;
import static ventanas.Resultado1.mrut;

/**
 *
 * @author Niko
 */
public class TableCellRendererColor1 extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        int aux;
        String aux2;
        int estado=999999999;
        
        int aux3=indices.size()-1;
        int aux4=0;
        
        if(i1==aux3)
        {
            aux4=Integer.parseInt(jtable.getValueAt(i, aux3).toString());

            if(aux4==0)
            {
                 setBackground(Color.GREEN);
            }   
            else if(aux4<100000)
            {
                setBackground(Color.YELLOW);
            }
            else if(aux4>100000)
            {
                setBackground(Color.RED);
            }
            
        }
        else
        {
            setBackground(Color.WHITE);          
        }
        
          if(i1==0)//si la columna es la primera
        {
            aux2=jtable.getValueAt(i,0).toString();
            //System.out.println(aux2);
            
            if(aux2.compareTo(mrut)==0)
            {
                aux=i;
                setBackground(Color.ORANGE);
                //System.out.println("Entra");
                estado=i;
            }
            else if(i!=estado)
            {
                setBackground(Color.WHITE);       
            }

        }
         
        return super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1); //To change body of generated methods, choose Tools | Templates.
    }

}
