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

        do{
            System.out.println("informe a linha da poltrona que voce deseja comprar: ");
            linha = in.nextInt();

            if (linha > 21){
                Erros.Linha_invalida("Linha inválida");
                System.out.print("Linha Inválida\n" +"Tente Novamente!\n");
            }

        }while(linha > 21);


        do{
            System.out.println("informe o numero da poltrona que voce deseja comprar: ");
            coluna = in.nextInt();

            if (coluna > 31){
                Erros.Poltrona_invalida("Poltrona Inválida");
                System.out.print("Coluna Inválida\n" +"Tente Novamente!\n");
            }
        }while(coluna > 31);

        if (assentos2[linha][coluna] != true) {
            assentos2[linha][coluna] = true;
            System.out.println("poltrona " + linha + "A-" + coluna + " comprada com sucesso!!");
            Log.logs(andar, linha, coluna, "Comprada no dia: ");

        } else if (assentos2[linha][coluna] == true) {
            System.out.print("impossivel comprar uma poltrona ocupada!");
            System.out.print("informe uma poltrona nao ocupada!");
            Erros.Compra_ja_existente("Compra ja Existente");
            ComprarPiso2();
        }
    }
    public static void ReembolsarP2() {
        Scanner in = new Scanner(System.in);
        piso2();
        int andar = 2;
        int linha = 0;
        int coluna = 0;

        do{
            System.out.println("informe a linha da poltrona que voce deseja reembolsar: ");
            linha = in.nextInt();

            if (linha > 21){
                Erros.Linha_invalida("Linha inválida");
                ReembolsarP2();
            }

        }while(linha > 21);


        do{
            System.out.println("informe o numero da poltrona que voce deseja reembolsar: ");
            coluna = in.nextInt();

            if (linha > 31){
                Erros.Poltrona_invalida("Poltrona Inválida");

            }
        }while(coluna > 31);

        if (assentos2[linha][coluna] != true) {
            System.out.print("impossivel reembolsar uma poltrona nao ocupada!");
            System.out.print("informe uma poltrona ocupada!");
            Erros.Desistencia_ja_existente("Desistencia de cadeira livre ");
            ReembolsarP2();

        } else if (assentos2[linha][coluna] == true) {
            assentos2[linha][coluna] = false;

            piso2();
            System.out.print("poltrona "+linha+"A-"+coluna+" reembolsado com sucesso!!\n");
            Log.logs(andar, linha, coluna, "Reembolsada no dia");
            SistemaTeatro.menu();
        }
    }
}
