package apresentacao;

import java.sql.SQLException;

import dados.Contato;
import exceptions.InsertException;
import exceptions.SelectException;
import persistencia.Conexao;
import persistencia.ContatoDAO;

public class Main {

	public static void main(String[] args) {
		Contato c = new Contato();
		
		c.setNome("Teste Contato");
		c.setTelefone(9999999);
		
		Conexao.setSenha("teste");
		
		try {
			ContatoDAO contatoDAO = ContatoDAO.getInstance();
			
			try {
				contatoDAO.insert(c);

			} catch (InsertException e) {
				e.printStackTrace();
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SelectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
