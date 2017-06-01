/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package querypresta;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;



/**
 *
 * @author juanpe
 */
public class QueryPresta extends javax.swing.JFrame {
    
    // conexion MySQL
   private static String servidor = "jdbc:mysql://192.168.9.49/prestashop";
   private static String user = "root";
   private static String pass = "Manhattan";
   private static String driver = "com.mysql.jdbc.Driver";
   private static Connection conexion;
   private static Statement st,ts,tt,t1,t2,t3,t4,t5, struncate;
   private static ResultSet rs,rr,ss,rs1;
   
   // conexion Server SQL
   private static Connection con = null;
   private static Statement stmt = null;
   private static ResultSet sr = null;
   private static String SERVIDORSQL = "jdbc:sqlserver://REPORTING\\LISTADOS";
   public static String user_sql="consulta";
   public static String pass_sql="12345678";
   
     //Array's para almacenar los nombres de las tablas y los nombres de las columnas
    String tablasPresta[]={"product","product_shop"};
    String tablasTest[]={"productos","ordenes"};
    String tablaProduct[]={"id_product","id_supplier","id_manufacturer","id_category_default","id_shop_default","id_tax_rules_group","on_sale","online_only","ean13","isbn","upc","ecotax","quantity","minimal_quantity","price","wholesale_price","unity","unit_price_ratio","additional_shipping_cost","reference","supplier_reference","location","width","height","depth","weight","out_of_stock","quantity_discount","customizable","uploadable_files","text_fields","active","redirect_type","id_product_redirected","available_for_order","available_date","show_condition","condition","show_price","indexed","visibility","cache_is_pack","cache_has_attachments","is_virtual","cache_default_attribute","date_add","date_upd","advanced_stock_management","pack_stock_type","state"};
    String tablaProduct_shop[]={"id_product","id_shop","id_category_default","id_tax_rules_group","on_sale","online_only","ecotax","minimal_quantity","price","wholesale_price","unity","unit_price_ratio","additional_shipping_cost","customizable","uploadable_files","text_fields","active","redirect_type","id_product_redirected","available_for_order","available_date","show_condition","condition","show_price","indexed","visibility","cache_default_attribute","advanced_stock_management","date_add","date_upd","pack_stock_type"};
    String tablaProductos[]={"id","Orden","Activo","SoloDistribuidores","PesoKg","Precio","idTipoDeProducto","FueraDeStock","MostrarEnHome","idTipoIva","ConstoEnvioSinCargoComprando","CantidadMaximaPorOrden","ControlarStock","StockActual","idMarca","CobrarCostosEnvioFijo","idCostoEnvioFijo","CodigoEurowin","idGarantiaRotura","idGarantiaExtencion","ean","exclusivoweb"};
    String tablaOrdenes[]={"id","idMiembro","Total","SubTotal","GastosDeEnvio","Estado","Nombre","Direccion","CodigoPostal","Municipio","idProvincia","idPais","RcpNombre","RcpDireccion","RcpCodigoPostal","RcpMunicipio","RcpidProvincia","RcpidPais","CodigoCupon","MensageParaRegalo","DescuentoAplicado","NotasInternas","FormaDePago","idFormaDePago","idFactura","IVA","PagoRecibido","MensajeEntrega","deseorecibirfactura","ControlStockAplicado","CIF","creado_app"};

    /**
     * Creates new form queryPresta
     */
    public QueryPresta() {
        initComponents();
         setLocationRelativeTo(null);
         hacer_conexion();
         hacer_conexionSql();
         tabStock.setDefaultRenderer(Object.class, new FormatoTablaStock());//llamada a la clase FormatoTablaStock
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabActivo = new javax.swing.JTable();
        actualActivo = new javax.swing.JButton();
        consulActivo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabPrecio = new javax.swing.JTable();
        actualPrecio = new javax.swing.JButton();
        consulPrecio = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabListado = new javax.swing.JTable();
        consulListado = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        selectDB = new javax.swing.JComboBox<>();
        selectTablas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campo1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        campo2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        campo3 = new javax.swing.JComboBox<>();
        consultar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabTablas = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabEurowin = new javax.swing.JTable();
        consultar1 = new javax.swing.JButton();
        actualizar1 = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabStock = new javax.swing.JTable();
        consultar2 = new javax.swing.JButton();
        desactivar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        c1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        c2 = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        c3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabDesactivados = new javax.swing.JTable();
        ver = new javax.swing.JButton();
        activarArticulo = new javax.swing.JButton();
        grafica = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabReporte = new javax.swing.JTable();
        reporteVentas = new javax.swing.JButton();
        barrasGraficas = new javax.swing.JButton();
        year = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(2, 136, 209));

