import java.util.Scanner;

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;

        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();

        return valor_inteiro;
    }

    public static double lerReal(String mensagem) {

        double valor_real;

        System.out.print(mensagem); // Entrada em uma unica linha
        valor_real = entrada.nextDouble();

        return valor_real;
    }

    public static void ex01() {
        int i = 0;
        
        System.out.println("Contagem de 0 a 10 usando while:");

        while (i <= 10) {
            System.out.println(i);
            i = i + 1 ;
        }

        System.out.println("Contagem de 0 a 10 usando for:");

        for (int j = 0; j <= 10; j++) {
            System.out.println(j);
        }
    }

    public static void ex02() {
        int valor_inteiro;

        valor_inteiro = lerInteiro("Digite um valor inteiro: ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(valor_inteiro + " X " + i + " = " + (valor_inteiro * i));
        }
    }

    public static void ex03() {
        int n;

        n = lerInteiro("Digite um valor inteiro: ");    

        for (int i = 1; i <= n; i++) {
            System.out.println(i * i);
        }
    }

    public static void ex04() {
        int n, soma, acum;;

        n = lerInteiro("Digite um valor inteiro: ");    
        soma = 2;
        acum = 0;

        for (int i = 1; i <= n; i++) {
                acum = acum + i * soma;
        }

        System.out.println("A soma dos números pares é: " + acum);
    }

    public static void ex05() {
        int n, soma;

        n = lerInteiro("Digite um valor inteiro: ");    
        soma = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                soma = soma + i;
            }
        }

        System.out.println("A soma dos números divisíveis é: " + soma);
    }

    public static void ex06() {
        int n, contador;

        n = lerInteiro("Digite um valor inteiro: ");
        contador = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                contador++;
            }
        }

        if (contador == 2) {
            System.out.println(n + " é um número primo.");
        } else {
            System.out.println(n + " não é um número primo.");
        }
    }

    public static void main(String[] args) {
        
        // ex01();
        // ex02();
        // ex03();
        // ex04();
        // ex05();
        ex06();

    }
}