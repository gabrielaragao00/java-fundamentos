package matrizes;

public class SomaMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
                {2, 2, 2},
                {2, 2, 2},
                {2, 2, 2}
        };

        int somador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somador += matriz[i][j];
            }
        }
        System.out.println("A soma dos valores da matriz é: " + somador);
    }
}
