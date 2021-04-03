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
		
		/////////////////////// Cadastrar Avaliação ///////////////////////
		
		titulo_cadastrarAvaliacao.setBounds(460, 10, 200, 20);
		painel1.add(titulo_cadastrarAvaliacao);
		
		infoCaixaTexto13.setBounds(460, 40, 200, 20);
		painel1.add(infoCaixaTexto13);
		
	    JComboBox<String> cb3 = new JComboBox<>(model);
	    
	    cb3.setBounds(460, 60, 100, 20);
	    painel1.add(cb3);
	    
		infoCaixaTexto14.setBounds(460, 80, 200, 20);
		painel1.add(infoCaixaTexto14);
		
		caixaTexto14.setBounds(460, 100, 100, 20);
		painel1.add(caixaTexto14);

		infoCaixaTexto15.setBounds(460, 120, 200, 20);
		painel1.add(infoCaixaTexto15);
		
		caixaTexto15.setBounds(460, 140, 100, 20);
		painel1.add(caixaTexto15);
		
		infoCaixaTexto16.setBounds(460, 160, 200, 20);
		painel1.add(infoCaixaTexto16);
		
		caixaTexto16.setBounds(460, 180, 100, 20);
		painel1.add(caixaTexto16);
		
		infoCaixaTexto17.setBounds(460, 200, 200, 20);
		painel1.add(infoCaixaTexto17);
		
		caixaTexto17.setBounds(460, 220, 100, 20);
		painel1.add(caixaTexto17);
		
		infoCaixaTexto18.setBounds(460, 240, 200, 20);
		painel1.add(infoCaixaTexto18);
		
		caixaTexto18.setBounds(460, 260, 100, 20);
		painel1.add(caixaTexto18);
		
		infoCaixaTexto19.setBounds(460, 280, 200, 20);
		painel1.add(infoCaixaTexto19);
		
		caixaTexto19.setBounds(460, 300, 100, 20);
		painel1.add(caixaTexto19);
		
		botaoCadastrarAvaliacao.setBounds(460, 340, 100, 20);
		painel1.add(botaoCadastrarAvaliacao);
		
		////////////////////////// PAINEL 2 ///////////////////////////////
		
		////////////////////// Remover Aluno //////////////////////////////
		
		titulo_removerAluno.setBounds(40, 10, 200, 20);
		painel2.add(titulo_removerAluno);
		
		infoCaixaTexto20.setBounds(40, 40, 200, 20);
		painel2.add(infoCaixaTexto20);
		
	    JComboBox<String> cb4 = new JComboBox<>(model);

		 cb4.setBounds(40, 60, 100, 20);
		 painel2.add(cb4);
		 
		 botaoRemoverAluno.setBounds(40, 100, 100, 20);
		 painel2.add(botaoRemoverAluno);
		 
		/////////////////////// Remover Semestre //////////////////////////
		 
		 titulo_removerSemestre.setBounds(180, 10, 200, 20);
		 painel2.add(titulo_removerSemestre);
		
		infoCaixaTexto21.setBounds(180, 40, 200, 20);
		painel2.add(infoCaixaTexto21);
		
		JComboBox<String> cb5 = new JComboBox<>(model);

		 cb5.setBounds(180, 60, 100, 20);
		 painel2.add(cb5);
		
		infoCaixaTexto22.setBounds(180, 80, 200, 20);
		painel2.add(infoCaixaTexto22);
		
		caixaTexto22.setBounds(180, 100, 100, 20);
		painel2.add(caixaTexto22);

		 botaoRemoverSemestre.setBounds(180, 140, 100, 20);
		 painel2.add(botaoRemoverSemestre);
		 
		 ///////////////////// Remover Disciplina /////////////////////////
		
		 titulo_removerDisciplina.setBounds(320, 10, 200, 20);
		 painel2.add(titulo_removerDisciplina);
		 
		infoCaixaTexto23.setBounds(320, 40, 200, 20);
		painel2.add(infoCaixaTexto23);
		
		JComboBox<String> cb6 = new JComboBox<>(model);

		 cb6.setBounds(320, 60, 100, 20);
		 painel2.add(cb6);
		 
		infoCaixaTexto24.setBounds(320, 80, 200, 20);
		painel2.add(infoCaixaTexto24);
		 
		caixaTexto24.setBounds(320, 100, 100, 20);
		painel2.add(caixaTexto24);
		
		infoCaixaTexto25.setBounds(320, 120, 200, 20);
		painel2.add(infoCaixaTexto25);
		 
		caixaTexto25.setBounds(320, 140, 100, 20);
		painel2.add(caixaTexto25);
		
		 botaoRemoverDisciplina.setBounds(320, 180, 100, 20);
		 painel2.add(botaoRemoverDisciplina);
		 
		 //////////////////////// Remover Avaliação ///////////////////////
		 
		 titulo_removerAvaliacao.setBounds(460, 10, 200, 20);
		 painel2.add(titulo_removerAvaliacao);
		 
		infoCaixaTexto26.setBounds(460, 40, 200, 20);
		painel2.add(infoCaixaTexto26);
			
		JComboBox<String> cb7 = new JComboBox<>(model);

		cb7.setBounds(460, 60, 100, 20);
		painel2.add(cb7);
		 
		infoCaixaTexto27.setBounds(460, 80, 200, 20);
		painel2.add(infoCaixaTexto27);
		 
		caixaTexto27.setBounds(460, 100, 100, 20);
		painel2.add(caixaTexto27);
		
		infoCaixaTexto28.setBounds(460, 120, 200, 20);
		painel2.add(infoCaixaTexto28);
		 
		caixaTexto28.setBounds(460, 140, 100, 20);
		painel2.add(caixaTexto28);
		
		infoCaixaTexto29.setBounds(460, 160, 200, 20);
		painel2.add(infoCaixaTexto29);
		 
		caixaTexto29.setBounds(460, 180, 100, 20);
		painel2.add(caixaTexto29);
		
		 botaoRemoverAvaliacao.setBounds(460, 220, 100, 20);
		 painel2.add(botaoRemoverAvaliacao);
		
		
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
		
	    
		////////////////////////////////////////////////////////////////////////
		
		pane.addTab("Cadastrar", null, painel1, "Cadastrar aluno, semestre, disciplina ou avaliações");
		pane.addTab("Remover", null, painel2, "Informação Aba 1");
		pane.addTab("Editar", null, painel3, "Informação Aba 1");
		pane.addTab("Notas", null, painel4, "Informação Aba 2");
		
		
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



























