package listaHeranca;

public class Pobre extends Pessoa {
	public void trabalha() {
		System.out.println(super.getNome()+" trabalha 40h semanais possui "+
	           super.getIdade() + "  anos e usa o salário para custear os estudos!! ");
	}

}
