package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dados.*;
import exceptions.DeleteException;
import exceptions.InsertException;
import exceptions.SelectException;
import exceptions.UpdateException;

public class AvaliacaoDAO {
	private static AvaliacaoDAO instance = null;
	
	private PreparedStatement selectNewId;
	private PreparedStatement select;
	private PreparedStatement insert;
	private PreparedStatement delete;
	private PreparedStatement update;
	
	//singleton
	public static AvaliacaoDAO getInstance() throws ClassNotFoundException, SQLException, SelectException {
		if(instance == null) {
			instance = new AvaliacaoDAO();
		}
		return instance;
	}
	
	
	private AvaliacaoDAO() throws ClassNotFoundException, SQLException, SelectException{
		Connection conexao = Conexao.getConexao();
		
		selectNewId = conexao.prepareStatement("select nextval('id_avaliacao')");
		insert = conexao.prepareStatement("insert into avaliacao values (?,?,?,?,?,?)");
		select = conexao.prepareStatement("select * from avaliacao where id_disciplina = ?");
		update = conexao.prepareStatement("update avaliacao set codigo = ?, nome = ?, peso = ?, data = ? where id_disciplina = ?");
		delete = conexao.prepareStatement("delete from avaliacao where id_disciplina = ?");
	}
	
	private int selectNewId() throws SelectException {
		try {
			ResultSet rs = selectNewId.executeQuery();
			
			if(rs.next()) {
				return rs.getInt(1);
			}
			
		} catch(SQLException e) {
			throw new SelectException("Erro ao buscar novo id da tabela avaliação");
		}
		
		return 0;
	}
	
	public void insert(Avaliacao avaliacao) throws InsertException, SelectException {
		try {
			insert.setInt(1, selectNewId());
			insert.setInt(2, avaliacao.getCodigo());
			insert.setString(3, avaliacao.getNome());
			insert.setFloat(4, avaliacao.getPeso());
			insert.setString(5, avaliacao.getData());
			insert.setInt(6, avaliacao.getId_disciplina());
			
			
		}catch(SQLException e) {
			throw new InsertException("Erro ao inserir avaliação");
		}	
	}
	
	
	public Avaliacao select(int disciplina) throws SelectException {
		try {
			select.setInt(1, disciplina);
			ResultSet rs = select.executeQuery();
			
			if(rs.next()) {
				int id = rs.getInt(1);
				int codigo = rs.getInt(2);
				String nome = rs.getString(3);
				float peso = rs.getFloat(4);
				String data = rs.getString(5);
				
				return new Avaliacao(id, codigo, nome, peso, data);
			}
			
		} catch(SQLException e) {
			throw new SelectException("Erro ao buscar a avaliação da disciplina");
		}
		
		return null;
	}
	
	public void update(Avaliacao avaliacao) throws UpdateException {
		try {
			update.setInt(1, avaliacao.getCodigo());
			update.setString(2, avaliacao.getNome());
			update.setFloat(3, avaliacao.getPeso());
			update.setString(4, avaliacao.getData());
			
			update.executeUpdate();
			
		} catch(SQLException e) {
			throw new UpdateException("Erro ao atualizar avaliação");
		}
	}
	
	public void delete(Avaliacao avaliacao) throws DeleteException {
		try {
			delete.setInt(1, avaliacao.getId_disciplina());
			delete.executeUpdate();
		
		} catch(SQLException e) {
			throw new DeleteException("Erro ao deletar avaliação");
		}
	}
	
	
		
		
		
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
}
