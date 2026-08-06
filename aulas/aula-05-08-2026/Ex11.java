import java.util.Scanner;

public class Ex11 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        return entrada.nextInt();
    }

    public static double lerReal(String mensagem) {
        System.out.print(mensagem);
        return entrada.nextDouble();
    }

    public static void main(String[] args) {

        int[] numeroAluno = new int[10];
        double[] altura = new double[10];

        for (int i = 0; i < 10; i++) {
            numeroAluno[i] = lerInteiro("Digite o número do aluno: ");
            altura[i] = lerReal("Digite a altura do aluno: ");
        }

        int maisAlto = numeroAluno[0];
        int maisBaixo = numeroAluno[0];
        double maiorAltura = altura[0];
        double menorAltura = altura[0];

        for (int i = 1; i < 10; i++) {
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
                maisAlto = numeroAluno[i];
            }

            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
                maisBaixo = numeroAluno[i];
            }
        }

        System.out.println("\nAluno mais alto:");
        System.out.println("Número: " + maisAlto);
        System.out.println("Altura: " + maiorAltura + " m");

        System.out.println("\nAluno mais baixo:");
        System.out.println("Número: " + maisBaixo);
        System.out.println("Altura: " + menorAltura + " m");
    }
}