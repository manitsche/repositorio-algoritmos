import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

class ProximaPosicao {
    int proximaLinha;
    int proximaColuna;
    boolean foiVisitada;
}

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite o nome do arquivo de entrada: ");
        String nomeArquivo = entrada.nextLine();

        try {
            Scanner leitor = new Scanner(new FileReader("entradas/" + nomeArquivo + ".txt"));

            // Leitura do cabeçalho do arquivo
            int L = leitor.nextInt();
            int C = leitor.nextInt();
            int I = leitor.nextInt();
            int J = leitor.nextInt();

            ProximaPosicao[][] mapa = new ProximaPosicao[L][C];

            // Preenchimento do mapa
            for (int i = 0; i < L; i++) {
                for (int j = 0; j < C; j++) {
                    mapa[i][j] = new ProximaPosicao();
                    mapa[i][j].proximaLinha = leitor.nextInt();
                    mapa[i][j].proximaColuna = leitor.nextInt();
                    mapa[i][j].foiVisitada = false;
                }
            }

            int linhaAtual = I;
            int colunaAtual = J;

            System.out.println("Caminho percorrido:");

            // Percorre o mapa até encontrar uma posição já visitada
            while (!mapa[linhaAtual][colunaAtual].foiVisitada) {

                mapa[linhaAtual][colunaAtual].foiVisitada = true;

                System.out.println(linhaAtual + "," + colunaAtual);

                // Percorreu a primeira vez, não repetiu, vai para a próxima posição
                int novaLinha = mapa[linhaAtual][colunaAtual].proximaLinha;
                int novaColuna = mapa[linhaAtual][colunaAtual].proximaColuna;
                linhaAtual = novaLinha;
                colunaAtual = novaColuna;
            }

            // Mostrou todas em que só percorreu uma vez, agora mostra a que repetiu
            int linhaTesouro = mapa[linhaAtual][colunaAtual].proximaLinha;
            int colunaTesouro = mapa[linhaAtual][colunaAtual].proximaColuna;

            System.out.println("O tesouro esta nas coordenadas " + linhaAtual + "," + colunaAtual);

            leitor.close();

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}