import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra;

        System.out.print("Digite uma palavra: ");
        palavra = scanner.nextLine();

        StringBuilder reversed = new StringBuilder(palavra);
        reversed.reverse();

        if (palavra.equals(reversed.toString())) {
            System.out.println(palavra + " é um palíndromo");
        } else {
            System.out.println(palavra + " não é um palíndromo");
        }
    }
}

