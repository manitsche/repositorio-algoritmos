import java.util.Scanner;

public class Ex13 {

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

        int n = lerInteiro("Digite a quantidade de alunos: ");

        int[] id = new int[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];
        double[] nota3 = new double[n];
        double[] nota4 = new double[n];
        double[] media = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nAluno " + (i + 1));
            id[i] = lerInteiro("Digite o ID do aluno: ");
            nota1[i] = lerReal("Digite a nota do 1º bimestre: ");
            nota2[i] = lerReal("Digite a nota do 2º bimestre: ");
            nota3[i] = lerReal("Digite a nota do 3º bimestre: ");
            nota4[i] = lerReal("Digite a nota do 4º bimestre: ");

            media[i] = (nota1[i] + nota2[i] + nota3[i] + nota4[i]) / 4;
        }

        System.out.println("\nRESULTADO FINAL");

        for (int i = 0; i < n; i++) {
            System.out.println("ID: " + id[i]);
            System.out.println("Média: " + media[i]);

            if (media[i] >= 70.0) {
                System.out.println("Situação: Aprovado");
            } else {
                System.out.println("Situação: Reprovado");
            }

            System.out.println();
        }
    }
}