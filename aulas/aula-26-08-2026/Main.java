import java.util.Scanner;

public class Main {

    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
    
        int[][] matriz = new int[2][2];

        matriz[0][0] = 10;
        matriz[0][1] = 11;
        matriz[1][0] = 20;
        matriz[1][1] = 21;

        System.out.println(matriz[0][0]);
        System.out.println(matriz[0][1]);
        System.out.println(matriz[1][0]);
        System.out.println(matriz[1][1]);

        matriz = new int[5][5];
        int valor = 5;
        
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                matriz[l][c] = valor;
            }
        }

        for (int l = 0; l < matriz.length; l++) {
            System.out.print("[");
            for (int c = 0; c < matriz[l].length; c++) {
                if (c == matriz[l].length - 1) {
                    System.out.print(matriz[l][c]);
                } else {
                    System.out.print(matriz[l][c] + " ");

                }
            }
            System.out.print("]");
            System.out.println();
        }
    }
}