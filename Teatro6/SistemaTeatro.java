import java.util.Scanner;
public class SistemaTeatro{


    public static void main(String[] args) {
        Erros.Inicializacao_do_sistema("Inicialização do Sistema  ");

        menu();

    }
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        boolean rodando = true;
        int op;
        int opcao = 0;
        while (rodando) {
            System.out.print("               ~~~~ BEM VINDO AO TEATRO ROMA ~~~~\n\n");
            System.out.println("\n          ===== SISTEMA DE VENDA DE INGRESSOS =====");
            System.out.println("1 - Exibir Assentos");
            System.out.println("2 - Comprar Ingressos");
            System.out.println("3 - Exibir Logs de Vendas");
            System.out.println("4 - Reembolsar Ingressos");
            System.out.println("5 - Sair");
            opcao =  Verificacao.verificaop();

            switch (opcao) {
                case 1:
                    do {
                        System.out.println("\nINFORME O PISO QUE VOCÊ DESEJA ANALISAR");
                        System.out.println("1- Piso 1\n2- Piso 2\n3- Piso 3\n4- voltar para o menu principal\ninsira o andar:");
                        op = Verificacao.verificaAndar();
                        if (op == 1) {
                            Piso1.piso1();
                        } else if (op == 2) {
                            Piso2.piso2();
                        } else if (op == 3) {
                            Piso3.piso3();
                        } else if (op == 4) {
                            menu();
                        } else {
                            System.out.println("OPÇÃO INVÁLIDA!!\nESCOLHA OUTRA OPÇÃO\n\n\n");
                            Erros.Andar_invalido("Piso Inválido   ");
                        }
                    }while(op < 0 && op > 4);



                case 2:
                    do{
                        System.out.println("\nINFORME O PISO DA POLTRONA QUE VOCÊ DESEJA COMPRAR!");
                        System.out.println("1- Piso 1\n2- Piso 2\n3- Piso 3\n4- voltar para o menu principal\ninsira o andar:");
                        op = Verificacao.verificaCompra();
                        if (op == 1) {
                            Piso1.ComprarPiso1();
                        } else if (op == 2) {
                            Piso2.ComprarPiso2();
                        } else if (op == 3) {
                            Piso3.ComprarPiso3();
                        } else if (op == 4){
                            menu();
                        }else {
                            System.out.println("OPÇÃO INVÁLIDA!!\nESCOLHA OUTRA OPÇÃO\n\n\n");
                            Erros.Andar_invalido("Piso Inválido   ");
                        }
                    }while(op < 0 && op > 4);



                case 3:
                    Log.imprimir();

                    break;
                case 4:
                    do{
                        System.out.println("\nINFORME O PISO DA POLTRONA QUE VOCÊ DESEJA REEMBOLSAR!\n");
                        System.out.println("1- Piso 1\n2- Piso 2\n3- Piso 3\n4- voltar Para o Menu Principal\nEscolha um Opção:");
                        op = Verificacao.verificaReembolso();
                        if (op == 1) {
                            Piso1.ReembolsarP1();
                        } else if (op == 2) {
                            Piso2.ReembolsarP2();
                        } else if (op == 3) {
                            Piso3.ReembolsarP3();
                        } else if (op == 4) {
                            menu();
                        } else {
                            System.out.println("OPÇÃO INVÁLIDA!!\nESCOLHA OUTRA OPÇÃO\n\n\n");
                        }
                    }while(op < 0 && op > 4);
                    Erros.Andar_invalido("Piso Inválido   ");
                case 5:
                    rodando = false;
                    Erros.Ecerramento_do_sistema(" Encerramento do Sistema   ");
                    System.out.println("Saindo do Sistema...");
                    Erros.ImprimirErros();
                    System.exit(0);
                default:
                    System.out.println("OPÇÃO INVÁLIDA! INFORME UMA OPÇÃO VALIDA!\n.");
            }
        }
        scanner.close();
    }
}