/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author jrgou
 */
public class SetProductQtt extends javax.swing.JFrame {

    /**
     * Creates new form SetProductQtt
     */
    public SetProductQtt() {
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

        lblSetProductQtt = new javax.swing.JLabel();
        lblProductID = new javax.swing.JLabel();
        txtProductID = new javax.swing.JTextField();
        btnSearchProduct = new javax.swing.JButton();
        panelProduct = new javax.swing.JPanel();
        txtShowProductName = new javax.swing.JTextField();
        txtShowProductQtt = new javax.swing.JTextField();
        lblProductName = new javax.swing.JLabel();
        lblAvailableQtt = new javax.swing.JLabel();
        lblCustomQtt = new javax.swing.JLabel();
        btnUpdateQtt = new javax.swing.JButton();
        spinnerQtt = new javax.swing.JSpinner();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 250, 0, 0));
        setMinimumSize(new java.awt.Dimension(504, 432));
        setResizable(false);

        lblSetProductQtt.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        lblSetProductQtt.setText("Atualizar Quantidade de Produto");

        lblProductID.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        lblProductID.setText("ID do Produto");

        txtProductID.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        txtProductID.setMargin(new java.awt.Insets(6, 6, 6, 6));

        btnSearchProduct.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        btnSearchProduct.setText("Buscar");
        btnSearchProduct.setPreferredSize(new java.awt.Dimension(84, 16));
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });

        panelProduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtShowProductName.setEditable(false);
        txtShowProductName.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        txtShowProductName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtShowProductName.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtShowProductName.setEnabled(false);
        txtShowProductName.setFocusable(false);
        txtShowProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtShowProductNameActionPerformed(evt);
            }
        });

        txtShowProductQtt.setEditable(false);
        txtShowProductQtt.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        txtShowProductQtt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtShowProductQtt.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtShowProductQtt.setEnabled(false);
        txtShowProductQtt.setFocusable(false);
        txtShowProductQtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtShowProductQttActionPerformed(evt);
            }
        });

        lblProductName.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        lblProductName.setText("Nome do Produto");

        lblAvailableQtt.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        lblAvailableQtt.setText("Quantidade Disponível");

        lblCustomQtt.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        lblCustomQtt.setText("Quantidade Atualizada");

        btnUpdateQtt.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        btnUpdateQtt.setText("Atualizar");
        btnUpdateQtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateQttActionPerformed(evt);
            }
        });

        spinnerQtt.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        jFormattedTextField1.setText("jFormattedTextField1");

        javax.swing.GroupLayout panelProductLayout = new javax.swing.GroupLayout(panelProduct);
        panelProduct.setLayout(panelProductLayout);
        panelProductLayout.setHorizontalGroup(
            panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelProductLayout.createSequentialGroup()
                        .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtShowProductQtt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAvailableQtt)
                            .addComponent(txtShowProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductName))
                        .addGap(26, 26, 26)
                        .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCustomQtt)
                            .addGroup(panelProductLayout.createSequentialGroup()
                                .addComponent(spinnerQtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdateQtt)))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        panelProductLayout.setVerticalGroup(
            panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblProductName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtShowProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailableQtt)
                    .addComponent(lblCustomQtt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtShowProductQtt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateQtt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerQtt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnClose.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        btnClose.setText("Fechar");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblProductID)
                        .addComponent(lblSetProductQtt)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblSetProductQtt)
                .addGap(18, 18, 18)
                .addComponent(lblProductID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false","root","password");

            String product_id = txtProductID.getText();

            Statement stm = con.createStatement();
            String sql = "select * from products where product_id='" + product_id + "'";
            ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next()){
            txtShowProductName.setText(rs.getString(1));
            txtShowProductQtt.setText(rs.getString(4));
            }
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_btnSearchProductActionPerformed

    private void txtShowProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShowProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtShowProductNameActionPerformed

    private void txtShowProductQttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShowProductQttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtShowProductQttActionPerformed

    private void btnUpdateQttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateQttActionPerformed
        // TODO add your handling code here:
        int value = (int) spinnerQtt.getValue();
        if(value >= 0){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false","root","password");
            
            String sql = "update products set quantity='"+spinnerQtt.getValue()+"' where product_id='"+txtProductID.getText()+"'";
            
     
            PreparedStatement stm = con.prepareStatement(sql);
            stm.executeUpdate(sql);
            
            txtShowProductName.setText("");
            txtShowProductQtt.setText("");
            txtProductID.setText("");
            spinnerQtt.setValue(0);
            JOptionPane.showMessageDialog(this, "Quantidade do produto atualizada");
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }}else{
            JOptionPane.showMessageDialog(this, "Quantidade inválida");
            spinnerQtt.setValue(0);}
    }//GEN-LAST:event_btnUpdateQttActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(SetProductQtt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetProductQtt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetProductQtt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetProductQtt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetProductQtt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JButton btnUpdateQtt;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel lblAvailableQtt;
    private javax.swing.JLabel lblCustomQtt;
    private javax.swing.JLabel lblProductID;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblSetProductQtt;
    private javax.swing.JPanel panelProduct;
    private javax.swing.JSpinner spinnerQtt;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtShowProductName;
    private javax.swing.JTextField txtShowProductQtt;
    // End of variables declaration//GEN-END:variables
}
