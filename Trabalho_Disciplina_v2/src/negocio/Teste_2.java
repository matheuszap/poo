package negocio;

import dados.*;
import exceptions.SelectException;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import persistencia.*;

public class Teste_2 {

	public static void main(String[] args) {
		Conexao.setSenha("11032007mz");

		Aluno aluno = new Aluno();
		aluno.setNome("Matheus");
		aluno.setCpf(999999);
		aluno.setCurso("Computação");
		
		Semestre semestre = new Semestre();
		semestre.setCodigo(12345);
		semestre.setFase(1);
		
		Semestre semestre2 = new Semestre();
		semestre2.setCodigo(23456);
		semestre2.setFase(2);
		
		Disciplina disciplina = new Disciplina();
		disciplina.setNome("POO");
		disciplina.setCodigo(33333);
		disciplina.setDepartamento("Computação");
		disciplina.setMedia_final(0);
		disciplina.setNota_exame(0);
		List<Float> notas = new LinkedList<Float>();
		notas.add((float) 5);
		notas.add((float) 5);
		notas.add((float) 5);
		disciplina.setNotas(notas);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setNome("CDI");
		disciplina2.setCodigo(44444);
		disciplina2.setDepartamento("Matemática");
		disciplina2.setMedia_final(0);
		disciplina2.setNota_exame(0);
		List<Float> notas2 = new LinkedList<Float>();
		notas2.add((float) 7);
		notas2.add((float) 7);
		notas2.add((float) 7);
		disciplina2.setNotas(notas2);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setNome("LFA");
		disciplina3.setCodigo(55555);
		disciplina3.setDepartamento("Computação");
		disciplina3.setMedia_final(0);
		disciplina3.setNota_exame(0);
		List<Float> notas3 = new LinkedList<Float>();
		notas3.add((float) 4);
		notas3.add((float) 4);
		notas3.add((float) 4);
		disciplina3.setNotas(notas3);
		
		Avaliacao avaliacao = new Avaliacao();
		avaliacao.setCodigo(555555);
		avaliacao.setNome("P1");
		avaliacao.setPeso(2);
		avaliacao.setData("01/01/2021");		
		
		try {
			Sistema sistema = new Sistema();
			
			//sistema.removerDisciplina(aluno, semestre, disciplina);
			//sistema.GerarRelatorio(aluno);
			
		} catch (ClassNotFoundException | SQLException | SelectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
