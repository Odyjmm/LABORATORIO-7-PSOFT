package formatador;

public class Escrever {
	public Escrever() {}

	public String publicar(String texto, Formatacao formatacao) {
		return formatacao.formatoTexto(texto);
	}
}