import java.util.List;

class No {
    int valor;
    No prox; // Referência ao próximo nó (ou null)
}

class Lista {
    No inicio; // Primeiro nó (ou null)
}

public class Main {
    public static void main(String[] args) {
        
        No novo, atual;

        novo = new No();
        novo.valor = 15;

        Lista lista = new Lista();
        lista.inicio = novo;

        // Adicionando tres novos nós à lista

        atual = novo;
        novo = new No();
        novo.valor = 18;
        atual.prox = novo;
       
        atual = novo;
        novo = new No();
        novo.valor = 34;
        atual.prox = novo;
       
        atual = novo;
        novo = new No();
        novo.valor = 97;
        atual.prox = novo;
       
        atual = novo;
        novo = new No();
        novo.valor = 6;
        atual.prox = novo;

        /*

        System.out.println("Valor do terceiro nó: " + lista.inicio.valor);
        System.out.println("Valor do quarto nó: " + lista.inicio.prox.valor);
        System.out.println("Valor do quinto nó: " + lista.inicio.prox.prox.valor);
        System.out.println("Valor do sexto nó: " + lista.inicio.prox.prox.prox.valor);
        System.out.println("Valor do sétimo nó: " + lista.inicio.prox.prox.prox.prox.valor);

        */

        System.out.println("Lista antes de adicionar um novo nó:");

        mostrarLista(lista);

        // Lista depois de adicionar novos nós (com função)

        adicinarNaLista(lista, 32);
        adicinarNaLista(lista, 50);
        adicinarNaLista(lista, 12);

        System.out.println("Lista depois de adicionar novos nós (com função):");

        mostrarLista(lista);

        System.out.println("Lista depois de remover o nó da posição 3 (com função):");
        removerDaLista(lista, 3);
        mostrarLista(lista);
    }

    public static void mostrarLista(Lista lista) {
        No atual = lista.inicio;
        while (atual != null) {
            System.out.println(atual.valor);
            atual = atual.prox;
        }
    }

    public static void adicinarNaLista(Lista lista, int valor) {
        No novo = new No();
        novo.valor = valor;

        if (lista.inicio == null) {
            lista.inicio = novo;
        } else {
            No atual = lista.inicio;
            while (atual.prox != null) {
                atual = atual.prox;
            }
            atual.prox = novo;
        }
    }

    public static void removerDaLista(Lista lista, int valor) {
        No atual;
        int posicao_count = 0;
        
        atual = lista.inicio;

        while (posicao_count < valor - 1) {
            atual = atual.prox;
            posicao_count = posicao_count + 1;
        }

        atual.prox = atual.prox.prox;
    }
}