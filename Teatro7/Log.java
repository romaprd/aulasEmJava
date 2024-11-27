import java.util.Date;
import java.text.SimpleDateFormat;

public class Log{

    public static int j = 0;
    public static String [][] contador = new String [500][4];

    public static void logs(int andar, int linha, int coluna, String status, String pagamento){

        while(true){
            if(null == contador[j][0]){
                contador[j][0] = "POLTRONA:  "+linha+"A-"+coluna+" | ANDAR: "+andar+"\n";
                contador[j][1] = status;
                contador[j][2] = Log.data();
                contador[j][3] = pagamento;
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


        System.out.print("\n\n         --- HISTORICO DE VENDAS ---\n\n");


        for (int k = 0; k < contador.length; k++) {
            if (contador[k][0] == null) {
                break;
            }

            System.out.print(contador[k][0]);
            System.out.print(contador[k][1]);
            System.out.print(contador[k][2]);
            System.out.print(contador[k][3]);
            System.out.print("\n");
        }
    }
}