
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

    public static void ExibirPiso1() {
    int op;

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
        do{
            System.out.println("O QUE VOCÊ DESEJA\n1- VOLTAR AO MENU PRINCIPAL\n2- EXIBIR PISO 2\n3- EXIBIR PISO 3\nINFORME SUA OPCAO: ");
            op = Verificacao.verificaop();

            switch (op) {
                case 1:
                    SistemaTeatro.menu();
                    break;
                case 2:
                    Piso2.ExibirPiso2();
                    break;
                case 3:
                    Piso3.ExibirPiso3();
                    break;
            }
        }while (op < 0 || op > 3);
    }

    public static void ComprarPiso1() {
        piso1();
        int op;
        int andar = 1;
        int linha;
        int coluna;


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

        if (!assentos1[linha][coluna]) {
            assentos1[linha][coluna] = true;
            tipo = Pagamentos.Menupagamentos();
            System.out.println("POLTRONA " + linha + "A-" + coluna + " COMPRADA COM SUCESSO!!\n");
            Log.logs(andar, linha, coluna, "Comprada no dia: ", tipo+"\n");
            System.out.println("    O QUE VOCE DESEJA   \n1- VOLTAR AO MENU PRINCIPAL\n2- REALIZAR NOVA COMPRA\nINFORME SUA OPÇÃO: ");
            op = Verificacao.verificaop();

            switch (op){
                case 1:
                    SistemaTeatro.menu();
                    break;
                case 2:
                    ComprarPiso1();
                    break;
            }

        } else if (assentos1[linha][coluna] == true) {
            System.out.print("impossivel comprar uma poltrona ocupada!");
            System.out.print("informe outra poltrona!");
            Erros.Compra_ja_existente("Compra ja Existente   ");
            ComprarPiso1();

        }
    }

    public static void ReembolsarP1() {
        piso1();
        int op1;
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
            Erros.Desistencia_ja_existente("Desistência ja Existente   ");
            System.out.print("impossivel reembolsar uma poltrona nao ocupada!");
            System.out.println("--- O QUE VOCÊ DESEJA ---\n1- VOLTAR AO MENU PRINCIPAL\n2- REEMBOLSAR NOVA POLTRONA\nINFORME SUA OPÇÃO: ");
            op1 = Verificacao.verificaop();

            switch (op1){
                case 1 :
                    SistemaTeatro.menu();
                    break;
                case 2:
                    ReembolsarP1();
                    break;
            }

        } else if (assentos1[linha][coluna] == true) {
            assentos1[linha][coluna] = false;

            System.out.print("POLTRONA "+linha+"A-"+coluna+" REEMBOLSADA COM SUCESSO!!\n");
            //Log.logs(andar, linha, coluna, "Reembolsada no dia: ", tipo);
            SistemaTeatro.menu();
        }
    }
}