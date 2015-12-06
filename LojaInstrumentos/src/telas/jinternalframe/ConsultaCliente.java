
package telas.jinternalframe;
import listener.ConsultaClienteListener;
public class ConsultaCliente extends javax.swing.JInternalFrame {
    private ConsultaClienteListener listener = new ConsultaClienteListener(this);
    /**
     * Creates new form LojaConsultaCLiente
     */
    public ConsultaCliente() {
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

        PainelConsultaCliente = new javax.swing.JPanel();
        PainelBotoes = new javax.swing.JPanel();
        BotaoAlterar = new javax.swing.JButton();
        BotaoCancelar = new javax.swing.JButton();
        PainelDados = new javax.swing.JPanel();
        TXTNome = new javax.swing.JCheckBox();
        TXTSobrenome = new javax.swing.JCheckBox();
        TXTCodigo = new javax.swing.JCheckBox();
        TXTConsulta = new javax.swing.JTextField();
        BotaoConsulta = new javax.swing.JButton();
        TXTRG = new javax.swing.JCheckBox();
        TabelaResultado = new javax.swing.JScrollPane();
        ResultadoConsulta = new javax.swing.JTable();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("telas/jinternalframe/Bundle"); // NOI18N
        PainelConsultaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("ConsultaCliente.PainelConsultaCliente.border.title"))); // NOI18N

        BotaoAlterar.setText(bundle.getString("ConsultaCliente.BotaoAlterar.text")); // NOI18N
        BotaoAlterar.addActionListener(listener);
        BotaoAlterar.setActionCommand("alterar");
        BotaoCancelar.setText(bundle.getString("ConsultaCliente.BotaoCancelar.text")); // NOI18N
        BotaoCancelar.addActionListener(listener);
        BotaoCancelar.setActionCommand("cancelar");
        javax.swing.GroupLayout PainelBotoesLayout = new javax.swing.GroupLayout(PainelBotoes);
        PainelBotoes.setLayout(PainelBotoesLayout);
        PainelBotoesLayout.setHorizontalGroup(
            PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBotoesLayout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(BotaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(BotaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(348, Short.MAX_VALUE))
        );
        PainelBotoesLayout.setVerticalGroup(
            PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoAlterar)
                    .addComponent(BotaoCancelar))
                .addContainerGap())
        );

        TXTNome.setText(bundle.getString("ConsultaCliente.TXTNome.text")); // NOI18N

        TXTSobrenome.setText(bundle.getString("ConsultaCliente.TXTSobrenome.text")); // NOI18N

        TXTCodigo.setText(bundle.getString("ConsultaCliente.TXTCodigo.text")); // NOI18N

        TXTConsulta.setText(bundle.getString("ConsultaCliente.TXTConsulta.text")); // NOI18N

        BotaoConsulta.setText(bundle.getString("ConsultaCliente.BotaoConsulta.text")); // NOI18N
        BotaoConsulta.addActionListener(listener);
        BotaoConsulta.setActionCommand("consultar");
        TXTRG.setText(bundle.getString("ConsultaCliente.TXTRG.text")); // NOI18N

        javax.swing.GroupLayout PainelDadosLayout = new javax.swing.GroupLayout(PainelDados);
        PainelDados.setLayout(PainelDadosLayout);
        PainelDadosLayout.setHorizontalGroup(
            PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDadosLayout.createSequentialGroup()
                .addComponent(TXTCodigo)
                .addGap(18, 18, 18)
                .addComponent(TXTRG)
                .addGap(18, 18, 18)
                .addComponent(TXTNome)
                .addGap(18, 18, 18)
                .addComponent(TXTSobrenome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TXTConsulta)
                .addGap(18, 18, 18)
                .addComponent(BotaoConsulta)
                .addContainerGap())
        );
        PainelDadosLayout.setVerticalGroup(
            PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTNome)
                    .addComponent(TXTSobrenome)
                    .addComponent(TXTCodigo)
                    .addComponent(TXTConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoConsulta)
                    .addComponent(TXTRG))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ResultadoConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Sobrenome", "CPF", "RG", "Data Nascimento", "Telefone", "Celular", "Email", "Saldo"
            }
        ));
        TabelaResultado.setViewportView(ResultadoConsulta);
        if (ResultadoConsulta.getColumnModel().getColumnCount() > 0) {
            ResultadoConsulta.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("ConsultaCliente.ResultadoConsulta.columnModel.title0")); // NOI18N
            ResultadoConsulta.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("ConsultaCliente.ResultadoConsulta.columnModel.title1")); // NOI18N
            ResultadoConsulta.getColumnModel().getColumn(2).setHeaderValue(bundle.getString("ConsultaCliente.ResultadoConsulta.columnModel.title2")); // NOI18N
            ResultadoConsulta.getColumnModel().getColumn(3).setHeaderValue(bundle.getString("ConsultaCliente.ResultadoConsulta.columnModel.title3")); // NOI18N
            ResultadoConsulta.getColumnModel().getColumn(4).setHeaderValue(bundle.getString("ConsultaCliente.ResultadoConsulta.columnModel.title4")); // NOI18N
            ResultadoConsulta.getColumnModel().getColumn(5).setHeaderValue(bundle.getString("ConsultaCliente.ResultadoConsulta.columnModel.title5")); // NOI18N
            ResultadoConsulta.getColumnModel().getColumn(6).setHeaderValue(bundle.getString("ConsultaCliente.ResultadoConsulta.columnModel.title6")); // NOI18N
            ResultadoConsulta.getColumnModel().getColumn(7).setHeaderValue(bundle.getString("ConsultaCliente.ResultadoConsulta.columnModel.title7")); // NOI18N
            ResultadoConsulta.getColumnModel().getColumn(8).setHeaderValue(bundle.getString("ConsultaCliente.ResultadoConsulta.columnModel.title8")); // NOI18N
            ResultadoConsulta.getColumnModel().getColumn(9).setHeaderValue(bundle.getString("ConsultaCliente.ResultadoConsulta.columnModel.title9")); // NOI18N
        }

        javax.swing.GroupLayout PainelConsultaClienteLayout = new javax.swing.GroupLayout(PainelConsultaCliente);
        PainelConsultaCliente.setLayout(PainelConsultaClienteLayout);
        PainelConsultaClienteLayout.setHorizontalGroup(
            PainelConsultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelConsultaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelConsultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelDados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TabelaResultado))
                .addContainerGap())
        );
        PainelConsultaClienteLayout.setVerticalGroup(
            PainelConsultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelConsultaClienteLayout.createSequentialGroup()
                .addComponent(PainelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TabelaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PainelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelConsultaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelConsultaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAlterar;
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoConsulta;
    private javax.swing.JPanel PainelBotoes;
    private javax.swing.JPanel PainelConsultaCliente;
    private javax.swing.JPanel PainelDados;
    private javax.swing.JTable ResultadoConsulta;
    private javax.swing.JCheckBox TXTCodigo;
    private javax.swing.JTextField TXTConsulta;
    private javax.swing.JCheckBox TXTNome;
    private javax.swing.JCheckBox TXTRG;
    private javax.swing.JCheckBox TXTSobrenome;
    private javax.swing.JScrollPane TabelaResultado;
    // End of variables declaration//GEN-END:variables
}