package entities.ReprodutorMusical;

public class Ipod implements ReprodutorMusical{
	
	public  void tocar() {
	}
	
	public  void pausar() {
	}
	
	public  String selecionarMusica(String musica) {
		return "Tocando: " + musica;
	}
	
}
