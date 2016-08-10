package pucrs.tp.funcionario;

public class Data {
	private int dia, mes, ano;

	// A consistencia foi simplificada propositalmente
	public Data(int d, int m, int a) throws IllegalArgumentException {
		if ((d < 1) || d > 31)
			throw new IllegalArgumentException("Dia inválido");
		if ((m < 1) || (m > 12))
			throw new IllegalArgumentException("Mes inválido");
		if (ano < 1900)
			throw new IllegalArgumentException("Ano inválido");
		switch (m) {
		case 2:
			if (d > 29)
				throw new IllegalArgumentException("Dia inválido");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (d > 30)
				throw new IllegalArgumentException("Dia inválido");
			break;
		}
	}

	public int getDia() {
		return dia;
	}
	
	//Retirar Sets para não gerar inconsistencias de data

//	public void setDia(int dia) {
//		this.dia = dia;
//	}

	public int getMes() {
		return mes;
	}

//	public void setMes(int mes) {
//		this.mes = mes;
//	}

	public int getAno() {
		return ano;
	}

//	public void setAno(int ano) {
//		this.ano = ano;
//	}

	@Override
	public String toString() {
		return (dia + "//" + mes + "//" + ano);
	}
}
