# Exercícios de Java

Este repositório contém 10 exercícios em Java, cada um abordando um conceito específico da linguagem. Abaixo está uma explicação detalhada de cada exercício.

## 1. getNumeroMaximoMatriz

Este método da classe `Trabalho` recebe uma matriz de números decimais e retorna o valor máximo presente nessa matriz.

## 2. getMediaMatrix

Este método da classe `Trabalho` calcula a média dos valores de uma matriz de números decimais.

## 3. getStringInvertida

Este método da classe `Trabalho` recebe uma string como entrada e retorna a string invertida.

## 4. getQuantidadeLetras

Este método da classe `Trabalho` conta o número de ocorrências de uma letra específica em uma string.

## 5. getIsPalindromo

Este método da classe `Trabalho` verifica se uma string é um palíndromo.

## 6. substituirSubstring

Este método da classe `Trabalho` substitui todas as ocorrências de uma substring por outra substring em uma string.

## 7. encontrarCaminho

Este método da classe `Trabalho` verifica se é possível encontrar um caminho em um labirinto. Dado uma posição inicial no labirinto, o objetivo é andar através dos caminhos abertos (caminhos com 1) até chegar no item 2 (saída). É permitido andar apenas para cima, baixo, direita e esquerda. Não é possível andar em diagonais. 

Ex.: Para o labirinto abaixo,
```
int[][] labirinto = {
    {1, 0, 1, 1, 1},
    {1, 1, 1, 0, 1},
    {0, 0, 0, 1, 1},
    {1, 1, 1, 1, 0},
    {1, 1, 1, 1, 2}
};
```
A resposta seria:
```
int[][] labirinto = {
    {x, 0, x, x, x},
    {x, x, x, 0, x},
    {0, 0, 0, x, x},
    {1, 1, 1, x, 0},
    {1, 1, 1, x, x}
};
```

## 8. getNumeroPalavrasArquivo

Este método da classe `Trabalho` lê um arquivo de texto e conta o número de ocorrências de uma palavra específica.

## 9. lerCSV

Este método da classe `Trabalho` lê um arquivo CSV contendo uma matriz de números decimais e retorna essa matriz.

## 10. getAlunoAprovado

Este método da classe `Trabalho` lê um arquivo CSV contendo notas de alunos e determina se cada aluno foi aprovado com base no seguinte critério: nota >= 50, aluno aprovado

Cada exercício possui testes unitários correspondentes na classe `TrabalhoTest`, garantindo que a implementação esteja correta. Os alunos devem implementar cada método conforme as especificações e garantir que os testes passem com sucesso.
