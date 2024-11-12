package Teatro;

public class Piso3 {
    public static void piso3() {
        boolean [][] assentos = new boolean[60][60];

        for(int i = 1; i < 11; i++){
            System.out.print("                ");
            System.out.print(i +"A  ");
            for(int j = 1; j < 16; j++){
                if(assentos[i][j] == false){
                    System.out.print(j + "-L \t");
                }else {
                    System.out.print(" V ");
                }

            }
            System.out.println();
        }
    }
}
