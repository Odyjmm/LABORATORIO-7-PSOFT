package formatador;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Escrever escrever = new Escrever();
		Formatos tipoDeFormatacao;
		String texto;
		System.out.println("Adicione o texto a ser formatado:");
		texto = sc.nextLine();
		System.out.println("Selecione a Formatacao Desejada: NEGRITO, ITALICO, MAIUSCULO OU MINUSCULO");
		tipoDeFormatacao = Formatos.valueOf(sc.nextLine().toUpperCase());
		System.out.println(escrever.publicar(texto, tipoDeFormatacao.getFormatacao()));
		sc.close();
	}
}