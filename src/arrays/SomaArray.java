package arrays;

import java.util.Scanner;

public class SomaArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        int numero;
        int somador = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numero = scanner.nextInt();
            vetor[i] = numero;
            somador += vetor[i];
        }

        System.out.println("A soma total dos números digitados é: " + somador);
    }
}
