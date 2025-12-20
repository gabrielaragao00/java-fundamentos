package condicionais;

import java.util.Scanner;

public class VerificadorDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        System.out.print("Insira a sua idade: ");
        idade = scanner.nextInt();

        if (idade < 18) {
            System.out.println("Você é MENOR de idade.");
        } else if (idade >=  18 && idade < 65) {
            System.out.println("Você é MAIOR de idade.");
        } else {
            System.out.println("Você tem mais de 65 anos de idade.");
        }
    }
}
