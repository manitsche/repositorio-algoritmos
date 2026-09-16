// ==SUBMIT==
// PROBLEM_ID=11
// LANG=java
// LIST_PROBLEM_ID=11
// ==SUBMIT==

import java.util.Scanner;

public class Main {

    public static String substituir(String s, char antigo, char novo) {
        // TODO: implemente a substituição de caracteres aqui
        // return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char antigo = sc.nextLine().charAt(0);
        char novo = sc.nextLine().charAt(0);

        String resultado = substituir(s, antigo, novo);

        System.out.println(resultado);
    }
}
