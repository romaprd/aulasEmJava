//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
menu();
        }
        public static void menu(){
        Scanner scanner = new Scanner (System.in);
        int op;

        do {
            System.out.println("\nESCOLHA UMA DAS OPCOES ABAIXO");
            System.out.println("\n1 - PEDRA\n2 - PAPEL\n3 - TESOURA\n4 - ENCERRAR PARTIDA\n\nInforme a sua escolha: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    //escolhas.pedra();
                    System.out.println("\ncaso queira encerrar a partida pressione a tecla 4\n");
                    menu();
                    break;
                case 2:
                    //escolhas.papel();
                    System.out.println("\ncaso queira encerrar a partida pressione a tecla 4\n");
                    menu();
                    break;
                case 3:
                    //escolhas.tesoura();
                    System.out.println("\ncaso queira encerrar a partida pressione a tecla 4\n");
                    menu();
                    break;
                case 4:
                    System.out.println("\nencerrando partida...\n");
                    break;
            }
            if (op < 1 || op > 4) {
                System.out.println("\nOPCAO INVALIDA! INFORME UMA OPCAO VALIDA\n");
            }
        }while(op < 1 || op > 4);

        }
    }

