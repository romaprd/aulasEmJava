package Funcionario;

public class Vendedor extends Funcionario {
    public Vendedor(String nome, Double salarioBase){
        super(nome, salarioBase);

    }
    public Double CalcularSalario() {
        salarioBase += (salarioBase * 0.1);
        return salarioBase;
    }
    public void exibir(){
        System.out.println("o nome do vendedor eh: "+nome+"\nseu salario vai ser de: "+ Math.floor(salarioBase));
    }
}
