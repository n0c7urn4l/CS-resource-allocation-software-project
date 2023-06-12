/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package resourceallocationsoftware.ViewClasses;

import java.awt.Color;
import java.sql.Date;

/**
 *
 * @author shanu
 */
public class CustomerDetailsUI extends javax.swing.JFrame {
    
    
    /**
     * Creates new form PeriodicUI
     */
    public CustomerDetailsUI() {
        
        initComponents();
        setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new RoundPanel(30, 30, 30, 30);
        jPanel2 = new RoundPanel(20, 20, 20, 20);
        nameTf = new textfield.TextField();
        okBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        nicTf = new textfield.TextField();
        contactTf = new textfield.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(304, 345));

        jPanel1.setBackground(new java.awt.Color(57, 72, 103));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 15));

        jPanel2.setBackground(new java.awt.Color(247, 251, 255));
        jPanel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(270, 315));

        nameTf.setEditable(false);
        nameTf.setForeground(new java.awt.Color(155, 164, 181));
        nameTf.setCaretColor(new java.awt.Color(155, 164, 181));
        nameTf.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        nameTf.setLabelText("Customer name");
        nameTf.setLineColor(new java.awt.Color(57, 72, 103));
        nameTf.setSelectionColor(new java.awt.Color(57, 72, 103));

        okBtn.setBackground(new java.awt.Color(57, 72, 103));
        okBtn.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        okBtn.setForeground(new java.awt.Color(155, 164, 181));
        okBtn.setText("Ok");
        okBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                okBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                okBtnMouseExited(evt);
            }
        });
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(57, 72, 103));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Customer details");
        jLabel12.setPreferredSize(new java.awt.Dimension(70, 18));

        nicTf.setEditable(false);
        nicTf.setForeground(new java.awt.Color(155, 164, 181));
        nicTf.setCaretColor(new java.awt.Color(155, 164, 181));
        nicTf.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        nicTf.setLabelText("NIC");
        nicTf.setLineColor(new java.awt.Color(57, 72, 103));
        nicTf.setSelectionColor(new java.awt.Color(57, 72, 103));

        contactTf.setEditable(false);
        contactTf.setForeground(new java.awt.Color(155, 164, 181));
        contactTf.setCaretColor(new java.awt.Color(155, 164, 181));
        contactTf.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        contactTf.setLabelText("Contact number");
        contactTf.setLineColor(new java.awt.Color(57, 72, 103));
        contactTf.setSelectionColor(new java.awt.Color(57, 72, 103));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nicTf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameTf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contactTf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nicTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void okBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okBtnMouseEntered
        okBtn.setBackground(new Color(33, 42, 62));
        okBtn.setForeground(new Color(247,251,255));
        
    }//GEN-LAST:event_okBtnMouseEntered

    private void okBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okBtnMouseExited
        okBtn.setBackground(new Color(57,72,103));
        okBtn.setForeground(new Color(155,164,181));
    }//GEN-LAST:event_okBtnMouseExited

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_okBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public void showCustomerDetailsUI(String name,String nic,String contactNo) {
        this.setVisible(true);
        
        nameTf.setText(String.valueOf(name));
        nicTf.setText(String.valueOf(nic));
        contactTf.setText(String.valueOf(contactNo));
        
        
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
            java.util.logging.Logger.getLogger(CustomerDetailsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PaymentUI().setVisible(true);
//            }
//        });
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CustomerDetailsUI().setVisible(true);
//            }
//        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private textfield.TextField contactTf;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private textfield.TextField nameTf;
    private textfield.TextField nicTf;
    private javax.swing.JButton okBtn;
    // End of variables declaration//GEN-END:variables
}
