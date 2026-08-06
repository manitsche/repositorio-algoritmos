import java.util.Scanner;

public class Ex02 {

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
        int[] vc = new int[10];

        for (int i = 0; i < va.length; i++) {
            va[i] = lerInteiro("Digite os numeros do vetor A: ");
        }
        
        for (int i = 0; i < vb.length; i++) {
            vb[i] = lerInteiro("Digite os numeros do vetor B: ");
        }

        for (int i = 0; i < vc.length; i++) {
            if (i % 2 == 0) {
                vc[i] = va[i] + vb[i];
            } else {
                vc[i] = va[i] - vb[i];
            }
        }

        System.out.print("va: [ ");
        for (int i = 0; i < va.length; i++) {
            System.out.print(va[i] + " ");
        }

        System.out.print("]");
        System.out.println();

        System.out.print("vb: [ ");
        for (int i = 0; i < vb.length; i++) {
            System.out.print(vb[i] + " ");
        }

        System.out.print("]");
        System.out.println();

        System.out.print("vc: [ ");
        for (int i = 0; i < vc.length; i++) {
            System.out.print(vc[i] + " ");
        }

        System.out.print("]");
        System.out.println();
    }
}