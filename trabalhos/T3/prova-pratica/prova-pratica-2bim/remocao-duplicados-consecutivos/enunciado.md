# Remoção de Duplicados Consecutivos

Escreva um programa que lê uma cadeia de caracteres `s` e imprime uma **nova** cadeia na qual sequências de caracteres **iguais e consecutivos** são reduzidas a uma única ocorrência. Caracteres que não se repetem de forma consecutiva são copiados sem alteração. A comparação é sensível a maiúsculas/minúsculas (`'a'` é diferente de `'A'`) — uma letra minúscula seguida imediatamente pela mesma letra maiúscula **não** é considerada uma repetição. Sem StringBuilder

## Formato de entrada

```
s
```

- Linha 1: a cadeia `s` (pode ser vazia — nesse caso a linha vem em branco).

## Formato de saída

Uma única linha com a cadeia resultante (linha em branco se o resultado for vazio).

## Restrições

- 0 ≤ |s| ≤ 1000
- `s` pode conter letras (maiúsculas/minúsculas), dígitos, espaços e pontuação. A entrada não conterá caracteres especiais nem caracteres com acentuação.

## Exemplos

### Exemplo 1

**Entrada:**
```
abbccc
```

**Saída esperada:**
```
abc
```

### Exemplo 2

**Entrada:**
```
aabbaa
```

**Saída esperada:**
```
aba
```

### Exemplo 3

**Entrada:**
```
aaaa
```

**Saída esperada:**
```
a
```

### Exemplo 4

**Entrada:**
```
aabbAABB
```

**Saída esperada:**
```
abAB
```
