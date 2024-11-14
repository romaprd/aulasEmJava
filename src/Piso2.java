
import java.util.Scanner;
public class Piso2 {
    public static boolean [][]assentos2 = new boolean[60][60];
    public static void piso2() {


        for(int i = 1; i < 21; i++){
            System.out.print("                ");
            System.out.print(i +"A  ");
            for(int j = 1; j < 31; j++){
                if(assentos2[i][j] == false){
                    System.out.print(j + "-L \t");
                }else {
                    System.out.print(" V ");
                }

            }
            System.out.println();
        }
    }

    public static void ComprarPiso2(){
        Scanner in = new Scanner(System.in);
        piso2();
        int i = 0;
        int j = 0;

        System.out.println("informe a coluna que voce deseja comprar: ");
        i = in.nextInt();
        System.out.println("informe a linha de sua poltrona: ");
        j = in.nextInt();
        assentos2[i][j] = true;
        System.out.println("poltrona comprada com sucesso!!");
        piso2();
    }
}
