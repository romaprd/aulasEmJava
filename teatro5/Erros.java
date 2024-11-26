import java.text.SimpleDateFormat;
import java.util.Date;

public class Erros {

    public static String  [][] erros = new String [500][3];

    public static String data(){
        Date agora = new Date();
        String data = new SimpleDateFormat("dd/MM/yyyy").format(agora);
        String hora = new SimpleDateFormat("HH:mm:ss    \n").format(agora);

        return data+" às "+ hora;
    }

    public static void Andar_invalido(String status){
        int i = 0;

        while(true){
            if(null == erros[i][0]){
                erros[i][0] = "ERR0035  ";
                erros[i][1] = status;
                erros[i][2] = Erros.data();
                System.out.print("\n");
                break;
            }
            i++;
        }
    }



    public static void Linha_invalida(String status){
        int i = 0;

        while(true){
            if(null == erros[i][0]){
                erros[i][0] = "ERR0055  ";
                erros[i][1] = status;
                erros[i][2] = Erros.data();
                System.out.print("\n");
                break;
            }
            i++;
        }
    }

    public static void Poltrona_invalida(String status){
        int i = 0;

        while(true){
            if(null == erros[i][0]){
                erros[i][0] = "ERR0005  ";
                erros[i][1] = status;
                erros[i][2] = Erros.data();
                System.out.print("\n");
                break;
            }
            i++;
        }
    }

    public static void Compra_ja_existente(String status){
        int i = 0;

        while(true){
            if(null == erros[i][0]){
                erros[i][0] = "ERR0015  ";
                erros[i][1] = status;
                erros[i][2] = Erros.data();
                System.out.print("\n");
                break;
            }
            i++;
        }
    }

    public static void Desistencia_ja_existente(String status){
        int i = 0;

        while(true){
            if(null == erros[i][0]){
                erros[i][0] = "ERR0025  ";
                erros[i][1] = status;
                erros[i][2] = Erros.data();
                System.out.print("\n");
                break;
            }
            i++;
        }
    }

    public static void Inicializacao_do_sistema(String status){
        int i = 0;

        while(true){
            if(null == erros[i][0]){
                erros[i][0] = "SYS0001  ";
                erros[i][1] = status;
                erros[i][2] = Erros.data();
                System.out.print("\n");
                break;
            }
            i++;
        }
    }

    public static void Ecerramento_do_sistema(String status){
        int i = 0;

        while(true){
            if(null == erros[i][0]){
                erros[i][0] = "SYS0010  ";
                erros[i][1] = status;
                erros[i][2] = Erros.data();
                System.out.print("\n");
                break;
            }
            i++;
        }
    }
    public static void ImprimirErros(){

        System.out.print("\n\n            --- HISTÓRICO DE SISTEMA ---\n\n");

        for (int i = 0; i < erros.length; i++) {
            if (erros[i][0] == null) {
                break;
            }
            System.out.print(erros[i][0]);
            System.out.print(erros[i][1]);
            System.out.print(erros[i][2]);
            System.out.print("\n");
        }
    }
}