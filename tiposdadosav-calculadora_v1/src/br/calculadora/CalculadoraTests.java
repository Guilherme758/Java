package br.calculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculadoraTests {
	
	@Test
    public void deveRetornar30PorCentoDescontoQuandoPrecoMaiorQue1000() throws Exception {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.calcular(1500);
        assertEquals(1050, resultado);
    }
	
	@Test
    public void deveRetornar25PorCentoDescontoQuandoPrecoE1000() throws Exception {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.calcular(1000);
        assertEquals(750, resultado);
    }
	
	@Test
    public void deveRetornar25PorCentoDescontoQuandoPrecoMaiorQue500() throws Exception {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.calcular(800);
        assertEquals(600, resultado);
    }
	
	@Test
    public void deveRetornar10PorCentoDescontoQuandoPrecoE500() throws Exception {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.calcular(500);
        assertEquals(450, resultado);
    }
	
	@Test
    public void deveRetornar10PorCentoDescontoQuandoPrecoMenorQue500() throws Exception {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.calcular(300);
        assertEquals(270, resultado);
    }
	
	@Test
    public void deveRetornarErroSeValorNegativo() {
		Calculadora calculadora = new Calculadora();
		
		Exception exception = assertThrows(Exception.class, () -> {
			calculadora.calcular(-100);
	    });

	    String mensagemEsperada = "O valor deve ser positivo";
	    String mensagemAtual = exception.getMessage();

	    assertTrue(mensagemAtual.contains(mensagemEsperada));
    }
}
