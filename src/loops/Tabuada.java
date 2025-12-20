package loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.print("Digite um número para ver a sua tabuada: ");
        numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "*" + i + " = " + (numero*i));
        }
    }
}
