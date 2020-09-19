
package Ventanas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import placeH.Pic;
import placeH.TextPrompt;
import Project.FuncionesArchivos;
import Project.FuncionesArchivos;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Frael Campos
 */
public class Login extends javax.swing.JFrame {
ImageIcon icc=  new ImageIcon(getClass().getResource("/Imagenes/loginsa.png"));
ImageIcon lo;
    
    public Login() {
       
        setResizable(false);
       setTitle("Peñaca");
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.jpg")).getImage());
        setLocationRelativeTo(null);
        TextPrompt pass= new TextPrompt("Contraseña",password_t);
        TextPrompt cedula= new TextPrompt("Cedula",cedula_t);

      this.lo = new ImageIcon(icc.getImage().getScaledInstance(txtlog.getWidth(), txtlog.getHeight(), Image.SCALE_DEFAULT));
      txtlog.setIcon(lo);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        panel_base = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        password_t = new javax.swing.JPasswordField();
        cedula_t = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        inicia_but = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        crear_usr = new javax.swing.JButton();
        txtlog = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_base.setBackground(new java.awt.Color(51, 153, 255));

        password_t.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), null));
        password_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_tActionPerformed(evt);
            }
        });

        cedula_t.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), null));
        cedula_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedula_tActionPerformed(evt);
            }
        });

        inicia_but.setFont(new java.awt.Font("Book Antiqua", 3, 12)); // NOI18N
        inicia_but.setText("Iniciar Sesion");
        inicia_but.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        inicia_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicia_butActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel1.setText("¿Usuario nuevo?");

        crear_usr.setFont(new java.awt.Font("Book Antiqua", 2, 14)); // NOI18N
        crear_usr.setText("Crear Usuario Nuevo");
        crear_usr.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        crear_usr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_usrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_baseLayout = new javax.swing.GroupLayout(panel_base);
        panel_base.setLayout(panel_baseLayout);
        panel_baseLayout.setHorizontalGroup(
            panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_baseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_baseLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(inicia_but, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(panel_baseLayout.createSequentialGroup()
                .addGroup(panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panel_baseLayout.createSequentialGroup()
                            .addGap(85, 85, 85)
                            .addComponent(txtlog, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cedula_t, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(password_t, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panel_baseLayout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_baseLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(crear_usr, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_baseLayout.setVerticalGroup(
            panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_baseLayout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addGroup(panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_baseLayout.createSequentialGroup()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(cedula_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(password_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtlog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(inicia_but)
                .addGap(39, 39, 39)
                .addGroup(panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crear_usr, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void password_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_tActionPerformed
        
    }//GEN-LAST:event_password_tActionPerformed

    private void inicia_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicia_butActionPerformed
       boolean advi;
        FuncionesArchivos o= new FuncionesArchivos();
        
        String pass_tram= new String(password_t.getPassword());
        
        if(cedula_t.getText().isEmpty() && password_t.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(this,"Complete los campos","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            if(cedula_t.getText().isBlank()){
            JOptionPane.showMessageDialog(this,"Ingrese su cedula","Error",JOptionPane.ERROR_MESSAGE);
            }
            if(password_t.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Ingrese su contraseña","Error",JOptionPane.ERROR_MESSAGE);
            }
            
            if(!(cedula_t.getText().trim().isEmpty() && password_t.getText().trim().isEmpty())){
            
                try {
                  //  o.leerArchivoEmple();
                    advi = o.buscaUsuario(cedula_t.getText().trim(), password_t.getText().trim());
                   if(!advi){
                   JOptionPane.showMessageDialog(this, "Ud no esta registrado en el sistema");
                   }
                   else{
                   Menu ot= new Menu();
                   ot.setVisible(true);
                   dispose();
                   }
                    
                } catch (IOException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        
        }
    }//GEN-LAST:event_inicia_butActionPerformed

    private void cedula_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedula_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedula_tActionPerformed

    private void crear_usrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_usrActionPerformed
        
      
    }//GEN-LAST:event_crear_usrActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedula_t;
    private javax.swing.JButton crear_usr;
    private javax.swing.JButton inicia_but;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panel_base;
    private javax.swing.JPasswordField password_t;
    private javax.swing.JLabel txtlog;
    // End of variables declaration//GEN-END:variables
}
