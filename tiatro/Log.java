public class Log {

        public static   String[] Logvendas = new String[120];
        public static    String [] LogReembolsos = new String[120];

    public static void Comprados(String Comprados1){
            Logvendas [120] = Comprados1;

        System.out.print("--- INGRESSOS COMPRADOS ---");
        System.out.print(Logvendas);
    }
    public static void Reembolsados(String  Reembolsados){
        LogReembolsos [120] = Reembolsados;

        System.out.print("--- INGRESSOS REEMBOLSADOS ---");
        System.out.print(LogReembolsos);
    }
}

