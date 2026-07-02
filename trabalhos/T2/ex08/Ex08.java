import java.util.Scanner;

public class Ex08 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;

        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();

        return valor_inteiro;
    }

    public static void main(String[] args) {

        int n, superior, inferior, esquerda, direita, menor;

        n = lerInteiro("Digite um nummero: ");

        for (int linha = 1; linha <= n; linha++) {
            for (int coluna = 1; coluna <= n; coluna++) {
                
                superior = linha - 1;
                inferior = n - linha;
                esquerda = coluna - 1;
                direita = n - coluna;
                
                menor = superior;
                
                if (inferior < menor) {
                    menor = inferior;
                }

                if (esquerda < menor) {
                    menor = esquerda;
                }

                if (direita < menor) {
                    menor = direita;
                }

                System.out.print((menor + 1) + " ");
            }

            System.out.println();
        }
    }
}