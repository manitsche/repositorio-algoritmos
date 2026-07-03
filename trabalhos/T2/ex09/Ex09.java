import java.util.Scanner;

public class Ex09 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;

        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();

        return valor_inteiro;
    }

    public static void main(String[] args) {

        int inicio, fim, soma;

        inicio = lerInteiro("Digite o inicio do intervalo: ");
        fim = lerInteiro("Digite o fim do intervalo: ");

        for (int numero = inicio; numero <= fim; numero++) {
            soma = 0;
            for (int divisor = 1; divisor < numero; divisor++) {
                if (numero % divisor == 0) {
                    soma = soma + divisor;
                }
            }

            if (soma == numero) {
                System.out.println(numero);
            }
        }
    }
}