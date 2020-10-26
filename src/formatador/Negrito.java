package formatador;

public class Negrito implements Formatacao {
	@Override
	public String formatoTexto(String texto) {
		return "\033[1m" + texto +"\033[1m";
	}
}