package apresentacao;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
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
	
	private JLabel titulo_cadastrarDisciplina= new JLabel("Cadastrar Disciplina");
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
		
		//////////////////////// Cadastrar Aluno ////////////////////////////////
		
		titulo_cadastrarAluno.setBounds(40, 10, 200, 20);
		painel1.add(titulo_cadastrarAluno);
		
		infoCaixaTexto1.setBounds(40, 40, 200, 20);
		painel1.add(infoCaixaTexto1);
		
		caixaTexto1.setBounds(40, 60, 100, 20);
		painel1.add(caixaTexto1);
		
		infoCaixaTexto2.setBounds(40, 80, 100, 20);
		painel1.add(infoCaixaTexto2);
		
		caixaTexto2.setBounds(40, 100, 100, 20);
		painel1.add(caixaTexto2);
		
		infoCaixaTexto3.setBounds(40, 120, 100, 20);
		painel1.add(infoCaixaTexto3);
		
		caixaTexto3.setBounds(40, 140, 100, 20);
		painel1.add(caixaTexto3);
		
		botaoCadastrarAluno.setBounds(40, 180, 100, 20);
		painel1.add(botaoCadastrarAluno);
		
		//////////////////////// Cadastrar Semestre ////////////////////////////
		
		titulo_cadastrarSemestre.setBounds(180, 10, 200, 20);
		painel1.add(titulo_cadastrarSemestre);
		
		infoCaixaTexto4.setBounds(180, 40, 200, 20);
		painel1.add(infoCaixaTexto4);
		
		List<Aluno> la = s.listaAlunos();
		
		String[] nomes = new String[la.size()];
		
		for(int i=0; i<la.size(); i++) {
			nomes[i] = la.get(i).getNome();
		}
		
	    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(nomes);
	    JComboBox<String> cb = new JComboBox<>(model);
	    
	    cb.setBounds(180, 60, 100, 20);
	    painel1.add(cb);
	    
		infoCaixaTexto5.setBounds(180, 80, 100, 20);
		painel1.add(infoCaixaTexto5);
		
		caixaTexto5.setBounds(180, 100, 100, 20);
		painel1.add(caixaTexto5);
	    
		infoCaixaTexto6.setBounds(180, 120, 100, 20);
		painel1.add(infoCaixaTexto6);
		
		caixaTexto6.setBounds(180, 140, 100, 20);
		painel1.add(caixaTexto6);
		
		botaoCadastrarSemestre.setBounds(180, 180, 100, 20);
		painel1.add(botaoCadastrarSemestre);
		
		///////////////////// Cadastrar Disciplina ////////////////////////
		
		titulo_cadastrarDisciplina.setBounds(320, 10, 200, 20);
		painel1.add(titulo_cadastrarDisciplina);
		
		infoCaixaTexto7.setBounds(320, 40, 200, 20);
		painel1.add(infoCaixaTexto7);
		
	    //DefaultComboBoxModel<String> model2 = new DefaultComboBoxModel<>(nomes);
	    JComboBox<String> cb2 = new JComboBox<>(model);
	    
	    cb2.setBounds(320, 60, 100, 20);
	    painel1.add(cb2);
	    
		infoCaixaTexto8.setBounds(320, 80, 200, 20);
		painel1.add(infoCaixaTexto8);

		caixaTexto8.setBounds(320, 100, 100, 20);
		painel1.add(caixaTexto8);
		
		infoCaixaTexto9.setBounds(320, 120, 200, 20);
		painel1.add(infoCaixaTexto9);

		caixaTexto9.setBounds(320, 140, 100, 20);
		painel1.add(caixaTexto9);
		
		infoCaixaTexto12.setBounds(320, 160, 200, 20);
		painel1.add(infoCaixaTexto12);

		caixaTexto12.setBounds(320, 180, 100, 20);
		painel1.add(caixaTexto12);
		
		infoCaixaTexto10.setBounds(320, 200, 200, 20);
		painel1.add(infoCaixaTexto10);

		caixaTexto10.setBounds(320, 220, 100, 20);
		painel1.add(caixaTexto10);
		
		infoCaixaTexto11.setBounds(320, 240, 200, 20);
		painel1.add(infoCaixaTexto11);

		caixaTexto11_1.setBounds(320, 260, 100, 20);
		painel1.add(caixaTexto11_1);
		
		caixaTexto11_2.setBounds(320, 280, 100, 20);
		painel1.add(caixaTexto11_2);
		
		caixaTexto11_3.setBounds(320, 300, 100, 20);
		painel1.add(caixaTexto11_3);
		
		botaoCadastrarDisciplina.setBounds(320, 340, 100, 20);
		painel1.add(botaoCadastrarDisciplina);

		
	    /////////////////////////// BOTÕES ////////////////////////////////
		botaoCadastrarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Aluno a = new Aluno();
				a.setNome(caixaTexto1.getText());
				a.setCpf(Integer.parseInt(caixaTexto2.getText()));
				a.setCurso(caixaTexto3.getText());
			
				// ComboBox nome
				
				// aqui pega o nome do caixaTexto1 e joga pro outro campo
				String nome = caixaTexto1.getText();
		        model.addElement(nome);
		        cb.setSelectedItem(nome);
		        
		        
				caixaTexto1.setText("");
				caixaTexto2.setText("");
				caixaTexto3.setText("");
				
				try {
					s.cadastrarAluno(a);

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//System.out.println(a.getNome() + " - " + a.getCpf() + " - " + a.getCurso());
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
	    
		////////////////////////////////////////////////////////////////////////
		
		pane.addTab("Cadastrar", null, painel1, "Cadastrar aluno, semestre, disciplina ou avaliações");
		pane.addTab("Remover", null, painel2, "Informação Aba 1");
		pane.addTab("Editar", null, painel3, "Informação Aba 1");
		pane.addTab("Notas", null, painel4, "Informação Aba 2");
		
		
		Container c = getContentPane();
		setSize(600, 400);
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
	
}



























