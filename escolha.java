package jogos;

import java.util.Random;
public class escolhas {
    public static void pedra(){
        Random random = new Random ();
        int aleatorio = random.nextInt(3) + 1;
        int escolha = 1;

        if( aleatorio == escolha) {
            System.out.println("\n--- EMPATE ---");
            System.out.println("ambos escolheram pedra!");
        }else if(aleatorio == 2) {
            System.out.println("\n--- DERROTA ---\n");
            System.out.println("o adversario escolheu papel!!");
        }else{
            System.out.println("\n--- VITÓRIA ---\n");
            System.out.println("o adversariro escolheu tesoura!");
        }


    }
    public static void papel(){
        Random random = new Random ();
        int aleatorio = random.nextInt(3) + 1;
        int escolha = 2;

        if( aleatorio == escolha) {
            System.out.println("\n--- EMPATE ---\n");
            System.out.println("ambos escolheram papel!");
        }else if(aleatorio == 3) {
            System.out.println("\n--- DERROTA ---");
            System.out.println("o adversario escolheu tesoura!!");
        }else{
            System.out.println("\n--- VITÓRIA ---\n");
            System.out.println("o adversario escolheu pedra!");
        }
    }



    public static void tesoura(){
        Random random = new Random ();
        int aleatorio = random.nextInt(3) + 1;
        int escolha = 3;

        if( aleatorio == escolha) {
            System.out.println("\n--- EMPATE ---");
            System.out.println("ambos escolheram tesoura!");
        }else if(aleatorio == 1) {
            System.out.println("\n--- DERROTA ---\n");
            System.out.println("o adversario escolheu pedra!!");
        }else{
            System.out.println("\n--- VITÓRIA ---\n");
            System.out.println("o adverdario escolheu papel!");
        }

    }
    public static int aleatorio(){
        Random random = new Random ();
        int numalea = random.nextInt();

        return  numalea;
    }
}