        jTabbedPane1.setBackground(new java.awt.Color(102, 102, 102));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(117, 117, 117), null));

        jPanel2.setBackground(new java.awt.Color(3, 169, 244));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(117, 117, 117), null));

        tabActivo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(189, 189, 189), null));
        tabActivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabActivo);

        actualActivo.setBackground(new java.awt.Color(255, 87, 34));
        actualActivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        actualActivo.setForeground(new java.awt.Color(33, 33, 33));
        actualActivo.setText("ACTUALIZAR");
        actualActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualActivoActionPerformed(evt);
            }
        });

        consulActivo.setBackground(new java.awt.Color(255, 87, 34));
        consulActivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        consulActivo.setForeground(new java.awt.Color(33, 33, 33));
        consulActivo.setText("CONSULTAR");
        consulActivo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        consulActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulActivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(consulActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(actualActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actualActivo)
                    .addComponent(consulActivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultar Activo", jPanel2);

        jPanel3.setBackground(new java.awt.Color(3, 169, 244));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(117, 117, 117), null));

        tabPrecio.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(189, 189, 189), null));
        tabPrecio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabPrecio);

        actualPrecio.setBackground(new java.awt.Color(255, 87, 34));
        actualPrecio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        actualPrecio.setForeground(new java.awt.Color(33, 33, 33));
        actualPrecio.setText("ACTUALIZAR");
        actualPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualPrecioActionPerformed(evt);
            }
        });

        consulPrecio.setBackground(new java.awt.Color(255, 87, 34));
        consulPrecio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        consulPrecio.setForeground(new java.awt.Color(33, 33, 33));
        consulPrecio.setText("CONSULTAR");
        consulPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulPrecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(consulPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(actualPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consulPrecio)
                    .addComponent(actualPrecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
        );

        jTabbedPane1.addTab("Consultar Precio", jPanel3);

        jPanel4.setBackground(new java.awt.Color(3, 169, 244));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(117, 117, 117), null));

        tabListado.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(189, 189, 189), null));
        tabListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tabListado);

        consulListado.setBackground(new java.awt.Color(255, 87, 34));
        consulListado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        consulListado.setForeground(new java.awt.Color(33, 33, 33));
        consulListado.setText("CONSULTAR");
        consulListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulListadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(consulListado, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(consulListado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultar Listado", jPanel4);

        jTabbedPane3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jPanel5.setBackground(new java.awt.Color(3, 169, 244));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(117, 117, 117), null));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 33, 33));
        jLabel1.setText("Nombre DB");

        selectDB.setBackground(new java.awt.Color(255, 87, 34));
        selectDB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Base Datos", "prestashop", "test" }));
        selectDB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectDBItemStateChanged(evt);
            }
        });
        selectDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectDBActionPerformed(evt);
            }
        });

        selectTablas.setBackground(new java.awt.Color(255, 87, 34));
        selectTablas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione tabla" }));
        selectTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTablasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(33, 33, 33));
        jLabel2.setText("TABLA");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(33, 33, 33));
        jLabel3.setText("CAMPO 1");

        campo1.setBackground(new java.awt.Color(255, 87, 34));
        campo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Columna" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(33, 33, 33));
        jLabel4.setText("CAMPO 2");

        campo2.setBackground(new java.awt.Color(255, 87, 34));
        campo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Columna" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(33, 33, 33));
        jLabel5.setText("CAMPO 3");

        campo3.setBackground(new java.awt.Color(255, 87, 34));
        campo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Columna" }));

        consultar.setBackground(new java.awt.Color(255, 87, 34));
        consultar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        consultar.setForeground(new java.awt.Color(33, 33, 33));
        consultar.setText("CONSULTAR");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        tabTablas.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(189, 189, 189), null));
        tabTablas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tabTablas);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(campo1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(campo2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectDB, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(selectTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(campo3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(consultar, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectTablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
        );

        jTabbedPane3.addTab("Avanzado", jPanel5);

        jPanel6.setBackground(new java.awt.Color(3, 169, 244));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(117, 117, 117), null));

        tabEurowin.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(189, 189, 189), null));
        tabEurowin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabEurowin.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane5.setViewportView(tabEurowin);

        consultar1.setBackground(new java.awt.Color(255, 87, 34));
        consultar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        consultar1.setForeground(new java.awt.Color(33, 33, 33));
        consultar1.setText("CONSULTAR");
        consultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar1ActionPerformed(evt);
            }
        });

        actualizar1.setBackground(new java.awt.Color(255, 87, 34));
        actualizar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        actualizar1.setForeground(new java.awt.Color(33, 33, 33));
        actualizar1.setText("ACTUALIZAR");
        actualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar1ActionPerformed(evt);
            }
        });

        borrar.setBackground(new java.awt.Color(255, 87, 34));
        borrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        borrar.setForeground(new java.awt.Color(33, 33, 33));
        borrar.setText("BORRAR FILA");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(consultar1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(actualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultar1)
                    .addComponent(actualizar1)
                    .addComponent(borrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Actualizar Precio", jPanel6);

        jTabbedPane5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(117, 117, 117), null));

        jPanel7.setBackground(new java.awt.Color(3, 169, 244));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(117, 117, 117), null));

        tabStock.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(189, 189, 189), null));
        tabStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabStock.setToolTipText("");
        tabStock.setName(""); // NOI18N
        tabStock.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jScrollPane6.setViewportView(tabStock);
        tabStock.getAccessibleContext().setAccessibleName("");

        consultar2.setBackground(new java.awt.Color(255, 87, 34));
        consultar2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        consultar2.setForeground(new java.awt.Color(33, 33, 33));
        consultar2.setText("CONSULTAR");
        consultar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar2ActionPerformed(evt);
            }
        });

        desactivar.setBackground(new java.awt.Color(255, 87, 34));
        desactivar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        desactivar.setText("DESACTIVAR ARTICULO");
        desactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desactivarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(179, 229, 252));
        jLabel6.setText("Entre");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(179, 229, 252));
        jLabel7.setText("y");

        buscar.setBackground(new java.awt.Color(255, 87, 34));
        buscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buscar.setForeground(new java.awt.Color(33, 33, 33));
        buscar.setMnemonic('i');
        buscar.setText("BUSCAR");
        buscar.setToolTipText("");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(179, 229, 252));
        jLabel8.setText("ID Producto:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(consultar2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 603, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(desactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(consultar2)
                    .addComponent(jLabel6)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar)
                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desactivar)
                    .addComponent(jLabel8))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Stock Tienda", jPanel7);

        jPanel8.setBackground(new java.awt.Color(3, 169, 244));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(117, 117, 117), null));

        tabDesactivados.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(189, 189, 189), null));
        tabDesactivados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(tabDesactivados);

        ver.setBackground(new java.awt.Color(255, 87, 34));
        ver.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ver.setForeground(new java.awt.Color(33, 33, 33));
        ver.setText("STOCK");
        ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActionPerformed(evt);
            }
        });

        activarArticulo.setBackground(new java.awt.Color(255, 87, 34));
        activarArticulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        activarArticulo.setForeground(new java.awt.Color(33, 33, 33));
        activarArticulo.setText("ACTIVAR ARTICULO");
        activarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activarArticuloActionPerformed(evt);
            }
        });

        grafica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(51, 51, 51), null, null));

        tabReporte.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(189, 189, 189), null));
        tabReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(tabReporte);

        javax.swing.GroupLayout graficaLayout = new javax.swing.GroupLayout(grafica);
        grafica.setLayout(graficaLayout);
        graficaLayout.setHorizontalGroup(
            graficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        graficaLayout.setVerticalGroup(
            graficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
        );

        reporteVentas.setBackground(new java.awt.Color(255, 87, 34));
        reporteVentas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reporteVentas.setForeground(new java.awt.Color(33, 33, 33));
        reporteVentas.setText("REPORTE");
        reporteVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteVentasActionPerformed(evt);
            }
        });

        barrasGraficas.setBackground(new java.awt.Color(255, 87, 34));
        barrasGraficas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        barrasGraficas.setForeground(new java.awt.Color(33, 33, 33));
        barrasGraficas.setText("GENERAR GRAFICA");
        barrasGraficas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barrasGraficasActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(179, 229, 252));
        jLabel9.setText("YEAR:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(ver, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(activarArticulo)))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(reporteVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                        .addComponent(barrasGraficas)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ver)
                    .addComponent(activarArticulo)
                    .addComponent(reporteVentas)
                    .addComponent(barrasGraficas)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane7))
                .addContainerGap())
        );

        jTabbedPane5.addTab("Articulos desactivados/Reporte de Ventas", jPanel8);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane5)
                .addContainerGap())
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(117, 117, 117), null));

        jMenu1.setForeground(new java.awt.Color(255, 0, 51));
        jMenu1.setText("QUERY PRESTA");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// sentencias sql para actualizar las tablas product_shop y product
    private void actualActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualActivoActionPerformed
        tabActivo.setModel(new DefaultTableModel());//borra la tabla 
//       ejecutar_sql_update("update prestashop.product ps  inner join test.productos p  on p.ean=ps.ean13  set ps.active= p.Activo;");
//       ejecutar_sql_update("update prestashop.product_shop ps  inner join prestashop.product p  on p.id_product=ps.id_product  set ps.active= p.active;");
       JOptionPane.showMessageDialog(null, "¡Tabla actualizada!", "información",1);
       
    }//GEN-LAST:event_actualActivoActionPerformed
