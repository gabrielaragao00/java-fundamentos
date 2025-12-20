package condicionais;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero1;
        double numero2;
        String operacao;

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Selecione a operação (+, -, *, /): ");
        operacao = scanner.nextLine();

        switch (operacao) {
            case "+":
                double soma = (numero1 + numero2);
                System.out.println(numero1 + " + " + numero2 + " = " + soma);
                break;
            case "-":
                double subtracao = (numero1 - numero2);
                System.out.println(numero1 + " - " + numero2 + " = " + subtracao);
                break;
            case "*":
                double multiplicacao = (numero1 * numero2);
                System.out.println(numero1 + " * " + numero2 + " = " + multiplicacao);
                break;
            case "/":
                double divisao = (numero1 / numero2);
                System.out.println(numero1 + " / " + numero2 + " = " + divisao);
                break;
            default:
                System.out.println("Operação inválida");
        }
    }
}
