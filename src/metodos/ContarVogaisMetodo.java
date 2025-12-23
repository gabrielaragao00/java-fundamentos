package metodos;

import java.util.Scanner;

public class ContarVogaisMetodo {

    public static int contarVogais (String palavra) {
        int contador = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char caractere = palavra.charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra;

        System.out.print("Digite uma palavra: ");
        palavra = scanner.nextLine();

        String palavraMinuscula = palavra.toLowerCase();

        System.out.println("Número de vogais: " + contarVogais(palavraMinuscula));
    }
}
