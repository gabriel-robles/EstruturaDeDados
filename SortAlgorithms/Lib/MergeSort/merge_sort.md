# Algoritmo de Ordenação Merge Sort

O algoritmo de ordenação Merge Sort é um algoritmo de ordenação que utiliza a técnica de divisão e conquista. O algoritmo é baseado na divisão do vetor em subvetores menores, a ordenação desses subvetores e a fusão dos subvetores ordenados para obter o vetor final ordenado. O algoritmo é recursivo, ou seja, ele chama a si mesmo para ordenar os subvetores.

O algoritmo de ordenação Merge Sort é um dos algoritmos de ordenação mais eficientes, com complexidade de tempo médio O(n log n) e complexidade de tempo pior caso O(n log n).

## Funcionamento do Algoritmo

O algoritmo de ordenação Merge Sort funciona da seguinte maneira:

1. Divida o vetor em duas metades.
2. Divida recursivamente as metades em subvetores unitários.
3. Combine os subvetores unitários em subvetores ordenados.
4. Repita o processo de combinação até obter o vetor final ordenado.

## Exemplo

Considere o vetor inicial: [37, 4, 19, 90, 0]

```mermaid
graph TD
  A[37, 4, 19, 90, 0] --> B((Divisão))
  B --> C1[37, 4, 19]
  B --> C2[90, 0]
  C1 --> X1((Divisão))
  C2 --> X2((Divisão))
  X1 --> D1[37, 4]
  X1 --> D2[19]
  X2 --> D3[90]
  X2 --> D4[0]
  D1 --> X3((Divisão))
  X3 --> E1[37]
  X3 --> E2[4]
  E1 --> Y1((Mesclar))
  E2 --> Y1((Mesclar))
  Y1 --> F1[4, 37]
  F1 --> Y2((Mesclar))
  D2 --> Y2((Mesclar))
  Y2 --> G1[4, 19, 37]
  D3 --> Y3((Mesclar))
  D4 --> Y3((Mesclar))
  Y3 --> G2[0, 90]
  G1 --> Y4((Mesclar))
  G2 --> Y4((Mesclar))
  Y4 --> H1[0, 4, 19, 37, 90]
```