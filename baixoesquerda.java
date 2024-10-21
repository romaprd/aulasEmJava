import java.util.Scanner;

class baixoesquerda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, num1 = 1;

        System.out.println("Digite quantos números quer: ");
        n = scanner.nextInt();

        for (int i = 1; i < n; i++){
            num1 = num1 + (i+1);
            System.out.println(num1);
        }
    }
}
