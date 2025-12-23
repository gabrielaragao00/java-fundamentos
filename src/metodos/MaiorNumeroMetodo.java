package metodos;

import java.util.Scanner;

public class MaiorNumeroMetodo {
    public static int maiorNumero(int numero1, int numero2) {
        int maior = numero1;
        int menor = numero1;

        if (numero1 > numero2) {
            maior = numero1;
        } else {
            maior = numero2;
        }
        return maior;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.print("Digite um número: ");
        numero1 = scanner.nextInt();
        System.out.print("Digite outro numero: ");
        numero2 = scanner.nextInt();

        System.out.println("Maior número: " + maiorNumero(numero1, numero2));
    }
}
