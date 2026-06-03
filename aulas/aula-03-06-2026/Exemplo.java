public class Exemplo {

    public static void cabecalho() {
        System.out.println("===============================");
    }

    public static void rodape() {
        System.out.println("===============================");
    }

    public static void inicial(String nome, String sobrenome) {
        System.out.println("Ola, " + nome + " " + sobrenome);
    }

    public static int soma(int a, int b) {
        
        int resultado = a + b;
        
        return resultado;
    }
    
    public static void main(String[] args) {

        cabecalho();

        inicial("Marco Antonio", "Nitsche");

        System.out.println("Função soma: " + soma(10, 6));

        rodape();
    }   
}