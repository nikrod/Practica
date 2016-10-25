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

/**
 *
 * @author Niko
 */
public class TableCellRendererColor extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        int aux=indices.size()-1;
        int aux2=0;
        if(i1==aux)
        {
            aux2=Integer.parseInt(jtable.getValueAt(i, aux).toString());

            if(aux2==0)
            {
                 setBackground(Color.GREEN);
            }   
            else if(aux2<100000)
            {
                setBackground(Color.YELLOW);
            }
            else if(aux2>100000)
            {
                setBackground(Color.RED);
            }
            
        }
        else
        {
            setBackground(Color.WHITE);          

        }
        
        
        return super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1); //To change body of generated methods, choose Tools | Templates.
    }

}
