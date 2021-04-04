package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import persistencia.*;
import exceptions.*;
import negocio.*;
import dados.*;

public class TelaPrincipal extends JFrame{
	
	JTabbedPane pane;
	JPanel painel1, painel2, painel3, painel4;
	
	private JLabel titulo_cadastrarAluno = new JLabel("Cadastrar Aluno");
	private JLabel infoCaixaTexto1 = new JLabel("Digite o nome:");
	private JLabel infoCaixaTexto2 = new JLabel("Digite o CPF:");
	private JLabel infoCaixaTexto3 = new JLabel("Digite o curso:");
	private JTextField caixaTexto1 = new JTextField();
	private JTextField caixaTexto2 = new JTextField();
	private JTextField caixaTexto3 = new JTextField();
	private JButton botaoCadastrarAluno = new JButton("Confirmar");
	
	private JLabel titulo_cadastrarSemestre = new JLabel("Cadastrar Semestre");
	private JLabel infoCaixaTexto4 = new JLabel("Selecione o aluno:");
	private JLabel infoCaixaTexto5 = new JLabel("Digite o código:");
	private JLabel infoCaixaTexto6 = new JLabel("Digite a fase:");
	private JTextField caixaTexto5 = new JTextField();
	private JTextField caixaTexto6 = new JTextField();
	private JButton botaoCadastrarSemestre = new JButton("Confirmar");
	
	private JLabel titulo_cadastrarDisciplina = new JLabel("Cadastrar Disciplina");
	private JLabel infoCaixaTexto7 = new JLabel("Selecione o aluno:");
	private JLabel infoCaixaTexto8 = new JLabel("Digite a fase:");
	private JLabel infoCaixaTexto9 = new JLabel("Nome da disciplina:");
	private JLabel infoCaixaTexto10 = new JLabel("Departamento:");
	private JLabel infoCaixaTexto11 = new JLabel("Digite suas notas:");
	private JLabel infoCaixaTexto12 = new JLabel("Código da disciplina:");
	private JTextField caixaTexto8 = new JTextField();
	private JTextField caixaTexto9 = new JTextField();
	private JTextField caixaTexto10 = new JTextField();
	private JTextField caixaTexto11_1 = new JTextField();
	private JTextField caixaTexto11_2 = new JTextField();
	private JTextField caixaTexto11_3 = new JTextField();
	private JTextField caixaTexto12 = new JTextField();
	private JButton botaoCadastrarDisciplina = new JButton("Confirmar");
	
	private JLabel titulo_cadastrarAvaliacao = new JLabel("Cadastrar Avaliação");
	private JLabel infoCaixaTexto13 = new JLabel("Selecione o aluno:");
	private JLabel infoCaixaTexto14 = new JLabel("Digite a fase:");
	private JLabel infoCaixaTexto15 = new JLabel("Digite a disciplina:");
	private JLabel infoCaixaTexto16 = new JLabel("Nome da avaliação:");
	private JLabel infoCaixaTexto17 = new JLabel("Código da avaliação:");
	private JLabel infoCaixaTexto18 = new JLabel("Peso:");
	private JLabel infoCaixaTexto19 = new JLabel("Data:");
	private JTextField caixaTexto14 = new JTextField();
	private JTextField caixaTexto15 = new JTextField();
	private JTextField caixaTexto16 = new JTextField();
	private JTextField caixaTexto17 = new JTextField();
	private JTextField caixaTexto18 = new JTextField();
	private JTextField caixaTexto19 = new JTextField();
	private JButton botaoCadastrarAvaliacao = new JButton("Confirmar");

	private JLabel titulo_removerAluno = new JLabel("Remover Aluno");
	private JLabel infoCaixaTexto20 = new JLabel("Selecione o aluno:");
	private JButton botaoRemoverAluno = new JButton("Confirmar");

	private JLabel titulo_removerSemestre = new JLabel("Remover Semestre");
	private JLabel infoCaixaTexto21 = new JLabel("Selecione o aluno:");
	private JLabel infoCaixaTexto22 = new JLabel("Digite a fase:");
	private JTextField caixaTexto22 = new JTextField();
	private JButton botaoRemoverSemestre = new JButton("Confirmar");

	private JLabel titulo_removerDisciplina = new JLabel("Remover Disciplina");
	private JLabel infoCaixaTexto23 = new JLabel("Selecione o aluno:");
	private JLabel infoCaixaTexto24 = new JLabel("Digite a fase:");
	private JLabel infoCaixaTexto25 = new JLabel("Digite a disciplina:");
	private JTextField caixaTexto24 = new JTextField();
	private JTextField caixaTexto25 = new JTextField();
	private JButton botaoRemoverDisciplina = new JButton("Confirmar");

	private JLabel titulo_removerAvaliacao = new JLabel("Remover Avaliação");
	private JLabel infoCaixaTexto26 = new JLabel("Selecione o aluno:");
	private JLabel infoCaixaTexto27 = new JLabel("Digite a fase:");
	private JLabel infoCaixaTexto28 = new JLabel("Digite a disciplina:");
	private JLabel infoCaixaTexto29 = new JLabel("Nome da avaliação:");
	private JTextField caixaTexto27 = new JTextField();
	private JTextField caixaTexto28 = new JTextField();
	private JTextField caixaTexto29 = new JTextField();
	private JButton botaoRemoverAvaliacao = new JButton("Confirmar");

	private JLabel titulo_GerarRelatorio= new JLabel("Gerar Relatório");
	private JLabel infoCaixaTexto30 = new JLabel("Selecione o aluno:");
	private JButton botaoGerarRelatorio = new JButton("Confirmar");

