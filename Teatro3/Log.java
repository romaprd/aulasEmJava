import java.util.Date;
import java.text.SimpleDateFormat;

public class Log extends Erros{

    public static int j = 0;
    public static String [][] contador = new String [500][3];

    public static void logs(int andar, int linha, int coluna, String status){

        while(true){
            if(null == contador[j][0]){
                contador[j][0] = "poltrona:  A"+ Integer.toString(linha)+"-"+Integer.toString(coluna)+" | Andar: "+Integer.toString(andar)+"\n";
                contador[j][1] = status;
                contador[j][2] = Log.data();
                System.out.print("\n");
                j++;
                break;
            }
        }
    }
    public static String data(){
        Date agora = new Date();
        String data = new SimpleDateFormat("dd/MM/yyyy").format(agora);
        String hora = new SimpleDateFormat("HH:mm:ss    \n").format(agora);

        return data+" às "+ hora;
    }
    public static void imprimir() {


        System.out.print("         --- HISTORICO DO SISTEMA ---\n\n");
        for (int i = 0; i < erros.length; i++) {
            if (erros[i][0] != null) {
                System.out.print(erros[i][0]);
                System.out.print(erros[i][1]);
                System.out.print(erros[i][2]);
                System.out.print("\n");
            }

            for (int k = 0; k < contador.length; k++) {
                if (contador[k][0] != null) {
                    System.out.print(contador[k][0]);
                    System.out.print(contador[k][1]);
                    System.out.print(contador[k][2]);
                    System.out.print("\n");
                }
                SistemaTeatro.menu();
            }
        }
    }
}