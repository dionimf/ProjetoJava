/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author comp1
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        JDP_principal = new javax.swing.JDesktopPane();
        JIF1 = new javax.swing.JInternalFrame();
        jButton1 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        JIF3 = new javax.swing.JInternalFrame();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        JIF4 = new javax.swing.JInternalFrame();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        JIF5 = new javax.swing.JInternalFrame();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        JIF2 = new javax.swing.JInternalFrame();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jMenuBar_TOP = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loja De Instrumentos");
        setPreferredSize(new java.awt.Dimension(1280, 720));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, JDP_principal, org.jdesktop.beansbinding.ELProperty.create("${maximumSize}"), this, org.jdesktop.beansbinding.BeanProperty.create("minimumSize"));
        bindingGroup.addBinding(binding);

        getContentPane().setLayout(null);

        JDP_principal.setBackground(new java.awt.Color(255, 255, 255));
        JDP_principal.setPreferredSize(new java.awt.Dimension(1920, 1080));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, JIF1, org.jdesktop.beansbinding.ELProperty.create("${maximumSize}"), JDP_principal, org.jdesktop.beansbinding.BeanProperty.create("maximumSize"));
        bindingGroup.addBinding(binding);

        JIF1.setVisible(true);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, JIF1, org.jdesktop.beansbinding.ELProperty.create("${maximumSize}"), JIF1, org.jdesktop.beansbinding.BeanProperty.create("minimumSize"));
        bindingGroup.addBinding(binding);

        JIF1.getContentPane().setLayout(null);

        jButton1.setText("OK");
        JIF1.getContentPane().add(jButton1);
        jButton1.setBounds(140, 30, 90, 23);

        jButton10.setText("Cancelar");
        JIF1.getContentPane().add(jButton10);
        jButton10.setBounds(40, 30, 90, 23);

        JDP_principal.add(JIF1);
        JIF1.setBounds(20, 90, 340, 150);

        JIF3.setVisible(true);
        JIF3.getContentPane().setLayout(null);

        jButton2.setText("OK");
        JIF3.getContentPane().add(jButton2);
        jButton2.setBounds(140, 40, 80, 23);

        jButton9.setText("Cancelar");
        JIF3.getContentPane().add(jButton9);
        jButton9.setBounds(50, 40, 75, 23);

        JDP_principal.add(JIF3);
        JIF3.setBounds(20, 250, 340, 140);

        JIF4.setVisible(true);
        JIF4.getContentPane().setLayout(null);

        jButton3.setText("Cancelar");
        JIF4.getContentPane().add(jButton3);
        jButton3.setBounds(160, 40, 80, 23);

        jButton8.setText("OK");
        JIF4.getContentPane().add(jButton8);
        jButton8.setBounds(60, 40, 80, 20);

        JDP_principal.add(JIF4);
        JIF4.setBounds(380, 250, 340, 140);

        JIF5.setVisible(true);
        JIF5.getContentPane().setLayout(null);

        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        JIF5.getContentPane().add(jButton4);
        jButton4.setBounds(160, 40, 80, 23);

        jButton7.setText("OK");
        JIF5.getContentPane().add(jButton7);
        jButton7.setBounds(60, 40, 80, 23);

        JDP_principal.add(JIF5);
        JIF5.setBounds(20, 410, 700, 160);

        JIF2.setVisible(true);
        JIF2.getContentPane().setLayout(null);

        jButton5.setText("Cancelar");
        JIF2.getContentPane().add(jButton5);
        jButton5.setBounds(160, 50, 90, 23);

        jButton6.setText("OK");
        JIF2.getContentPane().add(jButton6);
        jButton6.setBounds(50, 50, 90, 23);

        JDP_principal.add(JIF2);
        JIF2.setBounds(380, 90, 340, 150);

        getContentPane().add(JDP_principal);
        JDP_principal.setBounds(0, 0, 1920, 1080);

        jMenu1.setText("File");
        jMenuBar_TOP.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar_TOP.add(jMenu2);

        setJMenuBar(jMenuBar_TOP);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JDP_principal;
    private javax.swing.JInternalFrame JIF1;
    private javax.swing.JInternalFrame JIF2;
    private javax.swing.JInternalFrame JIF3;
    private javax.swing.JInternalFrame JIF4;
    private javax.swing.JInternalFrame JIF5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar_TOP;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
