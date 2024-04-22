package br.edu.univas.trabalho;

import java.io.*;
import java.util.Scanner;

public class Trabalho{
	
	public double getNumeroMaximoMatriz(double[][] matriz) {
		double maxNum = matriz[0][0];
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
				if(matriz[linha][coluna] >= maxNum) {
					maxNum = matriz[linha][coluna];
				}
			}
		}		
		return maxNum;
	}
	
	public double getMediaMatriz(double[][] matriz) {
		int count = 0;
		double soma = 0;
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
				soma += matriz[linha][coluna];
				count++;
			}
		}
		return soma / count;
	}
	
	public String getStringInvertida(String texto) {
		String texto_reverse = "";
		
		for(int i = texto.length() - 1; i >= 0; i--) {
			texto_reverse += texto.charAt(i);
		}
		return texto_reverse;
	}
	
	public int getQuantidadeLetras(String texto, char letra) {
		int count = 0;
		texto = texto.toLowerCase();
		
		for(int i = 0; i < texto.length(); i++) {
			if(texto.charAt(i) == letra) {
				count++;
			}
		}
		return count;
	}
	
	public boolean getIsPalindromo(String texto) {
		texto = texto.toLowerCase();
		String texto_reverse = "";
		
		for(int i = texto.length() - 1; i >= 0; i--) {
			texto_reverse += texto.charAt(i);
		}
		
		if(texto_reverse.equals(texto)) return true;
		else return false;
	}
	
	public String substituirSubstring(String texto, String oldSubstring, String newSubstring) {
		return texto.replace(oldSubstring, newSubstring);
	}
	
	public int getNumeroPalavrasArquivo(String nomeArquivo, String palavra) {
		try 
		{
			File arquivo = new File("E:\\Univas\\2º Período\\Java\\tiposdadosav-trabalho\\" + nomeArquivo);
			Scanner leitor = new Scanner(arquivo);
			
			palavra = palavra.toLowerCase();
			int count = 0;
			
			while(leitor.hasNextLine()) {
				String linha = leitor.nextLine().toLowerCase();
				
				int index = 0;
				
				while(index != -1) {
					index = linha.indexOf(palavra, index);
					
					if(index != -1) {
						index = index + palavra.length();
						count++;
					}
				}			
			}
			leitor.close();
						
			return count;
		}
		catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	public double[][] getNumeroPalavrasArquivo(String nomeArquivo){
		double[][] array = new double[9][3];
		
		try {
			FileReader arquivo = new FileReader("E:\\Univas\\2º Período\\Java\\tiposdadosav-trabalho\\" + nomeArquivo);
			BufferedReader bufferArquivo = new BufferedReader(arquivo);
			
			int countLinha = 0;
			
			while(true) {
				String linha = bufferArquivo.readLine();
				System.out.println(linha);
				
				if(linha == null) {
					break;
				}
				
				String[] linhaSplit = linha.split(",");
				
				for(int i = 0; i < linhaSplit.length; i++) {
					array[countLinha][i] = Integer.parseInt(linhaSplit[i]);
				}
				countLinha++;				
			}
			bufferArquivo.close();
			return array;
		}
		catch (Exception e) {
			e.printStackTrace();
			return array;
		}
	}
}