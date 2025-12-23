package metodos;

import java.util.Scanner;

public class CalcularMediaMetodo {
    public static double media(double a, double b, double c) {
        double media = (a + b + c) / 3;
        return media;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero1;
        double numero2;
        double numero3;

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        numero3 = scanner.nextDouble();

        System.out.println("A média dos números é " + media(numero1, numero2, numero3));
    }
}
