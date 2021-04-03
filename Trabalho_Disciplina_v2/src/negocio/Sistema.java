package negocio;

import dados.*;
import exceptions.SelectException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import persistencia.*;

public class Sistema {
	private AlunoDAO alunoDAO;
	private SemestreDAO semestreDAO;
	private DisciplinaDAO disciplinaDAO;
	private AvaliacaoDAO avaliacaoDAO;
	
	public Sistema() throws ClassNotFoundException, SQLException, SelectException {
		alunoDAO = new AlunoDAO();
		semestreDAO = new SemestreDAO();
		disciplinaDAO = new DisciplinaDAO();
		avaliacaoDAO = new AvaliacaoDAO();
	}
	
	public void cadastrarAluno(Aluno aluno) throws SQLException {
		alunoDAO.insert(aluno);
	}
	
	public void removerAluno(Aluno aluno) throws SQLException {
		List<Aluno> la = alunoDAO.selectAll();
		
		for(int i=0; i<la.size(); i++) {
			if(la.get(i).getCpf() == aluno.getCpf()) {
				alunoDAO.delete(la.get(i));
			}
		}
	}
	
	public void editarAluno(Aluno aluno) throws SQLException {
		List<Aluno> la = alunoDAO.selectAll();
		
		for(int i=0; i<la.size(); i++) {
			if(la.get(i).getCpf() == aluno.getCpf()) {
				aluno.setCodal(la.get(i).getCodal());
				
				alunoDAO.update(aluno);
			}
		}
	}
	
	public void cadastrarSemestre(Aluno aluno, Semestre semestre) throws SQLException {
		List<Aluno> la = alunoDAO.selectAll();
		
		for(int i=0; i<la.size(); i++) {
			if(la.get(i).getCpf() == aluno.getCpf()) {
				aluno.setCodal(la.get(i).getCodal());
				semestreDAO.insert(semestre, aluno);
			}
		}	
	}
	
	public void removerSemestre(Aluno aluno, Semestre semestre) throws SQLException {
		List<Aluno> la = alunoDAO.selectAll();
		
		for(int i=0; i<la.size(); i++) {
			if(la.get(i).getCpf() == aluno.getCpf()) {
				aluno.setCodal(la.get(i).getCodal());
		
				List<Semestre> ls = semestreDAO.selectAll(aluno.getCodal());
				
				for(int j=0; j<ls.size(); j++) {
					if(ls.get(j).getCodigo() == semestre.getCodigo()) {
						semestreDAO.delete(ls.get(j));
					}
				}
			}
		}
	}
	
	public void editarSemestre(Aluno aluno, Semestre semestre) throws SQLException {
		List<Aluno> la = alunoDAO.selectAll();
		
		for(int i=0; i<la.size(); i++) {
			if(la.get(i).getCpf() == aluno.getCpf()) {
				aluno.setCodal(la.get(i).getCodal());
		
				List<Semestre> ls = semestreDAO.selectAll(aluno.getCodal());
				
				for(int j=0; j<ls.size(); j++) {
					if(ls.get(j).getCodigo() == semestre.getCodigo()) {
						semestre.setCods(ls.get(j).getCods());
						
						semestreDAO.update(semestre);
					}
				}
			}
		}
	}
	
	public void cadastrarDisciplina(Aluno aluno, Semestre semestre, Disciplina disciplina) throws SQLException {
		List<Aluno> la = alunoDAO.selectAll();
		
		for(int i=0; i<la.size(); i++) {
			if(la.get(i).getCpf() == aluno.getCpf()) {
				aluno.setCodal(la.get(i).getCodal());
				
				List<Semestre> ls = semestreDAO.selectAll(aluno.getCodal());
				
				for(int j=0; j<ls.size(); j++) {
					if(ls.get(j).getCodigo() == semestre.getCodigo()) {
						semestre.setCods(ls.get(j).getCods());
						
						float media = calcularMedia(aluno, semestre, disciplina);
						disciplina.setMedia_final(media);
						
						if(media < 7) {
							float media_exame = calcularNotaExame(aluno, semestre, disciplina);
							disciplina.setNota_exame(media_exame);
						}
						
						disciplinaDAO.insert(disciplina, semestre);
					}
				}
			}
		}
	}
	
