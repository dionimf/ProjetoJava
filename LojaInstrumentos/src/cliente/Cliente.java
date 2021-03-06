
package cliente;

import java.util.Objects;

public class Cliente implements Comparable<Cliente>{
    private char Sexo;
    private int Numero;
    private int CEP;
    private int CPF;
    private int RG;
    private String Nome;
    private String DataNascimento;
    private String EstadoCivil;
    private String Telefone;
    private String Email;
    private String Endereco;
    private String Logadouro;
    private String Cidade;
    private String Complemento; 
    private String Pais;
    private String Celular;
    private String Bairro;
    private String UF;
    private String Referencia;
    
    public Cliente(){
        
    }
    public Cliente(char Sexo,int Numero,int CEP,int CPF,int RG, String Nome, String DataNascimento, 
            String EstadoCivil, String Telefone, String Email,String Endereco, String Logadouro, 
            String Cidade, String Complemento, String Pais, String Celular, String Bairro, String UF, String Referencia){
        
        this.Sexo=Sexo;
        this.Numero=Numero;
        this.CEP=CEP;
        this.CPF=CPF;
        this.RG=RG;
        this.Nome=Nome;
        this.DataNascimento=DataNascimento;
        this.EstadoCivil=EstadoCivil;
        this.Telefone=Telefone;
        this.Email=Email;
        this.Endereco=Endereco;
        this.Logadouro=Logadouro;
        this.Cidade=Cidade;
        this.Complemento=Complemento;
        this.Pais=Pais;
        this.Celular=Celular;
        this.Bairro=Bairro;
        this.UF=UF;
        this.Referencia=Referencia;
        
    
    
    
    }
    /**
     * @return the Sexo
     */
    public char getSexo() {
        return Sexo;
    }

    /**
     * @param Sexo the Sexo to set
     */
    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    

    /**
     * @return the Numero
     */
    public int getNumero() {
        return Numero;
    }

    /**
     * @param Numero the Numero to set
     */
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    /**
     * @return the CEP
     */
    public int getCEP() {
        return CEP;
    }

    /**
     * @param CEP the CEP to set
     */
    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    /**
     * @return the CPF
     */
    public int getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the RG
     */
    public int getRG() {
        return RG;
    }

    /**
     * @param RG the RG to set
     */
    public void setRG(int RG) {
        this.RG = RG;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the DataNascimento
     */
    public String getDataNascimento() {
        return DataNascimento;
    }

    /**
     * @param DataNascimento the DataNascimento to set
     */
    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    /**
     * @return the EstadoCivil
     */
    public String getEstadoCivil() {
        return EstadoCivil;
    }

    /**
     * @param EstadoCivil the EstadoCivil to set
     */
    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    /**
     * @return the Telefone
     */
    public String getTelefone() {
        return Telefone;
    }

    /**
     * @param Telefone the Telefone to set
     */
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Endereco
     */
    public String getEndereco() {
        return Endereco;
    }

    /**
     * @param Endereco the Endereco to set
     */
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    /**
     * @return the Logadouro
     */
    public String getLogadouro() {
        return Logadouro;
    }

    /**
     * @param Logadouro the Logadouro to set
     */
    public void setLogadouro(String Logadouro) {
        this.Logadouro = Logadouro;
    }

    /**
     * @return the Cidade
     */
    public String getCidade() {
        return Cidade;
    }

    /**
     * @param Cidade the Cidade to set
     */
    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    /**
     * @return the Complemento
     */
    public String getComplemento() {
        return Complemento;
    }

    /**
     * @param Complemento the Complemento to set
     */
    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    /**
     * @return the Pais
     */
    public String getPais() {
        return Pais;
    }

    /**
     * @param Pais the Pais to set
     */
    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    /**
     * @return the Celular
     */
    public String getCelular() {
        return Celular;
    }

    /**
     * @param Celular the Celular to set
     */
    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    /**
     * @return the Bairro
     */
    public String getBairro() {
        return Bairro;
    }

    /**
     * @param Bairro the Bairro to set
     */
    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    /**
     * @return the UF
     */
    public String getUF() {
        return UF;
    }

    /**
     * @param UF the UF to set
     */
    public void setUF(String UF) {
        this.UF = UF;
    }

    /**
     * @return the Referencia
     */
    public String getReferencia() {
        return Referencia;
    }

    /**
     * @param Referencia the Referencia to set
     */
    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.CPF != other.CPF) {
            return false;
        }
        return true;
    }
    @Override
    public int compareTo(Cliente o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
