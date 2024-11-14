
import java.util.Scanner;
public class Piso1 {
    public static boolean [][] assentos1 = new boolean [60][60];

    public static void piso1() {


        for(int i = 1; i < 31; i++){
            System.out.print("                 ");
            System.out.print(i +"A  ");
            for(int j = 1; j < 51; j++){
                if(assentos1[i][j] == false){
                    System.out.print(j + "-L \t");
                }else {
                    System.out.print(j + "-V \t");
                }

            }
            System.out.println();
        }
    }
    public static void ComprarPiso1(){
        Scanner in = new Scanner(System.in);
                piso1();
        int i = 0;
        int j = 0;

        System.out.println("informe a coluna que voce deseja comprar: ");
        i = in.nextInt();
        System.out.println("informe a linha de sua poltrona: ");
        j = in.nextInt();

        assentos1[i][j] = true;

        System.out.println("poltrona comprada com sucesso!!");
        piso1();
    }

    public static void ReembolsarP1(){
        Scanner in = new Scanner (System.in);
        piso1();
        int i = 0;
        int j = 0;

        System.out.println("informe a coluna da poltrona que voce deseja reembolsar: ");
        i = in.nextInt();
        System.out.println("informe a linha da poltrona que voce deseja reemblosar: ");
        j = in.nextInt();

        while (assentos1[i][j] == true) {

            System.out.print("impossivel reembolsar uma poltrona nao ocupada!");
            System.out.print("informe um poltrona ocupada!");
            ReembolsarP1();

            if(assentos1[i][j] != true) {
                assentos1[i][j] = false;
                piso1();
                System.out.print("ingresso reembolsado com sucesso!!\n");
                SistemaTeatro.menu();
            }
            }
        }
    }



