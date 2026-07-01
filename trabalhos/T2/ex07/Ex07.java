import java.util.Scanner;

public class Ex07 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;

        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();

        return valor_inteiro;
    }

    public static void main(String[] args) {

        boolean eprimo;
        int inicio, fim;

        inicio = lerInteiro("Digite um numero inteiro para iniciar o intervalo: ");
        fim = lerInteiro("Digite um numero inteiro para finalizar o intervalo: ");

        for (int i = inicio; i <= fim; i++) {

            if (i >= 2) {
                eprimo = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        eprimo = false;
                        break;
                    }
                }

                if (eprimo) {
                    System.out.println(i);
                }
            }
        }
    }
}