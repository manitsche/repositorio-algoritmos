import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite a quantidade de elementos: ");
        int n = entrada.nextInt();

        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            v[i] = entrada.nextInt();
        }

        System.out.println("\nVetor original: " + Arrays.toString(v));

        System.out.println("\nEscolha o método de ordenação:");
        System.out.println("1 - Bubble Sort Iterativo");
        System.out.println("2 - Bubble Sort Recursivo");
        System.out.print("Opção: ");

        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                bubbleSort(v);
                break;
            case 2:
                bubbleSortRecursivo(v);
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("\nVetor ordenado: " + Arrays.toString(v));
    }

    public static void bubbleSortRecursivo(int[] v) {
        bubbleSortRecursivo(v, v.length);
    }

    public static void bubbleSortRecursivo(int[] v, int fim) {

        if (fim > 1) {

            for (int j = 1; j < fim; j++) {

                if (v[j] < v[j - 1]) {
                    troca(v, j, j - 1);
                }
            }

            bubbleSortRecursivo(v, fim - 1);
        }
    }

    public static void bubbleSort(int[] v) {

        int n = v.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (v[j] > v[j + 1]) {
                    troca(v, j, j + 1);
                }
            }
        }
    }

    public static void troca(int[] v, int i, int j) {

        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }
}