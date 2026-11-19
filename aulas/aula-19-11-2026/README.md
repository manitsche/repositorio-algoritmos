# Aula 19/11/2026 - Algoritmos de ordenação - Merge Sort

O algoritmo Merge Sort, também chamado de ordenação por intercalação, é um algoritmo do tipo divisão e conquista, ou seja, divide o problema em subproblemas e resolve cada um deles até que o problema completo seja solucionado (Brunet, 2019).

Como a maioria dos algoritmos de divisão e conquista, o Merge Sort pode ser implementado de maneira recursiva ou iterativa.

## Fases

A abordagem utilizando recursividade é a forma mais intuitiva do algoritmo, podendo ser dividida em duas fases principais:

Divisão (Split): consiste em dividir o vetor original em partes menores até que cada parte possua apenas um elemento.
Intercalação (Merge): consiste em juntar as partes novamente, organizando os elementos em ordem crescente.
Intercalação (Merge)

A intercalação consiste em receber como entrada dois vetores já ordenados e, a partir deles, gerar um novo vetor ordenado contendo todos os elementos.

Existe uma restrição importante: os dois vetores utilizados como entrada precisam estar previamente ordenados.

## Exemplo literal

Considere a seguinte lista de números:

`[5, 3, 4, 1, 2]`

O Merge Sort funciona dividindo a lista em partes menores até que cada parte tenha apenas um elemento. Em seguida, essas partes são intercaladas de forma ordenada.

1. Primeira divisão

Dividimos a lista original em duas partes:

`[5, 3]` e `[4, 1, 2]`

2. Segunda divisão

Continuamos dividindo as partes:

`[5]` e `[3]`

`[4]` e `[1, 2]`

Agora, dividimos [1, 2] mais uma vez:

`[1] e [2]`

Ao final, temos:

`[5] [3] [4] [1] [2]`

3. Primeira intercalação

Agora começamos a juntar os elementos, sempre comparando os valores.

Comparamos 5 com 3.

Como 3 é menor que 5, ele é colocado primeiro:

`[3, 5]`

Os elementos 1 e 2 também são comparados:

`[1, 2]`

O elemento 4 permanece sozinho:

`[4]`

4. Segunda intercalação

Agora, intercalamos `[3, 5]` com `[4]`

Comparamos 3 com 4. Como 3 é menor, ele é colocado primeiro.
Comparamos 5 com 4. Como 4 é menor, ele é colocado em seguida.
Como não existem mais elementos no segundo vetor, copiamos o 5 restante.

Resultado:

`[3, 4, 5]`

5. Intercalação final

Agora, intercalamos os dois vetores ordenados:

`[3, 4, 5]` e `[1, 2]`

Realizamos as comparações:

Comparamos 3 com 1. Como 1 é menor, colocamos 1 no vetor resultado.
Comparamos 3 com 2. Como 2 é menor, colocamos 2 no vetor resultado.
Agora, o segundo vetor terminou. Copiamos os elementos restantes do primeiro vetor: 3, 4 e 5.

Durante esse processo, o vetor resultado fica assim:

```
[1]

[1, 2]

[1, 2, 3]

[1, 2, 3, 4]

[1, 2, 3, 4, 5]
```

Resultado final:

`[1, 2, 3, 4, 5]`

Índices da intercalação

Durante a intercalação, são utilizadas três variáveis importantes: i, j e k.

i: acompanha a posição atual do vetor da esquerda.
j: acompanha a posição atual do vetor da direita.
k: indica a posição onde o próximo elemento será armazenado no vetor resultado.

Todos os índices começam na posição 0.

## Exemplo literal

Considere os seguintes vetores já ordenados:

```
va = [3, 5]
vb = [1, 4]
vr = [0, 0, 0, 0]
```

Inicialmente:

```
i = 0
j = 0
k = 0
```

1. Primeira comparação

Comparamos os elementos apontados por i e j:

```
va[i] = 3
vb[j] = 1
```

Como 1 é menor que 3, copiamos o valor para o vetor resultado:

`vr = [1, 0, 0, 0]`

Atualizamos os índices:

i = 0
j = 1
k = 1


2. Segunda comparação

Comparamos novamente:

text
va[i] = 3
vb[j] = 4


Como 3 é menor que 4, copiamos 3:

text
vr = [1, 3, 0, 0]


Atualizamos:

text
i = 1
j = 1
k = 2


3. Terceira comparação

Agora comparamos:

text
va[i] = 5
vb[j] = 4


Como 4 é menor que 5, copiamos 4:

text
vr = [1, 3, 4, 0]


Atualizamos:

text
i = 1
j = 2
k = 3


