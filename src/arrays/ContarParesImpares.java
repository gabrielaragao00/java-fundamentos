package arrays;

import java.util.Scanner;

public class ContarParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contadorPares = 0;
        int contadorImpares = 0;
        int [] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }

        System.out.println("Foram digitados " + contadorPares + " números PARES.");
        System.out.println("Foram digitados " + contadorImpares + " números IMPARES.");
    }
}

