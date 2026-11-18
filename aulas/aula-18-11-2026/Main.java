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
        System.out.println("1 - Insertion Sort Iterativo");
        System.out.println("2 - Insertion Sort Recursivo");
        System.out.println("3 - Selection Sort Iterativo");
        System.out.println("4 - Selection Sort Recursivo");
        System.out.print("Opção: ");

        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                insertionSort(v);
                break;
            case 2:
                insertionSortRec(v);
                break;
            case 3:
                selectionSort(v);
                break;
            case 4:
                selectionSortRec(v);
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("\nVetor ordenado: " + Arrays.toString(v));
    }

    public static void troca(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

    // INSERTION SORT ITERATIVO
    public static void insertionSort(int[] v) {
        int i, j;

        for (j = 1; j < v.length; j++) {
            i = j;

            while (i > 0 && v[i] < v[i - 1]) {
                troca(v, i, i - 1);
                i--;
            }
        }
    }

    // INSERTION SORT RECURSIVO
    public static void insertionSortRec(int[] v) {
        insertionSortRec_(v, 1);
    }

    public static void insertionSortRec_(int[] v, int end) {

        if (end >= v.length) {
            return;
        }

        int i = end;

        while (i > 0 && v[i] < v[i - 1]) {
            troca(v, i, i - 1);
            i--;
        }

        insertionSortRec_(v, end + 1);
    }

    // SELECTION SORT ITERATIVO
    public static void selectionSort(int[] v) {
        int i, j, menor_val, menor_pos;

        for (i = 0; i < v.length - 1; i++) {

            // Procura pelo menor valor
            menor_val = v[i];
            menor_pos = i;

            for (j = i + 1; j < v.length; j++) {
                if (v[j] < menor_val) {
                    menor_val = v[j];
                    menor_pos = j;
                }
            }

            // Troca o elemento de i pelo menor valor encontrado
            troca(v, i, menor_pos);
        }
    }

    // SELECTION SORT RECURSIVO
    public static void selectionSortRec(int[] v) {
        selectionSortRec_(v, 0);
    }

    public static void selectionSortRec_(int[] v, int ini) {
        int menor_val, menor_pos, j;

        if (ini < v.length - 1) {

            // Procura pelo menor valor
            menor_val = v[ini];
            menor_pos = ini;

            for (j = ini + 1; j < v.length; j++) {
                if (v[j] < menor_val) {
                    menor_val = v[j];
                    menor_pos = j;
                }
            }

            // Troca o elemento de ini pelo menor valor
            troca(v, ini, menor_pos);

            // Chamada recursiva a partir da próxima posição
            selectionSortRec_(v, ini + 1);
        }
    }
}
