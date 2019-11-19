package entidades;

import repositorio.Salario;

public class Funcionario implements Salario {

	protected double salarioHora;
	protected int horasTrabalhadas;
	protected double totalAdiantamento;

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getTotalAdiantamento() {
		return totalAdiantamento;
	}

	public void setTotalAdiantamento(double totalAdiantamento) {
		this.totalAdiantamento = totalAdiantamento;
	}

	public double calcularBonus() {
		double total = salarioHora * horasTrabalhadas;
		if (total > 2001) {
			total *= 1.05;
		} else if (total > 1501) {
			total *= 1.03;
		} else if (total > 1001) {
			total *= 1.02;
		} else {
			total *= 1.01;
		}
		return total;

	}

	public double definirDesconto() {
		if (totalAdiantamento > 501) {
			return totalAdiantamento * 1.05;
		} else if (totalAdiantamento > 301) {
			return totalAdiantamento * 1.03;
		} else if (totalAdiantamento > 101) {
			return totalAdiantamento * 1.02;
		}
		return totalAdiantamento * 1.01;
	}

	public double calcularSalarioFinal() {
		return calcularBonus() - definirDesconto();
	}

}
