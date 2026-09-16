# Negação de Vetor Lógico

Escreva um programa que lê um vetor de `N` valores lógicos (cada um representado pela palavra `true` ou `false`) e imprime um novo vetor de mesmo tamanho contendo a negação de cada valor, na mesma ordem.

## Formato de entrada

```
N
v1 v2 ... vN
```

- Linha 1: um inteiro `N`, a quantidade de elementos do vetor.
- Linha 2: `N` valores separados por espaço, cada um `true` ou `false`. Se `N = 0`, a linha 2 vem em branco (ou pode estar ausente).

## Formato de saída

Uma única linha com os `N` valores negados, no formato `[v1,v2,...,vN]` — colchetes, valores separados por vírgula, sem espaço — na mesma ordem da entrada. Vetor vazio (`N = 0`) é impresso como `[]`.

## Restrições

- 0 ≤ N ≤ 1000

## Exemplos

### Exemplo 1

**Entrada:**
```
1
true
```

**Saída esperada:**
```
[false]
```

### Exemplo 2

**Entrada:**
```
4
true false true false
```

**Saída esperada:**
```
[false,true,false,true]
```

### Exemplo 3

**Entrada:**
```
0
```

**Saída esperada:**
```
[]
```
