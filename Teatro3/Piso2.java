import java.util.Scanner;
public class Piso2 {

    public static boolean [][]assentos2 = new boolean[60][60];

    public static void piso2() {


        for(int linha = 1; linha < 21; linha++){
            System.out.print("                ");
            System.out.print(linha +"A  ");
            for(int coluna = 1; coluna < 31; coluna++){
                if(assentos2[linha][coluna] == false){
                    System.out.print(coluna + "-L \t");
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
        int andar = 2;
        int linha = 0;
        int coluna = 0;

        System.out.println("informe a coluna que voce deseja comprar: ");
        linha = in.nextInt();
        System.out.println("informe a linha de sua poltrona: ");
        coluna = in.nextInt();
        assentos2[linha][coluna] = true;
        System.out.println("poltrona "+linha+"A-"+ coluna +"comprada com sucesso!!");
        Log.logs(andar, linha, coluna,"comprada no dia: ");
        piso2();
    }
    public static void ReembolsarP2() {
        Scanner in = new Scanner(System.in);
        piso2();
        int andar = 2;
        int linha = 0;
        int coluna = 0;

        System.out.println("informe a coluna da poltrona que voce deseja reembolsar: ");
        linha = in.nextInt();
        System.out.println("informe a linha da poltrona que voce deseja reemblosar: ");
        coluna = in.nextInt();



        if (assentos2[linha][coluna] != true) {
            System.out.print("impossivel reembolsar uma poltrona nao ocupada!");
            System.out.print("informe um poltrona ocupada!");
            ReembolsarP2();

        } else if (assentos2[linha][coluna] == true) {
            assentos2[linha][coluna] = false;
            piso2();
            System.out.print("poltrona "+ linha +"A-"+ coluna +" reembolsado com sucesso!!\n");
            Log.logs(andar, linha, coluna, "reembolsada no dia: ");
            SistemaTeatro.menu();
        }
    }
}