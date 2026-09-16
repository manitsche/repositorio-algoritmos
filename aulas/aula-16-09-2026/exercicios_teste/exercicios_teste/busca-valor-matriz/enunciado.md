# Busca por Valor em Matriz

Escreva um programa que lê uma matriz de `R` linhas por `C` colunas de números inteiros e um valor inteiro `x`, e imprime todas as posições (linha, coluna) em que `x` aparece na matriz, na ordem de leitura (percorrendo linha por linha, da esquerda para a direita). Índices de linha e coluna começam em **0**. Se `x` não ocorrer em nenhuma posição, o programa deve indicar isso imprimindo apenas a quantidade `0` (nenhuma linha de posição depois).

## Formato de entrada

```
R C
linha_0
linha_1
...
linha_(R-1)
x
```

- Linha 1: dois inteiros `R` e `C` separados por espaço — número de linhas e colunas da matriz.
- Próximas `R` linhas: `C` inteiros separados por espaço cada, representando a matriz.
- Última linha: o inteiro `x` a ser buscado.

## Formato de saída

```
P
[l0,c0]
[l1,c1]
...
[l(P-1),c(P-1)]
```

- Primeira linha: `P`, a quantidade de ocorrências de `x` na matriz (número simples, sem colchetes).
- Em seguida, `P` linhas, cada uma no formato `[linha,coluna]` — colchetes, os dois inteiros separados por vírgula sem espaço — na ordem de leitura da matriz. Se `P = 0`, nenhuma linha adicional é impressa.

## Restrições

- 1 ≤ R, C ≤ 200
- -1000000 ≤ valores da matriz, x ≤ 1000000

## Exemplos

### Exemplo 1

**Entrada:**
```
3 3
1 2 3
4 5 2
2 7 8
2
```

**Saída esperada:**
```
3
[0,1]
[1,2]
[2,0]
```

### Exemplo 2

**Entrada:**
```
2 2
1 2
3 4
9
```

**Saída esperada:**
```
0
```

### Exemplo 3

**Entrada:**
```
1 1
5
5
```

**Saída esperada:**
```
1
[0,0]
```
