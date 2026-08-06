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

        int[] va = new int[10];
        int inicio = 0, fim = 9;
        int num;

        for (int i = 0; i < 10; i++) {
            num = lerInteiro("Informe um valor: ");

            if (num % 2 == 0) {
                va[inicio] = num;
                inicio = inicio + 1;
            } else {
                va[fim] = num;
                fim = fim - 1;
            }
        }

        System.out.print("va: [ ");
        for (int i = 0; i < va.length; i++) {
            System.out.print(va[i] + " ");
        }

        System.out.print("]");
        System.out.println();
    }
}