package metodos;

import java.util.Scanner;

public class SomaComMetodo {
    public static int somar(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextInt();

        int resultado = somar(numero1, numero2);

        System.out.println("O resultado da soma é: " +  resultado);
    }
}
