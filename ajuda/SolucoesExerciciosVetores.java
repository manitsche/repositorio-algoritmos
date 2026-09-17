
import java.util.*;

/*
 * Soluções dos exercícios de vetores da lista enviada.
 * Cada método corresponde a um exercício/variação descrito no enunciado.
 *
 * Observação: Java usa:
 *   int      -> inteiro
 *   double   -> real
 *   boolean  -> lógico
 *   char     -> caractere
 *   String   -> cadeia de caracteres
 */
public class SolucoesExercicios {

    // ============================================================
    // EXERCÍCIOS DE FIXAÇÃO
    // ============================================================

    // Contagem acima da média
    public static int contagemAcimaDaMedia(int[] v) {
        double media = 0;
        for (int x : v) media += x;
        media /= v.length;

        int cont = 0;
        for (int x : v)
            if (x >= media) cont++;
        return cont;
    }

    // Soma e diferença entre vetores
    public static int[] somaEDiferenca(int[] va, int[] vb) {
        int[] vc = new int[10];
        for (int i = 0; i < 10; i++)
            vc[i] = (i % 2 == 0) ? va[i] + vb[i] : va[i] - vb[i];
        return vc;
    }

    // Troca negativos por zero
    public static int[] trocarNegativosPorZero(int[] c) {
        int[] resultado = Arrays.copyOf(c, c.length);
        for (int i = 0; i < resultado.length; i++)
            if (resultado[i] < 0) resultado[i] = 0;
        return resultado;
    }

    // Maior, menor e repetição do primeiro
    public static int[] maiorMenorRepeticoes(int[] v) {
        int maior = v[0], menor = v[0], iguaisPrimeiro = 0;

        for (int x : v) {
            if (x > maior) maior = x;
            if (x < menor) menor = x;
            if (x == v[0]) iguaisPrimeiro++;
        }

        return new int[]{maior, menor, iguaisPrimeiro};
    }

    // Cópia separando pares e ímpares
    public static int[] separarParesImpares(int[] va) {
        int[] vb = new int[va.length];
        int pos = 0;

        for (int x : va)
            if (x % 2 == 0) vb[pos++] = x;

        for (int x : va)
            if (x % 2 != 0) vb[pos++] = x;

        return vb;
    }

    // Pares no início e ímpares no fim.
    // Mantém a ordem de leitura dos pares e dos ímpares.
    public static int[] paresInicioImparesFim(int[] valores) {
        int[] r = new int[valores.length];
        int esquerda = 0;
        int direita = r.length - 1;

        // Para preservar a ordem dos ímpares, guardamos temporariamente.
        int[] impares = new int[valores.length];
        int qtdImpares = 0;

        for (int x : valores) {
            if (x % 2 == 0)
                r[esquerda++] = x;
            else
                impares[qtdImpares++] = x;
        }

        for (int i = 0; i < qtdImpares; i++)
            r[direita--] = impares[qtdImpares - 1 - i];

        return r;
    }

    // Contagem de pares e ímpares
    public static int[] contarParesImpares(int[] v) {
        int pares = 0, impares = 0;
        for (int x : v) {
            if (x % 2 == 0) pares++;
            else impares++;
        }
        return new int[]{pares, impares};
    }

    // Vetor do módulo i % k
    public static int[] vetorModulo(int n, int k) {
        if (n <= 0 || k <= 0)
            throw new IllegalArgumentException("n e k devem ser positivos.");

        int[] v = new int[n];
        for (int i = 0; i < n; i++)
            v[i] = i % k;
        return v;
    }

    // Subtração de vetores A-B
    public static int[] subtrair(int[] a, int[] b) {
        if (a.length != 10 || b.length != 10)
            throw new IllegalArgumentException("Os vetores devem ter 10 elementos.");

        int[] c = new int[10];
        for (int i = 0; i < 10; i++)
            c[i] = a[i] - b[i];
        return c;
    }

    // Produto escalar
    public static double produtoEscalar(double[] x, double[] y) {
        if (x.length != 5 || y.length != 5)
            throw new IllegalArgumentException("Os vetores devem ter 5 elementos.");

        double soma = 0;
        for (int i = 0; i < 5; i++)
            soma += x[i] * y[i];
        return soma;
    }

    // Aluno mais alto e mais baixo
    public static String[] alunoMaisAltoMaisBaixo(int[] ids, double[] alturas) {
        if (ids.length != 10 || alturas.length != 10)
            throw new IllegalArgumentException("Devem existir 10 alunos.");

        int posMenor = 0, posMaior = 0;

        for (int i = 1; i < 10; i++) {
            if (alturas[i] < alturas[posMenor]) posMenor = i;
            if (alturas[i] > alturas[posMaior]) posMaior = i;
        }

        return new String[]{
            "Mais baixo: aluno " + ids[posMenor] + ", altura = " + alturas[posMenor],
            "Mais alto: aluno " + ids[posMaior] + ", altura = " + alturas[posMaior]
        };
    }

