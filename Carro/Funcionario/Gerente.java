package Funcionario;

public class Gerente extends Funcionario {
    public Gerente(String nome, Double salarioBase){
        super(nome, salarioBase);

    }
    public Double CalcularSalario(){
        salarioBase += (salarioBase * 0.2);
        return salarioBase;
    }
    public void exibir(){
        System.out.println("o nome do gerente eh: "+ nome + "\nseu salario vai ser de: "+ Math.floor(salarioBase));
    }
}
