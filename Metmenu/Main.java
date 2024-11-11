package Metmenu;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
       menu();

    }

        public static void menu(){
            Scanner leia = new Scanner(System.in);
            OP1 menu = new OP1();
            OP2 menu2 = new OP2();
            OP3 menu3 = new OP3();

        int op;
            do {
                System.out.println("\n--- INICIO ---\n");
                System.out.println("1 - OP\n2 - OPP\n3 - OPPP\n4 - ENCERRAR PROGRAMA\ninforme a opcao desejada: ");
                op = leia.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("voce escolheu a opcao 1\n");
                        menu.menu1();
                        break;
                    case 2:
                        System.out.println("voce escolheu a opcao 2\n");
                        menu2.Menu2();
                        break;
                    case 3:
                        System.out.println("voce escolheu a opcao 3\n");
                        menu3.menu3();
                        break;
                    case 4:
                        System.out.println("encerrando programa!!\n");
                       break;
                    default:
                        System.out.println("informe uma opcao valida entre 1 e 4!!");
                }


            }while (op < 1 || op > 4);


    }


}