package pucrs.tp.endereco;

import java.util.ArrayList;
import java.util.List;

public class EntradaAgenda {
	private String nome;
	private List<Endereco> enderecos;

	public EntradaAgenda(String umNome) {
		nome = umNome;
		enderecos = new ArrayList<Endereco>();
	}

	public void insEndereco(Endereco e) {
		enderecos.add(e);
	}

	public String get() {
		return (nome);
	}

	public Endereco getEndereco(int i, int j) {
		Endereco aux = enderecos.get(i);
		if (j != 0)
			enderecos.remove(i);
		return (aux);
	}
}
