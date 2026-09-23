import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

class Pixel {
    int corVermelha;
    int corVerde;
    int corAzul;
}

class Imagem {
    String nome;
    String formato;
    int largura;
    int altura;
    Pixel[][] pixelsDaImagem;
}

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String [] args) {

        System.out.println("Programa de Rotacao e Espelhamento de Imagens - Teste");

        System.out.println("Escolha uma imagem:");
        System.out.println("1 - Mapa");
        System.out.println("2 - Dino");
        System.out.println("3 - Bella");
        System.out.print("Imagem escolhida: ");
        int opcaoImagem = entrada.nextInt();

        String nomeImagem = "";
        String caminhoImagem = "";

        switch (opcaoImagem) {
            case 1:
                nomeImagem = "mapa";
                caminhoImagem = "entradas/mapa_200x200.pbm";
                break;
            case 2:
                nomeImagem = "dino";
                caminhoImagem = "entradas/dino_400x400.pgm";
                break;
            case 3:
                nomeImagem = "bella";
                caminhoImagem = "entradas/bella_300x400.ppm";
                break;
            default:
                System.out.println("Opcao invalida.");
        }

        try {
            Scanner leitor = new Scanner(new FileReader(caminhoImagem));

            String formatoImagem = leitor.next();
            int larguraImagem = leitor.nextInt();
            int alturaImagem = leitor.nextInt();

            if (formatoImagem.equals("P2") || formatoImagem.equals("P3")) {
                int valorMaximo = leitor.nextInt();
            }

            Imagem imagem = new Imagem();
            imagem.nome = caminhoImagem;
            imagem.formato = formatoImagem;
            imagem.largura = larguraImagem;
            imagem.altura = alturaImagem;

            imagem.pixelsDaImagem = new Pixel[alturaImagem][larguraImagem];

            // Leitura dos pixels
            for (int l = 0; l < alturaImagem; l++) {
                for (int c = 0; c < larguraImagem; c++) {

                    Pixel pixel = new Pixel();

                    if (formatoImagem.equals("P1") || formatoImagem.equals("P2")) {
                        int valorPixel = leitor.nextInt();

                        pixel.corVermelha = valorPixel;
                        pixel.corVerde = valorPixel;
                        pixel.corAzul = valorPixel;
                    } else if (formatoImagem.equals("P3")) {
                        pixel.corVermelha = leitor.nextInt();
                        pixel.corVerde = leitor.nextInt();
                        pixel.corAzul = leitor.nextInt();
                    }

                    imagem.pixelsDaImagem[l][c] = pixel;
                }
            }

            System.out.println("Escolha uma operacao:");
            System.out.println("1 - Rotacao 90 graus");
            System.out.println("2 - Espelhamento horizontal");
            System.out.println("3 - Espelhamento vertical");
            System.out.print("Operacao escolhida: ");
            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    rotacionar90(imagem);
                    
                    if (imagem.formato.equals("P1")) {
                        salvarImagem(imagem, nomeImagem + "_rotacao.pbm");
                    } else if (imagem.formato.equals("P2")) {
                        salvarImagem(imagem, nomeImagem + "_rotacao.pgm");
                    } else if (imagem.formato.equals("P3")) {
                        salvarImagem(imagem, nomeImagem + "_rotacao.ppm");
                    }

                    break;
                case 2:
                    System.out.println("Espelhamento horizontal escolhido.");
                    break;
                case 3:
                    System.out.println("Espelhamento vertical escolhido.");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }

            leitor.close();

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e);
        }
    }

    public static void rotacionar90(Imagem imagem) {

        Pixel[][] novaMatriz = new Pixel[imagem.largura][imagem.altura];

        for (int l = 0; l < imagem.altura; l++) {
            for (int c = 0; c < imagem.largura; c++) {
                novaMatriz[c][imagem.altura - 1 - l] = imagem.pixelsDaImagem[l][c];
            }
        }

        imagem.pixelsDaImagem = novaMatriz;

        int larguraAntiga = imagem.largura;
        imagem.largura = imagem.altura;
        imagem.altura = larguraAntiga;
    }

    public static void salvarImagem(Imagem imagem, String nomeArquivo) {
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(nomeArquivo));
            
            escritor.write(imagem.formato);
            escritor.newLine();

            escritor.write(imagem.largura + " " + imagem.altura);
            escritor.newLine();

            if (imagem.formato.equals("P2") || imagem.formato.equals("P3")) {
                escritor.write("255");
                escritor.newLine();
            }

            for (int l = 0; l < imagem.altura; l++) {
                for (int c = 0; c < imagem.largura; c++) {
                    
                    Pixel pixel = imagem.pixelsDaImagem[l][c];

                    if (imagem.formato.equals("P1") || imagem.formato.equals("P2")) {
                        escritor.write(pixel.corVermelha + " ");
                    } else if (imagem.formato.equals("P3")) {
                        escritor.write(pixel.corVermelha + " " + pixel.corVerde + " " + pixel.corAzul + " ");
                    }
                }

                escritor.newLine();
            }

            escritor.close();

        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e);
        }
    }
}