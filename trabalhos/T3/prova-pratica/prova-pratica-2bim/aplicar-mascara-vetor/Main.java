// ==SUBMIT==
// PROBLEM_ID=16
// LANG=java
// LIST_PROBLEM_ID=16
// ==SUBMIT==

import java.util.Scanner;

public class Main {

    public static int[] aplicarMascaraVetores(int[] v, boolean[] mascara) {
        // Variáveis
        int qtd = 0;
        
        for (int i = 0; i < v.length; i++)
            if (mascara[i]) {
                qtd++;
            }

        int[] r = new int[qtd];
        int p = 0;
        
        // Processamento
        for (int i = 0; i < v.length; i++)
            if (mascara[i]) r[p++] = v[i];

        // Saída
        return r;
    }

    public static void mostrarVetor(int[] vetor) {
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
        int n;
        int[] v;
        boolean[] mascara;
        int i;
        int[] resultado;

        // Entrada
        entrada = new Scanner(System.in);
        n = entrada.nextInt();
        v = new int[n];
        for (i = 0; i < n; i++) {
            v[i] = entrada.nextInt();
        }
        mascara = new boolean[n];
        for (i = 0; i < n; i++) {
            mascara[i] = entrada.nextBoolean();
        }

        // Processamento
        resultado = aplicarMascaraVetores(v, mascara);

        // Saída
        mostrarVetor(resultado);
    }
}
