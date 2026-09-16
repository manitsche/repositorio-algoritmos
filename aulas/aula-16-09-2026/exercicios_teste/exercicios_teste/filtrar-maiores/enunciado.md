# Filtrar Valores Maiores

Escreva um programa que lê um vetor de `N` números inteiros e um valor inteiro `valor`, e imprime, em uma única linha e na mesma ordem original, apenas os elementos do vetor que são **estritamente maiores** que `valor` (elementos iguais a `valor` não entram no resultado).

## Formato de entrada

```
N
a1 a2 ... aN
valor
```

- Linha 1: um inteiro `N`, a quantidade de elementos do vetor.
- Linha 2: `N` inteiros separados por espaço (linha em branco se `N = 0`).
- Linha 3: o inteiro `valor`, usado como limite de comparação.

## Formato de saída

Uma única linha com os elementos filtrados, no formato `[a1,a2,...,aP]` — colchetes, valores separados por vírgula, sem espaço — na mesma ordem em que aparecem na entrada. Se nenhum elemento for maior que `valor` (ou `N = 0`), imprimir `[]`.

## Restrições

- 0 ≤ N ≤ 1000
- -1000000 ≤ a_i, valor ≤ 1000000

## Exemplos

### Exemplo 1

**Entrada:**
```
10
1 2 3 4 5 6 7 8 9 10
5
```

**Saída esperada:**
```
[6,7,8,9,10]
```

### Exemplo 2

**Entrada:**
```
10
1 2 3 4 5 6 7 8 9 10
0
```

**Saída esperada:**
```
[1,2,3,4,5,6,7,8,9,10]
```

### Exemplo 3

**Entrada:**
```
10
1 2 3 4 5 6 7 8 9 10
15
```

**Saída esperada:**
```
[]
```
