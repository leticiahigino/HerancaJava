package listaHeranca;

public class Gato extends Animal{
	public String mia() {
		String saida= "O gato com nome "+ super.getNome()+ " da ra�a "+ 
	         super.getRaca()+" est� miando!";
		return saida;
		
	}

}
