import java.util.Scanner;
public class Piso1 {

    public static boolean[][] assentos1 = new boolean[60][60];

    public static void piso1() {


        for (int linha = 1; linha < 31; linha++) {
            System.out.print("                 ");
            System.out.print(linha + "A  ");
            for (int coluna = 1; coluna < 51; coluna++) {
                if (assentos1[linha][coluna] == false) {
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

        assentos1[linha][coluna] = true;
        System.out.println("poltrona " + linha + "A-" + coluna + " comprada com sucesso!!");
        Log.logs(andar, linha, coluna, "Comprada no dia: ");

        piso1();
    }
    public static void ReembolsarP1() {
        Scanner in = new Scanner(System.in);
        piso1();
        int andar = 1;
        int linha = 0;
        int coluna = 0;

        do {
            System.out.println("informe a coluna da poltrona que voce deseja reembolsar: ");
            linha = in.nextInt();
            System.out.println("informe a linha da poltrona que voce deseja reemblosar: ");
            coluna = in.nextInt();
        }while(linha > 31 || coluna > 51);


        if (assentos1[linha][coluna] != true) {
            System.out.print("impossivel reembolsar uma poltrona nao ocupada!");
            System.out.print("informe um poltrona ocupada!");
            Log.Desistencia_ja_exixtente("Desistencia de cadeira livre ");
            ReembolsarP1();

        } else if (assentos1[linha][coluna] == true) {
            assentos1[linha][coluna] = false;

            piso1();
            System.out.print("poltrona "+linha+"A-"+coluna+" reembolsado com sucesso!!\n");
            Log.logs(andar, linha, coluna, "Reembolsada no dia");
            SistemaTeatro.menu();
        }
    }
}

