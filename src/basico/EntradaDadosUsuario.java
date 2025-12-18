package basico;

import java.util.Scanner;

public class EntradaDadosUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;
        double altura;

        System.out.print("Qual o seu nome? ");
        nome = scanner.nextLine();
        System.out.print("Quantos anos você tem? ");
        idade = scanner.nextInt();
        System.out.print("Qual a sua altura? ");
        altura = scanner.nextDouble();

        System.out.println("O seu nome é: " + nome + ", você tem " + idade + " anos e tem " + altura + " metros de altura.");
    }
}
