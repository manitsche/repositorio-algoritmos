import java.util.Scanner;

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;

        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();

        return valor_inteiro;
    }

    public static void main(String[] args) {

       int[] idades = {59, 34, 35, 24, 31, 30};
       int[] idades2;
       int[] idades3;
       
       // System.out.println(idades[6]); -> Index out of bounds, está tentando acessar uma posição que não existe no vetor

       // Alocando vetor
        
       idades2 = new int[10];

       System.out.println("Tamanho do vetor 1: " + idades.length);
       System.out.println("Tamanho do vetor 2: " + idades2.length);

       System.out.println("================================");

       // Vetor de 6 posições

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

        System.out.println("================================");

        // Vetor de 10 posições alocadas

        for (int i = 0; i < idades2.length; i++) {
            idades2[i] = lerInteiro("Digite a idade da posição " + i + ": ");
        }

        System.out.println("================================");

        // Perguntar ao usuário quantos valores ele deseja armazenar no vetor e alocar dinamicamente
        
        int tamanho = lerInteiro("Quantos valores deseja armazenar no vetor? ");
        idades3 = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            idades3[i] = lerInteiro("Digite a idade da posição " + i + ": ");
        }
    }
}