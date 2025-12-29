package matrizes;

import java.util.Scanner;

public class MaiorElementoMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite um número inteiro para posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int maiorNumero = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maiorNumero) {
                    maiorNumero = matriz[i][j];
                }
            }
        }

        System.out.println("O maior número da matriz é: " + maiorNumero);
    }
}
