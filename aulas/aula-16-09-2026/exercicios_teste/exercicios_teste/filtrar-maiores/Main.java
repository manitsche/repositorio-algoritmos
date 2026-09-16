// ==SUBMIT==
// PROBLEM_ID=13
// LANG=java
// LIST_PROBLEM_ID=13
// ==SUBMIT==

import java.util.Scanner;

public class Main {

    public static int[] filtrarMaiores(int[] vetor, int valor) {
        int quantidade = 0;

        // Conta quantos elementos são maiores que valor
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > valor) {
                quantidade++;
            }
        }

        // Cria o vetor com o tamanho necessário
        int[] resultado = new int[quantidade];

        int posicao = 0;

        // Preenche o vetor mantendo a ordem original
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > valor) {
                resultado[posicao] = vetor[i];
                posicao++;
            }
        }

        return resultado;
    }

    public static void mostrarVetor(int[] vetor) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < vetor.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(vetor[i]);
        }
        sb.append(']');
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
        }

        int valor = sc.nextInt();

        int[] resultado = filtrarMaiores(vetor, valor);

        mostrarVetor(resultado);
    }
}
