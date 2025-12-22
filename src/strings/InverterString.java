import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra;

        System.out.print("Digite uma palavra: ");
        palavra = scanner.nextLine();

        for(int i = palavra.length()-1; i >= 0; i--){
            System.out.print(palavra.charAt(i));
        }
    }
}
