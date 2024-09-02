# Algoritmo de Ordenação Bubble Sort

O algoritmo de ordenação Bubble Sort é um algoritmo de ordenação simples que percorre o vetor diversas vezes, comparando elementos adjacentes e trocando-os de posição caso estejam na ordem errada. O algoritmo é chamado de Bubble Sort porque os elementos menores "flutuam" para o início do vetor, assim como as bolhas de ar sobem para a superfície da água.

O algoritmo de ordenação Bubble Sort é um dos algoritmos de ordenação mais simples, com complexidade de tempo médio O(n^2) e complexidade de tempo pior caso O(n^2).

## Funcionamento do Algoritmo

O algoritmo de ordenação Bubble Sort funciona da seguinte maneira:

1. Percorra o vetor da esquerda para a direita.
2. Compare cada elemento com o elemento adjacente.
3. Se o elemento atual for maior que o elemento adjacente, troque-os de posição.
4. Repita os passos 1 a 3 até que nenhum elemento seja trocado em uma passagem.

## Exemplo

Considere o vetor inicial: [37, 4, 19, 90, 0]

```mermaid
graph TD
  A[37, 4, 19, 90, 0] --> B((Passagem 1))
  B --> C1[4, 37, 19, 90, 0]
  C1 --> D1[4, 19, 37, 90, 0]
  D1 --> E1[4, 19, 37, 0, 90]
  E1 --> C((Passagem 2))
  C --> F1[4, 19, 0, 37, 90]
  F1 --> D((Passagem 3))
  D --> G1[4, 0, 19, 37, 90]
  G1 --> E((Passagem 4))
  E --> H1[0, 4, 19, 37, 90]
  H1 --> I1((Vetor Ordenado))
```