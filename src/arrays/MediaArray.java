package arrays;

import java.util.Scanner;

public class MediaArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int somador = 0;
        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numero = scanner.nextInt();
            vetor[i] = numero;
            somador += vetor[i];
        }

        double media = somador / vetor.length;
        System.out.println("A média dos valores digitados é: " + media);
    }
}
