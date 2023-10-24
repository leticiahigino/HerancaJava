package listaHeranca;

public class Pessoa {
	private String nome;
	private int idade;
	public Pessoa() {
		
	}
	
	public void setNome(String novoNome) {
		this.nome= novoNome;
	}
	public String getNome() {
		return nome;
	}
	public void setIdade(int novaIdade) {
		this.idade= novaIdade;
	}
	public int getIdade() {
		return idade;
	}

}
