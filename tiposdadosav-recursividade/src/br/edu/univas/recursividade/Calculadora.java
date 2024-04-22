package br.edu.univas.recursividade;

public class Calculadora{
	
//	public int getFatorial(int valor) {		
//		if(valor == 1 || valor == 0) {
//			return 1;
//		}
//		
//		return valor * getFatorial(valor - 1);
//	}
	
	public int getFatorial(int valor) {
		int soma = 1;
		
		for(int i = valor; i >= 1; i--) {
			soma = soma * i;
		}
		return soma;
	}
}