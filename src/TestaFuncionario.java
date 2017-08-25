/**
 * Created by Lais Lodi on 24/08/2017.
 */
class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();

        f1.setNome("Hugo");
        f1.setSalario(100);
        f1.recebeAumento(50);

        f1.setDataDeEntrada(29,2,2000);

        f1.mostra();
    }
}