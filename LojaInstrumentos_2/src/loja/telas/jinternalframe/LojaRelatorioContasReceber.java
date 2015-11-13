
package loja.telas.jinternalframe;
import loja.botoes.LojaBotoes;

public class LojaRelatorioContasReceber extends javax.swing.JInternalFrame {

    /**
     * Creates new form LojaRelatorioContasReceber
     */
    public LojaRelatorioContasReceber() {
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

        PainelRelatorioContasReceber = new javax.swing.JPanel();
        SPRelatorio = new javax.swing.JScrollPane();
        TabelaRelatorio = new javax.swing.JTable();
        PainelBotoes = new javax.swing.JPanel();
        BotaoOK = new javax.swing.JButton();
        BotaoCancelar = new javax.swing.JButton();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("loja/telas/jinternalframe/Bundle"); // NOI18N
        PainelRelatorioContasReceber.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("LojaRelatorioContasReceber.PainelRelatorioContasReceber.border.title"))); // NOI18N

        TabelaRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Sobrenome", "Data de compra", "Data para Receber", "Valor Total"
            }
        ));
        SPRelatorio.setViewportView(TabelaRelatorio);
        if (TabelaRelatorio.getColumnModel().getColumnCount() > 0) {
            TabelaRelatorio.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("LojaRelatorioContasReceber.TabelaRelatorio.columnModel.title0")); // NOI18N
            TabelaRelatorio.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("LojaRelatorioContasReceber.TabelaRelatorio.columnModel.title1")); // NOI18N
            TabelaRelatorio.getColumnModel().getColumn(2).setHeaderValue(bundle.getString("LojaRelatorioContasReceber.TabelaRelatorio.columnModel.title2")); // NOI18N
            TabelaRelatorio.getColumnModel().getColumn(3).setHeaderValue(bundle.getString("LojaRelatorioContasReceber.TabelaRelatorio.columnModel.title3")); // NOI18N
            TabelaRelatorio.getColumnModel().getColumn(4).setHeaderValue(bundle.getString("LojaRelatorioContasReceber.TabelaRelatorio.columnModel.title4")); // NOI18N
            TabelaRelatorio.getColumnModel().getColumn(5).setHeaderValue(bundle.getString("LojaRelatorioContasReceber.TabelaRelatorio.columnModel.title5")); // NOI18N
        }

        BotaoOK.setText(bundle.getString("LojaRelatorioContasReceber.BotaoOK.text")); // NOI18N
        BotaoOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoOKActionPerformed(evt);
            }
        });

        BotaoCancelar.setText(bundle.getString("LojaRelatorioContasReceber.BotaoCancelar.text")); // NOI18N
        BotaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelBotoesLayout = new javax.swing.GroupLayout(PainelBotoes);
        PainelBotoes.setLayout(PainelBotoesLayout);
        PainelBotoesLayout.setHorizontalGroup(
            PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBotoesLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(BotaoOK, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(BotaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        PainelBotoesLayout.setVerticalGroup(
            PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelBotoesLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoOK)
                    .addComponent(BotaoCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout PainelRelatorioContasReceberLayout = new javax.swing.GroupLayout(PainelRelatorioContasReceber);
        PainelRelatorioContasReceber.setLayout(PainelRelatorioContasReceberLayout);
        PainelRelatorioContasReceberLayout.setHorizontalGroup(
            PainelRelatorioContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRelatorioContasReceberLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SPRelatorio)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelRelatorioContasReceberLayout.createSequentialGroup()
                .addContainerGap(231, Short.MAX_VALUE)
                .addComponent(PainelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226))
        );
        PainelRelatorioContasReceberLayout.setVerticalGroup(
            PainelRelatorioContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRelatorioContasReceberLayout.createSequentialGroup()
                .addComponent(SPRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PainelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelRelatorioContasReceber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelRelatorioContasReceber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoOKActionPerformed
        // TODO add your handling code here:
        LojaBotoes LB = new LojaBotoes();
        LB.OK();
    }//GEN-LAST:event_BotaoOKActionPerformed

    private void BotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarActionPerformed
        // TODO add your handling code here:
        LojaBotoes LB = new LojaBotoes();
        LB.Cancelar();
    }//GEN-LAST:event_BotaoCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoOK;
    private javax.swing.JPanel PainelBotoes;
    private javax.swing.JPanel PainelRelatorioContasReceber;
    private javax.swing.JScrollPane SPRelatorio;
    private javax.swing.JTable TabelaRelatorio;
    // End of variables declaration//GEN-END:variables
}
