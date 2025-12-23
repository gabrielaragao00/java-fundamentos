package strings;

import java.util.Scanner;

public class CompararStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra1;
        String palavra2;

        System.out.print("Digite uma palavra: ");
        palavra1 = scanner.nextLine();
        System.out.print("Digite outra palavra: ");
        palavra2 = scanner.nextLine();

        System.out.println(palavra1.equals(palavra2));
        System.out.println(palavra1.equalsIgnoreCase(palavra2));
    }
}
