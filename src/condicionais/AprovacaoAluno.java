package condicionais;

import java.util.Scanner;

public class AprovacaoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1;
        double nota2;

        System.out.print("Insira a primeira nota do aluno: ");
        nota1 = scanner.nextDouble();
        System.out.print("Insira a segunda nota do aluno: ");
        nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("O aluno foi APROVADO com média " + media);
        } else if (media >= 5 & media < 7) {
            System.out.println("O aluno deve fazer RECUPERAÇÃO, a média foi " + media);
        } else {
            System.out.println("O aluno foi REPROVADO com média " + media);
        }
    }
}
