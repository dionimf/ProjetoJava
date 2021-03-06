
package telas.jinternalframe;
import listener.ClienteListener;

import cliente.Cliente;
import java.text.SimpleDateFormat;
        
public class CadastroCliente extends javax.swing.JInternalFrame {
    private ClienteListener listener = new ClienteListener(this);

    private Cliente cli = new Cliente();
    /**
     * Creates new form LojaCadastroCliente
     */
    public CadastroCliente() {
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

        PainelCADCliente = new javax.swing.JPanel();
        PainelInfCADCliente = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LDatanascimento = new javax.swing.JLabel();
        TXTDataNascimento = new javax.swing.JTextField();
        LEstadocivil = new javax.swing.JLabel();
        TXTRG = new javax.swing.JTextField();
        LRG = new javax.swing.JLabel();
        TXTEstadoCivil = new javax.swing.JComboBox();
        TXTCPF = new javax.swing.JTextField();
        LCPF = new javax.swing.JLabel();
        LSexo = new javax.swing.JLabel();
        TXTSexo = new javax.swing.JComboBox();
        TXTSobrenome = new javax.swing.JTextField();
        LSobrenome = new javax.swing.JLabel();
        LNome = new javax.swing.JLabel();
        TXTNome = new javax.swing.JTextField();
        PainelEndCADCliente = new javax.swing.JPanel();
        TXTtelefone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TXTEmail = new javax.swing.JTextField();
        TXTEndereco = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        TXTLogadouro = new javax.swing.JTextField();
        TXTCidade = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        TXTComplemento = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        TXTReferencia = new javax.swing.JTextField();
        TXTUF = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        TXTCEP = new javax.swing.JTextField();
        TXTNumero = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TXTBairro = new javax.swing.JTextField();
        TXTCelular = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        PainelBotoesCADCliente = new javax.swing.JPanel();
        JBGravar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("telas/jinternalframe/Bundle"); // NOI18N
        PainelCADCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("CadastroCliente.PainelCADCliente.border.title"))); // NOI18N

        PainelInfCADCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("CadastroCliente.PainelInfCADCliente.border.title"))); // NOI18N

        LDatanascimento.setText(bundle.getString("CadastroCliente.LDatanascimento.text")); // NOI18N

        TXTDataNascimento.setText(bundle.getString("CadastroCliente.TXTDataNascimento.text")); // NOI18N

        LEstadocivil.setText(bundle.getString("CadastroCliente.LEstadocivil.text")); // NOI18N

        TXTRG.setText(bundle.getString("CadastroCliente.TXTRG.text")); // NOI18N

        LRG.setText(bundle.getString("CadastroCliente.LRG.text")); // NOI18N

        TXTEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Solteiro(a)", "Casado(a)", "Divorciado(a)", "Viuvo(a)" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LDatanascimento)
                    .addComponent(LEstadocivil)
                    .addComponent(LRG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXTEstadoCivil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTRG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTDataNascimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LDatanascimento)
                    .addComponent(TXTDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LEstadocivil)
                    .addComponent(TXTEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LRG)
                    .addComponent(TXTRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TXTCPF.setText(bundle.getString("CadastroCliente.TXTCPF.text")); // NOI18N

        LCPF.setText(bundle.getString("CadastroCliente.LCPF.text")); // NOI18N

        LSexo.setText(bundle.getString("CadastroCliente.LSexo.text")); // NOI18N

        TXTSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));

        TXTSobrenome.setText(bundle.getString("CadastroCliente.TXTSobrenome.text")); // NOI18N

        LSobrenome.setText(bundle.getString("CadastroCliente.LSobrenome.text")); // NOI18N

        LNome.setText(bundle.getString("CadastroCliente.LNome.text")); // NOI18N

        TXTNome.setText(bundle.getString("CadastroCliente.TXTNome.text")); // NOI18N

        PainelEndCADCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("CadastroCliente.PainelEndCADCliente.border.title"))); // NOI18N

        jLabel8.setText(bundle.getString("CadastroCliente.jLabel8.text")); // NOI18N

        jLabel10.setText(bundle.getString("CadastroCliente.jLabel10.text")); // NOI18N

        jLabel11.setText(bundle.getString("CadastroCliente.jLabel11.text")); // NOI18N

        jLabel18.setText(bundle.getString("CadastroCliente.jLabel18.text")); // NOI18N

        jLabel14.setText(bundle.getString("CadastroCliente.jLabel14.text")); // NOI18N

        jLabel19.setText(bundle.getString("CadastroCliente.jLabel19.text")); // NOI18N

        jLabel20.setText(bundle.getString("CadastroCliente.jLabel20.text")); // NOI18N

        TXTUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernanbuco (PE)", "Piauí (PI)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins(TO)" }));

        jLabel15.setText(bundle.getString("CadastroCliente.jLabel15.text")); // NOI18N

        jLabel17.setText(bundle.getString("CadastroCliente.jLabel17.text")); // NOI18N

        jLabel13.setText(bundle.getString("CadastroCliente.jLabel13.text")); // NOI18N

        jLabel12.setText(bundle.getString("CadastroCliente.jLabel12.text")); // NOI18N

        jLabel9.setText(bundle.getString("CadastroCliente.jLabel9.text")); // NOI18N

        javax.swing.GroupLayout PainelEndCADClienteLayout = new javax.swing.GroupLayout(PainelEndCADCliente);
        PainelEndCADCliente.setLayout(PainelEndCADClienteLayout);
        PainelEndCADClienteLayout.setHorizontalGroup(
            PainelEndCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEndCADClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelEndCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PainelEndCADClienteLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXTComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelEndCADClienteLayout.createSequentialGroup()
                        .addGroup(PainelEndCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PainelEndCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTtelefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PainelEndCADClienteLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelEndCADClienteLayout.createSequentialGroup()
                        .addGroup(PainelEndCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(PainelEndCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelEndCADClienteLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(TXTEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelEndCADClienteLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TXTLogadouro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelEndCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel12)
                    .addComponent(jLabel20)
                    .addComponent(jLabel9))
                .addGap(84, 84, 84)
                .addGroup(PainelEndCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TXTCelular)
                    .addComponent(TXTUF, 0, 0, Short.MAX_VALUE)
                    .addComponent(TXTCEP)
                    .addComponent(TXTBairro)
                    .addComponent(TXTNumero)
                    .addComponent(TXTReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        PainelEndCADClienteLayout.setVerticalGroup(
            PainelEndCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEndCADClienteLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(PainelEndCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelEndCADClienteLayout.createSequentialGroup()
                        .addGroup(PainelEndCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(TXTtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelEndCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(TXTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelEndCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelEndCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelEndCADClienteLayout.createSequentialGroup()
                                .addGroup(PainelEndCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(TXTLogadouro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PainelEndCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PainelEndCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(TXTComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 24, Short.MAX_VALUE))
                            .addGroup(PainelEndCADClienteLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PainelEndCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXTReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(PainelEndCADClienteLayout.createSequentialGroup()
                        .addGroup(PainelEndCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PainelEndCADClienteLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addGap(73, 73, 73))
                            .addGroup(PainelEndCADClienteLayout.createSequentialGroup()
                                .addComponent(TXTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TXTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TXTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TXTCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TXTUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout PainelInfCADClienteLayout = new javax.swing.GroupLayout(PainelInfCADCliente);
        PainelInfCADCliente.setLayout(PainelInfCADClienteLayout);
        PainelInfCADClienteLayout.setHorizontalGroup(
            PainelInfCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelInfCADClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelInfCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelInfCADClienteLayout.createSequentialGroup()
                        .addComponent(LNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelInfCADClienteLayout.createSequentialGroup()
                        .addGroup(PainelInfCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LSobrenome)
                            .addComponent(LSexo)
                            .addComponent(LCPF))
                        .addGap(39, 39, 39)
                        .addGroup(PainelInfCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TXTCPF)
                            .addComponent(TXTSobrenome, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
            .addComponent(PainelEndCADCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PainelInfCADClienteLayout.setVerticalGroup(
            PainelInfCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelInfCADClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelInfCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelInfCADClienteLayout.createSequentialGroup()
                        .addGroup(PainelInfCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelInfCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LSobrenome)
                            .addComponent(TXTSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelInfCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LSexo)
                            .addComponent(TXTSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelInfCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LCPF)
                            .addComponent(TXTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PainelEndCADCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        JBGravar.setText(bundle.getString("CadastroCliente.JBGravar.text")); // NOI18N
        JBGravar.addActionListener(listener);
        JBGravar.setActionCommand("gravar");
        JBCancelar.setText(bundle.getString("CadastroCliente.JBCancelar.text")); // NOI18N
        JBCancelar.addActionListener(listener);
        JBCancelar.setActionCommand("cancelar");
        javax.swing.GroupLayout PainelBotoesCADClienteLayout = new javax.swing.GroupLayout(PainelBotoesCADCliente);
        PainelBotoesCADCliente.setLayout(PainelBotoesCADClienteLayout);
        PainelBotoesCADClienteLayout.setHorizontalGroup(
            PainelBotoesCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBotoesCADClienteLayout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(JBGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelBotoesCADClienteLayout.setVerticalGroup(
            PainelBotoesCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelBotoesCADClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelBotoesCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBGravar)
                    .addComponent(JBCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout PainelCADClienteLayout = new javax.swing.GroupLayout(PainelCADCliente);
        PainelCADCliente.setLayout(PainelCADClienteLayout);
        PainelCADClienteLayout.setHorizontalGroup(
            PainelCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCADClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PainelBotoesCADCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PainelInfCADCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelCADClienteLayout.setVerticalGroup(
            PainelCADClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCADClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelInfCADCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PainelBotoesCADCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelCADCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelCADCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBGravar;
    private javax.swing.JLabel LCPF;
    private javax.swing.JLabel LDatanascimento;
    private javax.swing.JLabel LEstadocivil;
    private javax.swing.JLabel LNome;
    private javax.swing.JLabel LRG;
    private javax.swing.JLabel LSexo;
    private javax.swing.JLabel LSobrenome;
    private javax.swing.JPanel PainelBotoesCADCliente;
    private javax.swing.JPanel PainelCADCliente;
    private javax.swing.JPanel PainelEndCADCliente;
    private javax.swing.JPanel PainelInfCADCliente;
    private javax.swing.JTextField TXTBairro;
    private javax.swing.JTextField TXTCEP;
    private javax.swing.JTextField TXTCPF;
    private javax.swing.JTextField TXTCelular;
    private javax.swing.JTextField TXTCidade;
    private javax.swing.JTextField TXTComplemento;
    private javax.swing.JTextField TXTDataNascimento;
    private javax.swing.JTextField TXTEmail;
    private javax.swing.JTextField TXTEndereco;
    private javax.swing.JComboBox TXTEstadoCivil;
    private javax.swing.JTextField TXTLogadouro;
    private javax.swing.JTextField TXTNome;
    private javax.swing.JTextField TXTNumero;
    private javax.swing.JTextField TXTRG;
    private javax.swing.JTextField TXTReferencia;
    private javax.swing.JComboBox TXTSexo;
    private javax.swing.JTextField TXTSobrenome;
    private javax.swing.JComboBox TXTUF;
    private javax.swing.JTextField TXTtelefone;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the TXTBairro
     */
    public javax.swing.JTextField getTXTBairro() {
        return TXTBairro;
    }

    /**
     * @param TXTBairro the TXTBairro to set
     */
    public void setTXTBairro(javax.swing.JTextField TXTBairro) {
        this.TXTBairro = TXTBairro;
    }

    /**
     * @return the TXTCEP
     */
    public javax.swing.JTextField getTXTCEP() {
        return TXTCEP;
    }

    /**
     * @param TXTCEP the TXTCEP to set
     */
    public void setTXTCEP(javax.swing.JTextField TXTCEP) {
        this.TXTCEP = TXTCEP;
    }

    /**
     * @return the TXTCPF
     */
    public javax.swing.JTextField getTXTCPF() {
        return TXTCPF;
    }

    /**
     * @param TXTCPF the TXTCPF to set
     */
    public void setTXTCPF(javax.swing.JTextField TXTCPF) {
        this.TXTCPF = TXTCPF;
    }

    /**
     * @return the TXTCelular
     */
    public javax.swing.JTextField getTXTCelular() {
        return TXTCelular;
    }

    /**
     * @param TXTCelular the TXTCelular to set
     */
    public void setTXTCelular(javax.swing.JTextField TXTCelular) {
        this.TXTCelular = TXTCelular;
    }

    /**
     * @return the TXTCidade
     */
    public javax.swing.JTextField getTXTCidade() {
        return TXTCidade;
    }

    /**
     * @param TXTCidade the TXTCidade to set
     */
    public void setTXTCidade(javax.swing.JTextField TXTCidade) {
        this.TXTCidade = TXTCidade;
    }

    /**
     * @return the TXTComplemento
     */
    public javax.swing.JTextField getTXTComplemento() {
        return TXTComplemento;
    }

    /**
     * @param TXTComplemento the TXTComplemento to set
     */
    public void setTXTComplemento(javax.swing.JTextField TXTComplemento) {
        this.TXTComplemento = TXTComplemento;
    }

    

    /**
     * @return the TXTDataNascimento
     */
    public javax.swing.JTextField getTXTDataNascimento() {
        return TXTDataNascimento;
    }

    /**
     * @param TXTDataNascimento the TXTDataNascimento to set
     */
    public void setTXTDataNascimento(javax.swing.JTextField TXTDataNascimento) {
        this.TXTDataNascimento = TXTDataNascimento;
    }

    /**
     * @return the TXTEmail
     */
    public javax.swing.JTextField getTXTEmail() {
        return TXTEmail;
    }

    /**
     * @param TXTEmail the TXTEmail to set
     */
    public void setTXTEmail(javax.swing.JTextField TXTEmail) {
        this.TXTEmail = TXTEmail;
    }

    /**
     * @return the TXTEndereco
     */
    public javax.swing.JTextField getTXTEndereco() {
        return TXTEndereco;
    }

    /**
     * @param TXTEndereco the TXTEndereco to set
     */
    public void setTXTEndereco(javax.swing.JTextField TXTEndereco) {
        this.TXTEndereco = TXTEndereco;
    }

    /**
     * @return the TXTEstadoCivil
     */
    public javax.swing.JComboBox getTXTEstadoCivil() {
        return TXTEstadoCivil;
    }

    /**
     * @param TXTEstadoCivil the TXTEstadoCivil to set
     */
    public void setTXTEstadoCivil(javax.swing.JComboBox TXTEstadoCivil) {
        this.TXTEstadoCivil = TXTEstadoCivil;
    }

    /**
     * @return the TXTLogadouro
     */
    public javax.swing.JTextField getTXTLogadouro() {
        return TXTLogadouro;
    }

    /**
     * @param TXTLogadouro the TXTLogadouro to set
     */
    public void setTXTLogadouro(javax.swing.JTextField TXTLogadouro) {
        this.TXTLogadouro = TXTLogadouro;
    }

    /**
     * @return the TXTNome
     */
    public javax.swing.JTextField getTXTNome() {
        return TXTNome;
    }

    /**
     * @param TXTNome the TXTNome to set
     */
    public void setTXTNome(javax.swing.JTextField TXTNome) {
        this.TXTNome = TXTNome;
    }

    /**
     * @return the TXTNumero
     */
    public javax.swing.JTextField getTXTNumero() {
        return TXTNumero;
    }

    /**
     * @param TXTNumero the TXTNumero to set
     */
    public void setTXTNumero(javax.swing.JTextField TXTNumero) {
        this.TXTNumero = TXTNumero;
    }

    /**
     * @return the TXTRG
     */
    public javax.swing.JTextField getTXTRG() {
        return TXTRG;
    }

    /**
     * @param TXTRG the TXTRG to set
     */
    public void setTXTRG(javax.swing.JTextField TXTRG) {
        this.TXTRG = TXTRG;
    }

    /**
     * @return the TXTReferencia
     */
    public javax.swing.JTextField getTXTReferencia() {
        return TXTReferencia;
    }

    /**
     * @param TXTReferencia the TXTReferencia to set
     */
    public void setTXTReferencia(javax.swing.JTextField TXTReferencia) {
        this.TXTReferencia = TXTReferencia;
    }

    /**
     * @return the TXTSexo
     */
    public javax.swing.JComboBox getTXTSexo() {
        return TXTSexo;
    }

    /**
     * @param TXTSexo the TXTSexo to set
     */
    public void setTXTSexo(javax.swing.JComboBox TXTSexo) {
        this.TXTSexo = TXTSexo;
    }

    /**
     * @return the TXTSobrenome
     */
    public javax.swing.JTextField getTXTSobrenome() {
        return TXTSobrenome;
    }

    /**
     * @param TXTSobrenome the TXTSobrenome to set
     */
    public void setTXTSobrenome(javax.swing.JTextField TXTSobrenome) {
        this.TXTSobrenome = TXTSobrenome;
    }

    /**
     * @return the TXTUF
     */
    public javax.swing.JComboBox getTXTUF() {
        return TXTUF;
    }

    /**
     * @param TXTUF the TXTUF to set
     */
    public void setTXTUF(javax.swing.JComboBox TXTUF) {
        this.TXTUF = TXTUF;
    }

    /**
     * @return the TXTtelefone
     */
    public javax.swing.JTextField getTXTtelefone() {
        return TXTtelefone;
    }

    /**
     * @param TXTtelefone the TXTtelefone to set
     */
    public void setTXTtelefone(javax.swing.JTextField TXTtelefone) {
        this.TXTtelefone = TXTtelefone;
    }

    
}
