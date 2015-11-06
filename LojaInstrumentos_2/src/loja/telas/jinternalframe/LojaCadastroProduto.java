
package loja.telas.jinternalframe;


public class LojaCadastroProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form LojaCadastroProduto
     */
    public LojaCadastroProduto() {
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

        PainelCadastroProdutos = new javax.swing.JPanel();
        PainelBotoes = new javax.swing.JPanel();
        BotaoNovo = new javax.swing.JButton();
        BotaoGravar = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();
        BotaoCancelar = new javax.swing.JButton();
        PainelCamposdados1 = new javax.swing.JPanel();
        TXTCodigo = new javax.swing.JTextField();
        TXTNome = new javax.swing.JTextField();
        TXTMarca = new javax.swing.JTextField();
        TXTModelo = new javax.swing.JTextField();
        PainelCamposdados2 = new javax.swing.JPanel();
        LDataCompra = new javax.swing.JLabel();
        LValorCusto = new javax.swing.JLabel();
        LValorUnitario = new javax.swing.JLabel();
        LQuantidade = new javax.swing.JLabel();
        TXTDataCompra = new javax.swing.JTextField();
        TXTValorCusto = new javax.swing.JTextField();
        TXTValorUnitario = new javax.swing.JTextField();
        TXTQuantidade = new javax.swing.JSpinner();
        LCodigo = new javax.swing.JLabel();
        LNome = new javax.swing.JLabel();
        LMarca = new javax.swing.JLabel();
        LModelo = new javax.swing.JLabel();
        LDescricao = new javax.swing.JLabel();
        PTXTDescricao = new javax.swing.JScrollPane();
        TXTDescricao = new javax.swing.JTextArea();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("loja/telas/jinternalframe/Bundle"); // NOI18N
        PainelCadastroProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("LojaCadastroProduto.PainelCadastroProdutos.border.title"))); // NOI18N

        BotaoNovo.setText(bundle.getString("LojaCadastroProduto.BotaoNovo.text")); // NOI18N

        BotaoGravar.setText(bundle.getString("LojaCadastroProduto.BotaoGravar.text")); // NOI18N

        BotaoExcluir.setText(bundle.getString("LojaCadastroProduto.BotaoExcluir.text")); // NOI18N

        BotaoCancelar.setText(bundle.getString("LojaCadastroProduto.BotaoCancelar.text")); // NOI18N

        javax.swing.GroupLayout PainelBotoesLayout = new javax.swing.GroupLayout(PainelBotoes);
        PainelBotoes.setLayout(PainelBotoesLayout);
        PainelBotoesLayout.setHorizontalGroup(
            PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBotoesLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(BotaoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(BotaoGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(BotaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(BotaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        PainelBotoesLayout.setVerticalGroup(
            PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoNovo)
                    .addComponent(BotaoGravar)
                    .addComponent(BotaoExcluir)
                    .addComponent(BotaoCancelar))
                .addContainerGap())
        );

        TXTCodigo.setText(bundle.getString("LojaCadastroProduto.TXTCodigo.text")); // NOI18N
        TXTCodigo.setEnabled(false);

        TXTNome.setText(bundle.getString("LojaCadastroProduto.TXTNome.text")); // NOI18N
        TXTNome.setEnabled(false);

        TXTMarca.setText(bundle.getString("LojaCadastroProduto.TXTMarca.text")); // NOI18N
        TXTMarca.setEnabled(false);

        TXTModelo.setText(bundle.getString("LojaCadastroProduto.TXTModelo.text")); // NOI18N
        TXTModelo.setEnabled(false);

        javax.swing.GroupLayout PainelCamposdados1Layout = new javax.swing.GroupLayout(PainelCamposdados1);
        PainelCamposdados1.setLayout(PainelCamposdados1Layout);
        PainelCamposdados1Layout.setHorizontalGroup(
            PainelCamposdados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCamposdados1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelCamposdados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TXTCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(TXTNome)
                    .addComponent(TXTMarca)
                    .addComponent(TXTModelo))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        PainelCamposdados1Layout.setVerticalGroup(
            PainelCamposdados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCamposdados1Layout.createSequentialGroup()
                .addComponent(TXTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        LDataCompra.setText(bundle.getString("LojaCadastroProduto.LDataCompra.text")); // NOI18N

        LValorCusto.setText(bundle.getString("LojaCadastroProduto.LValorCusto.text")); // NOI18N

        LValorUnitario.setText(bundle.getString("LojaCadastroProduto.LValorUnitario.text")); // NOI18N

        LQuantidade.setText(bundle.getString("LojaCadastroProduto.LQuantidade.text")); // NOI18N

        TXTDataCompra.setText(bundle.getString("LojaCadastroProduto.TXTDataCompra.text")); // NOI18N
        TXTDataCompra.setEnabled(false);

        TXTValorCusto.setText(bundle.getString("LojaCadastroProduto.TXTValorCusto.text")); // NOI18N
        TXTValorCusto.setEnabled(false);

        TXTValorUnitario.setText(bundle.getString("LojaCadastroProduto.TXTValorUnitario.text")); // NOI18N
        TXTValorUnitario.setEnabled(false);

        TXTQuantidade.setEnabled(false);

        javax.swing.GroupLayout PainelCamposdados2Layout = new javax.swing.GroupLayout(PainelCamposdados2);
        PainelCamposdados2.setLayout(PainelCamposdados2Layout);
        PainelCamposdados2Layout.setHorizontalGroup(
            PainelCamposdados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCamposdados2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelCamposdados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelCamposdados2Layout.createSequentialGroup()
                        .addComponent(LDataCompra)
                        .addGap(40, 40, 40)
                        .addComponent(TXTDataCompra))
                    .addGroup(PainelCamposdados2Layout.createSequentialGroup()
                        .addGroup(PainelCamposdados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LValorCusto)
                            .addComponent(LValorUnitario)
                            .addComponent(LQuantidade))
                        .addGap(40, 40, 40)
                        .addGroup(PainelCamposdados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TXTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTValorUnitario, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(TXTValorCusto))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelCamposdados2Layout.setVerticalGroup(
            PainelCamposdados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCamposdados2Layout.createSequentialGroup()
                .addGroup(PainelCamposdados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LDataCompra)
                    .addComponent(TXTDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelCamposdados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTValorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LValorCusto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelCamposdados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LValorUnitario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelCamposdados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LQuantidade)
                    .addComponent(TXTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        LCodigo.setText(bundle.getString("LojaCadastroProduto.LCodigo.text")); // NOI18N

        LNome.setText(bundle.getString("LojaCadastroProduto.LNome.text")); // NOI18N

        LMarca.setText(bundle.getString("LojaCadastroProduto.LMarca.text")); // NOI18N

        LModelo.setText(bundle.getString("LojaCadastroProduto.LModelo.text")); // NOI18N

        LDescricao.setText(bundle.getString("LojaCadastroProduto.LDescricao.text")); // NOI18N

        TXTDescricao.setColumns(20);
        TXTDescricao.setRows(5);
        TXTDescricao.setEnabled(false);
        PTXTDescricao.setViewportView(TXTDescricao);

        javax.swing.GroupLayout PainelCadastroProdutosLayout = new javax.swing.GroupLayout(PainelCadastroProdutos);
        PainelCadastroProdutos.setLayout(PainelCadastroProdutosLayout);
        PainelCadastroProdutosLayout.setHorizontalGroup(
            PainelCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCadastroProdutosLayout.createSequentialGroup()
                        .addComponent(PainelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PainelCadastroProdutosLayout.createSequentialGroup()
                        .addGroup(PainelCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PTXTDescricao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelCadastroProdutosLayout.createSequentialGroup()
                                .addGroup(PainelCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PainelCadastroProdutosLayout.createSequentialGroup()
                                        .addComponent(LDescricao)
                                        .addGap(227, 227, 227))
                                    .addGroup(PainelCadastroProdutosLayout.createSequentialGroup()
                                        .addGroup(PainelCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LCodigo)
                                            .addComponent(LNome)
                                            .addComponent(LMarca)
                                            .addComponent(LModelo))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(PainelCamposdados1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PainelCamposdados2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(53, 53, 53))))
        );
        PainelCadastroProdutosLayout.setVerticalGroup(
            PainelCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCadastroProdutosLayout.createSequentialGroup()
                .addGroup(PainelCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelCadastroProdutosLayout.createSequentialGroup()
                        .addComponent(LCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LDescricao))
                    .addComponent(PainelCamposdados2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PainelCamposdados1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PTXTDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PainelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelCadastroProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelCadastroProdutos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotaoGravar;
    private javax.swing.JButton BotaoNovo;
    private javax.swing.JLabel LCodigo;
    private javax.swing.JLabel LDataCompra;
    private javax.swing.JLabel LDescricao;
    private javax.swing.JLabel LMarca;
    private javax.swing.JLabel LModelo;
    private javax.swing.JLabel LNome;
    private javax.swing.JLabel LQuantidade;
    private javax.swing.JLabel LValorCusto;
    private javax.swing.JLabel LValorUnitario;
    private javax.swing.JScrollPane PTXTDescricao;
    private javax.swing.JPanel PainelBotoes;
    private javax.swing.JPanel PainelCadastroProdutos;
    private javax.swing.JPanel PainelCamposdados1;
    private javax.swing.JPanel PainelCamposdados2;
    private javax.swing.JTextField TXTCodigo;
    private javax.swing.JTextField TXTDataCompra;
    private javax.swing.JTextArea TXTDescricao;
    private javax.swing.JTextField TXTMarca;
    private javax.swing.JTextField TXTModelo;
    private javax.swing.JTextField TXTNome;
    private javax.swing.JSpinner TXTQuantidade;
    private javax.swing.JTextField TXTValorCusto;
    private javax.swing.JTextField TXTValorUnitario;
    // End of variables declaration//GEN-END:variables
}
