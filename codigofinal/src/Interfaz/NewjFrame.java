/*

package interfaz;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Agregar = new javax.swing.JButton();
        Mostrar = new javax.swing.JButton();
        Numero = new javax.swing.JTextField();
        Ubicacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Agregar.setText("jButton1");

        Mostrar.setText("jButton2");

        Numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroActionPerformed(evt);
            }
        });

        jLabel5.setText("Numero");

        jLabel7.setText("Ubicacion_mesa");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("GESTION MESA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(Agregar)
                        .addGap(44, 44, 44)
                        .addComponent(Mostrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel8)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agregar)
                    .addComponent(Mostrar))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>                        

    private void NumeroActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    // Variables declaration - do not modify                     
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Mostrar;
    private javax.swing.JTextField Numero;
    private javax.swing.JTextField Ubicacion;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration                   
}
*/



package interfaz;

import metodos.*;

import modelo.MesaElectoral;

public class NewJFrame extends javax.swing.JFrame {

  private GestionMesaElectoral gestionMesaElectoral;

   

  private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(NewJFrame.class.getName());



  public NewJFrame() {

  initComponents();

  this.gestionMesaElectoral = new GestionMesaElectoral();

}



  public NewJFrame(GestionMesaElectoral gestionMesaElectoral) {

  initComponents();

  this.gestionMesaElectoral = gestionMesaElectoral;

}

   

  /**

   * This method is called from within the constructor to initialize the form.

   * WARNING: Do NOT modify this code. The content of this method is always

   * regenerated by the Form Editor.

   */

  @SuppressWarnings("unchecked")

  // <editor-fold defaultstate="collapsed" desc="Generated Code">              

  private void initComponents() {



    jLabel3 = new javax.swing.JLabel();

    jLabel2 = new javax.swing.JLabel();

    lblTitulo = new javax.swing.JLabel();

    jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();

    numeromesa = new javax.swing.JTextField();

    ubicacionmesa = new javax.swing.JTextField();

    buttonmostrar = new javax.swing.JButton();

    buttonregistrar = new javax.swing.JButton();

    jLabel1 = new javax.swing.JLabel();

    jLabel4 = new javax.swing.JLabel();

    jLabel6 = new javax.swing.JLabel();



    jLabel3.setText("Ubicacion");



    jLabel2.setText("Numero");



    lblTitulo.setText("Titulo");



    jCheckBoxMenuItem1.setSelected(true);

    jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");



    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);



    numeromesa.setText("escriba aca");

    numeromesa.addActionListener(this::numeromesaActionPerformed);



    ubicacionmesa.setText("escriba aca");

    ubicacionmesa.addActionListener(this::ubicacionmesaActionPerformed);



    buttonmostrar.setText("Mostrar");

    buttonmostrar.addActionListener(this::buttonmostrarActionPerformed);



    buttonregistrar.setText("Registrar");

    buttonregistrar.addActionListener(this::buttonregistrarActionPerformed);



    jLabel1.setText("Numero_mesa");



    jLabel4.setText("Ubicacion_mesa");



    jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

    jLabel6.setText("Mesa electoral");



    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

    getContentPane().setLayout(layout);

    layout.setHorizontalGroup(

      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

      .addGroup(layout.createSequentialGroup()

        .addGap(18, 18, 18)

        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

          .addGroup(layout.createSequentialGroup()

            .addComponent(numeromesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

              .addGroup(layout.createSequentialGroup()

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                  .addComponent(jLabel6)

                  .addGroup(layout.createSequentialGroup()

                    .addGap(90, 90, 90)

                    .addComponent(buttonregistrar)

                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                    .addComponent(buttonmostrar))))

              .addGroup(layout.createSequentialGroup()

                .addGap(26, 26, 26)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                  .addComponent(jLabel4)

                  .addComponent(jLabel1))

                .addGap(0, 0, Short.MAX_VALUE)))

            .addGap(34, 34, 34))

          .addGroup(layout.createSequentialGroup()

            .addComponent(ubicacionmesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

            .addGap(0, 0, Short.MAX_VALUE))))

    );

    layout.setVerticalGroup(

      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

      .addGroup(layout.createSequentialGroup()

        .addGap(42, 42, 42)

        .addComponent(jLabel6)

        .addGap(44, 44, 44)

        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

          .addGroup(layout.createSequentialGroup()

            .addGap(53, 53, 53)

            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

              .addComponent(ubicacionmesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

              .addComponent(jLabel4))

            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)

            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

              .addComponent(buttonmostrar)

              .addComponent(buttonregistrar))

            .addGap(62, 62, 62))

          .addGroup(layout.createSequentialGroup()

            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

              .addComponent(numeromesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

              .addComponent(jLabel1))

            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))

    );



    pack();

  }// </editor-fold>             



  private void numeromesaActionPerformed(java.awt.event.ActionEvent evt) {                      

    

  }                      



  private void ubicacionmesaActionPerformed(java.awt.event.ActionEvent evt) {                        

    // TODO add your handling code here:

  }                       



  private void buttonregistrarActionPerformed(java.awt.event.ActionEvent evt) {                         

    

  String codigo = numeromesa.getText();

  String lugar = ubicacionmesa.getText();



  // Crear objeto MesaElectoral

  MesaElectoral mesa = new MesaElectoral();

  mesa.setCodigoMesa(codigo);

  mesa.setLugar(lugar);



  // Guardar en gestionMesaElectoral

  gestionMesaElectoral.registrar(mesa);



  // Mensaje de confirmación

  javax.swing.JOptionPane.showMessageDialog(this, "Mesa registrada correctamente");



  // Limpiar campos para nueva entrada

  numeromesa.setText("");

  ubicacionmesa.setText("");



  }                        



  private void buttonmostrarActionPerformed(java.awt.event.ActionEvent evt) {                        

    

 String resultado = "";



  MesaElectoral[] mesas = gestionMesaElectoral.getMesas();

  int total = gestionMesaElectoral.getTotalMesasElectorales();



  for (int i = 0; i < total; i++) {

    resultado += mesas[i].getCodigoMesa() + " - " 

         + mesas[i].getLugar() + " | ";

  }



  // Mostrar en un JOptionPane o en un JLabel

  javax.swing.JOptionPane.showMessageDialog(this, resultado);

  // o si quieres usar tu lblTitulo u otro JLabel:

  // lblTitulo.setText(resultado);







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

    } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {

      logger.log(java.util.logging.Level.SEVERE, null, ex);

    }

    //</editor-fold>



    /* Create and display the form */

    java.awt.EventQueue.invokeLater(() -> new NewJFrame().setVisible(true));

  }



  // Variables declaration - do not modify           

  private javax.swing.JButton buttonmostrar;

  private javax.swing.JButton buttonregistrar;

  private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;

  private javax.swing.JLabel jLabel1;

  private javax.swing.JLabel jLabel2;

  private javax.swing.JLabel jLabel3;

  private javax.swing.JLabel jLabel4;

  private javax.swing.JLabel jLabel6;

  private javax.swing.JLabel lblTitulo;

  private javax.swing.JTextField numeromesa;

  private javax.swing.JTextField ubicacionmesa;

  // End of variables declaration          

}
