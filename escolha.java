import java.util.Random;
public class escolhas {
    public static void pedra(){
        int aela = aleatorio();
        

    }
    public static void papel(){
        int aela = aleatorio();
    }
    public static void tesoura(){
        int aela = aleatorio();
    }
    public static int aleatorio(){
        Random random = new Random (3);
        int numalea = random.nextInt();
        return  numalea;
    }
}
