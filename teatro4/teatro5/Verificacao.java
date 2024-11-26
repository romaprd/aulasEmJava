import java.util.Scanner;
public class Verificacao {
    public static void verifica(){
        Scanner in = new Scanner (System.in);

        System.out.println("informe um caracter aleatorio: ");

        if(in.hasNextInt()){

            int valor = in.nextInt();
            System.out.print("voce digitou o numero inteiro " + valor);
        }
    }
}