//consulta el activo de la tabla product_shop y productos
    private void consulActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulActivoActionPerformed
         
              try { 
            tabActivo.setModel(new DefaultTableModel());//reinicia la tabla 
             
             
            st = conexion.createStatement();
            ResultSet rs;//creo un objeto de la clase ResultSet que será el encargado de devolvernos los resultados de los registros:
            rs=st.executeQuery("SELECT ps.id_product ,ps.active,p.Activo from prestashop.product ps  inner join test.productos p  on p.ean=ps.ean13 where ps.active!=p.Activo order by ps.id_product asc ;");
           
            DefaultTableModel modelo =(DefaultTableModel) tabActivo.getModel();//declaro un objeto de tipo DefaultTableModel y le asigno el modelo que posee la tabla que tengo en el programa.
            // Creamos las columnas y coloca los nombres 
             modelo.addColumn("id_product");
             modelo.addColumn("active");
             modelo.addColumn("Activo");
             // Bucle para cada resultado en la consulta
              while(rs.next()){
               // Se crea un array que será una de las filas de la tabla y tres campos. 
                 Object [] fila = new Object[3]; // Hay tres columnas en la tabla
               // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
              for (int i=0;i<3;i++)
                fila[i] = rs.getObject(i+1); // El primer indice en rs es el 1, no el cero, por eso se sum
               // Se añade al modelo la fila completa.
                    modelo.addRow(fila);
              
               }
         
        } catch (SQLException ex) {
            Logger.getLogger(QueryPresta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_consulActivoActionPerformed
//consulta el precio de la tabla product_shop y productos
    private void consulPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulPrecioActionPerformed
         try {
              tabPrecio.setModel(new DefaultTableModel());//reinicia la tabla antes de consultar
             
        
            st = conexion.createStatement();
            ResultSet rs;//creo un objeto de la clase ResultSet que será el encargado de devolvernos los resultados de los registros:
            //rs=st.executeQuery("SELECT ps.id_product,p.name Nombre,ps.quantity Vendidos,ps.date_upd Fecha from prestashop.product_sale ps  inner join prestashop.product_lang p  on p.id_product=ps.id_product order by ps.date_upd asc;");
            rs=st.executeQuery("SELECT ps.id_product,round(ps.price,2),round(p.Precio,2) from prestashop.product_shop ps  inner join test.productos p  on p.id=ps.id_product where ps.price!=p.Precio order by ps.id_product asc;");
           
            DefaultTableModel model =(DefaultTableModel) tabPrecio.getModel();//declaro un objeto de tipo DefaultTableModel y le asigno el modelo que posee la tabla que tengo en el programa.
             // Creamos las columnas y coloca los nombres 
            model.addColumn("id_product");
            model.addColumn("price");
            model.addColumn("Precio");
            //model.addColumn("Fecha");
             // Bucle para cada resultado en la consulta
              while(rs.next()){
               // Se crea un array que será una de las filas de la tabla. 
                 Object [] fila = new Object[3]; // Hay tres columnas en la tabla
               // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
              for (int i=0;i<3;i++)
                fila[i] = rs.getObject(i+1); // El primer indice en rs es el 1, no el cero, por eso se sum
               // Se añade al modelo la fila completa.
                    model.addRow(fila);
              
               }
           
                
        } catch (SQLException ex) {
            Logger.getLogger(QueryPresta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_consulPrecioActionPerformed
// sentencias sql para actualizar las tablas
    private void actualPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualPrecioActionPerformed
       tabPrecio.setModel(new DefaultTableModel());//borra la tabla
//       ejecutar_sql_update("update prestashop.product_shop ps  inner join test.productos p  on p.id=ps.id_product  set ps.price= p.Precio;");
//       ejecutar_sql_update("update prestashop.product ps  inner join test.productos p  on p.id=ps.id_product  set ps.price= p.Precio");
     JOptionPane.showMessageDialog(null, "¡Tabla actualizada!", "información",1);
    }//GEN-LAST:event_actualPrecioActionPerformed

    private void consulListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulListadoActionPerformed
             try {
          tabListado.setModel(new DefaultTableModel());//reinicia la tabla antes de consultar


             ResultSet rs;//creo un objeto de la clase ResultSet que será el encargado de devolvernos los resultados de los registros:
             String sql="SELECT ip.id_product,pl.name,a.contador FROM prestashop.product ip inner join prestashop.product_lang pl on pl.id_product=ip.id_product inner join(SELECT count(*) contador,id_product FROM prestashop.category_product group by id_product order by id_product)a on a.id_product=ip.id_product where contador!= 4 order by name;";
             st = conexion.createStatement();
             rs=st.executeQuery(sql);
             
            
              DefaultTableModel modelo =(DefaultTableModel) tabListado.getModel();//declaro un objeto de tipo DefaultTableModel y le asigno el modelo que posee la tabla que tengo en el programa.
            // Creamos las columnas y coloca los nombres 
             modelo.addColumn("id_product");
             modelo.addColumn("Nombre");
             modelo.addColumn("Cantidad");
             //para dar tamaño alas columnas
              TableColumnModel tabla = tabListado.getColumnModel();
              TableColumn columna0 = tabla.getColumn(0);
              TableColumn columna1 = tabla.getColumn(1);
              TableColumn columna2 = tabla.getColumn(2);
              
              columna0.setPreferredWidth(55);
              columna1.setPreferredWidth(300);
              columna2.setPreferredWidth(20);
             
             // Bucle para cada resultado en la consulta
              while(rs.next()){
               // Se crea un array que será una de las filas de la tabla. 
                 Object [] fila = new Object[3]; // Hay tres columnas en la tabla
               // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
              for (int i=0;i<3;i++)
                fila[i] = rs.getObject(i+1); // El primer indice en rs es el 1, no el cero, por eso se sum
               // Se añade al modelo la fila completa.
                    modelo.addRow(fila);
              
               }
           
      }

                 catch (SQLException ex) {
                 Logger.getLogger(QueryPresta.class.getName()).log(Level.SEVERE, null, ex);
             }
    }//GEN-LAST:event_consulListadoActionPerformed

    private void selectDBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectDBItemStateChanged
       
    }//GEN-LAST:event_selectDBItemStateChanged
// boton para seleccionar la DB y coloca en los campos las tablas a seleccionar
    private void selectDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectDBActionPerformed
         if(selectDB.getSelectedItem()=="test"){
           selectTablas.setModel(new DefaultComboBoxModel(tablasTest));
           campo1.setModel(new DefaultComboBoxModel(tablaProductos));
           campo2.setModel(new DefaultComboBoxModel(tablaProductos));
           campo3.setModel(new DefaultComboBoxModel(tablaProductos));
           }else if(selectDB.getSelectedItem()=="prestashop"){ 
          selectTablas.setModel(new DefaultComboBoxModel(tablasPresta));
          campo1.setModel(new DefaultComboBoxModel(tablaProduct));
          campo2.setModel(new DefaultComboBoxModel(tablaProduct));
          campo3.setModel(new DefaultComboBoxModel(tablaProduct));
        }else{ JOptionPane.showMessageDialog(null, "¡Los valores no son válidos!", "Información",1);
    }     
    }//GEN-LAST:event_selectDBActionPerformed
