package entidades;

public class Gerente extends Funcionario {

	private int quantidadeFuncionario;

	public int getQuantidadeFuncionario() {
		return quantidadeFuncionario;
	}

	public void setQuantidadeFuncionario(int quantidadeFuncionario) {
		this.quantidadeFuncionario = quantidadeFuncionario;
	}

	@Override
	public double calcularBonus() {
		double total = salarioHora * horasTrabalhadas;

		if (quantidadeFuncionario > 31) {
			return total * 1.15;
		} else if (quantidadeFuncionario > 21) {
			return total * 1.10;
		} else if (quantidadeFuncionario > 11) {
			return total * 1.06;
		} else {
			return total * 1.03;
		}

	}

	@Override
	public double definirDesconto() {
		double total = calcularBonus();
		if (total < 1000) {
			return total * 0.03;
		} else if (total < 1500) {
			return total * 0.02;
		} else if (total < 2000) {
			return total * 0.01;
		} else {
			return 0;
		}

	}

	@Override
	public double calcularSalarioFinal() {

		return calcularBonus() - definirDesconto();
	}

}