    // Altura: lidar com empates
    public static String alturasComEmpates(int[] ids, double[] alturas) {
        double menor = alturas[0], maior = alturas[0];

        for (double h : alturas) {
            if (h < menor) menor = h;
            if (h > maior) maior = h;
        }

        int qtdMenor = 0, qtdMaior = 0;
        for (double h : alturas) {
            if (h == menor) qtdMenor++;
            if (h == maior) qtdMaior++;
        }

        StringBuilder s = new StringBuilder();
        s.append("Menor altura: ").append(menor)
         .append(" - ").append(qtdMenor).append(" aluno(s)\n");
        s.append("Maior altura: ").append(maior)
         .append(" - ").append(qtdMaior).append(" aluno(s)");

        return s.toString();
    }

    // Média e aprovação de alunos
    public static String[] mediaAprovacao(int[] ids, double[][] notas) {
        if (ids.length != notas.length)
            throw new IllegalArgumentException("Quantidade de IDs e alunos deve ser igual.");

        String[] resultado = new String[ids.length];

        for (int i = 0; i < ids.length; i++) {
            if (notas[i].length != 4)
                throw new IllegalArgumentException("Cada aluno deve ter 4 notas.");

            double media = (notas[i][0] + notas[i][1] + notas[i][2] + notas[i][3]) / 4.0;
            String situacao = media >= 70.0 ? "Aprovado" : "Reprovado";
            resultado[i] = "ID: " + ids[i] + " | Média: " + media + " | " + situacao;
        }

        return resultado;
    }

    // 20 números distintos
    public static int[] vinteNumerosDistintos(Scanner sc) {
        int[] v = new int[20];
        int qtd = 0;

        while (qtd < 20) {
            int valor = sc.nextInt();

            if (valor < 0 || valor > 100)
                throw new IllegalArgumentException("Os valores devem estar entre 0 e 100.");

            boolean repetido = false;
            for (int i = 0; i < qtd; i++) {
                if (v[i] == valor) {
                    repetido = true;
                    break;
                }
            }

            if (repetido) {
                System.out.println("Valor já digitado");
            } else {
                v[qtd++] = valor;
            }
        }

        return v;
    }

    // ============================================================
    // BIBLIOTECA Vetores
    // ============================================================

    // Alocação
    public static int[] alocarInteiros(int n) {
        return new int[n]; // Java inicializa int com 0
    }

    public static double[] alocarReais(int n) {
        return new double[n]; // Java inicializa double com 0.0
    }

    public static boolean[] alocarLogicos(int n) {
        return new boolean[n]; // Java inicializa boolean com false
    }

    public static char[] alocarCaracteres(int n) {
        return new char[n]; // Java inicializa char com '\0'
    }

    public static String[] alocarCadeiasDeCaracteres(int n) {
        String[] v = new String[n];
        Arrays.fill(v, "");
        return v;
    }

    // Cópia de trecho
    public static int[] subVetor(int[] v, int a, int b) {
        int inicio = Math.max(0, a);
        int fim = Math.min(v.length, b);

        if (inicio >= fim)
            return new int[0];

        return Arrays.copyOfRange(v, inicio, fim);
    }

    public static double[] subVetor(double[] v, int a, int b) {
        int inicio = Math.max(0, a);
        int fim = Math.min(v.length, b);
        if (inicio >= fim) return new double[0];
        return Arrays.copyOfRange(v, inicio, fim);
    }

    public static boolean[] subVetor(boolean[] v, int a, int b) {
        int inicio = Math.max(0, a);
        int fim = Math.min(v.length, b);
        if (inicio >= fim) return new boolean[0];
        return Arrays.copyOfRange(v, inicio, fim);
    }

    public static char[] subVetor(char[] v, int a, int b) {
        int inicio = Math.max(0, a);
        int fim = Math.min(v.length, b);
        if (inicio >= fim) return new char[0];
        return Arrays.copyOfRange(v, inicio, fim);
    }

    public static String[] subVetor(String[] v, int a, int b) {
        int inicio = Math.max(0, a);
        int fim = Math.min(v.length, b);
        if (inicio >= fim) return new String[0];
        return Arrays.copyOfRange(v, inicio, fim);
    }

    // Copiar
    public static int[] copiar(int[] v) { return Arrays.copyOf(v, v.length); }
    public static double[] copiar(double[] v) { return Arrays.copyOf(v, v.length); }
    public static boolean[] copiar(boolean[] v) { return Arrays.copyOf(v, v.length); }
    public static char[] copiar(char[] v) { return Arrays.copyOf(v, v.length); }
    public static String[] copiar(String[] v) { return Arrays.copyOf(v, v.length); }

