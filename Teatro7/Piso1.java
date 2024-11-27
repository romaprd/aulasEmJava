
public class Piso1 {

    public static String tipo;
    public static boolean[][] assentos1 = new boolean[60][60];

    public static void piso1() {


        for (int linha = 1; linha < 31; linha++) {
            System.out.print("                 ");
            System.out.print(linha + "A  ");
            for (int coluna = 1; coluna < 51; coluna++) {
                if (!assentos1[linha][coluna]) {
                    System.out.print(coluna + "-L \t");
                } else {
                    System.out.print(coluna + "-V \t");
                }

            }
            System.out.println();
        }
    }

    public static void ComprarPiso1() {
        piso1();
        int andar = 1;
        int linha;
        int coluna;
        int op;


        do{
            System.out.println("INFORME A LINHA DA POLTRONA QUE VOCÊ DESEJA COMPRAR: ");
            linha = Verificacao.verificaLinha();

            if (linha > 31){
                Erros.Linha_invalida("Linha Inválida   ");
                System.out.print("Linha Inválida\n" +"Tente Novamente!\n\n");
            }

        }while(linha > 31);


        do{
            System.out.println("INFORME O NÚMERO DA POLTRONA QUE VOCÊ DESEJA COMPRAR: ");
            coluna = Verificacao.verificaColuna();

            if (coluna > 51){
                Erros.Poltrona_invalida("Poltrona Inválida   ");
                System.out.print("Número Inválido\n"+"Tente Novamente!\n");
            }

        }while(coluna > 51);

      tipo = Pagamentos.Menupagamentos();

        if (!assentos1[linha][coluna]) {
            assentos1[linha][coluna] = true;
            System.out.println("POLTRONA " + linha + "A-" + coluna + " COMPRADA COM SUCESSO!!");
            Log.logs(andar, linha, coluna, "Comprada no dia: ", tipo+"\n");
            SistemaTeatro.menu();

        } else if (assentos1[linha][coluna] == true) {
            System.out.print("impossivel comprar uma poltrona ocupada!");
            System.out.print("informe outra poltrona!");
            Erros.Compra_ja_existente("Compra ja Existente   ");
            ComprarPiso1();

        }
    }

    public static void ReembolsarP1() {
        piso1();
        int andar = 1;
        int linha ;
        int coluna ;

        do{
            System.out.println("INFORME A LINHA DA POLTRONA QUE VOCÊ DESEJA REEMB0LSAR: ");
            linha = Verificacao.verificaLinhaR();

            if (linha > 31){
                Erros.Linha_invalida("Linha Inválida   ");
                ReembolsarP1();
            }

        }while(linha > 31);


        do{
            System.out.println("INFORME O NÚMERO DA POLTRONA QUE VOCÊ DESEJA REEMBOLSAR: ");
            coluna = Verificacao.verificaColunaR();

            if (linha > 51){
                Erros.Poltrona_invalida("Poltrona Inválida   ");

            }
        }while(coluna > 51);

        if (!assentos1[linha][coluna]) {
            System.out.print("impossivel reembolsar uma poltrona nao ocupada!");
            System.out.print("informe uma poltrona ocupada!");
            Erros.Desistencia_ja_existente("Desistência ja Existente   ");
            ReembolsarP1();

        } else if (assentos1[linha][coluna] == true) {
            assentos1[linha][coluna] = false;

            System.out.print("POLTRONA "+linha+"A-"+coluna+" REEMBOLSADA COM SUCESSO!!\n");
            //Log.logs(andar, linha, coluna, "Reembolsada no dia: ");
            SistemaTeatro.menu();
        }
    }
}