package listaHeranca;

public class Cachorro extends Animal{
	public String late() {
		String saida= "O cachorro com nome "+ super.getNome()+ " da ra�a "+ 
	         super.getRaca()+" est� latindo!";
		return saida;
		
	}
}
