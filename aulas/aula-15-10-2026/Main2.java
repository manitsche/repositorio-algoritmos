import java.util.LinkedList;
import java.util.Scanner;

public class Main2 {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        
        LinkedList<String> lista = new LinkedList<>();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Inserir nome no fim da lista");
            System.out.println("2 - Remover nome por índice");
            System.out.println("3 - Consultar lista");
            System.out.println("4 - Sair");
            System.out.print("Opção escolhida: ");
            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome a ser inserido: ");
                    String nome = entrada.nextLine();
                    inserirNome(lista, nome);
                    break;
                case 2:
                    System.out.print("Digite o índice do nome a ser removido: ");
                    int indice = entrada.nextInt();
                    removerNomePorIndice(lista, indice);
                    break;
                case 3:
                    consultarLista(lista);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void inserirNome(LinkedList<String> lista, String nome) {
        lista.add(nome);
    }

    public static void removerNomePorIndice(LinkedList<String> lista, int indice) {
        lista.remove(indice);
    }

    public static void removerNomePassandoONome(LinkedList<String> lista, String nome) {
        int indice = lista.indexOf(nome);
        if (indice != -1) {
            lista.remove(indice);
        }
    }

    public static void consultarLista(LinkedList<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " - " + lista.get(i));
        }
    }
}