package Metmenu;

import java.util.Scanner;

public class OP3 {
    public void menu3() {
        Main menuprinc = new Main();
        OP1 menu = new OP1();
        OP2 menu2 = new OP2();
        OP3 menu3 = new OP3();
        Scanner leia = new Scanner(System.in);

        int op;
        do {
            System.out.println("\n--- MENU DE OPCOES ---\n");
            System.out.println("1 - OP!\n2 - OPP\n3 - OPPP\n4 - VOLTAR PARA O MENU PRINCIPAL\ninforme a opcao desejada: ");
            op = leia.nextInt();
            switch (op) {
                case 1:
                    System.out.println("voce escolheu a opcao 1 dentro da opcao 3\n");
                    menu.menu1();
                    break;
                case 2:
                    System.out.println("voce escolheu a opcao 2 dentro da opcao 3\n");
                    menu2.Menu2();
                    break;
                case 3:
                    System.out.println("voce escolheu a opcao 3 dentro da opcao 3\n");
                    menu3.menu3();
                    break;
                case 4:
                    System.out.println("voltando para o menu pricipal\n");
                    menuprinc.menu();
                    break;
                default:
                    System.out.println("informe uma opcao valida entre 1 e 4!!");
            }

        }while (op < 1 || op > 4);
    }

    }

