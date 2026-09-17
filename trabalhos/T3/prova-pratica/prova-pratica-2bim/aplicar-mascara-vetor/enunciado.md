# Aplicar Máscara em Vetor

Escreva um programa que lê um vetor de `N` números inteiros `v` e um vetor de `N` valores lógicos `mascara` (cada um `true` ou `false`), e imprime um novo vetor contendo apenas os valores de `v` cujas posições correspondentes em `mascara` são `true`, preservando a ordem original.

## Formato de entrada

```
N
v1 v2 ... vN
m1 m2 ... mN
```

- Linha 1: um inteiro `N`, a quantidade de elementos.
- Linha 2: `N` inteiros separados por espaço (vetor `v`).
- Linha 3: `N` valores `true`/`false` separados por espaço (vetor `mascara`), na mesma ordem de `v`. Se `N = 0`, as linhas 2 e 3 vêm em branco (ou podem estar ausentes).

## Formato de saída

Uma única linha com os elementos selecionados, no formato `[v1,v2,...,vP]` — colchetes, valores separados por vírgula, sem espaço — na mesma ordem em que aparecem em `v`. Se nenhuma posição de `mascara` for `true` (ou `N = 0`), imprimir `[]`.

## Restrições

- 0 ≤ N ≤ 1000
- -1000000 ≤ v_i ≤ 1000000

## Exemplos

### Exemplo 1

**Entrada:**
```
10
1 2 3 4 5 6 7 8 9 10
true false true false true false false false false true
```

**Saída esperada:**
```
[1,3,5,10]
```

### Exemplo 2

**Entrada:**
```
5
10 20 30 40 50
false false false false true
```

**Saída esperada:**
```
[50]
```

### Exemplo 3

**Entrada:**
```
10
1 2 3 4 55 66 77 88 98 1
false false false false false false false false false false
```

**Saída esperada:**
```
[]
```
