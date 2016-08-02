package pucrs.tp.relatorios;

/**
 *
 * @author bernardo
 */
public class GeradorDeRelatorio {
	public static void geraRelatorio(Relatorio rel) {
		System.out.println(rel.getCabecalho());
		rel.reset();
		String linha = rel.nextLine();
		while (linha != null) {
			System.out.println(linha);
			linha = rel.nextLine();
		}
		System.out.println(rel.getRodape());
	}
}
