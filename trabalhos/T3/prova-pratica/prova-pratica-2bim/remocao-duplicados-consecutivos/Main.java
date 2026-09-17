// ==SUBMIT==
// PROBLEM_ID=15
// LANG=java
// LIST_PROBLEM_ID=15
// ==SUBMIT==

import java.util.Scanner;

public class Main {

    public static String removerDuplicados(String s) {
        // TODO: implemente a remoção de duplicados consecutivos aqui  
        
        //Variáveis
        String resultado = "";
        char anterior = '\0';

        //Processamento
        for (int i = 0; i < s.length(); i++) {
            char atual = s.charAt(i);
            if (atual != anterior) {
                resultado += atual;
            }
            anterior = atual;
        }

        //Retorno
        return resultado;
    }

    public static void main(String[] args) {
        // Variáveis
        Scanner entrada;
        String s, resultado;

        // Entrada
        entrada = new Scanner(System.in);
        s = entrada.nextLine();

        // Processamento
        resultado = removerDuplicados(s);

        // Saída
        System.out.println(resultado);
    }
}
