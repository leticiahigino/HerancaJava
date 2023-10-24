package listaHeranca;

public class Rica extends Pessoa {
	private double dinheiro;
	//$100
	public void fazCompras() {
		System.out.println(super.getNome() + " com idade "+ super.getIdade()+
				" possui muito dinheiro $"+this.getDinheiro() +
				" e vai ao shopping toda semana!");
		
	}
		public void setDinheiro(double valor) {
			this.dinheiro= valor;
		}
		public double getDinheiro() {
			return dinheiro;
		}
	
	

}
