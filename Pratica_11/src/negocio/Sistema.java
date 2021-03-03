package negocio;

import java.sql.SQLException;
import java.util.List;

import dados.Contato;
import exceptions.DeleteException;
import exceptions.InsertException;
import exceptions.SelectException;
import exceptions.UpdateException;
import persistencia.Conexao;
import persistencia.ContatoDAO;

public class Sistema {
	private ContatoDAO contatoDAO;
	
	public Sistema(String senha) throws ClassNotFoundException, SQLException, SelectException {
		Conexao.setSenha(senha);
		contatoDAO = ContatoDAO.getInstance();
	}
	
	public void inserirContato(Contato c) throws InsertException, SelectException {
		contatoDAO.insert(c);
	}
	
	public List<Contato> SelectAll() throws SelectException {
		return contatoDAO.selectAll();
	}
	
	public void deleteContato(Contato c) throws DeleteException {
		contatoDAO.delete(c);
	}
	
	public void atualizarContato(Contato c) throws UpdateException {
		contatoDAO.update(c);
	}
	
}
