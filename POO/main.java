package POO;

public class main {
    public static void main(String [] args){
        Pessoa pessoa1 = new Pessoa();
        Carro carro1 = new Carro();

        pessoa1.nome = "roma";
        pessoa1.ano = 18;
        pessoa1.codigo = 1234;

        carro1.ano = 1998;
        carro1.nome = "corvette";
        carro1.codigo = 9372;


        pessoa1.apresentar();
        carro1.apresentar();
    }
}
