import java.util.Scanner;
public class Verificacao {
    public static int verificaop(){
        Scanner in = new Scanner (System.in);
        int opcao;

        while (true) {
            if (in.hasNextInt()) {

                opcao = in.nextInt();
                if(opcao >= 1 && opcao <=6){
                    return opcao;
                }else{
                    System.out.print("OPÇÃO INVALIDA, TENTE NOVAMENTE!\n");
                }
            } else {
                Erros.Caractere_Invalido("Caractere inválido");
                System.out.print("\nEntrada invalida, por favor insira um numero inteiro!\n");
                System.out.println("INFORME A OPÇÃO NOVAMENTE: ");
                in.next();

            }


        }
    }

    public static int verificaAndar(){
        Scanner in = new Scanner (System.in);
        int opcao;

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
    public static int verificaAndar1(){
        Scanner in = new Scanner (System.in);
        int opcao;

        while (true) {
            if (in.hasNextInt()) {

                opcao = in.nextInt();
                if(opcao >= 1 && opcao <=5){
                    return opcao;
                }else{
                    System.out.print("PISO INVALIDO, TENTE NOVAMENTE!\n");
                    System.out.print("\nINFORME O PISO QUE VOCÊ DESEJA ANALISAR");
                    System.out.print("1- Piso 1\n2- Piso 2\n3- Piso 3\n4- voltar para o menu principal\ninsira o andar:");
                }
            } else {
                Erros.Caractere_Invalido("Caractere inválido");
                System.out.print("\nEntrada invalida, por favor insira um numero inteiro!\n");
                System.out.println("\nINFORME O PISO QUE VOCÊ DESEJA ANALISAR");
                System.out.println("1- Piso 1\n2- Piso 2\n3- Piso 3\n4- voltar para o menu principal\ninsira o andar:");
                in.next();

            }


        }
    }

    public static int verificaCompra(){
        Scanner in = new Scanner (System.in);
        int opcao;

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
        int opcao;

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
        int opcao;

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
        int opcao;

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
        int opcao;

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
        int opcao;

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

    public static int verificaPamanto(){
        Scanner in = new Scanner (System.in);
        int opcao;

        while (true) {
            if (in.hasNextInt()) {

                opcao = in.nextInt();
                if(opcao >= 1 && opcao <=60){
                    return opcao;
                }else{
                    System.out.print("METODO DE PAGAMENTO INVALIDO!\n");
                    Pagamentos.Menupagamentos();
                }
            } else {
                Erros.Caractere_Invalido("Caractere inválido");
                System.out.print("\nEntrada invalida, por favor insira um numero inteiro!\n");
                System.out.println("INFORME UM METODO DE PAGAMENTO DENTRE OS LISTADOS ACIMA! ");
                in.next();

            }
        }
    }
    public static int verificaSenha(){
        Scanner in = new Scanner (System.in);
        int opcao;

        while (true) {
            if (in.hasNextInt()) {

                opcao = in.nextInt();
                if(opcao >= 1 && opcao <=9999){
                    return opcao;
                }else{
                    System.out.print("SENHA INVALIDA! TENTE NOVAMENTE!\n");
                }
            } else {
                Erros.Caractere_Invalido("Caractere inválido");
                System.out.print("\nEntrada invalida, por favor insira um numero inteiro!\n");
                System.out.println("INFORME A SENHA NOVAMENTE! \n");
                in.next();

            }
        }
    }

    public static double verificaValor(){
        Scanner in = new Scanner (System.in);
        double opcao;

        while (true) {
            if (in.hasNextDouble()) {

                opcao = in.nextDouble();
                if(opcao >= 1.00 && opcao <=9999.00){
                    return opcao;
                }else{
                    System.out.print("VALOR INVALIDO!\n");
                }
            } else {
                Erros.Caractere_Invalido("Cedula inválida");
                System.out.print("\nValor invalido!\nInforme um valor real");
                System.out.println("TENTE NOVAMENTE! \n");
                Pagamentos.Cedula();
                in.next();

            }
        }
    }
}