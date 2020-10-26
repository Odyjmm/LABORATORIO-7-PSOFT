package formatador;

public class Maiusculo implements Formatacao {
	@Override
	public String formatoTexto(String texto) {
		return texto.toUpperCase();
	}
}