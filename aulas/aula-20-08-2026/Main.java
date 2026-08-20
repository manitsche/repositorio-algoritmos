import java.util.Scanner;

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static boolean verificarPalindromoComFor(String palavra) {
        for (int i = 0; i < palavra.length() / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) {
                return false;
            }

        }
        return true;
    }

    public static boolean verificarPalindromoComWhile(String palavra) {
        int inicio = 0;
        int fim = palavra.length() - 1;
        while (inicio < fim) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                return false;
            }
            inicio = inicio + 1;
            fim = fim - 1;
        }
        return true;
    }

    public static boolean verificarSenha(String senha) {
        if (senha.length() < 6 || senha.length() > 12) {
            return false;
        }

        boolean temMaiuscula = false;
        boolean temNumero = false;

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                temMaiuscula = true;
            }
            if (c >= '0' && c <= '9') {
                temNumero = true;
            }
        }
        
        return temMaiuscula && temNumero;
    }

    public static String substituirCaracteres(String palavra, char caractereAntigo, char caractereNovo) {
        StringBuilder novaPalavra = new StringBuilder();
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c == caractereAntigo) {
                novaPalavra.append(caractereNovo);
            } else {
                novaPalavra.append(c);
            }
        }
        return novaPalavra.toString();
    }

    public static void main(String[] args) {
        System.out.println("========== Palindromos ==========");
        System.out.println("Digite uma palavra:");
        String palavra = entrada.nextLine();
        System.out.println("A palavra é um palíndromo (com for)? " + verificarPalindromoComFor(palavra));
        System.out.println("A palavra é um palíndromo (com while)? " + verificarPalindromoComWhile(palavra));

        System.out.println("========== Senha - Ex07 ==========");
        System.out.println("Digite uma senha:");
        String senha = entrada.nextLine();

        if (verificarSenha(senha)) {
            System.out.println("Senha válida");
        } else {
            System.out.println("Senha inválida");

            if (senha.length() < 6 || senha.length() > 12) {
                System.out.println("- O comprimento deve estar entre 6 e 12 caracteres.");
            }
        

            boolean temMaiuscula = false;
            boolean temNumero = false;

            for (int i = 0; i < senha.length(); i++) {
                char c = senha.charAt(i);
                if (c >= 'A' && c <= 'Z') {
                    temMaiuscula = true;
                }
            
                if (c >= '0' && c <= '9') {
                    temNumero = true;
                }
            }

            if (!temMaiuscula) {
                System.out.println("- A senha deve ter pelo menos uma letra maiúscula.");
            }
            if (!temNumero) {
                System.out.println("- A senha deve ter pelo menos um número.");
            }
        }
    }
}   