	private JLabel titulo_editarAluno = new JLabel("Editar Aluno");
	private JLabel infoCaixaTexto31 = new JLabel("Selecione o aluno:");
	private JLabel infoCaixaTexto32 = new JLabel("Editar nome:");
	private JLabel infoCaixaTexto33 = new JLabel("Editar curso:");
	private JTextField caixaTexto32 = new JTextField();
	private JTextField caixaTexto33 = new JTextField();
	private JButton botaoEditarAluno = new JButton("Confirmar");

	private JLabel titulo_editarSemestre = new JLabel("Editar Semestre");
	private JLabel infoCaixaTexto34 = new JLabel("Selecione o aluno:");
	private JLabel infoCaixaTexto35 = new JLabel("Digite a fase:");
	private JLabel infoCaixaTexto37 = new JLabel("Editar fase:");
	private JTextField caixaTexto35 = new JTextField();
	private JTextField caixaTexto37 = new JTextField();
	private JButton botaoEditarSemestre = new JButton("Confirmar");
	
	private JLabel titulo_editarDisciplina = new JLabel("Editar Disciplina");
	private JLabel infoCaixaTexto38 = new JLabel("Selecione o aluno:");
	private JLabel infoCaixaTexto39 = new JLabel("Digite a fase:");
	private JLabel infoCaixaTexto40 = new JLabel("Digite a disciplina:");
	private JLabel infoCaixaTexto41 = new JLabel("Editar nome:");
	private JLabel infoCaixaTexto42 = new JLabel("Editar departamento:");
	private JTextField caixaTexto39 = new JTextField();
	private JTextField caixaTexto40 = new JTextField();
	private JTextField caixaTexto41 = new JTextField();
	private JTextField caixaTexto42 = new JTextField();
	private JButton botaoEditarDisciplina = new JButton("Confirmar");

	private JLabel titulo_editarAvaliacao = new JLabel("Editar Avaliação");
	private JLabel infoCaixaTexto43 = new JLabel("Selecione o aluno:");
	private JLabel infoCaixaTexto44 = new JLabel("Digite a fase:");
	private JLabel infoCaixaTexto45 = new JLabel("Digite a disciplina:");
	private JLabel infoCaixaTexto46 = new JLabel("Nome da avaliação:");
	private JLabel infoCaixaTexto47 = new JLabel("Editar nome:");
	private JLabel infoCaixaTexto48 = new JLabel("Editar data:");
	private JTextField caixaTexto44 = new JTextField();
	private JTextField caixaTexto45 = new JTextField();
	private JTextField caixaTexto46 = new JTextField();
	private JTextField caixaTexto47 = new JTextField();
	private JTextField caixaTexto48 = new JTextField();
	private JButton botaoEditarAvaliacao = new JButton("Confirmar");
	
	
	private JLabel titulo_consultarNotas = new JLabel("Consultar Notas");
	private JLabel infoCaixaTexto49 = new JLabel("Selecione o aluno:");
	private JLabel infoCaixaTexto50 = new JLabel("Digite a fase:");
	private JLabel infoCaixaTexto51 = new JLabel("Digite a disciplina:");
	private JTextField caixaTexto50 = new JTextField();
	private JTextField caixaTexto51 = new JTextField();
	private JButton botaoConsultarNotas = new JButton("Confirmar");
	
