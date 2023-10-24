package listaHeranca;
import java.util.Scanner;
public class PessoaTest {
	public static void main(String args[]) {
		Rica objRica= new Rica();
		Pobre objPobre= new Pobre();
		Miseravel objMis= new Miseravel();
		Scanner input= new Scanner(System.in);
		
		System.out.print("Nome Rica: ");
		objRica.setNome(input.next());
		System.out.print("Idade Rica: ");
		objRica.setIdade(input.nextInt());
		System.out.print("Dinheiro Rica: ");
		objRica.setDinheiro(input.nextDouble());
		
		objRica.fazCompras();
		
		
		
		
	}
}
