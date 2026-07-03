import java.util.Scanner;

public class Ex10 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;

        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();

        return valor_inteiro;
    }

    public static void main(String[] args) {

       int numero, soma;

       numero = lerInteiro("Digite um numero inteiro nao negativo: ");

        while (true) {
            soma = 0;

            for (int divisor = 1; divisor < numero; divisor++) {
                if (numero % divisor == 0) {
                    soma = soma + divisor;
                }
            }

            if (soma == numero) {
                System.out.println(numero);
                break;
            }

            numero++;
        } 
    }
}