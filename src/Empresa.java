/**
 * Created by Lais Lodi on 24/08/2017.
 */
public class Empresa {
    private String nome;
    private String cnpj;
    private Funcionario[] funcionarios;

    public Empresa(){}
    public Empresa(String nome, String cnpj, Funcionario[] funcionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = funcionarios;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }
    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void adicionar(Funcionario funcionario){

    }
}
