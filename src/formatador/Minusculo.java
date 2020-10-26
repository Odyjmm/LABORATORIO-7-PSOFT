package formatador;

public class Minusculo implements Formatacao{
	@Override
	public String formatoTexto(String texto) {
		return texto.toLowerCase();
	}
}