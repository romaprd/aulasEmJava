package Array;
import java.util.Scanner;
public class ArrayJava {
    public static void main (String [] args){
        Scanner leia = new Scanner(System.in);
        int numero [] = new int [10];

        System.out.println("informe 10 numeros abaixo do limite de 10 posicoes: ");

        for(int i = 0; i < 10; i++){
            System.out.println("informe o"+(i+1)+"º numero");
            numero [i] = leia.nextInt();
        }
        int maior = numero [0];
        int menor = numero[0];

        for(int num = 0; num < numero [10]; num++ ){

            if(num > maior){
                maior = num;
            }
            if(num < menor){
                menor = num;
            }
            System.out.println("o maior numero eh: "+maior);
            System.out.println("\no menor numero eh: "+menor);
        }
    }
}
