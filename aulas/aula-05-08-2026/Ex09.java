import java.util.Scanner;

public class Ex09 {

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
            vc[i] = va[i] - vb[i];
        }

        System.out.print("vc: [ ");
        for (int i = 0; i < vc.length; i++) {
            System.out.print(vc[i] + " ");
        }

        System.out.print("]");
        System.out.println();
    }
}