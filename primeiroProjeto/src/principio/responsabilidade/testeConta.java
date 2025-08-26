package principio.responsabilidade;

public class testeConta {

	public static void main(String[] args) {

		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("Conta bancaria do leandro");

		System.out.println(bancaria);

		bancaria.diminui100Reais();
		bancaria.diminui100Reais();
		System.out.println(bancaria);
		bancaria.sacarDinnheiro(5735);
		System.out.println(bancaria);
		bancaria.depositoDinheiro(100000);

		System.out.println(bancaria);

	}

}
