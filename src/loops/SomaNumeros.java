package loops;

import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Insira o " + i + "º" +" número: ");
            numero = scanner.nextInt();
            soma += numero;
        }

        System.out.println("A soma total dos números digitados é: " + soma);
    }
}
