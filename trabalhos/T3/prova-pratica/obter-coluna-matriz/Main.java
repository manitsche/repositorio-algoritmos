// ==SUBMIT==
// PROBLEM_ID=18
// LANG=java
// LIST_PROBLEM_ID=18
// ==SUBMIT==

import java.util.Scanner;

public class Main {

    public static int[] obterColunaMatriz(int[][] matriz, int i) {
        //Variáveis
        int[] coluna = new int[matriz.length];
        
        //Processamento
        for (int j = 0; j < matriz.length; j++) {
            coluna[j] = matriz[j][i];
        }
        
        //Retorno
        return coluna;
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
        int r, c, i;
        int linha, coluna;
        int[][] matriz;
        int[] resultado;

        // Entrada
        entrada = new Scanner(System.in);
        r = entrada.nextInt();
        c = entrada.nextInt();
        matriz = new int[r][c];
        for (linha = 0; linha < r; linha++) {
            for (coluna = 0; coluna < c; coluna++) {
                matriz[linha][coluna] = entrada.nextInt();
            }
        }
        i = entrada.nextInt();

        // Processamento
        resultado = obterColunaMatriz(matriz, i);

        // Saída
        mostrarVetor(resultado);
    }
}


