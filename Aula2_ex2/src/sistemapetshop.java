import java.util.Scanner;


public class sistemapetshop {
	private veterinario[] veterinarios = new veterinario[50];
	private int quantidadeVeterinarios;
	
	public sistemapetshop() {
		
	}
	
	public void cadastrarVeterinario() {
        Scanner leitor = new Scanner(System.in);
        
        veterinario v = new veterinario();
        
        System.out.println("Nome do veterin�rio:");
        String nome = leitor.next();
        System.out.println("Salario do veterin�rio:");
        float salario = leitor.nextFloat();
        
        v.setNome(nome);
        v.setSalario(salario);
        
        
        veterinarios[quantidadeVeterinarios] = v;
        
        //pos++;
        quantidadeVeterinarios++;
	}
	
	public void mostrarVeterinarios() {
		System.out.println("Lista de Veterinarios:");
		for(int i=0; i<quantidadeVeterinarios; i++) {
			System.out.println("Num: " + i + " -- " + "Nome: " + veterinarios[i].getNome());
		}
	}
	
	public void cadastrarEnderecoVeterinario() {
		System.out.println("Escolha um veterin�rio para cadastrar o endere�o:\n");
		mostrarVeterinarios();
		
		System.out.print("Op��o: ");
        Scanner leitor = new Scanner(System.in);
		int escolha = leitor.nextInt();
		
		System.out.println("Preencha as informa��es referentes ao endere�o: ");
		
		System.out.println("Rua: ");
		String rua = leitor.next();
		System.out.println("N�mero: ");
		int numero = leitor.nextInt();
		System.out.println("Bairro: ");
		String bairro = leitor.next();
		System.out.println("Cidade: ");
		String cidade = leitor.next();
		System.out.println("Estado: ");
		String estado = leitor.next();
		System.out.println("Cep: ");
		int cep = leitor.nextInt();

		endereco end = new endereco();
		
		end.setRua(rua);
		end.setNumero(numero);
		end.setBairro(bairro);
		end.setCidade(cidade);
		end.setEstado(estado);
		end.setCep(cep);
		
		veterinarios[escolha].setEndereco(end);
	}
	
	public void cadastrarAnimal() {
		System.out.println("Escolha um veterin�rio para cadastrar o animal: \n");
		mostrarVeterinarios();
		
		System.out.print("Op��o: ");
        Scanner leitor = new Scanner(System.in);
		int escolha = leitor.nextInt();
		
		System.out.println("Preencha as informa��es referentes ao animal: ");
		
		System.out.println("Nome do animal: ");
		String nome = leitor.next();
		System.out.println("Especie do animal: ");
		String especie = leitor.next();
		System.out.println("Descri��o: ");
		String descricao = leitor.next();
		
		animal animal = new animal();
		
		animal.setNome(nome);
		animal.setEspecie(especie);
		animal.setDescricao(descricao);
		
		animal[] animais = new animal[10];

		int pos_animal = veterinarios[escolha].getQuantidadeAnimais();
		
		animais[pos_animal] = animal;
		
		veterinarios[escolha].setAnimais(animais);
		
		pos_animal++;
		veterinarios[escolha].setQuantidadeAnimais(pos_animal);
	
	}
	

	public void mostrarAnimais() {
		System.out.println("Escolha um veterin�rio para visualizar os animais: \n");
		mostrarVeterinarios();
		
		System.out.print("Op��o: ");
        Scanner leitor = new Scanner(System.in);
		int escolha = leitor.nextInt();
				
		int count = veterinarios[escolha].getQuantidadeAnimais();
		
		System.out.println("Lista de animais: \n");
		for(int i=0; i<count; i++) {
			System.out.println("Num: " + i + " -- " + "Nome Animal: " + veterinarios[escolha].getAnimais()[i].getNome());
		}	
			
	}
	
	public void cadastrarDono() {
		System.out.println("Escolha um veterin�rio para visualizar os animais: \n");
		mostrarVeterinarios();
		
		System.out.print("Op��o: ");
        Scanner leitor = new Scanner(System.in);
		int escolha = leitor.nextInt();
				
		int count = veterinarios[escolha].getQuantidadeAnimais();
		
		System.out.println("Lista de animais: \n");
		for(int i=0; i<count; i++) {
			System.out.println("Num: " + i + " -- " + "Nome Animal: " + veterinarios[escolha].getAnimais()[i].getNome());
		}	
		
		System.out.println("Escolha um animal para cadastrar um dono: \n");

		System.out.print("Op��o: ");
        Scanner leitor2 = new Scanner(System.in);
		int escolha2 = leitor2.nextInt();
		
		System.out.println("Nome do Dono: ");
		String nome = leitor2.next();
		System.out.println("CPF: ");
		int cpf = leitor2.nextInt();
		
		dono dono = new dono();
		
		dono.setNome(nome);
		dono.setCpf(cpf);
		
		veterinarios[escolha].getAnimais()[escolha2].setDono(dono);	
	}
	
	
	public void cadastrarEnderecoDono() {
		System.out.println("Escolha um veterin�rio para visualizar os animais: \n");
		mostrarVeterinarios();
		
		System.out.print("Op��o: ");
        Scanner leitor = new Scanner(System.in);
		int escolha = leitor.nextInt();
				
		int count = veterinarios[escolha].getQuantidadeAnimais();
		
		System.out.println("Lista de animais: \n");
		for(int i=0; i<count; i++) {
			System.out.println("Num: " + i + " -- " + "Nome Animal: " + veterinarios[escolha].getAnimais()[i].getNome());
		}	
		
		System.out.println("Escolha um animal para cadastrar o endere�o do dono: \n");

		System.out.print("Op��o: ");
		int escolha2 = leitor.nextInt();
		
	
		System.out.println("Nome do dono: " + veterinarios[escolha].getAnimais()[escolha2].getDono().getNome());	
		System.out.println("CPF do Dono: " + veterinarios[escolha].getAnimais()[escolha2].getDono().getCpf());	


		
	}
}

	



	
