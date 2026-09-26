import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

// Guarda as três cores que formam um pixel.
// Para PBM e PGM, as três recebem o mesmo valor.
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

    // Scanner usado para ler as escolhas feitas pelo usuario.
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String [] args) {

        // Mostra as imagens disponiveis para o usuario escolher.
        System.out.println("Escolha uma imagem:");
        System.out.println("1 - Mapa");
        System.out.println("2 - Dino");
        System.out.println("3 - Bella");
        System.out.print("Imagem escolhida: ");
        int opcaoImagem = entrada.nextInt();

        // Essas variaveis vao guardar o nome e o caminho do arquivo escolhido.
        String nomeImagem = "";
        String caminhoImagem = "";

        // Define qual arquivo sera usado de acordo com a escolha do usuario.
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
            // Abre o arquivo escolhido para fazer a leitura.
            Scanner leitor = new Scanner(new FileReader(caminhoImagem));

            // Le as primeiras informacoes do arquivo:
            // formato, largura e altura da imagem.
            String formatoImagem = leitor.next();
            int larguraImagem = leitor.nextInt();
            int alturaImagem = leitor.nextInt();

            // P2 e P3 possuem uma informacao extra no cabecalho:
            // o valor maximo de cada cor, que neste trabalho e 255.
            if (formatoImagem.equals("P2") || formatoImagem.equals("P3")) {
                leitor.nextInt();
            }

            // Cria o objeto que vai representar a imagem.
            Imagem imagem = new Imagem();

            // Guarda no objeto as informacoes que foram lidas do arquivo.
            imagem.nome = nomeImagem;
            imagem.formato = formatoImagem;
            imagem.largura = larguraImagem;
            imagem.altura = alturaImagem;

            // Cria a matriz de pixels.
            // Altura representa a quantidade de linhas.
            // Largura representa a quantidade de colunas.
            imagem.pixelsDaImagem = new Pixel[alturaImagem][larguraImagem];

            // Leitura dos pixels
            for (int l = 0; l < alturaImagem; l++) {
                for (int c = 0; c < larguraImagem; c++) {

                    // Cria um Pixel para guardar os valores daquela posicao da matriz.
                    Pixel pixel = new Pixel();

                    // P1 e P2 possuem apenas um valor por pixel.
                    // Esse mesmo valor e colocado nas tres cores.
                    if (formatoImagem.equals("P1") || formatoImagem.equals("P2")) {
                        int valorPixel = leitor.nextInt();

                        pixel.corVermelha = valorPixel;
                        pixel.corVerde = valorPixel;
                        pixel.corAzul = valorPixel;

                    // P3 possui tres valores por pixel: vermelho, verde e azul.
                    } else if (formatoImagem.equals("P3")) {
                        pixel.corVermelha = leitor.nextInt();
                        pixel.corVerde = leitor.nextInt();
                        pixel.corAzul = leitor.nextInt();
                    }

                    // Coloca o pixel criado na sua posicao da matriz.
                    imagem.pixelsDaImagem[l][c] = pixel;
                }
            }

            // Depois de ler a imagem, mostra as operacoes disponiveis.
            System.out.println("Escolha uma operacao:");
            System.out.println("1 - Rotacao 90 graus");
            System.out.println("2 - Espelhamento horizontal");
            System.out.println("3 - Espelhamento vertical");
            System.out.print("Operacao escolhida: ");
            int opcao = entrada.nextInt();

            // Chama o metodo correspondente a operacao escolhida
            // e depois salva a imagem com o nome correto.
            switch (opcao) {
                case 1:
                    rotacionar90(imagem);
                    definirNomenclaturaDoArquivo(imagem, nomeImagem, "rotacao");
                    break;
                case 2:
                    espelharHorizontal(imagem);
                    definirNomenclaturaDoArquivo(imagem, nomeImagem, "horizontal");
                    break;
                case 3:
                    espelharVertical(imagem);
                    definirNomenclaturaDoArquivo(imagem, nomeImagem, "vertical");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }

            // Fecha o arquivo depois que toda a leitura terminou.
            leitor.close();

        } catch (IOException e) {
            // Mostra uma mensagem caso aconteca algum erro ao abrir ou ler o arquivo.
            System.out.println("Erro ao ler o arquivo: " + e);
        }
    }

    public static void salvarImagem(Imagem imagem, String nomeArquivo) {

        try {
            // Cria o arquivo de saida para escrever a nova imagem.
            BufferedWriter escritor = new BufferedWriter(new FileWriter(nomeArquivo));
            
            // Primeira linha: formato da imagem (P1, P2 ou P3).
            escritor.write(imagem.formato);
            escritor.newLine();

            // Segunda linha: largura e altura da imagem.
            escritor.write(imagem.largura + " " + imagem.altura);
            escritor.newLine();

            // P2 e P3 precisam informar o valor maximo das cores.
            if (imagem.formato.equals("P2") || imagem.formato.equals("P3")) {
                escritor.write("255");
                escritor.newLine();
            }

            // Percorre toda a matriz para escrever os pixels no arquivo.
            for (int l = 0; l < imagem.altura; l++) {
                for (int c = 0; c < imagem.largura; c++) {
                    
                    // Pega o pixel que esta naquela posicao da matriz.
                    Pixel pixel = imagem.pixelsDaImagem[l][c];

                    // P1 e P2 possuem apenas um valor por pixel.
                    if (imagem.formato.equals("P1") || imagem.formato.equals("P2")) {
                        escritor.write(pixel.corVermelha + " ");

                    // P3 precisa escrever os tres valores: R, G e B.
                    } else if (imagem.formato.equals("P3")) {
                        escritor.write(pixel.corVermelha + " " + pixel.corVerde + " " + pixel.corAzul + " ");
                    }
                }

                // Depois de terminar uma linha da matriz, pula para a proxima linha do arquivo.
                escritor.newLine();
            }

            escritor.close();

            System.out.println("Arquivo criado com sucesso: " + nomeArquivo);

        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e);
        }
    }

    public static void definirNomenclaturaDoArquivo(Imagem imagem, String nomeImagem, String operacao) {
        
        // Escolhe a extensao do arquivo de acordo com o formato da imagem.
        if (imagem.formato.equals("P1")) {
            salvarImagem(imagem, nomeImagem + "_" + operacao + ".pbm");
        } else if (imagem.formato.equals("P2")) {
            salvarImagem(imagem, nomeImagem + "_" + operacao + ".pgm");
        } else {
            salvarImagem(imagem, nomeImagem + "_" + operacao + ".ppm");
        }
    }

    public static void rotacionar90(Imagem imagem) {

        Pixel[][] novaMatriz = new Pixel[imagem.largura][imagem.altura];

        for (int l = 0; l < imagem.altura; l++) {
            for (int c = 0; c < imagem.largura; c++) {
               
                /*
                Coluna antiga vira linha na nova matriz.
                Altura - 1 = ultimo indice das linhas.
                Subtraindo a linha atual, invertemos sua posição.
                Assim, o inicio vira o final e o final vira o inicio.
                */

                novaMatriz[c][imagem.altura - 1 - l] = imagem.pixelsDaImagem[l][c];
            }
        }

        imagem.pixelsDaImagem = novaMatriz;

        // Faz a troca de indices de altura e largura
        int larguraAntiga = imagem.largura;
        imagem.largura = imagem.altura;
        imagem.altura = larguraAntiga;
    }

    public static void espelharHorizontal(Imagem imagem) {

        Pixel[][] novaMatriz = new Pixel[imagem.altura][imagem.largura];

        for (int l = 0; l < imagem.altura; l++) {
            for (int c = 0; c < imagem.largura; c++) {

                /*
                Largura - 1 = ultimo indice, neste caso, das colunas
                Pega o ultimo indice e subtrai a coluna atual para inverter a posição
                Assim, sabemos para qual coluna o pixel deve ir na matriz espelhada
                */

                novaMatriz[l][imagem.largura - 1 - c] = imagem.pixelsDaImagem[l][c];
            }
        }

        imagem.pixelsDaImagem = novaMatriz;
    }   

    public static void espelharVertical(Imagem imagem) {

        Pixel[][] novaMatriz = new Pixel[imagem.altura][imagem.largura];

        for (int l = 0; l < imagem.altura; l++) {
            for (int c = 0; c < imagem.largura; c++) {

                /*
                Altura - 1 = ultimo indice, neste caso, das linhas
                A linha é invertida para que a primeira linha vá para a ultima e a ultima vá 
                para a primeira.
                As linhas mudam de posição, a largura e a altura permanecem iguais.
                */

                novaMatriz[imagem.altura - 1 - l][c] = imagem.pixelsDaImagem[l][c];
            }
        }

        imagem.pixelsDaImagem = novaMatriz;
    }
}