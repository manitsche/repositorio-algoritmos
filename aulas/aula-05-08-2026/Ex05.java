import java.util.Scanner;

public class Ex05 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;

        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();

        return valor_inteiro;
    }

    public static void main(String[] args) {

        int[] va = new int[10];
        int[] vb = new int[10];
        int posicao = 0;

        for (int i = 0; i < 10; i++) {
            va[i] = lerInteiro("Informe um valor para a posicao " + i + " do vetor: ");
        }

        for (int i = 0; i < 10; i++) {
            if (va[i] % 2 == 0) {
                vb[posicao] = va[i];
                posicao = posicao + 1;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (va[i] % 2 != 0) {
                vb[posicao] = va[i];
                posicao = posicao + 1;
            }
        }
        
        System.out.print("vb: [ ");
        for (int i = 0; i < vb.length; i++) {
            System.out.print(vb[i] + " ");
        }

        System.out.print("]");
        System.out.println();
    }
}