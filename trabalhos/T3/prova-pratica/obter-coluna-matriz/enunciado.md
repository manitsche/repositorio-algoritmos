# Obter Coluna de Matriz

Escreva um programa que lê uma matriz de `R` linhas por `C` colunas de números inteiros e um índice inteiro `i`, e imprime o vetor formado pelos valores da i-ésima coluna da matriz, na ordem em que aparecem (de cima para baixo). O índice de coluna começa em **0**.

## Formato de entrada

```
R C
linha_0
linha_1
...
linha_(R-1)
i
```

- Linha 1: dois inteiros `R` e `C` separados por espaço — número de linhas e colunas da matriz.
- Próximas `R` linhas: `C` inteiros separados por espaço cada, representando a matriz.
- Última linha: o inteiro `i`, o índice da coluna a ser extraída (0 ≤ i < C).

## Formato de saída

Uma única linha com os `R` valores da coluna `i`, no formato `[v1,v2,...,vR]` — colchetes, valores separados por vírgula, sem espaço — na ordem das linhas da matriz (de cima para baixo).

## Restrições

- 1 ≤ R, C ≤ 200
- 0 ≤ i < C
- -1000000 ≤ valores da matriz ≤ 1000000

## Exemplos

### Exemplo 1

**Entrada:**
```
3 3
1 2 3
4 5 6
7 8 9
1
```

**Saída esperada:**
```
[2,5,8]
```

### Exemplo 2

**Entrada:**
```
2 4
1 2 3 4
5 6 7 8
0
```

**Saída esperada:**
```
[1,5]
```

### Exemplo 3

**Entrada:**
```
1 1
5
0
```

**Saída esperada:**
```
[5]
```
