import java.util.Scanner;
public class Piso3 {

    public static boolean [][] assentos3 = new boolean[60][60];

    public static void piso3() {


        for(int linha = 1; linha < 11; linha++){
            System.out.print("                ");
            System.out.print(linha +"A  ");
            for(int coluna = 1; coluna < 16; coluna++){
                if(assentos3[linha][coluna] == false){
                    System.out.print(coluna + "-L \t");
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
        int andar = 3;
        int linha = 0;
        int coluna = 0;

        System.out.println("informe a coluna que voce deseja comprar: ");
        linha = in.nextInt();
        System.out.println("informe a linha de sua poltrona: ");
        coluna = in.nextInt();

        assentos3[linha][coluna] = true;

        System.out.println("poltrona"+ linha +"A-"+ coluna +" comprada com sucesso!!");
        Log.logs(andar, linha, coluna, "comprada no dia: ");
        piso3();
    }
    public static void ReembolsarP3() {
        Scanner in = new Scanner(System.in);
        piso3();
        int andar = 3;
        int linha = 0;
        int coluna = 0;

        System.out.println("informe a coluna da poltrona que voce deseja reembolsar: ");
        linha = in.nextInt();
        System.out.println("informe a linha da poltrona que voce deseja reemblosar: ");
        coluna = in.nextInt();



        if (assentos3[linha][coluna] != true) {
            System.out.print("impossivel reembolsar uma poltrona nao ocupada!");
            System.out.print("informe um poltrona ocupada!");
            Log.Desistencia_ja_exixtente("Desistencia de cadeira livre  ");
            ReembolsarP3();

        } else if (assentos3[linha][coluna] == true) {
            assentos3[linha][coluna] = false;
            piso3();
            System.out.print("poltrona "+ linha +"A-"+ coluna +" reembolsado com sucesso!!\n");
            Log.logs(andar, linha, coluna, "reembolsada no dia: ");
            SistemaTeatro.menu();
        }
    }
}