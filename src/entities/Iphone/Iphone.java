package entities.Iphone;

import entities.AparelhoTelefonico.AparelhoTelefonico;
import entities.NavegadorInternet.NavegadorInternet;
import entities.ReprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {


	public String ligar(String numero) {
		return "Ligando para o numero: " + numero;
	}

	public void atender() {
	}

	public void iniciarCorreioVoz() {
	}
	
	public  void tocar() {
	}
	
	public  void pausar() {
	}
	
	public  String selecionarMusica(String musica) {
		return "Tocando: " + musica;
	}
	
	public String exibirPagina(String url) {
		return "Acessando pagina: " + url;
	}
	
	public void adicionarNovaAba() {
		
	}
	
	public void atualizarPagina() {
		
	}
	
}
