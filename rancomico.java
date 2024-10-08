import  java.util.Scanner;
import java.util.Random;

public class randomico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Random random = new Random();
        int i, tentativas = 10;
        int n;
        int naleatorio = random.nextInt(100) + 1;




    for (i = 1; i <= tentativas; i++) {

        System.out.print(i + "ª tentativa. Informe o seu palpite: ");
        n = scanner.nextInt();

        if (n < naleatorio) {
            System.out.println("o numero aleatorio eh maior que: " + n + ", tente novamente!\n");
        } else if (n > naleatorio) {
            System.out.println("o numero aleatorio eh menor que: " + n + ", tente novamente!\n");
        } else {
            System.out.println("parabens, o numero aleatorio eh: " + naleatorio + "\nvoce acertou na " + i + "ª tentativa");
            break;
        }
        if (i == tentativas) {
            System.out.println("maximo de tentativas alcancados, tente novamente mais tarde, se possivel nem tente mais, desiste logo. Otário!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }

    }



        }

    }

