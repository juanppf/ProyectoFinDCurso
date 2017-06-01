/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package querypresta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Grafica extends javax.swing.JFrame {

   private static String servidor = "jdbc:mysql://192.168.9.49/prestashop";
   private static String user = "root";
   private static String pass = "Manhattan";
   private static String driver = "com.mysql.jdbc.Driver";
   private static Connection conexSql;
   private static Statement st;
   private static ResultSet rs;
   public static JFreeChart grafica;
   public static DefaultCategoryDataset datos= new DefaultCategoryDataset();
   public static int mes;
   public static String y;
    /**
     * Creates new form Grafica
     * @throws java.sql.SQLException
     */
    public Grafica() throws SQLException {
        initComponents();
        
        hacer_conexionSql();
       
          //creo un objeto de la clase ResultSet que será el encargado de devolvernos los resultados de los registros:
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void generar_grafica(String year){
           
       try {
             y=year;
           st = conexSql.createStatement();
           rs=st.executeQuery("SELECT month(o.invoice_date) as mes,round(sum(o.total_products_wt),2) as total FROM prestashop.orders o inner join prestashop.order_detail od on o.id_order=od.id_order where year (invoice_date)= '"+year+"' group by month(invoice_date);");
           
           
           
           for(int i=1;rs.next();i++){
               mes=rs.getInt("total");
              switch (i){
               // Se añade al modelo la fila completa.
                  case 1:
                  datos.addValue(mes, "Ventas", "Enero");
                  break;
                  case 2:
                  datos.addValue(mes, "Ventas", "Febrero");
                  break;
                  case 3:
                  datos.addValue(mes, "Ventas", "Marzo");
                  break;
                  case 4:
                  datos.addValue(mes, "Ventas", "Abril");
                  break;
                  case 5:
                  datos.addValue(mes, "Ventas", "Mayo");
                  break;
                  case 6:
                  datos.addValue(mes, "Ventas", "Junio");
                  break;
                  case 7:
                  datos.addValue(mes, "Ventas", "Julio");
                  break;
                  case 8:
                  datos.addValue(mes, "Ventas", "Agosto");
                  break;
                  case 9:
                  datos.addValue(mes, "Ventas", "Septiembre");
                  break;
                  case 10:
                  datos.addValue(mes, "Ventas", "Octubre");
                  break;
                  case 11:
                  datos.addValue(mes, "Ventas", "Noviembre");
                  break;
                  case 12:
                  datos.addValue(mes, "Ventas", "Diciembre");
                  break;
              }
           }
        grafica = ChartFactory.createBarChart("Gráfica de Ventas",
                   y, "Total Facturado", datos,
                   PlotOrientation.VERTICAL, true, true, false);
           ChartPanel Panel = new ChartPanel(grafica);
           JFrame Ventana = new JFrame("JFreeChart");
           Ventana.getContentPane().add(Panel);
           Ventana.pack();
           Ventana.setVisible(true);
           Ventana.setLocationRelativeTo(null);
           Ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       } catch (SQLException ex) {
           Logger.getLogger(Grafica.class.getName()).log(Level.SEVERE, null, ex);
       }
      
    }
      public static void hacer_conexionSql() {
        try {
            Class.forName(driver);         
            conexSql = (Connection) DriverManager.getConnection(servidor, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
        }
    }
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
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Grafica().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Grafica.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