	public void removerDisciplina(Aluno aluno, Semestre semestre, Disciplina disciplina) throws SQLException {
		List<Aluno> la = alunoDAO.selectAll();
		
		for(int i=0; i<la.size(); i++) {
			if(la.get(i).getCpf() == aluno.getCpf()) {
				aluno.setCodal(la.get(i).getCodal());
				
				List<Semestre> ls = semestreDAO.selectAll(aluno.getCodal());
				
				for(int j=0; j<ls.size(); j++) {
					if(ls.get(j).getCodigo() == semestre.getCodigo()) {
						semestre.setCods(ls.get(j).getCods());
						
						List<Disciplina> ld = disciplinaDAO.selectAll(semestre.getCods());
						
						for(int k=0; k<ld.size(); k++) {
							if(ld.get(k).getCodigo() == disciplina.getCodigo()) {
								disciplinaDAO.delete(ld.get(k));
							}
						}
					}
				}
			}
		}
	}
	
	public void editarDisciplina(Aluno aluno, Semestre semestre, Disciplina disciplina) throws SQLException {
		List<Aluno> la = alunoDAO.selectAll();
		
		for(int i=0; i<la.size(); i++) {
			if(la.get(i).getCpf() == aluno.getCpf()) {
				aluno.setCodal(la.get(i).getCodal());
				
				List<Semestre> ls = semestreDAO.selectAll(aluno.getCodal());
				
				for(int j=0; j<ls.size(); j++) {
					if(ls.get(j).getCodigo() == semestre.getCodigo()) {
						semestre.setCods(ls.get(j).getCods());
						
						List<Disciplina> ld = disciplinaDAO.selectAll(semestre.getCods());
						
						for(int k=0; k<ld.size(); k++) {
							if(ld.get(k).getCodigo() == disciplina.getCodigo()) {
								disciplina.setCodd(ld.get(k).getCodd());
								
								float media = calcularMedia(aluno, semestre, disciplina);
								disciplina.setMedia_final(media);
								
								if(media < 7) {
									float media_exame = calcularNotaExame(aluno, semestre, disciplina);
									disciplina.setNota_exame(media_exame);
								}
								
								disciplinaDAO.update(disciplina);
							}
						}
					}
				}
			}
		}
	}
	
	public void cadastrarAvaliacao(Aluno aluno, Semestre semestre, Disciplina disciplina, Avaliacao avaliacao) throws SQLException {
		List<Aluno> la = alunoDAO.selectAll();
		
		for(int i=0; i<la.size(); i++) {
			if(la.get(i).getCpf() == aluno.getCpf()) {
				aluno.setCodal(la.get(i).getCodal());
				
				List<Semestre> ls = semestreDAO.selectAll(aluno.getCodal());
				
				for(int j=0; j<ls.size(); j++) {
					if(ls.get(j).getCodigo() == semestre.getCodigo()) {
						semestre.setCods(ls.get(j).getCods());
						
						List<Disciplina> ld = disciplinaDAO.selectAll(semestre.getCods());
						
						for(int k=0; k<ld.size(); k++) {
							if(ld.get(k).getCodigo() == disciplina.getCodigo()) {
								disciplina.setCodd(ld.get(k).getCodd());
								
								avaliacaoDAO.insert(avaliacao, disciplina);		
							}
						}
					}
				}
			}
		}
	}
	
