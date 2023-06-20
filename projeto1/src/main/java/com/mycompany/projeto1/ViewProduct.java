/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto1;

import java.sql.*;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jrgou
 */
public class ViewProduct extends javax.swing.JFrame {

    /**
     * Creates new form ViewProduct
     */
    public ViewProduct() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableProducts = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProducts1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableProducts2 = new javax.swing.JTable();
        lblViewProducts = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        lblProductName = new javax.swing.JLabel();
        lblProductID = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        txtProductID = new javax.swing.JTextField();
        btnSearchProduct = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableElements = new javax.swing.JTable();

        tableProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Produto", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProducts.setColumnSelectionAllowed(true);
        tableProducts.getTableHeader().setReorderingAllowed(false);
        tableProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProducts);

        tableProducts1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Produto", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProducts1.setColumnSelectionAllowed(true);
        tableProducts1.getTableHeader().setReorderingAllowed(false);
        tableProducts1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProducts1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableProducts1);

        tableProducts2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Produto", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProducts2.setColumnSelectionAllowed(true);
        tableProducts2.getTableHeader().setReorderingAllowed(false);
        tableProducts2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProducts2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableProducts2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 250, 0, 0));

        lblViewProducts.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        lblViewProducts.setText("Produtos");

        btnClose.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        btnClose.setText("Fechar");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        lblProductName.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        lblProductName.setText("Nome do Produto");

        lblProductID.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        lblProductID.setText("ID do Produto");

        txtProductName.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        txtProductName.setMargin(new java.awt.Insets(6, 6, 6, 6));
        txtProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductNameActionPerformed(evt);
            }
        });

        txtProductID.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        txtProductID.setMargin(new java.awt.Insets(6, 6, 6, 6));
        txtProductID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIDActionPerformed(evt);
            }
        });

        btnSearchProduct.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        btnSearchProduct.setText("Buscar Produto");
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });

        tableElements.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tableElements);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblViewProducts)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProductName)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductID)
                    .addComponent(btnSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblViewProducts)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProductName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblProductID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txtProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductNameActionPerformed

    private void txtProductIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductIDActionPerformed

    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false","root","password");

            String product_name = txtProductName.getText();
            String product_id = txtProductID.getText();

            Statement stm = con.createStatement();
            String sql = "select * from products";
            ResultSet rs = stm.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();

            DefaultTableModel tableModel = (DefaultTableModel) tableElements.getModel();
            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            for(int i =0;i<cols;i++){
                colName[i] = rsmd.getColumnName(i+1);
            }
            tableModel.setColumnIdentifiers(colName);
            
            
            while(rs.next()){
                tableModel.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
            }
            stm.close();
            con.close();

            
        }catch(Exception e){
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_btnSearchProductActionPerformed

    private void tableProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductsMouseClicked

    }//GEN-LAST:event_tableProductsMouseClicked

    private void tableProducts1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProducts1MouseClicked
       
    }//GEN-LAST:event_tableProducts1MouseClicked

    private void tableProducts2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProducts2MouseClicked

    }//GEN-LAST:event_tableProducts2MouseClicked

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
            java.util.logging.Logger.getLogger(ViewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Tentando colocar os nomes pra mostrar */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblProductID;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblViewProducts;
    private javax.swing.JTable tableElements;
    private javax.swing.JTable tableProducts;
    private javax.swing.JTable tableProducts1;
    private javax.swing.JTable tableProducts2;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtProductName;
    // End of variables declaration//GEN-END:variables
}
