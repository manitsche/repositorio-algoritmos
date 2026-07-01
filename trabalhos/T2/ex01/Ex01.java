import java.util.Scanner;

public class Ex01 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;

        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();

        return valor_inteiro;
    }

    public static void main(String[] args) {

        int numero;

        numero = lerInteiro("Digite um numero inteiro: ");

        for (int linha = 0; linha < numero; linha++) {
            for (int nasteriscos = 0; nasteriscos < numero; nasteriscos++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}