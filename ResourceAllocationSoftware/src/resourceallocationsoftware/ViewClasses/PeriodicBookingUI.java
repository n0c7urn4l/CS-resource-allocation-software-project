/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package resourceallocationsoftware.ViewClasses;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author shanu
 */
public class PeriodicBookingUI extends javax.swing.JFrame {

    /**
     * Creates new form PeriodicBookingUI
     */
    public PeriodicBookingUI() {
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
        jPanel3 = new RoundPanel(20, 20, 20, 20);
        jPanel14 = new RoundPanel(10, 10, 10, 10);
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        loginIdTextField6 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new RoundPanel(20, 20, 20, 20);
        jPanel15 = new RoundPanel(10, 10, 10, 10);
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        loginIdTextField7 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(497, 284));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(57, 72, 103));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        jPanel2.setBackground(new java.awt.Color(247, 251, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(452, 254));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 4, 4));

        jPanel14.setBackground(new java.awt.Color(247, 251, 255));
        jPanel14.setPreferredSize(new java.awt.Dimension(203, 178));

        jLabel18.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(155, 164, 181));
        jLabel18.setText("Day");
        jLabel18.setPreferredSize(new java.awt.Dimension(70, 18));

        jLabel19.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(155, 164, 181));
        jLabel19.setText("Month");
        jLabel19.setPreferredSize(new java.awt.Dimension(70, 18));

        jLabel20.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(155, 164, 181));
        jLabel20.setText("Year");
        jLabel20.setPreferredSize(new java.awt.Dimension(70, 18));

        jLabel21.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(155, 164, 181));
        jLabel21.setText("Date");
        jLabel21.setPreferredSize(new java.awt.Dimension(70, 18));

        loginIdTextField6.setEditable(false);
        loginIdTextField6.setBackground(new java.awt.Color(255, 255, 255));
        loginIdTextField6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        loginIdTextField6.setForeground(new java.awt.Color(67, 67, 67));
        loginIdTextField6.setToolTipText("");
        loginIdTextField6.setActionCommand("<Not Set>");
        loginIdTextField6.setBorder(null);
        loginIdTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginIdTextField6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginIdTextField6FocusLost(evt);
            }
        });
        loginIdTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginIdTextField6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginIdTextField6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginIdTextField6MouseExited(evt);
            }
        });
        loginIdTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginIdTextField6ActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(57, 72, 103));
        jSeparator2.setForeground(new java.awt.Color(57, 72, 103));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginIdTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(loginIdTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanel3.add(jPanel14);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 4, 4));

        jPanel15.setBackground(new java.awt.Color(247, 251, 255));
        jPanel15.setPreferredSize(new java.awt.Dimension(203, 178));

        jLabel22.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(155, 164, 181));
        jLabel22.setText("Day");
        jLabel22.setPreferredSize(new java.awt.Dimension(70, 18));

        jLabel23.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(155, 164, 181));
        jLabel23.setText("Month");
        jLabel23.setPreferredSize(new java.awt.Dimension(70, 18));

        jLabel24.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(155, 164, 181));
        jLabel24.setText("Year");
        jLabel24.setPreferredSize(new java.awt.Dimension(70, 18));

        jLabel25.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(155, 164, 181));
        jLabel25.setText("Date");
        jLabel25.setPreferredSize(new java.awt.Dimension(70, 18));

        loginIdTextField7.setEditable(false);
        loginIdTextField7.setBackground(new java.awt.Color(255, 255, 255));
        loginIdTextField7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        loginIdTextField7.setForeground(new java.awt.Color(67, 67, 67));
        loginIdTextField7.setToolTipText("");
        loginIdTextField7.setActionCommand("<Not Set>");
        loginIdTextField7.setBorder(null);
        loginIdTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginIdTextField7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginIdTextField7FocusLost(evt);
            }
        });
        loginIdTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginIdTextField7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginIdTextField7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginIdTextField7MouseExited(evt);
            }
        });
        loginIdTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginIdTextField7ActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(57, 72, 103));
        jSeparator3.setForeground(new java.awt.Color(57, 72, 103));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginIdTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(loginIdTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanel4.add(jPanel15);

        jLabel26.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(57, 72, 103));
        jLabel26.setText("Ending Date");
        jLabel26.setPreferredSize(new java.awt.Dimension(70, 18));

        jLabel27.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(57, 72, 103));
        jLabel27.setText("Starting Date");
        jLabel27.setPreferredSize(new java.awt.Dimension(70, 18));

        jButton1.setBackground(new java.awt.Color(57, 72, 103));
        jButton1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(155, 164, 181));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(57, 72, 103));
        jButton2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(155, 164, 181));
        jButton2.setText("Ok");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(11, 11, 11))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void combobox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox2ActionPerformed

    private void combobox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox3ActionPerformed

    private void combobox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox4ActionPerformed

    private void loginIdTextField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginIdTextField6FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_loginIdTextField6FocusGained

    private void loginIdTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginIdTextField6FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_loginIdTextField6FocusLost

    private void loginIdTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginIdTextField6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginIdTextField6MouseClicked

    private void loginIdTextField6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginIdTextField6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_loginIdTextField6MouseEntered

    private void loginIdTextField6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginIdTextField6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_loginIdTextField6MouseExited

    private void loginIdTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginIdTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginIdTextField6ActionPerformed

    private void combobox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox5ActionPerformed

    private void combobox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox6ActionPerformed

    private void combobox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox7ActionPerformed

    private void loginIdTextField7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginIdTextField7FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_loginIdTextField7FocusGained

    private void loginIdTextField7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginIdTextField7FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_loginIdTextField7FocusLost

    private void loginIdTextField7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginIdTextField7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginIdTextField7MouseClicked

    private void loginIdTextField7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginIdTextField7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_loginIdTextField7MouseEntered

    private void loginIdTextField7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginIdTextField7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_loginIdTextField7MouseExited

    private void loginIdTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginIdTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginIdTextField7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PeriodicBookingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeriodicBookingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeriodicBookingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeriodicBookingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeriodicBookingUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField loginIdTextField6;
    private javax.swing.JTextField loginIdTextField7;
    // End of variables declaration//GEN-END:variables
}