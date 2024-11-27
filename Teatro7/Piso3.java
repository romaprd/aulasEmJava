
public class Piso3 {

    public static boolean [][] assentos3 = new boolean[60][60];

    public static void piso3() {


        for(int linha = 1; linha < 11; linha++){
            System.out.print("                ");
            System.out.print(linha +"A  ");
            for(int coluna = 1; coluna < 16; coluna++){
                if(!assentos3[linha][coluna]){
                    System.out.print(coluna + "-L \t");
                }else {
                    System.out.print(coluna+"-V \t");
                }

            }
            System.out.println();
        }
    }
    public static void ComprarPiso3(){
        piso3();
        int andar = 3;
        int linha;
        int coluna;

        do{
            System.out.println("INFORME A LINHA DA POLTRONA QUE VOCÊ DESEJA COMPRAR: ");
            linha = Verificacao.verificaLinha();

            if (linha > 11){
                Erros.Linha_invalida("Linha Inválida   ");
                System.out.print("Linha Inválida\n" +"Tente Novamente!\n");
            }

        }while(linha > 11);


        do{
            System.out.println("INFORME O NÚMERO DA POLTRONA QUE VOCÊ DESEJA COMPRAR: ");
            coluna = Verificacao.verificaColuna();

            if (coluna > 16){
                Erros.Poltrona_invalida("Poltrona Inválida   ");
                System.out.print("Coluna Inválida\n" +"Tente Novamente!\n");
            }
        }while(coluna > 16);

        if (!assentos3[linha][coluna]) {
            assentos3[linha][coluna] = true;
            System.out.println("POLTRONA " + linha + "A-" + coluna + " COMPRADA COM SUCESSO!!");
            //Log.logs(andar, linha, coluna, "Comprada no dia: ");
            SistemaTeatro.menu();

        } else if (assentos3[linha][coluna]==true) {
            System.out.print("impossivel comprar uma poltrona ocupada!");
            System.out.print("informe uma poltrona nao ocupada!");
            Erros.Compra_ja_existente("Compra ja Existente   ");
            ComprarPiso3();
        }
    }
    public static void ReembolsarP3() {
        piso3();
        int andar = 3;
        int linha;
        int coluna;

        do{
            System.out.println("INFORME A LINHA DA POLTRONA QUE VOCÊ DESEJA REEMBOLSAR: ");
            linha = Verificacao.verificaLinhaR();

            if (linha > 11){
                Erros.Linha_invalida("Linha Inválida   ");
                ReembolsarP3();
            }

        }while(linha > 11);


        do{
            System.out.println("INFORME O NÚMERO DA POLTRONA QUE VOCÊ DESEJA REEMBOLSAR: ");
            coluna = Verificacao.verificaColunaR();

            if (linha > 16){
                Erros.Poltrona_invalida("Poltrona Inválida   ");

            }
        }while(coluna > 16);

        if (!assentos3[linha][coluna]) {
            System.out.print("impossivel reembolsar uma poltrona nao ocupada!");
            System.out.print("informe uma poltrona ocupada!");
            Erros.Desistencia_ja_existente("Desistencia de Poltrona Livre   ");
            ReembolsarP3();

        } else if (assentos3[linha][coluna]) {
            assentos3[linha][coluna] = false;

            piso3();
            System.out.print("POLTRONA "+linha+"A-"+coluna+" REEMBOLSADA COM SUCESSO!!\n");
            //Log.logs(andar, linha, coluna, "Reembolsada no dia: ");
            SistemaTeatro.menu();
        }
    }
}