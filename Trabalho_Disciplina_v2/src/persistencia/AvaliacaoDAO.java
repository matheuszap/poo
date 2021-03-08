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
		delete = conexao.prepareStatement("delete from avaliacao where id_avaliacao = ?");
	}
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
}
