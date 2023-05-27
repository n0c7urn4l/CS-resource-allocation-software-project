/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package resourceallocationsoftware.ViewClasses;

import java.awt.Color;

/**
 *
 * @author shanu
 */
public class PeriodicUI extends javax.swing.JFrame {

    /**
     * Creates new form PeriodicUI
     */
    public PeriodicUI() {
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

        startingDateChooser = new com.raven.datechooser.DateChooser();
        endDateChooser = new com.raven.datechooser.DateChooser();
        jPanel1 = new RoundPanel(30, 30, 30, 30);
        jPanel2 = new RoundPanel(20, 20, 20, 20);
        startingDateTf = new textfield.TextField();
        bookingSearchBtn = new javax.swing.JButton();
        bookingSearchBtn1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        endDateTf = new textfield.TextField();

        startingDateChooser.setBackground(new java.awt.Color(247, 251, 255));
        startingDateChooser.setForeground(new java.awt.Color(57, 72, 103));
        startingDateChooser.setDateFormat("dd-MMMM-yyyy");
        startingDateChooser.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        startingDateChooser.setTextRefernce(startingDateTf);

        endDateChooser.setBackground(new java.awt.Color(247, 251, 255));
        endDateChooser.setForeground(new java.awt.Color(57, 72, 103));
        endDateChooser.setDateFormat("dd-MMMM-yyyy");
        endDateChooser.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        endDateChooser.setTextRefernce(endDateTf);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(352, 269));

        jPanel1.setBackground(new java.awt.Color(57, 72, 103));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 15));

        jPanel2.setBackground(new java.awt.Color(247, 251, 255));
        jPanel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(322, 239));

        startingDateTf.setForeground(new java.awt.Color(155, 164, 181));
        startingDateTf.setCaretColor(new java.awt.Color(155, 164, 181));
        startingDateTf.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        startingDateTf.setLabelText("Starting Date");
        startingDateTf.setLineColor(new java.awt.Color(57, 72, 103));
        startingDateTf.setSelectionColor(new java.awt.Color(57, 72, 103));

        bookingSearchBtn.setBackground(new java.awt.Color(57, 72, 103));
        bookingSearchBtn.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        bookingSearchBtn.setForeground(new java.awt.Color(155, 164, 181));
        bookingSearchBtn.setText("Ok");
        bookingSearchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookingSearchBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bookingSearchBtnMouseExited(evt);
            }
        });
        bookingSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingSearchBtnActionPerformed(evt);
            }
        });

        bookingSearchBtn1.setBackground(new java.awt.Color(57, 72, 103));
        bookingSearchBtn1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        bookingSearchBtn1.setForeground(new java.awt.Color(155, 164, 181));
        bookingSearchBtn1.setText("Cancel");
        bookingSearchBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookingSearchBtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bookingSearchBtn1MouseExited(evt);
            }
        });
        bookingSearchBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingSearchBtn1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(57, 72, 103));
        jLabel12.setText("Select Date");
        jLabel12.setPreferredSize(new java.awt.Dimension(70, 18));

        endDateTf.setForeground(new java.awt.Color(155, 164, 181));
        endDateTf.setCaretColor(new java.awt.Color(155, 164, 181));
        endDateTf.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        endDateTf.setLabelText("End Date");
        endDateTf.setLineColor(new java.awt.Color(57, 72, 103));
        endDateTf.setSelectionColor(new java.awt.Color(57, 72, 103));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(startingDateTf, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(bookingSearchBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bookingSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(endDateTf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(startingDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookingSearchBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookingSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bookingSearchBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingSearchBtnMouseEntered
        bookingSearchBtn.setBackground(new Color(33, 42, 62));
        bookingSearchBtn.setForeground(new Color(247,251,255));
    }//GEN-LAST:event_bookingSearchBtnMouseEntered

    private void bookingSearchBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingSearchBtnMouseExited
        bookingSearchBtn.setBackground(new Color(57,72,103));
        bookingSearchBtn.setForeground(new Color(155,164,181));
    }//GEN-LAST:event_bookingSearchBtnMouseExited

    private void bookingSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingSearchBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingSearchBtnActionPerformed

    private void bookingSearchBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingSearchBtn1MouseEntered
        bookingSearchBtn1.setBackground(new Color(33, 42, 62));
        bookingSearchBtn1.setForeground(new Color(247,251,255));
    }//GEN-LAST:event_bookingSearchBtn1MouseEntered

    private void bookingSearchBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingSearchBtn1MouseExited
        bookingSearchBtn1.setBackground(new Color(57,72,103));
        bookingSearchBtn1.setForeground(new Color(155,164,181));
    }//GEN-LAST:event_bookingSearchBtn1MouseExited

    private void bookingSearchBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingSearchBtn1ActionPerformed
        this.dispose();

    }//GEN-LAST:event_bookingSearchBtn1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void showPeriodicUI() {
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
            java.util.logging.Logger.getLogger(PeriodicUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeriodicUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeriodicUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeriodicUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeriodicUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookingSearchBtn;
    private javax.swing.JButton bookingSearchBtn1;
    private com.raven.datechooser.DateChooser endDateChooser;
    private textfield.TextField endDateTf;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.raven.datechooser.DateChooser startingDateChooser;
    private textfield.TextField startingDateTf;
    // End of variables declaration//GEN-END:variables
}