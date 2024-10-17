package POO;

public class Pessoa extends Registro {

    float altura;
    float peso;
    char sexo;

    public void apresentar(){
        System.out.println("meu nome registrado é "+nome+", no ano "+ano);
    }
}
