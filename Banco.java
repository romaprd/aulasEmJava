import java.util.Scanner;
import java.util.Scanner;

public class BancoDigital {
    
    private static final int nr_agencia = 1020;
    private static final int nr_conta = 123;
    private static final int nr_senha = 1234;

   
    private static float saldo = 0.0f;
    private static float limite = 500.00f;
    private static float total;

    private static float[] operacao_credito = new float[100];
    private static float[] operacao_debito = new float[100];

    private static int total_credito = 0;
    private static int total_debito = 0;

    private static Scanner scanner = new Scanner(System.in);

    
    public static void consultaExtrato() {
        System.out.println("Extrato Bancário Completo:\n");
        System.out.println("Operações feitas com crédito: ");
        for (int i = 0; i < total_credito; i++) {
            System.out.printf("Depósito: R$ %.2f\n", operacao_credito[i]);
        }

        System.out.println("\nOperações de débito: ");
        for (int i = 0; i < total_debito; i++) {
            System.out.printf("Saque: R$ %.2f\n", operacao_debito[i]);
        }

        System.out.printf("\nSaldo final: R$ %.2f\n", total);
        int op;
        do {
            System.out.print("\nPara voltar para o menu, digite 5: ");
            op = scanner.nextInt();
            clearScreen();
            chamaMenu();
        } while (op != 5);
    }

   
    public static void consultaSaldo() {
        System.out.printf("Saldo:              R$ %.2f\n", saldo);
        System.out.printf("Limite:             R$ %.2f\n", limite);
        System.out.printf("Disponível:         R$ %.2f\n", total = saldo + limite);

        int op;
        do {
            System.out.print("\nPara voltar para o menu, digite 5: ");
            op = scanner.nextInt();
            clearScreen();
            chamaMenu();
        } while (op != 5);
    }

    
    public static void realizarDeposito() {
        System.out.print("Entre com o valor que gostaria de depositar: ");
        float num = scanner.nextFloat();
        saldo += num; // Atualiza o saldo com o valor do depósito

        if (total_credito < 100) {
            operacao_credito[total_credito++] = num; // Registro da operação de crédito
        } else {
            System.out.println("Crédito cheio");
        }

        int op;
        do {
            System.out.print("\nPara voltar para o menu, digite 5: ");
            op = scanner.nextInt();
            clearScreen();
            chamaMenu();
        } while (op != 5);
    }

  
    public static void realizarSaque() {
        System.out.print("Digite o valor que gostaria de sacar: ");
        float num = scanner.nextFloat();

        total = saldo + limite; // Atualiza o total disponível

        if (total_debito < 100) {
            operacao_debito[total_debito++] = -num; // Registro da operação de débito
        } else {
            System.out.println("Débito cheio");
        }

        if (total < num) {
            System.out.println("Número acima do valor total");
        } else if (num > saldo && (saldo - num) < limite) {
            limite = (saldo - num) + limite;
            saldo = saldo - num;
            if (saldo < 0) {
                saldo = 0;
            }
        } else {
            saldo -= num;
        }

        int op;
        do {
            System.out.print("\nPara voltar para o menu, digite 5: ");
            op = scanner.nextInt();
            clearScreen();
            chamaMenu();
        } while (op != 5);
    }

   
    public static void preencheVetor() {
        for (int i = 0; i < 100; i++) {
            operacao_credito[i] = 0.0f;
            operacao_debito[i] = 0.0f;
        }
    }

   
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

 
    public static void chamaMenu() {
        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Saldo");
            System.out.println("2 - Extrato");
            System.out.println("3 - Saque");
            System.out.println("4 - Depósito");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            clearScreen();
        } while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5);

        switch (opcao) {
            case 1:
                consultaSaldo();
                break;
            case 2:
                consultaExtrato();
                break;
            case 3:
                realizarSaque();
                break;
            case 4:
                realizarDeposito();
                break;
            case 5:
                System.out.println("\nPrograma encerrado pelo usuário");
                break;
            default:
                System.out.println("Opção inválida\n\nInforme uma opção válida: ");
                chamaMenu();
                break;
        }
    }

    public static void main(String[] args) {
        int senha, conta, agencia;

        preencheVetor();

        do {
            System.out.print("Informe sua agência: ");
            agencia = scanner.nextInt();
            System.out.print("Informe sua conta: ");
            conta = scanner.nextInt();
            System.out.print("Informe sua senha: ");
            senha = scanner.nextInt();
            clearScreen();
            if (nr_agencia != agencia || nr_conta != conta || nr_senha != senha) {
                System.out.println("Dados incorretos\n\n");
            }
        } while (nr_agencia != agencia || nr_conta != conta || nr_senha != senha);

        System.out.println("Acesso liberado!\n\n");
        chamaMenu();
    }
}
