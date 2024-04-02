package br.edu.univas.stringmanipulator;

import java.util.Arrays;

public class StringManipulator 
{
	private String _vogais = "aeiou";
	
	public int getNumeroVogais(String texto) 
	{
		texto = texto.toLowerCase();
	
		int contNumVogais = 0;
		
		for(int i = 0; i < texto.length(); i++) 
		{
			char letra = texto.charAt(i);
			
			for(int j = 0; j < _vogais.length(); j++) 
			{
				if(letra == _vogais.charAt(j)) 
				{
					contNumVogais++;
					break;
				}
			}
		}		
		return contNumVogais;	
	}
	
	public int getNumeroConsoantes(String texto)
	{
		texto = texto.toLowerCase();
		
		int contNumConsoantes = 0;
		
		for(int i = 0; i < texto.length(); i++) 
		{
			char letra = texto.charAt(i);
			
			Character ch = null;
			
			boolean isVogal = false;
			
			for(int j = 0; j < _vogais.length(); j++) 
			{
				if(letra == _vogais.charAt(j)) 
				{
					isVogal = true;
					break;
				}
			}
			
			if(ch.isLetter(letra) == true && isVogal == false) contNumConsoantes++;
		}		
		return contNumConsoantes;
	}
	
	public boolean getIsAnagrama(String texto1, String texto2) 
	{
		char[] charTexto1 = texto1.toLowerCase().toCharArray();
		char[] charTexto2 = texto2.toLowerCase().toCharArray();
		
		Arrays.sort(charTexto1); 
		
		texto1 = new String(charTexto1);
		
		Arrays.sort(charTexto2); 
		
		texto2 = new String(charTexto2);
		
		if(texto1.equals(texto2)) return true; else return false;	
	}	
}