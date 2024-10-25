package Funcionario;

public class Funcionario {
    String nome;
    Double salarioBase;

    public Funcionario(String nome, Double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    public Double CalcularSalario(){
        return salarioBase;
    }
    public void exibir(){
        System.out.println("o nome do funcionario eh: "+nome+"\nseu salario vai ser de: "+salarioBase+"R$");
    }
}
