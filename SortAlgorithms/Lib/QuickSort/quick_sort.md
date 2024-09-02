# Algoritmo de Ordenação Quick Sort

O algoritmo de ordenação Quick Sort é um algoritmo de ordenação que utiliza a técnica de divisão e conquista. O algoritmo é baseado na escolha de um elemento do vetor, chamado de pivô, e na divisão do vetor em duas partições, uma contendo os elementos menores que o pivô e outra contendo os elementos maiores que o pivô. O algoritmo é recursivo, ou seja, ele chama a si mesmo para ordenar as partições.

O algoritmo de ordenação Quick Sort é um dos algoritmos de ordenação mais eficientes, com complexidade de tempo médio O(n log n) e complexidade de tempo pior caso O(n^2).

## Funcionamento do Algoritmo

O algoritmo de ordenação Quick Sort funciona da seguinte maneira:

1. Escolha um elemento do vetor como pivô.
2. Divida o vetor em duas partições, uma contendo os elementos menores que o pivô e outra contendo os elementos maiores que o pivô.
3. Ordene recursivamente as partições seguindo os passos 1 e 2.

## Exemplo 1

### selecionando o último elemento como pivô

Considere o vetor inicial: [74 20 74 87 81 16 25 99 44 58]

```mermaid
graph TD;
    A0 ----> B1["Sublista esquerda: 44 20 16 25"];
    A0["Vetor inicial: 74 20 74 87 81 16 25 99 44 58"] ----> A1["Pivô = 58"];
    A0 ----> B3["Sublista direita: 74 74 87 81 99"];
    
    B1 ----> D1["Sublista esquerda: 16 20"];
    B1 ----> C1["Pivô = 25"];
    B1 ----> D3["Sublista direita: 44"];

    D1 ----> F1["Sublista esquerda: 16"];
    D1 ----> E1["Pivô = 20"];
    
    B3 ----> I1["Sublista esquerda: 74 74 87 81"];
    B3 ----> H1["Pivô = 99"];

    I1 ----> K1["Sublista esquerda: 74 74"];
    I1 ----> J1["Pivô = 81"];
    I1 ----> K3["Sublista direita: 87"];
    
    K1 ----> M1["Sublista esquerda: 74"];
    K1 ----> L1["Pivô = 74"];

    F1 ----> G1["Vetor ordenado: 16 20 25 44 58 74 74 81 87 99"];
    E1 ----> G1;
    C1 ----> G1;
    D3 ----> G1;
    A1 ----> G1;
    M1 ----> G1;
    L1 ----> G1;
    J1 ----> G1;
    K3 ----> G1;
    H1 ----> G1;
```

## Exemplo 2

### selecionando o elemento do meio como pivô

Considere o vetor inicial: [44 43 42 41 40 39 38]

```mermaid
graph TD;
    A0 ----> B1["Sublista esquerda: 40 39 38"];
    A0["Vetor inicial: 44 43 42 41 40 39 38"] ----> A1["Pivô = 41"];
    A0 ----> B2["Sublista direita: 44 43 42"];
    
    B1 ----> D1["Sublista esquerda: 38"];
    B1 ----> C1["Pivô = 39"];
    B1 ----> D2["Sublista direita: 40"];
    
    B2 ----> F1["Sublista esquerda: 42"];
    B2 ----> E1["Pivô = 43"];
    B2 ----> F3["Sublista direita: 44"];

    D1 ----> G1["Vetor ordenado: 38 39 40 41 42 43 44"];
    C1 ----> G1;
    D2 ----> G1;
    A1 ----> G1;
    F1 ----> G1;
    E1 ----> G1;
    F3 ----> G1;
```

## Exemplo 3

### selecionando a mediana de três como pivô

Considere o vetor inicial: [31 32 33 34 99 98 97 96]

```mermaid
graph TD;
    A0 ----> B1["Sublista esquerda: 31 32 33 34"];
    A0["Vetor inicial: 31 32 33 34 99 98 97 96"] ----> A1["Pivô = 96"];
    A0 ----> B2["Sublista direita: 99 98 97"];

    B1 ----> D1["Sublista esquerda: 31 32"];
    B1 ----> C1["Pivô = 33"];
    B1 ----> D2["Sublista direita: 34"];

    D1 ----> G1["Sublista esquerda: 31"];
    D1 ----> G2["Pivô = 32"];
    
    B2 ----> F1["Sublista esquerda: 97"];
    B2 ----> E1["Pivô = 98"];
    B2 ----> F2["Sublista direita: 99"];


    G1 ----> I1["Vetor ordenado: 31 32 33 34 96 97 98 99"];
    G2 ----> I1;
    C1 ----> I1;
    D2 ----> I1;
    A1 ----> I1;
    F1 ----> I1;
    E1 ----> I1;
    F2 ----> I1;

```