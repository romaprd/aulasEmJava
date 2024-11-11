package Metmenu;

import java.util.Scanner;
public class OP1 {
    public void  menu1(){
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
                    System.out.println("voce escolheu a opcao 1 dentro da opcao 1\n");
                    break;
                case 2:
                    System.out.println("voce escolheu a opcao 2\n");

                    break;
                case 3:
                    System.out.println("voce escolheu a opcao 3\n");

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
