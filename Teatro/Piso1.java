package Teatro;

public class Piso1 {
    public static void piso1() {
        boolean [][] assentos = new boolean[60][60];

       for(int i = 1; i < 51; i++){
           System.out.print("                 ");
           System.out.print(i +"A  ");
           for(int j = 1; j < 31; j++){
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