    // Leitura
    public static int[] lerInteiros(Scanner sc, int n) {
        int[] v = new int[n];
        for (int i = 0; i < n; i++) v[i] = sc.nextInt();
        return v;
    }

    public static double[] lerReais(Scanner sc, int n) {
        double[] v = new double[n];
        for (int i = 0; i < n; i++) v[i] = sc.nextDouble();
        return v;
    }

    public static char[] lerCaracteres(Scanner sc, int n) {
        char[] v = new char[n];
        for (int i = 0; i < n; i++) v[i] = sc.next().charAt(0);
        return v;
    }

    public static String[] lerStrings(Scanner sc, int n) {
        String[] v = new String[n];
        for (int i = 0; i < n; i++) v[i] = sc.next();
        return v;
    }

    // Buscar posição
    public static int obterPosicaoInteiro(int[] vetor, int valorBuscar, int posInicial) {
        int inicio = Math.max(0, posInicial);
        for (int i = inicio; i < vetor.length; i++)
            if (vetor[i] == valorBuscar) return i;
        return -1;
    }

    public static int obterPosicaoReal(double[] vetor, double valorBuscar, int posInicial) {
        int inicio = Math.max(0, posInicial);
        for (int i = inicio; i < vetor.length; i++)
            if (Double.compare(vetor[i], valorBuscar) == 0) return i;
        return -1;
    }

    public static int obterPosicaoLogico(boolean[] vetor, boolean valorBuscar, int posInicial) {
        int inicio = Math.max(0, posInicial);
        for (int i = inicio; i < vetor.length; i++)
            if (vetor[i] == valorBuscar) return i;
        return -1;
    }

    public static int obterPosicaoCaractere(char[] vetor, char valorBuscar, int posInicial) {
        int inicio = Math.max(0, posInicial);
        for (int i = inicio; i < vetor.length; i++)
            if (vetor[i] == valorBuscar) return i;
        return -1;
    }

    public static int obterPosicaoCadeiaDeCaracteres(String[] vetor, String valorBuscar, int posInicial) {
        int inicio = Math.max(0, posInicial);
        for (int i = inicio; i < vetor.length; i++)
            if (Objects.equals(vetor[i], valorBuscar)) return i;
        return -1;
    }

    // Todos os índices de um valor
    public static int[] obterIndices(int[] v, int valorBuscar) {
        int qtd = 0;
        for (int x : v) if (x == valorBuscar) qtd++;

        int[] indices = new int[qtd];
        int p = 0;
        for (int i = 0; i < v.length; i++)
            if (v[i] == valorBuscar) indices[p++] = i;

        return indices;
    }

    public static int[] obterIndices(double[] v, double valorBuscar) {
        int qtd = 0;
        for (double x : v) if (Double.compare(x, valorBuscar) == 0) qtd++;

        int[] indices = new int[qtd];
        int p = 0;
        for (int i = 0; i < v.length; i++)
            if (Double.compare(v[i], valorBuscar) == 0) indices[p++] = i;

        return indices;
    }

    /*
     * Para os tipos abaixo, o exercício pede "vetor de inteiros contendo
     * os índices", portanto o retorno é int[].
     */
    public static int[] obterIndices(boolean[] v, boolean valorBuscar) {
        int qtd = 0;
        for (boolean x : v) if (x == valorBuscar) qtd++;

        int[] indices = new int[qtd];
        int p = 0;
        for (int i = 0; i < v.length; i++)
            if (v[i] == valorBuscar) indices[p++] = i;

        return indices;
    }

    public static int[] obterIndices(char[] v, char valorBuscar) {
        int qtd = 0;
        for (char x : v) if (x == valorBuscar) qtd++;

        int[] indices = new int[qtd];
        int p = 0;
        for (int i = 0; i < v.length; i++)
            if (v[i] == valorBuscar) indices[p++] = i;

        return indices;
    }

    public static int[] obterIndices(String[] v, String valorBuscar) {
        int qtd = 0;
        for (String x : v) if (Objects.equals(x, valorBuscar)) qtd++;

        int[] indices = new int[qtd];
        int p = 0;
        for (int i = 0; i < v.length; i++)
            if (Objects.equals(v[i], valorBuscar)) indices[p++] = i;

        return indices;
    }

    // Remover repetidos
    public static int[] removerRepetidos(int[] v) {
        int[] temp = new int[v.length];
        int qtd = 0;

        for (int x : v) {
            boolean existe = false;
            for (int i = 0; i < qtd; i++)
                if (temp[i] == x) {
                    existe = true;
                    break;
                }

            if (!existe) temp[qtd++] = x;
        }

        return Arrays.copyOf(temp, qtd);
    }

