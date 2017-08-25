/**
 * Created by Lais Lodi on 24/08/2017.
 */
class Funcionario {

    private String nome;
    private String departamento;
    private double salario;
    private Data dataDeEntrada;
    private String rg;

    public Funcionario() {
    }
    public Funcionario(String nome, String departamento, double salario, Data dataDeEntrada, String rg) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dataDeEntrada = dataDeEntrada;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }
    public String getDepartamento() {
        return departamento;
    }
    public double getSalario() {
        return salario;
    }
    public Data getDataDeEntrada() {
        return dataDeEntrada;
    }
    public String getRg() {
        return rg;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setDataDeEntrada(Data dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }
    public void setDataDeEntrada(int dia, int mes, int ano) {
        Data data = new Data(dia, mes, ano);
        setDataDeEntrada(data);
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    void recebeAumento(double aumento) {
        this.salario += aumento;
    }
    double calculaGanhoAnual() {
        return 12 * this.salario;
    }

    void mostra(){
        if (this.nome == null){
            System.out.println("Nome: -");
        } else {
            System.out.println("Nome: " + this.nome);
        }
        if (this.departamento == null){
            System.out.println("Departamento: -");
        } else {
            System.out.println("Departamento: " + this.departamento);
        }
        if (this.salario == 0){
            System.out.println("Salário: -");
        } else {
            System.out.println("Salário: R$ " + this.salario);
        }
        if (this.salario == 0){
            System.out.println("Ganho Anual: -");
        } else {
            System.out.println("Ganho Anual: R$ " + this.calculaGanhoAnual());
        }
        System.out.println("Data de Entrada: " + this.dataDeEntrada.toString());
        if (this.rg == null){
            System.out.println("RG: -");
        } else {
            System.out.println("RG: " + this.rg);
        }
    }
}