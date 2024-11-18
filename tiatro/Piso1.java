package src2;

import java.util.Scanner;
public class Piso1 {

    public static String contCO [] = new String [60] ;
    public static String contRE [] = new String [60];
    public static boolean[][] assentos1 = new boolean[60][60];

    public static void piso1() {


        for (int i = 1; i < 31; i++) {
            System.out.print("                 ");
            System.out.print(i + "A  ");
            for (int j = 1; j < 51; j++) {
                if (assentos1[i][j] == false) {
                    System.out.print(j + "-L \t");
                } else {
                    System.out.print(j + "-V \t");
                }

            }
            System.out.println();
        }
    }

    public static void ComprarPiso1() {
        Scanner in = new Scanner(System.in);
        piso1();
        int i = 0;
        int j = 0;
        int cont = 0;

        System.out.println("informe a coluna que voce deseja comprar: ");
        i = in.nextInt();
        System.out.println("informe a linha de sua poltrona: ");
        j = in.nextInt();

        assentos1[i][j] = true;

        System.out.println("poltrona "+i+"A-"+j+" comprada com sucesso!!");

        contCO [cont]= "Poltrona"+i+"A-"+j;
        cont++;
        for(int k = 0; k < contCO.length; k++) {


        }

        piso1();
    }

    public static void ReembolsarP1() {
        Scanner in = new Scanner(System.in);
        piso1();
        int i = 0;
        int j = 0;

        System.out.println("informe a coluna da poltrona que voce deseja reembolsar: ");
        i = in.nextInt();
        System.out.println("informe a linha da poltrona que voce deseja reemblosar: ");
        j = in.nextInt();



            if (assentos1[i][j] != true) {
                System.out.print("impossivel reembolsar uma poltrona nao ocupada!");
                System.out.print("informe um poltrona ocupada!");
                ReembolsarP1();

            } else if (assentos1[i][j] == true) {
                assentos1[i][j] = false;



                piso1();
                System.out.print("poltrona "+i+"A-"+j+" reembolsado com sucesso!!\n");
                SistemaTeatro.menu();
            }
        }
    }




