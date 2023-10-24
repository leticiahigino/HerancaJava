package listaHeranca;

public class Miseravel extends Pessoa{
	
	public void mendiga() {
		System.out.println(super.getNome()+"  possui "+ super.getIdade() + 
				"  anos e encontra-se em situação de vulnerabilidade social!!");
		}
	}


