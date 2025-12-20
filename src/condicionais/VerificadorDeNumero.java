package condicionais;

import java.util.Scanner;

public class VerificadorDeNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número inteiro: ");
        numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("O número digitado é positivo");
        } else if (numero < 0) {
            System.out.println("O número digitado é negativo");
        } else {
            System.out.println("O número digitado é zero");
        }
    }
}
