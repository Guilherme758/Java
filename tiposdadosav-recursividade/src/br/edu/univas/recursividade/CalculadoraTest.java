package br.edu.univas.recursividade;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {
	
	@Test
    public void getFatorial() {
		
		Calculadora trabalho = new Calculadora();
		
		int resposta0 = trabalho.getFatorial(0);
		int resposta1 = trabalho.getFatorial(1);
		int resposta2 = trabalho.getFatorial(2);
		int resposta3 = trabalho.getFatorial(3);
		int resposta4 = trabalho.getFatorial(4);
		int resposta5 = trabalho.getFatorial(5);
		
        assertEquals(1, resposta0);
        assertEquals(1, resposta1);
        assertEquals(2, resposta2);
        assertEquals(6, resposta3);
        assertEquals(24, resposta4);
        assertEquals(120, resposta5);
    }

}