	public TelaPrincipal() {
		Conexao.setSenha("11032007mz");
		
		try {
			Sistema s = new Sistema();
		
		pane = new JTabbedPane();
		setTitle("Sistema UDESC");
		
		painel1 = new JPanel();
		painel2 = new JPanel();
		painel3 = new JPanel();
		painel4 = new JPanel();
		
		painel1.setLayout(null);
		painel2.setLayout(null);
		painel3.setLayout(null);
		painel4.setLayout(null);
		
		
		
		painel1.add(new JLabel("Cadastrar"));
		painel2.add(new JLabel("Remover"));
		painel3.add(new JLabel("Editar"));
		painel4.add(new JLabel("Notas"));
		
		
		 Border border = BorderFactory.createMatteBorder(3, 3, 3, 3, Color.darkGray);
		 
		 painel1.setBorder(BorderFactory.createTitledBorder(border, "Cadastro de Informações", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
		 painel2.setBorder(BorderFactory.createTitledBorder(border, "Remover", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
		 painel3.setBorder(BorderFactory.createTitledBorder(border, "Editar Informações", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
		 painel4.setBorder(BorderFactory.createTitledBorder(border, "Consultar Notas e Gerar Relatório", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
		
		//////////////////////// Cadastrar Aluno ////////////////////////////////
		
		titulo_cadastrarAluno.setBounds(40, 20, 200, 20);
		painel1.add(titulo_cadastrarAluno);
		
		infoCaixaTexto1.setBounds(40, 50, 200, 20);
		painel1.add(infoCaixaTexto1);
		
		caixaTexto1.setBounds(40, 70, 100, 20);
		painel1.add(caixaTexto1);
		
		infoCaixaTexto2.setBounds(40, 90, 100, 20);
		painel1.add(infoCaixaTexto2);
		
		caixaTexto2.setBounds(40, 110, 100, 20);
		painel1.add(caixaTexto2);
		
		infoCaixaTexto3.setBounds(40, 130, 100, 20);
		painel1.add(infoCaixaTexto3);
		
		caixaTexto3.setBounds(40, 150, 100, 20);
		painel1.add(caixaTexto3);
		
		botaoCadastrarAluno.setBounds(40, 190, 100, 20);
		painel1.add(botaoCadastrarAluno);
		
		//////////////////////// Cadastrar Semestre ////////////////////////////
		
		titulo_cadastrarSemestre.setBounds(180, 20, 200, 20);
		painel1.add(titulo_cadastrarSemestre);
		
		infoCaixaTexto4.setBounds(180, 50, 200, 20);
		painel1.add(infoCaixaTexto4);
		
		List<Aluno> la = s.listaAlunos();
		
		String[] nomes = new String[la.size()];
		
		for(int i=0; i<la.size(); i++) {
			nomes[i] = la.get(i).getNome();
		}
		
	    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(nomes);
	    JComboBox<String> cb = new JComboBox<>(model);
	    
	    cb.setBounds(180, 70, 100, 20);
	    painel1.add(cb);
	    
		infoCaixaTexto5.setBounds(180, 90, 100, 20);
		painel1.add(infoCaixaTexto5);
		
		caixaTexto5.setBounds(180, 110, 100, 20);
		painel1.add(caixaTexto5);
	    
		infoCaixaTexto6.setBounds(180, 130, 100, 20);
		painel1.add(infoCaixaTexto6);
		
		caixaTexto6.setBounds(180, 150, 100, 20);
		painel1.add(caixaTexto6);
		
		botaoCadastrarSemestre.setBounds(180, 190, 100, 20);
		painel1.add(botaoCadastrarSemestre);
		
		///////////////////// Cadastrar Disciplina ////////////////////////
		
		titulo_cadastrarDisciplina.setBounds(320, 20, 200, 20);
		painel1.add(titulo_cadastrarDisciplina);
		
		infoCaixaTexto7.setBounds(320, 50, 200, 20);
		painel1.add(infoCaixaTexto7);
		
	    //DefaultComboBoxModel<String> model2 = new DefaultComboBoxModel<>(nomes);
	    JComboBox<String> cb2 = new JComboBox<>(model);
	    
	    cb2.setBounds(320, 70, 100, 20);
	    painel1.add(cb2);
	    
		infoCaixaTexto8.setBounds(320, 90, 200, 20);
		painel1.add(infoCaixaTexto8);

		caixaTexto8.setBounds(320, 110, 100, 20);
		painel1.add(caixaTexto8);
		
		infoCaixaTexto9.setBounds(320, 130, 200, 20);
		painel1.add(infoCaixaTexto9);

		caixaTexto9.setBounds(320, 150, 100, 20);
		painel1.add(caixaTexto9);
		
		infoCaixaTexto12.setBounds(320, 170, 200, 20);
		painel1.add(infoCaixaTexto12);

		caixaTexto12.setBounds(320, 190, 100, 20);
		painel1.add(caixaTexto12);
		
		infoCaixaTexto10.setBounds(320, 210, 200, 20);
		painel1.add(infoCaixaTexto10);

		caixaTexto10.setBounds(320, 230, 100, 20);
		painel1.add(caixaTexto10);
		
		infoCaixaTexto11.setBounds(320, 250, 200, 20);
		painel1.add(infoCaixaTexto11);

		caixaTexto11_1.setBounds(320, 270, 100, 20);
		painel1.add(caixaTexto11_1);
		
		caixaTexto11_2.setBounds(320, 290, 100, 20);
		painel1.add(caixaTexto11_2);
		
		caixaTexto11_3.setBounds(320, 310, 100, 20);
		painel1.add(caixaTexto11_3);
		
		botaoCadastrarDisciplina.setBounds(320, 350, 100, 20);
		painel1.add(botaoCadastrarDisciplina);
		
		/////////////////////// Cadastrar Avaliação ///////////////////////
		
		titulo_cadastrarAvaliacao.setBounds(460, 20, 200, 20);
		painel1.add(titulo_cadastrarAvaliacao);
		
		infoCaixaTexto13.setBounds(460, 50, 200, 20);
		painel1.add(infoCaixaTexto13);
		
	    JComboBox<String> cb3 = new JComboBox<>(model);
	    
	    cb3.setBounds(460, 70, 100, 20);
	    painel1.add(cb3);
	    
		infoCaixaTexto14.setBounds(460, 90, 200, 20);
		painel1.add(infoCaixaTexto14);
		
		caixaTexto14.setBounds(460, 110, 100, 20);
		painel1.add(caixaTexto14);

		infoCaixaTexto15.setBounds(460, 130, 200, 20);
		painel1.add(infoCaixaTexto15);
		
		caixaTexto15.setBounds(460, 150, 100, 20);
		painel1.add(caixaTexto15);
		
		infoCaixaTexto16.setBounds(460, 170, 200, 20);
		painel1.add(infoCaixaTexto16);
		
		caixaTexto16.setBounds(460, 190, 100, 20);
		painel1.add(caixaTexto16);
		
		infoCaixaTexto17.setBounds(460, 210, 200, 20);
		painel1.add(infoCaixaTexto17);
		
		caixaTexto17.setBounds(460, 230, 100, 20);
		painel1.add(caixaTexto17);
		
		infoCaixaTexto18.setBounds(460, 250, 200, 20);
		painel1.add(infoCaixaTexto18);
		
		caixaTexto18.setBounds(460, 270, 100, 20);
		painel1.add(caixaTexto18);
		
		infoCaixaTexto19.setBounds(460, 290, 200, 20);
		painel1.add(infoCaixaTexto19);
		
		caixaTexto19.setBounds(460, 310, 100, 20);
		painel1.add(caixaTexto19);
		
		botaoCadastrarAvaliacao.setBounds(460, 350, 100, 20);
		painel1.add(botaoCadastrarAvaliacao);
		
		////////////////////////// PAINEL 2 ///////////////////////////////
		
		////////////////////// Remover Aluno //////////////////////////////
		
		titulo_removerAluno.setBounds(40, 20, 200, 20);
		painel2.add(titulo_removerAluno);
		
		infoCaixaTexto20.setBounds(40, 50, 200, 20);
		painel2.add(infoCaixaTexto20);
		
	    JComboBox<String> cb4 = new JComboBox<>(model);

		 cb4.setBounds(40, 70, 100, 20);
		 painel2.add(cb4);
		 
		 botaoRemoverAluno.setBounds(40, 110, 100, 20);
		 painel2.add(botaoRemoverAluno);
		 
		/////////////////////// Remover Semestre //////////////////////////
		 
		 titulo_removerSemestre.setBounds(180, 20, 200, 20);
		 painel2.add(titulo_removerSemestre);
		
		infoCaixaTexto21.setBounds(180, 50, 200, 20);
		painel2.add(infoCaixaTexto21);
		
		JComboBox<String> cb5 = new JComboBox<>(model);

		 cb5.setBounds(180, 70, 100, 20);
		 painel2.add(cb5);
		
		infoCaixaTexto22.setBounds(180, 90, 200, 20);
		painel2.add(infoCaixaTexto22);
		
		caixaTexto22.setBounds(180, 110, 100, 20);
		painel2.add(caixaTexto22);

		 botaoRemoverSemestre.setBounds(180, 150, 100, 20);
		 painel2.add(botaoRemoverSemestre);
		 
		 ///////////////////// Remover Disciplina /////////////////////////
		
		 titulo_removerDisciplina.setBounds(320, 20, 200, 20);
		 painel2.add(titulo_removerDisciplina);
		 
		infoCaixaTexto23.setBounds(320, 50, 200, 20);
		painel2.add(infoCaixaTexto23);
		
		JComboBox<String> cb6 = new JComboBox<>(model);

		 cb6.setBounds(320, 70, 100, 20);
		 painel2.add(cb6);
		 
		infoCaixaTexto24.setBounds(320, 90, 200, 20);
		painel2.add(infoCaixaTexto24);
		 
		caixaTexto24.setBounds(320, 110, 100, 20);
		painel2.add(caixaTexto24);
		
		infoCaixaTexto25.setBounds(320, 130, 200, 20);
		painel2.add(infoCaixaTexto25);
		 
		caixaTexto25.setBounds(320, 150, 100, 20);
		painel2.add(caixaTexto25);
		
		 botaoRemoverDisciplina.setBounds(320, 190, 100, 20);
		 painel2.add(botaoRemoverDisciplina);
		 
		 //////////////////////// Remover Avaliação ///////////////////////
		 
		 titulo_removerAvaliacao.setBounds(460, 20, 200, 20);
		 painel2.add(titulo_removerAvaliacao);
		 
		infoCaixaTexto26.setBounds(460, 50, 200, 20);
		painel2.add(infoCaixaTexto26);
			
		JComboBox<String> cb7 = new JComboBox<>(model);

		cb7.setBounds(460, 70, 100, 20);
		painel2.add(cb7);
		 
		infoCaixaTexto27.setBounds(460, 90, 200, 20);
		painel2.add(infoCaixaTexto27);
		 
		caixaTexto27.setBounds(460, 110, 100, 20);
		painel2.add(caixaTexto27);
		
		infoCaixaTexto28.setBounds(460, 130, 200, 20);
		painel2.add(infoCaixaTexto28);
		 
		caixaTexto28.setBounds(460, 150, 100, 20);
		painel2.add(caixaTexto28);
		
		infoCaixaTexto29.setBounds(460, 170, 200, 20);
		painel2.add(infoCaixaTexto29);
		 
		caixaTexto29.setBounds(460, 190, 100, 20);
		painel2.add(caixaTexto29);
		
		 botaoRemoverAvaliacao.setBounds(460, 230, 100, 20);
		 painel2.add(botaoRemoverAvaliacao);
		
		 /////////////////////////// PAINEL 4 /////////////////////////////
		 
		 //////////////////////// Gerar Relatório /////////////////////////
		 titulo_GerarRelatorio.setBounds(270, 40, 200, 20);
		 painel4.add(titulo_GerarRelatorio);
		 
		 infoCaixaTexto30.setBounds(270, 60, 200, 20);
		 painel4.add(infoCaixaTexto30);
		 
		 JComboBox<String> cb8 = new JComboBox<>(model);

		 cb8.setBounds(270, 80, 100, 20);
		 painel4.add(cb8);
		
		 botaoGerarRelatorio.setBounds(270, 120, 100, 20);
		 painel4.add(botaoGerarRelatorio);
		 
		 titulo_consultarNotas.setBounds(270, 160, 100, 20);
		 painel4.add(titulo_consultarNotas);
		 
		 infoCaixaTexto49.setBounds(270, 180, 200, 20);
		 painel4.add(infoCaixaTexto49);
		 
		 JComboBox<String> cb13 = new JComboBox<>(model);

		 cb13.setBounds(270, 200, 100, 20);
		 painel4.add(cb13);
		 
		 infoCaixaTexto50.setBounds(270, 220, 200, 20);
		 painel4.add(infoCaixaTexto50);
		 
		 caixaTexto50.setBounds(270, 240, 100, 20);
		 painel4.add(caixaTexto50);
		 
		 infoCaixaTexto51.setBounds(270, 260, 200, 20);
		 painel4.add(infoCaixaTexto51);
		 
		 caixaTexto51.setBounds(270, 280, 100, 20);
		 painel4.add(caixaTexto51);
		 
		 botaoConsultarNotas.setBounds(270, 320, 100, 20);
		 painel4.add(botaoConsultarNotas);
		 
		 ////////////////////////// PAINEL 3 ////////////////////////////////
		 
		 //////////////////////// Editar aluno //////////////////////////////
		 
		 titulo_editarAluno.setBounds(40, 20, 200, 20);
		 painel3.add(titulo_editarAluno);
		 
		 infoCaixaTexto31.setBounds(40, 50, 200, 20);
		 painel3.add(infoCaixaTexto31);
		 
		 JComboBox<String> cb9 = new JComboBox<>(model);

		 cb9.setBounds(40, 70, 100, 20);
		 painel3.add(cb9);
		
		 infoCaixaTexto32.setBounds(40, 90, 200, 20);
		 painel3.add(infoCaixaTexto32);
		 
		 caixaTexto32.setBounds(40, 110, 100, 20);
		 painel3.add(caixaTexto32);
		 
		 infoCaixaTexto33.setBounds(40, 130, 200, 20);
		 painel3.add(infoCaixaTexto33);
		 
		 caixaTexto33.setBounds(40, 150, 100, 20);
		 painel3.add(caixaTexto33);
		 
		 botaoEditarAluno.setBounds(40, 190, 100, 20);
		 painel3.add(botaoEditarAluno);
		 
		 ///////////////////////// Editar semestre ////////////////////////
		 
		 titulo_editarSemestre.setBounds(180, 20, 200, 20);
		 painel3.add(titulo_editarSemestre);
		 
		 infoCaixaTexto34.setBounds(180, 50, 200, 20);
		 painel3.add(infoCaixaTexto34);
		 
		 JComboBox<String> cb10 = new JComboBox<>(model);

		 cb10.setBounds(180, 70, 100, 20);
		 painel3.add(cb10);
		 
		 infoCaixaTexto35.setBounds(180, 90, 200, 20);
		 painel3.add(infoCaixaTexto35);
		 
		 caixaTexto35.setBounds(180, 110, 100, 20);
		 painel3.add(caixaTexto35);
		 
		 infoCaixaTexto37.setBounds(180, 130, 200, 20);
		 painel3.add(infoCaixaTexto37);
		 
		 caixaTexto37.setBounds(180, 150, 100, 20);
		 painel3.add(caixaTexto37);
		 
		 botaoEditarSemestre.setBounds(180, 190, 100, 20);
		 painel3.add(botaoEditarSemestre);
		 
		 
		 ////////////////////// Editar Disciplina //////////////////////////
		 
		 titulo_editarDisciplina.setBounds(320, 20, 200, 20);
		 painel3.add(titulo_editarDisciplina);
		 
		 infoCaixaTexto38.setBounds(320, 50, 200, 20);
		 painel3.add(infoCaixaTexto38);
		 
		 JComboBox<String> cb11 = new JComboBox<>(model);

		 cb11.setBounds(320, 70, 100, 20);
		 painel3.add(cb11);
		 
		 infoCaixaTexto39.setBounds(320, 90, 200, 20);
		 painel3.add(infoCaixaTexto39);
		 
		 caixaTexto39.setBounds(320, 110, 100, 20);
		 painel3.add(caixaTexto39);
		 
		 infoCaixaTexto40.setBounds(320, 130, 200, 20);
		 painel3.add(infoCaixaTexto40);
		 
		 caixaTexto40.setBounds(320, 150, 100, 20);
		 painel3.add(caixaTexto40);
		 
		 infoCaixaTexto41.setBounds(320, 170, 200, 20);
		 painel3.add(infoCaixaTexto41);
		 
		 caixaTexto41.setBounds(320, 190, 100, 20);
		 painel3.add(caixaTexto41);
		 
		 infoCaixaTexto42.setBounds(320, 210, 200, 20);
		 painel3.add(infoCaixaTexto42);
		 
		 caixaTexto42.setBounds(320, 230, 100, 20);
		 painel3.add(caixaTexto42);
		 
		 botaoEditarDisciplina.setBounds(320, 270, 100, 20);
		 painel3.add(botaoEditarDisciplina);
		 
		 //////////////////////// Editar Avaliação ////////////////////////
		 
		 titulo_editarAvaliacao.setBounds(460, 20, 200, 20);
		 painel3.add(titulo_editarAvaliacao);
		 
		 infoCaixaTexto43.setBounds(460, 50, 200, 20);
		 painel3.add(infoCaixaTexto43);
		 
		 JComboBox<String> cb12 = new JComboBox<>(model);

		 cb12.setBounds(460, 70, 100, 20);
		 painel3.add(cb12);
		 
		 infoCaixaTexto44.setBounds(460, 90, 200, 20);
		 painel3.add(infoCaixaTexto44);
		 
		 caixaTexto44.setBounds(460, 110, 100, 20);
		 painel3.add(caixaTexto44);
		 
		 infoCaixaTexto45.setBounds(460, 130, 200, 20);
		 painel3.add(infoCaixaTexto45);
		 
		 caixaTexto45.setBounds(460, 150, 100, 20);
		 painel3.add(caixaTexto45);
		 
		 infoCaixaTexto46.setBounds(460, 170, 200, 20);
		 painel3.add(infoCaixaTexto46);
		 
		 caixaTexto46.setBounds(460, 190, 100, 20);
		 painel3.add(caixaTexto46);
		 
		 infoCaixaTexto47.setBounds(460, 210, 200, 20);
		 painel3.add(infoCaixaTexto47);
		 
		 caixaTexto47.setBounds(460, 230, 100, 20);
		 painel3.add(caixaTexto47);
		 
		 infoCaixaTexto48.setBounds(460, 250, 200, 20);
		 painel3.add(infoCaixaTexto48);
		 
		 caixaTexto48.setBounds(460, 270, 100, 20);
		 painel3.add(caixaTexto48);
		 
		 botaoEditarAvaliacao.setBounds(460, 310, 100, 20);
		 painel3.add(botaoEditarAvaliacao);
		 		 
		 
	    /////////////////////////// BOTÕES ////////////////////////////////
		botaoCadastrarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Aluno a = new Aluno();
				a.setNome(caixaTexto1.getText());
				a.setCpf(Integer.parseInt(caixaTexto2.getText()));
				a.setCurso(caixaTexto3.getText());
			

				String nome = caixaTexto1.getText();
		        model.addElement(nome);
		        cb.setSelectedItem(nome);
		        
		        
				try {
					s.cadastrarAluno(a);
					

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		        
				caixaTexto1.setText("");
				caixaTexto2.setText("");
				caixaTexto3.setText("");
				
			}
		});
		
		
		botaoCadastrarSemestre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Semestre semestre = new Semestre();
				
				semestre.setCodigo(Integer.parseInt(caixaTexto5.getText()));
				semestre.setFase(Integer.parseInt(caixaTexto6.getText()));
				
				try {
					List<Aluno> lista = atualizar();
					
					for(int i=0; i<lista.size(); i++) {
						if(lista.get(i).getNome().equals((String) cb.getSelectedItem())) {
							
							s.cadastrarSemestre(lista.get(i), semestre);
						}
					}
				} catch (ClassNotFoundException | SQLException | SelectException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				caixaTexto5.setText("");
				caixaTexto6.setText("");
			}
		});
		
		botaoCadastrarDisciplina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Disciplina disciplina = new Disciplina();
				
				disciplina.setNome(caixaTexto9.getText());
				disciplina.setCodigo(Integer.parseInt(caixaTexto12.getText()));
				disciplina.setDepartamento(caixaTexto10.getText());
				
				List<Float> notas = new ArrayList<Float>();
				notas.add(Float.parseFloat(caixaTexto11_1.getText()));
				notas.add(Float.parseFloat(caixaTexto11_2.getText()));
				notas.add(Float.parseFloat(caixaTexto11_3.getText()));
				disciplina.setNotas(notas);
				
				
				try {
					List<Aluno> lista2 = atualizar();
					
					for(int i=0; i<lista2.size(); i++) {
						if(lista2.get(i).getNome().equals((String) cb2.getSelectedItem())) {
							List<Semestre> lista_semestre = atualizar2(lista2.get(i));
							
							for(int j=0; j<lista_semestre.size(); j++) {
								if(lista_semestre.get(j).getFase() == Integer.parseInt(caixaTexto8.getText())) {
									s.cadastrarDisciplina(lista2.get(i), lista_semestre.get(j), disciplina);
			
								}
							}
						}
					}

					
				} catch (ClassNotFoundException | SQLException | SelectException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				caixaTexto8.setText("");
				caixaTexto9.setText("");
				caixaTexto10.setText("");
				caixaTexto11_1.setText("");
				caixaTexto11_2.setText("");
				caixaTexto11_3.setText("");
				caixaTexto12.setText("");
				
				
			}		
		});
		
		botaoCadastrarAvaliacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Avaliacao avaliacao = new Avaliacao();
				
				avaliacao.setNome(caixaTexto16.getText());
				avaliacao.setCodigo(Integer.parseInt(caixaTexto17.getText()));
				avaliacao.setPeso(Integer.parseInt(caixaTexto18.getText()));
				avaliacao.setData(caixaTexto19.getText());

				try {
					List<Aluno> lista3 = atualizar();
					
					for(int i=0; i<lista3.size(); i++) {
						if(lista3.get(i).getNome().equals((String) cb3.getSelectedItem())) {
							List<Semestre> lista_semestre2 = atualizar2(lista3.get(i));
							
							for(int j=0; j<lista_semestre2.size(); j++) {
								if(lista_semestre2.get(j).getFase() == Integer.parseInt(caixaTexto14.getText())) {
									List<Disciplina> lista_disciplina = atualizar3(lista3.get(i), lista_semestre2.get(j));
									
									for(int k=0; k<lista_disciplina.size(); k++) {
										if(lista_disciplina.get(k).getNome().equals(caixaTexto15.getText())) {
											s.cadastrarAvaliacao(lista3.get(i), lista_semestre2.get(j), lista_disciplina.get(k), avaliacao);
										}
									}
								}
							}
						}
					}
					
				} catch (ClassNotFoundException | SQLException | SelectException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				caixaTexto14.setText("");
				caixaTexto15.setText("");
				caixaTexto16.setText("");
				caixaTexto17.setText("");
				caixaTexto18.setText("");
				caixaTexto19.setText("");
				
			}		
		});
		
		botaoRemoverAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				try {
					List<Aluno> lista4 = atualizar();
					
					for(int i=0; i<lista4.size(); i++) {
						if(lista4.get(i).getNome().equals((String) cb4.getSelectedItem())) {
							s.removerAluno(lista4.get(i));
						}
					}
					
				} catch (ClassNotFoundException | SQLException | SelectException e) {
					e.printStackTrace();
				}
				
			}
		});
		
		
		botaoRemoverSemestre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					List<Aluno> lista5 = atualizar();
					
					for(int i=0; i<lista5.size(); i++) {
						if(lista5.get(i).getNome().equals((String) cb5.getSelectedItem())) {
							List<Semestre> lista_semestre3 = atualizar2(lista5.get(i));
							
							for(int j=0; j<lista_semestre3.size(); j++) {
								if(lista_semestre3.get(j).getFase() == Integer.parseInt(caixaTexto22.getText())) {
									s.removerSemestre(lista5.get(i), lista_semestre3.get(j));
								}
							}
						}
					}
					
					
				} catch (ClassNotFoundException | SQLException | SelectException e) {
					e.printStackTrace();
				}
				
				caixaTexto22.setText("");
				
			}
		});
		
		botaoRemoverDisciplina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					List<Aluno> lista6 = atualizar();
					
					for(int i=0; i<lista6.size(); i++) {
						if(lista6.get(i).getNome().equals((String) cb6.getSelectedItem())) {
							List<Semestre> lista_semestre4 = atualizar2(lista6.get(i));
							
							for(int j=0; j<lista_semestre4.size(); j++) {
								if(lista_semestre4.get(j).getFase() == Integer.parseInt(caixaTexto24.getText())) {
									List<Disciplina> lista_disciplina2 = atualizar3(lista6.get(i), lista_semestre4.get(j));
									
									for(int k=0; k<lista_disciplina2.size(); k++) {
										if(lista_disciplina2.get(k).getNome().equals(caixaTexto25.getText())) {
											s.removerDisciplina(lista6.get(i), lista_semestre4.get(j), lista_disciplina2.get(k));
										}
									}
								}
							}
						}
					}
					
					
				} catch (ClassNotFoundException | SQLException | SelectException e) {
					e.printStackTrace();
				}
				
				caixaTexto24.setText("");
				caixaTexto25.setText("");
				
			}
		});
		
		botaoRemoverAvaliacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					List<Aluno> lista7 = atualizar();
					
					for(int i=0; i<lista7.size(); i++) {
						if(lista7.get(i).getNome().equals((String) cb7.getSelectedItem())) {
							List<Semestre> lista_semestre5 = atualizar2(lista7.get(i));
							
							for(int j=0; j<lista_semestre5.size(); j++) {
								if(lista_semestre5.get(j).getFase() == Integer.parseInt(caixaTexto27.getText())) {
									List<Disciplina> lista_disciplina3 = atualizar3(lista7.get(i), lista_semestre5.get(j));
									
									for(int k=0; k<lista_disciplina3.size(); k++) {
										if(lista_disciplina3.get(k).getNome().equals(caixaTexto28.getText())) {
											List<Avaliacao> lista_avaliacao = atualizar4(lista7.get(i), lista_semestre5.get(j), lista_disciplina3.get(k));
											
											for(int l=0; l<lista_avaliacao.size(); l++) {											
												if(lista_avaliacao.get(l).getNome().equals(caixaTexto29.getText())) {
													s.removerAvaliacao(lista7.get(i), lista_semestre5.get(j), lista_disciplina3.get(k), lista_avaliacao.get(l));
												}
											}
										}
									}
								}
							}
						}
					}
					
					
				} catch (ClassNotFoundException | SQLException | SelectException e) {
					e.printStackTrace();
				}
				
				caixaTexto27.setText("");
				caixaTexto28.setText("");
				caixaTexto29.setText("");
			}
		});
		
		botaoGerarRelatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					List<Aluno> lista8 = atualizar();
					
					for(int i=0; i<lista8.size(); i++) {
						if(lista8.get(i).getNome().equals((String) cb8.getSelectedItem())) {
							s.GerarRelatorio(lista8.get(i));
						}
					}
					
				} catch (ClassNotFoundException | SQLException | SelectException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		botaoEditarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					List<Aluno> lista9 = atualizar();
					
					for(int i=0; i<lista9.size(); i++) {
						if(lista9.get(i).getNome().equals((String) cb9.getSelectedItem())) {
							if(!caixaTexto32.getText().equals("")) {
								lista9.get(i).setNome(caixaTexto32.getText());
							}
							
							if(!caixaTexto33.getText().equals("")){
								lista9.get(i).setCurso(caixaTexto33.getText());
							}
							
							s.editarAluno(lista9.get(i));
							
							String nome = caixaTexto32.getText();
					        model.addElement(nome);
					        cb.setSelectedItem(nome);
						}
					}
					
					
				} catch (ClassNotFoundException | SQLException | SelectException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				caixaTexto32.setText("");
				caixaTexto33.setText("");
				
			}
		});
		
		
		botaoEditarSemestre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					List<Aluno> lista10 = atualizar();
					
					for(int i=0; i<lista10.size(); i++) {
						if(lista10.get(i).getNome().equals((String) cb10.getSelectedItem())) {
							List<Semestre> lista_semestre6 = atualizar2(lista10.get(i));
							
							for(int j=0; j<lista_semestre6.size(); j++) {
								if(lista_semestre6.get(j).getFase() == Integer.parseInt(caixaTexto35.getText())) {									
									if(!caixaTexto37.getText().equals("")) {
										lista_semestre6.get(j).setFase(Integer.parseInt(caixaTexto37.getText()));
									}
									
									s.editarSemestre(lista10.get(i), lista_semestre6.get(j));
								}
							}
						}		
					}
				
			}catch (ClassNotFoundException | SQLException | SelectException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
				
				caixaTexto35.setText("");
				caixaTexto37.setText("");

			}	
		});
		
		botaoEditarDisciplina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					List<Aluno> lista11 = atualizar();
					
					for(int i=0; i<lista11.size(); i++) {
						if(lista11.get(i).getNome().equals((String) cb11.getSelectedItem())) {
							List<Semestre> lista_semestre7 = atualizar2(lista11.get(i));
							
							for(int j=0; j<lista_semestre7.size(); j++) {
								if(lista_semestre7.get(j).getFase() == Integer.parseInt(caixaTexto39.getText())) {									
									List<Disciplina> lista_disciplina4 = atualizar3(lista11.get(i), lista_semestre7.get(j));
									
									for(int k=0; k<lista_disciplina4.size(); k++) {
										if(lista_disciplina4.get(k).getNome().equals(caixaTexto40.getText())) {
											if(!caixaTexto41.getText().equals("")) {
												lista_disciplina4.get(k).setNome(caixaTexto41.getText());
											}
											if(!caixaTexto42.getText().equals("")) {
												lista_disciplina4.get(k).setDepartamento(caixaTexto42.getText());
											}
											
											s.editarDisciplina(lista11.get(i), lista_semestre7.get(j), lista_disciplina4.get(k));
										}
									}
								}
							}
						}		
					}
				
			}catch (ClassNotFoundException | SQLException | SelectException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
				
				caixaTexto39.setText("");
				caixaTexto40.setText("");
				caixaTexto41.setText("");
				caixaTexto42.setText("");
			}
		});
		
		botaoEditarAvaliacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					List<Aluno> lista12 = atualizar();
					
					for(int i=0; i<lista12.size(); i++) {
						if(lista12.get(i).getNome().equals((String) cb12.getSelectedItem())) {
							List<Semestre> lista_semestre8 = atualizar2(lista12.get(i));
							
							for(int j=0; j<lista_semestre8.size(); j++) {
								if(lista_semestre8.get(j).getFase() == Integer.parseInt(caixaTexto44.getText())) {									
									List<Disciplina> lista_disciplina5 = atualizar3(lista12.get(i), lista_semestre8.get(j));
									
									for(int k=0; k<lista_disciplina5.size(); k++) {
										if(lista_disciplina5.get(k).getNome().equals(caixaTexto45.getText())) {
											List<Avaliacao> lista_avaliacao2 = atualizar4(lista12.get(i), lista_semestre8.get(j), lista_disciplina5.get(k));
											
											for(int l=0; l<lista_avaliacao2.size(); l++) {
												if(lista_avaliacao2.get(l).getNome().equals(caixaTexto46.getText())) {
													if(!caixaTexto47.getText().equals("")) {
														lista_avaliacao2.get(l).setNome(caixaTexto47.getText());
													}
													if(!caixaTexto48.getText().equals("")) {
														lista_avaliacao2.get(l).setData(caixaTexto48.getText());
													}
													
													s.editarAvaliacao(lista12.get(i), lista_semestre8.get(j), lista_disciplina5.get(k), lista_avaliacao2.get(l));
												}
											}
										}
									}
								}
							}
						}		
					}
				
			}catch (ClassNotFoundException | SQLException | SelectException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
				
				caixaTexto44.setText("");
				caixaTexto45.setText("");
				caixaTexto46.setText("");
				caixaTexto47.setText("");
				caixaTexto48.setText("");

			}
		});
		
		
		botaoConsultarNotas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					List<Aluno> lista13 = atualizar();
					
					for(int i=0; i<lista13.size(); i++) {
						if(lista13.get(i).getNome().equals((String) cb13.getSelectedItem())) {
							List<Semestre> lista_semestre9 = atualizar2(lista13.get(i));
							
							for(int j=0; j<lista_semestre9.size(); j++) {
								if(lista_semestre9.get(j).getFase() == Integer.parseInt(caixaTexto50.getText())) {									
									List<Disciplina> lista_disciplina6 = atualizar3(lista13.get(i), lista_semestre9.get(j));
									
									for(int k=0; k<lista_disciplina6.size(); k++) {
										if(lista_disciplina6.get(k).getNome().equals(caixaTexto51.getText())) {
											if(lista_disciplina6.get(k).getMedia_final() >= 7) {
												JOptionPane.showMessageDialog(null, "Sua média para a disciplina de " + lista_disciplina6.get(k).getNome() + " é: " + lista_disciplina6.get(k).getMedia_final()
														+ "\n Você está aprovado!", "Consulta de Notas", JOptionPane.INFORMATION_MESSAGE);
											}
											
											if(lista_disciplina6.get(k).getMedia_final() < 7 && lista_disciplina6.get(k).getMedia_final() >= 1.7) {
												JOptionPane.showMessageDialog(null, "Sua média para a disciplina de " + lista_disciplina6.get(k).getNome() + " é: " + lista_disciplina6.get(k).getMedia_final()
														+ "\n Nota necessária para o exame: " + lista_disciplina6.get(k).getNota_exame(), "Consulta de Notas",  JOptionPane.INFORMATION_MESSAGE);
											}
											
											if(lista_disciplina6.get(k).getMedia_final() < 1.7) {
												JOptionPane.showMessageDialog(null, "Você está reprovado!", "Consulta de Notas", JOptionPane.INFORMATION_MESSAGE);
											}										
										}
									}
								}
							}
						}
					}
			
			
			}catch (ClassNotFoundException | SQLException | SelectException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			
				caixaTexto50.setText("");
				caixaTexto51.setText("");
				
			}
			
		});
		
		////////////////////////////////////////////////////////////////////////
		
		pane.addTab("Cadastrar", null, painel1, "Cadastrar aluno, semestre, disciplina ou avaliações");
		pane.addTab("Remover", null, painel2, "Remover aluno, semestre, disciplina ou avaliações");
		pane.addTab("Editar", null, painel3, "Editar informações");
		pane.addTab("Notas", null, painel4, "Consultar notas e gerar relatório");
		
		
		Container c = getContentPane();
		setSize(650, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.add(pane, BorderLayout.CENTER);
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SelectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public List<Aluno> atualizar() throws ClassNotFoundException, SQLException, SelectException {
		Sistema s = new Sistema();
		
		List<Aluno> la = s.listaAlunos();
		
		return la;
	}
	
	public List<Semestre> atualizar2(Aluno aluno) throws ClassNotFoundException, SQLException, SelectException {
		Sistema s = new Sistema();
		
		List<Semestre> ls = s.listaSemestres(aluno);
		
		return ls;
	}
	
	public List<Disciplina> atualizar3(Aluno aluno, Semestre semestre) throws ClassNotFoundException, SQLException, SelectException {
		Sistema s = new Sistema();
		
		List<Disciplina> ld = s.listaDisciplinas(aluno, semestre);
		
		return ld;
	}
	
	public List<Avaliacao> atualizar4(Aluno aluno, Semestre semestre, Disciplina disciplina) throws ClassNotFoundException, SQLException, SelectException {
		Sistema s = new Sistema();
		
		List<Avaliacao> lav = s.listaAvaliacoes(aluno, semestre, disciplina);
		
		return lav;
	}
	
	
	
}
