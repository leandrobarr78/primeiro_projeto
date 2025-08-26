package principio.responsabilidade;

public class ContaBancaria {

	private String descricao;

	private double saldo = 8000;

	public void soma100Reais() {
		saldo += 100;
	}

	public void diminui100Reais() {
		saldo -= 100;
	}

	public void sacarDinnheiro(double saque) {
		saldo -= saque;
	}

	public void depositoDinheiro(double deposito) {
		saldo += deposito;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}

}