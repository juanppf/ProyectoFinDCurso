/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package querypresta;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author juanpe
 */
public class Conectar {
  private static String servidor="jdbc:mysql://192.168.9.49";
  private static String user = "root";
  private static String pass = "Manhattan";
  private static String driver = "com.mysql.jdbc.Driver";
  private static Connection conexion;

   public Conectar(){

      try {
          Class.forName(driver);
          conexion=(Connection) DriverManager.getConnection(servidor,user,pass);//establecer conexion
      } catch (ClassNotFoundException | SQLException e) {
          Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
      } 
      
       
   }

  
 
 public void actualizar_activo(){
      try {
          Conectar  conexion= new Conectar();//creo objeto de la clase          
          Connection cn=conexion.getConnection();//paso al objeto cn la conexión
          Statement st;//creo objeto de la clase Statement para procesar la sentencia SQL
        //  ResultSet rs;//creo un objeto de la clase ResultSet que será el encargado de devolvernos los resultados de los registros:
          String sql="update prestashop.product_shop ps  inner join test.productos p  on p.id=ps.id_product  set ps.active= p.Activo";//realiza la consulta y actualiza
          st=cn.createStatement();//Establece la comunicación entre la aplicación y la base de datos:
         st.executeUpdate(sql);//Paso al objeto la consulta
          
          
          
//          while(rs.next()){
//              int idp=rs.getInt("Activo");
//              int idps=rs.getInt("active");
//              if (idp==idps){
//                JOptionPane.showMessageDialog(null, "¡Tabla Actualizada!");  
//              }else{
//                  JOptionPane.showMessageDialog(null, "¡No es Posible Actualizar la Tabla!");
//              }
//          }
         
          //"UPDATE test.productos SET Activo=(SELECT active  FROM prestashop.product_shop WHERE id_product IN(SELECT id FROM test.productos);";
          /*while(rs.next()){  //recorro  los valores mientras existan (rs.next()) y por medio de los métodos getInt y getString obtengo los valores de las diferentes columnas
              int idp=rs.getInt("id_product");
              int idps=rs.getInt("id");
              int act=rs.getInt("active");
              //condición para actualizar la tabla product_shop
              if (act==1 && idp==idps){
             Conectar conex=new Conectar();
             Connection ct=conex.getConnection();
             Statement sm;
             int valor=1;
             String sq="update prestashop.product_shop set active='"+valor+"';";
             sm=ct.createStatement();
             sm.executeUpdate(sq);
             JOptionPane.showMessageDialog(null, "¡Tabla actualizada!");
             // cierre de las conexiones en orden inverso
             ct.close();
             sm.close();
          }else{
                  JOptionPane.showMessageDialog(null, "¡Error al modificar el registro!");
              }
              
          }*/
          
             // cierre de las conexiones en orden inverso
          
        //  rs.close();
          st.close();
          cn.close();
           System.out.println("ha funcionado ok");
      } catch (SQLException ex) {
          Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
      }
     
     
   }
   public Connection getConnection(){
      return conexion; 
   }
       public void actualizacion_activo(String sql,String sql1) throws HeadlessException {
        try {
            
            //conectar  conexion= new Conectar();//creo objeto de la clase
            //Connection cn=conexion.getConnection();//paso al objeto cn la conexión
            Statement st;//creo objeto de la clase Statement para procesar la sentencia SQL
            Statement ts;//  ResultSet rs;//creo un objeto de la clase ResultSet que será el encargado de devolvernos los resultados de los registros:
            //String sql1="update prestashop.product ps  inner join test.productos p  on p.id=ps.id_product  set ps.active= p.Activo";
            //String sql = "update prestashop.product_shop ps  inner join test.productos p  on p.id=ps.id_product  set ps.active= p.Activo";//realiza la consulta y actualiza
            ts = conexion.createStatement();
            st = conexion.createStatement();//Establece la comunicación entre la aplicación y la base de datos:
            ts.executeUpdate(sql1);
            st.executeUpdate(sql);//Paso al objeto la consul
            
            JOptionPane.showMessageDialog(null, "¡Tabla actualizada!");
            st.close();
            ts.close();
            conexion.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            public void actualizacion_precio(String sql2,String sql3) throws HeadlessException {
        try {
            
            //conectar  conexion= new Conectar();//creo objeto de la clase
            //Connection cn=conexion.getConnection();//paso al objeto cn la conexión
            Statement st;//creo objeto de la clase Statement para procesar la sentencia SQL
            Statement ts;
            //  ResultSet rs;//creo un objeto de la clase ResultSet que será el encargado de devolvernos los resultados de los registros:
            //String sql = "update prestashop.product_shop ps  inner join test.productos p  on p.id=ps.id_product  set ps.price= p.Precio";//realiza la consulta y actualiza
            ts = conexion.createStatement();
            st = conexion.createStatement();//Establece la comunicación entre la aplicación y la base de datos:
            ts.executeUpdate(sql2);
            st.executeUpdate(sql3);//Paso al objeto la consul
            
            JOptionPane.showMessageDialog(null, "¡Tabla actualizada!");
            st.close();
            ts.close();
            conexion.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