4. Cópia dos elementos restantes

O vetor vb terminou, mas ainda existe o número 5 no vetor va.

Portanto, copiamos o elemento restante:

`vr = [1, 3, 4, 5]`

Resultado final:

`[1, 3, 4, 5]`

Divisão (Split)

A fase de divisão consiste em separar o vetor original em duas partes menores: um vetor da esquerda e outro da direita.

Para isso, utilizamos a variável meio, que representa a posição onde começa a segunda metade do vetor.

## Exemplo literal

Considere o vetor:

[5, 3, 4, 1, 2]

Primeiro, calculamos o meio:

text
meio = 5 / 2
meio = 2


Agora dividimos o vetor:

text
Vetor original: [5, 3, 4, 1, 2]

Esquerda: [5, 3]
Direita:  [4, 1, 2]


O vetor da esquerda recebe os elementos das posições 0 até meio - 1, enquanto o vetor da direita recebe os elementos da posição meio até a última posição.

Quando a quantidade de elementos é ímpar, a divisão inteira faz com que o vetor da esquerda fique com um elemento a menos que o vetor da direita.

Recursão

A recursão acontece quando um método chama a si mesmo para resolver partes menores do problema.

No Merge Sort, utilizamos a recursividade para continuar dividindo os vetores até que cada parte possua apenas um elemento.

Exemplo literal

Primeira divisão:

`[5, 3, 4, 1, 2]`

`[5, 3]` `[4, 1, 2]`

Segunda divisão:

`[5] [3]` `[4] [1, 2]`

Terceira divisão:

`[5] [3]` `[4] [1] [2]`

Nesse momento, todos os vetores possuem apenas um elemento.

Isso significa que chegamos ao fim da divisão, pois um vetor com apenas um elemento já está ordenado.

Condição de parada

A recursão precisa de uma condição de parada para evitar chamadas infinitas.

No Merge Sort, essa condição acontece quando o vetor possui zero ou um elemento.

Após atingir essa condição, as chamadas recursivas começam a retornar, permitindo que a fase de intercalação seja executada.

## Otimizações de código

Uma das otimizações possíveis consiste em evitar a criação de vários vetores durante as chamadas recursivas.

Na implementação tradicional, cada chamada cria novos vetores para armazenar as partes esquerda, direita e o resultado da intercalação.

Isso aumenta a quantidade de alocações de memória durante a execução.

Uma alternativa é utilizar um único vetor auxiliar, alocado no início do algoritmo.

Dessa forma, podemos trabalhar diretamente com o vetor original, utilizando índices para indicar quais partes precisam ser divididas e intercaladas.

Essa abordagem evita a criação de novos vetores em cada chamada recursiva e permite reutilizar o espaço auxiliar durante toda a ordenação.

## Merge Sort iterativo

O Merge Sort também pode ser implementado de maneira iterativa, ou seja, sem utilizar recursividade.

Nessa abordagem, em vez de dividir os vetores recursivamente, utilizamos uma variável chamada passo.

O passo começa com o valor 1 e é dobrado a cada repetição.

Isso significa que o algoritmo começa intercalando grupos de um elemento, depois grupos de dois elementos, quatro elementos, oito elementos e assim sucessivamente.

## Exemplo literal

Considere o vetor:

`[5, 3, 4, 1, 2]`

1. Passo = 1

Intercalamos grupos de um elemento:

```
[5] [3] [4] [1] [2]

[3, 5] [1, 4] [2]
```

2. Passo = 2

Agora intercalamos grupos de dois elementos:

```
[3, 5] [1, 4] [2]

[1, 3, 4, 5] [2]
```

3. Passo = 4

Agora intercalamos os grupos de quatro e um elemento:

```
[1, 3, 4, 5] [2]`

[1, 2, 3, 4, 5]`
```

Resultado final:

`[1, 2, 3, 4, 5]`

## Análise de complexidade

O Merge Sort possui complexidade de tempo O(n log n) nos três casos: melhor, médio e pior.

Isso acontece porque o vetor é dividido em partes menores, formando aproximadamente log n níveis de divisão, enquanto a intercalação percorre os elementos em cada nível.

O Merge Sort utiliza a estratégia de divisão e conquista para ordenar os elementos de um vetor.

Suas principais etapas são:

Divisão: separa o vetor em duas partes menores.
Recursão: continua dividindo até que cada parte tenha apenas um elemento.
Intercalação: compara os elementos e junta as partes em ordem crescente.

A principal vantagem do Merge Sort é sua complexidade de tempo O(n log n), mantendo um desempenho consistente independentemente da organização inicial dos elementos.