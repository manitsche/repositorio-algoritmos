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
        int[] numeros = new int[5];
        double media = 0;
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = lerInteiro("Digite os numeros: ");
            media = media + numeros[i];
        }

        media = media / numeros.length;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= media) {
                contador = contador + 1;
            }
        }

        System.out.println("Media: " + media);
        System.out.println("Quantidade de numeros maiores que a média: " + contador);
    }

    public static void ex02() {

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

        System.out.print("vc = [ ");
        for (int i = 0; i < vc.length; i++) {
            System.out.print(vc[i] + " ");
        }

        System.out.print("]");
        System.out.println();
    }

    public static void ex03() {

        // Aloca vetor
        int[] c = new int[10];

        // Leitura de dados
        for(int i = 0; i < c.length; i++){
            c[i] = lerInteiro("Valor: ");
        }

        // Mostra o vetor com os valores originais
        for(int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

        System.out.println();

        // Atualizar os valores negativos para 0
        for (int i = 0; i < c.length; i++) {
            if (c[i] < 0) {
                c[i] = 0;
            }
        }

        //Mostra o vetor com os valores atualizados e originais
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

        System.out.println();
    }

    public static void ex07() {

        int tamanho, npares = 0, nimpares = 0;
        
        tamanho = lerInteiro("Digite o tamanho do vetor: ");
        int[] vetor = new int[tamanho];
        int[] pares = new int[tamanho];
        int[] impares = new int[tamanho];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = lerInteiro("Digite o valor da posição " + i + ": ");

            if (vetor[i] % 2 == 0) {
                pares[npares] = vetor[i];
                npares++;
            } else {
                impares[nimpares] = vetor[i];
                nimpares++;
            }
        }    
    }

    public static void main(String[] args) {
    
        // ex01();

        // ex02();

        // ex03();

        ex07();
        


    }
}