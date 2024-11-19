

import java.util.Scanner;
public class Piso1 {

    public static boolean[][][] assentos1 = new boolean[60][60][1];

    public static void piso1() {


        for (int linha = 1; linha < 31; linha++) {
            System.out.print("                 ");
            System.out.print(linha + "A  ");
            for (int coluna = 1; coluna < 51; coluna++) {
                if (assentos1[linha][coluna][1] == false) {
                    System.out.print(coluna + "-L \t");
                } else {
                    System.out.print(coluna + "-V \t");
                }

            }
            System.out.println();
        }

    }

    public static void ComprarPiso1() {
        Scanner in = new Scanner(System.in);
        piso1();
        int andar = 1;
        int linha;
        int coluna;

        piso1();
        System.out.println("informe a coluna que voce deseja comprar: ");
        linha = in.nextInt();
        System.out.println("informe a linha de sua poltrona: ");
        coluna = in.nextInt();

        assentos1[andar][linha][coluna] = true;
        System.out.println("poltrona " + linha + "A-" + coluna + " comprada com sucesso!!");
        Log.logs(andar, linha, coluna, "Compra");


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



        if (assentos1[i][j][1] != true) {
            System.out.print("impossivel reembolsar uma poltrona nao ocupada!");
            System.out.print("informe um poltrona ocupada!");
            ReembolsarP1();

        } else if (assentos1[i][j][1] == true) {
            assentos1[i][j][1] = false;



            piso1();
            System.out.print("poltrona "+i+"A-"+j+" reembolsado com sucesso!!\n");
            SistemaTeatro.menu();
        }
    }
    }


