/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.Color;
import java.awt.Toolkit;

/**
 *
 * @author UnknownAccount
 */
public class managerRegister extends javax.swing.JFrame {
    
    public void fixDesign() {
        Model.setOpaque(false);
        Model.setBackground(new Color(0, 0, 0, 0));
        
        Body.setOpaque(false);
        Body.setBackground(new Color(0, 0, 0, 0));
        
        Status.setOpaque(false);
        Status.setBackground(new Color(0, 0, 0, 0));
    }
    
    /**
     * Creates new form managerRegister
     */
    public managerRegister() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../media/toyota.png")));
        setLocationRelativeTo(null);
        fixDesign();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        ButtonBack = new javax.swing.JButton();
        Model = new javax.swing.JTextField();
        Body = new javax.swing.JTextField();
        Status = new javax.swing.JTextField();
        ButtonConfirm = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Toyota Manager Register");
        setResizable(false);

        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonBack.setBorder(null);
        ButtonBack.setBorderPainted(false);
        ButtonBack.setContentAreaFilled(false);
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });
        Panel.add(ButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 30, 30));

        Model.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Model.setForeground(new java.awt.Color(255, 255, 255));
        Model.setBorder(null);
        Panel.add(Model, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 250, 240, 33));

        Body.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Body.setForeground(new java.awt.Color(255, 255, 255));
        Body.setBorder(null);
        Panel.add(Body, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 332, 240, 33));

        Status.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Status.setForeground(new java.awt.Color(255, 255, 255));
        Status.setBorder(null);
        Panel.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 413, 240, 33));

        ButtonConfirm.setBorder(null);
        ButtonConfirm.setBorderPainted(false);
        ButtonConfirm.setContentAreaFilled(false);
        ButtonConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConfirmActionPerformed(evt);
            }
        });
        Panel.add(ButtonConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 270, 60));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/managerRegister.png"))); // NOI18N
        Panel.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        manager page = new manager();
        page.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonBackActionPerformed

    private void ButtonConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConfirmActionPerformed

    }//GEN-LAST:event_ButtonConfirmActionPerformed

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
            java.util.logging.Logger.getLogger(managerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managerRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JTextField Body;
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonConfirm;
    private javax.swing.JTextField Model;
    private javax.swing.JPanel Panel;
    private javax.swing.JTextField Status;
    // End of variables declaration//GEN-END:variables
}
