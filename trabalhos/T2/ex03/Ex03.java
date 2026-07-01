import java.util.Scanner;

public class Ex03 {

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

        for (int linha = n; linha >= 1; linha--) {
            for (int qtdasteriscos = 1; qtdasteriscos <= linha; qtdasteriscos++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}