import java.util.Arrays;

public class Main {

    public static int[] mergeSort_intercalar(int[] va, int[] vb) {

        int i = 0, j = 0, k = 0;

        int[] vr = new int[va.length + vb.length];

        while (i < va.length && j < vb.length) {

            if (va[i] <= vb[j]) {
                vr[k] = va[i];
                i++;
            } else {
                vr[k] = vb[j];
                j++;
            }

            k++;
        }

        while (i < va.length) {
            vr[k] = va[i];
            i++;
            k++;
        }

        while (j < vb.length) {
            vr[k] = vb[j];
            j++;
            k++;
        }

        return vr;
    }

    public static int[] vetorSubVetor_copia(
        int[] v, int ini, int fim
    ) {

        int k = 0;

        int[] sub_vetor = new int[fim - ini];

        for (int i = ini; i < fim; i++) {
            sub_vetor[k] = v[i];
            k++;
        }

        return sub_vetor;
    }

    public static void divisao(int[] v) {

        int[] ve, vd;

        int meio = v.length / 2;

        ve = vetorSubVetor_copia(v, 0, meio);
        vd = vetorSubVetor_copia(v, meio, v.length);

        System.out.println("Esquerda: " + Arrays.toString(ve));
        System.out.println("Direita:  " + Arrays.toString(vd));
    }

    public static int[] mergeSort_rec(int[] v) {

        if (v.length <= 1) {
            return v;
        }

        int meio = v.length / 2;

        int[] ve = vetorSubVetor_copia(v, 0, meio);
        int[] vd = vetorSubVetor_copia(v, meio, v.length);

        int[] ve_ordenado = mergeSort_rec(ve);
        int[] vd_ordenado = mergeSort_rec(vd);

        return mergeSort_intercalar(ve_ordenado, vd_ordenado);
    }

    public static void mergeSort_intercalar_aux(
        int[] v, int ini, int meio, int fim, int[] aux
    ) {

        int i = ini;
        int j = meio;
        int k = ini;

        while (i < meio && j < fim) {

            if (v[i] <= v[j]) {
                aux[k] = v[i];
                i++;
            } else {
                aux[k] = v[j];
                j++;
            }

            k++;
        }

        while (i < meio) {
            aux[k] = v[i];
            i++;
            k++;
        }

        while (j < fim) {
            aux[k] = v[j];
            j++;
            k++;
        }

        for (k = ini; k < fim; k++) {
            v[k] = aux[k];
        }
    }

    public static void mergeSort(int[] v) {

        int[] aux = new int[v.length];

        mergeSort_aux(v, 0, v.length, aux);
    }

    public static void mergeSort_aux(
        int[] v, int ini, int fim, int[] aux
    ) {

        if (fim - ini > 1) {

            int meio = (fim - ini) / 2 + ini;

            mergeSort_aux(v, ini, meio, aux);

            mergeSort_aux(v, meio, fim, aux);

            mergeSort_intercalar_aux(v, ini, meio, fim, aux);
        }
    }

    public static void mergeSort_iter(int[] v) {

        int[] aux = new int[v.length];

        int n = v.length;

        int ini, meio, fim;

        int passo = 1;

        while (passo < n) {

            ini = 0;

            while (ini + passo < n) {

                meio = ini + passo;
                fim = ini + passo * 2;

                if (fim > n) {
                    fim = n;
                }

                mergeSort_intercalar_aux(
                    v, ini, meio, fim, aux
                );

                ini = ini + passo * 2;
            }

            passo = passo * 2;
        }
    }

    public static void main(String[] args) {

        int[] vetor = {5, 3, 4, 1, 2};

        System.out.println("===== MERGE SORT =====");

        System.out.println("\n1. DIVISAO");

        divisao(vetor);

        System.out.println("\n2. INTERCALACAO");

        int[] va = {3, 5};
        int[] vb = {1, 4};

        int[] vr = mergeSort_intercalar(va, vb);

        System.out.println("Vetor A: " + Arrays.toString(va));
        System.out.println("Vetor B: " + Arrays.toString(vb));
        System.out.println("Resultado: " + Arrays.toString(vr));


        // 3. Merge Sort recursivo
        System.out.println("\n3. MERGE SORT RECURSIVO");

        int[] recursivo = {5, 3, 4, 1, 2};

        System.out.println("Antes: " + Arrays.toString(recursivo));

        recursivo = mergeSort_rec(recursivo);

        System.out.println("Depois: " + Arrays.toString(recursivo));

        System.out.println("\n4. MERGE SORT OTIMIZADO");

        int[] otimizado = {5, 3, 4, 1, 2};

        System.out.println("Antes: " + Arrays.toString(otimizado));

        mergeSort(otimizado);

        System.out.println("Depois: " + Arrays.toString(otimizado));

        System.out.println("\n5. MERGE SORT ITERATIVO");

        int[] iterativo = {5, 3, 4, 1, 2};

        System.out.println("Antes: " + Arrays.toString(iterativo));

        mergeSort_iter(iterativo);

        System.out.println("Depois: " + Arrays.toString(iterativo));
    }
}