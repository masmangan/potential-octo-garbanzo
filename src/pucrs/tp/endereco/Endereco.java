package pucrs.tp.endereco;

public class Endereco {
	private String logradouro;
	private int numero, complemento, cep;
	private EntradaAgenda entradaAgenda;

	public Endereco(EntradaAgenda ea, String umLogr, int umNro, int umCompl, int umCep) {
		logradouro = umLogr;
		numero = umNro;
		complemento = umCompl;
		cep = umCep;
		entradaAgenda = ea;
	}

	public void setLogradouro(String umLogradouro) {
		logradouro = umLogradouro;
	}

	public void setCampo(int nro, int dado) {
		switch (nro) {
		case 1:
			numero = dado;
			return;
		case 2:
			complemento = dado;
			return;
		case 3:
			cep = dado;
			return;
		}
	}

	public void impEnvelope() {
		System.out.println("Para " + entradaAgenda.get());
		System.out.println("Endereco: " + toString());
	}

	public String getLogradouro() {
		return (logradouro);
	}

	public int getNumero() {
		return (numero);
	}

	public int getCep() {
		return (cep);
	}

	public String toString() {
		return(logradouro+", "+numero+"/"+complemento+", "+cep);
	}
}
