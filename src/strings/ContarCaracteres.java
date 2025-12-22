import java.util.Scanner;

public class ContarCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra;

        System.out.print("Digite uma palavra: ");
        palavra = scanner.nextLine();

        System.out.println(palavra + ", quantidade de caracteres: " + palavra.length());
    }
}
