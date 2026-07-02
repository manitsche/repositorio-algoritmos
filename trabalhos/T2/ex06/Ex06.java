import java.util.Scanner;

public class Ex06 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;

        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();

        return valor_inteiro;
    }

    public static void main(String[] args) {

        int n;

        n = lerInteiro("Digite um numero: ");

        for (int linha = 1; linha <= n; linha++) {
            for (int coluna = 1; coluna <= n; coluna++) {
                if (linha == 1 || linha == n || coluna == 1 || coluna == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}