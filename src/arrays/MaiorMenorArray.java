package arrays;

import java.util.Scanner;

public class MaiorMenorArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int numero;

        System.out.print("Digite o 1º número: ");
        numero = scanner.nextInt();
        vetor[0] = numero;

        int menorNumero = numero;
        int maiorNumero = numero;

        for (int i = 1; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numero = scanner.nextInt();
            vetor[i] = numero;

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }

            if (numero < menorNumero) {
                menorNumero = numero;
            }

        }

        System.out.println("O menor número digitado foi " + menorNumero);
        System.out.println("O maior número digitado foi " + maiorNumero);
    }
}
