// ==SUBMIT==
// PROBLEM_ID=12
// LANG=java
// LIST_PROBLEM_ID=12
// ==SUBMIT==

import java.util.Scanner;

public class Main {

    public static boolean[] negar(boolean[] vetor) {
        // TODO: implemente a negação do vetor aqui

        boolean[] resultado = new boolean[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            resultado[i] = !vetor[i];
        }

        return resultado;
    }

    public static void mostrarVetor(boolean[] vetor) {
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
        boolean[] vetor = new boolean[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextBoolean();
        }

        boolean[] resultado = negar(vetor);

        mostrarVetor(resultado);
    }
}
