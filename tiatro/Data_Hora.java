package src2;

import java.text.SimpleDateFormat;
import java.util.Date;
public class Data_Hora {
    public static  void DataeHora(){
        Date dataHoraAtual = new Date();
        String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
        String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);

        System.out.print(data+" "+hora);

    }
}
