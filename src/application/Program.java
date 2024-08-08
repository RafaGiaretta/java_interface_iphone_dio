package application;

import java.util.Scanner;

import entities.Iphone.Iphone;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Iphone iphone1 = new Iphone();
		System.out.println("Entre com o telefone para efetuar a ligacao: ");
		String telefone = sc.nextLine();
		System.out.println(iphone1.ligar(telefone));
		
		System.out.println("------------------------------------");
		
		System.out.println("Entre com a URL que deseja acessar: ");
		String url = sc.nextLine();
		System.out.println(iphone1.exibirPagina(url));
		
		System.out.println("------------------------------------");
	
		System.out.println("Entre com o nome da musica que deseja ouvir: ");
		String musica = sc.nextLine();
		System.out.println(iphone1.selecionarMusica(musica));
		
		
		sc.close();
	}

}
