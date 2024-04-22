package br.edu.univas.arquivos;

import java.util.Scanner;
import java.io.*;

public class FileUtils {
	private static String _fileFolder = "E:\\Univas\\2º Período\\Java\\tiposdadosav-arquivos\\";
	private static String _fileName   = "funcionarios.txt";
	
	public static void AdicionarFuncionario(Scanner scanner) {
		System.out.println("Informe os dados");
		
		System.out.print("ID: ");
		int id = scanner.nextInt();
		System.out.println();
				
		System.out.print("Nome: ");
		StringBuilder nome = new StringBuilder(scanner.next());
		nome.setLength(15);
		System.out.println();
		
		System.out.print("Salário: ");
		float salario = scanner.nextFloat();
		System.out.println();
		
		try {
			RandomAccessFile arquivo = new RandomAccessFile(_fileFolder + _fileName, "rw");
			arquivo.seek(arquivo.length());
						
			arquivo.writeInt(id);
			arquivo.writeChars(nome.toString());
			arquivo.writeFloat(salario);
						
			arquivo.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void ConsultarFuncionario(Scanner scanner, int id) {
		try {
			RandomAccessFile arquivo = new RandomAccessFile(_fileFolder + _fileName, "rw");
			
			int posicao = (id - 1) * 38; //38 é o tamanho em bytes de cada registro
			
			arquivo.seek(posicao);
			
			int idArquivo = arquivo.readInt();
			System.out.println("\nID: " + idArquivo);
			posicao += 4;
			arquivo.seek(posicao);
			
			String nomeArquivo = "";
			
			for(int i = 0; i < 15; i++) {
				nomeArquivo += arquivo.readChar();
				posicao += 2;
				arquivo.seek(posicao);
			}
			
			System.out.println("Nome: " + nomeArquivo);
			
			float salarioArquivo = arquivo.readFloat();
			System.out.println("Salário: " + salarioArquivo + "\n");
			
			arquivo.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void AlterarFuncionario(Scanner scanner, int id) {
		try {
			RandomAccessFile arquivo = new RandomAccessFile(_fileFolder + _fileName, "rw");
			
			int posicao = (id - 1) * 38;
			
			arquivo.seek(posicao);
			
			System.out.print("ID: ");
			int novoId = scanner.nextInt();
			System.out.println();
			
			System.out.print("Nome: ");
			StringBuilder nome = new StringBuilder(scanner.next());
			nome.setLength(15);
			System.out.println();
			
			System.out.print("Salário: ");
			float salario = scanner.nextFloat();
			System.out.println();
			
			arquivo.writeInt(novoId);
			arquivo.writeChars(nome.toString());
			arquivo.writeFloat(salario);
			
			arquivo.close();
		}
		catch (Exception e) {
			e.printStackTrace();		
		}
	}
}