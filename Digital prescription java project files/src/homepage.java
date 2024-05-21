/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rahat
 */
public class homepage extends javax.swing.JFrame {

    /**
     * Creates new form homepage
     */
    public homepage() {
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

        hotpack = new javax.swing.JLabel();
        classicpack = new javax.swing.JLabel();
        premiumpack = new javax.swing.JLabel();
        TIPF = new javax.swing.JLabel();
        customtrip = new javax.swing.JLabel();
        Settings = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hotpack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hotpackMousePressed(evt);
            }
        });
        getContentPane().add(hotpack, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 260, 270));

        classicpack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                classicpackMousePressed(evt);
            }
        });
        getContentPane().add(classicpack, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 270, 280));

        premiumpack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                premiumpackMousePressed(evt);
            }
        });
        getContentPane().add(premiumpack, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 170, 270, 280));

        TIPF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TIPFMousePressed(evt);
            }
        });
        getContentPane().add(TIPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, 270, 280));

        customtrip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                customtripMousePressed(evt);
            }
        });
        getContentPane().add(customtrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 550, 270, 270));

        Settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SettingsMousePressed(evt);
            }
        });
        getContentPane().add(Settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 540, 270, 280));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home page.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hotpackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hotpackMousePressed
        // TODO add your handling code here:
        setVisible(false);
        new hotpack().setVisible(true);
    }//GEN-LAST:event_hotpackMousePressed

    private void classicpackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classicpackMousePressed
        // TODO add your handling code here:
        setVisible(false);
        new clasicpack().setVisible(true);
    }//GEN-LAST:event_classicpackMousePressed

    private void premiumpackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_premiumpackMousePressed
        // TODO add your handling code here:
        setVisible(false);
        new premiumpack().setVisible(true);
    }//GEN-LAST:event_premiumpackMousePressed

    private void TIPFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TIPFMousePressed
        // TODO add your handling code here:
        setVisible(false);
        new TIF().setVisible(true);
    }//GEN-LAST:event_TIPFMousePressed

    private void customtripMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customtripMousePressed
        // TODO add your handling code here:
        setVisible(false);
        new custompack().setVisible(true);
    }//GEN-LAST:event_customtripMousePressed

    private void SettingsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMousePressed
        // TODO add your handling code here:
        setVisible(false);
        new settings().setVisible(true);
    }//GEN-LAST:event_SettingsMousePressed

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
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel Settings;
    private javax.swing.JLabel TIPF;
    private javax.swing.JLabel classicpack;
    private javax.swing.JLabel customtrip;
    private javax.swing.JLabel hotpack;
    private javax.swing.JLabel premiumpack;
    // End of variables declaration//GEN-END:variables
}