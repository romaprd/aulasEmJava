package Teatro;

import java.util.Scanner;
public class SistemaTeatro{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaTeatro teatro = new SistemaTeatro();
        Piso1 piso1 = new Piso1();
        boolean rodando = true;
        int op;
        int linha;
        int coluna;

        Piso1.piso1();

        /*while (rodando) {
            System.out.println("\n===== Sistema de Venda de Ingressos =====");
            System.out.println("1 - Exibir assentos");
            System.out.println("2 - Comprar ingresso");
            System.out.println("3 - Exibir logs de vendas");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    while (true) {
                        System.out.println("informe o andar que deseja exibir");
                        System.out.println("1- Piso 1\n2- Piso 2\n3- Piso 3\n4- voltar para o menu principal\ninsira o andar:");
                        op = scanner.nextInt();
                        if (op == 1) {
                            Teatro.Piso1.piso1();
                        } else if (op == 2) {

                        } else if (op == 3) {

                        } else if (op == 4) {

                        } else {
                            System.out.println("opcao invalida!!\nescolha outra opcao\n\n\n");
                        }
                    }


                case 2:
                    System.out.print("Digite o número da linha (1 a 30): ");
                     linha = scanner.nextInt();
                    System.out.print("Digite o número da coluna (1 a 50): ");
                     coluna = scanner.nextInt();

                    break;
                case 3:

                    break;
                case 4:
                    rodando = false;
                    System.out.println("Saindo do sistema...");

                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }*/
}
}