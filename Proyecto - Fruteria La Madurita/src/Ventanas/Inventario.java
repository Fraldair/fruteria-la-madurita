package Ventanas;

import Clases.Producto;
import static Project.FuncionesArchivos.busProductoCod;
import static Project.FuncionesArchivos.busProductoName;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static Project.FuncionesArchivos.crearArchivoInventario;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static Project.FuncionesArchivos.unirS;
import static Project.FuncionesArchivos.eliminarProducto;
import static Project.FuncionesArchivos.leerArchivoInventario;
import static Project.FuncionesArchivos.leerRegistroInventario;
import Ventanas.Menu;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Frael Campos
 */
public class Inventario extends javax.swing.JFrame {

   TableRowSorter trs;
   DefaultTableModel modelo ;
   int fila;
     Producto o=new Producto("","","","","");
     
    
    public Inventario() {
        setTitle("Inventario");
        initComponents();
       
        setLocationRelativeTo(null);
            
        String[]cri= {"Nombre","Codigo"};
        String[] dias={"----","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String[] mes={"----","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        String[] anio={"----","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025","2026","2027","2028","2029","2030","2031","2032","2033","2034","2035","2036","2037","2038","2039","2040","2041","2042","2043","2044","2045","2046","2047","2048","2049","2050"};
        Dia.setModel(new javax.swing.DefaultComboBoxModel(dias));
        Dia.setSelectedIndex(0);
        Mes.setModel(new javax.swing.DefaultComboBoxModel(mes));
        Mes.setSelectedIndex(0);
        Anio.setModel(new javax.swing.DefaultComboBoxModel(anio));
        Anio.setSelectedIndex(0);
        selectBus.setModel(new javax.swing.DefaultComboBoxModel(cri));
        selectBus.setSelectedIndex(0);
        
        modelo = new DefaultTableModel();
        datos_inventario.setModel(modelo);
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_base = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCant = new javax.swing.JLabel();
        txtPreprod = new javax.swing.JLabel();
        nom_prod = new javax.swing.JTextField();
        cod_prod = new javax.swing.JTextField();
        cant_prod = new javax.swing.JTextField();
        precio_prod = new javax.swing.JTextField();
        agregar_prod = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Dia = new javax.swing.JComboBox<>();
        Mes = new javax.swing.JComboBox<>();
        Anio = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos_inventario = new javax.swing.JTable();
        buscar_prod = new javax.swing.JTextField();
        txtBuca_prod = new javax.swing.JLabel();
        selectBus = new javax.swing.JComboBox<>();
        ver_inventario = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        nomlabel = new javax.swing.JLabel();
        codlabel = new javax.swing.JLabel();
        cantlabel = new javax.swing.JLabel();
        prelabel = new javax.swing.JLabel();
        fechlabel = new javax.swing.JLabel();
        eliminar_prod = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        volver_menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_base.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Book Antiqua", 2, 14))); // NOI18N

        jLabel1.setText("Nombre del producto");

        jLabel2.setText("Codigo del producto");

        txtCant.setText("Cantidad");

        txtPreprod.setText("Precio del producto");

        nom_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_prodActionPerformed(evt);
            }
        });

        cod_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod_prodActionPerformed(evt);
            }
        });
        cod_prod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cod_prodKeyTyped(evt);
            }
        });

        cant_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cant_prodActionPerformed(evt);
            }
        });
        cant_prod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cant_prodKeyTyped(evt);
            }
        });

        agregar_prod.setText("Agregar Producto");
        agregar_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_prodActionPerformed(evt);
            }
        });

        modificar.setText("Modificar Pro");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha de ingreso:");

        Mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "     " }));

        Anio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "          " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Dia, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(nom_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtCant)
                                    .addComponent(txtPreprod))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cod_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(precio_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cant_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modificar)
                            .addComponent(agregar_prod))
                        .addGap(115, 115, 115))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nom_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregar_prod))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cod_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(modificar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCant)
                    .addComponent(cant_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPreprod)
                    .addComponent(precio_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        datos_inventario = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return false;
            }
        };
        datos_inventario.setBackground(new java.awt.Color(204, 204, 255));
        datos_inventario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        datos_inventario.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        datos_inventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        datos_inventario.setShowGrid(true);
        datos_inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datos_inventarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(datos_inventario);

        buscar_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_prodActionPerformed(evt);
            }
        });
        buscar_prod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscar_prodKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscar_prodKeyTyped(evt);
            }
        });

        txtBuca_prod.setText("Buscar Producto Por:");

        selectBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBusActionPerformed(evt);
            }
        });

        ver_inventario.setText("Mostrar Inventario");
        ver_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_inventarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(txtBuca_prod)
                .addGap(18, 18, 18)
                .addComponent(selectBus, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(buscar_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ver_inventario)
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuca_prod)
                    .addComponent(selectBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ver_inventario))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Producto a Eliminar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 12))); // NOI18N

        nomlabel.setText("-------------");

        codlabel.setText("-------------");

        cantlabel.setText("-------------");

        prelabel.setText("-------------");

        fechlabel.setText("-------------");

        eliminar_prod.setText("Eliminar Producto");
        eliminar_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_prodActionPerformed(evt);
            }
        });

        jLabel3.setText("Producto:");

        jLabel4.setText("Codigo:");

        jLabel6.setText("Cantidad:");

        jLabel7.setText("Precio:");

        jLabel8.setText("Fecha:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fechlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(prelabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cantlabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(codlabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nomlabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(55, 55, 55))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(eliminar_prod)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codlabel)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantlabel)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prelabel)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechlabel)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(eliminar_prod)
                .addContainerGap())
        );

        volver_menu.setText("Volver ");
        volver_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver_menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_baseLayout = new javax.swing.GroupLayout(panel_base);
        panel_base.setLayout(panel_baseLayout);
        panel_baseLayout.setHorizontalGroup(
            panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(panel_baseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
            .addGroup(panel_baseLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(volver_menu)
                .addContainerGap())
        );
        panel_baseLayout.setVerticalGroup(
            panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_baseLayout.createSequentialGroup()
                .addGroup(panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_baseLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(volver_menu))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void mostrar(String [][] tabla){
//DefaultTableModel modelo = (DefaultTableModel)datos_inventario.getModel();

   modelo.setRowCount(tabla.length);
   modelo.setColumnCount(5);
   JTableHeader head = datos_inventario.getTableHeader();
   TableColumnModel tcm = head.getColumnModel();
   TableColumn tabCM = tcm.getColumn(0);
    tabCM.setHeaderValue("Nombre del Producto");
   TableColumn tabCM2 = tcm.getColumn(1);
    tabCM2.setHeaderValue("Codigo del Producto");
   TableColumn tabCM3 = tcm.getColumn(2);
    tabCM3.setHeaderValue("Cantidad");
   TableColumn tabCM4= tcm.getColumn(3);
    tabCM4.setHeaderValue("Precio ");
   TableColumn tabCM5= tcm.getColumn(4);
    tabCM5.setHeaderValue("Fecha Ingreso");



 for(int i=0;i<tabla.length;i++){
   for(int j=0;j<5;j++){
     modelo.setValueAt(tabla[i][j], i, j);
    }   
 }
}
    private void nom_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_prodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_prodActionPerformed

    private void cant_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cant_prodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cant_prodActionPerformed

    private void agregar_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_prodActionPerformed
     
     
   Producto p =new Producto(nom_prod.getText(), cod_prod.getText(), 
                 precio_prod.getText(),cant_prod.getText(),
                 unirS(Dia.getSelectedItem().toString(),Mes.getSelectedItem().toString(),Anio.getSelectedItem().toString()));
   
        if(nom_prod.getText().isEmpty() && cod_prod.getText().isEmpty() && 
                precio_prod.getText().isEmpty() && 
                cant_prod.getText().isEmpty())
        {
 
        }else{
        
            try {
                crearArchivoInventario(p);
            } catch (IOException ex) {
                Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("error");
            }
      

        }
         nom_prod.setText("");
         cod_prod.setText("");
         precio_prod.setText("");
         cant_prod.setText("");
        Dia.setSelectedIndex(0);
        Mes.setSelectedIndex(0);
        Anio.setSelectedIndex(0);
            mostrar(leerRegistroInventario());
        
    }//GEN-LAST:event_agregar_prodActionPerformed

    private void eliminar_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_prodActionPerformed

 Producto o=new Producto("","","","","");
   leerArchivoInventario();//lee el arraylist para guardar despues todos lo valores    
      o=busProductoName(nomlabel.getText()); 
    
     if(nomlabel.getText().isBlank()){    JOptionPane.showMessageDialog(null, "Seleccione una Fila a elminar");}
        else{
       JOptionPane.showConfirmDialog(null, "¿Seguro que quiere eliminar este producto?");
       
         if(fila>=0){
           modelo.removeRow(fila);
            try {
             eliminarProducto(o);
         } catch (IOException ex) {
             Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
         }
        } 
         else{JOptionPane.showMessageDialog(null, "Seleccione una Fila a elminar");
                 }
     }
    
    nomlabel.setText("");
    codlabel.setText("");
    cantlabel.setText("");
    prelabel.setText("");
    fechlabel.setText("");
    }//GEN-LAST:event_eliminar_prodActionPerformed

    private void buscar_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_prodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscar_prodActionPerformed

    private void selectBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectBusActionPerformed

    private void datos_inventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datos_inventarioMouseClicked
       fila=datos_inventario.rowAtPoint(evt.getPoint());
       nomlabel.setText(String.valueOf(datos_inventario.getValueAt(fila, 0)));
       codlabel.setText(String.valueOf(datos_inventario.getValueAt(fila, 1)));
       cantlabel.setText(String.valueOf(datos_inventario.getValueAt(fila, 2)));
       prelabel.setText(String.valueOf(datos_inventario.getValueAt(fila, 3)));
       String dia=String.valueOf(datos_inventario.getValueAt(fila, 4));
       fechlabel.setText(dia);
       
    }//GEN-LAST:event_datos_inventarioMouseClicked

    private void cod_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod_prodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cod_prodActionPerformed

    private void buscar_prodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscar_prodKeyPressed
       ////////////////////gdgd
    }//GEN-LAST:event_buscar_prodKeyPressed

    private void buscar_prodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscar_prodKeyTyped
       
        buscar_prod.addKeyListener(new KeyAdapter(){
         @Override
         public void keyReleased(KeyEvent ke){
        
             switch (selectBus.getSelectedItem().toString()){
             case "Nombre":trs.setRowFilter(RowFilter.regexFilter(buscar_prod.getText(), 0));
             break;
             case "Codigo":trs.setRowFilter(RowFilter.regexFilter(buscar_prod.getText(), 1));
                 break;
         }
          
         }
        
        });
        trs= new TableRowSorter(modelo);//le mando el default model
        datos_inventario.setRowSorter( trs);//y depues le paso el tablerow a la tabla
    }//GEN-LAST:event_buscar_prodKeyTyped

    private void ver_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_inventarioActionPerformed
         mostrar(leerRegistroInventario());
    }//GEN-LAST:event_ver_inventarioActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarActionPerformed

    private void volver_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver_menuActionPerformed
      Menu ot=new Menu();
      ot.setVisible(true);
     dispose();  
    }//GEN-LAST:event_volver_menuActionPerformed

    private void cant_prodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cant_prodKeyTyped
    char Val=evt.getKeyChar();
     
     if(Character.isLetter(Val)){
     evt.consume();
     }     
    }//GEN-LAST:event_cant_prodKeyTyped

    private void cod_prodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cod_prodKeyTyped
     char Val=evt.getKeyChar();
     
     if(Character.isLetter(Val)){
     evt.consume();
     }     
    }//GEN-LAST:event_cod_prodKeyTyped

  
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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Anio;
    private javax.swing.JComboBox<String> Dia;
    private javax.swing.JComboBox<String> Mes;
    private javax.swing.JButton agregar_prod;
    private javax.swing.JTextField buscar_prod;
    private javax.swing.JTextField cant_prod;
    private javax.swing.JLabel cantlabel;
    private javax.swing.JTextField cod_prod;
    private javax.swing.JLabel codlabel;
    private javax.swing.JTable datos_inventario;
    private javax.swing.JButton eliminar_prod;
    private javax.swing.JLabel fechlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nom_prod;
    private javax.swing.JLabel nomlabel;
    private javax.swing.JPanel panel_base;
    private javax.swing.JTextField precio_prod;
    private javax.swing.JLabel prelabel;
    private javax.swing.JComboBox<String> selectBus;
    private javax.swing.JLabel txtBuca_prod;
    private javax.swing.JLabel txtCant;
    private javax.swing.JLabel txtPreprod;
    private javax.swing.JButton ver_inventario;
    private javax.swing.JButton volver_menu;
    // End of variables declaration//GEN-END:variables
}
