package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import dados.Contato;
import exceptions.DeleteException;
import exceptions.InsertException;
import exceptions.SelectException;
import exceptions.UpdateException;

public class ContatoDAO {
	private static ContatoDAO instance = null;
	
	private PreparedStatement selectNewId;
	private PreparedStatement insert;
	private PreparedStatement delete;
	private PreparedStatement selectAll;
	private PreparedStatement update;
	
	private ContatoDAO() throws ClassNotFoundException, SQLException, SelectException {
		Connection conexao = Conexao.getConexao();
		
		selectNewId = conexao.prepareStatement("select nextval('id_contato')");
		insert = conexao.prepareStatement("insert into contato values(?,?,?)");
		delete = conexao.prepareStatement("delete from contato where id = ?");
		selectAll = conexao.prepareStatement("select * from contato");
		update = conexao.prepareStatement("update contato set nome = ?, telefone = ? where id = ?");
		
	}
	
	public static ContatoDAO getInstance() throws ClassNotFoundException, SQLException, SelectException{
		if(instance == null) {
			instance = new ContatoDAO();
		}
		return instance;
	}
	
	public int selectNewId() throws SelectException {
		try {
			ResultSet rs = selectNewId.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}
			
		}catch(SQLException e) {
			throw new SelectException("Erro ao buscar novo id da tabela contato");
		}
		
		return 0;
	}
	
	public void insert(Contato contato) throws InsertException, SelectException {
		try {
			contato.setId(selectNewId());
			insert.setInt(1, contato.getId());
			insert.setString(2, contato.getNome());
			insert.setInt(3, contato.getTelefone());
			insert.executeUpdate();
			
		}catch(SQLException e) {
			throw new InsertException("Erro ao inserir contato");
		}
	}
	
	public void delete(Contato c) throws DeleteException {
		try {
			delete.setInt(1, c.getId());
			delete.executeUpdate();
			
		} catch (SQLException e) {
			throw new DeleteException("Erro ao deletar contato");			
		}
	}
		
	public void update(Contato contato) throws UpdateException{
		try {
			update.setString(1, contato.getNome());
			update.setInt(2, contato.getTelefone());
			update.setInt(3, contato.getId());
			update.executeUpdate();
			
		}catch(SQLException e) {
			throw new UpdateException("Erro ao atualizar contato");
		}
	}
	
	public List<Contato> selectAll() throws SelectException {
		List<Contato> contatos = new LinkedList<Contato>();
		
		try {
			ResultSet rs = selectAll.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String nome = rs.getString(2);
				int telefone = rs.getInt(3);
				
				contatos.add(new Contato(id, nome, telefone));
			}
			
		} catch(SQLException e) {
			throw new SelectException("Erro ao buscar contato");
		}
		
		return contatos;
	}
	
}







































