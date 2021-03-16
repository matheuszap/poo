package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import dados.*;
import exceptions.SelectException;

public class AlunoDAO {
	private static AlunoDAO instance = null;
	private static SemestreDAO semestreDAO = null;
	
    private PreparedStatement selectNewId;
    private PreparedStatement select;
    private PreparedStatement insert;
    private PreparedStatement delete;
    private PreparedStatement update;
    
	//singleton
	public static AlunoDAO getInstance() throws ClassNotFoundException, SQLException, SelectException {
		if(instance == null) {
			instance = new AlunoDAO();
		}
		return instance;
	}
	
    
    public AlunoDAO() throws ClassNotFoundException, SQLException,  SelectException {
		Connection conexao = Conexao.getConexao();
		
		selectNewId = conexao.prepareStatement("select nextval('id_aluno')");
		insert = conexao.prepareStatement("insert into aluno values (?,?,?,?)");
		delete = conexao.prepareStatement("delete from aluno where codal = ?");
		select = conexao.prepareStatement("select * from aluno");
		update = conexao.prepareStatement("update aluno set nome = ?, cpf = ?, curso = ? where codal = ?");
		
		semestreDAO = SemestreDAO.getInstance();
    }
    
	public int selectNewId() throws SQLException {
		ResultSet rs = selectNewId.executeQuery();
		if(rs.next()) {
			return rs.getInt(1);
		}
	
		return 0;
	}
	
	public void insert(Aluno aluno) throws SQLException {
		int codal = selectNewId();
		
		insert.setInt(1, codal);
		insert.setString(2, aluno.getNome());
		insert.setInt(3, aluno.getCpf());
		insert.setString(4, aluno.getCurso());
		
		insert.executeUpdate();
	}
	
	public void update(Aluno aluno) throws SQLException {
		int codal = selectNewId();
		
		update.setString(1, aluno.getNome());
		update.setInt(2, aluno.getCpf());
		update.setString(3, aluno.getCurso());
		update.setInt(4, codal);
		
		update.executeUpdate();
	}
	
	public void delete(Aluno aluno) throws SQLException {
		delete.setInt(1, aluno.getCodal());
		delete.executeUpdate();
	}
	
	public List<Aluno> selectAll() throws SQLException {
		List<Aluno> alunos = new LinkedList<Aluno>();
		ResultSet rs = select.executeQuery();
		
		while(rs.next()) {
			
			int id = rs.getInt(1);
			String nome = rs.getString(2);
			int cpf = rs.getInt(3);
			String curso = rs.getString(4);
			
			List<Semestre> semestres = semestreDAO.selectAll(rs.getInt(1));
			
			Aluno a = new Aluno(id, nome, cpf, curso, semestres);
			
			alunos.add(a);
		}
		
		return alunos;
	}
	
}



