    public static double[] removerRepetidos(double[] v) {
        double[] temp = new double[v.length];
        int qtd = 0;

        for (double x : v) {
            boolean existe = false;
            for (int i = 0; i < qtd; i++)
                if (Double.compare(temp[i], x) == 0) {
                    existe = true;
                    break;
                }

            if (!existe) temp[qtd++] = x;
        }

        return Arrays.copyOf(temp, qtd);
    }

    public static boolean[] removerRepetidos(boolean[] v) {
        boolean[] temp = new boolean[Math.min(v.length, 2)];
        int qtd = 0;

        for (boolean x : v) {
            boolean existe = false;
            for (int i = 0; i < qtd; i++)
                if (temp[i] == x) existe = true;

            if (!existe) temp[qtd++] = x;
        }

        return Arrays.copyOf(temp, qtd);
    }

    public static char[] removerRepetidos(char[] v) {
        char[] temp = new char[v.length];
        int qtd = 0;

        for (char x : v) {
            boolean existe = false;
            for (int i = 0; i < qtd; i++)
                if (temp[i] == x) existe = true;

            if (!existe) temp[qtd++] = x;
        }

        return Arrays.copyOf(temp, qtd);
    }

    public static String[] removerRepetidos(String[] v) {
        String[] temp = new String[v.length];
        int qtd = 0;

        for (String x : v) {
            boolean existe = false;
            for (int i = 0; i < qtd; i++)
                if (Objects.equals(temp[i], x)) existe = true;

            if (!existe) temp[qtd++] = x;
        }

        return Arrays.copyOf(temp, qtd);
    }

    // NÃO
    public static boolean[] nao(boolean[] v) {
        boolean[] r = new boolean[v.length];
        for (int i = 0; i < v.length; i++)
            r[i] = !v[i];
        return r;
    }

    // ============================================================
    // BIBLIOTECA Saida
    // ============================================================

    public static void mostrarInteiros(int[] v, char separador) {
        for (int i = 0; i < v.length; i++) {
            if (i > 0) System.out.print(separador);
            System.out.print(v[i]);
        }
        System.out.println();
    }

    public static void mostrarInteiros(int[] v, char separador, int maxPorLinha) {
        if (maxPorLinha <= 0)
            throw new IllegalArgumentException("maxPorLinha deve ser positivo.");

        for (int i = 0; i < v.length; i++) {
            if (i > 0) System.out.print(separador);
            System.out.print(v[i]);

            if ((i + 1) % maxPorLinha == 0 || i == v.length - 1)
                System.out.println();
        }
    }

    public static void mostrarReais(double[] v, char separador) {
        for (int i = 0; i < v.length; i++) {
            if (i > 0) System.out.print(separador);
            System.out.print(v[i]);
        }
        System.out.println();
    }

    public static void mostrarReais(double[] v, char separador, int maxPorLinha) {
        for (int i = 0; i < v.length; i++) {
            if (i > 0) System.out.print(separador);
            System.out.print(v[i]);
            if ((i + 1) % maxPorLinha == 0 || i == v.length - 1)
                System.out.println();
        }
    }

    public static void mostrarLogicos(boolean[] v, char separador) {
        for (int i = 0; i < v.length; i++) {
            if (i > 0) System.out.print(separador);
            System.out.print(v[i]);
        }
        System.out.println();
    }

    public static void mostrarLogicos(boolean[] v, char separador, int maxPorLinha) {
        for (int i = 0; i < v.length; i++) {
            if (i > 0) System.out.print(separador);
            System.out.print(v[i]);
            if ((i + 1) % maxPorLinha == 0 || i == v.length - 1)
                System.out.println();
        }
    }

    public static void mostrarCaracteres(char[] v, char separador) {
        for (int i = 0; i < v.length; i++) {
            if (i > 0) System.out.print(separador);
            System.out.print(v[i]);
        }
        System.out.println();
    }

    public static void mostrarCaracteres(char[] v, char separador, int maxPorLinha) {
        for (int i = 0; i < v.length; i++) {
            if (i > 0) System.out.print(separador);
            System.out.print(v[i]);
            if ((i + 1) % maxPorLinha == 0 || i == v.length - 1)
                System.out.println();
        }
    }

    public static void mostrarStrings(String[] v, char separador) {
        for (int i = 0; i < v.length; i++) {
            if (i > 0) System.out.print(separador);
            System.out.print(v[i]);
        }
        System.out.println();
    }

    public static void mostrarStrings(String[] v, char separador, int maxPorLinha) {
        for (int i = 0; i < v.length; i++) {
            if (i > 0) System.out.print(separador);
            System.out.print(v[i]);
            if ((i + 1) % maxPorLinha == 0 || i == v.length - 1)
                System.out.println();
        }
    }

