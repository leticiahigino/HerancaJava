package listaHeranca;

public class Animal {
	private String nome;
	private String raca;
	
	//construtor que ao criar um objeto nao precisa passar um argumento
	public Animal() {
		
	}
	//construtor que ao criar um objeto precisa passar o argumento ao nome do animal 
	public Animal(String nome) {
		this.nome=nome;
	}
	public String caminha() {
		String output= "O animal de nome "+ this.getNome()+ " está caminhando!!";
		return output;
	}//fim caminha
	
	public void setNome(String novo) {
		this.nome=novo;
	}
	public String getNome() {
		return this.nome;
	}

	public void setRaca(String a) {
		this.raca=a;
	}
	public String getRaca() {
		return this.raca;
	}

	
}
