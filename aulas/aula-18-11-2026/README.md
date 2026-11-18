# Aula 18/11/2026 - Algoritmos de ordenação - Insertion sort

O algoritmo Insertion Sort, ou algoritmo da inserção ordenada consiste em percorrer a entrada da direita para a esquerda. Caso o valor observado seja menor que o valor anterior, estes são trocados, trazendo o valor observado para a esquerda até que o valor da esquerda já não seja menor Brunet, 2019.

## Como funciona?

O algoritmo começa considerando que o primeiro elemento da lista já está ordenado. A partir daí, percorre os demais elementos, verificando se cada um está na posição correta.

O processo acontece da seguinte maneira:

Início: considera o primeiro elemento da lista como ordenado.
Comparação: seleciona o próximo elemento e compara com o elemento imediatamente anterior.
Troca: se o elemento atual for menor que o anterior, os dois trocam de posição.
Retrocesso: o algoritmo continua comparando o elemento com os anteriores, realizando novas trocas enquanto necessário.
Avanço: quando encontra um elemento menor ou igual ao anterior, ou chega ao início da lista, interrompe as trocas e avança para o próximo elemento.
Finalização: o processo se repete até que todos os elementos estejam ordenados.

## Exemplo literal

Considere a seguinte lista de números:

`[5, 3, 4, 1, 2]`

1. Primeira comparação

Comparamos o número 3 com o número 5.

Como 3 é menor que 5, realizamos a troca:

`[3, 5, 4, 1, 2]`

2. Segunda comparação

Agora, comparamos o número 4 com o número 5.

Como 4 é menor, realizamos a troca:

`[3, 4, 5, 1, 2]`

Como 4 é maior que 3, não precisamos continuar voltando.

3. Terceira comparação

O próximo elemento é 1. Ele é comparado com os elementos anteriores, realizando trocas até chegar à primeira posição:

`[3, 4, 1, 5, 2]`
`[3, 1, 4, 5, 2]`
`[1, 3, 4, 5, 2]`

4. Quarta comparação

Agora, o elemento 2 é comparado com os anteriores:

`[1, 3, 4, 2, 5]`
`[1, 3, 2, 4, 5]`
`[1, 2, 3, 4, 5]`

Resultado final:

`[1, 2, 3, 4, 5]`

# Selection sort

O algoritmo Selection Sort, ou algoritmo de ordenação por seleção, consiste em percorrer a lista procurando o menor elemento da parte ainda não ordenada. Após encontrar esse elemento, ele é trocado com o primeiro elemento dessa parte.

Esse processo se repete até que todos os elementos estejam em suas posições corretas.

## Como funciona?
O algoritmo começa considerando que nenhum elemento está ordenado. A cada iteração, procura o menor valor entre os elementos que ainda não foram organizados.

O processo acontece da seguinte maneira:

Início: considera a primeira posição do vetor como a posição que receberá o menor elemento.
Busca: percorre os elementos seguintes procurando o menor valor.
Identificação: quando encontra um valor menor que o atual menor valor identificado, atualiza a posição do menor elemento.
Troca: depois de percorrer toda a parte não ordenada, troca o menor elemento encontrado com o elemento da posição atual.
Avanço: avança para a próxima posição, considerando que os elementos anteriores já estão ordenados.
Finalização: repete o processo até que todos os elementos estejam ordenados.
Uma característica importante do Selection Sort é que ele realiza apenas uma troca por iteração, depois de encontrar o menor elemento da parte não ordenada.

## Exemplo literal
Considere a seguinte lista de números:

`[5, 3, 4, 1, 2]`

1. Primeira busca

Começamos na posição 0, onde está o número 5.

Percorremos o restante do vetor procurando o menor valor:

3 é menor que 5.
4 é maior que 3.
1 é menor que 3.
2 é maior que 1.
O menor elemento encontrado é 1.

Agora, trocamos o número 5 pelo número 1:

`[1, 3, 4, 5, 2]`

2. Segunda busca

A primeira posição já está ordenada. Agora começamos na posição 1, onde está o número 3.

Percorremos o restante do vetor:

4 é maior que 3.
5 é maior que 3.
2 é menor que 3.
O menor elemento encontrado é 2.

Realizamos a troca:

`[1, 2, 4, 5, 3]`

3. Terceira busca

As duas primeiras posições já estão ordenadas. Agora começamos na posição 2, onde está o número 4.

Percorremos o restante:

5 é maior que 4.
3 é menor que 4.
O menor elemento encontrado é 3.

Realizamos a troca:

`[1, 2, 3, 5, 4]`

4. Quarta busca

As três primeiras posições já estão ordenadas. Agora começamos na posição 3, onde está o número 5.

Comparamos com o próximo elemento, que é 4.

Como 4 é menor que 5, realizamos a troca:

`[1, 2, 3, 4, 5]`

Resultado final:

`[1, 2, 3, 4, 5]`