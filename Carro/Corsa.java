package Carro;

public class Corsa extends Carro {

    public boolean rebaixado;
    public Corsa(String cor,String marca, String modelo, boolean rebaixado){
        super(cor, marca, modelo);

        this.rebaixado = rebaixado;
    }
}
