package listaHeranca;

public class Gato extends Animal{
	public String mia() {
		String saida= "O gato com nome "+ super.getNome()+ " da raça "+ 
	         super.getRaca()+" está miando!";
		return saida;
		
	}

}
