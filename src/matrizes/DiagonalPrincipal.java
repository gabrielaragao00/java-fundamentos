package matrizes;

public class DiagonalPrincipal {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int somador = 0;

        for (int i = 0; i < matriz.length; i++) {
                somador += matriz[i][i];
        }

        System.out.println("A soma dos elementos da diagonal principal é: " + somador);
    }
}
