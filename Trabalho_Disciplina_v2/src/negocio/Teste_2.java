package negocio;

import dados.*;
import exceptions.SelectException;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import persistencia.*;

public class Teste_2 {

	public static void main(String[] args) {
		Conexao.setSenha("11032007mz");
		
		try {
			AlunoDAO alunoDAO  = AlunoDAO.getInstance();
			SemestreDAO semestreDAO = SemestreDAO.getInstance();
			DisciplinaDAO disciplinaDAO = DisciplinaDAO.getInstance();
			AvaliacaoDAO avaliacaoDAO = AvaliacaoDAO.getInstance();
			
			Aluno aluno = new Aluno();
			aluno.setNome("Matheus");
			aluno.setCpf(999999);
			
			
		} catch (ClassNotFoundException | SQLException | SelectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		Aluno a = new Aluno();

	}

}
