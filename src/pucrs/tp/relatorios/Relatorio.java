package pucrs.tp.relatorios;

/**
 *
 * @author bernardo
 */
public interface Relatorio {
	String getCabecalho();

	void reset();

	String nextLine();

	String getRodape();
}
