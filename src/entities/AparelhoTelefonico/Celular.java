package entities.AparelhoTelefonico;

public class Celular implements AparelhoTelefonico{

	@Override
	public String ligar(String numero) {
		return "Ligando para o numero: " + numero;
	}

	@Override
	public void atender() {
	}

	@Override
	public void iniciarCorreioVoz() {

		
	}

}
