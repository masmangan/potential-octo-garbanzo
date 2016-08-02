package pucrs.tp.funcionario;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
	private int matricula;
	private String nome;
	public double salarioBase;
	private List<Dependente> dependentes;

	public Funcionario(int m, String n, double sb) {
		matricula = m;
		nome = n;
		salarioBase = sb;
		dependentes = new ArrayList<Dependente>();
	}

	public int getMatricula() {
		return (matricula);
	}

	public String getNome() {
		return (nome);
	}

	public double getSalarioBase() {
		return (salarioBase);
	}

	public void addDependente(Dependente d) {
		dependentes.add(d);
	}

	public double getSalario(int anoCorrente) {
		double adicional = 1.0;
		for (Dependente d : dependentes) {
			if (dependenteMaiorDeIdade(d, anoCorrente))
				adicional += 0.1;
		}
		return (salarioBase * adicional);
	}

	public List<Dependente> getDependentes() {
		return (dependentes);
	}

	public boolean verificaDependenteComMesmoNome(Dependente dep) {
		for (Dependente d : dependentes) {
			if (d.getNome().equals(dep.getNome())) {
				dep.setNome(null);
				return (false);
			}
		}
		return (true);
	}

	public boolean dependenteMaiorDeIdade(Dependente d, int anoCorrente) {
		if (d.idade(anoCorrente) >= 18)
			return (true);
		else
			return (false);
	}
}
