package listaHeranca;

import java.util.Scanner;
public class AnimalTest {
	
	public static void main(String args[]) {
		Cachorro objCao= new Cachorro();
		Gato objGato= new Gato();
		Scanner input = new Scanner(System.in);
		
		System.out.println("*******Dados sobre o cachorro********");
		System.out.print("Digite o nome do cao: ");
		String nomeCao= input.next();
		objCao.setNome(nomeCao);
		
		System.out.print("Digite a ra�a do cao: ");
		String racaCao= input.next();
		objCao.setRaca(racaCao);
		System.out.println(objCao.caminha());
		System.out.println(objCao.late());
		
		System.out.println("*******Dados sobre o gato********");
		System.out.print("Digite o nome do gato: ");
		String nomeGato= input.next();
		objGato.setNome(nomeGato);
		
		System.out.print("Digite a ra�a do gato: ");
		String racaGato= input.next();
		objGato.setRaca(racaGato);
		System.out.println(objGato.caminha());
		System.out.println(objGato.mia());
		
	}

}
