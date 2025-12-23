package metodos;

import java.util.Scanner;

public class ParOuImparMetodo {
    public static boolean parOuImpar(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        if (parOuImpar(numero)) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
    }
}
