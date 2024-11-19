import org.w3c.dom.CDATASection;

import java.util.Date;

public class Log{

    public static String [][] contador = new String [500][3];

    public static void logs(int andar, int linha, int coluna, String status){
        int i = 0;

        while(true){
            if(null == contador[i][0]){
                contador[i][0] = "a "+ Integer.toString(andar)+" | 1"+Integer.toString(linha)+" | c"+Integer.toString(coluna);
                contador[i][1] = status;
                contador[i][2] = String.valueOf(data());
                break;
            }
            i++;
        }
    }
    public static Date data(){
        Date agora = new Date();
        return agora;
    }
    public static void imprimir(){
       System.out.print("--- HISTORICO DA COMPRA ---");
        for(int i = 0; i < contador.length; i++){
            if(contador [i][0] == null){
                System.out.print(contador[i][0]);
                System.out.print(contador[i][1]);
                System.out.print(contador[i][2]);
            }
            SistemaTeatro.menu();
        }
    }
}