    // ============================================================
    // FILTROS E MÁSCARAS
    // ============================================================

    public static int[] filtrarMaiores(int[] v, int valor) {
        int qtd = 0;
        for (int x : v) if (x > valor) qtd++;

        int[] r = new int[qtd];
        int p = 0;
        for (int x : v) if (x > valor) r[p++] = x;
        return r;
    }

    public static double[] filtrarMaiores(double[] v, double valor) {
        int qtd = 0;
        for (double x : v) if (x > valor) qtd++;

        double[] r = new double[qtd];
        int p = 0;
        for (double x : v) if (x > valor) r[p++] = x;
        return r;
    }

    public static int[] filtrarMenores(int[] v, int valor) {
        int qtd = 0;
        for (int x : v) if (x < valor) qtd++;

        int[] r = new int[qtd];
        int p = 0;
        for (int x : v) if (x < valor) r[p++] = x;
        return r;
    }

    public static double[] filtrarMenores(double[] v, double valor) {
        int qtd = 0;
        for (double x : v) if (x < valor) qtd++;

        double[] r = new double[qtd];
        int p = 0;
        for (double x : v) if (x < valor) r[p++] = x;
        return r;
    }

    public static int[] aplicarMascara(int[] v, boolean[] mascara) {
        validarMascara(v.length, mascara.length);

        int qtd = 0;
        for (boolean b : mascara) if (b) qtd++;

        int[] r = new int[qtd];
        int p = 0;
        for (int i = 0; i < v.length; i++)
            if (mascara[i]) r[p++] = v[i];

        return r;
    }

    public static double[] aplicarMascara(double[] v, boolean[] mascara) {
        validarMascara(v.length, mascara.length);

        int qtd = 0;
        for (boolean b : mascara) if (b) qtd++;

        double[] r = new double[qtd];
        int p = 0;
        for (int i = 0; i < v.length; i++)
            if (mascara[i]) r[p++] = v[i];

        return r;
    }

    public static char[] aplicarMascara(char[] v, boolean[] mascara) {
        validarMascara(v.length, mascara.length);

        int qtd = 0;
        for (boolean b : mascara) if (b) qtd++;

        char[] r = new char[qtd];
        int p = 0;
        for (int i = 0; i < v.length; i++)
            if (mascara[i]) r[p++] = v[i];

        return r;
    }

    public static boolean[] aplicarMascara(boolean[] v, boolean[] mascara) {
        validarMascara(v.length, mascara.length);

        int qtd = 0;
        for (boolean b : mascara) if (b) qtd++;

        boolean[] r = new boolean[qtd];
        int p = 0;
        for (int i = 0; i < v.length; i++)
            if (mascara[i]) r[p++] = v[i];

        return r;
    }

    public static String[] aplicarMascara(String[] v, boolean[] mascara) {
        validarMascara(v.length, mascara.length);

        int qtd = 0;
        for (boolean b : mascara) if (b) qtd++;

        String[] r = new String[qtd];
        int p = 0;
        for (int i = 0; i < v.length; i++)
            if (mascara[i]) r[p++] = v[i];

        return r;
    }

    private static void validarMascara(int n, int m) {
        if (n != m)
            throw new IllegalArgumentException("Vetor e máscara devem ter o mesmo tamanho.");
    }

    public static boolean[] aplicarELogico(boolean[] v, boolean[] w) {
        validarMascara(v.length, w.length);
        boolean[] r = new boolean[v.length];

        for (int i = 0; i < v.length; i++)
            r[i] = v[i] && w[i];

        return r;
    }

    public static boolean[] aplicarOuLogico(boolean[] v, boolean[] w) {
        validarMascara(v.length, w.length);
        boolean[] r = new boolean[v.length];

        for (int i = 0; i < v.length; i++)
            r[i] = v[i] || w[i];

        return r;
    }

    public static int[] definirValorMascara(int[] v, boolean[] mascara, int valor) {
        validarMascara(v.length, mascara.length);
        int[] w = copiar(v);

        for (int i = 0; i < w.length; i++)
            if (mascara[i]) w[i] = valor;

        return w;
    }

    // ============================================================
    // CONVERSÕES
    // ============================================================

    public static int[] logicoParaInteiro(boolean[] v) {
        int[] r = new int[v.length];
        for (int i = 0; i < v.length; i++)
            r[i] = v[i] ? 1 : 0;
        return r;
    }

    public static boolean[] inteiroParaLogico(int[] v) {
        boolean[] r = new boolean[v.length];
        for (int i = 0; i < v.length; i++)
            r[i] = v[i] != 0;
        return r;
    }

    // ============================================================
    // COMPARAÇÃO
    // ============================================================

