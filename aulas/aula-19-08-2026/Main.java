import java.util.Scanner;

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static int contarVogais(String palavra) {
        int contador = 0;
        palavra = palavra.toLowerCase();
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static String inverterPalavra(String palavra) {
        String invertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);
        }
        return invertida;
    }

    public static String removerEspacos(String frase) {
        String espaco = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c != ' ') {
                espaco = espaco + c;
            }
        }
        return espaco;
    }

    public static boolean verificarPalindromo(String palavra) {
        String invertida = inverterPalavra(palavra);
        if (palavra.equalsIgnoreCase(invertida)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        
        String nome = "Marco Antonio";
        String outroNome = "Elisson";
        String palavra = "Algoritmo"; 

        System.out.println(nome);
        System.out.println(outroNome);

        System.out.println(nome == outroNome);

        int[] vetor = {1, 2, 3};
        
        System.out.println("Posição na 'lista' de Strings com charAt(posicao): " + nome.charAt(0));

        System.out.println(nome.substring(0, 3));

        System.out.println("Quantidade de vogais na palavra " + palavra + ": " + contarVogais(palavra));

        System.out.println("Palavra invertida: " + inverterPalavra(palavra));

        System.out.println("Digite uma frase: ");
        String frase = entrada.nextLine();
        System.out.println("Frase sem espaços: " + removerEspacos(frase));

        System.out.println("Digite uma palavra para verificar se é palíndromo: ");
        String palavraPalindromo = entrada.nextLine();
        boolean ehPalindromo = verificarPalindromo(palavraPalindromo);
        System.out.println("A palavra " + palavraPalindromo + " é palíndromo? " + ehPalindromo);
    }
}