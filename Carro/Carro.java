package Carro;

public class Carro {
    String marca;
    String modelo;
    String cor;

    public Carro(String cor, String marca, String modelo){
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String Cor){
        this.marca = cor;
    }
    public void setModelo(String Modelo){
        this.modeio = modelo;
    }
    public void setMarca(String Marca){
        this.marca = marca;
    }
    public void imprimir(){
        System.out.println("a marca eh: "+ marca);
        setCor("preto")
            setModelo("gol");
        setMarca("wolksvagem");
        System.out.println("a marca eh: "+getMarca() + "\n e ele eh: "+ getCor()+"\nsua marca é: "+getMarca);
    }
}
