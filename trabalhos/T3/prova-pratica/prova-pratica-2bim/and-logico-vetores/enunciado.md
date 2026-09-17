# E Lógico entre Vetores

Escreva um programa que lê dois vetores de `N` valores lógicos, `v` e `w` (ambos com a mesma quantidade de elementos), e imprime um novo vetor de mesmo tamanho contendo o resultado da operação **e lógico** (`&&`) entre os elementos de `v` e `w` na mesma posição.

## Formato de entrada

```
N
v1 v2 ... vN
w1 w2 ... wN
```

- Linha 1: um inteiro `N`, a quantidade de elementos de cada vetor.
- Linha 2: `N` valores `true`/`false` separados por espaço (vetor `v`).
- Linha 3: `N` valores `true`/`false` separados por espaço (vetor `w`). Se `N = 0`, as linhas 2 e 3 vêm em branco (ou podem estar ausentes).

## Formato de saída

Uma única linha com os `N` resultados, no formato `[r1,r2,...,rN]` — colchetes, valores separados por vírgula, sem espaço — na mesma ordem da entrada. Vetor vazio (`N = 0`) é impresso como `[]`.

## Restrições

- 0 ≤ N ≤ 1000

## Exemplos

### Exemplo 1

**Entrada:**
```
4
true false true false
true false true false
```

**Saída esperada:**
```
[true,false,true,false]
```

### Exemplo 2

**Entrada:**
```
0
```

**Saída esperada:**
```
[]
```

### Exemplo 3

**Entrada:**
```
1
false
true
```

**Saída esperada:**
```
[false]
```
