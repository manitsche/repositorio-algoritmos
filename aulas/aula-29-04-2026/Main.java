import java.util.Scanner;

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;

        System.out.print(mensagem); // Entrada em uma unica linha
        valor_inteiro = entrada.nextInt();

        return valor_inteiro;
    }

    public static void ex02() {
        int i, valor_inteiro;

        valor_inteiro = lerInteiro("Digite um valor inteiro: ");
        i = valor_inteiro;

        while(i >= 0) {
            if (i % 2 == 0) {
                System.out.println(i + " é par");
            } else {
                System.out.println(i + " é impar");
            }

            i = i - 1;
        }
    }

    public static void ex03() {
        int i, valor_inicial, valor_final;

        valor_inicial = lerInteiro("Digite o valor inicial: ");
        valor_final = lerInteiro("Digite o valor final: ");
        i = valor_inicial;

        while(i <= valor_final) {
            System.out.println(i);
            i = i + 1;
        }
    }

    public static void ex04() {
        int i, divisor;

        divisor = lerInteiro("Digite um valor inteiro: ");
        i = 1;

        while (i <= 20) {
            System.out.println(i + " X " + divisor + " = " + (i * divisor));
            i = i + 1;
        }
    }

    public static void main(String[] args) {

        // ex02();

        // ex03();
        
        ex04();
    }
}