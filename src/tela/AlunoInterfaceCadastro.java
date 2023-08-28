package tela;

import java.util.Scanner;

import model.Aluno;

public class AlunoInterfaceCadastro {
	public Aluno cadastrarAluno() {
		Aluno aluno = new Aluno();
		Scanner e = new Scanner(System.in);
		
		System.out.print("\nInforme a matricula do aluno:");
		aluno.matricula = e.next();//next siginifica que estou pegando uma string do scanner
		
		System.out.print("\nInforme o nome do aluno:");
		aluno.nome = e.next();//next siginifica que estou pegando uma string do scanner
		
		
		
		return aluno;
	}

}
