import java.util.Scanner;

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;

        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();

        return valor_inteiro;
    }

    public static void ex01() {

        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void ex02() {

        boolean eprimo;
        int numero, contador;

        contador = 0;

        numero = lerInteiro("Digite um numero inteiro: ");

        for (int i = 2; i <= numero; i++) {
            eprimo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    eprimo = false;
                    break;
                }
            }

            if (eprimo) {
                System.out.println(i);
                contador++;
            }
        }
        
        System.out.println("Quantidade de numeros primos ate " + numero + ": " + contador);
    }

    public static void ex03() {

        int a, b, proximo, numero;

        a = 1;
        b = 1;
        proximo = 0;

        numero = lerInteiro("Digite um numero inteiro: ");

        System.out.println("Sequencia de Fibonacci ate " + numero + ":");

        while (a <= numero) {
            System.out.println(a);
            proximo = a + b;
            a = b;
            b = proximo;
        }
    }

    public static void ex03() {

        int a = 1, b = 1, proximo;
        int numero = lerInteiro("Digite um numero inteiro: ");

        System.out.println("Sequencia de Fibonacci ate " + numero + ":");

        for (; a <= numero; ) {
            System.out.println(a);

            proximo = a + b;
            a = b;
            b = proximo;
        }
    }

    /* 

    public static void ex03() {

        int numero = lerInteiro("Digite um numero inteiro: ");

        System.out.println("Sequencia de Fibonacci ate " + numero + ":");

        int a = 1;
        int b = 1;

        while (a <= numero) {
            System.out.println(a);
            
            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
    
    */

    public static void main(String[] args) {
        
        // ex01();
        // ex02();
        ex03();
    }   
}
