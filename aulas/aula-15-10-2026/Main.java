import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> lista = new LinkedList<>();

        lista.add("A"); // acrescentar("A")
        lista.add("B"); // acrescentar("B")
        lista.add("C"); // acrescentar("C")
        System.out.println("Após acrescentar: " + lista);

        lista.add(1, "X"); // inserir(1, "X")
        System.out.println("Após inserir(1, X): " + lista);

        lista.remove(2); // remover(2)
        System.out.println("Após remover(2): " + lista);

        System.out.println("buscar(X): índice = " + lista.indexOf("X"));  // buscar("X")
        System.out.println("obter(1): " + lista.get(1)); // obter(1)

        lista.set(1, "Z"); // atualizar(1, "Z")
        System.out.println("Após atualizar(1, Z): " + lista);

        lista.addFirst("I"); // inserir no início
        lista.removeLast();  // remover do fim
        System.out.println("Após inserir no início e remover do fim: " + lista);
    }
}