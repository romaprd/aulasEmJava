public class VerificaPrimosAte100 {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 100; numero++) {
            if (ehPrimo(numero)) {
                System.out.println(numero + ": sim");
            } else {
                System.out.println(numero + ": nao");
            }
        }
    }

    public static boolean ehPrimo(int num) {
        // Números menores que 2 não são primos
        if (num < 2) {
            return false;
        }

        // Verifica se o número tem divisores além de 1 e ele mesmo
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
