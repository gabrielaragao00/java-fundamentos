package metodos;

import java.util.Scanner;

public class MenuComMetodo {

    public static void exibirMenu() {
        System.out.println("Escolha uma opção do menu:\n" +
                "1 - Somar dois números\n" +
                "2 - Subtrair dois números\n" +
                "3 - Multiplicar dois números\n" +
                "4 - Dividir dois números\n" +
                "0 - Sair");
    }

    public static void opcoesMenu(int opcao, Scanner scanner) {
        int numero1;
        int numero2;
        switch (opcao) {
            case 1:
                System.out.println("Opção 1: SOMAR");
                System.out.print("Insira o primeiro número: ");
                numero1 = scanner.nextInt();
                System.out.print("Insira o segundo número: ");
                numero2 = scanner.nextInt();
                System.out.println("Resultado: " + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Opção 2: SUBTRAIR");
                System.out.print("Insira o primeiro número: ");
                numero1 = scanner.nextInt();
                System.out.print("Insira o segundo número: ");
                numero2 = scanner.nextInt();
                System.out.println("Resultado: " + numero1 + " - " + numero2 + " = " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Opção 3: MULTIPLICAR");
                System.out.print("Insira o primeiro número: ");
                numero1 = scanner.nextInt();
                System.out.print("Insira o segundo número: ");
                numero2 = scanner.nextInt();
                System.out.println("Resultado: " + numero1 + " * " + numero2 + " = " + (numero1 * numero2));
                break;
            case 4:
                System.out.println("Opção 4: DIVIDIR");
                System.out.print("Insira o primeiro número: ");
                numero1 = scanner.nextInt();
                System.out.print("Insira o segundo número: ");
                numero2 = scanner.nextInt();

                if (numero2 == 0) {
                    System.out.println("Divisor inválido. Insira um valor diferente de 0.");
                }

                System.out.println("Resultado: " + numero1 + " / " + numero2 + " = " + (numero1 / numero2));
                break;
            case 0:
                System.out.println("Opção 0: SAIR");
                System.out.print("Programa encerrado.");
                break;

            default:
                System.out.println("Opção inválida.");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        exibirMenu();
        int opcao = scanner.nextInt();

        opcoesMenu(opcao, scanner);
    }
}

