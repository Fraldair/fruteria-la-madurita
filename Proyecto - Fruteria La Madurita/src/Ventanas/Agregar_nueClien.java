
package Ventanas;

import Ventanas.Menu;
import Clases.Clientes;
import Project.*;
import static Project.FuncionesArchivos.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import placeH.TextPrompt;
/**
 *
 * @author Frael Campos
 */
public class Agregar_nueClien extends javax.swing.JFrame {
     
    
    Clientes o;
    public Agregar_nueClien() {
        setResizable(false);
        initComponents();
        setLocationRelativeTo(null);
        
        TextPrompt nom= new TextPrompt("Nombre y Apellido",nom_clie);
        TextPrompt id= new TextPrompt("ID / Mayor a 5",id_clie);
        TextPrompt dire= new TextPrompt("Dirección",dir_clie);
        TextPrompt cel= new TextPrompt("Celular/ Mayor a 10",cell_clie);
        TextPrompt cedu= new TextPrompt("Cédula",ced_clie);
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_base = new javax.swing.JPanel();
        nom_clie = new javax.swing.JTextField();
        id_clie = new javax.swing.JTextField();
        ced_clie = new javax.swing.JTextField();
        dir_clie = new javax.swing.JTextField();
        cell_clie = new javax.swing.JTextField();
        txtNom_clie = new javax.swing.JLabel();
        txtID_clie = new javax.swing.JLabel();
        txtCedula_clie = new javax.swing.JLabel();
        txtDir_clie = new javax.swing.JLabel();
        txtCell_clie = new javax.swing.JLabel();
        guardar_clie = new javax.swing.JButton();
        cancelar_clie = new javax.swing.JButton();
        volver_menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_base.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Book Antiqua", 3, 18))); // NOI18N

        id_clie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_clieActionPerformed(evt);
            }
        });

        cell_clie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell_clieActionPerformed(evt);
            }
        });

        txtNom_clie.setText("Nombre");

        txtID_clie.setText("ID");

        txtCedula_clie.setText("Cédula");

        txtDir_clie.setText("Dirección");

        txtCell_clie.setText("Celular");

        guardar_clie.setText("Registrar Cliente");
        guardar_clie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_clieActionPerformed(evt);
            }
        });

        cancelar_clie.setText("Cancelar Registro");

        volver_menu.setText("Volver");
        volver_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver_menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_baseLayout = new javax.swing.GroupLayout(panel_base);
        panel_base.setLayout(panel_baseLayout);
        panel_baseLayout.setHorizontalGroup(
            panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_baseLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCell_clie)
                    .addComponent(txtCedula_clie)
                    .addComponent(txtNom_clie))
                .addGap(18, 18, 18)
                .addGroup(panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_baseLayout.createSequentialGroup()
                        .addGroup(panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_baseLayout.createSequentialGroup()
                                .addComponent(nom_clie, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtID_clie))
                            .addGroup(panel_baseLayout.createSequentialGroup()
                                .addComponent(ced_clie, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(txtDir_clie)))
                        .addGap(18, 18, 18)
                        .addGroup(panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_clie, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dir_clie, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))
                    .addGroup(panel_baseLayout.createSequentialGroup()
                        .addComponent(cell_clie, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_baseLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guardar_clie)
                        .addGap(18, 18, 18)
                        .addComponent(cancelar_clie)
                        .addGap(152, 152, 152))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_baseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(volver_menu)
                .addContainerGap())
        );
        panel_baseLayout.setVerticalGroup(
            panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_baseLayout.createSequentialGroup()
                .addComponent(volver_menu)
                .addGap(57, 57, 57)
                .addGroup(panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNom_clie)
                    .addComponent(nom_clie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_clie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID_clie))
                .addGap(26, 26, 26)
                .addGroup(panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCedula_clie)
                    .addGroup(panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ced_clie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dir_clie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDir_clie)))
                .addGap(32, 32, 32)
                .addGroup(panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCell_clie)
                    .addComponent(cell_clie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar_clie)
                    .addComponent(cancelar_clie))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_clieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_clieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_clieActionPerformed

    private void cell_clieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell_clieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell_clieActionPerformed

    private void volver_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver_menuActionPerformed
      Menu ot=new Menu();
      ot.setVisible(true);
     dispose();  
    }//GEN-LAST:event_volver_menuActionPerformed

    private void guardar_clieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_clieActionPerformed
       boolean ad=false, ad1=false,ad2=false;
        o=new Clientes(nom_clie.getText(),id_clie.getText(),ced_clie.getText(),dir_clie.getText(),cell_clie.getText());
        
        if(nom_clie.getText().isBlank() && id_clie.getText().isBlank() && ced_clie.getText().isBlank()
                 && dir_clie.getText().isBlank() && cell_clie.getText().isBlank()){
            JOptionPane.showMessageDialog(this,"Complete los datos","Error",JOptionPane.ERROR_MESSAGE);
        }else{
        if(nom_clie.getText().isBlank()){
        JOptionPane.showMessageDialog(this,"Ingrese el Nombre","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(id_clie.getText().isBlank()){
        JOptionPane.showMessageDialog(this,"Ingrese la ID","Error",JOptionPane.ERROR_MESSAGE);
        }else{
        if(esEntero(id_clie.getText().trim()) && id_clie.getText().length() ==5){
        ad1=true;
        }
        }
        if(dir_clie.getText().isBlank()){
        JOptionPane.showMessageDialog(this,"Ingrese la Dirección","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(cell_clie.getText().isBlank()){
        JOptionPane.showMessageDialog(this,"Ingrese el Celular","Error",JOptionPane.ERROR_MESSAGE);
        }else{
        if(esEntero(cell_clie.getText().trim()) && cell_clie.getText().length() == 10){
        ad2=true;
        }
        }
        if(ced_clie.getText().isBlank()){
        JOptionPane.showMessageDialog(this,"Ingrese la Cedula","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            if(esEntero(ced_clie.getText().trim())){
          ad=validaCedula(ced_clie.getText().trim());
            if(!ad){ JOptionPane.showMessageDialog(this, "Ingrese una Cedula Valida");}
           }
        
        }
        
        if(!(nom_clie.getText().isBlank() && id_clie.getText().isBlank() && ced_clie.getText().isBlank()
                 && dir_clie.getText().isBlank() && cell_clie.getText().isBlank())){
            if(ad==true && ad1==true && ad2==true){
            try {
                agregarArchivoCliente(o);
                JOptionPane.showMessageDialog(this,"Datos Ingresados correctamente !");
                        nom_clie.setText("");
                        id_clie.setText("");
                        ced_clie.setText("");
                        dir_clie.setText("");
                        cell_clie.setText("");
            } catch (IOException ex) {
                Logger.getLogger(Agregar_nueClien.class.getName()).log(Level.SEVERE, null, ex);
              }
            }
            else{
                JOptionPane.showMessageDialog(this, "Verifique bien los datos!","ADVICE",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        }
        

    }//GEN-LAST:event_guardar_clieActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar_nueClien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_nueClien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_nueClien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_nueClien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar_nueClien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar_clie;
    private javax.swing.JTextField ced_clie;
    private javax.swing.JTextField cell_clie;
    private javax.swing.JTextField dir_clie;
    private javax.swing.JButton guardar_clie;
    private javax.swing.JTextField id_clie;
    private javax.swing.JTextField nom_clie;
    private javax.swing.JPanel panel_base;
    private javax.swing.JLabel txtCedula_clie;
    private javax.swing.JLabel txtCell_clie;
    private javax.swing.JLabel txtDir_clie;
    private javax.swing.JLabel txtID_clie;
    private javax.swing.JLabel txtNom_clie;
    private javax.swing.JButton volver_menu;
    // End of variables declaration//GEN-END:variables
}
