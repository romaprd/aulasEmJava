package POO2;

public class Main {
    public static void main (String [] args){
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        //pessoa1.nome = "romaprd";
        //pessoa1.idade = 18;

        //pessoa2.nome = "romario";
        //pessoa2.idade = 19;

        //pessoa2.informacoes();
        //System.out.println("\n");
        //pessoa1.informacoes();

        pessoa1.setNome("romaprd");
        pessoa1.setIdade(18);

        System.out.println("nome: "+pessoa1.getNome()+"\nidade"+pessoa1.getIdade());
    }

}
