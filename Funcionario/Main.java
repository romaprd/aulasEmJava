package Funcionario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("roma", 1450.99);
        Funcionario gerente = new Gerente("Deyvy S", 1450.99);
        Funcionario vendedor = new Vendedor("tekomo nakama", 1450.99);

        funcionario.CalcularSalario();
        gerente.CalcularSalario();
        vendedor.CalcularSalario();

        funcionario.exibir();
        gerente.exibir();
        vendedor.exibir();

    }
}