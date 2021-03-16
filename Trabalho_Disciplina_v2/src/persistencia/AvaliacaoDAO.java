package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
		select = conexao.prepareStatement("select * from avaliacao where codd = ?");
		update = conexao.prepareStatement("update avaliacao set codigo = ?, nome = ?, peso = ?, data = ? where coda = ?");
		delete = conexao.prepareStatement("delete from avaliacao where coda = ?");
	}
	
	private int selectNewId() throws SQLException {
			ResultSet rs = selectNewId.executeQuery();
			
			if(rs.next()) {
				return rs.getInt(1);
			}
			
		return 0;
	}
	
	public void insert(Avaliacao avaliacao, int codd) throws SQLException {
			int coda = selectNewId();
			
			insert.setInt(1, coda);
			insert.setInt(2, avaliacao.getCodigo());
			insert.setString(3, avaliacao.getNome());
			insert.setFloat(4, avaliacao.getPeso());
			insert.setString(5, avaliacao.getData());
			insert.setInt(6, codd);
			
			insert.executeUpdate();
			
	}
	
	public void insert(Avaliacao avaliacao, Disciplina disciplina) throws SQLException {
		insert(avaliacao, disciplina.getCodd());
	}
	
	
	public List<Avaliacao> selectAll(int codd) throws SQLException {
		List<Avaliacao> a = new LinkedList<Avaliacao>();

			select.setInt(1, codd);
			ResultSet rs = select.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt(1);
				int codigo = rs.getInt(2);
				String nome = rs.getString(3);
				float peso = rs.getFloat(4);
				String data = rs.getString(5);
				
				a.add(new Avaliacao(id, codigo, nome, peso, data));
			}
		return a;
	}
	
	public void update(Avaliacao avaliacao) throws SQLException {
		
			int coda = selectNewId();
	
			update.setInt(1, coda);
			update.setInt(2, avaliacao.getCodigo());
			update.setString(3, avaliacao.getNome());
			update.setFloat(4, avaliacao.getPeso());
			update.setString(5, avaliacao.getData());
			
			update.executeUpdate();
			
	}
	
	public void delete(Avaliacao avaliacao) throws SQLException {
			delete.setInt(1, avaliacao.getCoda());
			delete.executeUpdate();
	}
	
	
		
		
		
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
}