// boton para seleccionar las tablas y coloca en los campos las columnas a seleccionar
    private void selectTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTablasActionPerformed
             if(selectTablas.getSelectedItem()=="product"){
          campo1.setModel(new DefaultComboBoxModel(tablaProduct));
          campo2.setModel(new DefaultComboBoxModel(tablaProduct));
          campo3.setModel(new DefaultComboBoxModel(tablaProduct));
      }else if(selectTablas.getSelectedItem()=="product_shop"){
          campo1.setModel(new DefaultComboBoxModel(tablaProduct_shop));
          campo2.setModel(new DefaultComboBoxModel(tablaProduct_shop));
          campo3.setModel(new DefaultComboBoxModel(tablaProduct_shop));
      }else if(selectTablas.getSelectedItem()=="productos"){
          campo1.setModel(new DefaultComboBoxModel(tablaProductos));
          campo2.setModel(new DefaultComboBoxModel(tablaProductos));
          campo3.setModel(new DefaultComboBoxModel(tablaProductos));
      }else if(selectTablas.getSelectedItem()=="ordenes"){
          campo1.setModel(new DefaultComboBoxModel(tablaOrdenes));
          campo2.setModel(new DefaultComboBoxModel(tablaOrdenes));
          campo3.setModel(new DefaultComboBoxModel(tablaOrdenes));
      }else{
          JOptionPane.showMessageDialog(null, "¡Los valores no son válidos!", "Información",1);
      }
             
    }//GEN-LAST:event_selectTablasActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
          try{  
             tabTablas.setModel(new DefaultTableModel());//reinicia la tabla 
             
               //devuelve los valores de los campos seleccionados
               String camp1=(String)campo1.getSelectedItem();
               String camp2=(String)campo2.getSelectedItem();
               String camp3=(String)campo3.getSelectedItem();
               String camp4=(String)selectDB.getSelectedItem();
               String camp5=(String)selectTablas.getSelectedItem();
               ResultSet rs;//creo un objeto de la clase ResultSet que será el encargado de devolvernos los resultados de los registros:
               String sql1="";
               
              //realiza la consulta en función de los valores de los campos de consulta
             String sql=(String)sql1+"SELECT "+camp1+","+camp2+","+camp3+" from "+camp4+"."+camp5+";";
             st = conexion.createStatement();
             rs=st.executeQuery(sql);
             DefaultTableModel modelo =(DefaultTableModel) tabTablas.getModel();//declaro un objeto de tipo DefaultTableModel y le asigno el modelo que posee la tabla que tengo en el programa.
            // Creamos las columnas.
             modelo.addColumn(camp1);
             modelo.addColumn(camp2);
             modelo.addColumn(camp3);
            
                         
              // Bucle para cada resultado en la consulta
              while(rs.next()){
               // Se crea un array que será una de las filas de la tabla. 
                 Object [] fila = new Object[3]; // Hay tres columnas en la tabla
               // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
              for (int i=0;i<3;i++)
                fila[i] = rs.getObject(i+1); // El primer indice en rs es el 1, no el cero, por eso se sum
               // Se añade al modelo la fila completa.
                    modelo.addRow(fila);
              
               }
                   
            
      }

                 catch (SQLException ex) {
                 Logger.getLogger(QueryPresta.class.getName()).log(Level.SEVERE, null, ex);
             }
    }//GEN-LAST:event_consultarActionPerformed

    private void consultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar1ActionPerformed
          try {
            tabEurowin.setModel(new DefaultTableModel());//reinicia la tabla 
            
           // Crear tabla actualizar
          st = conexion.createStatement();
          tt = conexion.createStatement();
          struncate = conexion.createStatement();
         
          //Permite comandos SQL
          stmt=con.createStatement();
          //primero creo la tabla si no existe 
          st.executeUpdate("CREATE TABLE IF NOT EXISTS actualizar (id_actualizar INT NOT NULL PRIMARY KEY AUTO_INCREMENT,id_product VARCHAR(50),Codigo VARCHAR(32),Nombre VARCHAR(50),precioWEB float,Eurowin float);");
           //borro los datos anteriores
           struncate.executeUpdate("truncate table prestashop.actualizar");
         
            String sql="SELECT w.id_product,right(codigo,6) as codigo,left (nombre,50)as nombre, round( w.price,2) as precioWEB, round(p.pvp,2) as Eurowin  FROM [SRVDATOS1].[2017cy].[dbo].[articulo] a inner join [SRVDATOS1].[2017cy].[dbo].[pvp] p on p.articulo=a.codigo and tarifa='01' inner join ( select * from OPENQUERY(prestashop, 'SELECT id_product,reference,price FROM prestashop.product where active=1')) w on w.reference  =  right(a.codigo,6) collate Modern_Spanish_CS_AI  where price!=pvp"; 
	    String idp1,idp3,idp,idp2,idp4,p ;
            rs=stmt.executeQuery(sql);
      
            
                
                  while(rs.next()){
               idp1=rs.getString("codigo");
             // String codigo=codigo1.substring(9);  modifica la variable codigo1 y le resta 9 ceros
              idp3=rs.getString("nombre");       
               idp=rs.getString("id_product");
               idp2=rs.getString("precioWEB");
               idp4=rs.getString("Eurowin");
               p="INSERT INTO actualizar (id_product,Codigo,Nombre,precioWEB,Eurowin) VALUES("+idp+","+idp1+",'"+idp3+"',"+idp2+","+idp4+");";
              tt.executeUpdate(p);
         
             
                  }
                   // consulta tabla actualizar
           String SQL1 = "SELECT id_product, Codigo, Nombre, precioWEB, Eurowin FROM prestashop.actualizar;";
           ts = conexion.createStatement();
           rr = ts.executeQuery(SQL1);
                  
                   
                   
                   DefaultTableModel modelo =(DefaultTableModel) tabEurowin.getModel();
                  
                   
                    modelo.addColumn("id_product");
                    modelo.addColumn("Codigo_EW");
                    modelo.addColumn("Nombre");
                    modelo.addColumn("precioWEB");
                    modelo.addColumn("Eurowin");
                    
                 //coloca el tamaño a las columnas pero antes hay que marcar el autoResizeMode del diseño a off
                  TableColumnModel tabla = tabEurowin.getColumnModel();
                  
                    TableColumn columna1 = tabla.getColumn(0);
                    TableColumn columna2 = tabla.getColumn(1);
                    TableColumn columna3 = tabla.getColumn(2);
                    TableColumn columna4 = tabla.getColumn(3);
                    TableColumn columna5 = tabla.getColumn(4);
                    columna1.setPreferredWidth(90);
                    columna2.setPreferredWidth(90);
                    columna3.setPreferredWidth(400);
                    columna4.setPreferredWidth(95);
                    columna5.setPreferredWidth(105);
              
                  
                    while(rr.next()){
                  
                 
               // Se crea un array que será una de las filas de la tabla. 
                
                 Object [] fila = new Object[5];// Hay 5 columnas en la tabla
               // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
              for (int i=0;i<5;i++)
                fila[i] = rr.getObject(i+1); // El primer indice en rs es el 1, no el cero, por eso se sum 1
               // Se añade al modelo la fila completa.
                    modelo.addRow(fila);
                   
               }

      
   
                   } catch (SQLException ex) {
           Logger.getLogger(QueryPresta.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_consultar1ActionPerformed
// actualiza las tablas con el precio de Eurowin
    private void actualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar1ActionPerformed
         ejecutar_sql_update("update prestashop.product_shop ps  inner join prestashop.actualizar p  on p.id_product=ps.id_product  set ps.price= p.Eurowin;");
         ejecutar_sql_update("update prestashop.product ps  inner join prestashop.actualizar p  on p.id_product=ps.id_product  set ps.price= p.Eurowin;");
    }//GEN-LAST:event_actualizar1ActionPerformed
//borra la fila de la tabla
    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
       int filsel = tabEurowin.getSelectedRow();
    if(filsel == -1){
        JOptionPane.showMessageDialog(null,"¡Seleccione una fila!");// en caso de no seleccionar una fila lanza un aviso
    }else{
        try {
            TableModel m = tabEurowin.getModel();
            for(int i = 0; i<m.getRowCount(); i++){
                //Se toman los datos de la tabla 
               String id = (String) m.getValueAt(filsel, 0);// id mostrado en la primera columna
                String sql="SELECT * FROM prestashop.actualizar WHERE id_product = '" + id + "'";
                 st = conexion.createStatement();
                sr = st.executeQuery(sql);
                if(sr.next()){
                    String sql2="DELETE FROM prestashop.actualizar WHERE id_product = '" + id + "'";
                    t2 = conexion.createStatement();
                    t2.executeUpdate(sql2);
                  
                }
              
            }
             DefaultTableModel dtm = (DefaultTableModel) tabEurowin.getModel(); //tabEurowin es el nombre de mi tabla
               dtm.removeRow(tabEurowin.getSelectedRow());// se encarga de borrar la fila del JTable
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_borrarActionPerformed

    private void consultar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar2ActionPerformed
          try {
            tabStock.setModel(new DefaultTableModel());//reinicia la tabla
            //selecciona un modo de consulta u otro
                  String SQL1;
        String v1=c1.getText();
        String v2=c2.getText();
        v1=v1.trim(); 
        v2=v2.trim();
      if(v1.length()== 0 || v2.length()== 0){
          SQL1 = "SELECT id_PRESTA, articulo, Nombre, pvp,`12`,`15`,`25`,`28`, ped_12, ped_15,ped_25, ped_28, STOCK_PRESTA, abrev, total, diferencia FROM prestashop.eurowin_abrev;";
         
      }else{
          float f=Float.parseFloat(c1.getText());
          float f1=Float.parseFloat(c2.getText());
                        // consulta tabla eurowin_abrev
            SQL1 = "SELECT id_PRESTA, articulo, Nombre, pvp,`12`,`15`,`25`,`28`, ped_12, ped_15,ped_25, ped_28, STOCK_PRESTA, abrev, total, diferencia FROM prestashop.eurowin_abrev WHERE diferencia  BETWEEN "+f+" AND "+f1+";";
          
      }
          
            
          
           
            
           // Crear tabla eurowin_abrev
          ts=conexion.createStatement();
          st = conexion.createStatement();
          tt = conexion.createStatement();
          struncate = conexion.createStatement();
         
          //Permite comandos SQL
          stmt=con.createStatement();
          //primero creo la tabla si no existe 
          st.executeUpdate("CREATE TABLE IF NOT EXISTS eurowin_abrev (id_eurowin_abrev INT NOT NULL PRIMARY KEY AUTO_INCREMENT,id_PRESTA INT(8) NULL,articulo VARCHAR(6) NULL,Nombre VARCHAR(70) NULL,STOCK_PRESTA VARCHAR(4) NULL,pvp float NULL,abrev VARCHAR(4) NULL,`12` float NULL, ped_12 float NULL,`15` float NULL, ped_15 float NULL,`25` float NULL, ped_25 float NULL,`28` float NULL, ped_28 float NULL,total float NULL,diferencia float NULL);");
           //borro los datos anteriores
           struncate.executeUpdate("truncate table prestashop.eurowin_abrev");
            //String SQL = "SELECT ps.id_product ,ps.reference,ps.price from prestashop.product ps;";
            String sql="SELECT	w.id_product as id_PRESTA, \n" +
"			right(a.codigo,6) as articulo,\n" +
"		a.nombre,\n" +
"		sp.quantity as STOCK_PRESTA,\n" +
"		p.pvp,\n" +
"		left(a.abrev,3) as abrev,\n" +
"				\n" +
"			\n" +
"		coalesce(s12.final,null,0) as '12',\n" +
"		isnull(w12.pedidos12 ,0) as 'ped_12',\n" +
"	\n" +
"	\n" +
"		coalesce(s15.final,null,0) as '15',\n" +
"		isnull(w15.pedidos15 ,0) as 'ped_15',\n" +
"	\n" +
"		coalesce(s25.final,null,0) as '25',\n" +
"		isnull(w25.pedidos25 ,0) as 'ped_25',\n" +
"	\n" +
"		coalesce(s28.final,null,0) as '28',\n" +
"		isnull(w28.pedidos28 ,0) as 'ped_28',\n" +
"	\n" +
"		isnull(s12.final,0) - isnull(w12.pedidos12 ,0) +\n" +
"		isnull(s15.final ,0)- isnull(w15.pedidos15 ,0) +\n" +
"		\n" +
"		isnull(s25.final,0) - isnull(w25.pedidos25 ,0) +\n" +
"		isnull(s28.final,0) - isnull(w28.pedidos28 ,0) \n" +
"	\n" +
"		as total,\n" +
"		\n" +
"		isnull(s12.final,0) - isnull(w12.pedidos12 ,0) +\n" +
"		isnull(s15.final ,0)- isnull(w15.pedidos15 ,0) +\n" +
"		isnull(s25.final,0) - isnull(w25.pedidos25 ,0) +\n" +
"		isnull(s28.final,0) - isnull(w28.pedidos28 ,0)  -\n" +
"		\n" +
"		coalesce(a.abrev,'',0) as diferencia      \n" +
"\n" +
"  FROM [srvdatos1].[2017cy].dbo.articulo a\n" +
"\n" +
"		inner join [srvdatos1].[2017cy].dbo.pvp p on a.codigo=p.articulo\n" +
"\n" +
"		  left join \n" +
"  \n" +
"  ( select * from OPENQUERY(prestashop, 'SELECT id_product,reference, quantity from prestashop.product where active=1') )  w on w.reference  =  right(a.codigo,6) collate Modern_Spanish_CS_AI\n" +
"   \n" +
"   left join \n" +
"    ( select * from OPENQUERY(prestashop, 'SELECT id_product, quantity from prestashop.stock_available' ) )  sp on w.id_product  = sp.id_product \n" +
"		\n" +
"\n" +
"		left join ( select articulo, sum(final) as final  from [srvdatos1].[2017cy].dbo.stocks s\n" +
"			where s.empresa+s.articulo+s.almacen+ cast (s.fecha  as char )  in \n" +
"			(select empresa+articulo+almacen+cast( max(fecha) as char) from [srvdatos1].[2017cy].dbo.stocks\n" +
"			 group by  empresa,articulo,almacen )			\n" +
"			and almacen='25'\n" +
"			and empresa='01'\n" +
"			group by articulo ) s25 on s25.articulo=a.codigo	\n" +
"        \n" +
"		 left join ( select articulo, sum(final) as final  from [srvdatos1].[2017cy].dbo.stocks s\n" +
"			where s.empresa+s.articulo+s.almacen+ cast (s.fecha  as char )  in \n" +
"			(select empresa+articulo+almacen+cast( max(fecha) as char) from [srvdatos1].[2017cy].dbo.stocks\n" +
"			 group by  empresa,articulo,almacen )			\n" +
"			and almacen='28'\n" +
"			and empresa='01'\n" +
"			group by articulo ) s28 on s28.articulo=a.codigo	\n" +
"        \n" +
"		\n" +
"		left join ( select articulo, sum(final) as final  from [srvdatos1].[2017cy].dbo.stocks s\n" +
"			where s.empresa+s.articulo+s.almacen+ cast (s.fecha  as char )  in \n" +
"			(select empresa+articulo+almacen+cast( max(fecha) as char) from [srvdatos1].[2017cy].dbo.stocks\n" +
"			 group by  empresa,articulo,almacen )			\n" +
"			and almacen='15'\n" +
"			and empresa='01'\n" +
"			group by articulo ) s15 on s15.articulo=a.codigo	\n" +
"        \n" +
"\n" +
"		left join ( select articulo, sum(final) as final  from [srvdatos1].[2017cy].dbo.stocks s\n" +
"			where s.empresa+s.articulo+s.almacen+ cast (s.fecha  as char )  in \n" +
"			(select empresa+articulo+almacen+cast( max(fecha) as char) from [srvdatos1].[2017cy].dbo.stocks\n" +
"			 group by  empresa,articulo,almacen )			\n" +
"			and almacen='12'\n" +
"			and empresa='01'\n" +
"			group by articulo ) s12 on s12.articulo=a.codigo\n" +
"	     \n" +
"		left join (select articulo,sum(unidades) as pedidos12 from [srvdatos1].[2017cy].dbo.d_pedive d \n" +
"					inner join [srvdatos1].[2017cy].dbo.c_pedive c on c.empresa+c.letra+c.numero=d.empresa+d.letra+d.numero\n" +
"					inner join [srvdatos1].[2017cy].dbo.articulo a on a.codigo=d.articulo\n" +
"					where a.internet=1 	and d.unidades-d.servidas!=0 and d.articulo!='' and d.empresa='01' and c.almacen='12'\n" +
"					group by articulo ) as w12 on a.codigo=w12.articulo\n" +
"		 \n" +
"		left join (select articulo,sum(unidades) as pedidos15 from [srvdatos1].[2017cy].dbo.d_pedive d \n" +
"					inner join [srvdatos1].[2017cy].dbo.c_pedive c on c.empresa+c.letra+c.numero=d.empresa+d.letra+d.numero\n" +
"					inner join [srvdatos1].[2017cy].dbo.articulo a on a.codigo=d.articulo\n" +
"					where a.internet=1 	and d.unidades-d.servidas!=0 and d.articulo!='' and d.empresa='01' and c.almacen='15'\n" +
"					group by articulo ) as w15 on a.codigo=w15.articulo\n" +
"		\n" +
"\n" +
"		left join (select articulo,sum(unidades) as pedidos25 from [srvdatos1].[2017cy].dbo.d_pedive d \n" +
"					inner join [srvdatos1].[2017cy].dbo.c_pedive c on c.empresa+c.letra+c.numero=d.empresa+d.letra+d.numero\n" +
"					inner join [srvdatos1].[2017cy].dbo.articulo a on a.codigo=d.articulo\n" +
"					where a.internet=1 	and d.unidades-d.servidas!=0 and d.articulo!='' and d.empresa='01' and c.almacen='25'\n" +
"					group by articulo ) as w25 on a.codigo=w25.articulo\n" +
"		\n" +
"\n" +
"		left join (select articulo,sum(unidades) as pedidos28 from [srvdatos1].[2017cy].dbo.d_pedive d \n" +
"					inner join [srvdatos1].[2017cy].dbo.c_pedive c on c.empresa+c.letra+c.numero=d.empresa+d.letra+d.numero\n" +
"					inner join [srvdatos1].[2017cy].dbo.articulo a on a.codigo=d.articulo\n" +
"					where a.internet=1 	and d.unidades-d.servidas!=0 and d.articulo!='' and d.empresa='01' and c.almacen='28'\n" +
"					group by articulo ) as w28 on a.codigo=w28.articulo\n" +
"\n" +
"where  \n" +
" a.internet=1\n" +
"and p.tarifa='01'\n" +
"order by diferencia asc , articulo"; 
          
	    String  idp2,idp3,idp4,idp6,p;
            float idp5,idp7,idp8,idp9,idp10,idp11,idp12,idp13,idp14,idp15,idp16 ;
            int idp1;
            rs=stmt.executeQuery(sql);
        
            
                //recorre el resultset
                  while(rs.next()){
              idp1=rs.getInt("id_PRESTA");
              idp2=rs.getString("articulo");
              idp3=rs.getString("nombre");
              idp3=idp3.replaceAll("\'","");// borra las comillas simples
              idp4=rs.getString("STOCK_PRESTA");
              idp5=rs.getFloat("pvp");
              idp6=rs.getString("abrev");
              idp7=rs.getFloat("12");
              idp8=rs.getFloat("ped_12");
              idp9=rs.getFloat("15");       
              idp10=rs.getFloat("ped_15");
              idp11=rs.getFloat("25");
              idp12=rs.getFloat("ped_25");
              idp13=rs.getFloat("28");       
              idp14=rs.getFloat("ped_28");
              idp15=rs.getFloat("total");
              idp16=rs.getFloat("diferencia");
             
               p="INSERT INTO eurowin_abrev (id_PRESTA, articulo, Nombre, STOCK_PRESTA, pvp, abrev, `12`, ped_12, `15`, ped_15, `25`, ped_25, `28`, ped_28,total,diferencia) VALUES("+idp1+",'"+idp2+"','"+idp3+"','"+idp4+"',"+idp5+",'"+idp6+"',"+idp7+","+idp8+","+idp9+","+idp10+","+idp11+","+idp12+","+idp13+","+idp14+","+idp15+","+idp16+");";
              tt.executeUpdate(p);
         
             
                  }
           
           
          
           sr=ts.executeQuery(SQL1);
                  
             
                   // añade los nombres a las columnas
                   DefaultTableModel modelo =(DefaultTableModel) tabStock.getModel();
                  
                   
                    modelo.addColumn("id_PRESTA");
                    modelo.addColumn("articulo");
                    modelo.addColumn("Nombre");
                    modelo.addColumn("pvp");
                    modelo.addColumn("12");
                    modelo.addColumn("15");
                    modelo.addColumn("25");
                    modelo.addColumn("28");
                    modelo.addColumn("ped_12");
                    modelo.addColumn("ped_15");
                    modelo.addColumn("ped_25");
                    modelo.addColumn("ped_28");
                    modelo.addColumn("STOCK_PRESTA");
                    modelo.addColumn("abrev");
                    modelo.addColumn("total");
                    modelo.addColumn("diferencia");
                    
                  //coloca el tamaño a las columnas pero antes hay que marcar el autoResizeMode del diseño a off
                  TableColumnModel tabla = tabStock.getColumnModel();//
                  
                   
                    TableColumn columna2 = tabla.getColumn(2);
                    TableColumn columna3 = tabla.getColumn(3);
                    TableColumn columna4 = tabla.getColumn(4);
                    TableColumn columna5 = tabla.getColumn(5);
                    TableColumn columna6 = tabla.getColumn(6);
                    TableColumn columna7 = tabla.getColumn(7);
                    TableColumn columna8 = tabla.getColumn(8);
                    TableColumn columna9 = tabla.getColumn(9);
                    TableColumn columna10 = tabla.getColumn(10);
                    TableColumn columna11 = tabla.getColumn(11);
                    TableColumn columna12 = tabla.getColumn(12);
                    TableColumn columna13 = tabla.getColumn(13);
                    TableColumn columna14 = tabla.getColumn(14);
                    
                    columna2.setPreferredWidth(400);
                    columna3.setPreferredWidth(60);
                    columna4.setPreferredWidth(55);
                    columna5.setPreferredWidth(55);
                    columna6.setPreferredWidth(55);
                    columna7.setPreferredWidth(55);
                    columna8.setPreferredWidth(55);
                    columna9.setPreferredWidth(55);
                    columna10.setPreferredWidth(55);
                    columna11.setPreferredWidth(55);
                    columna12.setPreferredWidth(105);
                    columna13.setPreferredWidth(50);
                    columna14.setPreferredWidth(65);
                   
                
              
                  
                    while(sr.next()){
                        
                  
                 
               // Se crea un array que será una de las filas de la tabla. 
                
                 Object [] fila = new Object[16];// Hay 16 columnas en la tabla
               // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
              for (int i=0;i<16;i++)
                fila[i] = sr.getObject(i+1); // El primer indice en rr es el 1, no el cero, por eso se sum
               // Se añade al modelo la fila completa.
                    modelo.addRow(fila);
                  
               }
        
           }
   
          catch (SQLException ex) {
           Logger.getLogger(QueryPresta.class.getName()).log(Level.SEVERE, null, ex);
                           } 
          //borra los dos text después del proceso
                   c1.setText("");
                   c2.setText("");
    }//GEN-LAST:event_consultar2ActionPerformed
    //para desativar los articulos
    private void desactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desactivarActionPerformed

       
        
        int filsel = tabStock.getSelectedRow();
        
    if(filsel == -1){
        JOptionPane.showMessageDialog(null,"¡Seleccione una fila!");// en caso de no seleccionar una fila lanza un aviso
    }else{
        try {
            TableModel m = tabStock.getModel();
               for(int i = 0; i<m.getRowCount(); i++){
                //Se toman los datos de la tabla 
               int id =(int) m.getValueAt(filsel, 0);// id mostrado en la primera columna
                String sql="SELECT * FROM prestashop.product WHERE id_product =" + id + ";";
                st = conexion.createStatement();
                sr = st.executeQuery(sql);
                if(sr.next()){
                    String sql2="update prestashop.product   set active= 0 WHERE id_product =" + id + ";";
                    t2 = conexion.createStatement();
                    t2.executeUpdate(sql2);
                }
                String lqs="SELECT * FROM prestashop.product_shop WHERE id_product =" + id + ";";
                t4 = conexion.createStatement();
                ss = t4.executeQuery(lqs);
                if(ss.next()){
                   String sql3="update prestashop.product_shop set active= 0 WHERE id_product =" + id + " and`id_shop`='1';";
                    t1= conexion.createStatement();
                    t1.executeUpdate(sql3);
                }
                
            }
             DefaultTableModel dtm = (DefaultTableModel) tabStock.getModel(); //tabStock es el nombre de mi tabla
               dtm.removeRow(tabStock.getSelectedRow());// se encarga de borrar la fila del JTable
        } catch (Exception e) {
            e.printStackTrace();
        }
    }        
    }//GEN-LAST:event_desactivarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
           
          tabStock.setModel(new DefaultTableModel());//reinicia la tabla  
        try {
            
            //selecciona un modo de consulta u otro
        String SQL2;         
        String v1=c3.getText();
       
        v1=v1.trim(); 
        
      if(v1.length()== 0){
          JOptionPane.showMessageDialog(null,"¡Inserte id del Artículo!");// en caso de no escribir id lanza un aviso
            SQL2="SELECT id_PRESTA, articulo, Nombre, pvp,`12`,`15`,`25`,`28`, ped_12, ped_15,ped_25, ped_28, STOCK_PRESTA, abrev, total, diferencia FROM prestashop.eurowin_abrev;";
      }else{
          String f=c3.getText();
         
                        // consulta tabla eurowin_abrev
            SQL2 = "SELECT id_PRESTA, articulo, Nombre, pvp,`12`,`15`,`25`,`28`, ped_12, ped_15,ped_25, ped_28, STOCK_PRESTA, abrev, total, diferencia FROM prestashop.eurowin_abrev WHERE id_PRESTA= "+f+";";
          
      }
          
            
          
           
            
           // Crear tabla eurowin_abrev
          ts=conexion.createStatement();
          st = conexion.createStatement();
          tt = conexion.createStatement();
          struncate = conexion.createStatement();
         
          //Permite comandos SQL
          stmt=con.createStatement();
          //primero creo la tabla si no existe 
          st.executeUpdate("CREATE TABLE IF NOT EXISTS eurowin_abrev (id_eurowin_abrev INT NOT NULL PRIMARY KEY AUTO_INCREMENT,id_PRESTA INT(8) NULL,articulo VARCHAR(6) NULL,Nombre VARCHAR(70) NULL,STOCK_PRESTA VARCHAR(4) NULL,pvp float NULL,abrev VARCHAR(4) NULL,`12` float NULL, ped_12 float NULL,`15` float NULL, ped_15 float NULL,`25` float NULL, ped_25 float NULL,`28` float NULL, ped_28 float NULL,total float NULL,diferencia float NULL);");
           //borro los datos anteriores
           struncate.executeUpdate("truncate table prestashop.eurowin_abrev");
            //String SQL = "SELECT ps.id_product ,ps.reference,ps.price from prestashop.product ps;";
            String sql="SELECT	w.id_product as id_PRESTA, \n" +
"			right(a.codigo,6) as articulo,\n" +
"		a.nombre,\n" +
"		sp.quantity as STOCK_PRESTA,\n" +
"		p.pvp,\n" +
"		left(a.abrev,3) as abrev,\n" +
"				\n" +
"			\n" +
"		coalesce(s12.final,null,0) as '12',\n" +
"		isnull(w12.pedidos12 ,0) as 'ped_12',\n" +
"	\n" +
"	\n" +
"		coalesce(s15.final,null,0) as '15',\n" +
"		isnull(w15.pedidos15 ,0) as 'ped_15',\n" +
"	\n" +
"		coalesce(s25.final,null,0) as '25',\n" +
"		isnull(w25.pedidos25 ,0) as 'ped_25',\n" +
"	\n" +
"		coalesce(s28.final,null,0) as '28',\n" +
"		isnull(w28.pedidos28 ,0) as 'ped_28',\n" +
"	\n" +
"		isnull(s12.final,0) - isnull(w12.pedidos12 ,0) +\n" +
"		isnull(s15.final ,0)- isnull(w15.pedidos15 ,0) +\n" +
"		\n" +
"		isnull(s25.final,0) - isnull(w25.pedidos25 ,0) +\n" +
"		isnull(s28.final,0) - isnull(w28.pedidos28 ,0) \n" +
"	\n" +
"		as total,\n" +
"		\n" +
"		isnull(s12.final,0) - isnull(w12.pedidos12 ,0) +\n" +
"		isnull(s15.final ,0)- isnull(w15.pedidos15 ,0) +\n" +
"		isnull(s25.final,0) - isnull(w25.pedidos25 ,0) +\n" +
"		isnull(s28.final,0) - isnull(w28.pedidos28 ,0)  -\n" +
"		\n" +
"		coalesce(a.abrev,'',0) as diferencia      \n" +
"\n" +
"  FROM [srvdatos1].[2017cy].dbo.articulo a\n" +
"\n" +
"		inner join [srvdatos1].[2017cy].dbo.pvp p on a.codigo=p.articulo\n" +
"\n" +
"		  left join \n" +
"  \n" +
"  ( select * from OPENQUERY(prestashop, 'SELECT id_product,reference, quantity from prestashop.product where active=1') )  w on w.reference  =  right(a.codigo,6) collate Modern_Spanish_CS_AI\n" +
"   \n" +
"   left join \n" +
"    ( select * from OPENQUERY(prestashop, 'SELECT id_product, quantity from prestashop.stock_available' ) )  sp on w.id_product  = sp.id_product \n" +
"		\n" +
"\n" +
"		left join ( select articulo, sum(final) as final  from [srvdatos1].[2017cy].dbo.stocks s\n" +
"			where s.empresa+s.articulo+s.almacen+ cast (s.fecha  as char )  in \n" +
"			(select empresa+articulo+almacen+cast( max(fecha) as char) from [srvdatos1].[2017cy].dbo.stocks\n" +
"			 group by  empresa,articulo,almacen )			\n" +
"			and almacen='25'\n" +
"			and empresa='01'\n" +
"			group by articulo ) s25 on s25.articulo=a.codigo	\n" +
"        \n" +
"		 left join ( select articulo, sum(final) as final  from [srvdatos1].[2017cy].dbo.stocks s\n" +
"			where s.empresa+s.articulo+s.almacen+ cast (s.fecha  as char )  in \n" +
"			(select empresa+articulo+almacen+cast( max(fecha) as char) from [srvdatos1].[2017cy].dbo.stocks\n" +
"			 group by  empresa,articulo,almacen )			\n" +
"			and almacen='28'\n" +
"			and empresa='01'\n" +
"			group by articulo ) s28 on s28.articulo=a.codigo	\n" +
"        \n" +
"		\n" +
"		left join ( select articulo, sum(final) as final  from [srvdatos1].[2017cy].dbo.stocks s\n" +
"			where s.empresa+s.articulo+s.almacen+ cast (s.fecha  as char )  in \n" +
"			(select empresa+articulo+almacen+cast( max(fecha) as char) from [srvdatos1].[2017cy].dbo.stocks\n" +
"			 group by  empresa,articulo,almacen )			\n" +
"			and almacen='15'\n" +
"			and empresa='01'\n" +
"			group by articulo ) s15 on s15.articulo=a.codigo	\n" +
"        \n" +
"\n" +
"		left join ( select articulo, sum(final) as final  from [srvdatos1].[2017cy].dbo.stocks s\n" +
"			where s.empresa+s.articulo+s.almacen+ cast (s.fecha  as char )  in \n" +
"			(select empresa+articulo+almacen+cast( max(fecha) as char) from [srvdatos1].[2017cy].dbo.stocks\n" +
"			 group by  empresa,articulo,almacen )			\n" +
"			and almacen='12'\n" +
"			and empresa='01'\n" +
"			group by articulo ) s12 on s12.articulo=a.codigo\n" +
"	     \n" +
"		left join (select articulo,sum(unidades) as pedidos12 from [srvdatos1].[2017cy].dbo.d_pedive d \n" +
"					inner join [srvdatos1].[2017cy].dbo.c_pedive c on c.empresa+c.letra+c.numero=d.empresa+d.letra+d.numero\n" +
"					inner join [srvdatos1].[2017cy].dbo.articulo a on a.codigo=d.articulo\n" +
"					where a.internet=1 	and d.unidades-d.servidas!=0 and d.articulo!='' and d.empresa='01' and c.almacen='12'\n" +
"					group by articulo ) as w12 on a.codigo=w12.articulo\n" +
"		 \n" +
"		left join (select articulo,sum(unidades) as pedidos15 from [srvdatos1].[2017cy].dbo.d_pedive d \n" +
"					inner join [srvdatos1].[2017cy].dbo.c_pedive c on c.empresa+c.letra+c.numero=d.empresa+d.letra+d.numero\n" +
"					inner join [srvdatos1].[2017cy].dbo.articulo a on a.codigo=d.articulo\n" +
"					where a.internet=1 	and d.unidades-d.servidas!=0 and d.articulo!='' and d.empresa='01' and c.almacen='15'\n" +
"					group by articulo ) as w15 on a.codigo=w15.articulo\n" +
"		\n" +
"\n" +
"		left join (select articulo,sum(unidades) as pedidos25 from [srvdatos1].[2017cy].dbo.d_pedive d \n" +
"					inner join [srvdatos1].[2017cy].dbo.c_pedive c on c.empresa+c.letra+c.numero=d.empresa+d.letra+d.numero\n" +
"					inner join [srvdatos1].[2017cy].dbo.articulo a on a.codigo=d.articulo\n" +
"					where a.internet=1 	and d.unidades-d.servidas!=0 and d.articulo!='' and d.empresa='01' and c.almacen='25'\n" +
"					group by articulo ) as w25 on a.codigo=w25.articulo\n" +
"		\n" +
"\n" +
"		left join (select articulo,sum(unidades) as pedidos28 from [srvdatos1].[2017cy].dbo.d_pedive d \n" +
"					inner join [srvdatos1].[2017cy].dbo.c_pedive c on c.empresa+c.letra+c.numero=d.empresa+d.letra+d.numero\n" +
"					inner join [srvdatos1].[2017cy].dbo.articulo a on a.codigo=d.articulo\n" +
"					where a.internet=1 	and d.unidades-d.servidas!=0 and d.articulo!='' and d.empresa='01' and c.almacen='28'\n" +
"					group by articulo ) as w28 on a.codigo=w28.articulo\n" +
"\n" +
"where  \n" +
" a.internet=1\n" +
"and p.tarifa='01'\n" +
"order by diferencia asc , articulo"; 
          
	    String  idp2,idp3,idp4,idp6,p;
            float idp5,idp7,idp8,idp9,idp10,idp11,idp12,idp13,idp14,idp15,idp16 ;
            int idp1;
            rs=stmt.executeQuery(sql);
        
            
                // lee el resultset
                  while(rs.next()){
              idp1=rs.getInt("id_PRESTA");
              idp2=rs.getString("articulo");
              idp3=rs.getString("nombre");
              idp3=idp3.replaceAll("\'","");// borra las comillas simples
              idp4=rs.getString("STOCK_PRESTA");
              idp5=rs.getFloat("pvp");
              idp6=rs.getString("abrev");
              idp7=rs.getFloat("12");
              idp8=rs.getFloat("ped_12");
              idp9=rs.getFloat("15");       
              idp10=rs.getFloat("ped_15");
              idp11=rs.getFloat("25");
              idp12=rs.getFloat("ped_25");
              idp13=rs.getFloat("28");       
              idp14=rs.getFloat("ped_28");
              idp15=rs.getFloat("total");
              idp16=rs.getFloat("diferencia");
             
               p="INSERT INTO eurowin_abrev (id_PRESTA, articulo, Nombre, STOCK_PRESTA, pvp, abrev, `12`, ped_12, `15`, ped_15, `25`, ped_25, `28`, ped_28,total,diferencia) VALUES("+idp1+",'"+idp2+"','"+idp3+"','"+idp4+"',"+idp5+",'"+idp6+"',"+idp7+","+idp8+","+idp9+","+idp10+","+idp11+","+idp12+","+idp13+","+idp14+","+idp15+","+idp16+");";
              tt.executeUpdate(p);
         
             
                  }
           
           
          
           sr=ts.executeQuery(SQL2);
                  
             
                   //añade las columnas a la tabla
                   DefaultTableModel modelo =(DefaultTableModel) tabStock.getModel();
                  
                   
                    modelo.addColumn("id_PRESTA");
                    modelo.addColumn("articulo");
                    modelo.addColumn("Nombre");
                    modelo.addColumn("pvp");
                    modelo.addColumn("12");
                    modelo.addColumn("15");
                    modelo.addColumn("25");
                    modelo.addColumn("28");
                    modelo.addColumn("ped_12");
                    modelo.addColumn("ped_15");
                    modelo.addColumn("ped_25");
                    modelo.addColumn("ped_28");
                    modelo.addColumn("STOCK_PRESTA");
                    modelo.addColumn("abrev");
                    modelo.addColumn("total");
                    modelo.addColumn("diferencia");
                    
                  //coloca el tamaño a las columnas pero antes hay que marcar el autoResizeMode del diseño a off
                  TableColumnModel tabla = tabStock.getColumnModel();
                  
                   
                    TableColumn columna2 = tabla.getColumn(2);
                    TableColumn columna3 = tabla.getColumn(3);
                    TableColumn columna4 = tabla.getColumn(4);
                    TableColumn columna5 = tabla.getColumn(5);
                    TableColumn columna6 = tabla.getColumn(6);
                    TableColumn columna7 = tabla.getColumn(7);
                    TableColumn columna8 = tabla.getColumn(8);
                    TableColumn columna9 = tabla.getColumn(9);
                    TableColumn columna10 = tabla.getColumn(10);
                    TableColumn columna11 = tabla.getColumn(11);
                    TableColumn columna12 = tabla.getColumn(12);
                    TableColumn columna13 = tabla.getColumn(13);
                    TableColumn columna14 = tabla.getColumn(14);
                    
                    // tamaño de las columnas
                    columna2.setPreferredWidth(400);
                    columna3.setPreferredWidth(60);
                    columna4.setPreferredWidth(55);
                    columna5.setPreferredWidth(55);
                    columna6.setPreferredWidth(55);
                    columna7.setPreferredWidth(55);
                    columna8.setPreferredWidth(55);
                    columna9.setPreferredWidth(55);
                    columna10.setPreferredWidth(55);
                    columna11.setPreferredWidth(55);
                    columna12.setPreferredWidth(105);
                    columna13.setPreferredWidth(50);
                    columna14.setPreferredWidth(65);
                   
                
              
                  
                    while(sr.next()){
                        
                  
                 
               // Se crea un array que será una de las filas de la tabla. 
                
                 Object [] fila = new Object[16];// Hay 16 columnas en la tabla
               // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
              for (int i=0;i<16;i++)
                fila[i] = sr.getObject(i+1); // El primer indice en rr es el 1, no el cero, por eso se sum
               // Se añade al modelo la fila completa.
                    modelo.addRow(fila);
                  
               }
        
           }
   
          catch (SQLException ex) {
           Logger.getLogger(QueryPresta.class.getName()).log(Level.SEVERE, null, ex);
                           }  c3.setText("");            
    }//GEN-LAST:event_buscarActionPerformed

    private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed
         try { 
            tabDesactivados.setModel(new DefaultTableModel());//reinicia la tabla 
             
             
            t3 = conexion.createStatement();
            ResultSet jj;//creo un objeto de la clase ResultSet que será el encargado de devolvernos los resultados de los registros:
            jj=t3.executeQuery("SELECT ps.id_product,pl.name Nombre,ps.active Activo from prestashop.product ps  inner join prestashop.product_lang pl on pl.id_product=ps.id_product where ps.active='0' order by ps.id_product asc ;");
           
            DefaultTableModel mod =(DefaultTableModel) tabDesactivados.getModel();//declaro un objeto de tipo DefaultTableModel y le asigno el modelo que posee la tabla que tengo en el programa.
            // Creamos las columnas y coloca los nombres a las columnas
             mod.addColumn("id_product");
             mod.addColumn("Nombre");
             mod.addColumn("Activo");
             
             TableColumnModel tabla = tabDesactivados.getColumnModel();
              TableColumn columna0 = tabla.getColumn(0);
              TableColumn columna1 = tabla.getColumn(1);
              TableColumn columna2 = tabla.getColumn(2);
              
              columna0.setPreferredWidth(55);
              columna1.setPreferredWidth(300);
              columna2.setPreferredWidth(55);
              
             // Bucle para cada resultado en la consulta
              while(jj.next()){
               // Se crea un array que será una de las filas de la tabla. 
                 Object [] fila = new Object[3]; // Hay tres columnas en la tabla
               // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
              for (int i=0;i<3;i++)
                fila[i] = jj.getObject(i+1); // El primer indice en rs es el 1, no el cero, por eso se sum
               // Se añade al modelo la fila completa.
                    mod.addRow(fila);
              
               }
         
        } catch (SQLException ex) {
            Logger.getLogger(QueryPresta.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_verActionPerformed
// activa los articulos
    private void activarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activarArticuloActionPerformed
        
       
        
        int filsel = tabDesactivados.getSelectedRow();
    if(filsel == -1){
        JOptionPane.showMessageDialog(null,"¡Seleccione una fila!");// en caso de no seleccionar una fila lanza un aviso
    }else{
        try {
            TableModel m = tabDesactivados.getModel();
            for(int i = 0; i<m.getRowCount(); i++){
                //Se toman los datos de la tabla 
               String id = m.getValueAt(filsel, 0).toString();// id mostrado en la primera columna
                String sql="SELECT * FROM prestashop.product WHERE id_product =" + id + ";";
                t5 = conexion.createStatement();
                rs1= t5.executeQuery(sql);
                if(rs1.next()){
                    String sql2="update prestashop.product   set active= 1 WHERE id_product =" + id + ";";
                    t2 = conexion.createStatement();
                    t2.executeUpdate(sql2);
                }
                String lqs="SELECT * FROM prestashop.product_shop WHERE id_product =" + id + ";";
                t4 = conexion.createStatement();
                ss = t4.executeQuery(lqs);
                if(ss.next()){
                   String sql3="update prestashop.product_shop set active= 1 WHERE id_product =" + id + " and`id_shop`='1';";
                    t1= conexion.createStatement();
                    t1.executeUpdate(sql3);
                }
                
            }
             DefaultTableModel dtm = (DefaultTableModel) tabDesactivados.getModel(); //tabDesactivados es el nombre de mi tabla
               dtm.removeRow(tabDesactivados.getSelectedRow());// se encarga de borrar la fila del JTable
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_activarArticuloActionPerformed

    private void reporteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteVentasActionPerformed
         try {
              tabReporte.setModel(new DefaultTableModel());//reinicia la tabla antes de consultar
             
        
            st = conexion.createStatement();
            ResultSet rs;//creo un objeto de la clase ResultSet que será el encargado de devolvernos los resultados de los registros:
            rs=st.executeQuery("SELECT od.product_reference as Referencia,od.product_name as Nombre,od.product_quantity as Vendido,o.invoice_date as Fecha FROM prestashop.orders o inner join prestashop.order_detail od on o.id_order=od.id_order where not invoice_date='0000-00-00 00:00:00' order by invoice_date desc;");
           
            DefaultTableModel model =(DefaultTableModel) tabReporte.getModel();//declaro un objeto de tipo DefaultTableModel y le asigno el modelo que posee la tabla que tengo en el programa.
             // Creamos las columnas y coloca los nombres a las columnas
            model.addColumn("Referencia");
            model.addColumn("Nombre");
            model.addColumn("Cantidad Vendida");
            model.addColumn("Fecha");
            
            
             TableColumnModel tabla = tabReporte.getColumnModel();
              TableColumn columna0 = tabla.getColumn(0);
              TableColumn columna1 = tabla.getColumn(1);
              TableColumn columna2 = tabla.getColumn(2);
              TableColumn columna3 = tabla.getColumn(3);
              columna0.setPreferredWidth(35);
              columna1.setPreferredWidth(300);
              columna2.setPreferredWidth(20);
              columna3.setPreferredWidth(30);
              
             // Bucle para cada resultado en la consulta
              while(rs.next()){
               // Se crea un array que será una de las filas de la tabla. 
                 Object [] fila = new Object[4]; // Hay tres columnas en la tabla
               // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
              for (int i=0;i<4;i++)
                fila[i] = rs.getObject(i+1); // El primer indice en rs es el 1, no el cero, por eso se sum
               // Se añade al modelo la fila completa.
                    model.addRow(fila);
              
               }
           
                
        } catch (SQLException ex) {
            Logger.getLogger(QueryPresta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_reporteVentasActionPerformed

    private void barrasGraficasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barrasGraficasActionPerformed
        try {
            String v1=year.getText();
             v1=v1.trim(); 
      if(v1.length()== 0){
           JOptionPane.showMessageDialog(null,"¡Ingrese año de Consulta!");// en caso de no ingresar año de consulta lanza un aviso
      }
         else{
            String y=year.getText();
            Grafica gf=new Grafica();
            gf.generar_grafica(y);}
        } catch (SQLException ex) {
            Logger.getLogger(QueryPresta.class.getName()).log(Level.SEVERE, null, ex);
        }
            year.setText("");
    }//GEN-LAST:event_barrasGraficasActionPerformed
     public static void ejecutar_sql_update(String sql){
        try {
            
        st = conexion.createStatement();
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "¡Tabla actualizada!", "información",1);
       
     
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//establece conexion con la base de datos
     public static void hacer_conexion() {
        try {
             //Establecemos la conexión
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // SERVIDORSQL=SERVIDORSQL + ":1433;DatabaseName=" + BDERP;
            con= DriverManager.getConnection(SERVIDORSQL,user_sql,pass_sql);
              
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null,E.getMessage(),"Error de conexión con SQLSERVER",0); 
        }
    }
        public static void hacer_conexionSql() {
        try {
            Class.forName(driver);         
            conexion = (Connection) DriverManager.getConnection(servidor, user, pass);
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
            java.util.logging.Logger.getLogger(QueryPresta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QueryPresta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QueryPresta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QueryPresta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QueryPresta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activarArticulo;
    private javax.swing.JButton actualActivo;
    private javax.swing.JButton actualPrecio;
    private javax.swing.JButton actualizar1;
    private javax.swing.JButton barrasGraficas;
    private javax.swing.JButton borrar;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c2;
    private javax.swing.JTextField c3;
    private javax.swing.JComboBox<String> campo1;
    private javax.swing.JComboBox<String> campo2;
    private javax.swing.JComboBox<String> campo3;
    private javax.swing.JButton consulActivo;
    private javax.swing.JButton consulListado;
    private javax.swing.JButton consulPrecio;
    private javax.swing.JButton consultar;
    private javax.swing.JButton consultar1;
    private javax.swing.JButton consultar2;
    private javax.swing.JButton desactivar;
    private javax.swing.JPanel grafica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JButton reporteVentas;
    private javax.swing.JComboBox<String> selectDB;
    private javax.swing.JComboBox<String> selectTablas;
    private javax.swing.JTable tabActivo;
    private javax.swing.JTable tabDesactivados;
    private javax.swing.JTable tabEurowin;
    private javax.swing.JTable tabListado;
    private javax.swing.JTable tabPrecio;
    private javax.swing.JTable tabReporte;
    private javax.swing.JTable tabStock;
    private javax.swing.JTable tabTablas;
    private javax.swing.JButton ver;
    public javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
