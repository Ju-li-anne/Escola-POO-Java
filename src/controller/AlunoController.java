package controller;

import java.util.ArrayList;
import java.util.List;

import model.Aluno;
import tela.AlunoInterfaceCadastro;

public class AlunoController {

	List<Aluno> alunos = new ArrayList<>();
	
	
	public void cadastrar() {
		AlunoInterfaceCadastro aic =new AlunoInterfaceCadastro();
		alunos.add(aic.cadastrarAluno());
		System.out.printf("\n\nTotal de Alunos: %d\n", alunos.size());
		
		
	}
	
	public void visualizar() {
		
	}
}
