package matrizes;

public class MatrizTransposta {
    public static void main(String[] args) {
        int[][] matriz = {
                {2, 5, 4},
                {3, 7, 0}
        };
        int[][] matrizTransposta = new int[3][2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz original: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatriz transposta: ");
        for (int i = 0; i < matrizTransposta.length; i++) {
            for (int j = 0; j < matrizTransposta[i].length; j++) {
                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
