package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import dados.*;
import exceptions.SelectException;

public class SemestreDAO {
	private static SemestreDAO instance = null;
	private static DisciplinaDAO disciplinaDAO = null;
	
	private PreparedStatement selectNewId;
	private PreparedStatement insert;
	private PreparedStatement delete;
	private PreparedStatement select;
	private PreparedStatement update;
	
	//singleton
	public static SemestreDAO getInstance() throws ClassNotFoundException, SQLException, SelectException {
		if(instance == null) {
			instance = new SemestreDAO();
		}
		return instance;
	}
	
	
	private SemestreDAO() throws ClassNotFoundException, SQLException, SelectException {
		Connection conexao = Conexao.getConexao();
		
		selectNewId = conexao.prepareStatement("select nextval('id_semestre')");
		insert = conexao.prepareStatement("insert into semestre values (?,?,?,?)");
		delete = conexao.prepareStatement("delete from semestre where cods = ?");
		select = conexao.prepareStatement("select * from semestre where codal = ?");
		update = conexao.prepareStatement("update semestre set nome = ? where cods = ?");
	
	}
	
	public int selectNewId() throws SQLException {
		ResultSet rs = selectNewId.executeQuery();
		if(rs.next()) {
			return rs.getInt(1);
		}
	
		return 0;
	}
	
	public void insert(Semestre semestre, int codal) throws SQLException {
		int cods = selectNewId();
		
		insert.setInt(1, cods);
		insert.setInt(2, semestre.getCodigo());
		insert.setInt(3, semestre.getFase());
		insert.setInt(4, codal);
		
		insert.executeUpdate();
	}
	
	public void insert(Semestre semestre, Aluno aluno) throws SQLException {
		insert(semestre, aluno.getCodal());
	}
	
	public void update(Semestre semestre) throws SQLException {
		int cods = selectNewId();
		
		insert.setInt(1, semestre.getCodigo());
		insert.setInt(2, cods);
		
		update.executeUpdate();
	}
	
	public void delete(Semestre semestre) throws SQLException {
		delete.setInt(1, semestre.getCods());
		delete.executeUpdate();
	}
	
	public List<Semestre> selectAll(int codal) throws SQLException {
		List<Semestre> semestres = new LinkedList<Semestre>();
		select.setInt(1, codal);
		
		ResultSet rs = select.executeQuery();
		
		while(rs.next()) {
			int id = rs.getInt(1);
			int codigo = rs.getInt(2);
			int fase = rs.getInt(3);
			
			
			List<Disciplina> disciplinas = disciplinaDAO.selectAll(rs.getInt(1));
			Semestre s = new Semestre(id, codigo, fase, disciplinas);
			
			semestres.add(s);	
		}
		return semestres;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
