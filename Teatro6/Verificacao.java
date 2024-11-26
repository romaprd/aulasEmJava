import java.util.Scanner;
public class Verificacao {
    public static int verificaop(){
        Scanner in = new Scanner (System.in);
        int opcao = -1;

while (true) {
    System.out.println("INFORME SUA OPÇÃO: ");
    if (in.hasNextInt()) {

        opcao = in.nextInt();
        if(opcao >= 1 && opcao <=5){
            return opcao;
        }else{
            System.out.print("OPÇÃO INVALIDA, TENTE NOVAMENTE!\n");
        }
    } else {
        Erros.Caractere_Invalido("Caractere inválido");
        System.out.print("\nEntrada invalida, por favor insira um numero inteiro!\n");
        in.next();

    }


}
    }

    public static int verificaAndar(){
        Scanner in = new Scanner (System.in);
        int opcao = -1;

        while (true) {
            if (in.hasNextInt()) {

                opcao = in.nextInt();
                if(opcao >= 1 && opcao <=5){
                    return opcao;
                }else{
                    System.out.print("PISO INVALIDO, TENTE NOVAMENTE!\n");
                }
            } else {
                Erros.Caractere_Invalido("Caractere inválido");
                System.out.print("\nEntrada invalida, por favor insira um numero inteiro!\n");
                in.next();

            }


        }
    }

    public static int verificaCompra(){
        Scanner in = new Scanner (System.in);
        int opcao = -1;

        while (true) {
            if (in.hasNextInt()) {

                opcao = in.nextInt();
                if(opcao >= 1 && opcao <=5){
                    return opcao;
                }else{
                    System.out.print("PISO INVALIDO, TENTE NOVAMENTE!\n");
                }
            } else {
                Erros.Caractere_Invalido("Caractere inválido");
                System.out.print("\nEntrada invalida, por favor insira um numero inteiro!\n");
                System.out.println("INFORME O PISO DA POLTRONA QUE VOCÊ DESEJA COMPRAR: ");
                in.next();

            }
        }
    }

    public static int verificaReembolso(){
        Scanner in = new Scanner (System.in);
        int opcao = -1;

        while (true) {
            if (in.hasNextInt()) {

                opcao = in.nextInt();
                if(opcao >= 1 && opcao <=5){
                    return opcao;
                }else{
                    System.out.print("PISO INVALIDO, TENTE NOVAMENTE!\n");
                }
            } else {
                Erros.Caractere_Invalido("Caractere inválido");
                System.out.print("\nEntrada invalida, por favor insira um numero inteiro!\n");
                System.out.println("INFORME O PISO DA POLTRONA QUE VOCÊ DESEJA REEMBOLSAR: ");
                in.next();

            }
        }
    }
    public static int verificaLinha(){
        Scanner in = new Scanner (System.in);
        int opcao = -1;

        while (true) {
            if (in.hasNextInt()) {

                opcao = in.nextInt();
                if(opcao >= 1 && opcao <=60){
                    return opcao;
                }else{
                    System.out.print("LINHA INVALIDO, TENTE NOVAMENTE!\n");
                }
            } else {
                Erros.Caractere_Invalido("Caractere inválido");
                System.out.print("\nEntrada invalida, por favor insira um numero inteiro!\n");
                System.out.println("INFORME O NÚMERO DA POLTRONA QUE VOCÊ DESEJA COMPRAR ");
                in.next();

            }
        }
    }

    public static int verificaColuna(){
        Scanner in = new Scanner (System.in);
        int opcao = -1;

        while (true) {
            if (in.hasNextInt()) {

                opcao = in.nextInt();
                if(opcao >= 1 && opcao <=60){
                    return opcao;
                }else{
                    System.out.print("POLTRONA INVÁLIDA, TENTE NOVAMENTE!\n");
                }
            } else {
                Erros.Caractere_Invalido("Caractere inválido");
                System.out.print("\nEntrada invalida, por favor insira um numero inteiro!\n");
                System.out.println("INFORME O NÚMERO DA POLTRONA QUE VOCÊ DESEJA COMPRAR ");
                in.next();

            }
        }
    }
    public static int verificaLinhaR(){
        Scanner in = new Scanner (System.in);
        int opcao = -1;

        while (true) {
            if (in.hasNextInt()) {

                opcao = in.nextInt();
                if(opcao >= 1 && opcao <=60){
                    return opcao;
                }else{
                    System.out.print("LINHA INVALIDA, TENTE NOVAMENTE!\n");
                }
            } else {
                Erros.Caractere_Invalido("Caractere inválido");
                System.out.print("\nEntrada invalida, por favor insira um numero inteiro!\n");
                System.out.println("INFORME O NÚMERO DA POLTRONA QUE VOCÊ DESEJA REEMBOLSAR ");
                in.next();

            }
        }
    }

    public static int verificaColunaR(){
        Scanner in = new Scanner (System.in);
        int opcao = -1;

        while (true) {
            if (in.hasNextInt()) {

                opcao = in.nextInt();
                if(opcao >= 1 && opcao <=60){
                    return opcao;
                }else{
                    System.out.print("COLUNA INVALIDA, TENTE NOVAMENTE!\n");
                }
            } else {
                Erros.Caractere_Invalido("Caractere inválido");
                System.out.print("\nEntrada invalida, por favor insira um numero inteiro!\n");
                System.out.println("INFORME A COLUNA DA POLTRONA QUE VOCÊ DESEJA REEMBOLSAR ");
                in.next();

            }
        }
    }
}