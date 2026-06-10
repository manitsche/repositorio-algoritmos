public class Exemplo {

    public static void decrescente(int x) {
       if (x > 0) {
            System.out.println(x);
            decrescente(x - 1);
       }
    }

    public static int somatorio(int x) {
        if (x > 0) {
            return x + somatorio(x - 1);
        }

        return 0;
    }

    public static int fatorial(int x) {
        if (x == 0) {
            return 1;
        }

        return x * fatorial(x - 1);
    }
    
    public static void main(String[] args) {
        
        System.out.println("Funcao decrescente com recursao:");
        decrescente(5);
        
        System.out.println("Funcao somatorio com recursao:");
        System.out.println(somatorio(5));
    
        System.out.println("Funcao fatorial com recursao:");
        System.out.println(fatorial(5));
    }
}
