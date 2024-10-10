import java.util.Scanner;

public class IMC {

    // Função para calcular o IMC
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Função para classificar o IMC
    public static String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o peso e a altura do usuário
        System.out.print("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        // Calcula o IMC
        double imc = calcularIMC(peso, altura);

        // Exibe o resultado
        System.out.printf("Seu IMC é: %.2f%n", imc);
        System.out.println("Classificação: " + classificarIMC(imc));

        scanner.close();
    }
}
