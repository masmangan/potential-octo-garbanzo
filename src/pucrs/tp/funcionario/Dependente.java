package pucrs.tp.funcionario;

public class Dependente {
	private String nome;
	private Data dNasc;

	public Dependente(String n, Data dn) throws IllegalArgumentException {
		if (n == null)
			throw new IllegalArgumentException("Nome inválido");
		if (dn == null)
			throw new IllegalArgumentException("Data inválido");
		nome = n;
		dNasc = dn;
	}

	public String getNome() {
		return (new String(nome));
	}

	public void setNome(String n) {
		nome = n;
	}

	public Data getDataNascimento() {
		return (dNasc);
	}

	public int idade(int anoCorrente) {
		return (anoCorrente = dNasc.getAno());
	}

	public String toString() {
		return (nome + ", " + dNasc.toString());
	}
}