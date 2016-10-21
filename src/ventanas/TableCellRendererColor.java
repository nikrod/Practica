/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Niko
 */
public class TableCellRendererColor extends DefaultTableCellRenderer{
    private Component componente;
    private int cont=0;
    public TableCellRendererColor(int acum)
    {
    
    
    }
    @Override
        public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        componente=super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1);
        
        String col10 =jtable.getValueAt(i,Resultado1.Referentes.get(2)).toString();
        if(col10==Resultado1.Referentes.get(1).toString())
        {
            setBackground(Color.GREEN);
        }
        System.out.println(col10);
        
        return  componente;//To change body of generated methods, choose Tools | Templates.
    }
    
}
