package basico;

import java.util.Scanner;

public class OperacoesAritmeticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero1;
        double numero2;

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextDouble();

        double soma = (numero1 + numero2);
        double subtração = (numero1 - numero2);
        double multiplicacao = (numero1 * numero2);
        double divisao = (numero1 / numero2);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtração);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

    }
}
