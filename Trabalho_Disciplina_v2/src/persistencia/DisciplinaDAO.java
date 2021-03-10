package persistencia;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import dados.*;
import exceptions.DeleteException;
import exceptions.InsertException;
import exceptions.SelectException;
import exceptions.UpdateException;

public class DisciplinaDAO {
	private static DisciplinaDAO instance = null;
	private static AvaliacaoDAO avaliacaoDAO = null;
	
	private PreparedStatement selectNewId;
	private PreparedStatement insert;
	private PreparedStatement delete;
	private PreparedStatement selectAll;
	private PreparedStatement update;

	private DisciplinaDAO() throws ClassNotFoundException, SQLException, SelectException {
		Connection conexao = Conexao.getConexao();
		
		selectNewId = conexao.prepareStatement("select nextval('id_disciplina')");
		insert = conexao.prepareStatement("insert into disciplina values (?,?,?,?,?,?,?,?,?)");
		delete = conexao.prepareStatement("delete from disciplina where id = ?");
		selectAll = conexao.prepareStatement("select * from disciplina");
		update = conexao.prepareStatement("update disciplina set nome = ?, codigo = ?, departamento = ?, notas = ?, media_final = ?, nota_exame = ?, avaliacoes = ?");
		
		avaliacaoDAO = AvaliacaoDAO.getInstance();	
	}
	
	public static DisciplinaDAO getInstance() throws ClassNotFoundException, SQLException, SelectException {
		if(instance == null) {
			instance = new DisciplinaDAO();
		}
		return instance;
	}

	public int selectNewId() throws SelectException {
		try {
			ResultSet rs = selectNewId.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}
		} catch(SQLException e) {
			throw new SelectException("Erro ao buscar novo id da tabela disciplina");
		}
		
		return 0;
	}
	
	
	
	public void insert(Disciplina disciplina) throws InsertException, SelectException {
		try {
			disciplina.setId(selectNewId());
			insert.setInt(1, disciplina.getId());
			insert.setString(2, disciplina.getNome());
			insert.setInt(3, disciplina.getCodigo());
			insert.setString(4, disciplina.getDepartamento());
			insert.setArray(5, (Array) disciplina.getNotas()); //Perguntar
			insert.setFloat(6, disciplina.getMedia_final());
			insert.setFloat(7, disciplina.getNota_exame());
			insert.setArray(8, (Array) disciplina.getAvaliacoes()); //Perguntar
			insert.setInt(9, disciplina.getId_semestre());
			insert.executeUpdate();
			
			// Perguntar
			for(int i=0; i<disciplina.getAvaliacoes().size(); i++) {
				disciplina.getAvaliacoes().get(i).setId_disciplina(disciplina.getId());
				avaliacaoDAO.insert(disciplina.getAvaliacoes().get(i));
			}
			
		} catch(SQLException e) {
			throw new InsertException("Erro ao inserir disciplina");
		}
	}
	
	public void delete(Disciplina d) throws DeleteException {
		List<Avaliacao> a = d.getAvaliacoes();
		
		for(int i=0; i<a.size(); i++) {
			avaliacaoDAO.delete(a.get(i));
		}
		
		try {
			delete.setInt(1, d.getId());
			delete.executeUpdate();
		} catch(SQLException e) {
			throw new DeleteException("Erro ao deletar disciplina");
		}
	}
	//nome = ?, codigo = ?, departamento = ?, notas = ?, media_final = ?, nota_exame = ?, avaliacoes = ?
	
	public void update(Disciplina disciplina) throws UpdateException {
		try {
			for(int i=0; i<disciplina.getAvaliacoes().size(); i++) {
				avaliacaoDAO.update(disciplina.getAvaliacoes().get(i)); //Perguntar
			}
			
			update.setString(1, disciplina.getNome());
			update.setInt(2, disciplina.getCodigo());
			update.setString(3, disciplina.getDepartamento());
			update.setArray(4, (Array) disciplina.getNotas());
			update.setFloat(5, disciplina.getMedia_final());
			update.setFloat(6, disciplina.getNota_exame());
			update.setArray(7, (Array) disciplina.getAvaliacoes());
			update.executeUpdate();
			
		} catch(SQLException e) {
			throw new UpdateException("Erro ao atualizar disciplina");
		}
	}
	
	public List<Disciplina> selectAll() throws SelectException {
		List<Disciplina> disciplinas = new LinkedList<Disciplina>();
		
		try {
			ResultSet rs = selectAll.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String nome = rs.getString(2);
				int codigo = rs.getInt(3);
				String departamento = rs.getString(4);
				//Float[] notas = rs.getArray(5); Perguntar
				Float[] notas;
				float media_final = rs.getFloat(6);
				float nota_exame = rs.getFloat(7);
				
				List<Avaliacao> avaliacao; //= avaliacaoDAO.select(rs.getInt(1));
				
				//for(int i=0; i<) Perguntar
				
				//Construtor?
				disciplinas.add(new Disciplina(id, nome, codigo, departamento, notas, media_final, nota_exame, avaliacao));
				
			}
			
		} catch(SQLException e) {
			throw new SelectException("Erro ao buscar disciplina");
		}
		
		return disciplinas;
	}
	
}