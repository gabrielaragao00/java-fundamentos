package basico;

import java.util.Scanner;

public class ConversaoTipos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numeroDecimal;

        System.out.print("Digite um número decimal: ");
        numeroDecimal = scanner.nextDouble();

        //O número decimal digitado pelo usuário, foi convertido na linha abaixo
        //para um tipo inteiro.
        int numeroInteiro = (int) numeroDecimal;

        System.out.println("Número decimal: " + numeroDecimal);
    }
}
