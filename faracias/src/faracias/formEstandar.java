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
public class formEstandar extends javax.swing.JFrame {

    /**
     * Creates new form formEstandar
     */
    public formEstandar() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCliente = new javax.swing.JButton();
        btnProduc = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        btnmsalir = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btnmcliente = new javax.swing.JMenuItem();
        btnmproduc = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("MENU");

        btnCliente.setBackground(new java.awt.Color(255, 204, 153));
        btnCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCliente.setText("Clientes");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnProduc.setBackground(new java.awt.Color(255, 204, 153));
        btnProduc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnProduc.setText("Productos");
        btnProduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProducActionPerformed(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(255, 204, 153));
        btnsalir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCliente)
                        .addGap(18, 18, 18)
                        .addComponent(btnProduc))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProduc)
                    .addComponent(btnCliente))
                .addGap(18, 18, 18)
                .addComponent(btnsalir)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

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

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmsalirActionPerformed
        // TODO add your handling code here:
       dispose();
    }//GEN-LAST:event_btnmsalirActionPerformed

    private void btnmproducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmproducActionPerformed
        // TODO add your handling code here:
        
        ProductoEstan proes = new ProductoEstan();
        proes.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnmproducActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
       dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        // TODO add your handling code here:
        ClienteEstan_tmp ClE = new ClienteEstan_tmp();
        ClE.setVisible(true);
        dispose();
                
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnProducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProducActionPerformed
        // TODO add your handling code here:
        
        ProductoEstan pre = new ProductoEstan();
        pre.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProducActionPerformed

    private void btnmclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmclienteActionPerformed
        // TODO add your handling code here:
        
        ClienteEstan_tmp ClE = new ClienteEstan_tmp();
        ClE.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnmclienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnProduc;
    private javax.swing.JMenuItem btnmcliente;
    private javax.swing.JMenuItem btnmproduc;
    private javax.swing.JMenuItem btnmsalir;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
