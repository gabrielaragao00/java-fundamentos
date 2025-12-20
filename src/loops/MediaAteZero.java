package loops;

import java.util.Scanner;

public class MediaAteZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int somador = 0;
        int contador = 0;

        System.out.print("Digite um número (0 para sair): ");
        numero = scanner.nextInt();

        while (numero != 0) {
            somador += numero;
            contador++;

            System.out.print("Digite um número (0 para sair): ");
            numero = scanner.nextInt();
        }

        if (contador > 0){
            double media = (double) somador/contador;
            System.out.println("A média é: " + media);
        } else {
            System.out.println("Digite um número válido.");
        }
    }
}
