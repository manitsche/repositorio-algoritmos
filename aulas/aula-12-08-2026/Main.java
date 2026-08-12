import java.util.Scanner;

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static void mostrarVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println();
    }

    public static void alterarVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = vetor[i] * 2;
        }
    }

    public static int somaVetor(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        System.out.println("Soma do vetor: " + soma);
        return soma;
    }

    public static void definirValorVetor(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = valor;
        }
    }

    public static int obterPosicaoInteiro(int[] vetor, int valor, int posicaoInicial) {
        for (int i = posicaoInicial; i < vetor.length; i++) {
            if (vetor[i] == valor) {    
                return i;
            }
        }
        
        return -1; 
    }

    public static boolean[] valoresIguais(int[] vetor1, int[] vetor2) {
        boolean[] resultado = new boolean[vetor1.length];

        for (int i = 0; i < vetor1.length; i++) {
            resultado[i] = (vetor1[i] == vetor2[i]);
        }

        return resultado;
    }
    
    public static void main(String[] args) {

        System.out.println("========== Numeros ==========");

        int[] numeros = {20, 21, 22, 23, 24, 25, 26, 27, 28, 29};

        System.out.println("Soma do vetor: " + somaVetor(numeros));
        
        mostrarVetor(numeros);
        alterarVetor(numeros);
        mostrarVetor(numeros);

        /*
        Passagem de parametros por valor e por referencia

        Por valor = O contúdo da variável é literalmente copiado para outra variável.

        Por referência = O endereço de memória da variável é copiado para outra variável.
        */

        System.out.println("========== Numeros 2 ==========");

        System.out.print("Digite o tamanho do vetor: ");
        int i = entrada.nextInt();
    
        int[] numeros2 = new int[i];

        definirValorVetor(numeros2, i);
        mostrarVetor(numeros2);

        System.out.println("========== Numeros 3 ==========");

        int[] numeros3 = {5, 8, 4, 3, 2, 8, 2, 1, 9, 3, 4, 9, 2};

        mostrarVetor(numeros3);

        System.out.println("Digite o valor que deseja procurar no vetor: ");
        int valor = entrada.nextInt();
        System.out.println("Imforme a posicao inicial para a busca: ");
        int posicaoInicial = entrada.nextInt();

        int posicao = obterPosicaoInteiro(numeros3, valor, posicaoInicial);

        if (posicao != -1) {
            System.out.println("O valor " + valor + " foi encontrado na posição: " + posicao);
        } else {
            System.out.println("O valor " + valor + " não foi encontrado no vetor.");
        }
    }
}