    public static boolean valoresIguais(int[] v, int[] w) {
        return Arrays.equals(v, w);
    }

    public static boolean valoresIguais(double[] v, double[] w) {
        return Arrays.equals(v, w);
    }

    public static boolean valoresIguais(boolean[] v, boolean[] w) {
        return Arrays.equals(v, w);
    }

    public static boolean valoresIguais(char[] v, char[] w) {
        return Arrays.equals(v, w);
    }

    public static boolean valoresIguais(String[] v, String[] w) {
        return Arrays.equals(v, w);
    }

    // ============================================================
    // MATEMÁTICA
    // ============================================================

    public static int[] adicionar(int[] v, int e) {
        int[] r = new int[v.length];
        for (int i = 0; i < v.length; i++)
            r[i] = v[i] + e;
        return r;
    }

    public static double[] adicionar(double[] v, double e) {
        double[] r = new double[v.length];
        for (int i = 0; i < v.length; i++)
            r[i] = v[i] + e;
        return r;
    }

    public static int[] multiplicar(int[] v, int e) {
        int[] r = new int[v.length];
        for (int i = 0; i < v.length; i++)
            r[i] = v[i] * e;
        return r;
    }

    public static double[] multiplicar(double[] v, double e) {
        double[] r = new double[v.length];
        for (int i = 0; i < v.length; i++)
            r[i] = v[i] * e;
        return r;
    }

    public static int somar(int[] v) {
        int soma = 0;
        for (int x : v) soma += x;
        return soma;
    }

    public static double somar(double[] v) {
        double soma = 0;
        for (double x : v) soma += x;
        return soma;
    }

    public static int[] somar(int[] v, int[] w) {
        int n = Math.max(v.length, w.length);
        int[] z = new int[n];

        for (int i = 0; i < n; i++) {
            if (i < v.length) z[i] += v[i];
            if (i < w.length) z[i] += w[i];
        }

        return z;
    }

    public static double[] somar(double[] v, double[] w) {
        int n = Math.max(v.length, w.length);
        double[] z = new double[n];

        for (int i = 0; i < n; i++) {
            if (i < v.length) z[i] += v[i];
            if (i < w.length) z[i] += w[i];
        }

        return z;
    }

    public static int menor(int[] v) {
        if (v.length == 0) throw new IllegalArgumentException("Vetor vazio.");
        int menor = v[0];
        for (int x : v) if (x < menor) menor = x;
        return menor;
    }

    public static int maior(int[] v) {
        if (v.length == 0) throw new IllegalArgumentException("Vetor vazio.");
        int maior = v[0];
        for (int x : v) if (x > maior) maior = x;
        return maior;
    }

    public static double menor(double[] v) {
        if (v.length == 0) throw new IllegalArgumentException("Vetor vazio.");
        double menor = v[0];
        for (double x : v) if (x < menor) menor = x;
        return menor;
    }

    public static double maior(double[] v) {
        if (v.length == 0) throw new IllegalArgumentException("Vetor vazio.");
        double maior = v[0];
        for (double x : v) if (x > maior) maior = x;
        return maior;
    }

    // ============================================================
    // CONJUNTOS
    // ============================================================

    public static int[] uniao(int[] a, int[] b) {
        int[] temp = new int[a.length + b.length];
        int qtd = 0;

        for (int x : a) {
            if (!contem(temp, qtd, x))
                temp[qtd++] = x;
        }

        for (int x : b) {
            if (!contem(temp, qtd, x))
                temp[qtd++] = x;
        }

        return Arrays.copyOf(temp, qtd);
    }

    public static int[] intersecao(int[] a, int[] b) {
        int[] temp = new int[Math.min(a.length, b.length)];
        int qtd = 0;

        for (int x : a) {
            if (contem(b, b.length, x) && !contem(temp, qtd, x))
                temp[qtd++] = x;
        }

        return Arrays.copyOf(temp, qtd);
    }

    public static int[] diferenca(int[] a, int[] b) {
        int[] temp = new int[a.length];
        int qtd = 0;

        for (int x : a) {
            if (!contem(b, b.length, x) && !contem(temp, qtd, x))
                temp[qtd++] = x;
        }

        return Arrays.copyOf(temp, qtd);
    }

    public static char[] uniao(char[] a, char[] b) {
        char[] temp = new char[a.length + b.length];
        int qtd = 0;

        for (char x : a) if (!contem(temp, qtd, x)) temp[qtd++] = x;
        for (char x : b) if (!contem(temp, qtd, x)) temp[qtd++] = x;

        return Arrays.copyOf(temp, qtd);
    }

    public static char[] intersecao(char[] a, char[] b) {
        char[] temp = new char[Math.min(a.length, b.length)];
        int qtd = 0;

        for (char x : a)
            if (contem(b, b.length, x) && !contem(temp, qtd, x))
                temp[qtd++] = x;

        return Arrays.copyOf(temp, qtd);
    }

