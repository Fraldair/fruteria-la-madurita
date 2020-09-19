
package Ventanas;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Frael Campos
 */
public class Menu extends javax.swing.JFrame {

ImageIcon icc=  new ImageIcon(getClass().getResource("/Imagenes/logut2.png"));
ImageIcon logouu;

ImageIcon icc1=  new ImageIcon(getClass().getResource("/Imagenes/inventario.png"));
ImageIcon inven;

ImageIcon icc3=  new ImageIcon(getClass().getResource("/Imagenes/logut2.png"));
ImageIcon vent;

ImageIcon icc4=  new ImageIcon(getClass().getResource("/Imagenes/logut2.png"));
ImageIcon provee;

ImageIcon icc5=  new ImageIcon(getClass().getResource("/Imagenes/logut2.png"));
ImageIcon client;

ImageIcon icc6=  new ImageIcon(getClass().getResource("/Imagenes/logut2.png"));
ImageIcon factura;



    public Menu() {
        setTitle("Sistema Peñaca S.A.");
        initComponents();
        setLocationRelativeTo(null);
       
      
        this.inven = new ImageIcon(icc1.getImage().getScaledInstance(inventario.getWidth(),inventario.getHeight(), Image.SCALE_DEFAULT));
        inventario.setIcon(inven);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_base = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        inventario = new javax.swing.JMenu();
        inventario_win = new javax.swing.JMenuItem();
        control_mer_win = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        list_clien_win = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        ventas = new javax.swing.JMenu();
        venta_win = new javax.swing.JMenuItem();
        compras = new javax.swing.JMenu();
        provee_win = new javax.swing.JMenuItem();
        lis_provee_win = new javax.swing.JMenuItem();
        factura_win = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 855, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_baseLayout = new javax.swing.GroupLayout(panel_base);
        panel_base.setLayout(panel_baseLayout);
        panel_baseLayout.setHorizontalGroup(
            panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        panel_baseLayout.setVerticalGroup(
            panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_baseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 153));
        jMenuBar1.setForeground(new java.awt.Color(204, 255, 255));
        jMenuBar1.setAlignmentY(1.0F);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        inventario.setText("Productos");
        inventario.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N

        inventario_win.setText("Inventario");
        inventario_win.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventario_winActionPerformed(evt);
            }
        });
        inventario.add(inventario_win);

        control_mer_win.setText("Control Mercaderia");
        control_mer_win.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                control_mer_winActionPerformed(evt);
            }
        });
        inventario.add(control_mer_win);

        jMenuBar1.add(inventario);

        jMenu3.setText("Clientes");
        jMenu3.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N

        list_clien_win.setText("Agregar nuevo Cliente");
        list_clien_win.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_clien_winActionPerformed(evt);
            }
        });
        jMenu3.add(list_clien_win);

        jMenuItem5.setText("Lista de Clientes");
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        ventas.setText("Ventas");
        ventas.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N

        venta_win.setText("Venta");
        venta_win.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venta_winActionPerformed(evt);
            }
        });
        ventas.add(venta_win);

        jMenuBar1.add(ventas);

        compras.setText("Compra");

        provee_win.setText("Proveedores");
        compras.add(provee_win);

        lis_provee_win.setText("Lista de Proveedores");
        compras.add(lis_provee_win);

        jMenuBar1.add(compras);

        factura_win.setText("Facturas");
        jMenuBar1.add(factura_win);

        jMenu2.setText("Usuario");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inventario_winActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventario_winActionPerformed
        Inventario ot=new Inventario();
        ot.setVisible(true);
        dispose();
    }//GEN-LAST:event_inventario_winActionPerformed

    private void control_mer_winActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_control_mer_winActionPerformed
     Control_mercaderia ot=new Control_mercaderia();
      ot.setVisible(true);
     dispose();
    }//GEN-LAST:event_control_mer_winActionPerformed

    private void list_clien_winActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_clien_winActionPerformed
     Agregar_nueClien ot=new Agregar_nueClien();
      ot.setVisible(true);
     dispose();   
    }//GEN-LAST:event_list_clien_winActionPerformed

    private void venta_winActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venta_winActionPerformed
      Ventas ot=new Ventas();
      ot.setVisible(true);
     dispose();  
    }//GEN-LAST:event_venta_winActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu compras;
    private javax.swing.JMenuItem control_mer_win;
    private javax.swing.JMenu factura_win;
    private javax.swing.JMenu inventario;
    private javax.swing.JMenuItem inventario_win;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem lis_provee_win;
    private javax.swing.JMenuItem list_clien_win;
    private javax.swing.JPanel panel_base;
    private javax.swing.JMenuItem provee_win;
    private javax.swing.JMenuItem venta_win;
    private javax.swing.JMenu ventas;
    // End of variables declaration//GEN-END:variables
}
