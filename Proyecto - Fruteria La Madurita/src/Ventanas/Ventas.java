
package Ventanas;

import Ventanas.Menu;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import static Project.FuncionesArchivos.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Frael Campos
 */
public class Ventas extends javax.swing.JFrame {

   DefaultTableModel modelo=new DefaultTableModel();
   DefaultTableModel modelo2;//= new DefaultTableModel();
    public Ventas() {
        setTitle("Ventas");
               
        initComponents();
     this.setLocationRelativeTo(null);
    String cri[]={"Nombre","Codigo"};
    busca_prod_por.setModel(new javax.swing.DefaultComboBoxModel(cri));
    
   // modelo = new DefaultTableModel();
   
    productos.setModel(modelo);
     modelo2=new  DefaultTableModel();
     modelo2.addColumn("Codigo");
     modelo2.addColumn("Nombre");
     modelo2.addColumn("Cantidad");
     modelo2.addColumn("Precio");
   
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_base = new javax.swing.JPanel();
        panel_datosclien = new javax.swing.JPanel();
        txtnom_clien = new javax.swing.JLabel();
        nom_clien = new javax.swing.JTextField();
        txtcedula_clien = new javax.swing.JLabel();
        cedula_clien = new javax.swing.JTextField();
        agregar_nuevo_cli = new javax.swing.JButton();
        panel_detalleYventa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detalles_productos = new javax.swing.JTable();
        quitar_prod = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtnu_factu = new javax.swing.JLabel();
        nu_factu = new javax.swing.JTextField();
        txtFecha_doc = new javax.swing.JLabel();
        fecha_ven = new javax.swing.JTextField();
        nom_vendedor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        realizar_ven = new javax.swing.JButton();
        cancelar_ven = new javax.swing.JButton();
        panel_buscaprod = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        busca_prod_por = new javax.swing.JComboBox<>();
        produ_a_buscar = new javax.swing.JTextField();
        cant_ve = new javax.swing.JTextField();
        volver_menu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        productos = new javax.swing.JTable();
        mostrar_productos = new javax.swing.JButton();
        agregar_produc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_base.setBackground(new java.awt.Color(255, 255, 255));

        panel_datosclien.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Book Antiqua", 2, 14))); // NOI18N

        txtnom_clien.setText("Nombre:");

        nom_clien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_clienActionPerformed(evt);
            }
        });

        txtcedula_clien.setText("Nº Cedula:");

        agregar_nuevo_cli.setText("Agregar Nuevo");
        agregar_nuevo_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_nuevo_cliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_datosclienLayout = new javax.swing.GroupLayout(panel_datosclien);
        panel_datosclien.setLayout(panel_datosclienLayout);
        panel_datosclienLayout.setHorizontalGroup(
            panel_datosclienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosclienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_datosclienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnom_clien)
                    .addComponent(nom_clien, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(txtcedula_clien)
                    .addComponent(cedula_clien))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datosclienLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(agregar_nuevo_cli)
                .addContainerGap())
        );
        panel_datosclienLayout.setVerticalGroup(
            panel_datosclienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosclienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtnom_clien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nom_clien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcedula_clien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cedula_clien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(agregar_nuevo_cli)
                .addContainerGap())
        );

        panel_detalleYventa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Book Antiqua", 2, 14))); // NOI18N

        detalles_productos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return false;
            }
        };
        detalles_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(detalles_productos);

        quitar_prod.setText("Quitar Producto");
        quitar_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitar_prodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_detalleYventaLayout = new javax.swing.GroupLayout(panel_detalleYventa);
        panel_detalleYventa.setLayout(panel_detalleYventaLayout);
        panel_detalleYventaLayout.setHorizontalGroup(
            panel_detalleYventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_detalleYventaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_detalleYventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_detalleYventaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(quitar_prod)))
                .addContainerGap())
        );
        panel_detalleYventaLayout.setVerticalGroup(
            panel_detalleYventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_detalleYventaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(quitar_prod)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Docunento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Book Antiqua", 2, 14))); // NOI18N

        txtnu_factu.setText("Numero de Factura:");

        nu_factu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nu_factuKeyTyped(evt);
            }
        });

        txtFecha_doc.setText("Fecha:");

        fecha_ven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_venActionPerformed(evt);
            }
        });

        nom_vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_vendedorActionPerformed(evt);
            }
        });
        nom_vendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nom_vendedorKeyTyped(evt);
            }
        });

        jLabel2.setText("Vendedor:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtFecha_doc)
                    .addComponent(txtnu_factu)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(nu_factu, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fecha_ven, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                    .addComponent(nom_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtnu_factu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nu_factu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(txtFecha_doc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecha_ven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nom_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        realizar_ven.setText("Realizar Venta");
        realizar_ven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizar_venActionPerformed(evt);
            }
        });

        cancelar_ven.setText("Cancelar");
        cancelar_ven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_venActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelar_ven)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(realizar_ven)
                .addGap(77, 77, 77))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(realizar_ven)
                    .addComponent(cancelar_ven))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_baseLayout = new javax.swing.GroupLayout(panel_base);
        panel_base.setLayout(panel_baseLayout);
        panel_baseLayout.setHorizontalGroup(
            panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_baseLayout.createSequentialGroup()
                .addGroup(panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_baseLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panel_baseLayout.createSequentialGroup()
                        .addComponent(panel_datosclien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_baseLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panel_detalleYventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panel_baseLayout.setVerticalGroup(
            panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_baseLayout.createSequentialGroup()
                .addGroup(panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_datosclien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_detalleYventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        panel_buscaprod.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Book Antiqua", 2, 14))); // NOI18N

        jLabel1.setText("Buscar Producto");

        busca_prod_por.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "             " }));

        produ_a_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produ_a_buscarActionPerformed(evt);
            }
        });

        volver_menu.setText("Volver");
        volver_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver_menuActionPerformed(evt);
            }
        });

        productos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return false;
            }
        };
        productos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(productos);

        mostrar_productos.setText("Mostrar Productos");
        mostrar_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_productosActionPerformed(evt);
            }
        });

        agregar_produc.setText("Agregar");
        agregar_produc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_producActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_buscaprodLayout = new javax.swing.GroupLayout(panel_buscaprod);
        panel_buscaprod.setLayout(panel_buscaprodLayout);
        panel_buscaprodLayout.setHorizontalGroup(
            panel_buscaprodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_buscaprodLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(busca_prod_por, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(produ_a_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cant_ve, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mostrar_productos)
                .addGap(18, 18, 18)
                .addComponent(agregar_produc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(volver_menu)
                .addContainerGap())
            .addGroup(panel_buscaprodLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_buscaprodLayout.setVerticalGroup(
            panel_buscaprodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_buscaprodLayout.createSequentialGroup()
                .addGroup(panel_buscaprodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_buscaprodLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_buscaprodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(busca_prod_por, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(produ_a_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cant_ve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mostrar_productos)
                            .addComponent(agregar_produc)))
                    .addComponent(volver_menu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_buscaprod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel_buscaprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrar(String [][] tabla){
//DefaultTableModel modelo = (DefaultTableModel)datos_inventario.getModel();

   modelo.setRowCount(tabla.length);
   modelo.setColumnCount(4);
   JTableHeader head = productos.getTableHeader();
   TableColumnModel tcm = head.getColumnModel();
   TableColumn tabCM = tcm.getColumn(0);
    tabCM.setHeaderValue("Nombre del Producto");
   TableColumn tabCM2 = tcm.getColumn(1);
    tabCM2.setHeaderValue("Codigo del Producto");
   TableColumn tabCM3 = tcm.getColumn(2);
    tabCM3.setHeaderValue("Cantidad");
   TableColumn tabCM4= tcm.getColumn(3);
    tabCM4.setHeaderValue("Precio ");



 for(int i=0;i<tabla.length;i++){
   for(int j=0;j<4;j++){
     modelo.setValueAt(tabla[i][j], i, j);
    }   
 }
}
    
   public void AgregarADetalle(){
   if(productos.getSelectedRow()!=-1){
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad deseada: "));
         if (cantidad > Integer.parseInt(productos.getValueAt(productos.getSelectedRow(), 2).toString())) {
                JOptionPane.showMessageDialog(null, "No hay stock suficiente!", "Informacion!", JOptionPane.INFORMATION_MESSAGE);
            } else {
     
                        Object[] object = {
                    productos.getValueAt(productos.getSelectedRow(), 0),
                    productos.getValueAt(productos.getSelectedRow(), 1),
                    cantidad,
                    productos.getValueAt(productos.getSelectedRow(), 3),};
                        
                
                modelo2.addRow(object);
               detalles_productos.setModel(modelo2);
   }
   }
    else {
            JOptionPane.showMessageDialog(null, "Porfavor, seleccione un producto para continuar!", "Informacion!", JOptionPane.INFORMATION_MESSAGE);
   }
   }
    private void produ_a_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produ_a_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produ_a_buscarActionPerformed

    private void fecha_venActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_venActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_venActionPerformed

    private void agregar_nuevo_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_nuevo_cliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregar_nuevo_cliActionPerformed

    private void volver_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver_menuActionPerformed
      Menu ot=new Menu();
      ot.setVisible(true);
     dispose();  
    }//GEN-LAST:event_volver_menuActionPerformed

    private void nu_factuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nu_factuKeyTyped
       char Val=evt.getKeyChar();
     
     if(Character.isLetter(Val)){
     evt.consume();
     }    
    }//GEN-LAST:event_nu_factuKeyTyped

    private void nom_vendedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nom_vendedorKeyTyped
     char Val=evt.getKeyChar();
     
     if(Character.isDigit(Val)){
     evt.consume();
     }      
    }//GEN-LAST:event_nom_vendedorKeyTyped

    private void cancelar_venActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_venActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelar_venActionPerformed

    private void mostrar_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar_productosActionPerformed
     mostrar(leerRegistroProducto());
    }//GEN-LAST:event_mostrar_productosActionPerformed

    private void agregar_producActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_producActionPerformed
       AgregarADetalle();
    }//GEN-LAST:event_agregar_producActionPerformed

    private void quitar_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitar_prodActionPerformed
      int fila=detalles_productos.getSelectedRow();
      if(fila>-1){
      modelo2.removeRow(fila);
      }else{
          JOptionPane.showMessageDialog(null, "Porfavor, seleccione un producto para continuar!", "Informacion!", JOptionPane.INFORMATION_MESSAGE);
      }
    }//GEN-LAST:event_quitar_prodActionPerformed

    private void nom_clienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_clienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_clienActionPerformed

    private void nom_vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_vendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_vendedorActionPerformed

    private void realizar_venActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizar_venActionPerformed
      if(nom_clien.getText().isBlank() && cedula_clien.getText().isBlank()){
      
      }else{
      
      
      }
    }//GEN-LAST:event_realizar_venActionPerformed


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_nuevo_cli;
    private javax.swing.JButton agregar_produc;
    private javax.swing.JComboBox<String> busca_prod_por;
    private javax.swing.JButton cancelar_ven;
    private javax.swing.JTextField cant_ve;
    private javax.swing.JTextField cedula_clien;
    private javax.swing.JTable detalles_productos;
    private javax.swing.JTextField fecha_ven;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mostrar_productos;
    private javax.swing.JTextField nom_clien;
    private javax.swing.JTextField nom_vendedor;
    private javax.swing.JTextField nu_factu;
    private javax.swing.JPanel panel_base;
    private javax.swing.JPanel panel_buscaprod;
    private javax.swing.JPanel panel_datosclien;
    private javax.swing.JPanel panel_detalleYventa;
    private javax.swing.JTextField produ_a_buscar;
    private javax.swing.JTable productos;
    private javax.swing.JButton quitar_prod;
    private javax.swing.JButton realizar_ven;
    private javax.swing.JLabel txtFecha_doc;
    private javax.swing.JLabel txtcedula_clien;
    private javax.swing.JLabel txtnom_clien;
    private javax.swing.JLabel txtnu_factu;
    private javax.swing.JButton volver_menu;
    // End of variables declaration//GEN-END:variables
}
