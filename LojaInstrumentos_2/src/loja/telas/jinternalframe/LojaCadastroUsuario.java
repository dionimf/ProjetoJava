
package loja.telas.jinternalframe;


public class LojaCadastroUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form LojaCadastroUsuario
     */
    public LojaCadastroUsuario() {
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

        PainelCadastroUsuario = new javax.swing.JPanel();
        PainelDados = new javax.swing.JPanel();
        LNome = new javax.swing.JLabel();
        LSenha = new javax.swing.JLabel();
        LRSenha = new javax.swing.JLabel();
        TXTUsuario = new javax.swing.JTextField();
        TXTSenha = new javax.swing.JPasswordField();
        TXTRSenha = new javax.swing.JPasswordField();
        PainelBotoes = new javax.swing.JPanel();
        BotaoNovo = new javax.swing.JButton();
        BotaoGravar = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("loja/telas/jinternalframe/Bundle"); // NOI18N
        PainelCadastroUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("LojaCadastroUsuario.PainelCadastroUsuario.border.title"))); // NOI18N

        LNome.setText(bundle.getString("LojaCadastroUsuario.LNome.text")); // NOI18N

        LSenha.setText(bundle.getString("LojaCadastroUsuario.LSenha.text")); // NOI18N

        LRSenha.setText(bundle.getString("LojaCadastroUsuario.LRSenha.text")); // NOI18N

        TXTUsuario.setText(bundle.getString("LojaCadastroUsuario.TXTUsuario.text")); // NOI18N
        TXTUsuario.setEnabled(false);

        TXTSenha.setText(bundle.getString("LojaCadastroUsuario.TXTSenha.text")); // NOI18N
        TXTSenha.setEnabled(false);

        TXTRSenha.setText(bundle.getString("LojaCadastroUsuario.TXTRSenha.text")); // NOI18N
        TXTRSenha.setEnabled(false);

        javax.swing.GroupLayout PainelDadosLayout = new javax.swing.GroupLayout(PainelDados);
        PainelDados.setLayout(PainelDadosLayout);
        PainelDadosLayout.setHorizontalGroup(
            PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDadosLayout.createSequentialGroup()
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LNome)
                    .addComponent(LSenha)
                    .addComponent(LRSenha))
                .addGap(18, 18, 18)
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TXTUsuario)
                    .addComponent(TXTSenha)
                    .addComponent(TXTRSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGap(0, 44, Short.MAX_VALUE))
        );
        PainelDadosLayout.setVerticalGroup(
            PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDadosLayout.createSequentialGroup()
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelDadosLayout.createSequentialGroup()
                        .addComponent(LNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LRSenha))
                    .addGroup(PainelDadosLayout.createSequentialGroup()
                        .addComponent(TXTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTRSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelCadastroUsuarioLayout = new javax.swing.GroupLayout(PainelCadastroUsuario);
        PainelCadastroUsuario.setLayout(PainelCadastroUsuarioLayout);
        PainelCadastroUsuarioLayout.setHorizontalGroup(
            PainelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PainelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PainelCadastroUsuarioLayout.setVerticalGroup(
            PainelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PainelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BotaoNovo.setText(bundle.getString("LojaCadastroUsuario.BotaoNovo.text")); // NOI18N

        BotaoGravar.setText(bundle.getString("LojaCadastroUsuario.BotaoGravar.text")); // NOI18N

        BotaoExcluir.setText(bundle.getString("LojaCadastroUsuario.BotaoExcluir.text")); // NOI18N

        javax.swing.GroupLayout PainelBotoesLayout = new javax.swing.GroupLayout(PainelBotoes);
        PainelBotoes.setLayout(PainelBotoesLayout);
        PainelBotoesLayout.setHorizontalGroup(
            PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBotoesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(BotaoNovo)
                .addGap(35, 35, 35)
                .addComponent(BotaoGravar)
                .addGap(35, 35, 35)
                .addComponent(BotaoExcluir)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PainelBotoesLayout.setVerticalGroup(
            PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBotoesLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoNovo)
                    .addComponent(BotaoGravar)
                    .addComponent(BotaoExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PainelCadastroUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotaoGravar;
    private javax.swing.JButton BotaoNovo;
    private javax.swing.JLabel LNome;
    private javax.swing.JLabel LRSenha;
    private javax.swing.JLabel LSenha;
    private javax.swing.JPanel PainelBotoes;
    private javax.swing.JPanel PainelCadastroUsuario;
    private javax.swing.JPanel PainelDados;
    private javax.swing.JPasswordField TXTRSenha;
    private javax.swing.JPasswordField TXTSenha;
    private javax.swing.JTextField TXTUsuario;
    // End of variables declaration//GEN-END:variables
}
