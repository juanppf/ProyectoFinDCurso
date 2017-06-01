/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package querypresta;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;



/**
 *
 * @author juanpe
 */
public class FormatoTablaStock extends DefaultTableCellRenderer{
    

    
public Component getTableCellRendererComponent(JTable table,
      Object value,
      boolean isSelected,
      boolean hasFocus,
      int row,
      int column)
   {
      super.getTableCellRendererComponent (table, value, isSelected, hasFocus, row, column);
    float valor = (float)table.getValueAt(row, 15);
  
   
        if(valor<=0.0){
         this.setBackground(Color.DARK_GRAY);
         this.setForeground(Color.RED);}
        else if(valor>=1.0 && valor<=3.0){
         this.setBackground(Color.DARK_GRAY);
         this.setForeground(Color.ORANGE);  
        }else{
         this.setBackground(Color.DARK_GRAY);
         this.setForeground(Color.GREEN); 
    
        }
     
      return this;
   }    
    
}  

