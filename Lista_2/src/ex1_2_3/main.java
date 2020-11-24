package ex1_2_3;

public class main {

	public static void main(String[] args) {
		Livro livro1 = new Livro("HP","ED1",2);
		
		livro1.setNome("Harry Potter");
		livro1.setEditora("Editora2");
		livro1.setEdicao(3);
		
		System.out.println("Nome do livro: " + livro1.getNome());
		System.out.println("Editora: " + livro1.getEditora());
		System.out.println("Edição: " + livro1.getEdicao());
		System.out.println("\n");
		
		Livro livro2 = new Livro("Senhor dos aneis","ED2",2);
		
		livro2.setNome("O Chamado");
		livro2.setEditora("Editora3");
		livro2.setEdicao(1);
		
		System.out.println("Nome do livro: " + livro2.getNome());
		System.out.println("Editora: " + livro2.getEditora());
		System.out.println("Edição: " + livro2.getEdicao());
		System.out.println("\n");
		
		Carro carro1 = new Carro("Fiesta","Ford",2014);
		
		carro1.setModelo("Camaro");
		carro1.setMarca("Chevrolet");
		carro1.setAno(2016);

		System.out.println("Modelo: " + carro1.getModelo());
		System.out.println("Marca: "  + carro1.getMarca());
		System.out.println("Ano: " + carro1.getAno());
		System.out.println("\n");
		
		Carro carro2 = new Carro("Fusion","Ford",2014);
		
		carro2.setModelo("Gol");
		carro2.setMarca("Volkswagen");
		carro2.setAno(2020);

		System.out.println("Modelo: " + carro2.getModelo());
		System.out.println("Marca: "  + carro2.getMarca());
		System.out.println("Ano: " + carro2.getAno());
		System.out.println("\n");
		
		Comida comida1 = new Comida("Strogonoff","Frango", false);
		
		comida1.setNome_prato("Salada");
		comida1.setIngredientes("Alface e tomate");
		comida1.setVegana(true);
		
		System.out.println("Nome do prato: " + comida1.getNome_prato());
		System.out.println("Ingredientes: " + comida1.getIngredientes());
		System.out.println("É vegana? " + comida1.isVegana());
		System.out.println("\n");
		
		Comida comida2 = new Comida();
		
		comida2.setNome_prato("Feijoada");
		comida2.setIngredientes("Feijao, tempero, etc");
		comida2.setVegana(false);
		
		System.out.println("Nome do prato: " + comida2.getNome_prato());
		System.out.println("Ingredientes: " + comida2.getIngredientes());
		System.out.println("É vegana? " + comida2.isVegana());
		System.out.println("\n");
		
		Pais pais1 = new Pais();
		
		pais1.setNome("Brasil");
		pais1.setQuant_estados(27);
		pais1.setRepublica(true);
		
		System.out.println("Pais: " + pais1.getNome());
		System.out.println("Quantidade de estados: " + pais1.getQuant_estados());
		System.out.println("É uma república? " + pais1.isRepublica());
		System.out.println("\n");
		
		Pais pais2 = new Pais();
		
		pais2.setNome("Estados Unidos");
		pais2.setQuant_estados(50);
		pais2.setRepublica(true);
		
		System.out.println("Pais: " + pais2.getNome());
		System.out.println("Quantidade de estados: " + pais2.getQuant_estados());
		System.out.println("É uma república? " + pais2.isRepublica());
		System.out.println("\n");
		
		Revista revista1 = new Revista();
		
		revista1.setNome("Revista de esportes");
		revista1.setGenero("Esportes");
		revista1.setAno(2020);
		
		System.out.println("Nome: " + revista1.getNome());
		System.out.println("Gênero: " + revista1.getGenero());
		System.out.println("Ano: " + revista1.getAno());
		System.out.println("\n");
		
		Revista revista2 = new Revista();
		
		revista2.setNome("Revista de moda");
		revista2.setGenero("Moda");
		revista2.setAno(2018);
		
		System.out.println("Nome: " + revista2.getNome());
		System.out.println("Gênero: " + revista2.getGenero());
		System.out.println("Ano: " + revista2.getAno());
		System.out.println("\n");
	}

}
