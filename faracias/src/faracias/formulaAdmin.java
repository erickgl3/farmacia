/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faracias;

/**
 *
 * @author user
 */
public class formulaAdmin extends javax.swing.JFrame {

    /**
     * Creates new form formulaAdmin
     */
    public formulaAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnproduc = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btncliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        btnmsalir = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btnmcliente = new javax.swing.JMenuItem();
        btnmproduc = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        btnSalir.setBackground(new java.awt.Color(255, 204, 153));
        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnproduc.setBackground(new java.awt.Color(255, 204, 153));
        btnproduc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnproduc.setText("Productos");
        btnproduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproducActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 204, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Reportes");

        btncliente.setBackground(new java.awt.Color(255, 204, 153));
        btncliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btncliente.setText("Clientes");
        btncliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("MENU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnproduc, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btncliente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnproduc)
                    .addComponent(btncliente))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(btnSalir))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenu3.setText("Archivos");

        btnmsalir.setText("Salir");
        btnmsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmsalirActionPerformed(evt);
            }
        });
        jMenu3.add(btnmsalir);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Mantenimientos");

        btnmcliente.setText("Cliente");
        btnmcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmclienteActionPerformed(evt);
            }
        });
        jMenu4.add(btnmcliente);

        btnmproduc.setText("Productos");
        btnmproduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmproducActionPerformed(evt);
            }
        });
        jMenu4.add(btnmproduc);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Reportes");
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnmsalirActionPerformed

    private void btnproducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproducActionPerformed
        // TODO add your handling code here:
        
        Productos pro = new Productos();
        pro.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnproducActionPerformed

    private void btnmproducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmproducActionPerformed
        // TODO add your handling code here:
        
        Productos pro = new Productos();
        pro.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnmproducActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(WIDTH);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclienteActionPerformed
        // TODO add your handling code here:
        
        ClienteAdmin cla = new ClienteAdmin();
        cla.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnclienteActionPerformed

    private void btnmclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmclienteActionPerformed
        // TODO add your handling code here:
        ClienteAdmin cla = new ClienteAdmin();
        cla.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnmclienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btncliente;
    private javax.swing.JMenuItem btnmcliente;
    private javax.swing.JMenuItem btnmproduc;
    private javax.swing.JMenuItem btnmsalir;
    private javax.swing.JButton btnproduc;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
