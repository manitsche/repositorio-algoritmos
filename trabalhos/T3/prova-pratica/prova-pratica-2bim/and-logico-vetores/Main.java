// ==SUBMIT==
// PROBLEM_ID=17
// LANG=java
// LIST_PROBLEM_ID=17
// ==SUBMIT==

import java.util.Scanner;

public class Main {

    // Variáveis
    public static boolean[] aplicarELogicoVetores(boolean[] v, boolean[] w) {
        boolean[] r = new boolean[v.length];

        // Processamento
        for (int i = 0; i < v.length; i++)
            r[i] = v[i] && w[i];

        // Saída
        return r;
    }

    public static void mostrarVetor(boolean[] vetor) {
        //Variáveis
        String s = "";
        int i;
        
        //Processamento
        s = s + "[";
        for (i = 0; i < vetor.length; i++) {
            if (i > 0) {
                s = s + ",";
            }
            s = s + vetor[i];
        }
        s = s + "]";
        
        //Saída
        System.out.println(s);
    }

    public static void main(String[] args) {
        // Variáveis
        Scanner entrada;
        int n, i;
        boolean[] v, w, resultado;

        // Entrada
        entrada = new Scanner(System.in);
        n = entrada.nextInt();
        v = new boolean[n];
        for (i = 0; i < n; i++) {
            v[i] = entrada.nextBoolean();
        }
        w = new boolean[n];
        for (i = 0; i < n; i++) {
            w[i] = entrada.nextBoolean();
        }

        // Processamento
        resultado = aplicarELogicoVetores(v, w);

        // Saída
        mostrarVetor(resultado);
    }
}