    public static char[] diferenca(char[] a, char[] b) {
        char[] temp = new char[a.length];
        int qtd = 0;

        for (char x : a)
            if (!contem(b, b.length, x) && !contem(temp, qtd, x))
                temp[qtd++] = x;

        return Arrays.copyOf(temp, qtd);
    }

    private static boolean contem(int[] v, int tamanho, int valor) {
        for (int i = 0; i < tamanho; i++)
            if (v[i] == valor) return true;
        return false;
    }

    private static boolean contem(char[] v, int tamanho, char valor) {
        for (int i = 0; i < tamanho; i++)
            if (v[i] == valor) return true;
        return false;
    }

    // Equação de qualquer grau:
    // coeficientes[0] = termo independente,
    // coeficientes[1] = coeficiente de x,
    // coeficientes[2] = coeficiente de x², etc.
    public static double equacaoGrau(double[] coeficientes, double x) {
        double resultado = 0;

        // Regra de Horner: evita usar Math.pow repetidamente.
        for (int i = coeficientes.length - 1; i >= 0; i--)
            resultado = resultado * x + coeficientes[i];

        return resultado;
    }

    // ============================================================
    // PROBLEMAS
    // ============================================================

    // Média e valores acima
    public static String mediaEValoresAcima(int[] valores) {
        if (valores.length == 0)
            return "Nenhum valor foi digitado.";

        double soma = 0;
        for (int x : valores) soma += x;

        double media = soma / valores.length;
        StringBuilder acima = new StringBuilder();

        for (int x : valores)
            if (x > media) {
                if (acima.length() > 0) acima.append(" ");
                acima.append(x);
            }

        return "Média: " + media + "\nValores acima da média: " + acima;
    }

    // Reserva de assentos em avião
    // setor 1 = VIP (assentos 1..5)
    // setor 2 = normal (assentos 6..20)
    public static int reservarAssento(int[] assentos, int setor) {
        int inicio, fim;

        if (setor == 1) {
            inicio = 0;
            fim = 4;
        } else if (setor == 2) {
            inicio = 5;
            fim = 19;
        } else {
            throw new IllegalArgumentException("Setor inválido.");
        }

        for (int i = inicio; i <= fim; i++) {
            if (assentos[i] == 0) {
                assentos[i] = 1;
                return i + 1;
            }
        }

        return -1; // setor lotado
    }

    public static String cartaoEmbarque(int assento) {
        String setor = assento <= 5 ? "VIP" : "NORMAL";
        return "Assento: " + assento + " | Setor: " + setor;
    }

    // Triângulo de Pascal
    public static List<List<Long>> trianguloPascal(int n) {
        List<List<Long>> triangulo = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Long> linha = new ArrayList<>();

            long valor = 1;
            for (int j = 0; j <= i; j++) {
                linha.add(valor);
                if (j < i)
                    valor = valor * (i - j) / (j + 1);
            }

            triangulo.add(linha);
        }

