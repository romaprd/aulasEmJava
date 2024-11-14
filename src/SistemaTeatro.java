

import java.util.Scanner;
public class SistemaTeatro{
    public static void main(String[] args) {

        menu();

    }
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        SistemaTeatro teatro = new SistemaTeatro();
        Piso1 piso1 = new Piso1();
        boolean rodando = true;
        int op;




        while (rodando) {
            System.out.println("\n===== Sistema de Venda de Ingressos =====");
            System.out.println("1 - Exibir assentos");
            System.out.println("2 - Comprar ingresso");
            System.out.println("3 - Exibir logs de vendas");
            System.out.println("4 - reembolsar ingresso");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    while (true) {
                        System.out.println("informe o andar que deseja exibir");
                        System.out.println("1- Piso 1\n2- Piso 2\n3- Piso 3\n4- voltar para o menu principal\ninsira o andar:");
                        op = scanner.nextInt();
                        if (op == 1) {
                            Piso1.piso1();
                        } else if (op == 2) {
                            Piso2.piso2();
                        } else if (op == 3) {
                            Piso3.piso3();
                        } else if (op == 4) {
                            menu();
                        }else {
                            System.out.println("opcao invalida!!\nescolha outra opcao\n\n\n");
                        }
                    }


                case 2:
                    while (true) {
                        System.out.println("informe o andar que voce deseja comprar!");
                        System.out.println("1- Piso 1\n2- Piso 2\n3- Piso 3\n4- voltar para o menu principal\ninsira o andar:");
                        op = scanner.nextInt();
                        if (op == 1) {
                            Piso1.ComprarPiso1();
                        } else if (op == 2) {
                            Piso2.ComprarPiso2();
                        } else if (op == 3) {
                            Piso3.ComprarPiso3();
                        } else if (op == 4){
                        menu();
                        }else {
                            System.out.println("opcao invalida!!\nescolha outra opcao\n\n\n");
                        }
                    }



                case 3:
                    //ExibirLogs();
                    break;
                case 4:
                    Piso1.ReembolsarP1();
                    break;
                case 5:
                    rodando = false;
                    System.out.println("Saindo do sistema...");

                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
    }

