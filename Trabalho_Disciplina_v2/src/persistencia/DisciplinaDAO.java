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
	private PreparedStatement select;
	private PreparedStatement update;
	
	//singleton
	public static DisciplinaDAO getInstance() throws ClassNotFoundException, SQLException, SelectException {
		if(instance == null) {
			instance = new DisciplinaDAO();
		}
		return instance;
	}

	private DisciplinaDAO() throws ClassNotFoundException, SQLException, SelectException {
		Connection conexao = Conexao.getConexao();
		
		selectNewId = conexao.prepareStatement("select nextval('id_disciplina')");
		insert = conexao.prepareStatement("insert into disciplina values (?,?,?,?,?,?,?)");
		delete = conexao.prepareStatement("delete from avaliacao where coda = ?");
		select = conexao.prepareStatement("select * from disciplina where cods = ?");
		update = conexao.prepareStatement("update avaliacao set nome = ? where codd = ?");
		
		avaliacaoDAO = AvaliacaoDAO.getInstance();	
	}


	public int selectNewId() throws SQLException {
			ResultSet rs = selectNewId.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}
		
		return 0;
	}
	
	public void insert(Disciplina disciplina, int cods) throws SQLException {
			int codd = selectNewId();
			
			insert.setInt(1, codd);
			insert.setString(2, disciplina.getNome());
			insert.setInt(3, disciplina.getCodigo());
			insert.setString(4, disciplina.getDepartamento());
			//insert.setArray(5, (Array) disciplina.getNotas()); //Perguntar
			insert.setFloat(5, disciplina.getMedia_final());
			insert.setFloat(6, disciplina.getNota_exame());
			insert.setInt(7, cods);
			
			insert.executeUpdate();	
	}
	
	public void insert(Disciplina disciplina, Semestre semestre) throws SQLException {
		insert(disciplina, semestre.getCods());
	}
	
	public void update(Disciplina disciplina) throws SQLException {
			
			int codd = selectNewId();
		
			update.setString(1, disciplina.getNome());
			//update.setInt(2, disciplina.getCodigo());
			//update.setString(3, disciplina.getDepartamento());
			//update.setFloat(5, disciplina.getMedia_final());
			//update.setFloat(6, disciplina.getNota_exame());
			update.setInt(2, codd);
			
			update.executeUpdate();
			
	}
	
	public List<Disciplina> selectAll(int cods) throws SQLException {
		List<Disciplina> disciplinas = new LinkedList<Disciplina>();
		
			select.setInt(1, cods);
			ResultSet rs = select.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String nome = rs.getString(2);
				int codigo = rs.getInt(3);
				String departamento = rs.getString(4);
				//Float[] notas = rs.getArray(5); 		
				float media_final = rs.getFloat(6);
				float nota_exame = rs.getFloat(7);
				
				Disciplina d = new Disciplina(id, nome, codigo, departamento, media_final, nota_exame, avaliacaoDAO.selectAll(id));
		
			}
		
		return disciplinas;
	}
	
	public void delete(Disciplina d) throws SQLException {
		delete.setInt(1, d.getCodd());

		delete.executeUpdate();
	}
	
}