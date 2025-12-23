package strings;

import java.util.Scanner;

public class ContarVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra;
        int contador = 0;

        System.out.print("Digite uma palavra: ");
        palavra = scanner.nextLine();

        String palavraMinuscula = palavra.toLowerCase();

        for (int i = 0; i < palavraMinuscula.length(); i++) {
            char caractere = palavraMinuscula.charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contador++;
            }
        }

        System.out.println("Número de vogais: " + contador);
    }
}
