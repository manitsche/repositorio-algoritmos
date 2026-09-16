// ==SUBMIT==
// PROBLEM_ID=14
// LANG=java
// LIST_PROBLEM_ID=14
// ==SUBMIT==

import java.util.Scanner;

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static int[][] buscarValor(int[][] matriz, int x) {
        int count = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == x) {
                    count++;
                }
            }
        }

        int[][] posicoes = new int[count][2];
        int index = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == x) {
                    posicoes[index][0] = i;
                    posicoes[index][1] = j;
                    index++;
                }
            }
        }

        return posicoes;
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

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            mostrarVetor(linha);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matriz = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        int[][] posicoes = buscarValor(matriz, x);

        System.out.println(posicoes.length);
        mostrarMatriz(posicoes);
    }
}