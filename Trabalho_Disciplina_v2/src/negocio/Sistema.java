package negocio;

import dados.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


public class Sistema {
	private List<Aluno> ListaAlunos = new ArrayList <Aluno>();
	static Scanner leitor = new Scanner(System.in);
	
	public void cadastrarAluno(Aluno aluno) {
		if(aluno != null) {
			ListaAlunos.add(aluno);
		}
	}
	
	public void cadastrarSemestre(int cpf, Semestre semestre) {
		for(int i=0; i<ListaAlunos.size(); i++) {
			if(ListaAlunos.get(i).getCpf() == cpf) {
				ListaAlunos.get(i).adicionarSemestre(semestre);
			}
		}
	}
	
	public void cadastrarDisciplina(int cpf, Semestre semestre, Disciplina disciplina) {
		int fase = semestre.getFase();
		
		for(int i=0; i<ListaAlunos.size(); i++) {
			if(ListaAlunos.get(i).getCpf() == cpf) {
				List<Semestre> s = ListaAlunos.get(i).getSemestres();
				
				for(int j=0; j<s.size(); j++) {
					if(s.get(j).getFase() == fase) {
						s.get(j).adicionarDisciplina(disciplina);
					}	
				}
			}
		}
	}
	
	public void cadastrarAvaliacao(int cpf, Semestre semestre, Disciplina disciplina, Avaliacao avaliacao) {
		int fase = semestre.getFase();
		int codigo = avaliacao.getCodigo();
		
		for(int i=0; i<ListaAlunos.size(); i++) {
			if(ListaAlunos.get(i).getCpf() == cpf) {
				List<Semestre> s = ListaAlunos.get(i).getSemestres();
				
				for(int j=0; j<s.size(); j++) {
					if(s.get(j).getFase() == fase) {
						List<Disciplina> d = s.get(j).getDisciplinas();
						
						for(int k=0; k<d.size(); k++) {
							if(d.get(k).getCodigo() == codigo) {
								d.get(k).adicionarAvaliacao(avaliacao);
							}
						}
					}
				}
			}
		}
	}
	
	public void calcularMedia(int cpf, Semestre semestre, Disciplina disciplina) {
		int fase = semestre.getFase();
		String nome = disciplina.getNome();
		float media = 0;
		
		for(int i=0; i<ListaAlunos.size(); i++) {
			if(ListaAlunos.get(i).getCpf() == cpf) {
				List<Semestre> s = ListaAlunos.get(i).getSemestres();
				
				for(int j=0; j<s.size(); j++) {
					if(s.get(j).getFase() == fase) {
						List<Disciplina> d = s.get(j).getDisciplinas();
						
						for(int k=0; k<d.size(); k++) {
							if(d.get(k).getNome() == nome) {
								media = d.get(k).calcularMedia();
								
								d.get(k).setMedia_final(media);
							}
						}
					}
				}
			}
		}
	}
	
	public void calcularMediaExame(int cpf, Semestre semestre, Disciplina disciplina) {
		int fase = semestre.getFase();
		String nome = disciplina.getNome();
		float media = 0;
		
		for(int i=0; i<ListaAlunos.size(); i++) {
			if(ListaAlunos.get(i).getCpf() == cpf) {
				List<Semestre> s = ListaAlunos.get(i).getSemestres();
				
				for(int j=0; j<s.size(); j++) {
					if(s.get(j).getFase() == fase) {
						List<Disciplina> d = s.get(j).getDisciplinas();
						
						for(int k=0; k<d.size(); k++) {
							if(d.get(k).getNome() == nome) {
								media = d.get(k).calcularNotaExame();
								
								d.get(k).setNota_exame(media);
							}
						}
					}
				}
			}
		}
	}
	
	public void removerSemestre(int cpf, int fase) {
		for(int i=0; i<ListaAlunos.size(); i++) {
			if(ListaAlunos.get(i).getCpf() == cpf) {
				ListaAlunos.get(i).removerSemestre(fase);			
			}
		}
	}
	
	public void removerDisciplina(int cpf, int fase, String nome_dis) {
		for(int i=0; i<ListaAlunos.size(); i++) {
			if(ListaAlunos.get(i).getCpf() == cpf) {
				List<Semestre> s = ListaAlunos.get(i).getSemestres();
				
				for(int j=0; j<s.size(); j++) {
					if(s.get(j).getFase() == fase) {
						s.get(j).removerDisciplina(nome_dis);
					}
				}
			}
		}
	}
	
	public void removerAvaliacao(int cpf, int fase, String nome_dis, String nome_ava) {
		for(int i=0; i<ListaAlunos.size(); i++) {
			if(ListaAlunos.get(i).getCpf() == cpf) {
				List<Semestre> s = ListaAlunos.get(i).getSemestres();
				
				for(int j=0; j<s.size(); j++) {
					if(s.get(j).getFase() == fase) {
						List<Disciplina> d = s.get(j).getDisciplinas();
						
						
						for(int k=0; k<d.size(); k++) {
							if(d.get(k).getNome() == nome_dis) {
								d.get(k).removerAvaliacao(nome_ava);
							}
						}
					}
				}
			}
		}
	}
	
	
	public void GerarRelatorio(Aluno aluno) {
		int cpf = aluno.getCpf();
		
		for(int i=0; i<ListaAlunos.size(); i++) {
			if(ListaAlunos.get(i).getCpf() == cpf) {
				List<Semestre> s = ListaAlunos.get(i).getSemestres();
	
				Document doc = new Document();
		        String arquivoPDF = "relatorio.pdf";
		        
		        try {
		        	PdfWriter.getInstance(doc, new FileOutputStream(arquivoPDF));
		        	doc.open();
		        	
		        	Paragraph p = new Paragraph("Relatório Geral");
		        	p.setAlignment(1);
		        	doc.add(p);
		        	
		        	p = new Paragraph("\n");
		  
		        	doc.add(p);
		        	
		        	PdfPTable table = new PdfPTable(3);
		        	
		        	PdfPCell cel1 = new PdfPCell(new Paragraph("Semestre"));
		        	PdfPCell cel2 = new PdfPCell(new Paragraph("Disciplina"));
		        	PdfPCell cel3 = new PdfPCell(new Paragraph("Média Final"));
		        	
		        	table.addCell(cel1);
		        	table.addCell(cel2);
		        	table.addCell(cel3);
		        	
		        	for (Semestre semestre : s) {
		            	cel1 = new PdfPCell(new Paragraph(semestre.getFase()+""));	
		            	List<Disciplina> d = semestre.getDisciplinas();
		            	for(int j=0; j<d.size(); j++) {
		            	cel2 = new PdfPCell(new Paragraph(semestre.getDisciplinas().get(j).getNome()+""));
		            	cel3 = new PdfPCell(new Paragraph(semestre.getDisciplinas().get(j).getMedia_final()+""));
			            	
			            	table.addCell(cel1);
			            	table.addCell(cel2);
			            	table.addCell(cel3);
		            	}
		        	}
		        	
		        	doc.add(table);
		        	doc.close();
		        	Desktop.getDesktop().open(new File(arquivoPDF));
		        	
		        } catch(Exception e) {
		        	
		        }
			}
		}	
	}
	
	public List<Aluno> retornaLista() {
		return ListaAlunos;
	}
	

}
