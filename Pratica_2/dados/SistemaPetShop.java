package dados;
import java.util.Scanner;


public class SistemaPetShop {
	private Veterinario[] veterinarios = new Veterinario[50];
	private int quantidadeVeterinarios;
	
	public SistemaPetShop() {
		
	}
	
	public void cadastrarVeterinario() {
        Scanner leitor = new Scanner(System.in);
        
		System.out.println("Digite o nome do veterinário: ");
        String nome = leitor.next();
        
		System.out.println("Digite o salário: ");
		float salario = leitor.nextFloat();
		
        Veterinario v = new Veterinario();
        
        v.setNome(nome);
        v.setSalario(salario);

        veterinarios[quantidadeVeterinarios] = v;
        quantidadeVeterinarios++;
	}
	
	public void mostrarVeterinarios() {
		System.out.println("Lista de Veterinários: ");
		for(int i=0; i<quantidadeVeterinarios; i++) {
			System.out.println("Num = " + i + " " + veterinarios[i].toString());
		}
	}
	
	public Endereco cadastrarEndereco() {
        Scanner leitor = new Scanner(System.in);

		System.out.println("Preencha as informações referentes ao endereço: ");
		
		System.out.println("Rua: ");
		String rua = leitor.next();
		System.out.println("Número: ");
		int numero = leitor.nextInt();
		System.out.println("Bairro: ");
		String bairro = leitor.next();
		System.out.println("Cidade: ");
		String cidade = leitor.next();
		System.out.println("Estado: ");
		String estado = leitor.next();
		System.out.println("Cep: ");
		int cep = leitor.nextInt();

		Endereco end = new Endereco();
		
		end.setRua(rua);
		end.setNumero(numero);
		end.setBairro(bairro);
		end.setCidade(cidade);
		end.setEstado(estado);
		end.setCep(cep);
		
		return end;
	}
	
	public Veterinario escolherVeterinario() {
		System.out.println("Escolha um veterinário:\n");
		mostrarVeterinarios();
		
		System.out.print("Opção: ");
        Scanner leitor = new Scanner(System.in);
		int escolha = leitor.nextInt();
		
		return veterinarios[escolha];
	}
	
	public void cadastrarEnderecoVeterinario() {
		Veterinario v = escolherVeterinario();
		
		v.setEndereco(cadastrarEndereco());
	}
	
	public Animal cadastrarAnimal() {
        Scanner leitor = new Scanner(System.in);

		System.out.println("Preencha as informações referentes ao animal: ");
		
		System.out.println("Nome do animal: ");
		String nome = leitor.next();
		System.out.println("Especie do animal: ");
		String especie = leitor.next();
		System.out.println("Descrição: ");
		String descricao = leitor.next();
		
		Animal animal = new Animal();
		
		animal.setNome(nome);
		animal.setEspecie(especie);
		animal.setDescricao(descricao);
		
		return animal;
	}
	
	public void cadastrarAnimalVeterinario() {
		Veterinario v = escolherVeterinario();
		
		v.setAnimais(cadastrarAnimal());
	}
	
	public void mostrarAnimais() {
		Veterinario v = escolherVeterinario();
		
		int count = v.getQuantidadeAnimais();
		
		for(int i=0; i<count; i++) {
			System.out.println("Num Animal: " + i + " -- " + v.getAnimais()[i].getNome());
		}
	}
	
	public Animal escolherAnimal() {
		Veterinario v = escolherVeterinario();
		
		mostrarAnimais();
		
		System.out.println("Digite o numero do animal desejado: ");
        Scanner leitor = new Scanner(System.in);
        
        int opcao = leitor.nextInt();
        
        return v.getAnimais()[opcao];
			
		}
	
	public Dono cadastrarDono() {		
        Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o nome do dono para o cadastro: ");
		String nome = leitor.next();
		System.out.println("Digite o CPF do dono: ");
		int cpf = leitor.nextInt();
		
		Dono dono = new Dono();
		
		dono.setNome(nome);
		dono.setCpf(cpf);
		
		dono.setEndereco(cadastrarEndereco());
		
		return dono;
		}
	
	
	public void cadastrarDonoAnimal() {
		Animal animal = escolherAnimal();
		
		animal.setDono(cadastrarDono());
		}
	}
	
