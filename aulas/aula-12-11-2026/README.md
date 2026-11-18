# Aula 12/11/2026 - Algoritmos de ordenação - Bubble sort

O bubble Sort, também conhecido como algoritmo de ordenação da bolha, é um algoritmo de ordenação simples que organiza os elementos de um conjunto de dados por meio de comparações e trocas entre elementos adjacentes. O algoritmo percorre o vetor diversas vezes, comparando dois elementos consecutivos. Quando estão fora de ordem, suas posições são trocadas. A cada passagem completa pelo vetor, o maior elemento ainda não ordenado é deslocado para sua posição correta, no final do conjunto.

## Funcionamento

O Bubble Sort possui as seguintes características:

- Compara dois elementos que estão em posições consecutivas.
- Realiza múltiplas passagens pelo conjunto de dados.
- A cada passagem, posiciona o maior elemento não ordenado no final do vetor.
- Trabalha diretamente no vetor original (_in-place_), dispensando a criação de um novo vetor.
- Continua o processo até que todos os elementos estejam ordenados.

### Exemplo literal

Considere o seguinte vetor:

`[5, 3, 8, 2, 1]`

O algoritmo começa comparando os elementos adjacentes.

1. Compara 5 e 3. Como 5 é maior, troca suas posições.
2. Compara 5 e 8. Como estão em ordem, mantém as posições.
3. Compara 8 e 2. Realiza a troca.
4. Compara 8 e 1. Realiza a troca.

Ao finalizar a primeira passagem, o maior elemento (8) estará na última posição.

O processo se repete, reduzindo a quantidade de elementos analisados a cada passagem, até que o vetor esteja completamente ordenado.

Resultado final:

`[1, 2, 3, 5, 8]`

## Implementação

A implementação iterativa do Bubble Sort utiliza dois laços de repetição:

- **Laço externo:** controla a quantidade de passagens pelo vetor.
- **Laço interno:** percorre o vetor realizando as comparações entre elementos adjacentes.

A cada passagem, um elemento é colocado em sua posição definitiva. Por isso, não é necessário comparar novamente os elementos que já foram ordenados no final do vetor.

## Recursividade

O Bubble Sort também pode ser implementado utilizando recursividade.

Nessa abordagem, o algoritmo realiza uma passagem pelo vetor e, em seguida, chama a si mesmo para ordenar a parte restante.

A cada chamada recursiva:

- Os elementos são comparados e trocados quando necessário.
- O maior elemento da parte analisada é colocado na posição correta.
- O limite de comparação é reduzido em uma unidade.
- O processo continua até que reste apenas um elemento para ordenar.

### Observação

Embora seja possível implementar o Bubble Sort de maneira recursiva, essa abordagem não é recomendada.

O grande número de chamadas recursivas pode causar um estouro de pilha (_Stack Overflow_), além de consumir mais memória do que a implementação iterativa.

- **Tempo:** o algoritmo realiza comparações repetidas entre elementos adjacentes.
- **Espaço:** utiliza espaço constante, pois modifica o próprio vetor.
- **Estabilidade:** é estável, pois elementos iguais não precisam trocar de posição.