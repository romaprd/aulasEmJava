import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String nome, cpf;
        int idade;
        float altura;
        double peso;
        boolean casado;//boolean: verdadeiro ou falso

        casado = false;

        System.out.println("informe seu cpf: ");
        cpf = scanner.nextLine();
        System.out.println("digite seu nome: ");
        nome = scanner.nextLine();
        System.out.println("olá sr "+nome+", informe sua altura: ");
        altura = scanner.nextFloat();
        System.out.println("sr "+nome+", informe sua idade: ");
        idade = scanner.nextInt();
        System.out.println("sr "+nome+", informe seu peso em kg: ");
        peso = scanner.nextDouble();




    //nome = "roma seu maravilhoso";

        System.out.printf("Olá %s, seja muito mais do que bem vindo!\nSeu cpf é: %s\nSua altura é: %.2f m\nSua idade é: %d anos\nSeu peso é: %.2lf Kg", nome, cpf, altura, idade, peso);

            //System.out.println("Olá Mundo!");
            //System.out.print("seja bem vindo");


        }
    }