        return triangulo;
    }

    public static void imprimirPascal(int n) {
        for (List<Long> linha : trianguloPascal(n)) {
            for (long x : linha)
                System.out.print(x + " ");
            System.out.println();
        }
    }

    // Temperaturas de 1976
    public static String temperaturas(double[] temperaturas) {
        if (temperaturas.length != 121)
            throw new IllegalArgumentException("São esperados 121 dias.");

        double menor = temperaturas[0];
        double maior = temperaturas[0];
        double soma = 0;

        for (double t : temperaturas) {
            if (t < menor) menor = t;
            if (t > maior) maior = t;
            soma += t;
        }

        double media = soma / temperaturas.length;
        int abaixo = 0;

        for (double t : temperaturas)
            if (t < media) abaixo++;

        return "Menor: " + menor +
               "\nMaior: " + maior +
               "\nMédia: " + media +
               "\nDias abaixo da média: " + abaixo;
    }

    // Faturamento de armazém.
    // precos[i] representa a mercadoria i+1.
    // vendas[i] representa a quantidade vendida da mercadoria i+1.
    public static double faturamento(double[] precos, int[] vendas) {
        if (precos.length != 100 || vendas.length != 100)
            throw new IllegalArgumentException("Devem existir 100 mercadorias.");

        double total = 0;
        for (int i = 0; i < 100; i++)
            total += precos[i] * vendas[i];

        return total;
    }

    // Controle de produção anual.
    // producao[mes][dia][peca]
    // 12 meses x 30 dias x 150 peças.
    public static int[][] totaisMensais(int[][][] producao) {
        if (producao.length != 12)
            throw new IllegalArgumentException("O ano deve possuir 12 meses.");

        int[][] totais = new int[12][150];

        for (int mes = 0; mes < 12; mes++) {
            if (producao[mes].length != 30)
                throw new IllegalArgumentException("Cada mês deve possuir 30 dias.");

            for (int dia = 0; dia < 30; dia++) {
                if (producao[mes][dia].length != 150)
                    throw new IllegalArgumentException("Devem existir 150 tipos de peças.");

                for (int peca = 0; peca < 150; peca++)
                    totais[mes][peca] += producao[mes][dia][peca];
            }
        }

        return totais;
    }

    public static int[] totaisAnuais(int[][][] producao) {
        int[][] mensais = totaisMensais(producao);
        int[] anuais = new int[150];

        for (int mes = 0; mes < 12; mes++)
            for (int peca = 0; peca < 150; peca++)
                anuais[peca] += mensais[mes][peca];

        return anuais;
    }

    // Empregados mais recentes.
    // Entrada: pares {numeroEmpregado, mesesTrabalhados}, terminando em {0,0}.
    // Retorna os 3 mais recentes, conforme o enunciado que pede "os três".
    public static int[][] empregadosMaisRecentes(int[][] empregados) {
        List<int[]> lista = new ArrayList<>();

        for (int[] e : empregados) {
            if (e[0] == 0 && e[1] == 0) break;
            lista.add(new int[]{e[0], e[1]});
        }

        lista.sort(Comparator.comparingInt(e -> e[1]));

        int qtd = Math.min(3, lista.size());
        int[][] resultado = new int[qtd][2];

        for (int i = 0; i < qtd; i++)
            resultado[i] = lista.get(i);

        return resultado;
    }

    // Relatório de estoque.
    public static String relatorioEstoque(String[] nomes, double[] valores, int[] quantidades) {
        if (nomes.length != valores.length || nomes.length != quantidades.length)
            throw new IllegalArgumentException("Os vetores devem ter o mesmo tamanho.");

        StringBuilder s = new StringBuilder();
        int tipos = 0;
        double saldoTotal = 0;

        s.append("Nome | Quantidade | Valor unitário | Saldo\n");

        for (int i = 0; i < nomes.length; i++) {
            double saldo = valores[i] * quantidades[i];

            if (quantidades[i] > 0) tipos++;
            saldoTotal += saldo;

            s.append(nomes[i]).append(" | ")
             .append(quantidades[i]).append(" | ")
             .append(valores[i]).append(" | ")
             .append(saldo).append("\n");
        }

        s.append("Tipos em estoque: ").append(tipos).append("\n");
        s.append("Saldo total: ").append(saldoTotal);

        return s.toString();
    }

    // ============================================================
    // ENDEREÇOS DE MEMÓRIA
    // ============================================================

    public static long enderecoVetor(long enderecoBase, int indice, int tamanhoElemento) {
        return enderecoBase + (long) indice * tamanhoElemento;
    }

    /*
     * Respostas conceituais:
     *
     * arr[0], base 0x1000:
     *   0x1000
     *
     * data[5], base 0x2000, 4 bytes:
     *   0x2000 + 5*4 = 0x2014
     *
     * valores[10], base 0x3000, 8 bytes:
     *   0x3000 + 10*8 = 0x3050
     *
     * buffer[25], base 0x4000, 1 byte:
     *   0x4000 + 25 = 0x4019
     *
     * O primeiro índice é 0 porque ele representa deslocamento zero
     * a partir do endereço base. Assim, arr[i] fica base + i*tamanho.
     *
     * Os elementos de um vetor precisam ter o mesmo tipo para que
     * o programa saiba o tamanho de cada elemento e consiga calcular
     * corretamente o endereço de qualquer posição.
     */

    // ============================================================
    // EXEMPLO DE USO
    // ============================================================

    public static void main(String[] args) {
        int[] v = {10, 5, 8, -2, 8, 3};

        System.out.println("Contagem >= média: " + contagemAcimaDaMedia(v));
        System.out.println("Pares primeiro: " + Arrays.toString(separarParesImpares(v)));
        System.out.println("Sem repetidos: " + Arrays.toString(removerRepetidos(v)));
        System.out.println("Menor: " + menor(v));
        System.out.println("Maior: " + maior(v));
        System.out.println("Soma: " + somar(v));

        double[] reais = {1.5, 2.0, 3.5};
        System.out.println("Reais + 2: " + Arrays.toString(adicionar(reais, 2.0)));

        boolean[] mascara = {true, false, true, false, true, false};
        System.out.println("Máscara: " + Arrays.toString(aplicarMascara(v, mascara)));

        System.out.println("Pascal:");
        imprimirPascal(6);

        System.out.println("Endereço data[5]: " +
                String.format("0x%X", enderecoVetor(0x2000, 5, 4)));
    }
}
