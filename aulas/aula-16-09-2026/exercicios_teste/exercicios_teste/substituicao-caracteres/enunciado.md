# Substituição de Caracteres

Escreva um programa que lê uma cadeia de caracteres `s` e dois caracteres, `antigo` e `novo`, e imprime uma **nova** cadeia na qual todas as ocorrências de `antigo` em `s` foram trocadas por `novo`. Caracteres que não sejam `antigo` devem ser copiados sem alteração. A comparação é sensível a maiúsculas/minúsculas (`'a'` é diferente de `'A'`).

## Formato de entrada

```
s
antigo
novo
```

- Linha 1: a cadeia `s` (pode ser vazia — nesse caso a linha vem em branco).
- Linha 2: o caractere `antigo` (exatamente 1 caractere).
- Linha 3: o caractere `novo` (exatamente 1 caractere).

## Formato de saída

Uma única linha com a cadeia resultante (linha em branco se `s` for vazia).

## Restrições

- 0 ≤ |s| ≤ 1000
- `s` pode conter letras (maiúsculas/minúsculas), dígitos, espaços e pontuação.
- `antigo` e `novo` são sempre exatamente 1 caractere cada; podem ser iguais entre si.

## Exemplos

### Exemplo 1

**Entrada:**
```
banana
a
o
```

**Saída esperada:**
```
bonono
```

### Exemplo 2

**Entrada:**
```
algoritmo
o
0
```

**Saída esperada:**
```
alg0ritm0
```

### Exemplo 3

**Entrada:**
```
AED
x
y
```

**Saída esperada:**
```
AED
```

### Exemplo 4

**Entrada:**
```
a
b
```

**Saída esperada:**
```

```
