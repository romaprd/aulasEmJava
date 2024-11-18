package src2;

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
        System.out.println("poltrona "+i+"A-"+j+"comprada com sucesso!!");
        piso2();
    }
    public static void ReembolsarP2() {
        Scanner in = new Scanner(System.in);
        piso2();
        int i = 0;
        int j = 0;

        System.out.println("informe a coluna da poltrona que voce deseja reembolsar: ");
        i = in.nextInt();
        System.out.println("informe a linha da poltrona que voce deseja reemblosar: ");
        j = in.nextInt();



        if (assentos2[i][j] != true) {
            System.out.print("impossivel reembolsar uma poltrona nao ocupada!");
            System.out.print("informe um poltrona ocupada!");
            ReembolsarP2();

        } else if (assentos2[i][j] == true) {
            assentos2[i][j] = false;
            piso2();
            System.out.print("poltrona "+i+"A-"+j+" reembolsado com sucesso!!\n");
            SistemaTeatro.menu();
        }
    }
}