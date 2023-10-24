package listaHeranca;

public class Cachorro extends Animal{
	public String late() {
		String saida= "O cachorro com nome "+ super.getNome()+ " da raça "+ 
	         super.getRaca()+" está latindo!";
		return saida;
		
	}
}
