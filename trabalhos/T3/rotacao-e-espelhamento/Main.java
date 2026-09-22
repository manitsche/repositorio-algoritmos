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

    public static void main(String [] args) {

        System.out.println("Programa de Rotacao e Espelhamento de Imagens - Teste");

        try {
            Scanner leitor = new Scanner(new FileReader("testePGM.pgm"));

            String formatoImagem = leitor.next();
            int larguraImagem = leitor.nextInt();
            int alturaImagem = leitor.nextInt();
            int valorMaximo = leitor.nextInt();

            Imagem imagem = new Imagem();
            imagem.nome = "testePGM.pgm";
            imagem.formato = formatoImagem;
            imagem.largura = larguraImagem;
            imagem.altura = alturaImagem;

            imagem.pixelsDaImagem = new Pixel[alturaImagem][larguraImagem];

            for (int l = 0; l < alturaImagem; l++) {
                for (int c = 0; c < larguraImagem; c++) {
                    int valorPixel = leitor.nextInt();

                    Pixel pixel = new Pixel();
                    pixel.corVermelha = valorPixel;
                    pixel.corVerde = valorPixel;
                    pixel.corAzul = valorPixel;

                    imagem.pixelsDaImagem[l][c] = pixel
                }
            }

            leitor.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e);

        }    
    }
}