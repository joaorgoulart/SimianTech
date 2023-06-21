/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto1;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author jrgou
 */
public class Reservation extends javax.swing.JFrame {

    /**
     * Creates new form Reservation
     */
    public Reservation() {
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

        txtProductName = new javax.swing.JTextField();
        lblAddProduct = new javax.swing.JLabel();
        spnnProductQtt = new javax.swing.JSpinner();
        txtClientName = new javax.swing.JTextField();
        btnReserve = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblProductName = new javax.swing.JLabel();
        lblUserID = new javax.swing.JLabel();
        lblProductQtt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtProductName.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        txtProductName.setMargin(new java.awt.Insets(6, 6, 6, 6));

        lblAddProduct.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        lblAddProduct.setText("Reservar Produto");

        spnnProductQtt.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        txtClientName.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        txtClientName.setMargin(new java.awt.Insets(6, 6, 6, 6));
        txtClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNameActionPerformed(evt);
            }
        });

        btnReserve.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        btnReserve.setText("Reservar");
        btnReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserveActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblProductName.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        lblProductName.setText("Nome do Produto");

        lblUserID.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        lblUserID.setText("Nome do Cliente");

        lblProductQtt.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        lblProductQtt.setText("Quantidade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProductQtt)
                    .addComponent(lblAddProduct)
                    .addComponent(spnnProductQtt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnReserve, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblProductName)
                                    .addGap(165, 165, 165))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtProductName)
                                    .addGap(51, 51, 51)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblUserID)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblAddProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductName)
                    .addComponent(lblUserID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProductQtt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnnProductQtt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReserve, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserveActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false","root","password");

            String product_name = txtProductName.getText();
            String client_name = txtClientName.getText();
            int quantity = (int) spnnProductQtt.getValue();

            Statement stm1 = con.createStatement();
            String sql1 = "select * from products where product_name='"+product_name+"'";
            ResultSet rs = stm1.executeQuery(sql1);
            
            while(rs.next()){
                if(rs.getInt(4) >= quantity){
                    int currentQtt = rs.getInt(4) - quantity;
                    String sql2 = "insert into reserved(client_name, product_name, quantity)"+"values(?,?,?)";
                    PreparedStatement stm2 = con.prepareStatement(sql2);
                    stm2.setString(1,client_name);
                    stm2.setString(2, product_name);
                    stm2.setInt(3, quantity);
                    stm2.execute();
                    stm2.close();
                    
                    String sql3 = "update products set quantity='"+currentQtt+"' where product_name='"+product_name+"'";
                    PreparedStatement stm3 = con.prepareStatement(sql3);
                    stm3.executeUpdate(sql3);
                    stm3.close();
                    
                    JOptionPane.showMessageDialog(this, "Produto reservado com sucesso");
                }else{
                    JOptionPane.showMessageDialog(this, "Quantidade indisponível");
                }
            }
            stm1.close();

            txtProductName.setText("");
            txtClientName.setText("");
            spnnProductQtt.setValue(0);

        }catch(Exception e){
            
        }
    }//GEN-LAST:event_btnReserveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtClientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientNameActionPerformed

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
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnReserve;
    private javax.swing.JLabel lblAddProduct;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblProductQtt;
    private javax.swing.JLabel lblUserID;
    private javax.swing.JSpinner spnnProductQtt;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextField txtProductName;
    // End of variables declaration//GEN-END:variables
}
