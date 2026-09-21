import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

class Pixel {
    int vermelho;
    int verde;
    int azul;
}

class Imagem {
    String tipo;
    int colunas;
    int linhas;
    int maximo;
    Pixel[][] pixels;
}

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Escolha uma imagem:");
        System.out.println("1 - mapa");
        System.out.println("2 - dino");
        System.out.println("3 - bella");
        System.out.print("Digite o numero da imagem desejada: ");
        int escolha = entrada.nextInt();

        Imagem imagem = new Imagem();

        switch (escolha) {
            case 1:
                try {
                    Scanner leitor = new Scanner(new FileReader("entradas/mapa_200x200.pbm"));

                    String tipo = leitor.nextLine();
                    int colunas = leitor.nextInt();
                    int linhas = leitor.nextInt();

                    imagem.tipo = tipo;
                    imagem.colunas = colunas;
                    imagem.linhas = linhas;
                    imagem.maximo = 1;
                    imagem.pixels = new Pixel[linhas][colunas];

                    for (int i = 0; i < linhas; i++) {
                        for (int j = 0; j < colunas; j++) {

                            int valor = leitor.nextInt();

                            Pixel pixel = new Pixel();

                            pixel.vermelho = valor;
                            pixel.verde = valor;
                            pixel.azul = valor;

                            imagem.pixels[i][j] = pixel;
                        }
                    }

                    leitor.close();
                } catch (IOException e) {
                    System.out.println("Erro ao ler o arquivo: " + e.getMessage());
                }
                break;
            case 2:
                try {
                    Scanner leitor = new Scanner(new FileReader("entradas/dino_400x400.pbm"));

                    String tipo = leitor.nextLine();
                    int colunas = leitor.nextInt();
                    int linhas = leitor.nextInt();

                    imagem.tipo = tipo;
                    imagem.colunas = colunas;
                    imagem.linhas = linhas;
                    imagem.maximo = 1;
                    imagem.pixels = new Pixel[linhas][colunas];

                    for (int i = 0; i < linhas; i++) {
                        for (int j = 0; j < colunas; j++) {

                            int valor = leitor.nextInt();

                            Pixel pixel = new Pixel();

                            pixel.vermelho = valor;
                            pixel.verde = valor;
                            pixel.azul = valor;

                            imagem.pixels[i][j] = pixel;
                        }
                    }

                    leitor.close();
                } catch (IOException e) {
                    System.out.println("Erro ao ler o arquivo: " + e.getMessage());
                }
                break;
            case 3:
                try {
                    Scanner leitor = new Scanner(new FileReader("entradas/bella_300x400.pbm"));

                    String tipo = leitor.nextLine();
                    int colunas = leitor.nextInt();
                    int linhas = leitor.nextInt();

                    imagem.tipo = tipo;
                    imagem.colunas = colunas;
                    imagem.linhas = linhas;
                    imagem.maximo = 1;
                    imagem.pixels = new Pixel[linhas][colunas];

                    for (int i = 0; i < linhas; i++) {
                        for (int j = 0; j < colunas; j++) {

                            int valor = leitor.nextInt();

                            Pixel pixel = new Pixel();

                            pixel.vermelho = valor;
                            pixel.verde = valor;
                            pixel.azul = valor;

                            imagem.pixels[i][j] = pixel;
                        }
                    }

                    leitor.close();
                } catch (IOException e) {
                    System.out.println("Erro ao ler o arquivo: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Opcao invalida.");
                break;
        }

        /*
        System.out.println();
        System.out.println("Imagem carregada!");
        System.out.println("Tipo: " + imagem.tipo);
        System.out.println("Colunas: " + imagem.colunas);
        System.out.println("Linhas: " + imagem.linhas);
        */
       
        System.out.println();
        System.out.println("Escolha a operacao:");
        System.out.println("1 - Rotacao 90 graus");
        System.out.println("2 - Espelhamento horizontal");
        System.out.println("3 - Espelhamento vertical");
        System.out.print("Digite o numero da operacao desejada: ");

        int operacao = entrada.nextInt();
        switch (operacao) {
            case 1:
                System.out.println("Rotacao escolhida.");
                break;

            case 2:
                System.out.println("Espelhamento horizontal escolhido.");
                break;
            case 3:
                System.out.println("Espelhamento vertical escolhido.");
                break;
            default:
                System.out.println("Opcao invalida.");
                break;
        }
    }
}