package br.calculadora;

public class Calculadora{
	public int calcular(int valor) throws Exception{
		if(valor > 1000) {
			return valor - (int)(valor * 0.3);
		}
		else if(valor > 500) {
			return valor - (int)(valor * 0.25);
		}
		else if(valor >= 0) {
			return valor - (int)(valor * 0.1);
		}
		else {
			throw new Exception("O valor deve ser positivo");
		}
	}
}