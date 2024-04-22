package br.edu.univas.arquivos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean encerrar = false;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bem vindo ao sistema de gerencimento de usuários!! \n");
		
		while(encerrar == false) {
			System.out.println("Escolha um dos itens abaixo: \n");
			System.out.println("1 - Adicionar funcionário");
			System.out.println("2 - Visualizar funcionário");
			System.out.println("3 - Alterar funcionário");
			System.out.println("4 - Sair");
						
			int opcao = scanner.nextInt();
					
			switch(opcao) {
				case 1:
					FileUtils.AdicionarFuncionario(scanner);
					break;
				case 2:
					System.out.println("Qual o ID do funcionário a ser consultado?");
					int id = scanner.nextInt();
					FileUtils.ConsultarFuncionario(scanner, id);
					break;
				case 3:
					System.out.println("Qual o ID do funcionário que será alterado?");
					int idBusca = scanner.nextInt();
					FileUtils.AlterarFuncionario(scanner, idBusca);
					break;
				case 4:
					System.out.println("Encerrando o programa...");
					encerrar = true;
					break;
				default:
					System.out.println("Opção inválida");
					break;
			}
		}	
		scanner.close();
	}
}
