


import placeH.TextPrompt;

/**
 *
 * @author Frael Campos
 */
public class Register extends javax.swing.JPanel {

    
    public Register() {
        initComponents();
        TextPrompt nom = new TextPrompt ("Obligatorio", nombre_r );
        TextPrompt ape = new TextPrompt ("Obligatorio", apellido_r );
        TextPrompt email = new TextPrompt ("Obligatorio", email_r );
        TextPrompt pass = new TextPrompt ("Obligatorio", contra_r );
        TextPrompt ver_pass = new TextPrompt ("Obligatorio", contra_r2 );
        TextPrompt ced = new TextPrompt ("Obligatorio", cedula_r );
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        registrar_usr = new javax.swing.JButton();
        nombre_r = new javax.swing.JTextField();
        apellido_r = new javax.swing.JTextField();
        fecha_na_r = new javax.swing.JTextField();
        email_r = new javax.swing.JTextField();
        cedula_r = new javax.swing.JTextField();
        direccion_t = new javax.swing.JTextField();
        telefono_r = new javax.swing.JTextField();
        celular_r = new javax.swing.JTextField();
        contra_r = new javax.swing.JPasswordField();
        contra_r2 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        ad_nom = new javax.swing.JLabel();
        ad_apell = new javax.swing.JLabel();
        ad_fecha = new javax.swing.JLabel();
        ad_email = new javax.swing.JLabel();
        ad_cedula = new javax.swing.JLabel();
        ad_con = new javax.swing.JLabel();
        ad_con2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrarse", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Candara", 1, 12))); // NOI18N
        setPreferredSize(new java.awt.Dimension(555, 500));

        jLabel1.setText("Nombres");

        jLabel2.setText("Apellidos");

        jLabel3.setText("E-mail");

        jLabel4.setText("Cedúla");

        jLabel5.setText("Contraseña");

        jLabel6.setText("Verificar contraseña");

        jLabel7.setText("Dirección");

        jLabel8.setText("Telefono");

        jLabel9.setText("Celular");

        jLabel10.setText("Fecha de Nacimiento");

        registrar_usr.setText("Registrarse");
        registrar_usr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_usrActionPerformed(evt);
            }
        });

        nombre_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_rActionPerformed(evt);
            }
        });

        email_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_rActionPerformed(evt);
            }
        });

        jLabel11.setText("Tipo de Usuario");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Vendedor", "Comprador", "Facturador" }));

        ad_nom.setText("             ");

        ad_apell.setText("             ");

        ad_fecha.setText("              ");

        ad_email.setText("             ");

        ad_cedula.setText("             ");

        ad_con.setText("      ");

        ad_con2.setText("jLabel18");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9)))
                            .addComponent(jLabel8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(contra_r2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ad_con2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(fecha_na_r, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ad_fecha))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(direccion_t)
                                    .addComponent(nombre_r)
                                    .addComponent(apellido_r)
                                    .addComponent(email_r)
                                    .addComponent(cedula_r)
                                    .addComponent(telefono_r)
                                    .addComponent(celular_r, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(contra_r, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ad_con, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ad_nom)
                                    .addComponent(ad_apell)
                                    .addComponent(ad_email)
                                    .addComponent(ad_cedula)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(registrar_usr, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nombre_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ad_nom))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(apellido_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ad_apell))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(fecha_na_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ad_fecha))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(email_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ad_email))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cedula_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ad_cedula))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(contra_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ad_con)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(contra_r2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ad_con2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(direccion_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(telefono_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(celular_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registrar_usr)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void email_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_rActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_rActionPerformed

    private void nombre_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_rActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_rActionPerformed

    private void registrar_usrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_usrActionPerformed
    if ( nombre_r.getText().isEmpty() || apellido_r.getText().isEmpty() || cedula_r.getText().isEmpty() || contra_r.getText().isEmpty() ||
            contra_r2.getText().isEmpty() || email_r.getText().isEmpty() || fecha_na_r.getText().isEmpty()){
        
    }
    }//GEN-LAST:event_registrar_usrActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ad_apell;
    private javax.swing.JLabel ad_cedula;
    private javax.swing.JLabel ad_con;
    private javax.swing.JLabel ad_con2;
    private javax.swing.JLabel ad_email;
    private javax.swing.JLabel ad_fecha;
    private javax.swing.JLabel ad_nom;
    private javax.swing.JTextField apellido_r;
    private javax.swing.JTextField cedula_r;
    private javax.swing.JTextField celular_r;
    private javax.swing.JPasswordField contra_r;
    private javax.swing.JPasswordField contra_r2;
    private javax.swing.JTextField direccion_t;
    private javax.swing.JTextField email_r;
    private javax.swing.JTextField fecha_na_r;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombre_r;
    private javax.swing.JButton registrar_usr;
    private javax.swing.JTextField telefono_r;
    // End of variables declaration//GEN-END:variables
}
