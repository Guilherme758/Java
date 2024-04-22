package br.edu.univas.trabalho;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class TrabalhoTest {
	
	@Test
    public void getNumeroMaximoMatriz() {
		
		Trabalho trabalho = new Trabalho();
		
		double[][] matriz = {
				{ 0.65, 0.7, 3.2, 4.5, 2.1 },
	            { 1.3, 2.7, 5.0, 6.2, 8.4 },
	            { 9.6, 7.1, 2.3, 3.7, 1.9 },
	            { 4.8, 2.5, 6.9, 1.2, 3.6 },
	            { 7.0, 8.2, 9.4, 5.6, 4.1 }
	    };
		double numeroMaximo = trabalho.getNumeroMaximoMatriz(matriz);
		
        assertEquals(9.6, numeroMaximo, 0.01);
    }
	
	@Test
    public void getMediaMatrix() {
		
		Trabalho trabalho = new Trabalho();
		
		double[][] matriz = {
				{ 0.65, 0.7, 3.2, 4.5, 2.1 },
	            { 1.3, 2.7, 5.0, 6.2, 8.4 },
	            { 9.6, 7.1, 2.3, 3.7, 1.9 },
	            { 4.8, 2.5, 6.9, 1.2, 3.6 },
	            { 7.0, 8.2, 9.4, 5.6, 4.1 }
	    };
		double numeroMaximo = trabalho.getMediaMatriz(matriz);
		
        assertEquals(4.696, numeroMaximo, 0.01);
    }
	
	@Test
    public void getStringInvertida() {
		
		Trabalho trabalho = new Trabalho();
		
		double stringInvertida = trabalho.getStringInvertida("Trabalho");
		
        assertEquals("ohlabatT", stringInvertida);
    }
	
	@Test
    public void getQuantidadeLetras() {
		
		Trabalho trabalho = new Trabalho();
		
		int quantidadeLetrasA = trabalho.getQuantidadeLetras("Trabalho", 'a');
		int quantidadeLetrasB = trabalho.getQuantidadeLetras("Trabalho", 'b');
		
        assertEquals(1, quantidadeLetrasB);
    }
	
	@Test
    public void getIsPalindromo() {
		
		Trabalho trabalho = new Trabalho();
		
		boolean isPalindromo1 = trabalho.getIsPalindromo("Trabalho");
		boolean isPalindromo2 = trabalho.getIsPalindromo("Arara");
		boolean isPalindromo3 = trabalho.getIsPalindromo("banana");
		boolean isPalindromo4 = trabalho.getIsPalindromo("radar");
		
        assertFalse(isPalindromo1);
        assertTrue(isPalindromo2);
        assertFalse(isPalindromo3);
        assertTrue(isPalindromo4);
    }
	
	@Test
    public void substituirSubstring() {
		
		Trabalho trabalho = new Trabalho();
		
		// Ex.: Substituir a substring "alho" por "alhar" na palavra "Trabalho"
		String resposta1 = trabalho.substituirSubstring("Trabalho", "alho", "alhar");
		String resposta2 = trabalho.substituirSubstring("Trabalhar", "a", "x");
		String resposta3 = trabalho.substituirSubstring("Trabalhar", "ma", "mães");
		
        assertEquals("Trabalhar", resposta1);
        assertEquals("Trxbxlhxr", resposta2);
        assertEquals("Trabalhar", resposta3);
    }
	
	@Test
    public void encontrarCaminho() {
		
		Trabalho trabalho = new Trabalho();
		
        int[][] labirintoComCaminho = {
            {1, 0, 1, 1, 1},
            {1, 1, 1, 0, 1},
            {0, 0, 0, 1, 1},
            {1, 1, 1, 1, 0},
            {1, 1, 1, 1, 2}
        };
        
        int[][] labirintoSemCaminho = {
            {1, 0, 1, 1, 1},
            {1, 1, 1, 0, 1},
            {0, 0, 0, 1, 1},
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 2}
        };
        
        boolean existeCaminho = trabalho.encontrarCaminho(labirintoComCaminho, 0, 0);
        boolean naoExisteCaminho = trabalho.encontrarCaminho(labirintoSemCaminho, 0, 0);

        assertTrue(existeCaminho); // Labirinto solucionável
        assertFalse(naoExisteCaminho); // Labirinto não solucionável
    }
	
	@Test
    public void getNumeroPalavrasArquivo() {
		
		Trabalho trabalho = new Trabalho();
		
		int resposta1 = trabalho.getNumeroPalavrasArquivo("texto.txt", "e");
		int resposta2 = trabalho.getNumeroPalavrasArquivo("texto.txt", "Java");
		int resposta3 = trabalho.getNumeroPalavrasArquivo("texto.txt", "Programador");
		int resposta4 = trabalho.getNumeroPalavrasArquivo("texto.txt", "João");
		int resposta5 = trabalho.getNumeroPalavrasArquivo("texto.txt", "banana");
		
        assertEquals(10, resposta1);
        assertEquals(2, resposta2);
        assertEquals(1, resposta3);
        assertEquals(2, resposta4);
        assertEquals(0, resposta5);
    }
	
	@Test
    public void lerCSV() {
		
		Trabalho trabalho = new Trabalho();
		
		double[][] respostaCerta = {
			    { 0.0, 41.0, 4.0 },
			    { 2.0, 52.0, 78.0 },
			    { 5.0, 85.0, 9.0 },
			    { 6.0, 2.0, 2.0 },
			    { 7.0, 4.0, 7.0 },
			    { 8.0, 85.0, 745.0 },
			    { 41.0, 2.0, 147.0 },
			    { 9.0, 7.0, 1.0 },
			    { 58.0, 8.0, 14.0 }
			};
		
		double[][] respostaAtual = trabalho.getNumeroPalavrasArquivo("matriz.csv");
		
        assertTrue(Arrays.deepEquals(respostaCerta, respostaAtual));
    }
	
	@Test
    public void getAlunoAprovado() {
		
		Trabalho trabalho = new Trabalho();
		
		boolean[] respostaCerta = { true, true, true, false, false };
		
		// Cada linha do arquivo notas.csv são as notas de um aluno
		// Ex.: 58,76,31,78 são as 4 notas do aluno zero
		// O resultado deve ser um "true" na posição zero do vetor de resposta
		boolean[] respostaAtual = trabalho.getAlunoAprovado("notas.csv");
		
        assertTrue(Arrays.equals(respostaCerta, respostaAtual));
    }

}
