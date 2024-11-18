package src2;

import java.util.Scanner;
public class Piso3 {
    public static boolean [][] assentos3 = new boolean[60][60];
    public static void piso3() {


        for(int i = 1; i < 11; i++){
            System.out.print("                ");
            System.out.print(i +"A  ");
            for(int j = 1; j < 16; j++){
                if(assentos3[i][j] == false){
                    System.out.print(j + "-L \t");
                }else {
                    System.out.print(" V ");
                }

            }
            System.out.println();
        }
    }
    public static void ComprarPiso3(){
        Scanner in = new Scanner (System.in);
        piso3();
        int i = 0;
        int j = 0;

        System.out.println("informe a coluna que voce deseja comprar: ");
        i = in.nextInt();
        System.out.println("informe a linha de sua poltrona: ");
        j = in.nextInt();

        assentos3[i][j] = true;

        System.out.println("poltrona"+i+"A-"+j+" comprada com sucesso!!");
        piso3();
    }
    public static void ReembolsarP3() {
        Scanner in = new Scanner(System.in);
        piso3();
        int i = 0;
        int j = 0;

        System.out.println("informe a coluna da poltrona que voce deseja reembolsar: ");
        i = in.nextInt();
        System.out.println("informe a linha da poltrona que voce deseja reemblosar: ");
        j = in.nextInt();



        if (assentos3[i][j] != true) {
            System.out.print("impossivel reembolsar uma poltrona nao ocupada!");
            System.out.print("informe um poltrona ocupada!");
            ReembolsarP3();

        } else if (assentos3[i][j] == true) {
            assentos3[i][j] = false;
            piso3();
            System.out.print("poltrona "+i+"A-"+j+" reembolsado com sucesso!!\n");
            SistemaTeatro.menu();
        }
    }
}
