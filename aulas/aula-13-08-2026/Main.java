import java.util.Scanner;

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static int[] alocarInteiros(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            int valor = 0;
            vetor[i] = valor;
        }

        return vetor;
    }

    public static int[] subvetor(int[] v, int a, int b) {
        int tamanho = b - a + 1;
        int[] subvetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            subvetor[i] = v[a + i];
        }

        return subvetor;
    }

    public static void main(String[] args) {
        
        System.out.println("========== Vetor ========== ");

        int[] vetor = alocarInteiros(10);

        System.out.print("[ ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.print("]");
        System.out.println();

        System.out.println("========== Vetor teste - EX 15 ========== ");

        int[] teste = {52, 34, 19, 55, 90, 27, 30, 82, 84, 12};

        System.out.print("[ ");
        for (int i = 0; i < teste.length; i++) {
            System.out.print(teste[i] + " ");
        }
        System.out.print("]");
        System.out.println();
        
        System.out.println("========== Subvetor - EX 20 ========== ");

        int[] vetor2 = subvetor(teste, 2, 5);

        System.out.print("[ ");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i] + " ");
        }
        System.out.print("]");
        System.out.println();
    }  
}