	public void removerAvaliacao(Aluno aluno, Semestre semestre, Disciplina disciplina, Avaliacao avaliacao) throws SQLException {
		List<Aluno> la = alunoDAO.selectAll();
		
		for(int i=0; i<la.size(); i++) {
			if(la.get(i).getCpf() == aluno.getCpf()) {
				aluno.setCodal(la.get(i).getCodal());
				
				List<Semestre> ls = semestreDAO.selectAll(aluno.getCodal());
				
				for(int j=0; j<ls.size(); j++) {
					if(ls.get(j).getCodigo() == semestre.getCodigo()) {
						semestre.setCods(ls.get(j).getCods());
						
						List<Disciplina> ld = disciplinaDAO.selectAll(semestre.getCods());
						
						for(int k=0; k<ld.size(); k++) {
							if(ld.get(k).getCodigo() == disciplina.getCodigo()) {
								disciplina.setCodd(ld.get(k).getCodd());
								
								List<Avaliacao> lav = avaliacaoDAO.selectAll(disciplina.getCodd());
								
								for(int l=0; l<lav.size(); l++) {
									if(lav.get(l).getCodigo() == avaliacao.getCodigo()) {
										avaliacaoDAO.delete(lav.get(l));
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	public void editarAvaliacao(Aluno aluno, Semestre semestre, Disciplina disciplina, Avaliacao avaliacao) throws SQLException {
		List<Aluno> la = alunoDAO.selectAll();
		
		for(int i=0; i<la.size(); i++) {
			if(la.get(i).getCpf() == aluno.getCpf()) {
				aluno.setCodal(la.get(i).getCodal());
				
				List<Semestre> ls = semestreDAO.selectAll(aluno.getCodal());
				
				for(int j=0; j<ls.size(); j++) {
					if(ls.get(j).getCodigo() == semestre.getCodigo()) {
						semestre.setCods(ls.get(j).getCods());
						
						List<Disciplina> ld = disciplinaDAO.selectAll(semestre.getCods());
						
						for(int k=0; k<ld.size(); k++) {
							if(ld.get(k).getCodigo() == disciplina.getCodigo()) {
								disciplina.setCodd(ld.get(k).getCodd());
								
								List<Avaliacao> lav = avaliacaoDAO.selectAll(disciplina.getCodd());
								
								for(int l=0; l<lav.size(); l++) {
									if(lav.get(l).getCodigo() == avaliacao.getCodigo()) {
										avaliacao.setcoda(lav.get(l).getCoda());
										
										avaliacaoDAO.update(avaliacao);
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	public float calcularMedia(Aluno aluno, Semestre semestre, Disciplina disciplina) throws SQLException {
		 float media = 0;		 
		 media = disciplina.calcularMedia();
		 
		 return media;
	}
	
	public float calcularNotaExame(Aluno aluno, Semestre semestre, Disciplina disciplina) throws SQLException {
		float media_exame = 0;
		media_exame = disciplina.calcularNotaExame();
		
		return media_exame;
	}
	
	public void GerarRelatorio(Aluno aluno) throws SQLException {
		List<Aluno> la = alunoDAO.selectAll();
		
		for(int i=0; i<la.size(); i++) {
			if(la.get(i).getCpf() == aluno.getCpf()) {
				aluno.setCodal(la.get(i).getCodal());
		
				List<Semestre> s = semestreDAO.selectAll(aluno.getCodal());
				
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
	 
	public List<Aluno> listaAlunos() throws SQLException{
		List<Aluno> la = alunoDAO.selectAll();
		
		return la;
	}

	public List<Semestre> listaSemestres(Aluno aluno) throws SQLException {
		List<Semestre> ls = semestreDAO.selectAll(aluno.getCodal());
		
		return ls;
	}
	
	public List<Disciplina> listaDisciplinas(Aluno aluno, Semestre semestre) throws SQLException {
		List<Disciplina> ld = disciplinaDAO.selectAll(semestre.getCods());
	
		return ld;
	}
	
	public List<Avaliacao> listaAvaliacoes(Aluno aluno, Semestre semestre, Disciplina disciplina) throws SQLException {
		List<Avaliacao> lav = avaliacaoDAO.selectAll(disciplina.getCodd());
		
		return lav;
	}
	
}









































