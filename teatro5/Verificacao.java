import java.util.Scanner;
public class Verificacao {
    public static int verificaop(){
        Scanner in = new Scanner (System.in);
        int opcao;


       System.out.println("INFORME SUA OPÇÃO: ");
        if(in.hasNextInt()){

            opcao = in.nextInt();
            return opcao;
        }else{
            Erros.Caractere_Invalido("Caractere inválido");
            System.out.print("\ncaractere invalido! informe um numero inteiro!\n");
            verificaop();

        }
        return -1;
    }

    public static int verificaAndar(){
        Scanner in = new Scanner (System.in);
        int opcao;



        if(in.hasNextInt()){

            opcao = in.nextInt();
            return opcao;
        }else{
            Erros.Caractere_Invalido("Caractere inválido");
            System.out.print("\ncaractere invalido! informe um numero inteiro!\n");
            System.out.println("INFORME O ANDAR QUE VOCÊ DESEJA ANALISAR: ");
            verificaAndar();

        }
        return -1;
    }

    public static int verificaCompra(){
        Scanner in = new Scanner (System.in);
        int opcao;



        if(in.hasNextInt()){

            opcao = in.nextInt();
            return opcao;
        }else{
            Erros.Caractere_Invalido("Caractere inválido");
            System.out.print("\ncaractere invalido! informe um numero inteiro!\n");
            System.out.println("INFORME O PISO DA POLTRONA QUE VOCÊ DESEJA COMPRAR: ");
            verificaCompra();

        }
        return -1;
    }

    public static int verificaReembolso(){
        Scanner in = new Scanner (System.in);
        int opcao;



        if(in.hasNextInt()){

            opcao = in.nextInt();
            return opcao;
        }else{
            Erros.Caractere_Invalido("Caractere inválido");
            System.out.print("\ncaractere invalido! informe um numero inteiro!\n");
            System.out.println("INFORME O PISO DA POLTRONA QUE VOCÊ DESEJA COMPRAR: ");
            verificaReembolso();

        }
        return -1;
    }
    public static int verificaLinha(){
        Scanner in = new Scanner (System.in);
        int opcao;



        if(in.hasNextInt()){

            opcao = in.nextInt();
            return opcao;
        }else{
            Erros.Caractere_Invalido("Caractere inválido");
            System.out.print("\ncaractere invalido! informe um numero inteiro!\n");
            System.out.println("INFORME A LINHA DA POLTRONA QUE VOCÊ DESEJA COMPRAR: ");
            verificaLinha();

        }
        return -1;
    }

    public static int verificaColuna(){
        Scanner in = new Scanner (System.in);
        int opcao;



        if(in.hasNextInt()){

            opcao = in.nextInt();
            return opcao;
        }else{
            Erros.Caractere_Invalido("Caractere inválido");
            System.out.print("\ncaractere invalido! informe um numero inteiro!\n");
            System.out.println("INFORME O NÚMERO DA POLTRONA QUE VOCÊ DESEJA COMPRAR: ");
            verificaColuna();

        }
        return -1;
    }
    public static int verificaLinhaR(){
        Scanner in = new Scanner (System.in);
        int opcao;



        if(in.hasNextInt()){

            opcao = in.nextInt();
            return opcao;
        }else{
            Erros.Caractere_Invalido("Caractere inválido");
            System.out.print("\ncaractere invalido! informe um numero inteiro!\n");
            System.out.println("INFORME A LINHA DA POLTRONA QUE VOCÊ DESEJA REEMBOLSAR: ");
            verificaLinhaR();

        }
        return -1;
    }

    public static int verificaColunaR(){
        Scanner in = new Scanner (System.in);
        int opcao;



        if(in.hasNextInt()){

            opcao = in.nextInt();
            return opcao;
        }else{
            Erros.Caractere_Invalido("Caractere inválido");
            System.out.print("\ncaractere invalido! informe um numero inteiro!\n");
            System.out.println("INFORME O NÚMERO DA POLTRONA QUE VOCÊ DESEJA REEMBOLSAR: ");
            verificaColunaR();

        }
        return -1;
    }
}
