package tela;

import java.util.Scanner;

import controller.AlunoController;

public class MenuEscolaInterface {
	public void mostrarMenu() {
		Scanner opcaoMenu = new Scanner(System.in);
		int opcao=0;
		AlunoController alunoController = new AlunoController();
		
		do {
		System.out.println("\n1. Cadastrar aluno");
		System.out.println("2. Listar alunos");
		System.out.println("3. Sair");
		System.out.println("Escolha uma opcao: ");
		opcao = opcaoMenu.nextInt();
		
		switch(opcao) { 
			case (1):
				alunoController.cadastrar();
				break;
			case (2):
				alunoController.visualizar();
				break;
		}
		
		} while(opcao !=2);
	}
	

}
