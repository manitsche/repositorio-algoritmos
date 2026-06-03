import java.util.Scanner;

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;

        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();

        return valor_inteiro;
    }

    public static int fatorial(int x) {
        
        int i, fatorial;

        if (x == 0) {
            fatorial = 1;
        }

        fatorial = 1;
        i = x;

        while (i > 1) {
            fatorial = fatorial * i;
            i = i - 1;
        }

        return fatorial;
    }

    public static void main(String[] args) {
        
        int valor;

        valor = lerInteiro("Digite um numero: ");

        System.out.println(valor + " fatorial é: " + fatorial(valor));
    }
}